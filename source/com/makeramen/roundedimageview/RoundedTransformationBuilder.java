package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.Transformation;

/* loaded from: classes5.dex */
public final class RoundedTransformationBuilder {

    /* renamed from: b */
    public float[] f58408b = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: c */
    public boolean f58409c = false;

    /* renamed from: d */
    public float f58410d = 0.0f;

    /* renamed from: e */
    public ColorStateList f58411e = ColorStateList.valueOf(-16777216);

    /* renamed from: f */
    public ImageView.ScaleType f58412f = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: a */
    public final DisplayMetrics f58407a = Resources.getSystem().getDisplayMetrics();

    /* renamed from: com.makeramen.roundedimageview.RoundedTransformationBuilder$a */
    /* loaded from: classes5.dex */
    public class C9126a implements Transformation {
        public C9126a() {
        }
    }

    public RoundedTransformationBuilder borderColor(int i) {
        this.f58411e = ColorStateList.valueOf(i);
        return this;
    }

    public RoundedTransformationBuilder borderWidth(float f) {
        this.f58410d = f;
        return this;
    }

    public RoundedTransformationBuilder borderWidthDp(float f) {
        this.f58410d = TypedValue.applyDimension(1, f, this.f58407a);
        return this;
    }

    public Transformation build() {
        return new C9126a();
    }

    public RoundedTransformationBuilder cornerRadius(float f) {
        float[] fArr = this.f58408b;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        return this;
    }

    public RoundedTransformationBuilder cornerRadiusDp(float f) {
        return cornerRadius(TypedValue.applyDimension(1, f, this.f58407a));
    }

    public RoundedTransformationBuilder oval(boolean z) {
        this.f58409c = z;
        return this;
    }

    public RoundedTransformationBuilder scaleType(ImageView.ScaleType scaleType) {
        this.f58412f = scaleType;
        return this;
    }

    public RoundedTransformationBuilder borderColor(ColorStateList colorStateList) {
        this.f58411e = colorStateList;
        return this;
    }

    public RoundedTransformationBuilder cornerRadiusDp(int i, float f) {
        return cornerRadius(i, TypedValue.applyDimension(1, f, this.f58407a));
    }

    public RoundedTransformationBuilder cornerRadius(int i, float f) {
        this.f58408b[i] = f;
        return this;
    }
}
