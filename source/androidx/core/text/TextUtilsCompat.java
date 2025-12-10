package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextUtilsCompat {

    /* renamed from: a */
    public static final Locale f34070a = new Locale("", "");

    /* renamed from: androidx.core.text.TextUtilsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4089a {
        @DoNotInline
        /* renamed from: a */
        public static int m57076a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        return C4089a.m57076a(locale);
    }

    @NonNull
    public static String htmlEncode(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
