package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

/* renamed from: io.realm.p */
/* loaded from: classes5.dex */
public final class C11422p extends AbstractC11433r {
    public C11422p(ObjectId objectId) {
        super(objectId, RealmAny.Type.OBJECT_ID);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((ObjectId) super.mo29322g(ObjectId.class));
    }

    public C11422p(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), RealmAny.Type.OBJECT_ID, nativeRealmAny);
    }
}
