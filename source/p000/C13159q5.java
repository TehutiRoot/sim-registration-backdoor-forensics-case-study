package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintInfo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

/* renamed from: q5 */
/* loaded from: classes.dex */
public class C13159q5 {

    /* renamed from: a */
    public final View f76852a;

    /* renamed from: d */
    public TintInfo f76855d;

    /* renamed from: e */
    public TintInfo f76856e;

    /* renamed from: f */
    public TintInfo f76857f;

    /* renamed from: c */
    public int f76854c = -1;

    /* renamed from: b */
    public final AppCompatDrawableManager f76853b = AppCompatDrawableManager.get();

    public C13159q5(View view) {
        this.f76852a = view;
    }

    /* renamed from: a */
    public final boolean m23545a(Drawable drawable) {
        if (this.f76857f == null) {
            this.f76857f = new TintInfo();
        }
        TintInfo tintInfo = this.f76857f;
        tintInfo.m64153a();
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.f76852a);
        if (backgroundTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.f76852a);
        if (backgroundTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = backgroundTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.m64356d(drawable, tintInfo, this.f76852a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m23544b() {
        Drawable background = this.f76852a.getBackground();
        if (background != null) {
            if (m23535k() && m23545a(background)) {
                return;
            }
            TintInfo tintInfo = this.f76856e;
            if (tintInfo != null) {
                AppCompatDrawableManager.m64356d(background, tintInfo, this.f76852a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f76855d;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m64356d(background, tintInfo2, this.f76852a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m23543c() {
        TintInfo tintInfo = this.f76856e;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m23542d() {
        TintInfo tintInfo = this.f76856e;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: e */
    public void m23541e(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f76852a.getContext(), attributeSet, R.styleable.ViewBackgroundHelper, i, 0);
        View view = this.f76852a;
        ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), R.styleable.ViewBackgroundHelper, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_android_background)) {
                this.f76854c = obtainStyledAttributes.getResourceId(R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList m64357c = this.f76853b.m64357c(this.f76852a.getContext(), this.f76854c);
                if (m64357c != null) {
                    m23538h(m64357c);
                }
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.setBackgroundTintList(this.f76852a, obtainStyledAttributes.getColorStateList(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.setBackgroundTintMode(this.f76852a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: f */
    public void m23540f(Drawable drawable) {
        this.f76854c = -1;
        m23538h(null);
        m23544b();
    }

    /* renamed from: g */
    public void m23539g(int i) {
        ColorStateList colorStateList;
        this.f76854c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.f76853b;
        if (appCompatDrawableManager != null) {
            colorStateList = appCompatDrawableManager.m64357c(this.f76852a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m23538h(colorStateList);
        m23544b();
    }

    /* renamed from: h */
    public void m23538h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f76855d == null) {
                this.f76855d = new TintInfo();
            }
            TintInfo tintInfo = this.f76855d;
            tintInfo.mTintList = colorStateList;
            tintInfo.mHasTintList = true;
        } else {
            this.f76855d = null;
        }
        m23544b();
    }

    /* renamed from: i */
    public void m23537i(ColorStateList colorStateList) {
        if (this.f76856e == null) {
            this.f76856e = new TintInfo();
        }
        TintInfo tintInfo = this.f76856e;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        m23544b();
    }

    /* renamed from: j */
    public void m23536j(PorterDuff.Mode mode) {
        if (this.f76856e == null) {
            this.f76856e = new TintInfo();
        }
        TintInfo tintInfo = this.f76856e;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        m23544b();
    }

    /* renamed from: k */
    public final boolean m23535k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f76855d == null) {
                return false;
            }
            return true;
        } else if (i != 21) {
            return false;
        } else {
            return true;
        }
    }
}
