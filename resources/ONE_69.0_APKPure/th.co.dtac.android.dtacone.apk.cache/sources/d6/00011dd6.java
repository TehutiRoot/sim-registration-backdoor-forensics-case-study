package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J½\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\rHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u001e\u0010!\u001a\u00020\u00038F@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019¨\u0006K"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "", "offerId", "", "offerScore", "", "packageCode", "packageGroupCode", "packageDescription", "flowId", "localtionId", "locationName", FirebaseAnalytics.Param.INDEX, "", "packagePrice", "packageValidityPeriod", "sms", "voice", "net", "wifi", "campaignID", "offerPOID", "requesterLocation", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "getFlowId", "getIndex", "()I", "setIndex", "(I)V", "getLocaltionId", "getLocationName", "marketingDescriptionThai", "getMarketingDescriptionThai", "setMarketingDescriptionThai", "(Ljava/lang/String;)V", "getNet", "getOfferId", "getOfferPOID", "getOfferScore", "()F", "getPackageCode", "getPackageDescription", "getPackageGroupCode", "getPackagePrice", "getPackageValidityPeriod", "getRequesterLocation", "getSms", "getVoice", "getWifi", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.OffersPackage */
/* loaded from: classes8.dex */
public final class OffersPackage {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @NotNull
    private final String campaignID;
    @SerializedName("flowId")
    @NotNull
    private final String flowId;
    private transient int index;
    @SerializedName("localtionId")
    @NotNull
    private final String localtionId;
    @SerializedName("locationName")
    @NotNull
    private final String locationName;
    @SerializedName("marketingDescriptionThai")
    @NotNull
    private String marketingDescriptionThai;
    @SerializedName("net")
    @NotNull

    /* renamed from: net  reason: collision with root package name */
    private final String f109823net;
    @SerializedName("offerId")
    @NotNull
    private final String offerId;
    @SerializedName("offerPOID")
    @NotNull
    private final String offerPOID;
    @SerializedName("offerScore")
    private final float offerScore;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("packageDescription")
    @NotNull
    private final String packageDescription;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("packagePrice")
    @NotNull
    private final String packagePrice;
    @SerializedName("packageValidityPeriod")
    @NotNull
    private final String packageValidityPeriod;
    @SerializedName("requesterLocation")
    @NotNull
    private final String requesterLocation;
    @SerializedName("sms")
    @NotNull
    private final String sms;
    @SerializedName("voice")
    @NotNull
    private final String voice;
    @SerializedName("wifi")
    @NotNull
    private final String wifi;

    public OffersPackage() {
        this(null, 0.0f, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @NotNull
    public final String component1() {
        return this.offerId;
    }

    @NotNull
    public final String component10() {
        return this.packagePrice;
    }

    @NotNull
    public final String component11() {
        return this.packageValidityPeriod;
    }

    @NotNull
    public final String component12() {
        return this.sms;
    }

    @NotNull
    public final String component13() {
        return this.voice;
    }

    @NotNull
    public final String component14() {
        return this.f109823net;
    }

    @NotNull
    public final String component15() {
        return this.wifi;
    }

    @NotNull
    public final String component16() {
        return this.campaignID;
    }

    @NotNull
    public final String component17() {
        return this.offerPOID;
    }

    @NotNull
    public final String component18() {
        return this.requesterLocation;
    }

    public final float component2() {
        return this.offerScore;
    }

    @NotNull
    public final String component3() {
        return this.packageCode;
    }

    @NotNull
    public final String component4() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component5() {
        return this.packageDescription;
    }

    @NotNull
    public final String component6() {
        return this.flowId;
    }

    @NotNull
    public final String component7() {
        return this.localtionId;
    }

    @NotNull
    public final String component8() {
        return this.locationName;
    }

    public final int component9() {
        return this.index;
    }

    @NotNull
    public final OffersPackage copy(@NotNull String offerId, float f, @NotNull String packageCode, @NotNull String packageGroupCode, @NotNull String packageDescription, @NotNull String flowId, @NotNull String localtionId, @NotNull String locationName, int i, @NotNull String packagePrice, @NotNull String packageValidityPeriod, @NotNull String sms, @NotNull String voice, @NotNull String net2, @NotNull String wifi, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterLocation) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(localtionId, "localtionId");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(packagePrice, "packagePrice");
        Intrinsics.checkNotNullParameter(packageValidityPeriod, "packageValidityPeriod");
        Intrinsics.checkNotNullParameter(sms, "sms");
        Intrinsics.checkNotNullParameter(voice, "voice");
        Intrinsics.checkNotNullParameter(net2, "net");
        Intrinsics.checkNotNullParameter(wifi, "wifi");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterLocation, "requesterLocation");
        return new OffersPackage(offerId, f, packageCode, packageGroupCode, packageDescription, flowId, localtionId, locationName, i, packagePrice, packageValidityPeriod, sms, voice, net2, wifi, campaignID, offerPOID, requesterLocation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffersPackage) {
            OffersPackage offersPackage = (OffersPackage) obj;
            return Intrinsics.areEqual(this.offerId, offersPackage.offerId) && Float.compare(this.offerScore, offersPackage.offerScore) == 0 && Intrinsics.areEqual(this.packageCode, offersPackage.packageCode) && Intrinsics.areEqual(this.packageGroupCode, offersPackage.packageGroupCode) && Intrinsics.areEqual(this.packageDescription, offersPackage.packageDescription) && Intrinsics.areEqual(this.flowId, offersPackage.flowId) && Intrinsics.areEqual(this.localtionId, offersPackage.localtionId) && Intrinsics.areEqual(this.locationName, offersPackage.locationName) && this.index == offersPackage.index && Intrinsics.areEqual(this.packagePrice, offersPackage.packagePrice) && Intrinsics.areEqual(this.packageValidityPeriod, offersPackage.packageValidityPeriod) && Intrinsics.areEqual(this.sms, offersPackage.sms) && Intrinsics.areEqual(this.voice, offersPackage.voice) && Intrinsics.areEqual(this.f109823net, offersPackage.f109823net) && Intrinsics.areEqual(this.wifi, offersPackage.wifi) && Intrinsics.areEqual(this.campaignID, offersPackage.campaignID) && Intrinsics.areEqual(this.offerPOID, offersPackage.offerPOID) && Intrinsics.areEqual(this.requesterLocation, offersPackage.requesterLocation);
        }
        return false;
    }

