package p000;

import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: IK1 */
/* loaded from: classes.dex */
public final class IK1 implements SizeTransform {

    /* renamed from: a */
    public final boolean f2665a;

    /* renamed from: b */
    public final Function2 f2666b;

    public IK1(boolean z, Function2 sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.f2665a = z;
        this.f2666b = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ  reason: not valid java name */
    public FiniteAnimationSpec mo69362createAnimationSpecTemP2vQ(long j, long j2) {
        return (FiniteAnimationSpec) this.f2666b.invoke(IntSize.m73994boximpl(j), IntSize.m73994boximpl(j2));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.f2665a;
    }
}