package p000;

import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LJ1 */
/* loaded from: classes.dex */
public final class LJ1 implements SizeTransform {

    /* renamed from: a */
    public final boolean f3439a;

    /* renamed from: b */
    public final Function2 f3440b;

    public LJ1(boolean z, Function2 sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.f3439a = z;
        this.f3440b = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ  reason: not valid java name */
    public FiniteAnimationSpec mo69181createAnimationSpecTemP2vQ(long j, long j2) {
        return (FiniteAnimationSpec) this.f3440b.invoke(IntSize.m73810boximpl(j), IntSize.m73810boximpl(j2));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.f3439a;
    }
}
