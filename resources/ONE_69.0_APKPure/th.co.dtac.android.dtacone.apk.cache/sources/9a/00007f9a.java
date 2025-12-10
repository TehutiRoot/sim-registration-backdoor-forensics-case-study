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
    public final Paint f41468D;

    /* renamed from: E */
    public final Rect f41469E;

    /* renamed from: F */
    public final Rect f41470F;

    /* renamed from: G */
    public final LottieImageAsset f41471G;

    /* renamed from: H */
    public BaseKeyframeAnimation f41472H;

    /* renamed from: I */
    public BaseKeyframeAnimation f41473I;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f41468D = new LPaint(3);
        this.f41469E = new Rect();
        this.f41470F = new Rect();
        this.f41471G = lottieDrawable.getLottieImageAssetForId(layer.getRefId());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.f41472H = null;
            } else {
                this.f41472H = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        } else if (t == LottieProperty.IMAGE) {
            if (lottieValueCallback == null) {
                this.f41473I = null;
            } else {
                this.f41473I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap m50765y = m50765y();
        if (m50765y != null && !m50765y.isRecycled() && this.f41471G != null) {
            float dpScale = Utils.dpScale();
            this.f41468D.setAlpha(i);
            BaseKeyframeAnimation baseKeyframeAnimation = this.f41472H;
            if (baseKeyframeAnimation != null) {
                this.f41468D.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f41469E.set(0, 0, m50765y.getWidth(), m50765y.getHeight());
            if (this.f41446p.getMaintainOriginalImageBounds()) {
                this.f41470F.set(0, 0, (int) (this.f41471G.getWidth() * dpScale), (int) (this.f41471G.getHeight() * dpScale));
            } else {
                this.f41470F.set(0, 0, (int) (m50765y.getWidth() * dpScale), (int) (m50765y.getHeight() * dpScale));
            }
            canvas.drawBitmap(m50765y, this.f41469E, this.f41470F, this.f41468D);
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        if (this.f41471G != null) {
            float dpScale = Utils.dpScale();
            rectF.set(0.0f, 0.0f, this.f41471G.getWidth() * dpScale, this.f41471G.getHeight() * dpScale);
            this.f41445o.mapRect(rectF);
        }
    }

    /* renamed from: y */
    public final Bitmap m50765y() {
        Bitmap bitmap;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41473I;
        if (baseKeyframeAnimation != null && (bitmap = (Bitmap) baseKeyframeAnimation.getValue()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.f41446p.getBitmapForId(this.f41447q.getRefId());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        LottieImageAsset lottieImageAsset = this.f41471G;
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }
}