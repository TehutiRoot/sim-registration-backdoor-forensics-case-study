package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapeContent implements InterfaceC18435Sh1, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: b */
    public final String f41145b;

    /* renamed from: c */
    public final boolean f41146c;

    /* renamed from: d */
    public final LottieDrawable f41147d;

    /* renamed from: e */
    public final ShapeKeyframeAnimation f41148e;

    /* renamed from: f */
    public boolean f41149f;

    /* renamed from: a */
    public final Path f41144a = new Path();

    /* renamed from: g */
    public final CompoundTrimPathContent f41150g = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.f41145b = shapePath.getName();
        this.f41146c = shapePath.isHidden();
        this.f41147d = lottieDrawable;
        ShapeKeyframeAnimation createAnimation = shapePath.getShapePath().createAnimation();
        this.f41148e = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    /* renamed from: a */
    private void m50880a() {
        this.f41149f = false;
        this.f41147d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41145b;
    }

    @Override // p000.InterfaceC18435Sh1
    public Path getPath() {
        if (this.f41149f) {
            return this.f41144a;
        }
        this.f41144a.reset();
        if (this.f41146c) {
            this.f41149f = true;
            return this.f41144a;
        }
        Path value = this.f41148e.getValue();
        if (value == null) {
            return this.f41144a;
        }
        this.f41144a.set(value);
        this.f41144a.setFillType(Path.FillType.EVEN_ODD);
        this.f41150g.apply(this.f41144a);
        this.f41149f = true;
        return this.f41144a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50880a();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.m50878b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f41150g.m50904a(trimPathContent);
                    trimPathContent.m50879a(this);
                }
            }
            if (content instanceof ShapeModifierContent) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ShapeModifierContent) content);
            }
        }
        this.f41148e.setShapeModifiers(arrayList);
    }
}
