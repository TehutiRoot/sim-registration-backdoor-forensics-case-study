package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ViewPorts {
    /* renamed from: a */
    public static RectF m62748a(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (i == 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 90 && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            if (i == 0 && z) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i == 270 && !z) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z4 && !z5) {
                if (i == 90 && !z) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i == 180 && z) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z6 && !z7) {
                    if (i == 180 && !z) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i == 270 && z) {
                        z9 = true;
                    }
                    if (!z8 && !z9) {
                        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
                    }
                    return m62747b(m62746c(rectF2, rectF.centerY()), rectF.centerX());
                }
                return m62746c(rectF2, rectF.centerY());
            }
            return m62747b(rectF2, rectF.centerX());
        }
        return rectF2;
    }

    /* renamed from: b */
    public static RectF m62747b(RectF rectF, float f) {
        return new RectF(m62745d(rectF.right, f), rectF.top, m62745d(rectF.left, f), rectF.bottom);
    }

    /* renamed from: c */
    public static RectF m62746c(RectF rectF, float f) {
        return new RectF(rectF.left, m62744e(rectF.bottom, f), rectF.right, m62744e(rectF.top, f));
    }

    @NonNull
    public static Map<UseCase, Rect> calculateViewPortRects(@NonNull Rect rect, boolean z, @NonNull Rational rational, @IntRange(from = 0, m64693to = 359) int i, int i2, int i3, @NonNull Map<UseCase, StreamSpec> map) {
        boolean z2;
        if (rect.width() > 0 && rect.height() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((UseCase) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: d */
    public static float m62745d(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: e */
    public static float m62744e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    public static boolean m62743f(boolean z, int i) {
        return z ^ (i == 1);
    }

    @NonNull
    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(@NonNull RectF rectF, @NonNull Rational rational, int i, boolean z, int i2, @IntRange(from = 0, m64693to = 359) int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
                } else {
                    throw new IllegalStateException("Unexpected scale type: " + i);
                }
            } else {
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            }
        } else {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m62748a(m62743f(z, i2), i3, rectF, rectF3);
    }
}