package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: y62 */
/* loaded from: classes2.dex */
public class C23079y62 extends AbstractC22907x62 {

    /* renamed from: h */
    public static Method f108614h;

    public C23079y62(Drawable drawable) {
        super(drawable);
        m340e();
    }

    @Override // p000.AbstractC22907x62
    /* renamed from: a */
    public boolean mo341a() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f108229f;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m340e() {
        if (f108614h == null) {
            try {
                f108614h = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f108229f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f108229f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f108229f;
        if (drawable != null && (method = f108614h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f108229f.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f108229f.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.AbstractC22907x62, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC22907x62, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (mo341a()) {
            super.setTint(i);
        } else {
            this.f108229f.setTint(i);
        }
    }

    @Override // p000.AbstractC22907x62, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (mo341a()) {
            super.setTintList(colorStateList);
        } else {
            this.f108229f.setTintList(colorStateList);
        }
    }

    @Override // p000.AbstractC22907x62, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo341a()) {
            super.setTintMode(mode);
        } else {
            this.f108229f.setTintMode(mode);
        }
    }

    public C23079y62(C23251z62 c23251z62, Resources resources) {
        super(c23251z62, resources);
        m340e();
    }
}
