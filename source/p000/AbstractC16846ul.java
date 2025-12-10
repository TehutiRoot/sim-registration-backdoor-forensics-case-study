package p000;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.DegreesKt;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ul */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC16846ul {
    /* renamed from: a */
    public static void m1212a(Canvas canvas, Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        canvas.mo71597clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    /* renamed from: b */
    public static void m1211b(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    /* renamed from: c */
    public static void m1210c(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    /* renamed from: d */
    public static void m1209d(Canvas canvas, Rect rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    /* renamed from: e */
    public static void m1208e(Canvas canvas, Rect rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    /* renamed from: f */
    public static void m1207f(Canvas canvas, float f, float f2) {
        canvas.skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    /* renamed from: m */
    public static /* synthetic */ void m1200m(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m71724getIntersectrtfAjoo();
            }
            canvas.mo71596clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: n */
    public static /* synthetic */ void m1199n(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m71724getIntersectrtfAjoo();
            }
            canvas.mo71597clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: o */
    public static /* synthetic */ void m1198o(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m71724getIntersectrtfAjoo();
            }
            canvas.mo71598clipRectmtrdDE(rect, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* renamed from: p */
    public static /* synthetic */ void m1197p(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (obj == null) {
            if ((i & 2) != 0) {
                j5 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i & 8) != 0) {
                j7 = IntOffset.Companion.m73786getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            canvas.mo71602drawImageRectHPBpro0(imageBitmap, j5, j6, j7, j8, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    /* renamed from: q */
    public static /* synthetic */ void m1196q(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }
}
