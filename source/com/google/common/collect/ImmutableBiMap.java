package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes4.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    /* loaded from: classes4.dex */
    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        /* renamed from: f */
        public Builder mo40964b(ImmutableMap.Builder builder) {
            super.mo40964b(builder);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
            return put((Builder<K, V>) obj, obj2);
        }

        public Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i = this.f53145c;
            if (i == 0) {
                return ImmutableBiMap.m41016of();
            }
            if (this.f53143a != null) {
                if (this.f53146d) {
                    this.f53144b = Arrays.copyOf(this.f53144b, i * 2);
                }
                ImmutableMap.Builder.m40961e(this.f53144b, this.f53145c, this.f53143a);
            }
            this.f53146d = true;
            return new RegularImmutableBiMap(this.f53144b, this.f53145c);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            super.put((Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    @J2ktIncompatible
    /* loaded from: classes4.dex */
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int i) {
            return new Builder<>(i);
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        AbstractC5406bs.m51814b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41016of() {
        return RegularImmutableBiMap.EMPTY;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return AbstractC7963f.m40323i0(function, function2);
    }

    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41015of(K k, V v) {
        AbstractC5406bs.m51815a(k, v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41014of(K k, V v, K k2, V v2) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41013of(K k, V v, K k2, V v2, K k3, V v3) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41012of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41011of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41010of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41009of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41008of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41007of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        AbstractC5406bs.m51815a(k9, v9);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m41006of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        AbstractC5406bs.m51815a(k9, v9);
        AbstractC5406bs.m51815a(k10, v10);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }
}
