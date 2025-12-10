package th.p047co.dtac.android.dtacone.extension.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.format.IdCardFormat;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m28850d2 = {"toThaiIdCardSpaceFormat", "", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.IdCardNumberExtKt */
/* loaded from: classes7.dex */
public final class IdCardNumberExtKt {
    @NotNull
    public static final String toThaiIdCardSpaceFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return IdCardFormat.Companion.toLocalNumberWithPrettyFormat(str);
    }
}
