package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    /* loaded from: classes4.dex */
    public abstract class StandardEntrySet extends Maps.AbstractC7767q {
        public StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.AbstractC7767q
        /* renamed from: a */
        public Map mo40268a() {
            return ForwardingMap.this;
        }
    }

    /* loaded from: classes4.dex */
    public class StandardKeySet extends Maps.C7783y {
        public StandardKeySet() {
            super(ForwardingMap.this);
        }
    }

    /* loaded from: classes4.dex */
    public class StandardValues extends Maps.C7747L {
        public StandardValues() {
            super(ForwardingMap.this);
        }
    }

    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        if (obj != this && !delegate().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterators.m40842b(entrySet().iterator());
    }

    public boolean standardContainsKey(@CheckForNull Object obj) {
        return Maps.m40695m(this, obj);
    }

    public boolean standardContainsValue(@CheckForNull Object obj) {
        return Maps.m40694n(this, obj);
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return Maps.m40692p(this, obj);
    }

    public int standardHashCode() {
        return Sets.m40547b(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.m40727A(this, map);
    }

    @CheckForNull
    public V standardRemove(@CheckForNull Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Objects.equal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.m40719I(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
