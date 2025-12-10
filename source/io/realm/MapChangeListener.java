package io.realm;

/* loaded from: classes5.dex */
public interface MapChangeListener<K, V> {
    void onChange(RealmMap<K, V> realmMap, MapChangeSet<K> mapChangeSet);
}
