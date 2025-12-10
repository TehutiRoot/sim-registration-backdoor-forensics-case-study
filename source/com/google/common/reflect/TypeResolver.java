package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class TypeResolver {

    /* renamed from: a */
    public final C8144c f54111a;

    /* renamed from: com.google.common.reflect.TypeResolver$a */
    /* loaded from: classes4.dex */
    public class C8142a extends AbstractC20222hW1 {

        /* renamed from: b */
        public final /* synthetic */ Map f54112b;

        /* renamed from: c */
        public final /* synthetic */ Type f54113c;

        public C8142a(Map map, Type type) {
            this.f54112b = map;
            this.f54113c = type;
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: b */
        public void mo30866b(Class cls) {
            if (this.f54113c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f54113c);
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: c */
        public void mo30865c(GenericArrayType genericArrayType) {
            boolean z;
            Type type = this.f54113c;
            if (type instanceof WildcardType) {
                return;
            }
            Type m39711i = Types.m39711i(type);
            if (m39711i != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "%s is not an array type.", this.f54113c);
            TypeResolver.m39761g(this.f54112b, genericArrayType.getGenericComponentType(), m39711i);
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: d */
        public void mo30864d(ParameterizedType parameterizedType) {
            boolean z;
            Type type = this.f54113c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) TypeResolver.m39763e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                TypeResolver.m39761g(this.f54112b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            Preconditions.checkArgument(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f54113c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            if (actualTypeArguments.length == actualTypeArguments2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeResolver.m39761g(this.f54112b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: e */
        public void mo30863e(TypeVariable typeVariable) {
            this.f54112b.put(new C8146d(typeVariable), this.f54113c);
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: f */
        public void mo30862f(WildcardType wildcardType) {
            boolean z;
            Type type = this.f54113c;
            if (!(type instanceof WildcardType)) {
                return;
            }
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Incompatible type: %s vs. %s", wildcardType, this.f54113c);
            for (int i = 0; i < upperBounds.length; i++) {
                TypeResolver.m39761g(this.f54112b, upperBounds[i], upperBounds2[i]);
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                TypeResolver.m39761g(this.f54112b, lowerBounds[i2], lowerBounds2[i2]);
            }
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$b */
    /* loaded from: classes4.dex */
    public static final class C8143b extends AbstractC20222hW1 {

        /* renamed from: b */
        public final Map f54114b = Maps.newHashMap();

        /* renamed from: g */
        public static ImmutableMap m39754g(Type type) {
            Preconditions.checkNotNull(type);
            C8143b c8143b = new C8143b();
            c8143b.m30867a(type);
            return ImmutableMap.copyOf(c8143b.f54114b);
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: b */
        public void mo30866b(Class cls) {
            m30867a(cls.getGenericSuperclass());
            m30867a(cls.getGenericInterfaces());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: d */
        public void mo30864d(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            for (int i = 0; i < typeParameters.length; i++) {
                m39753h(new C8146d(typeParameters[i]), actualTypeArguments[i]);
            }
            m30867a(cls);
            m30867a(parameterizedType.getOwnerType());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: e */
        public void mo30863e(TypeVariable typeVariable) {
            m30867a(typeVariable.getBounds());
        }

        @Override // p000.AbstractC20222hW1
        /* renamed from: f */
        public void mo30862f(WildcardType wildcardType) {
            m30867a(wildcardType.getUpperBounds());
        }

        /* renamed from: h */
        public final void m39753h(C8146d c8146d, Type type) {
            if (this.f54114b.containsKey(c8146d)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (c8146d.m39749a(type2)) {
                    while (type != null) {
                        type = (Type) this.f54114b.remove(C8146d.m39747c(type));
                    }
                    return;
                }
                type2 = (Type) this.f54114b.get(C8146d.m39747c(type2));
            }
            this.f54114b.put(c8146d, type);
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$d */
    /* loaded from: classes4.dex */
    public static final class C8146d {

        /* renamed from: a */
        public final TypeVariable f54119a;

        public C8146d(TypeVariable typeVariable) {
            this.f54119a = (TypeVariable) Preconditions.checkNotNull(typeVariable);
        }

        /* renamed from: c */
        public static C8146d m39747c(Type type) {
            if (type instanceof TypeVariable) {
                return new C8146d((TypeVariable) type);
            }
            return null;
        }

        /* renamed from: a */
        public boolean m39749a(Type type) {
            if (type instanceof TypeVariable) {
                return m39748b((TypeVariable) type);
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m39748b(TypeVariable typeVariable) {
            if (this.f54119a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f54119a.getName().equals(typeVariable.getName())) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8146d) {
                return m39748b(((C8146d) obj).f54119a);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f54119a.getGenericDeclaration(), this.f54119a.getName());
        }

        public String toString() {
            return this.f54119a.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeResolver$e */
    /* loaded from: classes4.dex */
    public static class C8147e {

        /* renamed from: b */
        public static final C8147e f54120b = new C8147e();

        /* renamed from: a */
        public final AtomicInteger f54121a;

        /* renamed from: com.google.common.reflect.TypeResolver$e$a */
        /* loaded from: classes4.dex */
        public class C8148a extends C8147e {

            /* renamed from: c */
            public final /* synthetic */ TypeVariable f54122c;

            /* renamed from: d */
            public final /* synthetic */ C8147e f54123d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8148a(C8147e c8147e, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f54122c = typeVariable;
                this.f54123d = c8147e;
            }

            @Override // com.google.common.reflect.TypeResolver.C8147e
            /* renamed from: b */
            public TypeVariable mo39742b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f54122c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo39742b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ C8147e(AtomicInteger atomicInteger, C8142a c8142a) {
            this(atomicInteger);
        }

        /* renamed from: a */
        public final Type m39746a(Type type) {
            Preconditions.checkNotNull(type);
            if (type instanceof Class) {
                return type;
            }
            if (type instanceof TypeVariable) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m39710j(m39743e().m39746a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = m39744d(typeParameters[i]).m39746a(actualTypeArguments[i]);
                }
                return Types.m39707m(m39743e().m39745c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return mo39742b(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* renamed from: b */
        public TypeVariable mo39742b(Type[] typeArr) {
            return Types.m39709k(C8147e.class, "capture#" + this.f54121a.incrementAndGet() + "-of ? extends " + Joiner.m41323on((char) Typography.amp).join(typeArr), typeArr);
        }

        /* renamed from: c */
        public final Type m39745c(Type type) {
            if (type == null) {
                return null;
            }
            return m39746a(type);
        }

        /* renamed from: d */
        public final C8147e m39744d(TypeVariable typeVariable) {
            return new C8148a(this, this.f54121a, typeVariable);
        }

        /* renamed from: e */
        public final C8147e m39743e() {
            return new C8147e(this.f54121a);
        }

        public C8147e() {
            this(new AtomicInteger());
        }

        public C8147e(AtomicInteger atomicInteger) {
            this.f54121a = atomicInteger;
        }
    }

    public /* synthetic */ TypeResolver(C8144c c8144c, C8142a c8142a) {
        this(c8144c);
    }

    /* renamed from: d */
    public static TypeResolver m39764d(Type type) {
        return new TypeResolver().m39755m(C8143b.m39754g(type));
    }

    /* renamed from: e */
    public static Object m39763e(Class cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    /* renamed from: f */
    public static TypeResolver m39762f(Type type) {
        return new TypeResolver().m39755m(C8143b.m39754g(C8147e.f54120b.m39746a(type)));
    }

    /* renamed from: g */
    public static void m39761g(Map map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new C8142a(map, type2).m30867a(type);
    }

    /* renamed from: h */
    public final Type m39760h(GenericArrayType genericArrayType) {
        return Types.m39710j(resolveType(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: i */
    public final ParameterizedType m39759i(ParameterizedType parameterizedType) {
        Type resolveType;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            resolveType = null;
        } else {
            resolveType = resolveType(ownerType);
        }
        return Types.m39707m(resolveType, (Class) resolveType(parameterizedType.getRawType()), m39758j(parameterizedType.getActualTypeArguments()));
    }

    /* renamed from: j */
    public final Type[] m39758j(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = resolveType(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: k */
    public Type[] m39757k(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]);
        }
        return typeArr;
    }

    /* renamed from: l */
    public final WildcardType m39756l(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(m39758j(wildcardType.getLowerBounds()), m39758j(wildcardType.getUpperBounds()));
    }

    /* renamed from: m */
    public TypeResolver m39755m(Map map) {
        return new TypeResolver(this.f54111a.m39751c(map));
    }

    public Type resolveType(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof TypeVariable) {
            return this.f54111a.m39752a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m39759i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m39760h((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            return m39756l((WildcardType) type);
        }
        return type;
    }

    public TypeResolver where(Type type, Type type2) {
        HashMap newHashMap = Maps.newHashMap();
        m39761g(newHashMap, (Type) Preconditions.checkNotNull(type), (Type) Preconditions.checkNotNull(type2));
        return m39755m(newHashMap);
    }

    /* renamed from: com.google.common.reflect.TypeResolver$c */
    /* loaded from: classes4.dex */
    public static class C8144c {

        /* renamed from: a */
        public final ImmutableMap f54115a;

        /* renamed from: com.google.common.reflect.TypeResolver$c$a */
        /* loaded from: classes4.dex */
        public class C8145a extends C8144c {

            /* renamed from: b */
            public final /* synthetic */ TypeVariable f54116b;

            /* renamed from: c */
            public final /* synthetic */ C8144c f54117c;

            /* renamed from: d */
            public final /* synthetic */ C8144c f54118d;

            public C8145a(C8144c c8144c, TypeVariable typeVariable, C8144c c8144c2) {
                this.f54116b = typeVariable;
                this.f54117c = c8144c2;
                this.f54118d = c8144c;
            }

            @Override // com.google.common.reflect.TypeResolver.C8144c
            /* renamed from: b */
            public Type mo39750b(TypeVariable typeVariable, C8144c c8144c) {
                if (typeVariable.getGenericDeclaration().equals(this.f54116b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f54117c.mo39750b(typeVariable, c8144c);
            }
        }

        public C8144c() {
            this.f54115a = ImmutableMap.m40976of();
        }

        /* renamed from: a */
        public final Type m39752a(TypeVariable typeVariable) {
            return mo39750b(typeVariable, new C8145a(this, typeVariable, this));
        }

        /* renamed from: b */
        public Type mo39750b(TypeVariable typeVariable, C8144c c8144c) {
            Type type = (Type) this.f54115a.get(new C8146d(typeVariable));
            if (type == null) {
                Type[] bounds = typeVariable.getBounds();
                if (bounds.length != 0) {
                    Type[] m39758j = new TypeResolver(c8144c, null).m39758j(bounds);
                    if (Types.C8173b.f54139a && Arrays.equals(bounds, m39758j)) {
                        return typeVariable;
                    }
                    return Types.m39709k(typeVariable.getGenericDeclaration(), typeVariable.getName(), m39758j);
                }
                return typeVariable;
            }
            return new TypeResolver(c8144c, null).resolveType(type);
        }

        /* renamed from: c */
        public final C8144c m39751c(Map map) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(this.f54115a);
            for (Map.Entry entry : map.entrySet()) {
                C8146d c8146d = (C8146d) entry.getKey();
                Type type = (Type) entry.getValue();
                Preconditions.checkArgument(!c8146d.m39749a(type), "Type variable %s bound to itself", c8146d);
                builder.put(c8146d, type);
            }
            return new C8144c(builder.buildOrThrow());
        }

        public C8144c(ImmutableMap immutableMap) {
            this.f54115a = immutableMap;
        }
    }

    public TypeResolver() {
        this.f54111a = new C8144c();
    }

    public TypeResolver(C8144c c8144c) {
        this.f54111a = c8144c;
    }
}
