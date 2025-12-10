package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

/* renamed from: io.realm.y */
/* loaded from: classes5.dex */
public final class C11490y extends AbstractC11433r {
    public C11490y(UUID uuid) {
        super(uuid, RealmAny.Type.UUID);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((UUID) super.mo29322g(UUID.class));
    }

    public C11490y(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), RealmAny.Type.UUID, nativeRealmAny);
    }
}
