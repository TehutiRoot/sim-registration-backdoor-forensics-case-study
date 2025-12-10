package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.Collections;

/* loaded from: classes3.dex */
public class TransformKeyframeAnimation {

    /* renamed from: a */
    public final Matrix f41207a = new Matrix();

    /* renamed from: b */
    public final Matrix f41208b;

    /* renamed from: c */
    public final Matrix f41209c;

    /* renamed from: d */
    public final Matrix f41210d;

    /* renamed from: e */
    public final float[] f41211e;

    /* renamed from: f */
    public BaseKeyframeAnimation f41212f;

    /* renamed from: g */
    public BaseKeyframeAnimation f41213g;

    /* renamed from: h */
    public BaseKeyframeAnimation f41214h;

    /* renamed from: i */
    public BaseKeyframeAnimation f41215i;

    /* renamed from: j */
    public BaseKeyframeAnimation f41216j;

    /* renamed from: k */
    public FloatKeyframeAnimation f41217k;

    /* renamed from: l */
    public FloatKeyframeAnimation f41218l;

    /* renamed from: m */
    public BaseKeyframeAnimation f41219m;

    /* renamed from: n */
    public BaseKeyframeAnimation f41220n;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        BaseKeyframeAnimation<PointF, PointF> createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2;
        BaseKeyframeAnimation<ScaleXY, ScaleXY> createAnimation3;
        BaseKeyframeAnimation<Float, Float> createAnimation4;
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        if (animatableTransform.getAnchorPoint() == null) {
            createAnimation = null;
        } else {
            createAnimation = animatableTransform.getAnchorPoint().createAnimation();
        }
        this.f41212f = createAnimation;
        if (animatableTransform.getPosition() == null) {
            createAnimation2 = null;
        } else {
            createAnimation2 = animatableTransform.getPosition().createAnimation();
        }
        this.f41213g = createAnimation2;
        if (animatableTransform.getScale() == null) {
            createAnimation3 = null;
        } else {
            createAnimation3 = animatableTransform.getScale().createAnimation();
        }
        this.f41214h = createAnimation3;
        if (animatableTransform.getRotation() == null) {
            createAnimation4 = null;
        } else {
            createAnimation4 = animatableTransform.getRotation().createAnimation();
        }
        this.f41215i = createAnimation4;
        if (animatableTransform.getSkew() == null) {
            floatKeyframeAnimation = null;
        } else {
            floatKeyframeAnimation = (FloatKeyframeAnimation) animatableTransform.getSkew().createAnimation();
        }
        this.f41217k = floatKeyframeAnimation;
        if (floatKeyframeAnimation != null) {
            this.f41208b = new Matrix();
            this.f41209c = new Matrix();
            this.f41210d = new Matrix();
            this.f41211e = new float[9];
        } else {
            this.f41208b = null;
            this.f41209c = null;
            this.f41210d = null;
            this.f41211e = null;
        }
        if (animatableTransform.getSkewAngle() == null) {
            floatKeyframeAnimation2 = null;
        } else {
            floatKeyframeAnimation2 = (FloatKeyframeAnimation) animatableTransform.getSkewAngle().createAnimation();
        }
        this.f41218l = floatKeyframeAnimation2;
        if (animatableTransform.getOpacity() != null) {
            this.f41216j = animatableTransform.getOpacity().createAnimation();
        }
        if (animatableTransform.getStartOpacity() != null) {
            this.f41219m = animatableTransform.getStartOpacity().createAnimation();
        } else {
            this.f41219m = null;
        }
        if (animatableTransform.getEndOpacity() != null) {
            this.f41220n = animatableTransform.getEndOpacity().createAnimation();
        } else {
            this.f41220n = null;
        }
    }

    /* renamed from: a */
    public final void m50860a() {
        for (int i = 0; i < 9; i++) {
            this.f41211e[i] = 0.0f;
        }
    }

    public void addAnimationsToLayer(BaseLayer baseLayer) {
        baseLayer.addAnimation(this.f41216j);
        baseLayer.addAnimation(this.f41219m);
        baseLayer.addAnimation(this.f41220n);
        baseLayer.addAnimation(this.f41212f);
        baseLayer.addAnimation(this.f41213g);
        baseLayer.addAnimation(this.f41214h);
        baseLayer.addAnimation(this.f41215i);
        baseLayer.addAnimation(this.f41217k);
        baseLayer.addAnimation(this.f41218l);
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41216j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41219m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41220n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41212f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.f41213g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.f41214h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = this.f41215i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f41217k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f41218l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.addUpdateListener(animationListener);
        }
    }

    public <T> boolean applyValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.TRANSFORM_ANCHOR_POINT) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.f41212f;
            if (baseKeyframeAnimation == null) {
                this.f41212f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
            return true;
        } else if (t == LottieProperty.TRANSFORM_POSITION) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41213g;
            if (baseKeyframeAnimation2 == null) {
                this.f41213g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return true;
        } else {
            if (t == LottieProperty.TRANSFORM_POSITION_X) {
                BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41213g;
                if (baseKeyframeAnimation3 instanceof SplitDimensionPathKeyframeAnimation) {
                    ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3).setXValueCallback(lottieValueCallback);
                    return true;
                }
            }
            if (t == LottieProperty.TRANSFORM_POSITION_Y) {
                BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41213g;
                if (baseKeyframeAnimation4 instanceof SplitDimensionPathKeyframeAnimation) {
                    ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4).setYValueCallback(lottieValueCallback);
                    return true;
                }
            }
            if (t == LottieProperty.TRANSFORM_SCALE) {
                BaseKeyframeAnimation baseKeyframeAnimation5 = this.f41214h;
                if (baseKeyframeAnimation5 == null) {
                    this.f41214h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                    return true;
                }
                baseKeyframeAnimation5.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_ROTATION) {
                BaseKeyframeAnimation baseKeyframeAnimation6 = this.f41215i;
                if (baseKeyframeAnimation6 == null) {
                    this.f41215i = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(0.0f));
                    return true;
                }
                baseKeyframeAnimation6.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_OPACITY) {
                BaseKeyframeAnimation baseKeyframeAnimation7 = this.f41216j;
                if (baseKeyframeAnimation7 == null) {
                    this.f41216j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                    return true;
                }
                baseKeyframeAnimation7.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_START_OPACITY) {
                BaseKeyframeAnimation baseKeyframeAnimation8 = this.f41219m;
                if (baseKeyframeAnimation8 == null) {
                    this.f41219m = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                    return true;
                }
                baseKeyframeAnimation8.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_END_OPACITY) {
                BaseKeyframeAnimation baseKeyframeAnimation9 = this.f41220n;
                if (baseKeyframeAnimation9 == null) {
                    this.f41220n = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                    return true;
                }
                baseKeyframeAnimation9.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_SKEW) {
                if (this.f41217k == null) {
                    this.f41217k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
                }
                this.f41217k.setValueCallback(lottieValueCallback);
                return true;
            } else if (t == LottieProperty.TRANSFORM_SKEW_ANGLE) {
                if (this.f41218l == null) {
                    this.f41218l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
                }
                this.f41218l.setValueCallback(lottieValueCallback);
                return true;
            } else {
                return false;
            }
        }
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getEndOpacity() {
        return this.f41220n;
    }

    public Matrix getMatrix() {
        PointF pointF;
        float cos;
        float sin;
        float floatValue;
        PointF pointF2;
        this.f41207a.reset();
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41213g;
        if (baseKeyframeAnimation != null && (pointF2 = (PointF) baseKeyframeAnimation.getValue()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                this.f41207a.preTranslate(f, pointF2.y);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41215i;
        if (baseKeyframeAnimation2 != null) {
            if (baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation) {
                floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            } else {
                floatValue = ((FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
            }
            if (floatValue != 0.0f) {
                this.f41207a.preRotate(floatValue);
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f41217k;
        if (floatKeyframeAnimation != null) {
            FloatKeyframeAnimation floatKeyframeAnimation2 = this.f41218l;
            if (floatKeyframeAnimation2 == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-floatKeyframeAnimation2.getFloatValue()) + 90.0f));
            }
            FloatKeyframeAnimation floatKeyframeAnimation3 = this.f41218l;
            if (floatKeyframeAnimation3 == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-floatKeyframeAnimation3.getFloatValue()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(floatKeyframeAnimation.getFloatValue()));
            m50860a();
            float[] fArr = this.f41211e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f41208b.setValues(fArr);
            m50860a();
            float[] fArr2 = this.f41211e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f41209c.setValues(fArr2);
            m50860a();
            float[] fArr3 = this.f41211e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f41210d.setValues(fArr3);
            this.f41209c.preConcat(this.f41208b);
            this.f41210d.preConcat(this.f41209c);
            this.f41207a.preConcat(this.f41210d);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41214h;
        if (baseKeyframeAnimation3 != null) {
            ScaleXY scaleXY = (ScaleXY) baseKeyframeAnimation3.getValue();
            if (scaleXY.getScaleX() != 1.0f || scaleXY.getScaleY() != 1.0f) {
                this.f41207a.preScale(scaleXY.getScaleX(), scaleXY.getScaleY());
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41212f;
        if (baseKeyframeAnimation4 != null && (((pointF = (PointF) baseKeyframeAnimation4.getValue()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            this.f41207a.preTranslate(-pointF.x, -pointF.y);
        }
        return this.f41207a;
    }

    public Matrix getMatrixForRepeater(float f) {
        PointF pointF;
        ScaleXY scaleXY;
        float f2;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41213g;
        PointF pointF2 = null;
        if (baseKeyframeAnimation == null) {
            pointF = null;
        } else {
            pointF = (PointF) baseKeyframeAnimation.getValue();
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41214h;
        if (baseKeyframeAnimation2 == null) {
            scaleXY = null;
        } else {
            scaleXY = (ScaleXY) baseKeyframeAnimation2.getValue();
        }
        this.f41207a.reset();
        if (pointF != null) {
            this.f41207a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (scaleXY != null) {
            double d = f;
            this.f41207a.preScale((float) Math.pow(scaleXY.getScaleX(), d), (float) Math.pow(scaleXY.getScaleY(), d));
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41215i;
        if (baseKeyframeAnimation3 != null) {
            float floatValue = ((Float) baseKeyframeAnimation3.getValue()).floatValue();
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41212f;
            if (baseKeyframeAnimation4 != null) {
                pointF2 = (PointF) baseKeyframeAnimation4.getValue();
            }
            Matrix matrix = this.f41207a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f41207a;
    }

    @Nullable
    public BaseKeyframeAnimation<?, Integer> getOpacity() {
        return this.f41216j;
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getStartOpacity() {
        return this.f41219m;
    }

    public void setProgress(float f) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41216j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41219m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41220n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41212f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.f41213g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.f41214h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.setProgress(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = this.f41215i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f41217k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f41218l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.setProgress(f);
        }
    }
}
