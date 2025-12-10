package io.realm.internal;

import io.realm.RealmSet;
import io.realm.SetChangeListener;
import io.realm.SetChangeSet;
import io.realm.internal.ObserverPairList;

@Keep
/* loaded from: classes5.dex */
public interface ObservableSet {

    /* loaded from: classes5.dex */
    public static class Callback<T> implements ObserverPairList.Callback<SetObserverPair<T>> {

        /* renamed from: a */
        public final SetChangeSet f66685a;

        public Callback(SetChangeSet setChangeSet) {
            this.f66685a = setChangeSet;
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(ObserverPairList.ObserverPair observerPair, Object obj) {
            onCalled((SetObserverPair) ((SetObserverPair) observerPair), obj);
        }

        public void onCalled(SetObserverPair<T> setObserverPair, Object obj) {
            setObserverPair.onChange(obj, this.f66685a);
        }
    }

    /* loaded from: classes5.dex */
    public static class SetObserverPair<T> extends ObserverPairList.ObserverPair<RealmSet<T>, Object> {
        public SetObserverPair(RealmSet<T> realmSet, Object obj) {
            super(realmSet, obj);
        }

        public void onChange(Object obj, SetChangeSet setChangeSet) {
            ((SetChangeListener) this.listener).onChange((RealmSet) obj, setChangeSet);
        }
    }

    void notifyChangeListeners(long j);
}
