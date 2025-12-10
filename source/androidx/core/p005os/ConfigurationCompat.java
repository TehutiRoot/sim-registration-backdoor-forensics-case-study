package androidx.core.p005os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.ConfigurationCompat */
/* loaded from: classes2.dex */
public final class ConfigurationCompat {

    /* renamed from: androidx.core.os.ConfigurationCompat$a */
    /* loaded from: classes2.dex */
    public static class C4036a {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m57193a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleListCompat.wrap(C4036a.m57193a(configuration));
        }
        return LocaleListCompat.create(configuration.locale);
    }
}
