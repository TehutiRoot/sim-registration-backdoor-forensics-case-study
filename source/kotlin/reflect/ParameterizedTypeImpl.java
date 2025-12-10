package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {

    /* renamed from: a */
    public final Class f68343a;

    /* renamed from: b */
    public final Type f68344b;

    /* renamed from: c */
    public final Type[] f68345c;

    public ParameterizedTypeImpl(Class rawType, Type type, List typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f68343a = rawType;
        this.f68344b = type;
        this.f68345c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.areEqual(this.f68343a, parameterizedType.getRawType()) && Intrinsics.areEqual(this.f68344b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f68345c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f68344b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f68343a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m28719e;
        boolean z;
        String m28719e2;
        StringBuilder sb = new StringBuilder();
        Type type = this.f68344b;
        if (type != null) {
            m28719e2 = TypesJVMKt.m28719e(type);
            sb.append(m28719e2);
            sb.append("$");
            sb.append(this.f68343a.getSimpleName());
        } else {
            m28719e = TypesJVMKt.m28719e(this.f68343a);
            sb.append(m28719e);
        }
        Type[] typeArr = this.f68345c;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArraysKt___ArraysKt.joinTo(typeArr, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) == 0 ? ">" : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f68343a.hashCode();
        Type type = this.f68344b;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
