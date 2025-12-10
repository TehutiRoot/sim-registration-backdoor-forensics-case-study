package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class RepeaterContent implements DrawingContent, InterfaceC18435Sh1, Z60, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final Matrix f41130a = new Matrix();

    /* renamed from: b */
    public final Path f41131b = new Path();

    /* renamed from: c */
    public final LottieDrawable f41132c;

    /* renamed from: d */
    public final BaseLayer f41133d;

    /* renamed from: e */
    public final String f41134e;

    /* renamed from: f */
    public final boolean f41135f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41136g;

    /* renamed from: h */
    public final BaseKeyframeAnimation f41137h;

    /* renamed from: i */
    public final TransformKeyframeAnimation f41138i;

    /* renamed from: j */
    public ContentGroup f41139j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.f41132c = lottieDrawable;
        this.f41133d = baseLayer;
        this.f41134e = repeater.getName();
        this.f41135f = repeater.isHidden();
        BaseKeyframeAnimation<Float, Float> createAnimation = repeater.getCopies().createAnimation();
        this.f41136g = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
        BaseKeyframeAnimation<Float, Float> createAnimation2 = repeater.getOffset().createAnimation();
        this.f41137h = createAnimation2;
        baseLayer.addAnimation(createAnimation2);
        createAnimation2.addUpdateListener(this);
        TransformKeyframeAnimation createAnimation3 = repeater.getTransform().createAnimation();
        this.f41138i = createAnimation3;
        createAnimation3.addAnimationsToLayer(baseLayer);
        createAnimation3.addListener(this);
    }

    @Override // p000.Z60
    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.f41139j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f41139j = new ContentGroup(this.f41132c, this.f41133d, "Repeater", this.f41135f, arrayList, null);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (this.f41138i.applyValueCallback(t, lottieValueCallback)) {
            return;
        }
        if (t == LottieProperty.REPEATER_COPIES) {
            this.f41136g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.REPEATER_OFFSET) {
            this.f41137h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f41136g.getValue()).floatValue();
        float floatValue2 = ((Float) this.f41137h.getValue()).floatValue();
        float floatValue3 = this.f41138i.getStartOpacity().getValue().floatValue() / 100.0f;
        float floatValue4 = this.f41138i.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f41130a.set(matrix);
            float f = i2;
            this.f41130a.preConcat(this.f41138i.getMatrixForRepeater(f + floatValue2));
            this.f41139j.draw(canvas, this.f41130a, (int) (i * MiscUtils.lerp(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41139j.getBounds(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41134e;
    }

    @Override // p000.InterfaceC18435Sh1
    public Path getPath() {
        Path path = this.f41139j.getPath();
        this.f41131b.reset();
        float floatValue = ((Float) this.f41136g.getValue()).floatValue();
        float floatValue2 = ((Float) this.f41137h.getValue()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f41130a.set(this.f41138i.getMatrixForRepeater(i + floatValue2));
            this.f41131b.addPath(path, this.f41130a);
        }
        return this.f41131b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41132c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
        for (int i2 = 0; i2 < this.f41139j.getContents().size(); i2++) {
            Content content = this.f41139j.getContents().get(i2);
            if (content instanceof KeyPathElementContent) {
                MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, (KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        this.f41139j.setContents(list, list2);
    }
}
