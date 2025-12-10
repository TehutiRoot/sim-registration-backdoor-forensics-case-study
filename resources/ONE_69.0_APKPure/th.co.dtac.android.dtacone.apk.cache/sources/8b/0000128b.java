package p000;

import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.p003ui.geometry.Offset;

/* renamed from: TV1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class TV1 {
    /* renamed from: a */
    public static /* synthetic */ void m66341a(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                j = Offset.Companion.m71702getZeroF1C5BW0();
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            transformScope.mo69568transformByd4ec7I(f, j, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }
}