package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;

/* renamed from: io.realm.w */
/* loaded from: classes5.dex */
public class C11488w extends C11295h {
    public C11488w(BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1) {
        super(Short.class, baseRealm, osMap, abstractC19706eW1, RealmMapEntrySet.IteratorType.SHORT);
    }

    @Override // io.realm.C11295h
    /* renamed from: t */
    public Short mo29315s(Object obj) {
        return Short.valueOf(((Long) obj).shortValue());
    }
}
