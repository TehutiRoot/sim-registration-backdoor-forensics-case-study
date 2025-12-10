package p000;

import androidx.compose.foundation.layout.SideCalculator;
import kotlin.ranges.AbstractC11719c;

/* renamed from: LI1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class LI1 {
    /* renamed from: a */
    public static float m67533a(SideCalculator sideCalculator, float f, float f2) {
        return AbstractC11719c.coerceAtMost(sideCalculator.motionOf(f, f2), 0.0f);
    }

    /* renamed from: b */
    public static float m67532b(SideCalculator sideCalculator, float f, float f2) {
        return AbstractC11719c.coerceAtLeast(sideCalculator.motionOf(f, f2), 0.0f);
    }
}
