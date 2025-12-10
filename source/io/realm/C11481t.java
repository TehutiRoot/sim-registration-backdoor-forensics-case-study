package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import java.util.Set;

/* renamed from: io.realm.t */
/* loaded from: classes5.dex */
public class C11481t extends AbstractC11417l {
    public C11481t(BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1) {
        super(RealmAny.class, baseRealm, osMap, abstractC19706eW1, RealmMapEntrySet.IteratorType.MIXED);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: d */
    public boolean mo29319d(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.f66906c.containsRealmAnyValue(((RealmAny) obj).m29707b());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: e */
    public Set mo29318e() {
        return new RealmMapEntrySet(this.f66905b, this.f66906c, RealmMapEntrySet.IteratorType.MIXED, null);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: s */
    public RealmAny mo29317g(Object obj) {
        long realmAnyPtr = this.f66906c.getRealmAnyPtr(obj);
        if (realmAnyPtr == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.m29704b(this.f66905b, new NativeRealmAny(realmAnyPtr)));
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: t */
    public RealmAny mo29316l(Object obj, RealmAny realmAny) {
        RealmAny mo29317g = mo29317g(obj);
        if (realmAny == null) {
            this.f66906c.put(obj, null);
        } else {
            this.f66906c.putRealmAny(obj, CollectionUtils.m29750b(this.f66905b, realmAny).m29707b());
        }
        return mo29317g;
    }
}
