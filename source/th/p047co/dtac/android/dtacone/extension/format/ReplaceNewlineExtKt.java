package th.p047co.dtac.android.dtacone.extension.format;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0002¨\u0006\u0005"}, m28850d2 = {"", "toReplaceNewLineWithBlank", "(Ljava/lang/String;)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.extension.format.ReplaceNewlineExtKt */
/* loaded from: classes7.dex */
public final class ReplaceNewlineExtKt {
    /* renamed from: a */
    public static final String m19470a(String str) {
        String m19469b = m19469b(str);
        if (m19469b != null) {
            return AbstractC20204hN1.replace(m19469b, "\n", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, false);
        }
        return null;
    }

    /* renamed from: b */
    public static final String m19469b(String str) {
        if (str != null) {
            return AbstractC20204hN1.replace(str, "\r\n", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, false);
        }
        return null;
    }

    @Nullable
    public static final String toReplaceNewLineWithBlank(@Nullable String str) {
        return m19470a(m19469b(str));
    }
}
