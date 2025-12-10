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

/* renamed from: u72  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22460u72 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: g */
    public static final PorterDuff.Mode f107619g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f107620a;

    /* renamed from: b */
    public PorterDuff.Mode f107621b;

    /* renamed from: c */
    public boolean f107622c;

    /* renamed from: d */
    public C22806w72 f107623d;

    /* renamed from: e */
    public boolean f107624e;

    /* renamed from: f */
    public Drawable f107625f;

    public AbstractC22460u72(C22806w72 c22806w72, Resources resources) {
        this.f107623d = c22806w72;
        m1250c(resources);
    }

    /* renamed from: a */
    public abstract boolean mo957a();

    /* renamed from: b */
    public final C22806w72 m1251b() {
        return new C22806w72(this.f107623d);
    }

    /* renamed from: c */
    public final void m1250c(Resources resources) {
        Drawable.ConstantState constantState;
        C22806w72 c22806w72 = this.f107623d;
        if (c22806w72 != null && (constantState = c22806w72.f108333b) != null) {
            setWrappedDrawable(constantState.newDrawable(resources));
        }
    }

    /* renamed from: d */
    public final boolean m1249d(int[] iArr) {
        if (!mo957a()) {
            return false;
        }
        C22806w72 c22806w72 = this.f107623d;
        ColorStateList colorStateList = c22806w72.f108334c;
        PorterDuff.Mode mode = c22806w72.f108335d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f107622c || colorForState != this.f107620a || mode != this.f107621b) {
                setColorFilter(colorForState, mode);
                this.f107620a = colorForState;
                this.f107621b = mode;
                this.f107622c = true;
                return true;
            }
        } else {
            this.f107622c = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f107625f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C22806w72 c22806w72 = this.f107623d;
        if (c22806w72 != null) {
            i = c22806w72.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f107625f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C22806w72 c22806w72 = this.f107623d;
        if (c22806w72 != null && c22806w72.m798a()) {
            this.f107623d.f108332a = getChangingConfigurations();
            return this.f107623d;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f107625f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f107625f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f107625f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return DrawableCompat.getLayoutDirection(this.f107625f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f107625f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f107625f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f107625f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f107625f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f107625f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f107625f.getTransparentRegion();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable getWrappedDrawable() {
        return this.f107625f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.f107625f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        C22806w72 c22806w72;
        if (mo957a() && (c22806w72 = this.f107623d) != null) {
            colorStateList = c22806w72.f108334c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f107625f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f107625f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f107624e && super.mutate() == this) {
            this.f107623d = m1251b();
            Drawable drawable = this.f107625f;
            if (drawable != null) {
                drawable.mutate();
            }
            C22806w72 c22806w72 = this.f107623d;
            if (c22806w72 != null) {
                Drawable drawable2 = this.f107625f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c22806w72.f108333b = constantState;
            }
            this.f107624e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f107625f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return DrawableCompat.setLayoutDirection(this.f107625f, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f107625f.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f107625f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        DrawableCompat.setAutoMirrored(this.f107625f, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f107625f.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f107625f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f107625f.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f107625f.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f107625f.setState(iArr);
        if (!m1249d(iArr) && !state) {
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
        this.f107623d.f108334c = colorStateList;
        m1249d(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f107623d.f108335d = mode;
        m1249d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.f107625f.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(Drawable drawable) {
        Drawable drawable2 = this.f107625f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f107625f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C22806w72 c22806w72 = this.f107623d;
            if (c22806w72 != null) {
                c22806w72.f108333b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public AbstractC22460u72(Drawable drawable) {
        this.f107623d = m1251b();
        setWrappedDrawable(drawable);
    }
}