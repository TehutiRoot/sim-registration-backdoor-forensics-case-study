package th.p047co.dtac.android.dtacone.util.constant.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/device_sale/StartDataOption;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getNXCL", "()Ljava/lang/String;", "NXCL", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getNXDY", "NXDY", OperatorName.CURVE_TO, "getIMMD", "IMMD", "d", "getEFFECTIVE_NXDY", "EFFECTIVE_NXDY", "e", "getEFFECTIVE_NXCL", "EFFECTIVE_NXCL", OperatorName.FILL_NON_ZERO, "getEFFECTIVE_IMMD", "EFFECTIVE_IMMD", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.device_sale.StartDataOption */
/* loaded from: classes8.dex */
public final class StartDataOption {
    public static final int $stable = 0;
    @NotNull
    public static final StartDataOption INSTANCE = new StartDataOption();

    /* renamed from: a */
    public static final String f87137a = "NXCL";

    /* renamed from: b */
    public static final String f87138b = "NXDY";

    /* renamed from: c */
    public static final String f87139c = "IMMD";

    /* renamed from: d */
    public static final String f87140d = "ND";

    /* renamed from: e */
    public static final String f87141e = "NC";

    /* renamed from: f */
    public static final String f87142f = "IM";

    @NotNull
    public final String getEFFECTIVE_IMMD() {
        return f87142f;
    }

    @NotNull
    public final String getEFFECTIVE_NXCL() {
        return f87141e;
    }

    @NotNull
    public final String getEFFECTIVE_NXDY() {
        return f87140d;
    }

    @NotNull
    public final String getIMMD() {
        return f87139c;
    }

    @NotNull
    public final String getNXCL() {
        return f87137a;
    }

    @NotNull
    public final String getNXDY() {
        return f87138b;
    }
}