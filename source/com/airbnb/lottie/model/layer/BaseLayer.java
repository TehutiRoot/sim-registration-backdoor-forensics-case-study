package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5655L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* renamed from: A */
    public Paint f41416A;

    /* renamed from: B */
    public float f41417B;

    /* renamed from: C */
    public BlurMaskFilter f41418C;

    /* renamed from: a */
    public final Path f41419a = new Path();

    /* renamed from: b */
    public final Matrix f41420b = new Matrix();

    /* renamed from: c */
    public final Matrix f41421c = new Matrix();

    /* renamed from: d */
    public final Paint f41422d = new LPaint(1);

    /* renamed from: e */
    public final Paint f41423e;

    /* renamed from: f */
    public final Paint f41424f;

    /* renamed from: g */
    public final Paint f41425g;

    /* renamed from: h */
    public final Paint f41426h;

    /* renamed from: i */
    public final RectF f41427i;

    /* renamed from: j */
    public final RectF f41428j;

    /* renamed from: k */
    public final RectF f41429k;

    /* renamed from: l */
    public final RectF f41430l;

    /* renamed from: m */
    public final RectF f41431m;

    /* renamed from: n */
    public final String f41432n;

    /* renamed from: o */
    public final Matrix f41433o;

    /* renamed from: p */
    public final LottieDrawable f41434p;

    /* renamed from: q */
    public final Layer f41435q;

    /* renamed from: r */
    public MaskKeyframeAnimation f41436r;

    /* renamed from: s */
    public FloatKeyframeAnimation f41437s;

    /* renamed from: t */
    public BaseLayer f41438t;

    /* renamed from: u */
    public BaseLayer f41439u;

    /* renamed from: v */
    public List f41440v;

    /* renamed from: w */
    public final List f41441w;

    /* renamed from: x */
    public final TransformKeyframeAnimation f41442x;

    /* renamed from: y */
    public boolean f41443y;

    /* renamed from: z */
    public boolean f41444z;

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5705a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41445a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41446b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f41446b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41446b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41446b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41446b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f41445a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41445a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41445a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41445a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41445a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41445a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41445a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f41423e = new LPaint(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f41424f = new LPaint(1, mode2);
        LPaint lPaint = new LPaint(1);
        this.f41425g = lPaint;
        this.f41426h = new LPaint(PorterDuff.Mode.CLEAR);
        this.f41427i = new RectF();
        this.f41428j = new RectF();
        this.f41429k = new RectF();
        this.f41430l = new RectF();
        this.f41431m = new RectF();
        this.f41433o = new Matrix();
        this.f41441w = new ArrayList();
        this.f41443y = true;
        this.f41417B = 0.0f;
        this.f41434p = lottieDrawable;
        this.f41435q = layer;
        this.f41432n = layer.getName() + "#draw";
        if (layer.m50764d() == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        TransformKeyframeAnimation createAnimation = layer.m50751q().createAnimation();
        this.f41442x = createAnimation;
        createAnimation.addListener(this);
        if (layer.m50765c() != null && !layer.m50765c().isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.m50765c());
            this.f41436r = maskKeyframeAnimation;
            for (BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation : maskKeyframeAnimation.getMaskAnimations()) {
                baseKeyframeAnimation.addUpdateListener(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 : this.f41436r.getOpacityAnimations()) {
                addAnimation(baseKeyframeAnimation2);
                baseKeyframeAnimation2.addUpdateListener(this);
            }
        }
        m50769x();
    }

    /* renamed from: a */
    public static /* synthetic */ void m50792a(BaseLayer baseLayer) {
        baseLayer.m50774s();
    }

    /* renamed from: l */
    public static BaseLayer m50781l(CompositionLayer compositionLayer, Layer layer, LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
        switch (C5705a.f41445a[layer.getLayerType().ordinal()]) {
            case 1:
                return new ShapeLayer(lottieDrawable, layer, compositionLayer, lottieComposition);
            case 2:
                return new CompositionLayer(lottieDrawable, layer, lottieComposition.getPrecomps(layer.getRefId()), lottieComposition);
            case 3:
                return new SolidLayer(lottieDrawable, layer);
            case 4:
                return new ImageLayer(lottieDrawable, layer);
            case 5:
                return new NullLayer(lottieDrawable, layer);
            case 6:
                return new TextLayer(lottieDrawable, layer);
            default:
                Logger.warning("Unknown layer type " + layer.getLayerType());
                return null;
        }
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.f41441w.add(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f41442x.applyValueCallback(t, lottieValueCallback);
    }

    /* renamed from: b */
    public final void m50791b(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation, BaseKeyframeAnimation baseKeyframeAnimation2) {
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        this.f41422d.setAlpha((int) (((Integer) baseKeyframeAnimation2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f41419a, this.f41422d);
    }

    /* renamed from: c */
    public final void m50790c(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation, BaseKeyframeAnimation baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.f41427i, this.f41423e);
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        this.f41422d.setAlpha((int) (((Integer) baseKeyframeAnimation2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f41419a, this.f41422d);
        canvas.restore();
    }

    /* renamed from: d */
    public final void m50789d(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation, BaseKeyframeAnimation baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.f41427i, this.f41422d);
        canvas.drawRect(this.f41427i, this.f41422d);
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        this.f41422d.setAlpha((int) (((Integer) baseKeyframeAnimation2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f41419a, this.f41424f);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        Integer value;
        C5655L.beginSection(this.f41432n);
        if (this.f41443y && !this.f41435q.isHidden()) {
            m50783j();
            C5655L.beginSection("Layer#parentMatrix");
            this.f41420b.reset();
            this.f41420b.set(matrix);
            for (int size = this.f41440v.size() - 1; size >= 0; size--) {
                this.f41420b.preConcat(((BaseLayer) this.f41440v.get(size)).f41442x.getMatrix());
            }
            C5655L.endSection("Layer#parentMatrix");
            BaseKeyframeAnimation<?, Integer> opacity = this.f41442x.getOpacity();
            if (opacity != null && (value = opacity.getValue()) != null) {
                i2 = value.intValue();
            } else {
                i2 = 100;
            }
            int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
            if (!m50778o() && !m50779n()) {
                this.f41420b.preConcat(this.f41442x.getMatrix());
                C5655L.beginSection("Layer#drawLayer");
                drawLayer(canvas, this.f41420b, i3);
                C5655L.endSection("Layer#drawLayer");
                m50773t(C5655L.endSection(this.f41432n));
                return;
            }
            C5655L.beginSection("Layer#computeBounds");
            getBounds(this.f41427i, this.f41420b, false);
            m50776q(this.f41427i, matrix);
            this.f41420b.preConcat(this.f41442x.getMatrix());
            m50777p(this.f41427i, this.f41420b);
            this.f41428j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f41421c);
            if (!this.f41421c.isIdentity()) {
                Matrix matrix2 = this.f41421c;
                matrix2.invert(matrix2);
                this.f41421c.mapRect(this.f41428j);
            }
            if (!this.f41427i.intersect(this.f41428j)) {
                this.f41427i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C5655L.endSection("Layer#computeBounds");
            if (this.f41427i.width() >= 1.0f && this.f41427i.height() >= 1.0f) {
                C5655L.beginSection("Layer#saveLayer");
                this.f41422d.setAlpha(255);
                Utils.saveLayerCompat(canvas, this.f41427i, this.f41422d);
                C5655L.endSection("Layer#saveLayer");
                m50782k(canvas);
                C5655L.beginSection("Layer#drawLayer");
                drawLayer(canvas, this.f41420b, i3);
                C5655L.endSection("Layer#drawLayer");
                if (m50779n()) {
                    m50786g(canvas, this.f41420b);
                }
                if (m50778o()) {
                    C5655L.beginSection("Layer#drawMatte");
                    C5655L.beginSection("Layer#saveLayer");
                    Utils.saveLayerCompat(canvas, this.f41427i, this.f41425g, 19);
                    C5655L.endSection("Layer#saveLayer");
                    m50782k(canvas);
                    this.f41438t.draw(canvas, matrix, i3);
                    C5655L.beginSection("Layer#restoreLayer");
                    canvas.restore();
                    C5655L.endSection("Layer#restoreLayer");
                    C5655L.endSection("Layer#drawMatte");
                }
                C5655L.beginSection("Layer#restoreLayer");
                canvas.restore();
                C5655L.endSection("Layer#restoreLayer");
            }
            if (this.f41444z && (paint = this.f41416A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f41416A.setColor(-251901);
                this.f41416A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f41427i, this.f41416A);
                this.f41416A.setStyle(Paint.Style.FILL);
                this.f41416A.setColor(1357638635);
                canvas.drawRect(this.f41427i, this.f41416A);
            }
            m50773t(C5655L.endSection(this.f41432n));
            return;
        }
        C5655L.endSection(this.f41432n);
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i);

    /* renamed from: e */
    public final void m50788e(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation, BaseKeyframeAnimation baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.f41427i, this.f41423e);
        canvas.drawRect(this.f41427i, this.f41422d);
        this.f41424f.setAlpha((int) (((Integer) baseKeyframeAnimation2.getValue()).intValue() * 2.55f));
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        canvas.drawPath(this.f41419a, this.f41424f);
        canvas.restore();
    }

    /* renamed from: f */
    public final void m50787f(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation, BaseKeyframeAnimation baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.f41427i, this.f41424f);
        canvas.drawRect(this.f41427i, this.f41422d);
        this.f41424f.setAlpha((int) (((Integer) baseKeyframeAnimation2.getValue()).intValue() * 2.55f));
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        canvas.drawPath(this.f41419a, this.f41424f);
        canvas.restore();
    }

    /* renamed from: g */
    public final void m50786g(Canvas canvas, Matrix matrix) {
        C5655L.beginSection("Layer#saveLayer");
        Utils.saveLayerCompat(canvas, this.f41427i, this.f41423e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m50782k(canvas);
        }
        C5655L.endSection("Layer#saveLayer");
        for (int i = 0; i < this.f41436r.getMasks().size(); i++) {
            Mask mask = this.f41436r.getMasks().get(i);
            BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation = this.f41436r.getMaskAnimations().get(i);
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f41436r.getOpacityAnimations().get(i);
            int i2 = C5705a.f41446b[mask.getMaskMode().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (mask.isInverted()) {
                                m50789d(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                            } else {
                                m50791b(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                            }
                        }
                    } else if (mask.isInverted()) {
                        m50788e(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        m50790c(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                    }
                } else {
                    if (i == 0) {
                        this.f41422d.setColor(-16777216);
                        this.f41422d.setAlpha(255);
                        canvas.drawRect(this.f41427i, this.f41422d);
                    }
                    if (mask.isInverted()) {
                        m50787f(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        m50785h(canvas, matrix, baseKeyframeAnimation);
                    }
                }
            } else if (m50784i()) {
                this.f41422d.setAlpha(255);
                canvas.drawRect(this.f41427i, this.f41422d);
            }
        }
        C5655L.beginSection("Layer#restoreLayer");
        canvas.restore();
        C5655L.endSection("Layer#restoreLayer");
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.f41435q.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.f41417B == f) {
            return this.f41418C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f41418C = blurMaskFilter;
        this.f41417B = f;
        return blurMaskFilter;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41427i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m50783j();
        this.f41433o.set(matrix);
        if (z) {
            List list = this.f41440v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f41433o.preConcat(((BaseLayer) this.f41440v.get(size)).f41442x.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.f41439u;
                if (baseLayer != null) {
                    this.f41433o.preConcat(baseLayer.f41442x.getMatrix());
                }
            }
        }
        this.f41433o.preConcat(this.f41442x.getMatrix());
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.f41435q.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41435q.getName();
    }

    /* renamed from: h */
    public final void m50785h(Canvas canvas, Matrix matrix, BaseKeyframeAnimation baseKeyframeAnimation) {
        this.f41419a.set((Path) baseKeyframeAnimation.getValue());
        this.f41419a.transform(matrix);
        canvas.drawPath(this.f41419a, this.f41424f);
    }

    /* renamed from: i */
    public final boolean m50784i() {
        if (this.f41436r.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f41436r.getMasks().size(); i++) {
            if (this.f41436r.getMasks().get(i).getMaskMode() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m50783j() {
        if (this.f41440v != null) {
            return;
        }
        if (this.f41439u == null) {
            this.f41440v = Collections.emptyList();
            return;
        }
        this.f41440v = new ArrayList();
        for (BaseLayer baseLayer = this.f41439u; baseLayer != null; baseLayer = baseLayer.f41439u) {
            this.f41440v.add(baseLayer);
        }
    }

    /* renamed from: k */
    public final void m50782k(Canvas canvas) {
        C5655L.beginSection("Layer#clearLayer");
        RectF rectF = this.f41427i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f41426h);
        C5655L.endSection("Layer#clearLayer");
    }

    /* renamed from: m */
    public Layer m50780m() {
        return this.f41435q;
    }

    /* renamed from: n */
    public boolean m50779n() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.f41436r;
        if (maskKeyframeAnimation != null && !maskKeyframeAnimation.getMaskAnimations().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m50778o() {
        if (this.f41438t != null) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50775r();
    }

    /* renamed from: p */
    public final void m50777p(RectF rectF, Matrix matrix) {
        this.f41429k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!m50779n()) {
            return;
        }
        int size = this.f41436r.getMasks().size();
        for (int i = 0; i < size; i++) {
            Mask mask = this.f41436r.getMasks().get(i);
            Path value = this.f41436r.getMaskAnimations().get(i).getValue();
            if (value != null) {
                this.f41419a.set(value);
                this.f41419a.transform(matrix);
                int i2 = C5705a.f41446b[mask.getMaskMode().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 == 3 || i2 == 4) && mask.isInverted()) {
                        return;
                    }
                    this.f41419a.computeBounds(this.f41431m, false);
                    if (i == 0) {
                        this.f41429k.set(this.f41431m);
                    } else {
                        RectF rectF2 = this.f41429k;
                        rectF2.set(Math.min(rectF2.left, this.f41431m.left), Math.min(this.f41429k.top, this.f41431m.top), Math.max(this.f41429k.right, this.f41431m.right), Math.max(this.f41429k.bottom, this.f41431m.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.f41429k)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: q */
    public final void m50776q(RectF rectF, Matrix matrix) {
        if (!m50778o() || this.f41435q.m50764d() == Layer.MatteType.INVERT) {
            return;
        }
        this.f41430l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f41438t.getBounds(this.f41430l, matrix, true);
        if (!rectF.intersect(this.f41430l)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: r */
    public final void m50775r() {
        this.f41434p.invalidateSelf();
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f41441w.remove(baseKeyframeAnimation);
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i, List list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        BaseLayer baseLayer = this.f41438t;
        if (baseLayer != null) {
            KeyPath addKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.f41438t.getName(), i)) {
                list.add(addKey.resolve(this.f41438t));
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                this.f41438t.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.f41438t.getName(), i) + i, list, addKey);
            }
        }
        if (!keyPath.matches(getName(), i)) {
            return;
        }
        if (!"__container".equals(getName())) {
            keyPath2 = keyPath2.addKey(getName());
            if (keyPath.fullyResolvesTo(getName(), i)) {
                list.add(keyPath2.resolve(this));
            }
        }
        if (keyPath.propagateToChildren(getName(), i)) {
            resolveChildKeyPath(keyPath, i + keyPath.incrementDepthBy(getName(), i), list, keyPath2);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m50774s() {
        boolean z;
        if (this.f41437s.getFloatValue() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        m50770w(z);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.f41416A == null) {
            this.f41416A = new LPaint();
        }
        this.f41444z = z;
    }

    public void setProgress(float f) {
        this.f41442x.setProgress(f);
        if (this.f41436r != null) {
            for (int i = 0; i < this.f41436r.getMaskAnimations().size(); i++) {
                this.f41436r.getMaskAnimations().get(i).setProgress(f);
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f41437s;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f);
        }
        BaseLayer baseLayer = this.f41438t;
        if (baseLayer != null) {
            baseLayer.setProgress(f);
        }
        for (int i2 = 0; i2 < this.f41441w.size(); i2++) {
            ((BaseKeyframeAnimation) this.f41441w.get(i2)).setProgress(f);
        }
    }

    /* renamed from: t */
    public final void m50773t(float f) {
        this.f41434p.getComposition().getPerformanceTracker().recordRenderTime(this.f41435q.getName(), f);
    }

    /* renamed from: u */
    public void m50772u(BaseLayer baseLayer) {
        this.f41438t = baseLayer;
    }

    /* renamed from: v */
    public void m50771v(BaseLayer baseLayer) {
        this.f41439u = baseLayer;
    }

    /* renamed from: w */
    public final void m50770w(boolean z) {
        if (z != this.f41443y) {
            this.f41443y = z;
            m50775r();
        }
    }

    /* renamed from: x */
    public final void m50769x() {
        boolean z = true;
        if (!this.f41435q.m50766b().isEmpty()) {
            FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.f41435q.m50766b());
            this.f41437s = floatKeyframeAnimation;
            floatKeyframeAnimation.setIsDiscrete();
            this.f41437s.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() { // from class: La
                {
                    BaseLayer.this = this;
                }

                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    BaseLayer.m50792a(BaseLayer.this);
                }
            });
            if (((Float) this.f41437s.getValue()).floatValue() != 1.0f) {
                z = false;
            }
            m50770w(z);
            addAnimation(this.f41437s);
            return;
        }
        m50770w(true);
    }
}
