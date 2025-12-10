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
        public final MapMaker f53202a;

        /* renamed from: b */
        public boolean f53203b;

        public <E> Interner<E> build() {
            if (!this.f53203b) {
                this.f53202a.weakKeys();
            }
            return new C7644c(this.f53202a);
        }

        public InternerBuilder concurrencyLevel(int i) {
            this.f53202a.concurrencyLevel(i);
            return this;
        }

        public InternerBuilder strong() {
            this.f53203b = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.f53203b = false;
            return this;
        }

        public InternerBuilder() {
            this.f53202a = new MapMaker();
            this.f53203b = true;
        }
    }

    /* renamed from: com.google.common.collect.Interners$b */
    /* loaded from: classes4.dex */
    public static class C7643b implements Function {

        /* renamed from: a */
        public final Interner f53204a;

        public C7643b(Interner interner) {
            this.f53204a = interner;
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return this.f53204a.intern(obj);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof C7643b) {
                return this.f53204a.equals(((C7643b) obj).f53204a);
            }
            return false;
        }

        public int hashCode() {
            return this.f53204a.hashCode();
        }
    }

    /* renamed from: com.google.common.collect.Interners$c */
    /* loaded from: classes4.dex */
    public static final class C7644c implements Interner {

        /* renamed from: a */
        public final MapMakerInternalMap f53205a;

        @Override // com.google.common.collect.Interner
        public Object intern(Object obj) {
            Object key;
            do {
                MapMakerInternalMap.InterfaceC7706h entry = this.f53205a.getEntry(obj);
                if (entry != null && (key = entry.getKey()) != null) {
                    return key;
                }
            } while (((MapMaker.Dummy) this.f53205a.putIfAbsent(obj, MapMaker.Dummy.VALUE)) != null);
            return obj;
        }

        public C7644c(MapMaker mapMaker) {
            this.f53205a = MapMakerInternalMap.createWithDummyValues(mapMaker.m40792f(Equivalence.equals()));
        }
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new C7643b((Interner) Preconditions.checkNotNull(interner));
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
