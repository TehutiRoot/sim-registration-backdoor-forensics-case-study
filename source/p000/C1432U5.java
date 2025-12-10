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
public class C1432U5 {

    /* renamed from: a */
    public final TextView f6202a;

    /* renamed from: b */
    public TintInfo f6203b;

    /* renamed from: c */
    public TintInfo f6204c;

    /* renamed from: d */
    public TintInfo f6205d;

    /* renamed from: e */
    public TintInfo f6206e;

    /* renamed from: f */
    public TintInfo f6207f;

    /* renamed from: g */
    public TintInfo f6208g;

    /* renamed from: h */
    public TintInfo f6209h;

    /* renamed from: i */
    public final C1506V5 f6210i;

    /* renamed from: j */
    public int f6211j = 0;

    /* renamed from: k */
    public int f6212k = -1;

    /* renamed from: l */
    public Typeface f6213l;

    /* renamed from: m */
    public boolean f6214m;

    /* renamed from: U5$b */
    /* loaded from: classes.dex */
    public class RunnableC1434b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TextView f6219a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f6220b;

        /* renamed from: c */
        public final /* synthetic */ int f6221c;

        public RunnableC1434b(TextView textView, Typeface typeface, int i) {
            this.f6219a = textView;
            this.f6220b = typeface;
            this.f6221c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6219a.setTypeface(this.f6220b, this.f6221c);
        }
    }

    /* renamed from: U5$c */
    /* loaded from: classes.dex */
    public static class C1435c {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m66101a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66100b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m66099c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: U5$d */
    /* loaded from: classes.dex */
    public static class C1436d {
        @DoNotInline
        /* renamed from: a */
        public static Locale m66098a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: U5$e */
    /* loaded from: classes.dex */
    public static class C1437e {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m66097a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66096b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: U5$f */
    /* loaded from: classes.dex */
    public static class C1438f {
        @DoNotInline
        /* renamed from: a */
        public static int m66095a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m66094b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m66093c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m66092d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: U5$g */
    /* loaded from: classes.dex */
    public static class C1439g {
        @DoNotInline
        /* renamed from: a */
        public static Typeface m66091a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C1432U5(TextView textView) {
        this.f6202a = textView;
        this.f6210i = new C1506V5(textView);
    }

    /* renamed from: d */
    public static TintInfo m66124d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList m64357c = appCompatDrawableManager.m64357c(context, i);
        if (m64357c != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = m64357c;
            return tintInfo;
        }
        return null;
    }

    /* renamed from: A */
    public void m66130A(int i, float f) {
        if (!ViewUtils.f10038b && !m66116l()) {
            m66129B(i, f);
        }
    }

    /* renamed from: B */
    public final void m66129B(int i, float f) {
        this.f6210i.m65923t(i, f);
    }

    /* renamed from: C */
    public final void m66128C(Context context, TintTypedArray tintTypedArray) {
        int i;
        String string;
        boolean z;
        boolean z2;
        this.f6211j = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.f6211j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f6212k = i3;
            if (i3 != -1) {
                this.f6211j &= 2;
            }
        }
        boolean z3 = true;
        if (!tintTypedArray.hasValue(R.styleable.TextAppearance_android_fontFamily) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_typeface)) {
                this.f6214m = false;
                int i4 = tintTypedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            this.f6213l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f6213l = Typeface.SERIF;
                    return;
                }
                this.f6213l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f6213l = null;
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            i = R.styleable.TextAppearance_fontFamily;
        } else {
            i = R.styleable.TextAppearance_android_fontFamily;
        }
        int i5 = this.f6212k;
        int i6 = this.f6211j;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i, this.f6211j, new C1433a(i5, i6, new WeakReference(this.f6202a)));
                if (font != null) {
                    if (i2 >= 28 && this.f6212k != -1) {
                        Typeface create = Typeface.create(font, 0);
                        int i7 = this.f6212k;
                        if ((this.f6211j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f6213l = C1439g.m66091a(create, i7, z2);
                    } else {
                        this.f6213l = font;
                    }
                }
                if (this.f6213l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f6214m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6213l == null && (string = tintTypedArray.getString(i)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f6212k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i8 = this.f6212k;
                if ((this.f6211j & 2) == 0) {
                    z3 = false;
                }
                this.f6213l = C1439g.m66091a(create2, i8, z3);
                return;
            }
            this.f6213l = Typeface.create(string, this.f6211j);
        }
    }

    /* renamed from: a */
    public final void m66127a(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.m64356d(drawable, tintInfo, this.f6202a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void m66126b() {
        if (this.f6203b != null || this.f6204c != null || this.f6205d != null || this.f6206e != null) {
            Drawable[] compoundDrawables = this.f6202a.getCompoundDrawables();
            m66127a(compoundDrawables[0], this.f6203b);
            m66127a(compoundDrawables[1], this.f6204c);
            m66127a(compoundDrawables[2], this.f6205d);
            m66127a(compoundDrawables[3], this.f6206e);
        }
        if (this.f6207f != null || this.f6208g != null) {
            Drawable[] m66101a = C1435c.m66101a(this.f6202a);
            m66127a(m66101a[0], this.f6207f);
            m66127a(m66101a[2], this.f6208g);
        }
    }

    /* renamed from: c */
    public void m66125c() {
        this.f6210i.m65942a();
    }

    /* renamed from: e */
    public int m66123e() {
        return this.f6210i.m65937f();
    }

    /* renamed from: f */
    public int m66122f() {
        return this.f6210i.m65936g();
    }

    /* renamed from: g */
    public int m66121g() {
        return this.f6210i.m65935h();
    }

    /* renamed from: h */
    public int[] m66120h() {
        return this.f6210i.m65934i();
    }

    /* renamed from: i */
    public int m66119i() {
        return this.f6210i.m65933j();
    }

    /* renamed from: j */
    public ColorStateList m66118j() {
        TintInfo tintInfo = this.f6209h;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m66117k() {
        TintInfo tintInfo = this.f6209h;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m66116l() {
        return this.f6210i.m65929n();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m66115m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1432U5.m66115m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void m66114n(WeakReference weakReference, Typeface typeface) {
        if (this.f6214m) {
            this.f6213l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (ViewCompat.isAttachedToWindow(textView)) {
                    textView.post(new RunnableC1434b(textView, typeface, this.f6211j));
                } else {
                    textView.setTypeface(typeface, this.f6211j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m66113o(boolean z, int i, int i2, int i3, int i4) {
        if (!ViewUtils.f10038b) {
            m66125c();
        }
    }

    /* renamed from: p */
    public void m66112p() {
        m66126b();
    }

    /* renamed from: q */
    public void m66111q(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            m66109s(obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor) && (colorStateList3 = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor)) != null) {
                this.f6202a.setTextColor(colorStateList3);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColorLink) && (colorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColorLink)) != null) {
                this.f6202a.setLinkTextColor(colorStateList2);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColorHint) && (colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColorHint)) != null) {
                this.f6202a.setHintTextColor(colorStateList);
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f6202a.setTextSize(0, 0.0f);
        }
        m66128C(context, obtainStyledAttributes);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(R.styleable.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(R.styleable.TextAppearance_fontVariationSettings)) != null) {
            C1438f.m66092d(this.f6202a, string);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f6213l;
        if (typeface != null) {
            this.f6202a.setTypeface(typeface, this.f6211j);
        }
    }

    /* renamed from: r */
    public void m66110r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void m66109s(boolean z) {
        this.f6202a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m66108t(int i, int i2, int i3, int i4) {
        this.f6210i.m65927p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m66107u(int[] iArr, int i) {
        this.f6210i.m65926q(iArr, i);
    }

    /* renamed from: v */
    public void m66106v(int i) {
        this.f6210i.m65925r(i);
    }

    /* renamed from: w */
    public void m66105w(ColorStateList colorStateList) {
        boolean z;
        if (this.f6209h == null) {
            this.f6209h = new TintInfo();
        }
        TintInfo tintInfo = this.f6209h;
        tintInfo.mTintList = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        tintInfo.mHasTintList = z;
        m66102z();
    }

    /* renamed from: x */
    public void m66104x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f6209h == null) {
            this.f6209h = new TintInfo();
        }
        TintInfo tintInfo = this.f6209h;
        tintInfo.mTintMode = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        tintInfo.mHasTintMode = z;
        m66102z();
    }

    /* renamed from: y */
    public final void m66103y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m66101a = C1435c.m66101a(this.f6202a);
                Drawable drawable7 = m66101a[0];
                if (drawable7 == null && m66101a[2] == null) {
                    Drawable[] compoundDrawables = this.f6202a.getCompoundDrawables();
                    TextView textView = this.f6202a;
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
                TextView textView2 = this.f6202a;
                if (drawable2 == null) {
                    drawable2 = m66101a[1];
                }
                Drawable drawable8 = m66101a[2];
                if (drawable4 == null) {
                    drawable4 = m66101a[3];
                }
                C1435c.m66100b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] m66101a2 = C1435c.m66101a(this.f6202a);
        TextView textView3 = this.f6202a;
        if (drawable5 == null) {
            drawable5 = m66101a2[0];
        }
        if (drawable2 == null) {
            drawable2 = m66101a2[1];
        }
        if (drawable6 == null) {
            drawable6 = m66101a2[2];
        }
        if (drawable4 == null) {
            drawable4 = m66101a2[3];
        }
        C1435c.m66100b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: z */
    public final void m66102z() {
        TintInfo tintInfo = this.f6209h;
        this.f6203b = tintInfo;
        this.f6204c = tintInfo;
        this.f6205d = tintInfo;
        this.f6206e = tintInfo;
        this.f6207f = tintInfo;
        this.f6208g = tintInfo;
    }

    /* renamed from: U5$a */
    /* loaded from: classes.dex */
    public class C1433a extends ResourcesCompat.FontCallback {

        /* renamed from: a */
        public final /* synthetic */ int f6215a;

        /* renamed from: b */
        public final /* synthetic */ int f6216b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f6217c;

        public C1433a(int i, int i2, WeakReference weakReference) {
            this.f6215a = i;
            this.f6216b = i2;
            this.f6217c = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f6215a) != -1) {
                if ((this.f6216b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C1439g.m66091a(typeface, i, z);
            }
            C1432U5.this.m66114n(this.f6217c, typeface);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
        }
    }
}
