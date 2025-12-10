package p000;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* renamed from: QV1 */
/* loaded from: classes6.dex */
public final class QV1 {

    /* renamed from: a */
    public final TypeParameterDescriptor f5074a;

    /* renamed from: b */
    public final KotlinType f5075b;

    /* renamed from: c */
    public final KotlinType f5076c;

    public QV1(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f5074a = typeParameter;
        this.f5075b = inProjection;
        this.f5076c = outProjection;
    }

    /* renamed from: a */
    public final KotlinType m66558a() {
        return this.f5075b;
    }

    /* renamed from: b */
    public final KotlinType m66557b() {
        return this.f5076c;
    }

    /* renamed from: c */
    public final TypeParameterDescriptor m66556c() {
        return this.f5074a;
    }

    /* renamed from: d */
    public final boolean m66555d() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.f5075b, this.f5076c);
    }
}
