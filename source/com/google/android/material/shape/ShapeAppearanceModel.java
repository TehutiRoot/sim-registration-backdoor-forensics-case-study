package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);

    /* renamed from: a */
    public CornerTreatment f50686a;

    /* renamed from: b */
    public CornerTreatment f50687b;

    /* renamed from: c */
    public CornerTreatment f50688c;

    /* renamed from: d */
    public CornerTreatment f50689d;

    /* renamed from: e */
    public CornerSize f50690e;

    /* renamed from: f */
    public CornerSize f50691f;

    /* renamed from: g */
    public CornerSize f50692g;

    /* renamed from: h */
    public CornerSize f50693h;

    /* renamed from: i */
    public EdgeTreatment f50694i;

    /* renamed from: j */
    public EdgeTreatment f50695j;

    /* renamed from: k */
    public EdgeTreatment f50696k;

    /* renamed from: l */
    public EdgeTreatment f50697l;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public CornerTreatment f50698a;

        /* renamed from: b */
        public CornerTreatment f50699b;

        /* renamed from: c */
        public CornerTreatment f50700c;

        /* renamed from: d */
        public CornerTreatment f50701d;

        /* renamed from: e */
        public CornerSize f50702e;

        /* renamed from: f */
        public CornerSize f50703f;

        /* renamed from: g */
        public CornerSize f50704g;

        /* renamed from: h */
        public CornerSize f50705h;

        /* renamed from: i */
        public EdgeTreatment f50706i;

        /* renamed from: j */
        public EdgeTreatment f50707j;

        /* renamed from: k */
        public EdgeTreatment f50708k;

        /* renamed from: l */
        public EdgeTreatment f50709l;

        public Builder() {
            this.f50698a = MaterialShapeUtils.m44207b();
            this.f50699b = MaterialShapeUtils.m44207b();
            this.f50700c = MaterialShapeUtils.m44207b();
            this.f50701d = MaterialShapeUtils.m44207b();
            this.f50702e = new AbsoluteCornerSize(0.0f);
            this.f50703f = new AbsoluteCornerSize(0.0f);
            this.f50704g = new AbsoluteCornerSize(0.0f);
            this.f50705h = new AbsoluteCornerSize(0.0f);
            this.f50706i = MaterialShapeUtils.m44206c();
            this.f50707j = MaterialShapeUtils.m44206c();
            this.f50708k = MaterialShapeUtils.m44206c();
            this.f50709l = MaterialShapeUtils.m44206c();
        }

        /* renamed from: m */
        public static float m44188m(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f50685a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f50623a;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i, @Dimension float f) {
            return setAllCorners(MaterialShapeUtils.m44208a(i)).setAllCornerSizes(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f50708k = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, @Dimension float f) {
            return setBottomLeftCorner(MaterialShapeUtils.m44208a(i)).setBottomLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f) {
            this.f50705h = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, @Dimension float f) {
            return setBottomRightCorner(MaterialShapeUtils.m44208a(i)).setBottomRightCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f) {
            this.f50704g = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f50709l = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f50707j = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f50706i = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, @Dimension float f) {
            return setTopLeftCorner(MaterialShapeUtils.m44208a(i)).setTopLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f) {
            this.f50702e = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, @Dimension float f) {
            return setTopRightCorner(MaterialShapeUtils.m44208a(i)).setTopRightCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f) {
            this.f50703f = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f50705h = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f50704g = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f50702e = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f50703f = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.m44208a(i)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.m44208a(i)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.m44208a(i)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.m44208a(i)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f) {
            return setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f50701d = cornerTreatment;
            float m44188m = m44188m(cornerTreatment);
            if (m44188m != -1.0f) {
                setBottomLeftCornerSize(m44188m);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f50700c = cornerTreatment;
            float m44188m = m44188m(cornerTreatment);
            if (m44188m != -1.0f) {
                setBottomRightCornerSize(m44188m);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f50698a = cornerTreatment;
            float m44188m = m44188m(cornerTreatment);
            if (m44188m != -1.0f) {
                setTopLeftCornerSize(m44188m);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f50699b = cornerTreatment;
            float m44188m = m44188m(cornerTreatment);
            if (m44188m != -1.0f) {
                setTopRightCornerSize(m44188m);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f50698a = MaterialShapeUtils.m44207b();
            this.f50699b = MaterialShapeUtils.m44207b();
            this.f50700c = MaterialShapeUtils.m44207b();
            this.f50701d = MaterialShapeUtils.m44207b();
            this.f50702e = new AbsoluteCornerSize(0.0f);
            this.f50703f = new AbsoluteCornerSize(0.0f);
            this.f50704g = new AbsoluteCornerSize(0.0f);
            this.f50705h = new AbsoluteCornerSize(0.0f);
            this.f50706i = MaterialShapeUtils.m44206c();
            this.f50707j = MaterialShapeUtils.m44206c();
            this.f50708k = MaterialShapeUtils.m44206c();
            this.f50709l = MaterialShapeUtils.m44206c();
            this.f50698a = shapeAppearanceModel.f50686a;
            this.f50699b = shapeAppearanceModel.f50687b;
            this.f50700c = shapeAppearanceModel.f50688c;
            this.f50701d = shapeAppearanceModel.f50689d;
            this.f50702e = shapeAppearanceModel.f50690e;
            this.f50703f = shapeAppearanceModel.f50691f;
            this.f50704g = shapeAppearanceModel.f50692g;
            this.f50705h = shapeAppearanceModel.f50693h;
            this.f50706i = shapeAppearanceModel.f50694i;
            this.f50707j = shapeAppearanceModel.f50695j;
            this.f50708k = shapeAppearanceModel.f50696k;
            this.f50709l = shapeAppearanceModel.f50697l;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    /* renamed from: a */
    public static Builder m44203a(Context context, int i, int i2, int i3) {
        return m44202b(context, i, i2, new AbsoluteCornerSize(i3));
    }

    /* renamed from: b */
    public static Builder m44202b(Context context, int i, int i2, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            CornerSize m44201c = m44201c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize m44201c2 = m44201c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, m44201c);
            CornerSize m44201c3 = m44201c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, m44201c);
            CornerSize m44201c4 = m44201c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, m44201c);
            return new Builder().setTopLeftCorner(i4, m44201c2).setTopRightCorner(i5, m44201c3).setBottomRightCorner(i6, m44201c4).setBottomLeftCorner(i7, m44201c(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, m44201c));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: c */
    public static CornerSize m44201c(TypedArray typedArray, int i, CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cornerSize;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f));
        }
        return cornerSize;
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.f50696k;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.f50689d;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.f50693h;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.f50688c;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.f50692g;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.f50697l;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.f50695j;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.f50694i;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.f50686a;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.f50690e;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.f50687b;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.f50691f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f50697l.getClass().equals(EdgeTreatment.class) && this.f50695j.getClass().equals(EdgeTreatment.class) && this.f50694i.getClass().equals(EdgeTreatment.class) && this.f50696k.getClass().equals(EdgeTreatment.class)) {
            z = true;
        } else {
            z = false;
        }
        float cornerSize = this.f50690e.getCornerSize(rectF);
        if (this.f50691f.getCornerSize(rectF) == cornerSize && this.f50693h.getCornerSize(rectF) == cornerSize && this.f50692g.getCornerSize(rectF) == cornerSize) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f50687b instanceof RoundedCornerTreatment) && (this.f50686a instanceof RoundedCornerTreatment) && (this.f50688c instanceof RoundedCornerTreatment) && (this.f50689d instanceof RoundedCornerTreatment)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f) {
        return toBuilder().setAllCornerSizes(f).build();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    public ShapeAppearanceModel(Builder builder) {
        this.f50686a = builder.f50698a;
        this.f50687b = builder.f50699b;
        this.f50688c = builder.f50700c;
        this.f50689d = builder.f50701d;
        this.f50690e = builder.f50702e;
        this.f50691f = builder.f50703f;
        this.f50692g = builder.f50704g;
        this.f50693h = builder.f50705h;
        this.f50694i = builder.f50706i;
        this.f50695j = builder.f50707j;
        this.f50696k = builder.f50708k;
        this.f50697l = builder.f50709l;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return builder(context, attributeSet, i, i2, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, int i3) {
        return builder(context, attributeSet, i, i2, new AbsoluteCornerSize(i3));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m44202b(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i, @StyleRes int i2) {
        return m44203a(context, i, i2, 0);
    }

    public ShapeAppearanceModel() {
        this.f50686a = MaterialShapeUtils.m44207b();
        this.f50687b = MaterialShapeUtils.m44207b();
        this.f50688c = MaterialShapeUtils.m44207b();
        this.f50689d = MaterialShapeUtils.m44207b();
        this.f50690e = new AbsoluteCornerSize(0.0f);
        this.f50691f = new AbsoluteCornerSize(0.0f);
        this.f50692g = new AbsoluteCornerSize(0.0f);
        this.f50693h = new AbsoluteCornerSize(0.0f);
        this.f50694i = MaterialShapeUtils.m44206c();
        this.f50695j = MaterialShapeUtils.m44206c();
        this.f50696k = MaterialShapeUtils.m44206c();
        this.f50697l = MaterialShapeUtils.m44206c();
    }
}
