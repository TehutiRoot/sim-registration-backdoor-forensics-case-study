package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.k */
/* loaded from: classes5.dex */
public class C11414k extends C11295h {
    public C11414k(BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1) {
        super(Integer.class, baseRealm, osMap, abstractC19706eW1, RealmMapEntrySet.IteratorType.INTEGER);
    }

    @Override // io.realm.C11295h
    /* renamed from: t */
    public Integer mo29315s(Object obj) {
        return Integer.valueOf(((Long) obj).intValue());
    }
}
