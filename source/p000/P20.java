package p000;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFloatAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class P20 {
    /* renamed from: a */
    public static float m66931a(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f, f2, f3), f, f2, f3);
    }

    /* renamed from: c */
    public static VectorizedFloatAnimationSpec m66929c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
