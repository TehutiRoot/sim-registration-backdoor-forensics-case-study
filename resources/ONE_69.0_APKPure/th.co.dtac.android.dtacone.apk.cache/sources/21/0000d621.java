package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.k */
/* loaded from: classes5.dex */
public class C11401k extends C11282h {
    public C11401k(BaseRealm baseRealm, OsMap osMap, AbstractC19240bX1 abstractC19240bX1) {
        super(Integer.class, baseRealm, osMap, abstractC19240bX1, RealmMapEntrySet.IteratorType.INTEGER);
    }

    @Override // io.realm.C11282h
    /* renamed from: t */
    public Integer mo29655s(Object obj) {
        return Integer.valueOf(((Long) obj).intValue());
    }
}