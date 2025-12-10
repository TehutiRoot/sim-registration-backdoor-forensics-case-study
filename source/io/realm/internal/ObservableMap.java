package io.realm.internal;

import io.realm.MapChangeListener;
import io.realm.MapChangeSet;
import io.realm.RealmChangeListener;
import io.realm.RealmMap;
import io.realm.internal.ObserverPairList;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes5.dex */
public interface ObservableMap {

    /* loaded from: classes5.dex */
    public static class Callback<K, V> implements ObserverPairList.Callback<MapObserverPair<K, V>> {

        /* renamed from: a */
        public final MapChangeSet f66683a;

        public Callback(MapChangeSet<K> mapChangeSet) {
            this.f66683a = mapChangeSet;
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(ObserverPairList.ObserverPair observerPair, Object obj) {
            onCalled((MapObserverPair) ((MapObserverPair) observerPair), obj);
        }

        public void onCalled(MapObserverPair<K, V> mapObserverPair, Object obj) {
            mapObserverPair.onChange(obj, this.f66683a);
        }
    }

    /* loaded from: classes5.dex */
    public static class MapObserverPair<K, V> extends ObserverPairList.ObserverPair<RealmMap<K, V>, Object> {
        public MapObserverPair(RealmMap<K, V> realmMap, MapChangeListener<K, V> mapChangeListener) {
            super(realmMap, mapChangeListener);
        }

        public void onChange(Object obj, MapChangeSet<K> mapChangeSet) {
            ((MapChangeListener) this.listener).onChange((RealmMap) obj, mapChangeSet);
        }
    }

    /* loaded from: classes5.dex */
    public static class RealmChangeListenerWrapper<K, V> implements MapChangeListener<K, V> {

        /* renamed from: a */
        public final RealmChangeListener f66684a;

        public RealmChangeListenerWrapper(RealmChangeListener<RealmMap<K, V>> realmChangeListener) {
            this.f66684a = realmChangeListener;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof RealmChangeListenerWrapper) && this.f66684a == ((RealmChangeListenerWrapper) obj).f66684a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f66684a.hashCode();
        }

        @Override // io.realm.MapChangeListener
        public void onChange(RealmMap<K, V> realmMap, @Nullable MapChangeSet<K> mapChangeSet) {
            this.f66684a.onChange(realmMap);
        }
    }

    void notifyChangeListeners(long j);
}
