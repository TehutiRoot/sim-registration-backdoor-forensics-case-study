package th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneBuyDolAcceptConsentRequest;", "", "", "mrtrUserId", "", "mrtrConsentId", "", "platform", "clientOsVersion", "clientDevice", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "udid", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Long;", "getMrtrUserId", "()Ljava/lang/Long;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Integer;", "getMrtrConsentId", "()Ljava/lang/Integer;", OperatorName.CURVE_TO, "Ljava/lang/String;", "getPlatform", "()Ljava/lang/String;", "d", "getClientOsVersion", "e", "getClientDevice", OperatorName.FILL_NON_ZERO, "getAppVersion", OperatorName.NON_STROKING_GRAY, "getUdid", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolAcceptConsentRequest */
/* loaded from: classes10.dex */
public final class OneBuyDolAcceptConsentRequest {
    public static final int $stable = 0;
    @SerializedName("mrtrUserId")
    @Nullable

    /* renamed from: a */
    private final Long f88538a;
    @SerializedName("mrtrConsentId")
    @Nullable

    /* renamed from: b */
    private final Integer f88539b;
    @SerializedName("platform")
    @NotNull

    /* renamed from: c */
    private final String f88540c;
    @SerializedName("clientOsVersion")
    @Nullable

    /* renamed from: d */
    private final String f88541d;
    @SerializedName("clientDevice")
    @Nullable

    /* renamed from: e */
    private final String f88542e;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    @Nullable

    /* renamed from: f */
    private final String f88543f;
    @SerializedName("udid")
    @Nullable

    /* renamed from: g */
    private final String f88544g;

    public OneBuyDolAcceptConsentRequest(@Nullable Long l, @Nullable Integer num, @NotNull String platform, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.f88538a = l;
        this.f88539b = num;
        this.f88540c = platform;
        this.f88541d = str;
        this.f88542e = str2;
        this.f88543f = str3;
        this.f88544g = str4;
    }

    @Nullable
    public final String getAppVersion() {
        return this.f88543f;
    }

    @Nullable
    public final String getClientDevice() {
        return this.f88542e;
    }

    @Nullable
    public final String getClientOsVersion() {
        return this.f88541d;
    }

    @Nullable
    public final Integer getMrtrConsentId() {
        return this.f88539b;
    }

    @Nullable
    public final Long getMrtrUserId() {
        return this.f88538a;
    }

    @NotNull
    public final String getPlatform() {
        return this.f88540c;
    }

    @Nullable
    public final String getUdid() {
        return this.f88544g;
    }
}