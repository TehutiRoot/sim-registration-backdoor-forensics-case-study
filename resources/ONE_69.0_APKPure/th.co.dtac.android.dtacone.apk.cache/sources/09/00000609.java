package p000;

import io.realm.BaseRealm;
import io.realm.C11473u;
import io.realm.DynamicRealmObject;
import io.realm.RealmModel;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: GL */
/* loaded from: classes5.dex */
public final class C0444GL extends C11473u {
    public C0444GL(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        super(m68288i(baseRealm, nativeRealmAny));
    }

    /* renamed from: i */
    public static RealmModel m68288i(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        return baseRealm.m30097k(DynamicRealmObject.class, Table.getClassNameForTable(nativeRealmAny.getRealmModelTableName(baseRealm.m30094n())), nativeRealmAny.getRealmModelRowKey());
    }

    @Override // io.realm.C11473u, io.realm.RealmAnyOperator
    /* renamed from: f */
    public Class mo29663f() {
        return DynamicRealmObject.class;
    }
}