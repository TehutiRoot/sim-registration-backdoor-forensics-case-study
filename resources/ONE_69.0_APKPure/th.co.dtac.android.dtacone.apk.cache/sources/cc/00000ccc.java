package p000;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* renamed from: NW1 */
/* loaded from: classes6.dex */
public final class NW1 {

    /* renamed from: a */
    public final TypeParameterDescriptor f4191a;

    /* renamed from: b */
    public final KotlinType f4192b;

    /* renamed from: c */
    public final KotlinType f4193c;

    public NW1(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f4191a = typeParameter;
        this.f4192b = inProjection;
        this.f4193c = outProjection;
    }

    /* renamed from: a */
    public final KotlinType m67231a() {
        return this.f4192b;
    }

    /* renamed from: b */
    public final KotlinType m67230b() {
        return this.f4193c;
    }

    /* renamed from: c */
    public final TypeParameterDescriptor m67229c() {
        return this.f4191a;
    }

    /* renamed from: d */
    public final boolean m67228d() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.f4192b, this.f4193c);
    }
}