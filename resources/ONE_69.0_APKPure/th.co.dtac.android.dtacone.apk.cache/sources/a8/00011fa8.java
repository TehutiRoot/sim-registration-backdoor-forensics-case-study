package th.p047co.dtac.android.dtacone.model.p2post;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.p2post.Pre2PostAcceptConsentCollection */
/* loaded from: classes8.dex */
public class Pre2PostAcceptConsentCollection {
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    private String appVersion;
    @SerializedName("clientDevice")
    private String clientDevice;
    @SerializedName("clientOsVersion")
    private String clientOsVersion;
    @SerializedName("mrtrConsentId")
    private int mrtrConsentId;
    @SerializedName("mrtrUserId")
    private Long mrtrUserId;
    @SerializedName("platform")
    private String platform;
    @SerializedName("udid")
    private String udid;

    public Pre2PostAcceptConsentCollection() {
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getClientDevice() {
        return this.clientDevice;
    }

    public String getClientOsVersion() {
        return this.clientOsVersion;
    }

    public int getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public Long getMrtrUserId() {
        return this.mrtrUserId;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getUdid() {
        return this.udid;
    }

    public void setClientOsVersion(String str) {
        this.clientOsVersion = str;
    }

    public Pre2PostAcceptConsentCollection(Long l, int i, String str, String str2, String str3, String str4, String str5) {
        this.mrtrUserId = l;
        this.mrtrConsentId = i;
        this.platform = str;
        this.clientOsVersion = str2;
        this.clientDevice = str3;
        this.udid = str4;
        this.appVersion = str5;
    }
}