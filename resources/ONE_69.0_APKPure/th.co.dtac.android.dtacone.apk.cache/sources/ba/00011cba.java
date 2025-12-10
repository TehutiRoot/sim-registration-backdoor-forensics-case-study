package th.p047co.dtac.android.dtacone.model.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolAcceptConsent;", "", "mrtrUserId", "", "mrtrConsentId", "", "platform", "", "clientOsVersion", "clientDevice", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "udid", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getClientDevice", "getClientOsVersion", "getMrtrConsentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMrtrUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlatform", "getUdid", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolAcceptConsent */
/* loaded from: classes8.dex */
public final class BuyDolAcceptConsent {
    public static final int $stable = 0;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    @Nullable
    private final String appVersion;
    @SerializedName("clientDevice")
    @Nullable
    private final String clientDevice;
    @SerializedName("clientOsVersion")
    @Nullable
    private final String clientOsVersion;
    @SerializedName("mrtrConsentId")
    @Nullable
    private final Integer mrtrConsentId;
    @SerializedName("mrtrUserId")
    @Nullable
    private final Long mrtrUserId;
    @SerializedName("platform")
    @NotNull
    private final String platform;
    @SerializedName("udid")
    @Nullable
    private final String udid;

    public BuyDolAcceptConsent(@Nullable Long l, @Nullable Integer num, @NotNull String platform, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.mrtrUserId = l;
        this.mrtrConsentId = num;
        this.platform = platform;
        this.clientOsVersion = str;
        this.clientDevice = str2;
        this.appVersion = str3;
        this.udid = str4;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getClientDevice() {
        return this.clientDevice;
    }

    @Nullable
    public final String getClientOsVersion() {
        return this.clientOsVersion;
    }

    @Nullable
    public final Integer getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final Long getMrtrUserId() {
        return this.mrtrUserId;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getUdid() {
        return this.udid;
    }
}