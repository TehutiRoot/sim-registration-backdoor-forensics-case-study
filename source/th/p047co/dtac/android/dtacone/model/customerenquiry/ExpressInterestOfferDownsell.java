package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J¡\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u0006;"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/ExpressInterestOfferDownsell;", "", "userLan", "", "userCode", "userFormatType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "requestId", "requesterApplication", "locationId", "flowId", "togglePostpaidEnable", "campaignID", "offerPOID", "requesterChannel", "requesterZone", "togglePrepaidEnable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "getFlowId", "getLocationId", "setLocationId", "(Ljava/lang/String;)V", "getOfferPOID", "getRequestId", "getRequesterApplication", "getRequesterChannel", "getRequesterZone", "getSubscriberNumber", "getTelephoneType", "getTogglePostpaidEnable", "getTogglePrepaidEnable", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.ExpressInterestOfferDownsell */
/* loaded from: classes8.dex */
public final class ExpressInterestOfferDownsell {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @NotNull
    private final String campaignID;
    @SerializedName("flowIds")
    @NotNull
    private final String flowId;
    @SerializedName("locationId")
    @NotNull
    private String locationId;
    @SerializedName("offerPOID")
    @NotNull
    private final String offerPOID;
    @SerializedName("requestId")
    @NotNull
    private final String requestId;
    @SerializedName("requesterApplication")
    @NotNull
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private final String requesterChannel;
    @SerializedName("requesterZone")
    @NotNull
    private final String requesterZone;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("togglePostpaidEnable")
    @NotNull
    private final String togglePostpaidEnable;
    @SerializedName("togglePrepaidEnable")
    @Nullable
    private final String togglePrepaidEnable;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public ExpressInterestOfferDownsell(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String requestId, @NotNull String requesterApplication, @NotNull String locationId, @NotNull String flowId, @NotNull String togglePostpaidEnable, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @NotNull String requesterZone, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.requestId = requestId;
        this.requesterApplication = requesterApplication;
        this.locationId = locationId;
        this.flowId = flowId;
        this.togglePostpaidEnable = togglePostpaidEnable;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterChannel = requesterChannel;
        this.requesterZone = requesterZone;
        this.togglePrepaidEnable = str;
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component10() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final String component11() {
        return this.campaignID;
    }

    @NotNull
    public final String component12() {
        return this.offerPOID;
    }

    @NotNull
    public final String component13() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component14() {
        return this.requesterZone;
    }

    @Nullable
    public final String component15() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.userFormatType;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component5() {
        return this.telephoneType;
    }

    @NotNull
    public final String component6() {
        return this.requestId;
    }

    @NotNull
    public final String component7() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component8() {
        return this.locationId;
    }

    @NotNull
    public final String component9() {
        return this.flowId;
    }

    @NotNull
    public final ExpressInterestOfferDownsell copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String requestId, @NotNull String requesterApplication, @NotNull String locationId, @NotNull String flowId, @NotNull String togglePostpaidEnable, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @NotNull String requesterZone, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        return new ExpressInterestOfferDownsell(userLan, userCode, userFormatType, subscriberNumber, telephoneType, requestId, requesterApplication, locationId, flowId, togglePostpaidEnable, campaignID, offerPOID, requesterChannel, requesterZone, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpressInterestOfferDownsell) {
            ExpressInterestOfferDownsell expressInterestOfferDownsell = (ExpressInterestOfferDownsell) obj;
            return Intrinsics.areEqual(this.userLan, expressInterestOfferDownsell.userLan) && Intrinsics.areEqual(this.userCode, expressInterestOfferDownsell.userCode) && Intrinsics.areEqual(this.userFormatType, expressInterestOfferDownsell.userFormatType) && Intrinsics.areEqual(this.subscriberNumber, expressInterestOfferDownsell.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, expressInterestOfferDownsell.telephoneType) && Intrinsics.areEqual(this.requestId, expressInterestOfferDownsell.requestId) && Intrinsics.areEqual(this.requesterApplication, expressInterestOfferDownsell.requesterApplication) && Intrinsics.areEqual(this.locationId, expressInterestOfferDownsell.locationId) && Intrinsics.areEqual(this.flowId, expressInterestOfferDownsell.flowId) && Intrinsics.areEqual(this.togglePostpaidEnable, expressInterestOfferDownsell.togglePostpaidEnable) && Intrinsics.areEqual(this.campaignID, expressInterestOfferDownsell.campaignID) && Intrinsics.areEqual(this.offerPOID, expressInterestOfferDownsell.offerPOID) && Intrinsics.areEqual(this.requesterChannel, expressInterestOfferDownsell.requesterChannel) && Intrinsics.areEqual(this.requesterZone, expressInterestOfferDownsell.requesterZone) && Intrinsics.areEqual(this.togglePrepaidEnable, expressInterestOfferDownsell.togglePrepaidEnable);
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

    @NotNull
    public final String getLocationId() {
        return this.locationId;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getTogglePostpaidEnable() {
        return this.togglePostpaidEnable;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.locationId.hashCode()) * 31) + this.flowId.hashCode()) * 31) + this.togglePostpaidEnable.hashCode()) * 31) + this.campaignID.hashCode()) * 31) + this.offerPOID.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterZone.hashCode()) * 31;
        String str = this.togglePrepaidEnable;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setLocationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locationId = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.subscriberNumber;
        String str5 = this.telephoneType;
        String str6 = this.requestId;
        String str7 = this.requesterApplication;
        String str8 = this.locationId;
        String str9 = this.flowId;
        String str10 = this.togglePostpaidEnable;
        String str11 = this.campaignID;
        String str12 = this.offerPOID;
        String str13 = this.requesterChannel;
        String str14 = this.requesterZone;
        String str15 = this.togglePrepaidEnable;
        return "ExpressInterestOfferDownsell(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", subscriberNumber=" + str4 + ", telephoneType=" + str5 + ", requestId=" + str6 + ", requesterApplication=" + str7 + ", locationId=" + str8 + ", flowId=" + str9 + ", togglePostpaidEnable=" + str10 + ", campaignID=" + str11 + ", offerPOID=" + str12 + ", requesterChannel=" + str13 + ", requesterZone=" + str14 + ", togglePrepaidEnable=" + str15 + ")";
    }

    public /* synthetic */ ExpressInterestOfferDownsell(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? RequestKt.REQUESTER_APPLICATION : str7, (i & 128) != 0 ? "" : str8, str9, str10, str11, str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15);
    }
}
