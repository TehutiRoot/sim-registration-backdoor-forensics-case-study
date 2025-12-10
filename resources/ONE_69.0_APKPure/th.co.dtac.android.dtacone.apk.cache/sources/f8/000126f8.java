package th.p047co.dtac.android.dtacone.util.constant.bank_account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/bank_account/BankAccountType;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSCB_L", "()Ljava/lang/String;", "SCB_L", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getKS", "KS", OperatorName.CURVE_TO, "getKTB", "KTB", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.bank_account.BankAccountType */
/* loaded from: classes8.dex */
public final class BankAccountType {
    public static final int $stable = 0;
    @NotNull
    public static final BankAccountType INSTANCE = new BankAccountType();

    /* renamed from: a */
    public static final String f87131a = "SCB_L";

    /* renamed from: b */
    public static final String f87132b = "KS";

    /* renamed from: c */
    public static final String f87133c = "KTB";

    @NotNull
    public final String getKS() {
        return f87132b;
    }

    @NotNull
    public final String getKTB() {
        return f87133c;
    }

    @NotNull
    public final String getSCB_L() {
        return f87131a;
    }
}