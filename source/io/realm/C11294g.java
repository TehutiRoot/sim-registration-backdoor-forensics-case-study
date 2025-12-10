package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.g */
/* loaded from: classes5.dex */
public final class C11294g extends AbstractC11433r {
    public C11294g(Float f) {
        super(f, RealmAny.Type.FLOAT);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Float) super.mo29322g(Float.class));
    }

    public C11294g(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), RealmAny.Type.FLOAT, nativeRealmAny);
    }
}
