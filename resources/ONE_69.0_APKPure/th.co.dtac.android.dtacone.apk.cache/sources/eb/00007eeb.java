package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final String f41076a;

    /* renamed from: b */
    public final boolean f41077b;

    /* renamed from: c */
    public final BaseLayer f41078c;

    /* renamed from: d */
    public final LongSparseArray f41079d = new LongSparseArray();

    /* renamed from: e */
    public final LongSparseArray f41080e = new LongSparseArray();

    /* renamed from: f */
    public final Path f41081f;

    /* renamed from: g */
    public final Paint f41082g;

    /* renamed from: h */
    public final RectF f41083h;

    /* renamed from: i */
    public final List f41084i;

    /* renamed from: j */
    public final GradientType f41085j;

    /* renamed from: k */
    public final BaseKeyframeAnimation f41086k;

    /* renamed from: l */
    public final BaseKeyframeAnimation f41087l;

    /* renamed from: m */
    public final BaseKeyframeAnimation f41088m;

    /* renamed from: n */
    public final BaseKeyframeAnimation f41089n;

    /* renamed from: o */
    public BaseKeyframeAnimation f41090o;

    /* renamed from: p */
    public ValueCallbackKeyframeAnimation f41091p;

    /* renamed from: q */
    public final LottieDrawable f41092q;

    /* renamed from: r */
    public final int f41093r;

    /* renamed from: s */
    public BaseKeyframeAnimation f41094s;

    /* renamed from: t */
    public float f41095t;

    /* renamed from: u */
    public DropShadowKeyframeAnimation f41096u;

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f41081f = path;
        this.f41082g = new LPaint(1);
        this.f41083h = new RectF();
        this.f41084i = new ArrayList();
        this.f41095t = 0.0f;
        this.f41078c = baseLayer;
        this.f41076a = gradientFill.getName();
        this.f41077b = gradientFill.isHidden();
        this.f41092q = lottieDrawable;
        this.f41085j = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.f41093r = (int) (lottieComposition.getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.f41086k = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.f41087l = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.f41088m = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        BaseKeyframeAnimation<PointF, PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.f41089n = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation5 = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f41094s = createAnimation5;
            createAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.f41094s);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f41096u = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    /* renamed from: a */
    private int[] m50894a(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41091p;
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

    /* renamed from: b */
    private int m50893b() {
        int i;
        int round = Math.round(this.f41088m.getProgress() * this.f41093r);
        int round2 = Math.round(this.f41089n.getProgress() * this.f41093r);
        int round3 = Math.round(this.f41086k.getProgress() * this.f41093r);
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

    /* renamed from: c */
    private LinearGradient m50892c() {
        long m50893b = m50893b();
        LinearGradient linearGradient = (LinearGradient) this.f41079d.get(m50893b);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f41088m.getValue();
        PointF pointF2 = (PointF) this.f41089n.getValue();
        GradientColor gradientColor = (GradientColor) this.f41086k.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m50894a(gradientColor.getColors()), gradientColor.getPositions(), Shader.TileMode.CLAMP);
        this.f41079d.put(m50893b, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m50891d() {
        float f;
        long m50893b = m50893b();
        RadialGradient radialGradient = (RadialGradient) this.f41080e.get(m50893b);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f41088m.getValue();
        PointF pointF2 = (PointF) this.f41089n.getValue();
        GradientColor gradientColor = (GradientColor) this.f41086k.getValue();
        int[] m50894a = m50894a(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        float f2 = pointF.x;
        float f3 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f2, pointF2.y - f3);
        if (hypot <= 0.0f) {
            f = 0.001f;
        } else {
            f = hypot;
        }
        RadialGradient radialGradient2 = new RadialGradient(f2, f3, f, m50894a, positions, Shader.TileMode.CLAMP);
        this.f41080e.put(m50893b, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        if (t == LottieProperty.OPACITY) {
            this.f41087l.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41090o;
            if (baseKeyframeAnimation != null) {
                this.f41078c.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41090o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41090o = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.f41078c.addAnimation(this.f41090o);
        } else if (t == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.f41091p;
            if (valueCallbackKeyframeAnimation2 != null) {
                this.f41078c.removeAnimation(valueCallbackKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.f41091p = null;
                return;
            }
            this.f41079d.clear();
            this.f41080e.clear();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41091p = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.f41078c.addAnimation(this.f41091p);
        } else if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41094s;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41094s = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            this.f41078c.addAnimation(this.f41094s);
        } else if (t == LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.f41096u) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.f41096u) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.f41096u) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.f41096u) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_RADIUS && (dropShadowKeyframeAnimation = this.f41096u) != null) {
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader m50891d;
        if (this.f41077b) {
            return;
        }
        C5644L.beginSection("GradientFillContent#draw");
        this.f41081f.reset();
        for (int i2 = 0; i2 < this.f41084i.size(); i2++) {
            this.f41081f.addPath(((InterfaceC18284Pi1) this.f41084i.get(i2)).getPath(), matrix);
        }
        this.f41081f.computeBounds(this.f41083h, false);
        if (this.f41085j == GradientType.LINEAR) {
            m50891d = m50892c();
        } else {
            m50891d = m50891d();
        }
        m50891d.setLocalMatrix(matrix);
        this.f41082g.setShader(m50891d);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41090o;
        if (baseKeyframeAnimation != null) {
            this.f41082g.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41094s;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.f41082g.setMaskFilter(null);
            } else if (floatValue != this.f41095t) {
                this.f41082g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f41095t = floatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f41096u;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(this.f41082g);
        }
        this.f41082g.setAlpha(MiscUtils.clamp((int) ((((i / 255.0f) * ((Integer) this.f41087l.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f41081f, this.f41082g);
        C5644L.endSection("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41081f.reset();
        for (int i = 0; i < this.f41084i.size(); i++) {
            this.f41081f.addPath(((InterfaceC18284Pi1) this.f41084i.get(i)).getPath(), matrix);
        }
        this.f41081f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41076a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41092q.invalidateSelf();
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
                this.f41084i.add((InterfaceC18284Pi1) content);
            }
        }
    }
}