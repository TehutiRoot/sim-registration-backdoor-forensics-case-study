package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class ShadowRenderer {

    /* renamed from: i */
    public static final int[] f50607i = new int[3];

    /* renamed from: j */
    public static final float[] f50608j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f50609k = new int[4];

    /* renamed from: l */
    public static final float[] f50610l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f50611a;

    /* renamed from: b */
    public final Paint f50612b;

    /* renamed from: c */
    public final Paint f50613c;

    /* renamed from: d */
    public int f50614d;

    /* renamed from: e */
    public int f50615e;

    /* renamed from: f */
    public int f50616f;

    /* renamed from: g */
    public final Path f50617g;

    /* renamed from: h */
    public final Paint f50618h;

    public ShadowRenderer() {
        this(-16777216);
    }

    public void drawCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f50617g;
        if (z) {
            int[] iArr = f50609k;
            iArr[0] = 0;
            iArr[1] = this.f50616f;
            iArr[2] = this.f50615e;
            iArr[3] = this.f50614d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f50609k;
            iArr2[0] = 0;
            iArr2[1] = this.f50614d;
            iArr2[2] = this.f50615e;
            iArr2[3] = this.f50616f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f50610l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f50612b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f50609k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f50618h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f50612b);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f50607i;
        iArr[0] = this.f50616f;
        iArr[1] = this.f50615e;
        iArr[2] = this.f50614d;
        Paint paint = this.f50613c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f50608j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f50613c);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2, @NonNull float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        drawCornerShadow(canvas, matrix, rectF, i, f, f2);
        Path path = this.f50617g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f50618h);
        canvas.drawPath(path, this.f50611a);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.f50611a;
    }

    public void setShadowColor(int i) {
        this.f50614d = ColorUtils.setAlphaComponent(i, 68);
        this.f50615e = ColorUtils.setAlphaComponent(i, 20);
        this.f50616f = ColorUtils.setAlphaComponent(i, 0);
        this.f50611a.setColor(this.f50614d);
    }

    public ShadowRenderer(int i) {
        this.f50617g = new Path();
        Paint paint = new Paint();
        this.f50618h = paint;
        this.f50611a = new Paint();
        setShadowColor(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f50612b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f50613c = new Paint(paint2);
    }
}
