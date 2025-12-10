package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.c */
/* loaded from: classes5.dex */
public class C11277c extends C11282h {
    public C11277c(BaseRealm baseRealm, OsMap osMap, AbstractC19240bX1 abstractC19240bX1) {
        super(Byte.class, baseRealm, osMap, abstractC19240bX1, RealmMapEntrySet.IteratorType.BYTE);
    }

    @Override // io.realm.C11282h
    /* renamed from: t */
    public Byte mo29655s(Object obj) {
        return Byte.valueOf(((Long) obj).byteValue());
    }
}