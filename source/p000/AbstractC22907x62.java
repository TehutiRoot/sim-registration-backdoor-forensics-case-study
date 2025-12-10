package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.graphics.drawable.WrappedDrawable;

/* renamed from: x62  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22907x62 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: g */
    public static final PorterDuff.Mode f108223g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f108224a;

    /* renamed from: b */
    public PorterDuff.Mode f108225b;

    /* renamed from: c */
    public boolean f108226c;

    /* renamed from: d */
    public C23251z62 f108227d;

    /* renamed from: e */
    public boolean f108228e;

    /* renamed from: f */
    public Drawable f108229f;

    public AbstractC22907x62(C23251z62 c23251z62, Resources resources) {
        this.f108227d = c23251z62;
        m620c(resources);
    }

    /* renamed from: a */
    public abstract boolean mo341a();

    /* renamed from: b */
    public final C23251z62 m621b() {
        return new C23251z62(this.f108227d);
    }

    /* renamed from: c */
    public final void m620c(Resources resources) {
        Drawable.ConstantState constantState;
        C23251z62 c23251z62 = this.f108227d;
        if (c23251z62 != null && (constantState = c23251z62.f108977b) != null) {
            setWrappedDrawable(constantState.newDrawable(resources));
        }
    }

    /* renamed from: d */
    public final boolean m619d(int[] iArr) {
        if (!mo341a()) {
            return false;
        }
        C23251z62 c23251z62 = this.f108227d;
        ColorStateList colorStateList = c23251z62.f108978c;
        PorterDuff.Mode mode = c23251z62.f108979d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f108226c || colorForState != this.f108224a || mode != this.f108225b) {
                setColorFilter(colorForState, mode);
                this.f108224a = colorForState;
                this.f108225b = mode;
                this.f108226c = true;
                return true;
            }
        } else {
            this.f108226c = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f108229f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C23251z62 c23251z62 = this.f108227d;
        if (c23251z62 != null) {
            i = c23251z62.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f108229f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C23251z62 c23251z62 = this.f108227d;
        if (c23251z62 != null && c23251z62.m131a()) {
            this.f108227d.f108976a = getChangingConfigurations();
            return this.f108227d;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f108229f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f108229f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f108229f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return DrawableCompat.getLayoutDirection(this.f108229f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f108229f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f108229f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f108229f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f108229f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f108229f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f108229f.getTransparentRegion();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable getWrappedDrawable() {
        return this.f108229f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.f108229f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        C23251z62 c23251z62;
        if (mo341a() && (c23251z62 = this.f108227d) != null) {
            colorStateList = c23251z62.f108978c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f108229f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f108229f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f108228e && super.mutate() == this) {
            this.f108227d = m621b();
            Drawable drawable = this.f108229f;
            if (drawable != null) {
                drawable.mutate();
            }
            C23251z62 c23251z62 = this.f108227d;
            if (c23251z62 != null) {
                Drawable drawable2 = this.f108229f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c23251z62.f108977b = constantState;
            }
            this.f108228e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f108229f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return DrawableCompat.setLayoutDirection(this.f108229f, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f108229f.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f108229f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        DrawableCompat.setAutoMirrored(this.f108229f, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f108229f.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f108229f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f108229f.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f108229f.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f108229f.setState(iArr);
        if (!m619d(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.f108227d.f108978c = colorStateList;
        m619d(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f108227d.f108979d = mode;
        m619d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.f108229f.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(Drawable drawable) {
        Drawable drawable2 = this.f108229f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f108229f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C23251z62 c23251z62 = this.f108227d;
            if (c23251z62 != null) {
                c23251z62.f108977b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public AbstractC22907x62(Drawable drawable) {
        this.f108227d = m621b();
        setWrappedDrawable(drawable);
    }
}
