package p000;

import io.realm.AbstractC11417l;
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

/* renamed from: Gn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC17683Gn0 implements Map, ManageableObject, Freezable, ObservableMap {

    /* renamed from: a */
    public final BaseRealm f2005a;

    /* renamed from: b */
    public final AbstractC11417l f2006b;

    /* renamed from: c */
    public final AbstractC19706eW1 f2007c;

    /* renamed from: d */
    public final ObserverPairList f2008d = new ObserverPairList();

    public AbstractC17683Gn0(BaseRealm baseRealm, AbstractC11417l abstractC11417l, AbstractC19706eW1 abstractC19706eW1) {
        this.f2005a = baseRealm;
        this.f2006b = abstractC11417l;
        this.f2007c = abstractC19706eW1;
    }

    /* renamed from: a */
    public void m68187a(RealmMap realmMap, MapChangeListener mapChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.f2005a, mapChangeListener, true);
        if (this.f2008d.isEmpty()) {
            this.f2006b.m29392p(this);
        }
        this.f2008d.add(new ObservableMap.MapObserverPair(realmMap, mapChangeListener));
    }

    /* renamed from: b */
    public void m68186b(RealmMap realmMap, RealmChangeListener realmChangeListener) {
        m68187a(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }

    /* renamed from: c */
    public abstract MapChangeSet mo66466c(long j);

    @Override // java.util.Map
    public void clear() {
        this.f2006b.m29402a();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo66465e(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f2006b.mo29320c(obj);
    }

    /* renamed from: e */
    public abstract boolean mo66465e(Object obj);

    @Override // java.util.Map
    public abstract Set entrySet();

    @Override // io.realm.internal.Freezable
    /* renamed from: f */
    public RealmMap freeze() {
        return mo66464g(this.f2006b.m29400f());
    }

    /* renamed from: g */
    public abstract RealmMap mo66464g(Pair pair);

    /* renamed from: h */
    public String m68184h() {
        return this.f2007c.mo890e();
    }

    /* renamed from: i */
    public Class m68183i() {
        return this.f2007c.mo891d();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f2006b.m29399h();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.f2006b.m29398i();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
        return true;
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.f2006b.m29397j();
    }

    /* renamed from: j */
    public boolean m68182j(Object obj, Class cls) {
        if (obj != null && obj.getClass() != cls) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m68181k() {
        CollectionUtils.checkForAddRemoveListener(this.f2005a, null, false);
        this.f2008d.clear();
        this.f2006b.m29391q();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f2006b.m29396k();
    }

    /* renamed from: l */
    public void m68180l(RealmMap realmMap, MapChangeListener mapChangeListener) {
        this.f2008d.remove(realmMap, mapChangeListener);
        if (this.f2008d.isEmpty()) {
            this.f2006b.m29391q();
        }
    }

    /* renamed from: m */
    public void m68179m(RealmMap realmMap, RealmChangeListener realmChangeListener) {
        m68180l(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }

    /* renamed from: n */
    public abstract void mo66463n(Map map);

    @Override // io.realm.internal.ObservableMap
    public void notifyChangeListeners(long j) {
        C17875Jn0 c17875Jn0 = new C17875Jn0(mo66466c(j));
        if (c17875Jn0.isEmpty()) {
            return;
        }
        this.f2008d.foreach(new ObservableMap.Callback(c17875Jn0));
    }

    @Override // java.util.Map
    public abstract Object put(Object obj, Object obj2);

    @Override // java.util.Map
    public void putAll(Map map) {
        mo66463n(map);
        this.f2006b.m29395m(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        if (obj != null) {
            Object mo29317g = this.f2006b.mo29317g(obj);
            this.f2006b.m29394n(obj);
            return mo29317g;
        }
        throw new NullPointerException("Null keys are not allowed.");
    }

    @Override // java.util.Map
    public int size() {
        return this.f2006b.m29393o();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f2006b.m29390r();
    }
}
