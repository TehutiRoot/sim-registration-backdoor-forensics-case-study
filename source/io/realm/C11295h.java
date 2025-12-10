package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import java.util.Set;

/* renamed from: io.realm.h */
/* loaded from: classes5.dex */
public class C11295h extends AbstractC11417l {

    /* renamed from: f */
    public final AbstractC0740KS f66658f;

    public C11295h(Class cls, BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1, RealmMapEntrySet.IteratorType iteratorType) {
        this(cls, baseRealm, osMap, abstractC19706eW1, iteratorType, new N50());
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: d */
    public boolean mo29319d(Object obj) {
        return this.f66906c.containsPrimitiveValue(obj);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: e */
    public Set mo29318e() {
        return new RealmMapEntrySet(this.f66905b, this.f66906c, this.f66908e, this.f66658f, null);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: g */
    public Object mo29317g(Object obj) {
        Object obj2 = this.f66906c.get(obj);
        if (obj2 == null) {
            return null;
        }
        return mo29315s(obj2);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: l */
    public Object mo29316l(Object obj, Object obj2) {
        Object mo29317g = mo29317g(obj);
        this.f66906c.put(obj, obj2);
        return mo29317g;
    }

    /* renamed from: s */
    public Object mo29315s(Object obj) {
        return obj;
    }

    public C11295h(Class cls, BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1, RealmMapEntrySet.IteratorType iteratorType, AbstractC0740KS abstractC0740KS) {
        super(cls, baseRealm, osMap, abstractC19706eW1, iteratorType);
        this.f66658f = abstractC0740KS;
    }
}
