package p000;

import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawTransform;

/* renamed from: mK */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC12278mK {
    /* renamed from: a */
    public static long m26272a(DrawTransform drawTransform) {
        float f = 2;
        return OffsetKt.Offset(Size.m71571getWidthimpl(drawTransform.mo72155getSizeNHjbRc()) / f, Size.m71568getHeightimpl(drawTransform.mo72155getSizeNHjbRc()) / f);
    }

    /* renamed from: c */
    public static /* synthetic */ void m26270c(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m71724getIntersectrtfAjoo();
            }
            drawTransform.mo72152clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: d */
    public static /* synthetic */ void m26269d(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = Size.m71571getWidthimpl(drawTransform.mo72155getSizeNHjbRc());
            }
            if ((i2 & 8) != 0) {
                f4 = Size.m71568getHeightimpl(drawTransform.mo72155getSizeNHjbRc());
            }
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m71724getIntersectrtfAjoo();
            }
            drawTransform.mo72153clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: e */
    public static /* synthetic */ void m26268e(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = drawTransform.mo72154getCenterF1C5BW0();
            }
            drawTransform.mo72156rotateUv8p0NA(f, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* renamed from: f */
    public static /* synthetic */ void m26267f(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = drawTransform.mo72154getCenterF1C5BW0();
            }
            drawTransform.mo72157scale0AR0LA0(f, f2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    /* renamed from: g */
    public static /* synthetic */ void m26266g(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            drawTransform.translate(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }
}
