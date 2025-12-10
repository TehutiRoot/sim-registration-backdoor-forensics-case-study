package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class AppCompatImageHelper {

    /* renamed from: a */
    public final ImageView f9690a;

    /* renamed from: b */
    public TintInfo f9691b;

    /* renamed from: c */
    public TintInfo f9692c;

    /* renamed from: d */
    public TintInfo f9693d;

    /* renamed from: e */
    public int f9694e = 0;

    public AppCompatImageHelper(@NonNull ImageView imageView) {
        this.f9690a = imageView;
    }

    /* renamed from: a */
    public final boolean m64296a(Drawable drawable) {
        if (this.f9693d == null) {
            this.f9693d = new TintInfo();
        }
        TintInfo tintInfo = this.f9693d;
        tintInfo.m64104a();
        ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.f9690a);
        if (imageTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.f9690a);
        if (imageTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = imageTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.m64307d(drawable, tintInfo, this.f9690a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m64295b() {
        if (this.f9690a.getDrawable() != null) {
            this.f9690a.getDrawable().setLevel(this.f9694e);
        }
    }

    /* renamed from: c */
    public void m64294c() {
        Drawable drawable = this.f9690a.getDrawable();
        if (drawable != null) {
            DrawableUtils.m64248a(drawable);
        }
        if (drawable != null) {
            if (m64287j() && m64296a(drawable)) {
                return;
            }
            TintInfo tintInfo = this.f9692c;
            if (tintInfo != null) {
                AppCompatDrawableManager.m64307d(drawable, tintInfo, this.f9690a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f9691b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m64307d(drawable, tintInfo2, this.f9690a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m64293d() {
        TintInfo tintInfo = this.f9692c;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m64292e() {
        TintInfo tintInfo = this.f9692c;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m64291f() {
        if (this.f9690a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m64290g(Drawable drawable) {
        this.f9694e = drawable.getLevel();
    }

    /* renamed from: h */
    public void m64289h(ColorStateList colorStateList) {
        if (this.f9692c == null) {
            this.f9692c = new TintInfo();
        }
        TintInfo tintInfo = this.f9692c;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        m64294c();
    }

    /* renamed from: i */
    public void m64288i(PorterDuff.Mode mode) {
        if (this.f9692c == null) {
            this.f9692c = new TintInfo();
        }
        TintInfo tintInfo = this.f9692c;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        m64294c();
    }

    /* renamed from: j */
    public final boolean m64287j() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f9691b == null) {
                return false;
            }
            return true;
        } else if (i != 21) {
            return false;
        } else {
            return true;
        }
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f9690a.getContext(), attributeSet, R.styleable.AppCompatImageView, i, 0);
        ImageView imageView = this.f9690a;
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), R.styleable.AppCompatImageView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            Drawable drawable = this.f9690a.getDrawable();
            if (drawable == null && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AppCompatResources.getDrawable(this.f9690a.getContext(), resourceId)) != null) {
                this.f9690a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.m64248a(drawable);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatImageView_tint)) {
                ImageViewCompat.setImageTintList(this.f9690a, obtainStyledAttributes.getColorStateList(R.styleable.AppCompatImageView_tint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatImageView_tintMode)) {
                ImageViewCompat.setImageTintMode(this.f9690a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.AppCompatImageView_tintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(this.f9690a.getContext(), i);
            if (drawable != null) {
                DrawableUtils.m64248a(drawable);
            }
            this.f9690a.setImageDrawable(drawable);
        } else {
            this.f9690a.setImageDrawable(null);
        }
        m64294c();
    }
}