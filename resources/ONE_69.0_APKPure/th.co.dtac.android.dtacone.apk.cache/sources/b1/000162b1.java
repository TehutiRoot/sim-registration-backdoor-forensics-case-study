package p000;

import androidx.compose.p003ui.platform.AccessibilityManager;

/* renamed from: z0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17178z0 {
    /* renamed from: a */
    public static /* synthetic */ long m213a(AccessibilityManager accessibilityManager, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj == null) {
            if ((i & 2) != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if ((i & 4) != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((i & 8) != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            return accessibilityManager.calculateRecommendedTimeoutMillis(j, z4, z5, z6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }
}