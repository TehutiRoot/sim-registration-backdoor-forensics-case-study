package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.b */
/* loaded from: classes5.dex */
public final class C11289b extends AbstractC11433r {
    public C11289b(Boolean bool) {
        super(bool, RealmAny.Type.BOOLEAN);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Boolean) super.mo29322g(Boolean.class));
    }

    public C11289b(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), RealmAny.Type.BOOLEAN, nativeRealmAny);
    }
}
