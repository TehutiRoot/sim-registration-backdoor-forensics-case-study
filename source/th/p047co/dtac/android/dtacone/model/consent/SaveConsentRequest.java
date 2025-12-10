package th.p047co.dtac.android.dtacone.model.consent;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.BuildConfig;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bR\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/consent/SaveConsentRequest;", "", "mrtrUserId", "", "mrtrConsentId", "platform", "", "clientOsVersion", "clientDevice", "udid", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMrtrConsentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.SaveConsentRequest */
/* loaded from: classes8.dex */
public final class SaveConsentRequest {
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
    private final Long mrtrConsentId;
    @SerializedName("mrtrUserId")
    @Nullable
    private final Long mrtrUserId;
    @SerializedName("platform")
    @NotNull
    private final String platform;
    @SerializedName("udid")
    @NotNull
    private final String udid;

    public SaveConsentRequest(@Nullable Long l, @Nullable Long l2, @NotNull String platform, @Nullable String str, @Nullable String str2, @NotNull String udid, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(udid, "udid");
        this.mrtrUserId = l;
        this.mrtrConsentId = l2;
        this.platform = platform;
        this.clientOsVersion = str;
        this.clientDevice = str2;
        this.udid = udid;
        this.appVersion = str3;
    }

    @Nullable
    public final Long getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public /* synthetic */ SaveConsentRequest(Long l, Long l2, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, (i & 4) != 0 ? "android" : str, (i & 8) != 0 ? Build.VERSION.RELEASE : str2, (i & 16) != 0 ? Build.MODEL : str3, str4, (i & 64) != 0 ? BuildConfig.VERSION_NAME : str5);
    }
}
