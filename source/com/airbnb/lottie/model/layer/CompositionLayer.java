package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5655L;
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
    public BaseKeyframeAnimation f41447D;

    /* renamed from: E */
    public final List f41448E;

    /* renamed from: F */
    public final RectF f41449F;

    /* renamed from: G */
    public final RectF f41450G;

    /* renamed from: H */
    public final Paint f41451H;

    /* renamed from: I */
    public Boolean f41452I;

    /* renamed from: J */
    public Boolean f41453J;

    /* renamed from: K */
    public boolean f41454K;

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5706a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41455a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f41455a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41455a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        int i;
        BaseLayer baseLayer;
        this.f41448E = new ArrayList();
        this.f41449F = new RectF();
        this.f41450G = new RectF();
        this.f41451H = new Paint();
        this.f41454K = true;
        AnimatableFloatValue m50753o = layer.m50753o();
        if (m50753o != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = m50753o.createAnimation();
            this.f41447D = createAnimation;
            addAnimation(createAnimation);
            this.f41447D.addUpdateListener(this);
        } else {
            this.f41447D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            BaseLayer m50781l = BaseLayer.m50781l(this, layer2, lottieDrawable, lottieComposition);
            if (m50781l != null) {
                longSparseArray.put(m50781l.m50780m().getId(), m50781l);
                if (baseLayer2 != null) {
                    baseLayer2.m50772u(m50781l);
                    baseLayer2 = null;
                } else {
                    this.f41448E.add(0, m50781l);
                    int i2 = C5706a.f41455a[layer2.m50764d().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        baseLayer2 = m50781l;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.m50780m().m50763e())) != null) {
                baseLayer3.m50771v(baseLayer);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.TIME_REMAP) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation baseKeyframeAnimation = this.f41447D;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41447D = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.f41447D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean clipRect;
        C5655L.beginSection("CompositionLayer#draw");
        this.f41450G.set(0.0f, 0.0f, this.f41435q.m50761g(), this.f41435q.m50762f());
        matrix.mapRect(this.f41450G);
        if (this.f41434p.isApplyingOpacityToLayersEnabled() && this.f41448E.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f41451H.setAlpha(i);
            Utils.saveLayerCompat(canvas, this.f41450G, this.f41451H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f41448E.size() - 1; size >= 0; size--) {
            if ((this.f41454K || !"__container".equals(this.f41435q.getName())) && !this.f41450G.isEmpty()) {
                clipRect = canvas.clipRect(this.f41450G);
            } else {
                clipRect = true;
            }
            if (clipRect) {
                ((BaseLayer) this.f41448E.get(size)).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        C5655L.endSection("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.f41448E.size() - 1; size >= 0; size--) {
            this.f41449F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((BaseLayer) this.f41448E.get(size)).getBounds(this.f41449F, this.f41433o, true);
            rectF.union(this.f41449F);
        }
    }

    public boolean hasMasks() {
        if (this.f41453J == null) {
            for (int size = this.f41448E.size() - 1; size >= 0; size--) {
                BaseLayer baseLayer = (BaseLayer) this.f41448E.get(size);
                if (baseLayer instanceof ShapeLayer) {
                    if (baseLayer.m50779n()) {
                        this.f41453J = Boolean.TRUE;
                        return true;
                    }
                } else if ((baseLayer instanceof CompositionLayer) && ((CompositionLayer) baseLayer).hasMasks()) {
                    this.f41453J = Boolean.TRUE;
                    return true;
                }
            }
            this.f41453J = Boolean.FALSE;
        }
        return this.f41453J.booleanValue();
    }

    public boolean hasMatte() {
        if (this.f41452I == null) {
            if (m50778o()) {
                this.f41452I = Boolean.TRUE;
                return true;
            }
            for (int size = this.f41448E.size() - 1; size >= 0; size--) {
                if (((BaseLayer) this.f41448E.get(size)).m50778o()) {
                    this.f41452I = Boolean.TRUE;
                    return true;
                }
            }
            this.f41452I = Boolean.FALSE;
        }
        return this.f41452I.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.f41448E.size(); i2++) {
            ((BaseLayer) this.f41448E.get(i2)).resolveKeyPath(keyPath, i, list, keyPath2);
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f41454K = z;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        for (BaseLayer baseLayer : this.f41448E) {
            baseLayer.setOutlineMasksAndMattes(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        super.setProgress(f);
        if (this.f41447D != null) {
            f = ((((Float) this.f41447D.getValue()).floatValue() * this.f41435q.m50767a().getFrameRate()) - this.f41435q.m50767a().getStartFrame()) / (this.f41434p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.f41447D == null) {
            f -= this.f41435q.m50756l();
        }
        if (this.f41435q.m50752p() != 0.0f && !"__container".equals(this.f41435q.getName())) {
            f /= this.f41435q.m50752p();
        }
        for (int size = this.f41448E.size() - 1; size >= 0; size--) {
            ((BaseLayer) this.f41448E.get(size)).setProgress(f);
        }
    }
}
