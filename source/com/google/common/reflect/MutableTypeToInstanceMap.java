package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.reflect.MutableTypeToInstanceMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes4.dex */
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: a */
    public final Map f54102a = Maps.newHashMap();

    /* renamed from: com.google.common.reflect.MutableTypeToInstanceMap$a */
    /* loaded from: classes4.dex */
    public static final class C8140a extends ForwardingMapEntry {

        /* renamed from: a */
        public final Map.Entry f54103a;

        /* renamed from: com.google.common.reflect.MutableTypeToInstanceMap$a$a */
        /* loaded from: classes4.dex */
        public class C8141a extends ForwardingSet {

            /* renamed from: a */
            public final /* synthetic */ Set f54104a;

            public C8141a(Set set) {
                this.f54104a = set;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return C8140a.m39769h(super.iterator());
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return standardToArray();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                return standardToArray(objArr);
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set delegate() {
                return this.f54104a;
            }
        }

        public C8140a(Map.Entry entry) {
            this.f54103a = (Map.Entry) Preconditions.checkNotNull(entry);
        }

        /* renamed from: e */
        public static /* synthetic */ C8140a m39771e(Map.Entry entry) {
            return new C8140a(entry);
        }

        /* renamed from: h */
        public static Iterator m39769h(Iterator it) {
            return Iterators.transform(it, new Function() { // from class: DG0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return MutableTypeToInstanceMap.C8140a.m39771e((Map.Entry) obj);
                }
            });
        }

        /* renamed from: i */
        public static Set m39768i(Set set) {
            return new C8141a(set);
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry delegate() {
            return this.f54103a;
        }
    }

    /* renamed from: e */
    private Object m39773e(TypeToken typeToken) {
        return this.f54102a.get(typeToken);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return C8140a.m39768i(super.entrySet());
    }

    /* renamed from: f */
    public final Object m39772f(TypeToken typeToken, Object obj) {
        return this.f54102a.put(typeToken, obj);
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) m39773e(TypeToken.m39740of((Class) cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((TypeToken<? extends TypeToken<? extends B>>) obj, (TypeToken<? extends B>) obj2);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @CheckForNull
    public <T extends B> T putInstance(Class<T> cls, T t) {
        return (T) m39772f(TypeToken.m39740of((Class) cls), t);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<TypeToken<? extends B>, B> delegate() {
        return this.f54102a;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(TypeToken<T> typeToken) {
        return (T) m39773e(typeToken.rejectTypeVariables());
    }

    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public B put(TypeToken<? extends B> typeToken, B b) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @CheckForNull
    public <T extends B> T putInstance(TypeToken<T> typeToken, T t) {
        return (T) m39772f(typeToken.rejectTypeVariables(), t);
    }
}
