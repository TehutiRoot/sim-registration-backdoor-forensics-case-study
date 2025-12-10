package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final Path f41063a;

    /* renamed from: b */
    public final Paint f41064b;

    /* renamed from: c */
    public final BaseLayer f41065c;

    /* renamed from: d */
    public final String f41066d;

    /* renamed from: e */
    public final boolean f41067e;

    /* renamed from: f */
    public final List f41068f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41069g;

    /* renamed from: h */
    public final BaseKeyframeAnimation f41070h;

    /* renamed from: i */
    public BaseKeyframeAnimation f41071i;

    /* renamed from: j */
    public final LottieDrawable f41072j;

    /* renamed from: k */
    public BaseKeyframeAnimation f41073k;

    /* renamed from: l */
    public float f41074l;

    /* renamed from: m */
    public DropShadowKeyframeAnimation f41075m;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path = new Path();
        this.f41063a = path;
        this.f41064b = new LPaint(1);
        this.f41068f = new ArrayList();
        this.f41065c = baseLayer;
        this.f41066d = shapeFill.getName();
        this.f41067e = shapeFill.isHidden();
        this.f41072j = lottieDrawable;
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f41073k = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f41073k);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f41075m = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
        if (shapeFill.getColor() != null && shapeFill.getOpacity() != null) {
            path.setFillType(shapeFill.getFillType());
            BaseKeyframeAnimation<Integer, Integer> createAnimation2 = shapeFill.getColor().createAnimation();
            this.f41069g = createAnimation2;
            createAnimation2.addUpdateListener(this);
            baseLayer.addAnimation(createAnimation2);
            BaseKeyframeAnimation<Integer, Integer> createAnimation3 = shapeFill.getOpacity().createAnimation();
            this.f41070h = createAnimation3;
            createAnimation3.addUpdateListener(this);
            baseLayer.addAnimation(createAnimation3);
            return;
        }
        this.f41069g = null;
        this.f41070h = null;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        if (t == LottieProperty.COLOR) {
            this.f41069g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.OPACITY) {
            this.f41070h.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41071i;
            if (baseKeyframeAnimation != null) {
                this.f41065c.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41071i = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41071i = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.f41065c.addAnimation(this.f41071i);
        } else if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41073k;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41073k = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.f41065c.addAnimation(this.f41073k);
        } else if (t == LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.f41075m) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.f41075m) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.f41075m) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.f41075m) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_RADIUS && (dropShadowKeyframeAnimation = this.f41075m) != null) {
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f41067e) {
            return;
        }
        C5644L.beginSection("FillContent#draw");
        this.f41064b.setColor((MiscUtils.clamp((int) ((((i / 255.0f) * ((Integer) this.f41070h.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((ColorKeyframeAnimation) this.f41069g).getIntValue() & ViewCompat.MEASURED_SIZE_MASK));
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41071i;
        if (baseKeyframeAnimation != null) {
            this.f41064b.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41073k;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.f41064b.setMaskFilter(null);
            } else if (floatValue != this.f41074l) {
                this.f41064b.setMaskFilter(this.f41065c.getBlurMaskFilter(floatValue));
            }
            this.f41074l = floatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f41075m;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(this.f41064b);
        }
        this.f41063a.reset();
        for (int i2 = 0; i2 < this.f41068f.size(); i2++) {
            this.f41063a.addPath(((InterfaceC18284Pi1) this.f41068f.get(i2)).getPath(), matrix);
        }
        canvas.drawPath(this.f41063a, this.f41064b);
        C5644L.endSection("FillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41063a.reset();
        for (int i = 0; i < this.f41068f.size(); i++) {
            this.f41063a.addPath(((InterfaceC18284Pi1) this.f41068f.get(i)).getPath(), matrix);
        }
        this.f41063a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41066d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41072j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof InterfaceC18284Pi1) {
                this.f41068f.add((InterfaceC18284Pi1) content);
            }
        }
    }
}