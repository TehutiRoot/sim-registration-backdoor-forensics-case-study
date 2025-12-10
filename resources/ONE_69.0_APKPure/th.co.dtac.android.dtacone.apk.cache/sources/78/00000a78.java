package p000;

import androidx.compose.material.AnchoredDragScope;

/* renamed from: L2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0771L2 {
    /* renamed from: a */
    public static /* synthetic */ void m67645a(AnchoredDragScope anchoredDragScope, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            anchoredDragScope.dragTo(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
    }
}