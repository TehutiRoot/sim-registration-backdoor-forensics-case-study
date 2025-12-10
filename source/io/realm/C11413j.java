package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.j */
/* loaded from: classes5.dex */
public final class C11413j extends AbstractC11433r {
    public C11413j(Byte b) {
        super(b, RealmAny.Type.INTEGER);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Number) super.mo29322g(Number.class));
    }

    @Override // io.realm.AbstractC11433r
    public boolean equals(Object obj) {
        if (obj == null || !C11413j.class.equals(obj.getClass()) || ((Number) mo29322g(Number.class)).longValue() != ((Number) ((RealmAnyOperator) obj).mo29322g(Number.class)).longValue()) {
            return false;
        }
        return true;
    }

    public C11413j(Short sh) {
        super(sh, RealmAny.Type.INTEGER);
    }

    public C11413j(Integer num) {
        super(num, RealmAny.Type.INTEGER);
    }

    public C11413j(Long l) {
        super(l, RealmAny.Type.INTEGER);
    }

    public C11413j(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), RealmAny.Type.INTEGER, nativeRealmAny);
    }
}
