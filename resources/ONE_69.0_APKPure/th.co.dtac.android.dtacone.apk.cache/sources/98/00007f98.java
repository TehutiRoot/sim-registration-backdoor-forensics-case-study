package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CompositionLayer extends BaseLayer {

    /* renamed from: D */
    public BaseKeyframeAnimation f41459D;

    /* renamed from: E */
    public final List f41460E;

    /* renamed from: F */
    public final RectF f41461F;

    /* renamed from: G */
    public final RectF f41462G;

    /* renamed from: H */
    public final Paint f41463H;

    /* renamed from: I */
    public Boolean f41464I;

    /* renamed from: J */
    public Boolean f41465J;

    /* renamed from: K */
    public boolean f41466K;

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5695a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41467a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f41467a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41467a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        int i;
        BaseLayer baseLayer;
        this.f41460E = new ArrayList();
        this.f41461F = new RectF();
        this.f41462G = new RectF();
        this.f41463H = new Paint();
        this.f41466K = true;
        AnimatableFloatValue m50750o = layer.m50750o();
        if (m50750o != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = m50750o.createAnimation();
            this.f41459D = createAnimation;
            addAnimation(createAnimation);
            this.f41459D.addUpdateListener(this);
        } else {
            this.f41459D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            BaseLayer m50778l = BaseLayer.m50778l(this, layer2, lottieDrawable, lottieComposition);
            if (m50778l != null) {
                longSparseArray.put(m50778l.m50777m().getId(), m50778l);
                if (baseLayer2 != null) {
                    baseLayer2.m50769u(m50778l);
                    baseLayer2 = null;
                } else {
                    this.f41460E.add(0, m50778l);
                    int i2 = C5695a.f41467a[layer2.m50761d().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        baseLayer2 = m50778l;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.m50777m().m50760e())) != null) {
                baseLayer3.m50768v(baseLayer);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.TIME_REMAP) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation baseKeyframeAnimation = this.f41459D;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41459D = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.f41459D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean clipRect;
        C5644L.beginSection("CompositionLayer#draw");
        this.f41462G.set(0.0f, 0.0f, this.f41447q.m50758g(), this.f41447q.m50759f());
        matrix.mapRect(this.f41462G);
        if (this.f41446p.isApplyingOpacityToLayersEnabled() && this.f41460E.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f41463H.setAlpha(i);
            Utils.saveLayerCompat(canvas, this.f41462G, this.f41463H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f41460E.size() - 1; size >= 0; size--) {
            if ((this.f41466K || !"__container".equals(this.f41447q.getName())) && !this.f41462G.isEmpty()) {
                clipRect = canvas.clipRect(this.f41462G);
            } else {
                clipRect = true;
            }
            if (clipRect) {
                ((BaseLayer) this.f41460E.get(size)).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        C5644L.endSection("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.f41460E.size() - 1; size >= 0; size--) {
            this.f41461F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((BaseLayer) this.f41460E.get(size)).getBounds(this.f41461F, this.f41445o, true);
            rectF.union(this.f41461F);
        }
    }

    public boolean hasMasks() {
        if (this.f41465J == null) {
            for (int size = this.f41460E.size() - 1; size >= 0; size--) {
                BaseLayer baseLayer = (BaseLayer) this.f41460E.get(size);
                if (baseLayer instanceof ShapeLayer) {
                    if (baseLayer.m50776n()) {
                        this.f41465J = Boolean.TRUE;
                        return true;
                    }
                } else if ((baseLayer instanceof CompositionLayer) && ((CompositionLayer) baseLayer).hasMasks()) {
                    this.f41465J = Boolean.TRUE;
                    return true;
                }
            }
            this.f41465J = Boolean.FALSE;
        }
        return this.f41465J.booleanValue();
    }

    public boolean hasMatte() {
        if (this.f41464I == null) {
            if (m50775o()) {
                this.f41464I = Boolean.TRUE;
                return true;
            }
            for (int size = this.f41460E.size() - 1; size >= 0; size--) {
                if (((BaseLayer) this.f41460E.get(size)).m50775o()) {
                    this.f41464I = Boolean.TRUE;
                    return true;
                }
            }
            this.f41464I = Boolean.FALSE;
        }
        return this.f41464I.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.f41460E.size(); i2++) {
            ((BaseLayer) this.f41460E.get(i2)).resolveKeyPath(keyPath, i, list, keyPath2);
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f41466K = z;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        for (BaseLayer baseLayer : this.f41460E) {
            baseLayer.setOutlineMasksAndMattes(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        super.setProgress(f);
        if (this.f41459D != null) {
            f = ((((Float) this.f41459D.getValue()).floatValue() * this.f41447q.m50764a().getFrameRate()) - this.f41447q.m50764a().getStartFrame()) / (this.f41446p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.f41459D == null) {
            f -= this.f41447q.m50753l();
        }
        if (this.f41447q.m50749p() != 0.0f && !"__container".equals(this.f41447q.getName())) {
            f /= this.f41447q.m50749p();
        }
        for (int size = this.f41460E.size() - 1; size >= 0; size--) {
            ((BaseLayer) this.f41460E.get(size)).setProgress(f);
        }
    }
}