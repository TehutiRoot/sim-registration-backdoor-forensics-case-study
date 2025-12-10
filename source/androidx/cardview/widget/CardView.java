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
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h */
    public static final int[] f12246h = {16842801};

    /* renamed from: i */
    public static final InterfaceC12472om f12247i;

    /* renamed from: a */
    public boolean f12248a;

    /* renamed from: b */
    public boolean f12249b;

    /* renamed from: c */
    public int f12250c;

    /* renamed from: d */
    public int f12251d;

    /* renamed from: e */
    public final Rect f12252e;

    /* renamed from: f */
    public final Rect f12253f;

    /* renamed from: g */
    public final InterfaceC12395nm f12254g;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    public class C2710a implements InterfaceC12395nm {

        /* renamed from: a */
        public Drawable f12255a;

        public C2710a() {
        }

        @Override // p000.InterfaceC12395nm
        /* renamed from: a */
        public boolean mo26052a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p000.InterfaceC12395nm
        /* renamed from: b */
        public void mo26051b(Drawable drawable) {
            this.f12255a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p000.InterfaceC12395nm
        /* renamed from: c */
        public Drawable mo26050c() {
            return this.f12255a;
        }

        @Override // p000.InterfaceC12395nm
        /* renamed from: d */
        public boolean mo26049d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p000.InterfaceC12395nm
        /* renamed from: e */
        public View mo26048e() {
            return CardView.this;
        }

        @Override // p000.InterfaceC12395nm
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.f12253f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f12252e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        C12313mm c12313mm = new C12313mm();
        f12247i = c12313mm;
        c12313mm.mo25780o();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f12247i.mo25783l(this.f12254g);
    }

    public float getCardElevation() {
        return f12247i.mo25793b(this.f12254g);
    }

    @InterfaceC2055Px
    public int getContentPaddingBottom() {
        return this.f12252e.bottom;
    }

    @InterfaceC2055Px
    public int getContentPaddingLeft() {
        return this.f12252e.left;
    }

    @InterfaceC2055Px
    public int getContentPaddingRight() {
        return this.f12252e.right;
    }

    @InterfaceC2055Px
    public int getContentPaddingTop() {
        return this.f12252e.top;
    }

    public float getMaxCardElevation() {
        return f12247i.mo25781n(this.f12254g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f12249b;
    }

    public float getRadius() {
        return f12247i.mo25784k(this.f12254g);
    }

    public boolean getUseCompatPadding() {
        return this.f12248a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC12472om interfaceC12472om = f12247i;
        if (!(interfaceC12472om instanceof C12313mm)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC12472om.mo25790e(this.f12254g)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC12472om.mo25787h(this.f12254g)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        f12247i.mo25785j(this.f12254g, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f12247i.mo25782m(this.f12254g, f);
    }

    public void setContentPadding(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, @InterfaceC2055Px int i3, @InterfaceC2055Px int i4) {
        this.f12252e.set(i, i2, i3, i4);
        f12247i.mo25788g(this.f12254g);
    }

    public void setMaxCardElevation(float f) {
        f12247i.mo25792c(this.f12254g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f12251d = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f12250c = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f12249b) {
            this.f12249b = z;
            f12247i.mo25794a(this.f12254g);
        }
    }

    public void setRadius(float f) {
        f12247i.mo25791d(this.f12254g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f12248a != z) {
            this.f12248a = z;
            f12247i.mo25789f(this.f12254g);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f12247i.mo25785j(this.f12254g, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f12252e = rect;
        this.f12253f = new Rect();
        C2710a c2710a = new C2710a();
        this.f12254g = c2710a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(R.styleable.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(R.styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f12246h);
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
        this.f12248a = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.f12249b = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f12250c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        this.f12251d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f12247i.mo25786i(c2710a, context, colorStateList, dimension, dimension2, f);
    }
}
