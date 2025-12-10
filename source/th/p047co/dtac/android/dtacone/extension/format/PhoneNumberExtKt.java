package th.p047co.dtac.android.dtacone.extension.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001¨\u0006\b"}, m28850d2 = {"toInternational", "", "toLocal", "toMaskFormatFromPretty", "maskLength", "", "toPretty", "toRemoveSpecialChar", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.PhoneNumberExtKt */
/* loaded from: classes7.dex */
public final class PhoneNumberExtKt {
    @NotNull
    public static final String toInternational(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        String internationalNumberFormat = PhoneNumberFormat.toInternationalNumberFormat(str, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
        Intrinsics.checkNotNullExpressionValue(internationalNumberFormat, "toInternationalNumberFor…RY_CALLING_CODE.THAILAND)");
        return internationalNumberFormat;
    }

    @NotNull
    public static final String toLocal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String localNumberFormat = PhoneNumberFormat.toLocalNumberFormat(str, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
        Intrinsics.checkNotNullExpressionValue(localNumberFormat, "toLocalNumberFormat(this…RY_CALLING_CODE.THAILAND)");
        return localNumberFormat;
    }

    @NotNull
    public static final String toMaskFormatFromPretty(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (i2 == 3 || i2 == 7) {
                i2++;
            }
            sb.setCharAt(i2, 'X');
            i2++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "maskString.toString()");
        return sb2;
    }

    @NotNull
    public static final String toPretty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String localNumberWithPrettyFormat = PhoneNumberFormat.toLocalNumberWithPrettyFormat(str, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
        Intrinsics.checkNotNullExpressionValue(localNumberWithPrettyFormat, "toLocalNumberWithPrettyF…RY_CALLING_CODE.THAILAND)");
        return localNumberWithPrettyFormat;
    }

    @NotNull
    public static final String toRemoveSpecialChar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(this)");
        return removeAllSpecialCharacter;
    }
}
