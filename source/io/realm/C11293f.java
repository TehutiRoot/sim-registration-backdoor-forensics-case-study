package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.f */
/* loaded from: classes5.dex */
public final class C11293f extends AbstractC11433r {
    public C11293f(Double d) {
        super(d, RealmAny.Type.DOUBLE);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Double) super.mo29322g(Double.class));
    }

    public C11293f(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), RealmAny.Type.DOUBLE, nativeRealmAny);
    }
}
