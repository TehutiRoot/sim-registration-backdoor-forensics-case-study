package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ContentGroup implements DrawingContent, InterfaceC18284Pi1, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* renamed from: a */
    public final Paint f41044a;

    /* renamed from: b */
    public final RectF f41045b;

    /* renamed from: c */
    public final Matrix f41046c;

    /* renamed from: d */
    public final Path f41047d;

    /* renamed from: e */
    public final RectF f41048e;

    /* renamed from: f */
    public final String f41049f;

    /* renamed from: g */
    public final boolean f41050g;

    /* renamed from: h */
    public final List f41051h;

    /* renamed from: i */
    public final LottieDrawable f41052i;

    /* renamed from: j */
    public List f41053j;

    /* renamed from: k */
    public TransformKeyframeAnimation f41054k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup, LottieComposition lottieComposition) {
        this(lottieDrawable, baseLayer, shapeGroup.getName(), shapeGroup.isHidden(), m50900a(lottieDrawable, lottieComposition, baseLayer, shapeGroup.getItems()), m50899b(shapeGroup.getItems()));
    }

    /* renamed from: a */
    public static List m50900a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Content content = ((ContentModel) list.get(i)).toContent(lottieDrawable, lottieComposition, baseLayer);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static AnimatableTransform m50899b(List list) {
        for (int i = 0; i < list.size(); i++) {
            ContentModel contentModel = (ContentModel) list.get(i);
            if (contentModel instanceof AnimatableTransform) {
                return (AnimatableTransform) contentModel;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f41054k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.applyValueCallback(t, lottieValueCallback);
        }
    }

    /* renamed from: c */
    public List m50898c() {
        if (this.f41053j == null) {
            this.f41053j = new ArrayList();
            for (int i = 0; i < this.f41051h.size(); i++) {
                Content content = (Content) this.f41051h.get(i);
                if (content instanceof InterfaceC18284Pi1) {
                    this.f41053j.add((InterfaceC18284Pi1) content);
                }
            }
        }
        return this.f41053j;
    }

    /* renamed from: d */
    public Matrix m50897d() {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f41054k;
        if (transformKeyframeAnimation != null) {
            return transformKeyframeAnimation.getMatrix();
        }
        this.f41046c.reset();
        return this.f41046c;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.f41050g) {
            return;
        }
        this.f41046c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f41054k;
        if (transformKeyframeAnimation != null) {
            this.f41046c.preConcat(transformKeyframeAnimation.getMatrix());
            if (this.f41054k.getOpacity() == null) {
                intValue = 100;
            } else {
                intValue = this.f41054k.getOpacity().getValue().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.f41052i.isApplyingOpacityToLayersEnabled() && m50896e() && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f41045b.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.f41045b, this.f41046c, true);
            this.f41044a.setAlpha(i);
            Utils.saveLayerCompat(canvas, this.f41045b, this.f41044a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f41051h.size() - 1; size >= 0; size--) {
            Object obj = this.f41051h.get(size);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).draw(canvas, this.f41046c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    /* renamed from: e */
    public final boolean m50896e() {
        int i = 0;
        for (int i2 = 0; i2 < this.f41051h.size(); i2++) {
            if ((this.f41051h.get(i2) instanceof DrawingContent) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41046c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f41054k;
        if (transformKeyframeAnimation != null) {
            this.f41046c.preConcat(transformKeyframeAnimation.getMatrix());
        }
        this.f41048e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f41051h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f41051h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(this.f41048e, this.f41046c, z);
                rectF.union(this.f41048e);
            }
        }
    }

    public List<Content> getContents() {
        return this.f41051h;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41049f;
    }

    @Override // p000.InterfaceC18284Pi1
    public Path getPath() {
        this.f41046c.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f41054k;
        if (transformKeyframeAnimation != null) {
            this.f41046c.set(transformKeyframeAnimation.getMatrix());
        }
        this.f41047d.reset();
        if (this.f41050g) {
            return this.f41047d;
        }
        for (int size = this.f41051h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f41051h.get(size);
            if (content instanceof InterfaceC18284Pi1) {
                this.f41047d.addPath(((InterfaceC18284Pi1) content).getPath(), this.f41046c);
            }
        }
        return this.f41047d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41052i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (!keyPath.matches(getName(), i) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            keyPath2 = keyPath2.addKey(getName());
            if (keyPath.fullyResolvesTo(getName(), i)) {
                list.add(keyPath2.resolve(this));
            }
        }
        if (keyPath.propagateToChildren(getName(), i)) {
            int incrementDepthBy = i + keyPath.incrementDepthBy(getName(), i);
            for (int i2 = 0; i2 < this.f41051h.size(); i2++) {
                Content content = (Content) this.f41051h.get(i2);
                if (content instanceof KeyPathElement) {
                    ((KeyPathElement) content).resolveKeyPath(keyPath, incrementDepthBy, list, keyPath2);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f41051h.size());
        arrayList.addAll(list);
        for (int size = this.f41051h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f41051h.get(size);
            content.setContents(arrayList, this.f41051h.subList(0, size));
            arrayList.add(content);
        }
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z, List list, AnimatableTransform animatableTransform) {
        this.f41044a = new LPaint();
        this.f41045b = new RectF();
        this.f41046c = new Matrix();
        this.f41047d = new Path();
        this.f41048e = new RectF();
        this.f41049f = str;
        this.f41052i = lottieDrawable;
        this.f41050g = z;
        this.f41051h = list;
        if (animatableTransform != null) {
            TransformKeyframeAnimation createAnimation = animatableTransform.createAnimation();
            this.f41054k = createAnimation;
            createAnimation.addAnimationsToLayer(baseLayer);
            this.f41054k.addListener(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = (Content) list.get(size);
            if (content instanceof InterfaceC19863f70) {
                arrayList.add((InterfaceC19863f70) content);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC19863f70) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }
}