package p000;

import androidx.compose.foundation.layout.SideCalculator;
import kotlin.ranges.AbstractC11695c;

/* renamed from: IJ1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class IJ1 {
    /* renamed from: a */
    public static float m68023a(SideCalculator sideCalculator, float f, float f2) {
        return AbstractC11695c.coerceAtMost(sideCalculator.motionOf(f, f2), 0.0f);
    }

    /* renamed from: b */
    public static float m68022b(SideCalculator sideCalculator, float f, float f2) {
        return AbstractC11695c.coerceAtLeast(sideCalculator.motionOf(f, f2), 0.0f);
    }
}