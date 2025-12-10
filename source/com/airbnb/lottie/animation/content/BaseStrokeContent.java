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
import com.airbnb.lottie.C5655L;
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
    public final LottieDrawable f41017e;

    /* renamed from: g */
    public final float[] f41019g;

    /* renamed from: h */
    public final Paint f41020h;

    /* renamed from: i */
    public final BaseKeyframeAnimation f41021i;

    /* renamed from: j */
    public final BaseKeyframeAnimation f41022j;

    /* renamed from: k */
    public final List f41023k;

    /* renamed from: l */
    public final BaseKeyframeAnimation f41024l;
    protected final BaseLayer layer;

    /* renamed from: m */
    public BaseKeyframeAnimation f41025m;

    /* renamed from: n */
    public BaseKeyframeAnimation f41026n;

    /* renamed from: o */
    public float f41027o;

    /* renamed from: p */
    public DropShadowKeyframeAnimation f41028p;

    /* renamed from: a */
    public final PathMeasure f41013a = new PathMeasure();

    /* renamed from: b */
    public final Path f41014b = new Path();

    /* renamed from: c */
    public final Path f41015c = new Path();

    /* renamed from: d */
    public final RectF f41016d = new RectF();

    /* renamed from: f */
    public final List f41018f = new ArrayList();

    /* renamed from: com.airbnb.lottie.animation.content.BaseStrokeContent$b */
    /* loaded from: classes3.dex */
    public static final class C5681b {

        /* renamed from: a */
        public final List f41029a;

        /* renamed from: b */
        public final TrimPathContent f41030b;

        public C5681b(TrimPathContent trimPathContent) {
            this.f41029a = new ArrayList();
            this.f41030b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f41020h = lPaint;
        this.f41027o = 0.0f;
        this.f41017e = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.f41022j = animatableIntegerValue.createAnimation();
        this.f41021i = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.f41024l = null;
        } else {
            this.f41024l = animatableFloatValue2.createAnimation();
        }
        this.f41023k = new ArrayList(list.size());
        this.f41019g = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f41023k.add(((AnimatableFloatValue) list.get(i)).createAnimation());
        }
        baseLayer.addAnimation(this.f41022j);
        baseLayer.addAnimation(this.f41021i);
        for (int i2 = 0; i2 < this.f41023k.size(); i2++) {
            baseLayer.addAnimation((BaseKeyframeAnimation) this.f41023k.get(i2));
        }
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41024l;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.f41022j.addUpdateListener(this);
        this.f41021i.addUpdateListener(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((BaseKeyframeAnimation) this.f41023k.get(i3)).addUpdateListener(this);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41024l;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f41026n = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f41026n);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f41028p = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    /* renamed from: a */
    public final void m50908a(Matrix matrix) {
        float floatValue;
        C5655L.beginSection("StrokeContent#applyDashPattern");
        if (this.f41023k.isEmpty()) {
            C5655L.endSection("StrokeContent#applyDashPattern");
            return;
        }
        float scale = Utils.getScale(matrix);
        for (int i = 0; i < this.f41023k.size(); i++) {
            this.f41019g[i] = ((Float) ((BaseKeyframeAnimation) this.f41023k.get(i)).getValue()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f41019g;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f41019g;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f41019g;
            fArr3[i] = fArr3[i] * scale;
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41024l;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0f;
        } else {
            floatValue = scale * ((Float) baseKeyframeAnimation.getValue()).floatValue();
        }
        this.f41020h.setPathEffect(new DashPathEffect(this.f41019g, floatValue));
        C5655L.endSection("StrokeContent#applyDashPattern");
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
            this.f41022j.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.STROKE_WIDTH) {
            this.f41021i.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41025m;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41025m = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41025m = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.f41025m);
        } else if (t == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41026n;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41026n = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.f41026n);
        } else if (t == LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.f41028p) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.f41028p) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.f41028p) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.f41028p) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else if (t == LottieProperty.DROP_SHADOW_RADIUS && (dropShadowKeyframeAnimation = this.f41028p) != null) {
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    /* renamed from: b */
    public final void m50907b(Canvas canvas, C5681b c5681b, Matrix matrix) {
        float f;
        float f2;
        float f3;
        C5655L.beginSection("StrokeContent#applyTrimPath");
        if (c5681b.f41030b == null) {
            C5655L.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.f41014b.reset();
        for (int size = c5681b.f41029a.size() - 1; size >= 0; size--) {
            this.f41014b.addPath(((InterfaceC18435Sh1) c5681b.f41029a.get(size)).getPath(), matrix);
        }
        float floatValue = c5681b.f41030b.getStart().getValue().floatValue() / 100.0f;
        float floatValue2 = c5681b.f41030b.getEnd().getValue().floatValue() / 100.0f;
        float floatValue3 = c5681b.f41030b.getOffset().getValue().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f41014b, this.f41020h);
            C5655L.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.f41013a.setPath(this.f41014b, false);
        float length = this.f41013a.getLength();
        while (this.f41013a.nextContour()) {
            length += this.f41013a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = c5681b.f41029a.size() - 1; size2 >= 0; size2--) {
            this.f41015c.set(((InterfaceC18435Sh1) c5681b.f41029a.get(size2)).getPath());
            this.f41015c.transform(matrix);
            this.f41013a.setPath(this.f41015c, false);
            float length2 = this.f41013a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    Utils.applyTrimPathIfNeeded(this.f41015c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f41015c, this.f41020h);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.f41015c, this.f41020h);
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
                    Utils.applyTrimPathIfNeeded(this.f41015c, f, f2, 0.0f);
                    canvas.drawPath(this.f41015c, this.f41020h);
                }
            }
            f6 += length2;
        }
        C5655L.endSection("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        C5655L.beginSection("StrokeContent#draw");
        if (Utils.hasZeroScaleAxis(matrix)) {
            C5655L.endSection("StrokeContent#draw");
            return;
        }
        this.f41020h.setAlpha(MiscUtils.clamp((int) ((((i / 255.0f) * ((IntegerKeyframeAnimation) this.f41022j).getIntValue()) / 100.0f) * 255.0f), 0, 255));
        this.f41020h.setStrokeWidth(((FloatKeyframeAnimation) this.f41021i).getFloatValue() * Utils.getScale(matrix));
        if (this.f41020h.getStrokeWidth() <= 0.0f) {
            C5655L.endSection("StrokeContent#draw");
            return;
        }
        m50908a(matrix);
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41025m;
        if (baseKeyframeAnimation != null) {
            this.f41020h.setColorFilter((ColorFilter) baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41026n;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = ((Float) baseKeyframeAnimation2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.f41020h.setMaskFilter(null);
            } else if (floatValue != this.f41027o) {
                this.f41020h.setMaskFilter(this.layer.getBlurMaskFilter(floatValue));
            }
            this.f41027o = floatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f41028p;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(this.f41020h);
        }
        for (int i2 = 0; i2 < this.f41018f.size(); i2++) {
            C5681b c5681b = (C5681b) this.f41018f.get(i2);
            if (c5681b.f41030b != null) {
                m50907b(canvas, c5681b, matrix);
            } else {
                C5655L.beginSection("StrokeContent#buildPath");
                this.f41014b.reset();
                for (int size = c5681b.f41029a.size() - 1; size >= 0; size--) {
                    this.f41014b.addPath(((InterfaceC18435Sh1) c5681b.f41029a.get(size)).getPath(), matrix);
                }
                C5655L.endSection("StrokeContent#buildPath");
                C5655L.beginSection("StrokeContent#drawPath");
                canvas.drawPath(this.f41014b, this.f41020h);
                C5655L.endSection("StrokeContent#drawPath");
            }
        }
        C5655L.endSection("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        C5655L.beginSection("StrokeContent#getBounds");
        this.f41014b.reset();
        for (int i = 0; i < this.f41018f.size(); i++) {
            C5681b c5681b = (C5681b) this.f41018f.get(i);
            for (int i2 = 0; i2 < c5681b.f41029a.size(); i2++) {
                this.f41014b.addPath(((InterfaceC18435Sh1) c5681b.f41029a.get(i2)).getPath(), matrix);
            }
        }
        this.f41014b.computeBounds(this.f41016d, false);
        float floatValue = ((FloatKeyframeAnimation) this.f41021i).getFloatValue();
        RectF rectF2 = this.f41016d;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f41016d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5655L.endSection("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41017e.invalidateSelf();
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
                if (trimPathContent2.m50878b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.m50879a(this);
        }
        C5681b c5681b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.m50878b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (c5681b != null) {
                        this.f41018f.add(c5681b);
                    }
                    c5681b = new C5681b(trimPathContent3);
                    trimPathContent3.m50879a(this);
                }
            }
            if (content2 instanceof InterfaceC18435Sh1) {
                if (c5681b == null) {
                    c5681b = new C5681b(trimPathContent);
                }
                c5681b.f41029a.add((InterfaceC18435Sh1) content2);
            }
        }
        if (c5681b != null) {
            this.f41018f.add(c5681b);
        }
    }
}
