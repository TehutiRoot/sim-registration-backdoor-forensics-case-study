package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.TintInfo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: U5 */
/* loaded from: classes.dex */
public class C1414U5 {

    /* renamed from: a */
    public final TextView f6516a;

    /* renamed from: b */
    public TintInfo f6517b;

    /* renamed from: c */
    public TintInfo f6518c;

    /* renamed from: d */
    public TintInfo f6519d;

    /* renamed from: e */
    public TintInfo f6520e;

    /* renamed from: f */
    public TintInfo f6521f;

    /* renamed from: g */
    public TintInfo f6522g;

    /* renamed from: h */
    public TintInfo f6523h;

    /* renamed from: i */
    public final C1485V5 f6524i;

    /* renamed from: j */
    public int f6525j = 0;

    /* renamed from: k */
    public int f6526k = -1;

    /* renamed from: l */
    public Typeface f6527l;

    /* renamed from: m */
    public boolean f6528m;

    /* renamed from: U5$b */
    /* loaded from: classes.dex */
    public class RunnableC1416b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TextView f6533a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f6534b;

        /* renamed from: c */
        public final /* synthetic */ int f6535c;

        public RunnableC1416b(TextView textView, Typeface typeface, int i) {
            this.f6533a = textView;
            this.f6534b = typeface;
            this.f6535c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6533a.setTypeface(this.f6534b, this.f6535c);
        }
    }

    /* renamed from: U5$c */
    /* loaded from: classes.dex */
    public static class C1417c {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m66242a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66241b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m66240c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: U5$d */
    /* loaded from: classes.dex */
    public static class C1418d {
        @DoNotInline
        /* renamed from: a */
        public static Locale m66239a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: U5$e */
    /* loaded from: classes.dex */
    public static class C1419e {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m66238a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66237b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: U5$f */
    /* loaded from: classes.dex */
    public static class C1420f {
        @DoNotInline
        /* renamed from: a */
        public static int m66236a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66235b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m66234c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m66233d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: U5$g */
    /* loaded from: classes.dex */
    public static class C1421g {
        @DoNotInline
        /* renamed from: a */
        public static Typeface m66232a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C1414U5(TextView textView) {
        this.f6516a = textView;
        this.f6524i = new C1485V5(textView);
    }

    /* renamed from: d */
    public static TintInfo m66265d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList m64308c = appCompatDrawableManager.m64308c(context, i);
        if (m64308c != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = m64308c;
            return tintInfo;
        }
        return null;
    }

    /* renamed from: A */
    public void m66271A(int i, float f) {
        if (!ViewUtils.f10126b && !m66257l()) {
            m66270B(i, f);
        }
    }

    /* renamed from: B */
    public final void m66270B(int i, float f) {
        this.f6524i.m66047t(i, f);
    }

    /* renamed from: C */
    public final void m66269C(Context context, TintTypedArray tintTypedArray) {
        int i;
        String string;
        boolean z;
        boolean z2;
        this.f6525j = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.f6525j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f6526k = i3;
            if (i3 != -1) {
                this.f6525j &= 2;
            }
        }
        boolean z3 = true;
        if (!tintTypedArray.hasValue(R.styleable.TextAppearance_android_fontFamily) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_typeface)) {
                this.f6528m = false;
                int i4 = tintTypedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            this.f6527l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f6527l = Typeface.SERIF;
                    return;
                }
                this.f6527l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f6527l = null;
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            i = R.styleable.TextAppearance_fontFamily;
        } else {
            i = R.styleable.TextAppearance_android_fontFamily;
        }
        int i5 = this.f6526k;
        int i6 = this.f6525j;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i, this.f6525j, new C1415a(i5, i6, new WeakReference(this.f6516a)));
                if (font != null) {
                    if (i2 >= 28 && this.f6526k != -1) {
                        Typeface create = Typeface.create(font, 0);
                        int i7 = this.f6526k;
                        if ((this.f6525j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f6527l = C1421g.m66232a(create, i7, z2);
                    } else {
                        this.f6527l = font;
                    }
                }
                if (this.f6527l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f6528m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6527l == null && (string = tintTypedArray.getString(i)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f6526k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i8 = this.f6526k;
                if ((this.f6525j & 2) == 0) {
                    z3 = false;
                }
                this.f6527l = C1421g.m66232a(create2, i8, z3);
                return;
            }
            this.f6527l = Typeface.create(string, this.f6525j);
        }
    }

    /* renamed from: a */
    public final void m66268a(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.m64307d(drawable, tintInfo, this.f6516a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void m66267b() {
        if (this.f6517b != null || this.f6518c != null || this.f6519d != null || this.f6520e != null) {
            Drawable[] compoundDrawables = this.f6516a.getCompoundDrawables();
            m66268a(compoundDrawables[0], this.f6517b);
            m66268a(compoundDrawables[1], this.f6518c);
            m66268a(compoundDrawables[2], this.f6519d);
            m66268a(compoundDrawables[3], this.f6520e);
        }
        if (this.f6521f != null || this.f6522g != null) {
            Drawable[] m66242a = C1417c.m66242a(this.f6516a);
            m66268a(m66242a[0], this.f6521f);
            m66268a(m66242a[2], this.f6522g);
        }
    }

    /* renamed from: c */
    public void m66266c() {
        this.f6524i.m66066a();
    }

    /* renamed from: e */
    public int m66264e() {
        return this.f6524i.m66061f();
    }

    /* renamed from: f */
    public int m66263f() {
        return this.f6524i.m66060g();
    }

    /* renamed from: g */
    public int m66262g() {
        return this.f6524i.m66059h();
    }

    /* renamed from: h */
    public int[] m66261h() {
        return this.f6524i.m66058i();
    }

    /* renamed from: i */
    public int m66260i() {
        return this.f6524i.m66057j();
    }

    /* renamed from: j */
    public ColorStateList m66259j() {
        TintInfo tintInfo = this.f6523h;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m66258k() {
        TintInfo tintInfo = this.f6523h;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m66257l() {
        return this.f6524i.m66053n();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m66256m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1414U5.m66256m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void m66255n(WeakReference weakReference, Typeface typeface) {
        if (this.f6528m) {
            this.f6527l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (ViewCompat.isAttachedToWindow(textView)) {
                    textView.post(new RunnableC1416b(textView, typeface, this.f6525j));
                } else {
                    textView.setTypeface(typeface, this.f6525j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m66254o(boolean z, int i, int i2, int i3, int i4) {
        if (!ViewUtils.f10126b) {
            m66266c();
        }
    }

    /* renamed from: p */
    public void m66253p() {
        m66267b();
    }

    /* renamed from: q */
    public void m66252q(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            m66250s(obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor) && (colorStateList3 = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor)) != null) {
                this.f6516a.setTextColor(colorStateList3);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColorLink) && (colorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColorLink)) != null) {
                this.f6516a.setLinkTextColor(colorStateList2);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColorHint) && (colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColorHint)) != null) {
                this.f6516a.setHintTextColor(colorStateList);
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f6516a.setTextSize(0, 0.0f);
        }
        m66269C(context, obtainStyledAttributes);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(R.styleable.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(R.styleable.TextAppearance_fontVariationSettings)) != null) {
            C1420f.m66233d(this.f6516a, string);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f6527l;
        if (typeface != null) {
            this.f6516a.setTypeface(typeface, this.f6525j);
        }
    }

    /* renamed from: r */
    public void m66251r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void m66250s(boolean z) {
        this.f6516a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m66249t(int i, int i2, int i3, int i4) {
        this.f6524i.m66051p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m66248u(int[] iArr, int i) {
        this.f6524i.m66050q(iArr, i);
    }

    /* renamed from: v */
    public void m66247v(int i) {
        this.f6524i.m66049r(i);
    }

    /* renamed from: w */
    public void m66246w(ColorStateList colorStateList) {
        boolean z;
        if (this.f6523h == null) {
            this.f6523h = new TintInfo();
        }
        TintInfo tintInfo = this.f6523h;
        tintInfo.mTintList = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        tintInfo.mHasTintList = z;
        m66243z();
    }

    /* renamed from: x */
    public void m66245x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f6523h == null) {
            this.f6523h = new TintInfo();
        }
        TintInfo tintInfo = this.f6523h;
        tintInfo.mTintMode = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        tintInfo.mHasTintMode = z;
        m66243z();
    }

    /* renamed from: y */
    public final void m66244y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m66242a = C1417c.m66242a(this.f6516a);
                Drawable drawable7 = m66242a[0];
                if (drawable7 == null && m66242a[2] == null) {
                    Drawable[] compoundDrawables = this.f6516a.getCompoundDrawables();
                    TextView textView = this.f6516a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f6516a;
                if (drawable2 == null) {
                    drawable2 = m66242a[1];
                }
                Drawable drawable8 = m66242a[2];
                if (drawable4 == null) {
                    drawable4 = m66242a[3];
                }
                C1417c.m66241b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] m66242a2 = C1417c.m66242a(this.f6516a);
        TextView textView3 = this.f6516a;
        if (drawable5 == null) {
            drawable5 = m66242a2[0];
        }
        if (drawable2 == null) {
            drawable2 = m66242a2[1];
        }
        if (drawable6 == null) {
            drawable6 = m66242a2[2];
        }
        if (drawable4 == null) {
            drawable4 = m66242a2[3];
        }
        C1417c.m66241b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: z */
    public final void m66243z() {
        TintInfo tintInfo = this.f6523h;
        this.f6517b = tintInfo;
        this.f6518c = tintInfo;
        this.f6519d = tintInfo;
        this.f6520e = tintInfo;
        this.f6521f = tintInfo;
        this.f6522g = tintInfo;
    }

    /* renamed from: U5$a */
    /* loaded from: classes.dex */
    public class C1415a extends ResourcesCompat.FontCallback {

        /* renamed from: a */
        public final /* synthetic */ int f6529a;

        /* renamed from: b */
        public final /* synthetic */ int f6530b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f6531c;

        public C1415a(int i, int i2, WeakReference weakReference) {
            this.f6529a = i;
            this.f6530b = i2;
            this.f6531c = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f6529a) != -1) {
                if ((this.f6530b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C1421g.m66232a(typeface, i, z);
            }
            C1414U5.this.m66255n(this.f6531c, typeface);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
        }
    }
}