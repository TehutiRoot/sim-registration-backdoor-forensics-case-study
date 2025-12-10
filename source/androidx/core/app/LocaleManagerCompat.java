package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.AnyThread;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.core.p005os.BuildCompat;
import androidx.core.p005os.LocaleListCompat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class LocaleManagerCompat {

    /* renamed from: androidx.core.app.LocaleManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3849a {
        @DoNotInline
        /* renamed from: a */
        public static String m57904a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.core.app.LocaleManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3850b {
        @DoNotInline
        /* renamed from: a */
        public static LocaleListCompat m57903a(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    /* renamed from: androidx.core.app.LocaleManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3851c {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m57902a(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    /* renamed from: a */
    public static LocaleListCompat m57906a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3850b.m57903a(configuration);
        }
        return LocaleListCompat.forLanguageTags(C3849a.m57904a(configuration.locale));
    }

    /* renamed from: b */
    public static Object m57905b(Context context) {
        return context.getSystemService("locale");
    }

    @NonNull
    @AnyThread
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static LocaleListCompat getSystemLocales(@NonNull Context context) {
        LocaleListCompat emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        if (BuildCompat.isAtLeastT()) {
            Object m57905b = m57905b(context);
            if (m57905b != null) {
                return LocaleListCompat.wrap(C3851c.m57902a(m57905b));
            }
            return emptyLocaleList;
        }
        return m57906a(context.getApplicationContext().getResources().getConfiguration());
    }
}
