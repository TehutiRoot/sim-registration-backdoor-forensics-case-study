package th.p047co.dtac.android.dtacone.extension.format;

import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28850d2 = {"convertString", "", "", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.IntExtenKt */
/* loaded from: classes7.dex */
public final class IntExtenKt {
    @NotNull
    public static final String convertString(int i) {
        if (i > 0) {
            return String.valueOf(i);
        }
        return HelpFormatter.DEFAULT_OPT_PREFIX;
    }
}
