package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h */
    public static final int[] f12334h = {16842801};

    /* renamed from: i */
    public static final InterfaceC12472om f12335i;

    /* renamed from: a */
    public boolean f12336a;

    /* renamed from: b */
    public boolean f12337b;

    /* renamed from: c */
    public int f12338c;

    /* renamed from: d */
    public int f12339d;

    /* renamed from: e */
    public final Rect f12340e;

    /* renamed from: f */
    public final Rect f12341f;

    /* renamed from: g */
    public final InterfaceC12392nm f12342g;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    public class C2692a implements InterfaceC12392nm {

        /* renamed from: a */
        public Drawable f12343a;

        public C2692a() {
        }

        @Override // p000.InterfaceC12392nm
        /* renamed from: a */
        public boolean mo26253a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p000.InterfaceC12392nm
        /* renamed from: b */
        public void mo26252b(Drawable drawable) {
            this.f12343a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p000.InterfaceC12392nm
        /* renamed from: c */
        public Drawable mo26251c() {
            return this.f12343a;
        }

        @Override // p000.InterfaceC12392nm
        /* renamed from: d */
        public boolean mo26250d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p000.InterfaceC12392nm
        /* renamed from: e */
        public View mo26249e() {
            return CardView.this;
        }

        @Override // p000.InterfaceC12392nm
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.f12341f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f12340e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        C12304mm c12304mm = new C12304mm();
        f12335i = c12304mm;
        c12304mm.mo25959o();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f12335i.mo25962l(this.f12342g);
    }

    public float getCardElevation() {
        return f12335i.mo25972b(this.f12342g);
    }

    @InterfaceC2037Px
    public int getContentPaddingBottom() {
        return this.f12340e.bottom;
    }

    @InterfaceC2037Px
    public int getContentPaddingLeft() {
        return this.f12340e.left;
    }

    @InterfaceC2037Px
    public int getContentPaddingRight() {
        return this.f12340e.right;
    }

    @InterfaceC2037Px
    public int getContentPaddingTop() {
        return this.f12340e.top;
    }

    public float getMaxCardElevation() {
        return f12335i.mo25960n(this.f12342g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f12337b;
    }

    public float getRadius() {
        return f12335i.mo25963k(this.f12342g);
    }

    public boolean getUseCompatPadding() {
        return this.f12336a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC12472om interfaceC12472om = f12335i;
        if (!(interfaceC12472om instanceof C12304mm)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC12472om.mo25969e(this.f12342g)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC12472om.mo25966h(this.f12342g)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        f12335i.mo25964j(this.f12342g, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f12335i.mo25961m(this.f12342g, f);
    }

    public void setContentPadding(@InterfaceC2037Px int i, @InterfaceC2037Px int i2, @InterfaceC2037Px int i3, @InterfaceC2037Px int i4) {
        this.f12340e.set(i, i2, i3, i4);
        f12335i.mo25967g(this.f12342g);
    }

    public void setMaxCardElevation(float f) {
        f12335i.mo25971c(this.f12342g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f12339d = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f12338c = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f12337b) {
            this.f12337b = z;
            f12335i.mo25973a(this.f12342g);
        }
    }

    public void setRadius(float f) {
        f12335i.mo25970d(this.f12342g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f12336a != z) {
            this.f12336a = z;
            f12335i.mo25968f(this.f12342g);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f12335i.mo25964j(this.f12342g, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f12340e = rect;
        this.f12341f = new Rect();
        C2692a c2692a = new C2692a();
        this.f12342g = c2692a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(R.styleable.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(R.styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f12334h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f12336a = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.f12337b = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f12338c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        this.f12339d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f12335i.mo25965i(c2692a, context, colorStateList, dimension, dimension2, f);
    }
}