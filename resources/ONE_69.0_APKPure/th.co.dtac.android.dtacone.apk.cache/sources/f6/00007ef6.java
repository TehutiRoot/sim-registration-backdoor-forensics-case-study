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
public class ShapeContent implements InterfaceC18284Pi1, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: b */
    public final String f41157b;

    /* renamed from: c */
    public final boolean f41158c;

    /* renamed from: d */
    public final LottieDrawable f41159d;

    /* renamed from: e */
    public final ShapeKeyframeAnimation f41160e;

    /* renamed from: f */
    public boolean f41161f;

    /* renamed from: a */
    public final Path f41156a = new Path();

    /* renamed from: g */
    public final CompoundTrimPathContent f41162g = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.f41157b = shapePath.getName();
        this.f41158c = shapePath.isHidden();
        this.f41159d = lottieDrawable;
        ShapeKeyframeAnimation createAnimation = shapePath.getShapePath().createAnimation();
        this.f41160e = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    /* renamed from: a */
    private void m50877a() {
        this.f41161f = false;
        this.f41159d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41157b;
    }

    @Override // p000.InterfaceC18284Pi1
    public Path getPath() {
        if (this.f41161f) {
            return this.f41156a;
        }
        this.f41156a.reset();
        if (this.f41158c) {
            this.f41161f = true;
            return this.f41156a;
        }
        Path value = this.f41160e.getValue();
        if (value == null) {
            return this.f41156a;
        }
        this.f41156a.set(value);
        this.f41156a.setFillType(Path.FillType.EVEN_ODD);
        this.f41162g.apply(this.f41156a);
        this.f41161f = true;
        return this.f41156a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50877a();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.m50875b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f41162g.m50901a(trimPathContent);
                    trimPathContent.m50876a(this);
                }
            }
            if (content instanceof ShapeModifierContent) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ShapeModifierContent) content);
            }
        }
        this.f41160e.setShapeModifiers(arrayList);
    }
}