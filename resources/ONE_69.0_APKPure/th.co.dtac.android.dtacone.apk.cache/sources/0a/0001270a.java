package th.p047co.dtac.android.dtacone.util.constant.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/postpaid/InvoiceLanguage;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLANG_TH", "()Ljava/lang/String;", "LANG_TH", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLANG_EN", "LANG_EN", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.postpaid.InvoiceLanguage */
/* loaded from: classes8.dex */
public final class InvoiceLanguage {
    public static final int $stable = 0;
    @NotNull
    public static final InvoiceLanguage INSTANCE = new InvoiceLanguage();

    /* renamed from: a */
    public static final String f87143a = StandardStructureTypes.f60307TH;

    /* renamed from: b */
    public static final String f87144b = "EN";

    @NotNull
    public final String getLANG_EN() {
        return f87144b;
    }

    @NotNull
    public final String getLANG_TH() {
        return f87143a;
    }
}