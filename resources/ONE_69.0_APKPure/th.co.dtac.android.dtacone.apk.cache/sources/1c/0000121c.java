package p000;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFloatAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class T20 {
    /* renamed from: a */
    public static float m66394a(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f, f2, f3), f, f2, f3);
    }

    /* renamed from: c */
    public static VectorizedFloatAnimationSpec m66392c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}