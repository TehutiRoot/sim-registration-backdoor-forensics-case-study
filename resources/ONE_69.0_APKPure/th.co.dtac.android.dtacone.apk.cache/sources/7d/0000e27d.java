package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes6.dex */
public final class TypeParameterErasureOptions {

    /* renamed from: a */
    public final boolean f70315a;

    /* renamed from: b */
    public final boolean f70316b;

    public TypeParameterErasureOptions(boolean z, boolean z2) {
        this.f70315a = z;
        this.f70316b = z2;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f70316b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f70315a;
    }
}