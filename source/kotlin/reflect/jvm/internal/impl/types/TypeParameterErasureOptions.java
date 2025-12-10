package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes6.dex */
public final class TypeParameterErasureOptions {

    /* renamed from: a */
    public final boolean f70281a;

    /* renamed from: b */
    public final boolean f70282b;

    public TypeParameterErasureOptions(boolean z, boolean z2) {
        this.f70281a = z;
        this.f70282b = z2;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f70282b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f70281a;
    }
}
