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
    public static Method f34134a;

    /* renamed from: androidx.core.text.ICUCompat$a */
    /* loaded from: classes2.dex */
    public static class C4061a {
        @DoNotInline
        /* renamed from: a */
        public static String m57036a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.ICUCompat$b */
    /* loaded from: classes2.dex */
    public static class C4062b {
        @DoNotInline
        /* renamed from: a */
        public static ULocale m57035a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        /* renamed from: b */
        public static ULocale m57034b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m57033c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f34134a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4062b.m57033c(C4062b.m57035a(C4062b.m57034b(locale)));
        }
        try {
            return C4061a.m57036a((Locale) f34134a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return C4061a.m57036a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return C4061a.m57036a(locale);
        }
    }
}