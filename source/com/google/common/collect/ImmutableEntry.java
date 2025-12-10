package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
/* loaded from: classes4.dex */
class ImmutableEntry<K, V> extends AbstractC1646X implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    public ImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // p000.AbstractC1646X, java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // p000.AbstractC1646X, java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // p000.AbstractC1646X, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
