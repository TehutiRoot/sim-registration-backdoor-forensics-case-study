package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import okhttp3.HttpUrl;

/* renamed from: Q50 */
/* loaded from: classes5.dex */
public final class Q50 implements GenericArrayType, Type {

    /* renamed from: a */
    public final Type f5121a;

    public Q50(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f5121a = elementType;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && Intrinsics.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f5121a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m29011e;
        StringBuilder sb = new StringBuilder();
        m29011e = TypesJVMKt.m29011e(this.f5121a);
        sb.append(m29011e);
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