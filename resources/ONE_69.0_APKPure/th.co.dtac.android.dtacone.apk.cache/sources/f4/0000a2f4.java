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
    public static final int[] f50619i = new int[3];

    /* renamed from: j */
    public static final float[] f50620j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f50621k = new int[4];

    /* renamed from: l */
    public static final float[] f50622l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f50623a;

    /* renamed from: b */
    public final Paint f50624b;

    /* renamed from: c */
    public final Paint f50625c;

    /* renamed from: d */
    public int f50626d;

    /* renamed from: e */
    public int f50627e;

    /* renamed from: f */
    public int f50628f;

    /* renamed from: g */
    public final Path f50629g;

    /* renamed from: h */
    public final Paint f50630h;

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
        Path path = this.f50629g;
        if (z) {
            int[] iArr = f50621k;
            iArr[0] = 0;
            iArr[1] = this.f50628f;
            iArr[2] = this.f50627e;
            iArr[3] = this.f50626d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f50621k;
            iArr2[0] = 0;
            iArr2[1] = this.f50626d;
            iArr2[2] = this.f50627e;
            iArr2[3] = this.f50628f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f50622l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f50624b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f50621k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f50630h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f50624b);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f50619i;
        iArr[0] = this.f50628f;
        iArr[1] = this.f50627e;
        iArr[2] = this.f50626d;
        Paint paint = this.f50625c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f50620j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f50625c);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f, float f2, @NonNull float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        drawCornerShadow(canvas, matrix, rectF, i, f, f2);
        Path path = this.f50629g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f50630h);
        canvas.drawPath(path, this.f50623a);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.f50623a;
    }

    public void setShadowColor(int i) {
        this.f50626d = ColorUtils.setAlphaComponent(i, 68);
        this.f50627e = ColorUtils.setAlphaComponent(i, 20);
        this.f50628f = ColorUtils.setAlphaComponent(i, 0);
        this.f50623a.setColor(this.f50626d);
    }

    public ShadowRenderer(int i) {
        this.f50629g = new Path();
        Paint paint = new Paint();
        this.f50630h = paint;
        this.f50623a = new Paint();
        setShadowColor(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f50624b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f50625c = new Paint(paint2);
    }
}