package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

/* renamed from: io.realm.e */
/* loaded from: classes5.dex */
public final class C11292e extends AbstractC11433r {
    public C11292e(Decimal128 decimal128) {
        super(decimal128, RealmAny.Type.DECIMAL128);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Decimal128) super.mo29322g(Decimal128.class));
    }

    public C11292e(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), RealmAny.Type.DECIMAL128, nativeRealmAny);
    }
}
