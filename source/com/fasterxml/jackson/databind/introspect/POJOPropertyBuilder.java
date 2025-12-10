package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {

    /* renamed from: a */
    public static final AnnotationIntrospector.ReferenceProperty f43352a = AnnotationIntrospector.ReferenceProperty.managed("");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient AnnotationIntrospector.ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    /* loaded from: classes3.dex */
    public static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            PropertyName propertyName2;
            this.value = t;
            this.next = linked;
            if (propertyName != null && !propertyName.isEmpty()) {
                propertyName2 = propertyName;
            } else {
                propertyName2 = null;
            }
            this.name = propertyName2;
            if (z) {
                if (propertyName2 != null) {
                    if (!propertyName.hasSimpleName()) {
                        z = false;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                return withNext(linked);
            }
            return withNext(linked2.append(linked));
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit));
            if (this.next != null) {
                return format + ", " + this.next.toString();
            }
            return format;
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                if (trimByVisibility.name == null) {
                    return withNext(null);
                }
                return withNext(trimByVisibility);
            } else if (trimByVisibility.name != null) {
                return trimByVisibility;
            } else {
                boolean z = this.isVisible;
                if (z == trimByVisibility.isVisible) {
                    return withNext(trimByVisibility);
                }
                if (z) {
                    return withNext(null);
                }
                return trimByVisibility;
            }
        }

        public Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            return new Linked<>(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t) {
            if (t == this.value) {
                return this;
            }
            return new Linked<>(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> withoutIgnored;
            if (this.isMarkedIgnored) {
                Linked<T> linked = this.next;
                if (linked == null) {
                    return null;
                }
                return linked.withoutIgnored();
            }
            Linked<T> linked2 = this.next;
            if (linked2 != null && (withoutIgnored = linked2.withoutIgnored()) != this.next) {
                return withNext(withoutIgnored);
            }
            return this;
        }

        public Linked<T> withoutNext() {
            if (this.next == null) {
                return this;
            }
            return new Linked<>(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> withoutNonVisible;
            Linked<T> linked = this.next;
            if (linked == null) {
                withoutNonVisible = null;
            } else {
                withoutNonVisible = linked.withoutNonVisible();
            }
            if (this.isVisible) {
                return withNext(withoutNonVisible);
            }
            return withoutNonVisible;
        }
    }

    /* loaded from: classes3.dex */
    public static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {

        /* renamed from: a */
        public Linked f43353a;

        public MemberIterator(Linked<T> linked) {
            this.f43353a = linked;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f43353a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public T next() {
            Linked linked = this.f43353a;
            if (linked != null) {
                T t = (T) linked.value;
                this.f43353a = linked.next;
                return t;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6105a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43354a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f43354a = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43354a[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43354a[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43354a[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$b */
    /* loaded from: classes3.dex */
    public class C6106b implements InterfaceC6115k {
        public C6106b() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public Class[] withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$c */
    /* loaded from: classes3.dex */
    public class C6107c implements InterfaceC6115k {
        public C6107c() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$d */
    /* loaded from: classes3.dex */
    public class C6108d implements InterfaceC6115k {
        public C6108d() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$e */
    /* loaded from: classes3.dex */
    public class C6109e implements InterfaceC6115k {
        public C6109e() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$f */
    /* loaded from: classes3.dex */
    public class C6110f implements InterfaceC6115k {
        public C6110f() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public String withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$g */
    /* loaded from: classes3.dex */
    public class C6111g implements InterfaceC6115k {
        public C6111g() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public Integer withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$h */
    /* loaded from: classes3.dex */
    public class C6112h implements InterfaceC6115k {
        public C6112h() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public String withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$i */
    /* loaded from: classes3.dex */
    public class C6113i implements InterfaceC6115k {
        public C6113i() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
            ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
            if (findObjectIdInfo != null) {
                return POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
            }
            return findObjectIdInfo;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$j */
    /* loaded from: classes3.dex */
    public class C6114j implements InterfaceC6115k {
        public C6114j() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.InterfaceC6115k
        /* renamed from: a */
        public JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$k */
    /* loaded from: classes3.dex */
    public interface InterfaceC6115k {
        Object withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    /* renamed from: m */
    public static Linked m49425m(Linked linked, Linked linked2) {
        if (linked == null) {
            return linked2;
        }
        if (linked2 == null) {
            return linked;
        }
        return linked.append(linked2);
    }

    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new C6112h());
    }

    public String _findDescription() {
        return (String) fromMemberAnnotations(new C6110f());
    }

    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new C6111g());
    }

    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new C6109e());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.PropertyMetadata _getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata r8) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r7.getPrimaryMember()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r7.getAccessor()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L76
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r7._annotationIntrospector
            r5 = 0
            if (r4 == 0) goto L39
            if (r1 == 0) goto L28
            java.lang.Boolean r4 = r4.findMergeInfo(r0)
            if (r4 == 0) goto L28
            boolean r2 = r4.booleanValue()
            if (r2 == 0) goto L27
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r2 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForPropertyOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r2)
        L27:
            r2 = 0
        L28:
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r7._annotationIntrospector
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r4.findSetterInfo(r0)
            if (r0 == 0) goto L39
            com.fasterxml.jackson.annotation.Nulls r3 = r0.nonDefaultValueNulls()
            com.fasterxml.jackson.annotation.Nulls r0 = r0.nonDefaultContentNulls()
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r2 != 0) goto L40
            if (r3 == 0) goto L40
            if (r0 != 0) goto L77
        L40:
            java.lang.Class r4 = r7.getRawPrimaryType()
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r7._config
            com.fasterxml.jackson.databind.cfg.ConfigOverride r4 = r6.getConfigOverride(r4)
            com.fasterxml.jackson.annotation.JsonSetter$Value r6 = r4.getSetterInfo()
            if (r6 == 0) goto L5c
            if (r3 != 0) goto L56
            com.fasterxml.jackson.annotation.Nulls r3 = r6.nonDefaultValueNulls()
        L56:
            if (r0 != 0) goto L5c
            com.fasterxml.jackson.annotation.Nulls r0 = r6.nonDefaultContentNulls()
        L5c:
            if (r2 == 0) goto L77
            if (r1 == 0) goto L77
            java.lang.Boolean r4 = r4.getMergeable()
            if (r4 == 0) goto L77
            boolean r2 = r4.booleanValue()
            if (r2 == 0) goto L74
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r2 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForTypeOverride(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r2)
        L74:
            r2 = 0
            goto L77
        L76:
            r0 = r3
        L77:
            if (r2 != 0) goto L7d
            if (r3 == 0) goto L7d
            if (r0 != 0) goto La9
        L7d:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r7._config
            com.fasterxml.jackson.annotation.JsonSetter$Value r4 = r4.getDefaultSetterInfo()
            if (r3 != 0) goto L89
            com.fasterxml.jackson.annotation.Nulls r3 = r4.nonDefaultValueNulls()
        L89:
            if (r0 != 0) goto L8f
            com.fasterxml.jackson.annotation.Nulls r0 = r4.nonDefaultContentNulls()
        L8f:
            if (r2 == 0) goto La9
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r7._config
            java.lang.Boolean r2 = r2.getDefaultMergeable()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto La9
            if (r1 == 0) goto La9
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r1 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForDefaults(r1)
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withMergeInfo(r1)
        La9:
            if (r3 != 0) goto Lad
            if (r0 == 0) goto Lb1
        Lad:
            com.fasterxml.jackson.databind.PropertyMetadata r8 = r8.withNulls(r3, r0)
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("set") && name.length() > 3) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final boolean m49437a(Linked linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = m49425m(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = m49425m(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = m49425m(this._getters, pOJOPropertyBuilder._getters);
        this._setters = m49425m(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._ctorParameters = new Linked<>(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._fields = new Linked<>(annotatedField, this._fields, propertyName, z, z2, z3);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._getters = new Linked<>(annotatedMethod, this._getters, propertyName, z, z2, z3);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._setters = new Linked<>(annotatedMethod, this._setters, propertyName, z, z2, z3);
    }

    public boolean anyIgnorals() {
        if (!m49435c(this._fields) && !m49435c(this._getters) && !m49435c(this._setters) && !m49435c(this._ctorParameters)) {
            return false;
        }
        return true;
    }

    public boolean anyVisible() {
        if (!m49434d(this._fields) && !m49434d(this._getters) && !m49434d(this._setters) && !m49434d(this._ctorParameters)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m49436b(Linked linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m49435c(Linked linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldDeserialize() {
        if (this._ctorParameters == null && this._setters == null && this._fields == null) {
            return false;
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldSerialize() {
        if (this._getters == null && this._fields == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m49434d(Linked linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    /* renamed from: e */
    public final Linked m49433e(Linked linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        Linked linked2 = linked.next;
        if (linked2 != null) {
            linked = linked.withNext(m49433e(linked2, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        m49432f(collection, hashMap, this._fields);
        m49432f(collection, hashMap, this._getters);
        m49432f(collection, hashMap, this._setters);
        m49432f(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    /* renamed from: f */
    public final void m49432f(Collection collection, Map map, Linked linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            PropertyName propertyName = linked2.name;
            if (linked2.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else if (linked == this._ctorParameters) {
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (linked2.isVisible) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name '" + this._name + "'): found multiple explicit names: " + collection + ", but also implicit accessor: " + linked2);
            }
        }
    }

    public JsonProperty.Access findAccess() {
        return (JsonProperty.Access) fromMemberAnnotationsExcept(new C6114j(), JsonProperty.Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> m49431g = m49431g(this._ctorParameters, m49431g(this._setters, m49431g(this._getters, m49431g(this._fields, null))));
        if (m49431g == null) {
            return Collections.emptySet();
        }
        return m49431g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.Value findInclusion() {
        JsonInclude.Value findPropertyInclusion;
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            findPropertyInclusion = null;
        } else {
            findPropertyInclusion = annotationIntrospector.findPropertyInclusion(accessor);
        }
        if (findPropertyInclusion == null) {
            return JsonInclude.Value.empty();
        }
        return findPropertyInclusion;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new C6113i());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = this._referenceInfo;
        if (referenceProperty2 != null) {
            if (referenceProperty2 == f43352a) {
                return null;
            }
            return referenceProperty2;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new C6107c());
        if (referenceProperty3 == null) {
            referenceProperty = f43352a;
        } else {
            referenceProperty = referenceProperty3;
        }
        this._referenceInfo = referenceProperty;
        return referenceProperty3;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new C6106b());
    }

    public <T> T fromMemberAnnotations(InterfaceC6115k interfaceC6115k) {
        Linked<AnnotatedMethod> linked;
        Linked<AnnotatedField> linked2;
        T t = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked3 = this._getters;
            if (linked3 != null) {
                t = (T) interfaceC6115k.withMember(linked3.value);
            }
        } else {
            Linked<AnnotatedParameter> linked4 = this._ctorParameters;
            if (linked4 != null) {
                t = (T) interfaceC6115k.withMember(linked4.value);
            }
            if (t == null && (linked = this._setters) != null) {
                t = (T) interfaceC6115k.withMember(linked.value);
            }
        }
        return (t != null || (linked2 = this._fields) == null) ? t : (T) interfaceC6115k.withMember(linked2.value);
    }

    public <T> T fromMemberAnnotationsExcept(InterfaceC6115k interfaceC6115k, T t) {
        T t2;
        T t3;
        T t4;
        T t5;
        T t6;
        T t7;
        T t8;
        T t9;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null && (t9 = (T) interfaceC6115k.withMember(linked.value)) != null && t9 != t) {
                return t9;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null && (t8 = (T) interfaceC6115k.withMember(linked2.value)) != null && t8 != t) {
                return t8;
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null && (t7 = (T) interfaceC6115k.withMember(linked3.value)) != null && t7 != t) {
                return t7;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 == null || (t6 = (T) interfaceC6115k.withMember(linked4.value)) == null || t6 == t) {
                return null;
            }
            return t6;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null && (t5 = (T) interfaceC6115k.withMember(linked5.value)) != null && t5 != t) {
            return t5;
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null && (t4 = (T) interfaceC6115k.withMember(linked6.value)) != null && t4 != t) {
            return t4;
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null && (t3 = (T) interfaceC6115k.withMember(linked7.value)) != null && t3 != t) {
            return t3;
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 == null || (t2 = (T) interfaceC6115k.withMember(linked8.value)) == null || t2 == t) {
            return null;
        }
        return t2;
    }

    /* renamed from: g */
    public final Set m49431g(Linked linked, Set set) {
        while (linked != null) {
            if (linked.isNameExplicit && linked.name != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(linked.name);
            }
            linked = linked.next;
        }
        return set;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        if (linked == null) {
            return ClassUtil.emptyIterator();
        }
        return new MemberIterator(linked);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = linked.value;
        for (Linked linked2 = linked.next; linked2 != null; linked2 = linked2.next) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getFullName() {
        return this._name;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getGetter() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked<AnnotatedMethod> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        for (Linked<AnnotatedMethod> linked3 = linked2; linked3 != null; linked3 = linked3.next) {
            Class<?> declaringClass = linked.value.getDeclaringClass();
            Class<?> declaringClass2 = linked3.value.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                    }
                }
                linked = linked3;
            }
            int _getterPriority = _getterPriority(linked3.value);
            int _getterPriority2 = _getterPriority(linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                }
                linked = linked3;
            } else {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + linked.value.getFullName() + " vs " + linked3.value.getFullName());
            }
        }
        this._getters = linked.withoutNext();
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyMetadata getMetadata() {
        if (this._metadata == null) {
            Boolean _findRequired = _findRequired();
            String _findDescription = _findDescription();
            Integer _findIndex = _findIndex();
            String _findDefaultValue = _findDefaultValue();
            if (_findRequired == null && _findIndex == null && _findDefaultValue == null) {
                PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (_findDescription != null) {
                    propertyMetadata = propertyMetadata.withDescription(_findDescription);
                }
                this._metadata = propertyMetadata;
            } else {
                this._metadata = PropertyMetadata.construct(_findRequired, _findDescription, _findIndex, _findDefaultValue);
            }
            if (!this._forSerialization) {
                this._metadata = _getSetterInfo(this._metadata);
            }
        }
        return this._metadata;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        if (mutator == null) {
            return getAccessor();
        }
        return mutator;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter == null) {
                AnnotatedField field = getField();
                if (field == null) {
                    return TypeFactory.unknownType();
                }
                return field.getType();
            }
            return getter.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null && (constructorParameter = getGetter()) == null) {
            return TypeFactory.unknownType();
        }
        return constructorParameter.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<AnnotatedMethod> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        for (Linked<AnnotatedMethod> linked3 = linked2; linked3 != null; linked3 = linked3.next) {
            Class<?> declaringClass = linked.value.getDeclaringClass();
            Class<?> declaringClass2 = linked3.value.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                    }
                }
                linked = linked3;
            }
            AnnotatedMethod annotatedMethod = linked3.value;
            AnnotatedMethod annotatedMethod2 = linked.value;
            int _setterPriority = _setterPriority(annotatedMethod);
            int _setterPriority2 = _setterPriority(annotatedMethod2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                }
                linked = linked3;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                    if (resolveSetterConflict != annotatedMethod2) {
                        if (resolveSetterConflict != annotatedMethod) {
                        }
                        linked = linked3;
                    } else {
                        continue;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), linked.value.getFullName(), linked3.value.getFullName()));
            }
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember != null && (annotationIntrospector = this._annotationIntrospector) != null) {
            return annotationIntrospector.findWrapperName(primaryMember);
        }
        return null;
    }

    /* renamed from: h */
    public final AnnotationMap m49430h(Linked linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        Linked linked2 = linked.next;
        if (linked2 != null) {
            return AnnotationMap.merge(allAnnotations, m49430h(linked2));
        }
        return allAnnotations;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        if (this._ctorParameters != null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        if (this._fields != null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasGetter() {
        if (this._getters != null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        if (this._setters != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final AnnotationMap m49429i(int i, Linked... linkedArr) {
        AnnotationMap m49430h = m49430h(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return m49430h;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(m49430h, m49429i(i, linkedArr));
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        if (!m49436b(this._fields) && !m49436b(this._getters) && !m49436b(this._setters) && !m49437a(this._ctorParameters)) {
            return false;
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        if (!m49437a(this._fields) && !m49437a(this._getters) && !m49437a(this._setters) && !m49437a(this._ctorParameters)) {
            return false;
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new C6108d());
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Linked m49428j(Linked linked) {
        if (linked == null) {
            return linked;
        }
        return linked.withoutIgnored();
    }

    /* renamed from: k */
    public final Linked m49427k(Linked linked) {
        if (linked == null) {
            return linked;
        }
        return linked.withoutNonVisible();
    }

    /* renamed from: l */
    public final Linked m49426l(Linked linked) {
        if (linked == null) {
            return linked;
        }
        return linked.trimByVisibility();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = m49433e(this._getters, m49429i(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = m49433e(this._fields, m49429i(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = m49433e(this._ctorParameters, m49429i(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = m49433e(this._setters, m49429i(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = m49433e(this._fields, m49429i(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = m49428j(this._fields);
        this._getters = m49428j(this._getters);
        this._setters = m49428j(this._setters);
        this._ctorParameters = m49428j(this._ctorParameters);
    }

    public JsonProperty.Access removeNonVisible(boolean z) {
        JsonProperty.Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = JsonProperty.Access.AUTO;
        }
        int i = C6105a.f43354a[findAccess.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this._getters = m49427k(this._getters);
                    this._ctorParameters = m49427k(this._ctorParameters);
                    if (!z || this._getters == null) {
                        this._fields = m49427k(this._fields);
                        this._setters = m49427k(this._setters);
                    }
                } else {
                    this._getters = null;
                    if (this._forSerialization) {
                        this._fields = null;
                    }
                }
            }
        } else {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        }
        return findAccess;
    }

    public String toString() {
        return "[Property '" + this._name + "'; ctors: " + this._ctorParameters + ", field(s): " + this._fields + ", getter(s): " + this._getters + ", setter(s): " + this._setters + "]";
    }

    public void trimByVisibility() {
        this._fields = m49426l(this._fields);
        this._getters = m49426l(this._getters);
        this._setters = m49426l(this._setters);
        this._ctorParameters = m49426l(this._ctorParameters);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
