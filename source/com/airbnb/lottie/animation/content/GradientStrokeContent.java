package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes3.dex */
public class GradientStrokeContent extends BaseStrokeContent {

    /* renamed from: A */
    public ValueCallbackKeyframeAnimation f41085A;

    /* renamed from: q */
    public final String f41086q;

    /* renamed from: r */
    public final boolean f41087r;

    /* renamed from: s */
    public final LongSparseArray f41088s;

    /* renamed from: t */
    public final LongSparseArray f41089t;

    /* renamed from: u */
    public final RectF f41090u;

    /* renamed from: v */
    public final GradientType f41091v;

    /* renamed from: w */
    public final int f41092w;

    /* renamed from: x */
    public final BaseKeyframeAnimation f41093x;

    /* renamed from: y */
    public final BaseKeyframeAnimation f41094y;

    /* renamed from: z */
    public final BaseKeyframeAnimation f41095z;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.f41088s = new LongSparseArray();
        this.f41089t = new LongSparseArray();
        this.f41090u = new RectF();
        this.f41086q = gradientStroke.getName();
        this.f41091v = gradientStroke.getGradientType();
        this.f41087r = gradientStroke.isHidden();
        this.f41092w = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientStroke.getGradientColor().createAnimation();
        this.f41093x = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.f41094y = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.f41095z = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41085A;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41085A = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41085A = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.f41085A);
        }
    }

    /* renamed from: c */
    public final int[] m50893c(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41085A;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public final int m50892d() {
        int i;
        int round = Math.round(this.f41094y.getProgress() * this.f41092w);
        int round2 = Math.round(this.f41095z.getProgress() * this.f41092w);
        int round3 = Math.round(this.f41093x.getProgress() * this.f41092w);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader m50890f;
        if (this.f41087r) {
            return;
        }
        getBounds(this.f41090u, matrix, false);
        if (this.f41091v == GradientType.LINEAR) {
            m50890f = m50891e();
        } else {
            m50890f = m50890f();
        }
        m50890f.setLocalMatrix(matrix);
        this.f41020h.setShader(m50890f);
        super.draw(canvas, matrix, i);
    }

    /* renamed from: e */
    public final LinearGradient m50891e() {
        long m50892d = m50892d();
        LinearGradient linearGradient = (LinearGradient) this.f41088s.get(m50892d);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f41094y.getValue();
        PointF pointF2 = (PointF) this.f41095z.getValue();
        GradientColor gradientColor = (GradientColor) this.f41093x.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m50893c(gradientColor.getColors()), gradientColor.getPositions(), Shader.TileMode.CLAMP);
        this.f41088s.put(m50892d, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: f */
    public final RadialGradient m50890f() {
        float f;
        float f2;
        long m50892d = m50892d();
        RadialGradient radialGradient = (RadialGradient) this.f41089t.get(m50892d);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f41094y.getValue();
        PointF pointF2 = (PointF) this.f41095z.getValue();
        GradientColor gradientColor = (GradientColor) this.f41093x.getValue();
        int[] m50893c = m50893c(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - f, pointF2.y - f2), m50893c, positions, Shader.TileMode.CLAMP);
        this.f41089t.put(m50892d, radialGradient2);
        return radialGradient2;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41086q;
    }
}
