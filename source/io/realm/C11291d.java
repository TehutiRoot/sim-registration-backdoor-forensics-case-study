package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

/* renamed from: io.realm.d */
/* loaded from: classes5.dex */
public final class C11291d extends AbstractC11433r {
    public C11291d(Date date) {
        super(date, RealmAny.Type.DATE);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Date) super.mo29322g(Date.class));
    }

    public C11291d(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), RealmAny.Type.DATE, nativeRealmAny);
    }
}
