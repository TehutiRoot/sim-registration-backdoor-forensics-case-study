package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes3.dex */
public class ImageLayer extends BaseLayer {

    /* renamed from: D */
    public final Paint f41456D;

    /* renamed from: E */
    public final Rect f41457E;

    /* renamed from: F */
    public final Rect f41458F;

    /* renamed from: G */
    public final LottieImageAsset f41459G;

    /* renamed from: H */
    public BaseKeyframeAnimation f41460H;

    /* renamed from: I */
    public BaseKeyframeAnimation f41461I;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f41456D = new LPaint(3);
        this.f41457E = new Rect();
        this.f41458F = new Rect();
        this.f41459G = lottieDrawable.getLottieImageAssetForId(layer.getRefId());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.f41460H = null;
            } else {
                this.f41460H = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        } else if (t == LottieProperty.IMAGE) {
            if (lottieValueCallback == null) {
                this.f41461I = null;
            } else {
                this.f41461I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap m50768y = m50768y();
        if (m50768y != null && !m50768y.isRecycled() && this.f41459G != null) {
            float dpScale = Utils.dpScale();
            this.f41456D.setAlpha(i);
            BaseKeyframeAnimation baseKeyframeAnimation = this.f41460H;
            if (baseKeyframeAnimation != null) {
                this.f41456D.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f41457E.set(0, 0, m50768y.getWidth(), m50768y.getHeight());
            if (this.f41434p.getMaintainOriginalImageBounds()) {
                this.f41458F.set(0, 0, (int) (this.f41459G.getWidth() * dpScale), (int) (this.f41459G.getHeight() * dpScale));
            } else {
                this.f41458F.set(0, 0, (int) (m50768y.getWidth() * dpScale), (int) (m50768y.getHeight() * dpScale));
            }
            canvas.drawBitmap(m50768y, this.f41457E, this.f41458F, this.f41456D);
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        if (this.f41459G != null) {
            float dpScale = Utils.dpScale();
            rectF.set(0.0f, 0.0f, this.f41459G.getWidth() * dpScale, this.f41459G.getHeight() * dpScale);
            this.f41433o.mapRect(rectF);
        }
    }

    /* renamed from: y */
    public final Bitmap m50768y() {
        Bitmap bitmap;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41461I;
        if (baseKeyframeAnimation != null && (bitmap = (Bitmap) baseKeyframeAnimation.getValue()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.f41434p.getBitmapForId(this.f41435q.getRefId());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        LottieImageAsset lottieImageAsset = this.f41459G;
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }
}
