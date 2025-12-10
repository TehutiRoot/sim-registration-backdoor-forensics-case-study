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
    public final ImageView f9602a;

    /* renamed from: b */
    public TintInfo f9603b;

    /* renamed from: c */
    public TintInfo f9604c;

    /* renamed from: d */
    public TintInfo f9605d;

    /* renamed from: e */
    public int f9606e = 0;

    public AppCompatImageHelper(@NonNull ImageView imageView) {
        this.f9602a = imageView;
    }

    /* renamed from: a */
    public final boolean m64345a(Drawable drawable) {
        if (this.f9605d == null) {
            this.f9605d = new TintInfo();
        }
        TintInfo tintInfo = this.f9605d;
        tintInfo.m64153a();
        ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.f9602a);
        if (imageTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.f9602a);
        if (imageTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = imageTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.m64356d(drawable, tintInfo, this.f9602a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m64344b() {
        if (this.f9602a.getDrawable() != null) {
            this.f9602a.getDrawable().setLevel(this.f9606e);
        }
    }

    /* renamed from: c */
    public void m64343c() {
        Drawable drawable = this.f9602a.getDrawable();
        if (drawable != null) {
            DrawableUtils.m64297a(drawable);
        }
        if (drawable != null) {
            if (m64336j() && m64345a(drawable)) {
                return;
            }
            TintInfo tintInfo = this.f9604c;
            if (tintInfo != null) {
                AppCompatDrawableManager.m64356d(drawable, tintInfo, this.f9602a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f9603b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m64356d(drawable, tintInfo2, this.f9602a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m64342d() {
        TintInfo tintInfo = this.f9604c;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m64341e() {
        TintInfo tintInfo = this.f9604c;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m64340f() {
        if (this.f9602a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m64339g(Drawable drawable) {
        this.f9606e = drawable.getLevel();
    }

    /* renamed from: h */
    public void m64338h(ColorStateList colorStateList) {
        if (this.f9604c == null) {
            this.f9604c = new TintInfo();
        }
        TintInfo tintInfo = this.f9604c;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        m64343c();
    }

    /* renamed from: i */
    public void m64337i(PorterDuff.Mode mode) {
        if (this.f9604c == null) {
            this.f9604c = new TintInfo();
        }
        TintInfo tintInfo = this.f9604c;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        m64343c();
    }

    /* renamed from: j */
    public final boolean m64336j() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f9603b == null) {
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
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f9602a.getContext(), attributeSet, R.styleable.AppCompatImageView, i, 0);
        ImageView imageView = this.f9602a;
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), R.styleable.AppCompatImageView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            Drawable drawable = this.f9602a.getDrawable();
            if (drawable == null && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AppCompatResources.getDrawable(this.f9602a.getContext(), resourceId)) != null) {
                this.f9602a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.m64297a(drawable);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatImageView_tint)) {
                ImageViewCompat.setImageTintList(this.f9602a, obtainStyledAttributes.getColorStateList(R.styleable.AppCompatImageView_tint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatImageView_tintMode)) {
                ImageViewCompat.setImageTintMode(this.f9602a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.AppCompatImageView_tintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(this.f9602a.getContext(), i);
            if (drawable != null) {
                DrawableUtils.m64297a(drawable);
            }
            this.f9602a.setImageDrawable(drawable);
        } else {
            this.f9602a.setImageDrawable(null);
        }
        m64343c();
    }
}
