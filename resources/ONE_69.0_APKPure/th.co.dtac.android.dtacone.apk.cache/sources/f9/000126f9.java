package th.p047co.dtac.android.dtacone.util.constant.credit_card;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/credit_card/CreditCardType;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getVISA", "()Ljava/lang/String;", "VISA", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMASTERCARD", "MASTERCARD", OperatorName.CURVE_TO, "getJCB", "JCB", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.credit_card.CreditCardType */
/* loaded from: classes8.dex */
public final class CreditCardType {
    public static final int $stable = 0;
    @NotNull
    public static final CreditCardType INSTANCE = new CreditCardType();

    /* renamed from: a */
    public static final String f87134a = "VISA";

    /* renamed from: b */
    public static final String f87135b = "MASTERCARD";

    /* renamed from: c */
    public static final String f87136c = "JCB";

    @NotNull
    public final String getJCB() {
        return f87136c;
    }

    @NotNull
    public final String getMASTERCARD() {
        return f87135b;
    }

    @NotNull
    public final String getVISA() {
        return f87134a;
    }
}