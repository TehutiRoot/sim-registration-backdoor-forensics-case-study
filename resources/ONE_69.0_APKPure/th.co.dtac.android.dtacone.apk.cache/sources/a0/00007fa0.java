package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes3.dex */
public class SolidLayer extends BaseLayer {

    /* renamed from: D */
    public final RectF f41500D;

    /* renamed from: E */
    public final Paint f41501E;

    /* renamed from: F */
    public final float[] f41502F;

    /* renamed from: G */
    public final Path f41503G;

    /* renamed from: H */
    public final Layer f41504H;

    /* renamed from: I */
    public BaseKeyframeAnimation f41505I;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f41500D = new RectF();
        LPaint lPaint = new LPaint();
        this.f41501E = lPaint;
        this.f41502F = new float[8];
        this.f41503G = new Path();
        this.f41504H = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.m50756i());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.f41505I = null;
            } else {
                this.f41505I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.f41504H.m50756i());
        if (alpha == 0) {
            return;
        }
        if (this.f41454x.getOpacity() == null) {
            intValue = 100;
        } else {
            intValue = this.f41454x.getOpacity().getValue().intValue();
        }
        int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.f41501E.setAlpha(i2);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41505I;
        if (baseKeyframeAnimation != null) {
            this.f41501E.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        if (i2 > 0) {
            float[] fArr = this.f41502F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f41504H.m50754k();
            float[] fArr2 = this.f41502F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f41504H.m50754k();
            this.f41502F[5] = this.f41504H.m50755j();
            float[] fArr3 = this.f41502F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f41504H.m50755j();
            matrix.mapPoints(this.f41502F);
            this.f41503G.reset();
            Path path = this.f41503G;
            float[] fArr4 = this.f41502F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f41503G;
            float[] fArr5 = this.f41502F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f41503G;
            float[] fArr6 = this.f41502F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f41503G;
            float[] fArr7 = this.f41502F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f41503G;
            float[] fArr8 = this.f41502F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f41503G.close();
            canvas.drawPath(this.f41503G, this.f41501E);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f41500D.set(0.0f, 0.0f, this.f41504H.m50754k(), this.f41504H.m50755j());
        this.f41445o.mapRect(this.f41500D);
        rectF.set(this.f41500D);
    }
}