package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextUtilsCompat {

    /* renamed from: a */
    public static final Locale f34158a = new Locale("", "");

    /* renamed from: androidx.core.text.TextUtilsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4071a {
        @DoNotInline
        /* renamed from: a */
        public static int m57026a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        return C4071a.m57026a(locale);
    }

    @NonNull
    public static String htmlEncode(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}