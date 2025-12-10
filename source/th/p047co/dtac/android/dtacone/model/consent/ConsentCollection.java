package th.p047co.dtac.android.dtacone.model.consent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/consent/ConsentCollection;", "", "consentVersion", "", "platform", "clientOsVersion", "clientDevice", "udid", "mobileNumber", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getClientDevice", "getClientOsVersion", "getConsentVersion", "getMobileNumber", "getPlatform", "getUdid", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentCollection */
/* loaded from: classes8.dex */
public final class ConsentCollection {
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
    @SerializedName("consentVersion")
    @NotNull
    private final String consentVersion;
    @SerializedName("mobileNumber")
    @Nullable
    private final String mobileNumber;
    @SerializedName("platform")
    @NotNull
    private final String platform;
    @SerializedName("udid")
    @Nullable
    private final String udid;

    public ConsentCollection(@NotNull String consentVersion, @NotNull String platform, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.consentVersion = consentVersion;
        this.platform = platform;
        this.clientOsVersion = str;
        this.clientDevice = str2;
        this.udid = str3;
        this.mobileNumber = str4;
        this.appVersion = str5;
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

    @NotNull
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
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
