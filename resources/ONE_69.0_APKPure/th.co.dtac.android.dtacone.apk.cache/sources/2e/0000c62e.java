package es.dmoral.toasty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

@SuppressLint({"InflateParams"})
/* loaded from: classes5.dex */
public class Toasty {

    /* renamed from: a */
    public static int f61686a = Color.parseColor("#FFFFFF");

    /* renamed from: b */
    public static int f61687b = Color.parseColor("#D50000");

    /* renamed from: c */
    public static int f61688c = Color.parseColor("#3F51B5");

    /* renamed from: d */
    public static int f61689d = Color.parseColor("#388E3C");

    /* renamed from: e */
    public static int f61690e = Color.parseColor("#FFA900");

    /* renamed from: f */
    public static int f61691f = Color.parseColor("#353A3E");

    /* renamed from: g */
    public static final Typeface f61692g;

    /* renamed from: h */
    public static Typeface f61693h;

    /* renamed from: i */
    public static int f61694i;

    /* renamed from: j */
    public static boolean f61695j;

    /* loaded from: classes5.dex */
    public static class Config {

        /* renamed from: a */
        public int f61696a = Toasty.f61686a;

        /* renamed from: b */
        public int f61697b = Toasty.f61687b;

        /* renamed from: c */
        public int f61698c = Toasty.f61688c;

        /* renamed from: d */
        public int f61699d = Toasty.f61689d;

        /* renamed from: e */
        public int f61700e = Toasty.f61690e;

        /* renamed from: f */
        public Typeface f61701f = Toasty.f61693h;

        /* renamed from: g */
        public int f61702g = Toasty.f61694i;

        /* renamed from: h */
        public boolean f61703h = Toasty.f61695j;

        @CheckResult
        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            int unused = Toasty.f61686a = Color.parseColor("#FFFFFF");
            int unused2 = Toasty.f61687b = Color.parseColor("#D50000");
            int unused3 = Toasty.f61688c = Color.parseColor("#3F51B5");
            int unused4 = Toasty.f61689d = Color.parseColor("#388E3C");
            int unused5 = Toasty.f61690e = Color.parseColor("#FFA900");
            Typeface unused6 = Toasty.f61693h = Toasty.f61692g;
            int unused7 = Toasty.f61694i = 16;
            boolean unused8 = Toasty.f61695j = true;
        }

        public void apply() {
            int unused = Toasty.f61686a = this.f61696a;
            int unused2 = Toasty.f61687b = this.f61697b;
            int unused3 = Toasty.f61688c = this.f61698c;
            int unused4 = Toasty.f61689d = this.f61699d;
            int unused5 = Toasty.f61690e = this.f61700e;
            Typeface unused6 = Toasty.f61693h = this.f61701f;
            int unused7 = Toasty.f61694i = this.f61702g;
            boolean unused8 = Toasty.f61695j = this.f61703h;
        }

        @CheckResult
        public Config setErrorColor(@ColorInt int i) {
            this.f61697b = i;
            return this;
        }

        @CheckResult
        public Config setInfoColor(@ColorInt int i) {
            this.f61698c = i;
            return this;
        }

        @CheckResult
        public Config setSuccessColor(@ColorInt int i) {
            this.f61699d = i;
            return this;
        }

        @CheckResult
        public Config setTextColor(@ColorInt int i) {
            this.f61696a = i;
            return this;
        }

        @CheckResult
        public Config setTextSize(int i) {
            this.f61702g = i;
            return this;
        }

        @CheckResult
        public Config setToastTypeface(@NonNull Typeface typeface) {
            this.f61701f = typeface;
            return this;
        }

        @CheckResult
        public Config setWarningColor(@ColorInt int i) {
            this.f61700e = i;
            return this;
        }

        @CheckResult
        public Config tintIcon(boolean z) {
            this.f61703h = z;
            return this;
        }
    }

    static {
        Typeface create = Typeface.create("sans-serif-condensed", 0);
        f61692g = create;
        f61693h = create;
        f61694i = 16;
        f61695j = true;
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence charSequence, Drawable drawable, int i, boolean z) {
        return custom(context, charSequence, drawable, -1, i, z, false);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence charSequence) {
        return error(context, charSequence, 0, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence charSequence) {
        return info(context, charSequence, 0, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence) {
        return normal(context, charSequence, 0, null, false);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence charSequence) {
        return success(context, charSequence, 0, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence charSequence) {
        return warning(context, charSequence, 0, true);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence charSequence, @DrawableRes int i, @ColorInt int i2, int i3, boolean z, boolean z2) {
        return custom(context, charSequence, AbstractC10180a.m31589a(context, i), i2, i3, z, z2);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return error(context, charSequence, i, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return info(context, charSequence, i, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, Drawable drawable) {
        return normal(context, charSequence, 0, drawable, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return success(context, charSequence, i, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return warning(context, charSequence, i, true);
    }

    @CheckResult
    @SuppressLint({"ShowToast"})
    public static Toast custom(@NonNull Context context, @NonNull CharSequence charSequence, Drawable drawable, @ColorInt int i, int i2, boolean z, boolean z2) {
        Drawable m31589a;
        Toast makeText = Toast.makeText(context, "", i2);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.toast_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.toast_text);
        if (z2) {
            m31589a = AbstractC10180a.m31587c(context, i);
        } else {
            m31589a = AbstractC10180a.m31589a(context, R.drawable.toast_frame);
        }
        AbstractC10180a.m31588b(inflate, m31589a);
        if (!z) {
            imageView.setVisibility(8);
        } else if (drawable != null) {
            if (f61695j) {
                drawable = AbstractC10180a.m31586d(drawable, f61686a);
            }
            AbstractC10180a.m31588b(imageView, drawable);
        } else {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        textView.setText(charSequence);
        textView.setTextColor(f61686a);
        textView.setTypeface(f61693h);
        textView.setTextSize(2, f61694i);
        makeText.setView(inflate);
        return makeText;
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10180a.m31589a(context, R.drawable.ic_clear_white_48dp), f61687b, i, z, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10180a.m31589a(context, R.drawable.ic_info_outline_white_48dp), f61688c, i, z, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return normal(context, charSequence, i, null, false);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10180a.m31589a(context, R.drawable.ic_check_white_48dp), f61689d, i, z, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10180a.m31589a(context, R.drawable.ic_error_outline_white_48dp), f61690e, i, z, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i, Drawable drawable) {
        return normal(context, charSequence, i, drawable, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i, Drawable drawable, boolean z) {
        return custom(context, charSequence, drawable, f61691f, i, z, true);
    }
}