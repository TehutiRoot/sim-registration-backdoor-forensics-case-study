package io.realm;

import io.realm.RealmModel;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.PendingRow;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.UncheckedRow;
import java.util.List;

/* loaded from: classes5.dex */
public final class ProxyState<E extends RealmModel> implements PendingRow.FrontEnd {

    /* renamed from: i */
    public static C11238b f66512i = new C11238b();

    /* renamed from: a */
    public RealmModel f66513a;

    /* renamed from: c */
    public Row f66515c;

    /* renamed from: d */
    public OsObject f66516d;

    /* renamed from: e */
    public BaseRealm f66517e;

    /* renamed from: f */
    public boolean f66518f;

    /* renamed from: g */
    public List f66519g;

    /* renamed from: b */
    public boolean f66514b = true;

    /* renamed from: h */
    public ObserverPairList f66520h = new ObserverPairList();

    /* renamed from: io.realm.ProxyState$b */
    /* loaded from: classes5.dex */
    public static class C11238b implements ObserverPairList.Callback {
        public C11238b() {
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        /* renamed from: a */
        public void onCalled(OsObject.ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.onChange((RealmModel) obj, null);
        }
    }

    /* renamed from: io.realm.ProxyState$c */
    /* loaded from: classes5.dex */
    public static class C11239c implements RealmObjectChangeListener {

        /* renamed from: a */
        public final RealmChangeListener f66521a;

        public C11239c(RealmChangeListener realmChangeListener) {
            if (realmChangeListener != null) {
                this.f66521a = realmChangeListener;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C11239c) && this.f66521a == ((C11239c) obj).f66521a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f66521a.hashCode();
        }

        @Override // io.realm.RealmObjectChangeListener
        public void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
            this.f66521a.onChange(realmModel);
        }
    }

    public ProxyState() {
    }

    /* renamed from: a */
    public final void m29730a() {
        this.f66520h.foreach(f66512i);
    }

    public void addChangeListener(RealmObjectChangeListener<E> realmObjectChangeListener) {
        Row row = this.f66515c;
        if (row instanceof PendingRow) {
            this.f66520h.add(new OsObject.ObjectObserverPair(this.f66513a, realmObjectChangeListener));
        } else if (row instanceof UncheckedRow) {
            m29729b();
            OsObject osObject = this.f66516d;
            if (osObject != null) {
                osObject.addListener(this.f66513a, realmObjectChangeListener);
            }
        }
    }

    /* renamed from: b */
    public final void m29729b() {
        OsSharedRealm osSharedRealm = this.f66517e.sharedRealm;
        if (osSharedRealm != null && !osSharedRealm.isClosed() && this.f66515c.isValid() && this.f66516d == null) {
            OsObject osObject = new OsObject(this.f66517e.sharedRealm, (UncheckedRow) this.f66515c);
            this.f66516d = osObject;
            osObject.setObserverPairs(this.f66520h);
            this.f66520h = null;
        }
    }

    public void checkValidObject(RealmModel realmModel) {
        if (RealmObject.isValid(realmModel) && RealmObject.isManaged(realmModel)) {
            if (((RealmObjectProxy) realmModel).realmGet$proxyState().getRealm$realm() == getRealm$realm()) {
                return;
            }
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        throw new IllegalArgumentException("'value' is not a valid managed object.");
    }

    public boolean getAcceptDefaultValue$realm() {
        return this.f66518f;
    }

    public List<String> getExcludeFields$realm() {
        return this.f66519g;
    }

    public BaseRealm getRealm$realm() {
        return this.f66517e;
    }

    public Row getRow$realm() {
        return this.f66515c;
    }

    public boolean isLoaded() {
        return this.f66515c.isLoaded();
    }

    public boolean isUnderConstruction() {
        return this.f66514b;
    }

    public void load() {
        Row row = this.f66515c;
        if (row instanceof PendingRow) {
            ((PendingRow) row).executeQuery();
        }
    }

    @Override // io.realm.internal.PendingRow.FrontEnd
    public void onQueryFinished(Row row) {
        this.f66515c = row;
        m29730a();
        if (row.isValid()) {
            m29729b();
        }
    }

    public void removeAllChangeListeners() {
        OsObject osObject = this.f66516d;
        if (osObject != null) {
            osObject.removeListener(this.f66513a);
        } else {
            this.f66520h.clear();
        }
    }

    public void removeChangeListener(RealmObjectChangeListener<E> realmObjectChangeListener) {
        OsObject osObject = this.f66516d;
        if (osObject != null) {
            osObject.removeListener(this.f66513a, realmObjectChangeListener);
        } else {
            this.f66520h.remove(this.f66513a, realmObjectChangeListener);
        }
    }

    public void setAcceptDefaultValue$realm(boolean z) {
        this.f66518f = z;
    }

    public void setConstructionFinished() {
        this.f66514b = false;
        this.f66519g = null;
    }

    public void setExcludeFields$realm(List<String> list) {
        this.f66519g = list;
    }

    public void setRealm$realm(BaseRealm baseRealm) {
        this.f66517e = baseRealm;
    }

    public void setRow$realm(Row row) {
        this.f66515c = row;
    }

    public ProxyState(E e) {
        this.f66513a = e;
    }
}
