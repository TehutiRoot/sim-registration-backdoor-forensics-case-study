package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {

    /* renamed from: e */
    public final LottieDrawable f41029e;

    /* renamed from: g */
    public final float[] f41031g;

    /* renamed from: h */
    public final Paint f41032h;

    /* renamed from: i */
    public final BaseKeyframeAnimation f41033i;

    /* renamed from: j */
    public final BaseKeyframeAnimation f41034j;

    /* renamed from: k */
    public final List f41035k;

    /* renamed from: l */
    public final BaseKeyframeAnimation f41036l;
    protected final BaseLayer layer;

    /* renamed from: m */
    public BaseKeyframeAnimation f41037m;

    /* renamed from: n */
    public BaseKeyframeAnimation f41038n;

    /* renamed from: o */
    public float f41039o;

    /* renamed from: p */
    public DropShadowKeyframeAnimation f41040p;

    /* renamed from: a */
    public final PathMeasure f41025a = new PathMeasure();

    /* renamed from: b */
    public final Path f41026b = new Path();

    /* renamed from: c */
    public final Path f41027c = new Path();

    /* renamed from: d */
    public final RectF f41028d = new RectF();

    /* renamed from: f */
    public final List f41030f = new ArrayList();

    /* renamed from: com.airbnb.lottie.animation.content.BaseStrokeContent$b */
    /* loaded from: classes3.dex */
    public static final class C5670b {

        /* renamed from: a */
        public final List f41041a;

        /* renamed from: b */
        public final TrimPathContent f41042b;

        public C5670b(TrimPathContent trimPathContent) {
            this.f41041a = new ArrayList();
            this.f41042b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f41032h = lPaint;
        this.f41039o = 0.0f;
        this.f41029e = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.f41034j = animatableIntegerValue.createAnimation();
        this.f41033i = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.f41036l = null;
        } else {
            this.f41036l = animatableFloatValue2.createAnimation();
        }
        this.f41035k = new ArrayList(list.size());
        this.f41031g = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f41035k.add(((AnimatableFloatValue) list.get(i)).createAnimation());
        }
        baseLayer.addAnimation(this.f41034j);
        baseLayer.addAnimation(this.f41033i);
        for (int i2 = 0; i2 < this.f41035k.size(); i2++) {
            baseLayer.addAnimation((BaseKeyframeAnimation) this.f41035k.get(i2));
        }
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41036l;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.f41034j.addUpdateListener(this);
        this.f41033i.addUpdateListener(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((BaseKeyframeAnimation) this.f41035k.get(i3)).addUpdateListener(this);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41036l;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f41038n = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f41038n);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f41040p = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    /* renamed from: a */
    public final void m50905a(Matrix matrix) {
        float floatValue;
        C5644L.beginSection("StrokeContent#applyDashPattern");
        if (this.f41035k.isEmpty()) {
            C5644L.endSection("StrokeContent#applyDashPattern");
            return;
        }
        float scale = Utils.getScale(matrix);
        for (int i = 0; i < this.f41035k.size(); i++) {
            this.f41031g[i] = ((Float) ((BaseKeyframeAnimation) this.f41035k.get(i)).getValue()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f41031g;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f41031g;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f41031g;
            fArr3[i] = fArr3[i] * scale;
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41036l;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0f;
        } else {
            floatValue = scale * ((Float) baseKeyframeAnimation.getValue()).floatValue();
        }
        this.f41032h.setPathEffect(new DashPathEffect(this.f41031g, floatValue));
        C5644L.endSection("StrokeContent#applyDashPattern");
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        if (t == LottieProperty.OPACITY) {
            this.f41034j.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.STROKE_WIDTH) {
            this.f41033i.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41037m;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41037m = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41037m = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.f41037m);
        } else if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41038n;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41038n = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.f41038n);
        } else if (t == LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.f41040p) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.f41040p) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.f41040p) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.f41040p) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_RADIUS && (dropShadowKeyframeAnimation = this.f41040p) != null) {
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    /* renamed from: b */
    public final void m50904b(Canvas canvas, C5670b c5670b, Matrix matrix) {
        float f;
        float f2;
        float f3;
        C5644L.beginSection("StrokeContent#applyTrimPath");
        if (c5670b.f41042b == null) {
            C5644L.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.f41026b.reset();
        for (int size = c5670b.f41041a.size() - 1; size >= 0; size--) {
            this.f41026b.addPath(((InterfaceC18284Pi1) c5670b.f41041a.get(size)).getPath(), matrix);
        }
        float floatValue = c5670b.f41042b.getStart().getValue().floatValue() / 100.0f;
        float floatValue2 = c5670b.f41042b.getEnd().getValue().floatValue() / 100.0f;
        float floatValue3 = c5670b.f41042b.getOffset().getValue().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f41026b, this.f41032h);
            C5644L.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.f41025a.setPath(this.f41026b, false);
        float length = this.f41025a.getLength();
        while (this.f41025a.nextContour()) {
            length += this.f41025a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = c5670b.f41041a.size() - 1; size2 >= 0; size2--) {
            this.f41027c.set(((InterfaceC18284Pi1) c5670b.f41041a.get(size2)).getPath());
            this.f41027c.transform(matrix);
            this.f41025a.setPath(this.f41027c, false);
            float length2 = this.f41025a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    Utils.applyTrimPathIfNeeded(this.f41027c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f41027c, this.f41032h);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.f41027c, this.f41032h);
                } else {
                    if (f5 < f6) {
                        f = 0.0f;
                    } else {
                        f = (f5 - f6) / length2;
                    }
                    if (min > f8) {
                        f2 = 1.0f;
                    } else {
                        f2 = (min - f6) / length2;
                    }
                    Utils.applyTrimPathIfNeeded(this.f41027c, f, f2, 0.0f);
                    canvas.drawPath(this.f41027c, this.f41032h);
                }
            }
            f6 += length2;
        }
        C5644L.endSection("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        C5644L.beginSection("StrokeContent#draw");
        if (Utils.hasZeroScaleAxis(matrix)) {
            C5644L.endSection("StrokeContent#draw");
            return;
        }
        this.f41032h.setAlpha(MiscUtils.clamp((int) ((((i / 255.0f) * ((IntegerKeyframeAnimation) this.f41034j).getIntValue()) / 100.0f) * 255.0f), 0, 255));
        this.f41032h.setStrokeWidth(((FloatKeyframeAnimation) this.f41033i).getFloatValue() * Utils.getScale(matrix));
        if (this.f41032h.getStrokeWidth() <= 0.0f) {
            C5644L.endSection("StrokeContent#draw");
            return;
        }
        m50905a(matrix);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41037m;
        if (baseKeyframeAnimation != null) {
            this.f41032h.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41038n;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.f41032h.setMaskFilter(null);
            } else if (floatValue != this.f41039o) {
                this.f41032h.setMaskFilter(this.layer.getBlurMaskFilter(floatValue));
            }
            this.f41039o = floatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f41040p;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(this.f41032h);
        }
        for (int i2 = 0; i2 < this.f41030f.size(); i2++) {
            C5670b c5670b = (C5670b) this.f41030f.get(i2);
            if (c5670b.f41042b != null) {
                m50904b(canvas, c5670b, matrix);
            } else {
                C5644L.beginSection("StrokeContent#buildPath");
                this.f41026b.reset();
                for (int size = c5670b.f41041a.size() - 1; size >= 0; size--) {
                    this.f41026b.addPath(((InterfaceC18284Pi1) c5670b.f41041a.get(size)).getPath(), matrix);
                }
                C5644L.endSection("StrokeContent#buildPath");
                C5644L.beginSection("StrokeContent#drawPath");
                canvas.drawPath(this.f41026b, this.f41032h);
                C5644L.endSection("StrokeContent#drawPath");
            }
        }
        C5644L.endSection("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        C5644L.beginSection("StrokeContent#getBounds");
        this.f41026b.reset();
        for (int i = 0; i < this.f41030f.size(); i++) {
            C5670b c5670b = (C5670b) this.f41030f.get(i);
            for (int i2 = 0; i2 < c5670b.f41041a.size(); i2++) {
                this.f41026b.addPath(((InterfaceC18284Pi1) c5670b.f41041a.get(i2)).getPath(), matrix);
            }
        }
        this.f41026b.computeBounds(this.f41028d, false);
        float floatValue = ((FloatKeyframeAnimation) this.f41033i).getFloatValue();
        RectF rectF2 = this.f41028d;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f41028d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5644L.endSection("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41029e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.m50875b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.m50876a(this);
        }
        C5670b c5670b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.m50875b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (c5670b != null) {
                        this.f41030f.add(c5670b);
                    }
                    c5670b = new C5670b(trimPathContent3);
                    trimPathContent3.m50876a(this);
                }
            }
            if (content2 instanceof InterfaceC18284Pi1) {
                if (c5670b == null) {
                    c5670b = new C5670b(trimPathContent);
                }
                c5670b.f41041a.add((InterfaceC18284Pi1) content2);
            }
        }
        if (c5670b != null) {
            this.f41030f.add(c5670b);
        }
    }
}