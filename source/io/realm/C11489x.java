package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.x */
/* loaded from: classes5.dex */
public final class C11489x extends AbstractC11433r {
    public C11489x(String str) {
        super(str, RealmAny.Type.STRING);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((String) super.mo29322g(String.class));
    }

    public C11489x(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), RealmAny.Type.STRING, nativeRealmAny);
    }
}
