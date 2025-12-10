package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapeGroup implements ContentModel {

    /* renamed from: a */
    public final String f41391a;

    /* renamed from: b */
    public final List f41392b;

    /* renamed from: c */
    public final boolean f41393c;

    public ShapeGroup(String str, List<ContentModel> list, boolean z) {
        this.f41391a = str;
        this.f41392b = list;
        this.f41393c = z;
    }

    public List<ContentModel> getItems() {
        return this.f41392b;
    }

    public String getName() {
        return this.f41391a;
    }

    public boolean isHidden() {
        return this.f41393c;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this, lottieComposition);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f41391a + "' Shapes: " + Arrays.toString(this.f41392b.toArray()) + '}';
    }
}
