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
    public static int f61618a = Color.parseColor("#FFFFFF");

    /* renamed from: b */
    public static int f61619b = Color.parseColor("#D50000");

    /* renamed from: c */
    public static int f61620c = Color.parseColor("#3F51B5");

    /* renamed from: d */
    public static int f61621d = Color.parseColor("#388E3C");

    /* renamed from: e */
    public static int f61622e = Color.parseColor("#FFA900");

    /* renamed from: f */
    public static int f61623f = Color.parseColor("#353A3E");

    /* renamed from: g */
    public static final Typeface f61624g;

    /* renamed from: h */
    public static Typeface f61625h;

    /* renamed from: i */
    public static int f61626i;

    /* renamed from: j */
    public static boolean f61627j;

    /* loaded from: classes5.dex */
    public static class Config {

        /* renamed from: a */
        public int f61628a = Toasty.f61618a;

        /* renamed from: b */
        public int f61629b = Toasty.f61619b;

        /* renamed from: c */
        public int f61630c = Toasty.f61620c;

        /* renamed from: d */
        public int f61631d = Toasty.f61621d;

        /* renamed from: e */
        public int f61632e = Toasty.f61622e;

        /* renamed from: f */
        public Typeface f61633f = Toasty.f61625h;

        /* renamed from: g */
        public int f61634g = Toasty.f61626i;

        /* renamed from: h */
        public boolean f61635h = Toasty.f61627j;

        @CheckResult
        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            int unused = Toasty.f61618a = Color.parseColor("#FFFFFF");
            int unused2 = Toasty.f61619b = Color.parseColor("#D50000");
            int unused3 = Toasty.f61620c = Color.parseColor("#3F51B5");
            int unused4 = Toasty.f61621d = Color.parseColor("#388E3C");
            int unused5 = Toasty.f61622e = Color.parseColor("#FFA900");
            Typeface unused6 = Toasty.f61625h = Toasty.f61624g;
            int unused7 = Toasty.f61626i = 16;
            boolean unused8 = Toasty.f61627j = true;
        }

        public void apply() {
            int unused = Toasty.f61618a = this.f61628a;
            int unused2 = Toasty.f61619b = this.f61629b;
            int unused3 = Toasty.f61620c = this.f61630c;
            int unused4 = Toasty.f61621d = this.f61631d;
            int unused5 = Toasty.f61622e = this.f61632e;
            Typeface unused6 = Toasty.f61625h = this.f61633f;
            int unused7 = Toasty.f61626i = this.f61634g;
            boolean unused8 = Toasty.f61627j = this.f61635h;
        }

        @CheckResult
        public Config setErrorColor(@ColorInt int i) {
            this.f61629b = i;
            return this;
        }

        @CheckResult
        public Config setInfoColor(@ColorInt int i) {
            this.f61630c = i;
            return this;
        }

        @CheckResult
        public Config setSuccessColor(@ColorInt int i) {
            this.f61631d = i;
            return this;
        }

        @CheckResult
        public Config setTextColor(@ColorInt int i) {
            this.f61628a = i;
            return this;
        }

        @CheckResult
        public Config setTextSize(int i) {
            this.f61634g = i;
            return this;
        }

        @CheckResult
        public Config setToastTypeface(@NonNull Typeface typeface) {
            this.f61633f = typeface;
            return this;
        }

        @CheckResult
        public Config setWarningColor(@ColorInt int i) {
            this.f61632e = i;
            return this;
        }

        @CheckResult
        public Config tintIcon(boolean z) {
            this.f61635h = z;
            return this;
        }
    }

    static {
        Typeface create = Typeface.create("sans-serif-condensed", 0);
        f61624g = create;
        f61625h = create;
        f61626i = 16;
        f61627j = true;
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
        return custom(context, charSequence, AbstractC10184a.m31421a(context, i), i2, i3, z, z2);
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
        Drawable m31421a;
        Toast makeText = Toast.makeText(context, "", i2);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.toast_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.toast_text);
        if (z2) {
            m31421a = AbstractC10184a.m31419c(context, i);
        } else {
            m31421a = AbstractC10184a.m31421a(context, R.drawable.toast_frame);
        }
        AbstractC10184a.m31420b(inflate, m31421a);
        if (!z) {
            imageView.setVisibility(8);
        } else if (drawable != null) {
            if (f61627j) {
                drawable = AbstractC10184a.m31418d(drawable, f61618a);
            }
            AbstractC10184a.m31420b(imageView, drawable);
        } else {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        textView.setText(charSequence);
        textView.setTextColor(f61618a);
        textView.setTypeface(f61625h);
        textView.setTextSize(2, f61626i);
        makeText.setView(inflate);
        return makeText;
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10184a.m31421a(context, R.drawable.ic_clear_white_48dp), f61619b, i, z, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10184a.m31421a(context, R.drawable.ic_info_outline_white_48dp), f61620c, i, z, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i) {
        return normal(context, charSequence, i, null, false);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10184a.m31421a(context, R.drawable.ic_check_white_48dp), f61621d, i, z, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence charSequence, int i, boolean z) {
        return custom(context, charSequence, AbstractC10184a.m31421a(context, R.drawable.ic_error_outline_white_48dp), f61622e, i, z, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i, Drawable drawable) {
        return normal(context, charSequence, i, drawable, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence charSequence, int i, Drawable drawable, boolean z) {
        return custom(context, charSequence, drawable, f61623f, i, z, true);
    }
}
