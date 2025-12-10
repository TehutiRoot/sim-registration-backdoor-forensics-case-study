package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;

/* loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {

    /* renamed from: v */
    public static final int f50060v = R.style.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: d */
    public final ShapeAppearancePathProvider f50061d;

    /* renamed from: e */
    public final RectF f50062e;

    /* renamed from: f */
    public final RectF f50063f;

    /* renamed from: g */
    public final Paint f50064g;

    /* renamed from: h */
    public final Paint f50065h;

    /* renamed from: i */
    public final Path f50066i;

    /* renamed from: j */
    public ColorStateList f50067j;

    /* renamed from: k */
    public MaterialShapeDrawable f50068k;

    /* renamed from: l */
    public ShapeAppearanceModel f50069l;

    /* renamed from: m */
    public float f50070m;

    /* renamed from: n */
    public Path f50071n;

    /* renamed from: o */
    public int f50072o;

    /* renamed from: p */
    public int f50073p;

    /* renamed from: q */
    public int f50074q;

    /* renamed from: r */
    public int f50075r;

    /* renamed from: s */
    public int f50076s;

    /* renamed from: t */
    public int f50077t;

    /* renamed from: u */
    public boolean f50078u;

    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    /* loaded from: classes4.dex */
    public class C6958a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f50079a = new Rect();

        public C6958a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f50069l == null) {
                return;
            }
            if (ShapeableImageView.this.f50068k == null) {
                ShapeableImageView.this.f50068k = new MaterialShapeDrawable(ShapeableImageView.this.f50069l);
            }
            ShapeableImageView.this.f50062e.round(this.f50079a);
            ShapeableImageView.this.f50068k.setBounds(this.f50079a);
            ShapeableImageView.this.f50068k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: g */
    private boolean m44646g() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m44648e(Canvas canvas) {
        if (this.f50067j == null) {
            return;
        }
        this.f50064g.setStrokeWidth(this.f50070m);
        int colorForState = this.f50067j.getColorForState(getDrawableState(), this.f50067j.getDefaultColor());
        if (this.f50070m > 0.0f && colorForState != 0) {
            this.f50064g.setColor(colorForState);
            canvas.drawPath(this.f50066i, this.f50064g);
        }
    }

    /* renamed from: f */
    public final boolean m44647f() {
        if (this.f50076s == Integer.MIN_VALUE && this.f50077t == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f50075r;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.f50077t;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (m44646g()) {
            return this.f50072o;
        }
        return this.f50074q;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (m44647f()) {
            if (m44646g() && (i2 = this.f50077t) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m44646g() && (i = this.f50076s) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f50072o;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (m44647f()) {
            if (m44646g() && (i2 = this.f50076s) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m44646g() && (i = this.f50077t) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f50074q;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.f50076s;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (m44646g()) {
            return this.f50074q;
        }
        return this.f50072o;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f50073p;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f50069l;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f50067j;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f50070m;
    }

    /* renamed from: h */
    public final void m44645h(int i, int i2) {
        this.f50062e.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f50061d.calculatePath(this.f50069l, 1.0f, this.f50062e, this.f50066i);
        this.f50071n.rewind();
        this.f50071n.addPath(this.f50066i);
        this.f50063f.set(0.0f, 0.0f, i, i2);
        this.f50071n.addRect(this.f50063f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f50071n, this.f50065h);
        m44648e(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f50078u || !isLayoutDirectionResolved()) {
            return;
        }
        this.f50078u = true;
        if (!isPaddingRelative() && !m44647f()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m44645h(i, i2);
    }

    public void setContentPadding(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        this.f50076s = Integer.MIN_VALUE;
        this.f50077t = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f50072o) + i, (super.getPaddingTop() - this.f50073p) + i2, (super.getPaddingRight() - this.f50074q) + i3, (super.getPaddingBottom() - this.f50075r) + i4);
        this.f50072o = i;
        this.f50073p = i2;
        this.f50074q = i3;
        this.f50075r = i4;
    }

    @RequiresApi(17)
    public void setContentPaddingRelative(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        int i5;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.f50073p) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.f50075r) + i4);
        if (m44646g()) {
            i5 = i3;
        } else {
            i5 = i;
        }
        this.f50072o = i5;
        this.f50073p = i2;
        if (!m44646g()) {
            i = i3;
        }
        this.f50074q = i;
        this.f50075r = i4;
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f50069l = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f50068k;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        m44645h(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f50067j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.f50070m != f) {
            this.f50070m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShapeableImageView(android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f50060v
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.ShapeAppearancePathProvider r7 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            r6.f50061d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f50066i = r7
            r7 = 0
            r6.f50078u = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f50065h = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f50062e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f50063f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f50071n = r2
            int[] r2 = com.google.android.material.R.styleable.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r2, r4)
            r6.f50067j = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f50070m = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f50072o = r7
            r6.f50073p = r7
            r6.f50074q = r7
            r6.f50075r = r7
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f50072o = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f50073p = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f50074q = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f50075r = r7
            int r7 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f50076s = r7
            int r7 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f50077t = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f50064g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = com.google.android.material.shape.ShapeAppearanceModel.builder(r1, r8, r9, r0)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.build()
            r6.f50069l = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}