    @NotNull
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getFlowId() {
        return this.flowId;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getLocaltionId() {
        return this.localtionId;
    }

    @NotNull
    public final String getLocationName() {
        return this.locationName;
    }

    @NotNull
    public final String getMarketingDescriptionThai() {
        String str = this.packageGroupCode;
        String str2 = this.marketingDescriptionThai;
        return "[" + str + "] " + str2;
    }

    @NotNull
    public final String getNet() {
        return this.f109823net;
    }

    @NotNull
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    public final float getOfferScore() {
        return this.offerScore;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPackagePrice() {
        return this.packagePrice;
    }

    @NotNull
    public final String getPackageValidityPeriod() {
        return this.packageValidityPeriod;
    }

    @NotNull
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    @NotNull
    public final String getSms() {
        return this.sms;
    }

    @NotNull
    public final String getVoice() {
        return this.voice;
    }

    @NotNull
    public final String getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.offerId.hashCode() * 31) + Float.floatToIntBits(this.offerScore)) * 31) + this.packageCode.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.packageDescription.hashCode()) * 31) + this.flowId.hashCode()) * 31) + this.localtionId.hashCode()) * 31) + this.locationName.hashCode()) * 31) + this.index) * 31) + this.packagePrice.hashCode()) * 31) + this.packageValidityPeriod.hashCode()) * 31) + this.sms.hashCode()) * 31) + this.voice.hashCode()) * 31) + this.f109823net.hashCode()) * 31) + this.wifi.hashCode()) * 31) + this.campaignID.hashCode()) * 31) + this.offerPOID.hashCode()) * 31) + this.requesterLocation.hashCode();
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setMarketingDescriptionThai(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.marketingDescriptionThai = str;
    }

    @NotNull
    public String toString() {
        String str = this.offerId;
        float f = this.offerScore;
        String str2 = this.packageCode;
        String str3 = this.packageGroupCode;
        String str4 = this.packageDescription;
        String str5 = this.flowId;
        String str6 = this.localtionId;
        String str7 = this.locationName;
        int i = this.index;
        String str8 = this.packagePrice;
        String str9 = this.packageValidityPeriod;
        String str10 = this.sms;
        String str11 = this.voice;
        String str12 = this.f109823net;
        String str13 = this.wifi;
        String str14 = this.campaignID;
        String str15 = this.offerPOID;
        String str16 = this.requesterLocation;
        return "OffersPackage(offerId=" + str + ", offerScore=" + f + ", packageCode=" + str2 + ", packageGroupCode=" + str3 + ", packageDescription=" + str4 + ", flowId=" + str5 + ", localtionId=" + str6 + ", locationName=" + str7 + ", index=" + i + ", packagePrice=" + str8 + ", packageValidityPeriod=" + str9 + ", sms=" + str10 + ", voice=" + str11 + ", net=" + str12 + ", wifi=" + str13 + ", campaignID=" + str14 + ", offerPOID=" + str15 + ", requesterLocation=" + str16 + ")";
    }

    public OffersPackage(@NotNull String offerId, float f, @NotNull String packageCode, @NotNull String packageGroupCode, @NotNull String packageDescription, @NotNull String flowId, @NotNull String localtionId, @NotNull String locationName, int i, @NotNull String packagePrice, @NotNull String packageValidityPeriod, @NotNull String sms, @NotNull String voice, @NotNull String net2, @NotNull String wifi, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterLocation) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(localtionId, "localtionId");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(packagePrice, "packagePrice");
        Intrinsics.checkNotNullParameter(packageValidityPeriod, "packageValidityPeriod");
        Intrinsics.checkNotNullParameter(sms, "sms");
        Intrinsics.checkNotNullParameter(voice, "voice");
        Intrinsics.checkNotNullParameter(net2, "net");
        Intrinsics.checkNotNullParameter(wifi, "wifi");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterLocation, "requesterLocation");
        this.offerId = offerId;
        this.offerScore = f;
        this.packageCode = packageCode;
        this.packageGroupCode = packageGroupCode;
        this.packageDescription = packageDescription;
        this.flowId = flowId;
        this.localtionId = localtionId;
        this.locationName = locationName;
        this.index = i;
        this.packagePrice = packagePrice;
        this.packageValidityPeriod = packageValidityPeriod;
        this.sms = sms;
        this.voice = voice;
        this.f109823net = net2;
        this.wifi = wifi;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterLocation = requesterLocation;
        this.marketingDescriptionThai = "";
    }

    public /* synthetic */ OffersPackage(String str, float f, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? "" : str15, (i2 & 131072) != 0 ? "" : str16);
    }
}