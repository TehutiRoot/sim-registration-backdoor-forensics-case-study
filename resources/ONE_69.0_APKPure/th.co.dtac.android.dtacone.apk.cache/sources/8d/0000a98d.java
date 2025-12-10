package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Interners {

    /* loaded from: classes4.dex */
    public static class InternerBuilder {

        /* renamed from: a */
        public final MapMaker f53214a;

        /* renamed from: b */
        public boolean f53215b;

        public <E> Interner<E> build() {
            if (!this.f53215b) {
                this.f53214a.weakKeys();
            }
            return new C7633c(this.f53214a);
        }

        public InternerBuilder concurrencyLevel(int i) {
            this.f53214a.concurrencyLevel(i);
            return this;
        }

        public InternerBuilder strong() {
            this.f53215b = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.f53215b = false;
            return this;
        }

        public InternerBuilder() {
            this.f53214a = new MapMaker();
            this.f53215b = true;
        }
    }

    /* renamed from: com.google.common.collect.Interners$b */
    /* loaded from: classes4.dex */
    public static class C7632b implements Function {

        /* renamed from: a */
        public final Interner f53216a;

        public C7632b(Interner interner) {
            this.f53216a = interner;
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return this.f53216a.intern(obj);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof C7632b) {
                return this.f53216a.equals(((C7632b) obj).f53216a);
            }
            return false;
        }

        public int hashCode() {
            return this.f53216a.hashCode();
        }
    }

    /* renamed from: com.google.common.collect.Interners$c */
    /* loaded from: classes4.dex */
    public static final class C7633c implements Interner {

        /* renamed from: a */
        public final MapMakerInternalMap f53217a;

        @Override // com.google.common.collect.Interner
        public Object intern(Object obj) {
            Object key;
            do {
                MapMakerInternalMap.InterfaceC7695h entry = this.f53217a.getEntry(obj);
                if (entry != null && (key = entry.getKey()) != null) {
                    return key;
                }
            } while (((MapMaker.Dummy) this.f53217a.putIfAbsent(obj, MapMaker.Dummy.VALUE)) != null);
            return obj;
        }

        public C7633c(MapMaker mapMaker) {
            this.f53217a = MapMakerInternalMap.createWithDummyValues(mapMaker.m40781f(Equivalence.equals()));
        }
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new C7632b((Interner) Preconditions.checkNotNull(interner));
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    public static <E> Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}