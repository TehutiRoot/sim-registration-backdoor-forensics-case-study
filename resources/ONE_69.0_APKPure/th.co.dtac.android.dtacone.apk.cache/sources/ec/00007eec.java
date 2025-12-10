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
    public ValueCallbackKeyframeAnimation f41097A;

    /* renamed from: q */
    public final String f41098q;

    /* renamed from: r */
    public final boolean f41099r;

    /* renamed from: s */
    public final LongSparseArray f41100s;

    /* renamed from: t */
    public final LongSparseArray f41101t;

    /* renamed from: u */
    public final RectF f41102u;

    /* renamed from: v */
    public final GradientType f41103v;

    /* renamed from: w */
    public final int f41104w;

    /* renamed from: x */
    public final BaseKeyframeAnimation f41105x;

    /* renamed from: y */
    public final BaseKeyframeAnimation f41106y;

    /* renamed from: z */
    public final BaseKeyframeAnimation f41107z;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.f41100s = new LongSparseArray();
        this.f41101t = new LongSparseArray();
        this.f41102u = new RectF();
        this.f41098q = gradientStroke.getName();
        this.f41103v = gradientStroke.getGradientType();
        this.f41099r = gradientStroke.isHidden();
        this.f41104w = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientStroke.getGradientColor().createAnimation();
        this.f41105x = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.f41106y = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.f41107z = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41097A;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41097A = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41097A = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.f41097A);
        }
    }

    /* renamed from: c */
    public final int[] m50890c(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41097A;
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
    public final int m50889d() {
        int i;
        int round = Math.round(this.f41106y.getProgress() * this.f41104w);
        int round2 = Math.round(this.f41107z.getProgress() * this.f41104w);
        int round3 = Math.round(this.f41105x.getProgress() * this.f41104w);
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
        Shader m50887f;
        if (this.f41099r) {
            return;
        }
        getBounds(this.f41102u, matrix, false);
        if (this.f41103v == GradientType.LINEAR) {
            m50887f = m50888e();
        } else {
            m50887f = m50887f();
        }
        m50887f.setLocalMatrix(matrix);
        this.f41032h.setShader(m50887f);
        super.draw(canvas, matrix, i);
    }

    /* renamed from: e */
    public final LinearGradient m50888e() {
        long m50889d = m50889d();
        LinearGradient linearGradient = (LinearGradient) this.f41100s.get(m50889d);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f41106y.getValue();
        PointF pointF2 = (PointF) this.f41107z.getValue();
        GradientColor gradientColor = (GradientColor) this.f41105x.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m50890c(gradientColor.getColors()), gradientColor.getPositions(), Shader.TileMode.CLAMP);
        this.f41100s.put(m50889d, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: f */
    public final RadialGradient m50887f() {
        float f;
        float f2;
        long m50889d = m50889d();
        RadialGradient radialGradient = (RadialGradient) this.f41101t.get(m50889d);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f41106y.getValue();
        PointF pointF2 = (PointF) this.f41107z.getValue();
        GradientColor gradientColor = (GradientColor) this.f41105x.getValue();
        int[] m50890c = m50890c(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - f, pointF2.y - f2), m50890c, positions, Shader.TileMode.CLAMP);
        this.f41101t.put(m50889d, radialGradient2);
        return radialGradient2;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41098q;
    }
}