package p000;

import io.realm.BaseRealm;
import io.realm.C11486u;
import io.realm.DynamicRealmObject;
import io.realm.RealmModel;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: FL */
/* loaded from: classes5.dex */
public final class C0381FL extends C11486u {
    public C0381FL(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        super(m68402i(baseRealm, nativeRealmAny));
    }

    /* renamed from: i */
    public static RealmModel m68402i(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        return baseRealm.m29757k(DynamicRealmObject.class, Table.getClassNameForTable(nativeRealmAny.getRealmModelTableName(baseRealm.m29754n())), nativeRealmAny.getRealmModelRowKey());
    }

    @Override // io.realm.C11486u, io.realm.RealmAnyOperator
    /* renamed from: f */
    public Class mo29323f() {
        return DynamicRealmObject.class;
    }
}
