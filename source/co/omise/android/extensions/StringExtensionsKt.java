package co.omise.android.extensions;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, m28850d2 = {"capitalizeFirstChar", "", "isContains", "", "str", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String capitalizeFirstChar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(str.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb.append((Object) upperCase);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    public static final boolean isContains(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "str");
        return StringsKt__StringsKt.contains$default((CharSequence) String.valueOf(str), (CharSequence) str2, false, 2, (Object) null);
    }
}
