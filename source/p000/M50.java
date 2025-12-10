package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import okhttp3.HttpUrl;

/* renamed from: M50 */
/* loaded from: classes5.dex */
public final class M50 implements GenericArrayType, Type {

    /* renamed from: a */
    public final Type f3672a;

    public M50(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f3672a = elementType;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && Intrinsics.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f3672a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m28719e;
        StringBuilder sb = new StringBuilder();
        m28719e = TypesJVMKt.m28719e(this.f3672a);
        sb.append(m28719e);
        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
