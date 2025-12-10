package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

/* renamed from: io.realm.a */
/* loaded from: classes5.dex */
public final class C11288a extends AbstractC11433r {
    public C11288a(byte[] bArr) {
        super(bArr, RealmAny.Type.BINARY);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((byte[]) super.mo29322g(byte[].class));
    }

    @Override // io.realm.AbstractC11433r
    public boolean equals(Object obj) {
        if (obj != null && C11288a.class.equals(obj.getClass())) {
            return Arrays.equals((byte[]) mo29322g(byte[].class), (byte[]) ((RealmAnyOperator) obj).mo29322g(byte[].class));
        }
        return false;
    }

    public C11288a(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), RealmAny.Type.BINARY, nativeRealmAny);
    }
}
