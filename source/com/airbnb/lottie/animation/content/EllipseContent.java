package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class EllipseContent implements InterfaceC18435Sh1, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: b */
    public final String f41044b;

    /* renamed from: c */
    public final LottieDrawable f41045c;

    /* renamed from: d */
    public final BaseKeyframeAnimation f41046d;

    /* renamed from: e */
    public final BaseKeyframeAnimation f41047e;

    /* renamed from: f */
    public final CircleShape f41048f;

    /* renamed from: h */
    public boolean f41050h;

    /* renamed from: a */
    public final Path f41043a = new Path();

    /* renamed from: g */
    public final CompoundTrimPathContent f41049g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.f41044b = circleShape.getName();
        this.f41045c = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> createAnimation = circleShape.getSize().createAnimation();
        this.f41046d = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = circleShape.getPosition().createAnimation();
        this.f41047e = createAnimation2;
        this.f41048f = circleShape;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
    }

    /* renamed from: a */
    public final void m50898a() {
        this.f41050h = false;
        this.f41045c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.ELLIPSE_SIZE) {
            this.f41046d.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POSITION) {
            this.f41047e.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41044b;
    }

    @Override // p000.InterfaceC18435Sh1
    public Path getPath() {
        if (this.f41050h) {
            return this.f41043a;
        }
        this.f41043a.reset();
        if (this.f41048f.isHidden()) {
            this.f41050h = true;
            return this.f41043a;
        }
        PointF pointF = (PointF) this.f41046d.getValue();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f41043a.reset();
        if (this.f41048f.isReversed()) {
            float f5 = -f2;
            this.f41043a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f41043a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f41043a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f41043a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f41043a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f41043a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f41043a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f41043a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f41043a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f41043a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f41047e.getValue();
        this.f41043a.offset(pointF2.x, pointF2.y);
        this.f41043a.close();
        this.f41049g.apply(this.f41043a);
        this.f41050h = true;
        return this.f41043a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50898a();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.m50878b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f41049g.m50904a(trimPathContent);
                    trimPathContent.m50879a(this);
                }
            }
        }
    }
}
