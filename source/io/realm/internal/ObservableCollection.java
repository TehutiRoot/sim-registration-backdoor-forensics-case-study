package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.internal.ObserverPairList;
import javax.annotation.Nullable;

@Keep
/* loaded from: classes5.dex */
public interface ObservableCollection {

    /* loaded from: classes5.dex */
    public static class Callback implements ObserverPairList.Callback<CollectionObserverPair> {

        /* renamed from: a */
        public final OsCollectionChangeSet f66681a;

        public Callback(OsCollectionChangeSet osCollectionChangeSet) {
            this.f66681a = osCollectionChangeSet;
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public void onCalled(CollectionObserverPair collectionObserverPair, Object obj) {
            collectionObserverPair.onChange(obj, this.f66681a);
        }
    }

    /* loaded from: classes5.dex */
    public static class CollectionObserverPair<T> extends ObserverPairList.ObserverPair<T, Object> {
        public CollectionObserverPair(Object obj, Object obj2) {
            super(obj, obj2);
        }

        public void onChange(T t, OsCollectionChangeSet osCollectionChangeSet) {
            Object obj = this.listener;
            if (obj instanceof OrderedRealmCollectionChangeListener) {
                ((OrderedRealmCollectionChangeListener) obj).onChange(t, new StatefulCollectionChangeSet(osCollectionChangeSet));
            } else if (obj instanceof RealmChangeListener) {
                ((RealmChangeListener) obj).onChange(t);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.listener);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class RealmChangeListenerWrapper<T> implements OrderedRealmCollectionChangeListener<T> {

        /* renamed from: a */
        public final RealmChangeListener f66682a;

        public RealmChangeListenerWrapper(RealmChangeListener<T> realmChangeListener) {
            this.f66682a = realmChangeListener;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof RealmChangeListenerWrapper) && this.f66682a == ((RealmChangeListenerWrapper) obj).f66682a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f66682a.hashCode();
        }

        @Override // io.realm.OrderedRealmCollectionChangeListener
        public void onChange(T t, @Nullable OrderedCollectionChangeSet orderedCollectionChangeSet) {
            this.f66682a.onChange(t);
        }
    }

    void notifyChangeListeners(long j);
}
