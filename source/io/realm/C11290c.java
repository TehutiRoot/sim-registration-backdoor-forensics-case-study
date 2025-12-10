package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.c */
/* loaded from: classes5.dex */
public class C11290c extends C11295h {
    public C11290c(BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1) {
        super(Byte.class, baseRealm, osMap, abstractC19706eW1, RealmMapEntrySet.IteratorType.BYTE);
    }

    @Override // io.realm.C11295h
    /* renamed from: t */
    public Byte mo29315s(Object obj) {
        return Byte.valueOf(((Long) obj).byteValue());
    }
}
