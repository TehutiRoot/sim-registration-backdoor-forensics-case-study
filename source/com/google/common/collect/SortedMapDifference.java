package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.MapDifference;
import java.util.Map;
import java.util.SortedMap;

@GwtCompatible
/* loaded from: classes4.dex */
public interface SortedMapDifference<K, V> extends MapDifference<K, V> {
    @Override // 
    /* bridge */ /* synthetic */ Map entriesDiffering();

    @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
    SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering();

    @Override // 
    /* bridge */ /* synthetic */ Map entriesInCommon();

    @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
    SortedMap<K, V> entriesInCommon();

    @Override // 
    /* bridge */ /* synthetic */ Map entriesOnlyOnLeft();

    @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
    SortedMap<K, V> entriesOnlyOnLeft();

    @Override // 
    /* bridge */ /* synthetic */ Map entriesOnlyOnRight();

    @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
    SortedMap<K, V> entriesOnlyOnRight();
}
