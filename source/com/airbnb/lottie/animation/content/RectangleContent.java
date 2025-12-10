package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, InterfaceC18435Sh1 {

    /* renamed from: c */
    public final String f41121c;

    /* renamed from: d */
    public final boolean f41122d;

    /* renamed from: e */
    public final LottieDrawable f41123e;

    /* renamed from: f */
    public final BaseKeyframeAnimation f41124f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41125g;

    /* renamed from: h */
    public final BaseKeyframeAnimation f41126h;

    /* renamed from: k */
    public boolean f41129k;

    /* renamed from: a */
    public final Path f41119a = new Path();

    /* renamed from: b */
    public final RectF f41120b = new RectF();

    /* renamed from: i */
    public final CompoundTrimPathContent f41127i = new CompoundTrimPathContent();

    /* renamed from: j */
    public BaseKeyframeAnimation f41128j = null;

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.f41121c = rectangleShape.getName();
        this.f41122d = rectangleShape.isHidden();
        this.f41123e = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> createAnimation = rectangleShape.getPosition().createAnimation();
        this.f41124f = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = rectangleShape.getSize().createAnimation();
        this.f41125g = createAnimation2;
        BaseKeyframeAnimation<Float, Float> createAnimation3 = rectangleShape.getCornerRadius().createAnimation();
        this.f41126h = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    /* renamed from: a */
    private void m50884a() {
        this.f41129k = false;
        this.f41123e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.RECTANGLE_SIZE) {
            this.f41125g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POSITION) {
            this.f41124f.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.CORNER_RADIUS) {
            this.f41126h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41121c;
    }

    @Override // p000.InterfaceC18435Sh1
    public Path getPath() {
        float floatValue;
        BaseKeyframeAnimation baseKeyframeAnimation;
        if (this.f41129k) {
            return this.f41119a;
        }
        this.f41119a.reset();
        if (this.f41122d) {
            this.f41129k = true;
            return this.f41119a;
        }
        PointF pointF = (PointF) this.f41125g.getValue();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41126h;
        if (baseKeyframeAnimation2 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = ((FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
        }
        if (floatValue == 0.0f && (baseKeyframeAnimation = this.f41128j) != null) {
            floatValue = Math.min(((Float) baseKeyframeAnimation.getValue()).floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF pointF2 = (PointF) this.f41124f.getValue();
        this.f41119a.moveTo(pointF2.x + f, (pointF2.y - f2) + floatValue);
        this.f41119a.lineTo(pointF2.x + f, (pointF2.y + f2) - floatValue);
        int i = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f41120b;
            float f3 = pointF2.x;
            float f4 = floatValue * 2.0f;
            float f5 = pointF2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f41119a.arcTo(this.f41120b, 0.0f, 90.0f, false);
        }
        this.f41119a.lineTo((pointF2.x - f) + floatValue, pointF2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.f41120b;
            float f6 = pointF2.x;
            float f7 = pointF2.y;
            float f8 = floatValue * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f41119a.arcTo(this.f41120b, 90.0f, 90.0f, false);
        }
        this.f41119a.lineTo(pointF2.x - f, (pointF2.y - f2) + floatValue);
        if (i > 0) {
            RectF rectF3 = this.f41120b;
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = floatValue * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f41119a.arcTo(this.f41120b, 180.0f, 90.0f, false);
        }
        this.f41119a.lineTo((pointF2.x + f) - floatValue, pointF2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.f41120b;
            float f12 = pointF2.x;
            float f13 = floatValue * 2.0f;
            float f14 = pointF2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f41119a.arcTo(this.f41120b, 270.0f, 90.0f, false);
        }
        this.f41119a.close();
        this.f41127i.apply(this.f41119a);
        this.f41129k = true;
        return this.f41119a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50884a();
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
                    this.f41127i.m50904a(trimPathContent);
                    trimPathContent.m50879a(this);
                }
            }
            if (content instanceof RoundedCornersContent) {
                this.f41128j = ((RoundedCornersContent) content).getRoundedCorners();
            }
        }
    }
}
