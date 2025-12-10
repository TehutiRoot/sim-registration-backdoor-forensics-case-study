package th.p047co.dtac.android.dtacone.util.constant;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\b¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/Status;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSUCCESS", "()Ljava/lang/String;", "getSUCCESS$annotations", "SUCCESS", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFAILED", "getFAILED$annotations", Constant.QueryTransactionStatus.FAILED, OperatorName.CURVE_TO, "getERROR", "getERROR$annotations", "ERROR", "d", "getPADDING", "getPADDING$annotations", "PADDING", "e", "getYES", "getYES$annotations", "YES", OperatorName.FILL_NON_ZERO, "getNO", "getNO$annotations", "NO", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.Status */
/* loaded from: classes8.dex */
public final class Status {
    public static final int $stable = 0;
    @NotNull
    public static final Status INSTANCE = new Status();

    /* renamed from: a */
    public static final String f87125a = FirebaseAnalytics.Param.SUCCESS;

    /* renamed from: b */
    public static final String f87126b = "failed";

    /* renamed from: c */
    public static final String f87127c = Constants.IPC_BUNDLE_KEY_SEND_ERROR;

    /* renamed from: d */
    public static final String f87128d = "padding";

    /* renamed from: e */
    public static final String f87129e = "Y";

    /* renamed from: f */
    public static final String f87130f = "N";

    @NotNull
    public static final String getERROR() {
        return f87127c;
    }

    @JvmStatic
    public static /* synthetic */ void getERROR$annotations() {
    }

    @NotNull
    public static final String getFAILED() {
        return f87126b;
    }

    @JvmStatic
    public static /* synthetic */ void getFAILED$annotations() {
    }

    @NotNull
    public static final String getNO() {
        return f87130f;
    }

    @JvmStatic
    public static /* synthetic */ void getNO$annotations() {
    }

    @NotNull
    public static final String getPADDING() {
        return f87128d;
    }

    @JvmStatic
    public static /* synthetic */ void getPADDING$annotations() {
    }

    @NotNull
    public static final String getSUCCESS() {
        return f87125a;
    }

    @JvmStatic
    public static /* synthetic */ void getSUCCESS$annotations() {
    }

    @NotNull
    public static final String getYES() {
        return f87129e;
    }

    @JvmStatic
    public static /* synthetic */ void getYES$annotations() {
    }
}