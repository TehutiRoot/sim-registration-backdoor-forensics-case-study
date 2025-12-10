package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.w */
/* loaded from: classes5.dex */
public class C11475w extends C11282h {
    public C11475w(BaseRealm baseRealm, OsMap osMap, AbstractC19240bX1 abstractC19240bX1) {
        super(Short.class, baseRealm, osMap, abstractC19240bX1, RealmMapEntrySet.IteratorType.SHORT);
    }

    @Override // io.realm.C11282h
    /* renamed from: t */
    public Short mo29655s(Object obj) {
        return Short.valueOf(((Long) obj).shortValue());
    }
}