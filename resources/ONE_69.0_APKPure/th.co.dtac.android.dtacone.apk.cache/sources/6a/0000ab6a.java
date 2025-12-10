package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.common.collect.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7943c extends Maps.AbstractC7770x implements NavigableMap {

    /* renamed from: com.google.common.collect.c$b */
    /* loaded from: classes4.dex */
    public final class C7945b extends Maps.AbstractC7754p {
        public C7945b() {
        }

        @Override // com.google.common.collect.Maps.AbstractC7754p
        public Iterator entryIterator() {
            return AbstractC7943c.this.mo40360b();
        }

        @Override // com.google.common.collect.Maps.AbstractC7754p
        /* renamed from: f */
        public NavigableMap mo40359f() {
            return AbstractC7943c.this;
        }
    }

    /* renamed from: b */
    public abstract Iterator mo40360b();

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return Maps.m40673x(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap descendingMap() {
        return new C7945b();
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        return (Map.Entry) Iterators.getNext(mo40377a(), null);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return Maps.m40673x(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return Maps.m40673x(higherEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        return (Map.Entry) Iterators.getNext(mo40360b(), null);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return Maps.m40673x(lowerEntry(obj));
    }

    public NavigableSet navigableKeySet() {
        return new Maps.C7724B(this);
    }

    public Map.Entry pollFirstEntry() {
        return (Map.Entry) Iterators.m40823j(mo40377a());
    }

    public Map.Entry pollLastEntry() {
        return (Map.Entry) Iterators.m40823j(mo40360b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}