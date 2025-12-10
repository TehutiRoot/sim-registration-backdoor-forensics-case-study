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
    public final RectF f41488D;

    /* renamed from: E */
    public final Paint f41489E;

    /* renamed from: F */
    public final float[] f41490F;

    /* renamed from: G */
    public final Path f41491G;

    /* renamed from: H */
    public final Layer f41492H;

    /* renamed from: I */
    public BaseKeyframeAnimation f41493I;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f41488D = new RectF();
        LPaint lPaint = new LPaint();
        this.f41489E = lPaint;
        this.f41490F = new float[8];
        this.f41491G = new Path();
        this.f41492H = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.m50759i());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.f41493I = null;
            } else {
                this.f41493I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.f41492H.m50759i());
        if (alpha == 0) {
            return;
        }
        if (this.f41442x.getOpacity() == null) {
            intValue = 100;
        } else {
            intValue = this.f41442x.getOpacity().getValue().intValue();
        }
        int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.f41489E.setAlpha(i2);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41493I;
        if (baseKeyframeAnimation != null) {
            this.f41489E.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        if (i2 > 0) {
            float[] fArr = this.f41490F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f41492H.m50757k();
            float[] fArr2 = this.f41490F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f41492H.m50757k();
            this.f41490F[5] = this.f41492H.m50758j();
            float[] fArr3 = this.f41490F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f41492H.m50758j();
            matrix.mapPoints(this.f41490F);
            this.f41491G.reset();
            Path path = this.f41491G;
            float[] fArr4 = this.f41490F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f41491G;
            float[] fArr5 = this.f41490F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f41491G;
            float[] fArr6 = this.f41490F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f41491G;
            float[] fArr7 = this.f41490F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f41491G;
            float[] fArr8 = this.f41490F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f41491G.close();
            canvas.drawPath(this.f41491G, this.f41489E);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f41488D.set(0.0f, 0.0f, this.f41492H.m50757k(), this.f41492H.m50758j());
        this.f41433o.mapRect(this.f41488D);
        rectF.set(this.f41488D);
    }
}
