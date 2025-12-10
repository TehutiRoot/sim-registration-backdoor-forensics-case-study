package th.p047co.dtac.android.dtacone.util.format;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/BankAccountFormat;", "", "()V", "convertToBankAccount", "", "number", "oneConvertToBankAccount", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.format.BankAccountFormat */
/* loaded from: classes8.dex */
public final class BankAccountFormat {
    public static final int $stable = 0;

    @NotNull
    public final String convertToBankAccount(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (number.length() == 10) {
            char charAt = number.charAt(3);
            String substring = number.substring(4, 9);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return "XXX-" + charAt + HelpFormatter.DEFAULT_OPT_PREFIX + substring + "-X";
        }
        return number;
    }

    @NotNull
    public final String oneConvertToBankAccount(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (number.length() == 10) {
            String substring = number.substring(6, 9);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            char charAt = number.charAt(number.length() - 1);
            return "XXX-X-XX" + substring + HelpFormatter.DEFAULT_OPT_PREFIX + charAt;
        }
        return number;
    }
}