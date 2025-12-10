package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ICUCompat {

    /* renamed from: a */
    public static Method f34046a;

    /* renamed from: androidx.core.text.ICUCompat$a */
    /* loaded from: classes2.dex */
    public static class C4079a {
        @DoNotInline
        /* renamed from: a */
        public static String m57086a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.ICUCompat$b */
    /* loaded from: classes2.dex */
    public static class C4080b {
        @DoNotInline
        /* renamed from: a */
        public static ULocale m57085a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        /* renamed from: b */
        public static ULocale m57084b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m57083c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f34046a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4080b.m57083c(C4080b.m57085a(C4080b.m57084b(locale)));
        }
        try {
            return C4079a.m57086a((Locale) f34046a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return C4079a.m57086a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return C4079a.m57086a(locale);
        }
    }
}
