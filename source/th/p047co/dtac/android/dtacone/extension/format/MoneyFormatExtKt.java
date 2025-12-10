package th.p047co.dtac.android.dtacone.extension.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0007"}, m28850d2 = {"formatMoneyWithoutTrailingZeroes", "", "toMoneyFormat", "", "toMoneyFormatNoFloating", "", "toMoneyFormatWithBigDecimal", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.MoneyFormatExtKt */
/* loaded from: classes7.dex */
public final class MoneyFormatExtKt {
    @NotNull
    public static final String formatMoneyWithoutTrailingZeroes(@Nullable String str) {
        String convertToFormatMoneyWithoutTrailingZeroes = MoneyFormat.convertToFormatMoneyWithoutTrailingZeroes(str);
        Intrinsics.checkNotNullExpressionValue(convertToFormatMoneyWithoutTrailingZeroes, "convertToFormatMoneyWithoutTrailingZeroes(this)");
        return convertToFormatMoneyWithoutTrailingZeroes;
    }

    @NotNull
    public static final String toMoneyFormat(@Nullable String str) {
        String convertToMoneyFormat = MoneyFormat.convertToMoneyFormat(str);
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormat, "convertToMoneyFormat(this)");
        return convertToMoneyFormat;
    }

    @NotNull
    public static final String toMoneyFormatNoFloating(int i) {
        String convertToMoneyFormatNoFloatingPureNumber = MoneyFormat.convertToMoneyFormatNoFloatingPureNumber(i);
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormatNoFloatingPureNumber, "convertToMoneyFormatNoFl…reNumber(this.toDouble())");
        return convertToMoneyFormatNoFloatingPureNumber;
    }

    @NotNull
    public static final String toMoneyFormatWithBigDecimal(@Nullable String str) {
        String convertToMoneyFormatWithBigDecimal = MoneyFormat.convertToMoneyFormatWithBigDecimal(str);
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormatWithBigDecimal, "convertToMoneyFormatWithBigDecimal(this)");
        return convertToMoneyFormatWithBigDecimal;
    }

    @NotNull
    public static final String toMoneyFormat(double d) {
        String convertToMoneyFormat = MoneyFormat.convertToMoneyFormat(d);
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormat, "convertToMoneyFormat(this)");
        return convertToMoneyFormat;
    }

    @NotNull
    public static final String toMoneyFormatNoFloating(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertToMoneyFormatNoFloatingPureNumber = MoneyFormat.convertToMoneyFormatNoFloatingPureNumber(Double.parseDouble(str));
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormatNoFloatingPureNumber, "convertToMoneyFormatNoFl…reNumber(this.toDouble())");
        return convertToMoneyFormatNoFloatingPureNumber;
    }

    @NotNull
    public static final String toMoneyFormatNoFloating(double d) {
        String convertToMoneyFormatNoFloatingPureNumber = MoneyFormat.convertToMoneyFormatNoFloatingPureNumber(d);
        Intrinsics.checkNotNullExpressionValue(convertToMoneyFormatNoFloatingPureNumber, "convertToMoneyFormatNoFloatingPureNumber(this)");
        return convertToMoneyFormatNoFloatingPureNumber;
    }
}
