package th.p047co.dtac.android.dtacone.extension.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0004"}, m28850d2 = {"toPriceWithBath", "", "", "toPriceWithDash", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.PriceExtKt */
/* loaded from: classes7.dex */
public final class PriceExtKt {
    @NotNull
    public static final String toPriceWithBath(int i) {
        return i + " บาท";
    }

    @NotNull
    public static final String toPriceWithDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + " .-";
    }

    @NotNull
    public static final String toPriceWithBath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + " บาท";
    }

    @NotNull
    public static final String toPriceWithDash(int i) {
        return i + " .-";
    }
}
