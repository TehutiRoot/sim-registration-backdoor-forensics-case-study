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
public class RepeaterContent implements DrawingContent, InterfaceC18284Pi1, InterfaceC19863f70, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final Matrix f41142a = new Matrix();

    /* renamed from: b */
    public final Path f41143b = new Path();

    /* renamed from: c */
    public final LottieDrawable f41144c;

    /* renamed from: d */
    public final BaseLayer f41145d;

    /* renamed from: e */
    public final String f41146e;

    /* renamed from: f */
    public final boolean f41147f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41148g;

    /* renamed from: h */
    public final BaseKeyframeAnimation f41149h;

    /* renamed from: i */
    public final TransformKeyframeAnimation f41150i;

    /* renamed from: j */
    public ContentGroup f41151j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.f41144c = lottieDrawable;
        this.f41145d = baseLayer;
        this.f41146e = repeater.getName();
        this.f41147f = repeater.isHidden();
        BaseKeyframeAnimation<Float, Float> createAnimation = repeater.getCopies().createAnimation();
        this.f41148g = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
        BaseKeyframeAnimation<Float, Float> createAnimation2 = repeater.getOffset().createAnimation();
        this.f41149h = createAnimation2;
        baseLayer.addAnimation(createAnimation2);
        createAnimation2.addUpdateListener(this);
        TransformKeyframeAnimation createAnimation3 = repeater.getTransform().createAnimation();
        this.f41150i = createAnimation3;
        createAnimation3.addAnimationsToLayer(baseLayer);
        createAnimation3.addListener(this);
    }

    @Override // p000.InterfaceC19863f70
    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.f41151j != null) {
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
        this.f41151j = new ContentGroup(this.f41144c, this.f41145d, "Repeater", this.f41147f, arrayList, null);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (this.f41150i.applyValueCallback(t, lottieValueCallback)) {
            return;
        }
        if (t == LottieProperty.REPEATER_COPIES) {
            this.f41148g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.REPEATER_OFFSET) {
            this.f41149h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f41148g.getValue()).floatValue();
        float floatValue2 = ((Float) this.f41149h.getValue()).floatValue();
        float floatValue3 = this.f41150i.getStartOpacity().getValue().floatValue() / 100.0f;
        float floatValue4 = this.f41150i.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f41142a.set(matrix);
            float f = i2;
            this.f41142a.preConcat(this.f41150i.getMatrixForRepeater(f + floatValue2));
            this.f41151j.draw(canvas, this.f41142a, (int) (i * MiscUtils.lerp(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f41151j.getBounds(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41146e;
    }

    @Override // p000.InterfaceC18284Pi1
    public Path getPath() {
        Path path = this.f41151j.getPath();
        this.f41143b.reset();
        float floatValue = ((Float) this.f41148g.getValue()).floatValue();
        float floatValue2 = ((Float) this.f41149h.getValue()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f41142a.set(this.f41150i.getMatrixForRepeater(i + floatValue2));
            this.f41143b.addPath(path, this.f41142a);
        }
        return this.f41143b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f41144c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
        for (int i2 = 0; i2 < this.f41151j.getContents().size(); i2++) {
            Content content = this.f41151j.getContents().get(i2);
            if (content instanceof KeyPathElementContent) {
                MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, (KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        this.f41151j.setContents(list, list2);
    }
}