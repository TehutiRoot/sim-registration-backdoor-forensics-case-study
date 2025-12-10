package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes3.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a */
    public final BaseKeyframeAnimation.AnimationListener f41175a;

    /* renamed from: b */
    public final BaseKeyframeAnimation f41176b;

    /* renamed from: c */
    public final BaseKeyframeAnimation f41177c;

    /* renamed from: d */
    public final BaseKeyframeAnimation f41178d;

    /* renamed from: e */
    public final BaseKeyframeAnimation f41179e;

    /* renamed from: f */
    public final BaseKeyframeAnimation f41180f;

    /* renamed from: g */
    public boolean f41181g = true;

    /* renamed from: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation$a */
    /* loaded from: classes3.dex */
    public class C5689a extends LottieValueCallback {

        /* renamed from: c */
        public final /* synthetic */ LottieValueCallback f41182c;

        public C5689a(LottieValueCallback lottieValueCallback) {
            this.f41182c = lottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public Float getValue(LottieFrameInfo lottieFrameInfo) {
            Float f = (Float) this.f41182c.getValue(lottieFrameInfo);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.f41175a = animationListener;
        BaseKeyframeAnimation<Integer, Integer> createAnimation = dropShadowEffect.getColor().createAnimation();
        this.f41176b = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Float, Float> createAnimation2 = dropShadowEffect.getOpacity().createAnimation();
        this.f41177c = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<Float, Float> createAnimation3 = dropShadowEffect.getDirection().createAnimation();
        this.f41178d = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        BaseKeyframeAnimation<Float, Float> createAnimation4 = dropShadowEffect.getDistance().createAnimation();
        this.f41179e = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        BaseKeyframeAnimation<Float, Float> createAnimation5 = dropShadowEffect.getRadius().createAnimation();
        this.f41180f = createAnimation5;
        createAnimation5.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation5);
    }

    public void applyTo(Paint paint) {
        if (!this.f41181g) {
            return;
        }
        this.f41181g = false;
        double floatValue = ((Float) this.f41178d.getValue()).floatValue() * 0.017453292519943295d;
        float floatValue2 = ((Float) this.f41179e.getValue()).floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.f41176b.getValue()).intValue();
        paint.setShadowLayer(((Float) this.f41180f.getValue()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f41177c.getValue()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41181g = true;
        this.f41175a.onValueChanged();
    }

    public void setColorCallback(@Nullable LottieValueCallback<Integer> lottieValueCallback) {
        this.f41176b.setValueCallback(lottieValueCallback);
    }

    public void setDirectionCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f41178d.setValueCallback(lottieValueCallback);
    }

    public void setDistanceCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f41179e.setValueCallback(lottieValueCallback);
    }

    public void setOpacityCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        if (lottieValueCallback == null) {
            this.f41177c.setValueCallback(null);
        } else {
            this.f41177c.setValueCallback(new C5689a(lottieValueCallback));
        }
    }

    public void setRadiusCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f41180f.setValueCallback(lottieValueCallback);
    }
}
