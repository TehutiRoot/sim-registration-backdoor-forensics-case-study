package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public class FadingImageView extends ImageView {

    /* renamed from: a */
    public Matrix f58726a;

    /* renamed from: b */
    public Paint f58727b;

    /* renamed from: c */
    public Shader f58728c;

    /* renamed from: d */
    public Paint f58729d;

    /* renamed from: e */
    public Shader f58730e;

    /* renamed from: f */
    public int f58731f;

    /* renamed from: g */
    public int f58732g;

    /* renamed from: h */
    public boolean f58733h;

    public FadingImageView(Context context) {
        super(context);
        m33475a();
    }

    /* renamed from: a */
    public final void m33475a() {
        this.f58726a = new Matrix();
        this.f58727b = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -16777216, -452984832, 0}, new float[]{0.0f, 0.2f, 0.4f, 1.0f}, tileMode);
        this.f58728c = linearGradient;
        this.f58727b.setShader(linearGradient);
        Paint paint = this.f58727b;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f58729d = new Paint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 0, -16777216, -16777216}, new float[]{0.0f, 0.85f, 0.98f, 1.0f}, tileMode);
        this.f58730e = linearGradient2;
        this.f58729d.setShader(linearGradient2);
        this.f58727b.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f58733h) {
            Rect clipBounds = canvas.getClipBounds();
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, clipBounds.width(), clipBounds.height(), null, 31);
            super.draw(canvas);
            canvas.drawRect(0.0f, 0.0f, this.f58732g, this.f58731f, this.f58727b);
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f58733h) {
            this.f58731f = getHeight();
            this.f58732g = getWidth();
            this.f58726a.setScale(1.0f, View.MeasureSpec.getSize(i2));
            this.f58728c.setLocalMatrix(this.f58726a);
            this.f58730e.setLocalMatrix(this.f58726a);
        }
    }

    public void showShadow(boolean z) {
        this.f58733h = z;
    }

    public FadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33475a();
    }

    public FadingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33475a();
    }
}
