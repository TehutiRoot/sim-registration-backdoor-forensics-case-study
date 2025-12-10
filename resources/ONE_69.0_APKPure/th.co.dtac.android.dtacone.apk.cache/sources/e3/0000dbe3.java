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
    public final Class f68377a;

    /* renamed from: b */
    public final Type f68378b;

    /* renamed from: c */
    public final Type[] f68379c;

    public ParameterizedTypeImpl(Class rawType, Type type, List typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f68377a = rawType;
        this.f68378b = type;
        this.f68379c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.areEqual(this.f68377a, parameterizedType.getRawType()) && Intrinsics.areEqual(this.f68378b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f68379c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f68378b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f68377a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m29011e;
        boolean z;
        String m29011e2;
        StringBuilder sb = new StringBuilder();
        Type type = this.f68378b;
        if (type != null) {
            m29011e2 = TypesJVMKt.m29011e(type);
            sb.append(m29011e2);
            sb.append("$");
            sb.append(this.f68377a.getSimpleName());
        } else {
            m29011e = TypesJVMKt.m29011e(this.f68377a);
            sb.append(m29011e);
        }
        Type[] typeArr = this.f68379c;
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
        int hashCode = this.f68377a.hashCode();
        Type type = this.f68378b;
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