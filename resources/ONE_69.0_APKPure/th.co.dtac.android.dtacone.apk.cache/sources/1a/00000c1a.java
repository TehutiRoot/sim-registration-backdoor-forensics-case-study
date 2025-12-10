package p000;

import io.realm.AbstractC11404l;
import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.MapChangeListener;
import io.realm.MapChangeSet;
import io.realm.RealmChangeListener;
import io.realm.RealmMap;
import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import io.realm.internal.ObservableMap;
import io.realm.internal.ObserverPairList;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: Mn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18103Mn0 implements Map, ManageableObject, Freezable, ObservableMap {

    /* renamed from: a */
    public final BaseRealm f3968a;

    /* renamed from: b */
    public final AbstractC11404l f3969b;

    /* renamed from: c */
    public final AbstractC19240bX1 f3970c;

    /* renamed from: d */
    public final ObserverPairList f3971d = new ObserverPairList();

    public AbstractC18103Mn0(BaseRealm baseRealm, AbstractC11404l abstractC11404l, AbstractC19240bX1 abstractC19240bX1) {
        this.f3968a = baseRealm;
        this.f3969b = abstractC11404l;
        this.f3970c = abstractC19240bX1;
    }

    /* renamed from: a */
    public void m67320a(RealmMap realmMap, MapChangeListener mapChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.f3968a, mapChangeListener, true);
        if (this.f3971d.isEmpty()) {
            this.f3969b.m29732p(this);
        }
        this.f3971d.add(new ObservableMap.MapObserverPair(realmMap, mapChangeListener));
    }

    /* renamed from: b */
    public void m67319b(RealmMap realmMap, RealmChangeListener realmChangeListener) {
        m67320a(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }

    /* renamed from: c */
    public abstract MapChangeSet mo66529c(long j);

    @Override // java.util.Map
    public void clear() {
        this.f3969b.m29742a();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo66528e(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f3969b.mo29660c(obj);
    }

    /* renamed from: e */
    public abstract boolean mo66528e(Object obj);

    @Override // java.util.Map
    public abstract Set entrySet();

    @Override // io.realm.internal.Freezable
    /* renamed from: f */
    public RealmMap freeze() {
        return mo66527g(this.f3969b.m29740f());
    }

    /* renamed from: g */
    public abstract RealmMap mo66527g(Pair pair);

    /* renamed from: h */
    public String m67317h() {
        return this.f3970c.mo22716e();
    }

    /* renamed from: i */
    public Class m67316i() {
        return this.f3970c.mo22717d();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f3969b.m29739h();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.f3969b.m29738i();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
        return true;
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.f3969b.m29737j();
    }

    /* renamed from: j */
    public boolean m67315j(Object obj, Class cls) {
        if (obj != null && obj.getClass() != cls) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m67314k() {
        CollectionUtils.checkForAddRemoveListener(this.f3968a, null, false);
        this.f3971d.clear();
        this.f3969b.m29731q();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f3969b.m29736k();
    }

    /* renamed from: l */
    public void m67313l(RealmMap realmMap, MapChangeListener mapChangeListener) {
        this.f3971d.remove(realmMap, mapChangeListener);
        if (this.f3971d.isEmpty()) {
            this.f3969b.m29731q();
        }
    }

    /* renamed from: m */
    public void m67312m(RealmMap realmMap, RealmChangeListener realmChangeListener) {
        m67313l(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }

    /* renamed from: n */
    public abstract void mo66526n(Map map);

    @Override // io.realm.internal.ObservableMap
    public void notifyChangeListeners(long j) {
        C18298Pn0 c18298Pn0 = new C18298Pn0(mo66529c(j));
        if (c18298Pn0.isEmpty()) {
            return;
        }
        this.f3971d.foreach(new ObservableMap.Callback(c18298Pn0));
    }

    @Override // java.util.Map
    public abstract Object put(Object obj, Object obj2);

    @Override // java.util.Map
    public void putAll(Map map) {
        mo66526n(map);
        this.f3969b.m29735m(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        if (obj != null) {
            Object mo29657g = this.f3969b.mo29657g(obj);
            this.f3969b.m29734n(obj);
            return mo29657g;
        }
        throw new NullPointerException("Null keys are not allowed.");
    }

    @Override // java.util.Map
    public int size() {
        return this.f3969b.m29733o();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f3969b.m29730r();
    }
}