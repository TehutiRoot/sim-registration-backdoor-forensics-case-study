package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.realm.o */
/* loaded from: classes5.dex */
public final class C11421o extends RealmAnyOperator {
    public C11421o() {
        super(RealmAny.Type.NULL);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny();
    }

    public boolean equals(Object obj) {
        if (obj != null && C11421o.class.equals(obj.getClass())) {
            return true;
        }
        return false;
    }

    @Override // io.realm.RealmAnyOperator
    /* renamed from: g */
    public Object mo29322g(Class cls) {
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return AbstractJsonLexerKt.NULL;
    }

    public C11421o(NativeRealmAny nativeRealmAny) {
        super(RealmAny.Type.NULL, nativeRealmAny);
    }
}
