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

/* renamed from: Dy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17514Dy1 extends Drawable {

    /* renamed from: a */
    public float f1164a;

    /* renamed from: c */
    public final RectF f1166c;

    /* renamed from: d */
    public final Rect f1167d;

    /* renamed from: e */
    public float f1168e;

    /* renamed from: h */
    public ColorStateList f1171h;

    /* renamed from: i */
    public PorterDuffColorFilter f1172i;

    /* renamed from: j */
    public ColorStateList f1173j;

    /* renamed from: f */
    public boolean f1169f = false;

    /* renamed from: g */
    public boolean f1170g = true;

    /* renamed from: k */
    public PorterDuff.Mode f1174k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f1165b = new Paint(5);

    public C17514Dy1(ColorStateList colorStateList, float f) {
        this.f1164a = f;
        m68561e(colorStateList);
        this.f1166c = new RectF();
        this.f1167d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m68565a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: b */
    public ColorStateList m68564b() {
        return this.f1171h;
    }

    /* renamed from: c */
    public float m68563c() {
        return this.f1168e;
    }

    /* renamed from: d */
    public float m68562d() {
        return this.f1164a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1165b;
        if (this.f1172i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f1172i);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.f1166c;
        float f = this.f1164a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m68561e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1171h = colorStateList;
        this.f1165b.setColor(colorStateList.getColorForState(getState(), this.f1171h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m68560f(ColorStateList colorStateList) {
        m68561e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m68559g(float f, boolean z, boolean z2) {
        if (f == this.f1168e && this.f1169f == z && this.f1170g == z2) {
            return;
        }
        this.f1168e = f;
        this.f1169f = z;
        this.f1170g = z2;
        m68557i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1167d, this.f1164a);
    }

    /* renamed from: h */
    public void m68558h(float f) {
        if (f == this.f1164a) {
            return;
        }
        this.f1164a = f;
        m68557i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m68557i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1166c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1167d.set(rect);
        if (this.f1169f) {
            float m68434b = AbstractC17578Ey1.m68434b(this.f1168e, this.f1164a, this.f1170g);
            this.f1167d.inset((int) Math.ceil(AbstractC17578Ey1.m68435a(this.f1168e, this.f1164a, this.f1170g)), (int) Math.ceil(m68434b));
            this.f1166c.set(this.f1167d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1173j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f1171h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m68557i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1171h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f1165b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1165b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1173j;
        if (colorStateList2 != null && (mode = this.f1174k) != null) {
            this.f1172i = m68565a(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1165b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1165b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1173j = colorStateList;
        this.f1172i = m68565a(colorStateList, this.f1174k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1174k = mode;
        this.f1172i = m68565a(this.f1173j, mode);
        invalidateSelf();
    }
}
