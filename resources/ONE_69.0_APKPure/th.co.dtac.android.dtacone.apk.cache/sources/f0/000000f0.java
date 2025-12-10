package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: Az1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17348Az1 extends Drawable {

    /* renamed from: a */
    public float f277a;

    /* renamed from: c */
    public final RectF f279c;

    /* renamed from: d */
    public final Rect f280d;

    /* renamed from: e */
    public float f281e;

    /* renamed from: h */
    public ColorStateList f284h;

    /* renamed from: i */
    public PorterDuffColorFilter f285i;

    /* renamed from: j */
    public ColorStateList f286j;

    /* renamed from: f */
    public boolean f282f = false;

    /* renamed from: g */
    public boolean f283g = true;

    /* renamed from: k */
    public PorterDuff.Mode f287k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f278b = new Paint(5);

    public C17348Az1(ColorStateList colorStateList, float f) {
        this.f277a = f;
        m69170e(colorStateList);
        this.f279c = new RectF();
        this.f280d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m69174a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: b */
    public ColorStateList m69173b() {
        return this.f284h;
    }

    /* renamed from: c */
    public float m69172c() {
        return this.f281e;
    }

    /* renamed from: d */
    public float m69171d() {
        return this.f277a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f278b;
        if (this.f285i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f285i);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.f279c;
        float f = this.f277a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m69170e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f284h = colorStateList;
        this.f278b.setColor(colorStateList.getColorForState(getState(), this.f284h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m69169f(ColorStateList colorStateList) {
        m69170e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m69168g(float f, boolean z, boolean z2) {
        if (f == this.f281e && this.f282f == z && this.f283g == z2) {
            return;
        }
        this.f281e = f;
        this.f282f = z;
        this.f283g = z2;
        m69166i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f280d, this.f277a);
    }

    /* renamed from: h */
    public void m69167h(float f) {
        if (f == this.f277a) {
            return;
        }
        this.f277a = f;
        m69166i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m69166i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f279c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f280d.set(rect);
        if (this.f282f) {
            float m69026b = AbstractC17413Bz1.m69026b(this.f281e, this.f277a, this.f283g);
            this.f280d.inset((int) Math.ceil(AbstractC17413Bz1.m69027a(this.f281e, this.f277a, this.f283g)), (int) Math.ceil(m69026b));
            this.f279c.set(this.f280d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f286j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f284h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m69166i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f284h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f278b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f278b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f286j;
        if (colorStateList2 != null && (mode = this.f287k) != null) {
            this.f285i = m69174a(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f278b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f278b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f286j = colorStateList;
        this.f285i = m69174a(colorStateList, this.f287k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f287k = mode;
        this.f285i = m69174a(this.f286j, mode);
        invalidateSelf();
    }
}