package androidx.core.p005os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.p005os.BuildCompat;
import androidx.core.text.ICUCompat;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* renamed from: androidx.core.os.LocaleListCompat */
/* loaded from: classes2.dex */
public final class LocaleListCompat {

    /* renamed from: b */
    public static final LocaleListCompat f33951b = create(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC18824Yj0 f33952a;

    /* renamed from: androidx.core.os.LocaleListCompat$a */
    /* loaded from: classes2.dex */
    public static class C4041a {

        /* renamed from: a */
        public static final Locale[] f33953a = {new Locale(LanguageSupport.LANG_EN, "XA"), new Locale("ar", "XB")};

        @DoNotInline
        /* renamed from: a */
        public static Locale m57186a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m57185b(Locale locale) {
            for (Locale locale2 : f33953a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57184c(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m57185b(locale) || m57185b(locale2)) {
                return false;
            }
            String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (maximizeAndGetScript.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return maximizeAndGetScript.equals(ICUCompat.maximizeAndGetScript(locale2));
        }
    }

    /* renamed from: androidx.core.os.LocaleListCompat$b */
    /* loaded from: classes2.dex */
    public static class C4042b {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m57183a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        /* renamed from: b */
        public static LocaleList m57182b() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        /* renamed from: c */
        public static LocaleList m57181c() {
            return LocaleList.getDefault();
        }
    }

    public LocaleListCompat(InterfaceC18824Yj0 interfaceC18824Yj0) {
        this.f33952a = interfaceC18824Yj0;
    }

    /* renamed from: a */
    public static Locale m57187a(String str) {
        if (str.contains(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            String[] split = str.split(HelpFormatter.DEFAULT_OPT_PREFIX, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(C4042b.m57183a(localeArr));
        }
        return new LocaleListCompat(new C18568Uj0(localeArr));
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = C4041a.m57186a(split[i]);
            }
            return create(localeArr);
        }
        return getEmptyLocaleList();
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(C4042b.m57182b());
        }
        return create(Locale.getDefault());
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(C4042b.m57181c());
        }
        return create(Locale.getDefault());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return f33951b;
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    @RequiresApi(21)
    public static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
        boolean matchesLanguageAndScript;
        if (BuildCompat.isAtLeastT()) {
            matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
            return matchesLanguageAndScript;
        }
        return C4041a.m57184c(locale, locale2);
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
        return wrap(AbstractC18504Tj0.m66173a(obj));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof LocaleListCompat) && this.f33952a.equals(((LocaleListCompat) obj).f33952a)) {
            return true;
        }
        return false;
    }

    @Nullable
    public Locale get(int i) {
        return this.f33952a.get(i);
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return this.f33952a.mo31495c(strArr);
    }

    public int hashCode() {
        return this.f33952a.hashCode();
    }

    @IntRange(from = -1)
    public int indexOf(@Nullable Locale locale) {
        return this.f33952a.mo31494d(locale);
    }

    public boolean isEmpty() {
        return this.f33952a.isEmpty();
    }

    @IntRange(from = 0)
    public int size() {
        return this.f33952a.size();
    }

    @NonNull
    public String toLanguageTags() {
        return this.f33952a.mo31497a();
    }

    @NonNull
    public String toString() {
        return this.f33952a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.f33952a.mo31496b();
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList) {
        return new LocaleListCompat(new C19743ek0(localeList));
    }
}
