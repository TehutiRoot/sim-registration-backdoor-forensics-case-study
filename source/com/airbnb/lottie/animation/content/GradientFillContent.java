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
import com.airbnb.lottie.C5655L;
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
    public final String f41064a;

    /* renamed from: b */
    public final boolean f41065b;

    /* renamed from: c */
    public final BaseLayer f41066c;

    /* renamed from: d */
    public final LongSparseArray f41067d = new LongSparseArray();

    /* renamed from: e */
    public final LongSparseArray f41068e = new LongSparseArray();

    /* renamed from: f */
    public final Path f41069f;

    /* renamed from: g */
    public final Paint f41070g;

    /* renamed from: h */
    public final RectF f41071h;

    /* renamed from: i */
    public final List f41072i;

    /* renamed from: j */
    public final GradientType f41073j;

    /* renamed from: k */
    public final BaseKeyframeAnimation f41074k;

    /* renamed from: l */
    public final BaseKeyframeAnimation f41075l;

    /* renamed from: m */
    public final BaseKeyframeAnimation f41076m;

    /* renamed from: n */
    public final BaseKeyframeAnimation f41077n;

    /* renamed from: o */
    public BaseKeyframeAnimation f41078o;

    /* renamed from: p */
    public ValueCallbackKeyframeAnimation f41079p;

    /* renamed from: q */
    public final LottieDrawable f41080q;

    /* renamed from: r */
    public final int f41081r;

    /* renamed from: s */
    public BaseKeyframeAnimation f41082s;

    /* renamed from: t */
    public float f41083t;

    /* renamed from: u */
    public DropShadowKeyframeAnimation f41084u;

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f41069f = path;
        this.f41070g = new LPaint(1);
        this.f41071h = new RectF();
        this.f41072i = new ArrayList();
        this.f41083t = 0.0f;
        this.f41066c = baseLayer;
        this.f41064a = gradientFill.getName();
        this.f41065b = gradientFill.isHidden();
        this.f41080q = lottieDrawable;
        this.f41073j = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.f41081r = (int) (lottieComposition.getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.f41074k = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.f41075l = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.f41076m = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        BaseKeyframeAnimation<PointF, PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.f41077n = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation5 = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f41082s = createAnimation5;
            createAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.f41082s);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f41084u = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    /* renamed from: a */
    private int[] m50897a(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f41079p;
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
    private int m50896b() {
        int i;
        int round = Math.round(this.f41076m.getProgress() * this.f41081r);
        int round2 = Math.round(this.f41077n.getProgress() * this.f41081r);
        int round3 = Math.round(this.f41074k.getProgress() * this.f41081r);
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
    private LinearGradient m50895c() {
        long m50896b = m50896b();
        LinearGradient linearGradient = (LinearGradient) this.f41067d.get(m50896b);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f41076m.getValue();
        PointF pointF2 = (PointF) this.f41077n.getValue();
        GradientColor gradientColor = (GradientColor) this.f41074k.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m50897a(gradientColor.getColors()), gradientColor.getPositions(), Shader.TileMode.CLAMP);
        this.f41067d.put(m50896b, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m50894d() {
        float f;
        long m50896b = m50896b();
        RadialGradient radialGradient = (RadialGradient) this.f41068e.get(m50896b);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f41076m.getValue();
        PointF pointF2 = (PointF) this.f41077n.getValue();
        GradientColor gradientColor = (GradientColor) this.f41074k.getValue();
        int[] m50897a = m50897a(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        float f2 = pointF.x;
        float f3 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f2, pointF2.y - f3);
        if (hypot <= 0.0f) {
            f = 0.001f;
        } else {
            f = hypot;
        }
        RadialGradient radialGradient2 = new RadialGradient(f2, f3, f, m50897a, positions, Shader.TileMode.CLAMP);
        this.f41068e.put(m50896b, radialGradient2);
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
            this.f41075l.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41078o;
            if (baseKeyframeAnimation != null) {
                this.f41066c.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41078o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41078o = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.f41066c.addAnimation(this.f41078o);
        } else if (t == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.f41079p;
            if (valueCallbackKeyframeAnimation2 != null) {
                this.f41066c.removeAnimation(valueCallbackKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.f41079p = null;
                return;
            }
            this.f41067d.clear();
            this.f41068e.clear();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41079p = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.f41066c.addAnimation(this.f41079p);
        } else if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41082s;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41082s = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            this.f41066c.addAnimation(this.f41082s);
        } else if (t == LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.f41084u) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.f41084u) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.f41084u) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.f41084u) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_RADIUS && (dropShadowKeyframeAnimation = this.f41084u) != null) {
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader m50894d;
        if (this.f41065b) {
            return;
        }
        C5655L.beginSection("GradientFillContent#draw");
        this.f41069f.reset();
        for (int i2 = 0; i2 < this.f41072i.size(); i2++) {
            this.f41069f.addPath(((InterfaceC18435Sh1) this.f41072i.get(i2)).getPath(), matrix);
        }
        this.f41069f.computeBounds(this.f41071h, false);
        if (this.f41073j == GradientType.LINEAR) {
            m50894d = m50895c();
        } else {
            m50894d = m50894d();
        }
        m50894d.setLocalMatrix(matrix);
        this.f41070g.setShader(m50894d);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41078o;
        if (baseKeyframeAnimation != null) {
            this.f41070g.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41082s;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.f41070g.setMaskFilter(null);
            } else if (floatValue != this.f41083t) {
                this.f41070g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f41083t = floatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f41084u;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(this.f41070g);
        }
        this.f41070g.setAlpha(MiscUtils.clamp((int) ((((i / 255.0f) * ((Integer) this.f41075l.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f41069f, this.f41070g);
        C5655L.endSection("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41069f.reset();
        for (int i = 0; i < this.f41072i.size(); i++) {
            this.f41069f.addPath(((InterfaceC18435Sh1) this.f41072i.get(i)).getPath(), matrix);
        }
        this.f41069f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41064a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41080q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof InterfaceC18435Sh1) {
                this.f41072i.add((InterfaceC18435Sh1) content);
            }
        }
    }
}
