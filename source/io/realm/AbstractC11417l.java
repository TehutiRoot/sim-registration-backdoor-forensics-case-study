package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.ObservableMap;
import io.realm.internal.OsMap;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: io.realm.l */
/* loaded from: classes5.dex */
public abstract class AbstractC11417l {

    /* renamed from: a */
    public final Class f66904a;

    /* renamed from: b */
    public final BaseRealm f66905b;

    /* renamed from: c */
    public final OsMap f66906c;

    /* renamed from: d */
    public final AbstractC19706eW1 f66907d;

    /* renamed from: e */
    public final RealmMapEntrySet.IteratorType f66908e;

    public AbstractC11417l(Class cls, BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1, RealmMapEntrySet.IteratorType iteratorType) {
        this.f66904a = cls;
        this.f66905b = baseRealm;
        this.f66906c = osMap;
        this.f66907d = abstractC19706eW1;
        this.f66908e = iteratorType;
    }

    /* renamed from: a */
    public void m29402a() {
        this.f66906c.clear();
    }

    /* renamed from: b */
    public boolean m29401b(Object obj) {
        return this.f66906c.containsKey(obj);
    }

    /* renamed from: c */
    public boolean mo29320c(Object obj) {
        if (obj != null && obj.getClass() != this.f66904a) {
            throw new ClassCastException("Only '" + this.f66904a.getSimpleName() + "'  values can be used with 'containsValue'.");
        }
        return mo29319d(obj);
    }

    /* renamed from: d */
    public abstract boolean mo29319d(Object obj);

    /* renamed from: e */
    public abstract Set mo29318e();

    /* renamed from: f */
    public Pair m29400f() {
        BaseRealm freeze = this.f66905b.freeze();
        return new Pair(freeze, this.f66906c.freeze(freeze.sharedRealm));
    }

    /* renamed from: g */
    public abstract Object mo29317g(Object obj);

    /* renamed from: h */
    public boolean m29399h() {
        if (this.f66906c.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m29398i() {
        return this.f66905b.isFrozen();
    }

    /* renamed from: j */
    public boolean m29397j() {
        if (this.f66905b.isClosed()) {
            return false;
        }
        return this.f66906c.isValid();
    }

    /* renamed from: k */
    public Set m29396k() {
        return this.f66907d.mo888g();
    }

    /* renamed from: l */
    public abstract Object mo29316l(Object obj, Object obj2);

    /* renamed from: m */
    public void m29395m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo29316l(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: n */
    public void m29394n(Object obj) {
        this.f66906c.remove(obj);
    }

    /* renamed from: o */
    public int m29393o() {
        return (int) this.f66906c.size();
    }

    /* renamed from: p */
    public void m29392p(ObservableMap observableMap) {
        this.f66906c.startListening(observableMap);
    }

    /* renamed from: q */
    public void m29391q() {
        this.f66906c.stopListening();
    }

    /* renamed from: r */
    public Collection m29390r() {
        return this.f66907d.mo889f();
    }
}
