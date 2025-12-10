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
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006?"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/BuyOfferFailRequest;", "", "errorCode", "", "errorDescription", "flowID", "locationID", "requestID", "requesterApplication", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "userCode", "userLan", "userFormatType", "togglePostpaidEnable", "campaignID", "offerPOID", "requesterChannel", "requesterZone", "togglePrepaidEnable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "getErrorCode", "getErrorDescription", "getFlowID", "getLocationID", "getOfferPOID", "getRequestID", "getRequesterApplication", "getRequesterChannel", "getRequesterZone", "getSubscriberNumber", "getTelephoneType", "getTogglePostpaidEnable", "getTogglePrepaidEnable", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.BuyOfferFailRequest */
/* loaded from: classes8.dex */
public final class BuyOfferFailRequest {
    public static final int $stable = 0;
    @SerializedName("campaignID")
    @NotNull
    private final String campaignID;
    @SerializedName("errorCode")
    @NotNull
    private final String errorCode;
    @SerializedName("errorDescription")
    @NotNull
    private final String errorDescription;
    @SerializedName("flowIds")
    @NotNull
    private final String flowID;
    @SerializedName("locationId")
    @NotNull
    private final String locationID;
    @SerializedName("offerPOID")
    @NotNull
    private final String offerPOID;
    @SerializedName("requestId")
    @NotNull
    private final String requestID;
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

    public BuyOfferFailRequest(@NotNull String errorCode, @NotNull String errorDescription, @NotNull String flowID, @NotNull String locationID, @NotNull String requestID, @NotNull String requesterApplication, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType, @NotNull String togglePostpaidEnable, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @NotNull String requesterZone, @Nullable String str) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(flowID, "flowID");
        Intrinsics.checkNotNullParameter(locationID, "locationID");
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.flowID = flowID;
        this.locationID = locationID;
        this.requestID = requestID;
        this.requesterApplication = requesterApplication;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.userCode = userCode;
        this.userLan = userLan;
        this.userFormatType = userFormatType;
        this.togglePostpaidEnable = togglePostpaidEnable;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterChannel = requesterChannel;
        this.requesterZone = requesterZone;
        this.togglePrepaidEnable = str;
    }

    @NotNull
    public final String component1() {
        return this.errorCode;
    }

    @NotNull
    public final String component10() {
        return this.userLan;
    }

    @NotNull
    public final String component11() {
        return this.userFormatType;
    }

    @NotNull
    public final String component12() {
        return this.togglePostpaidEnable;
    }

    @NotNull
    public final String component13() {
        return this.campaignID;
    }

    @NotNull
    public final String component14() {
        return this.offerPOID;
    }

    @NotNull
    public final String component15() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component16() {
        return this.requesterZone;
    }

    @Nullable
    public final String component17() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String component2() {
        return this.errorDescription;
    }

    @NotNull
    public final String component3() {
        return this.flowID;
    }

    @NotNull
    public final String component4() {
        return this.locationID;
    }

    @NotNull
    public final String component5() {
        return this.requestID;
    }

    @NotNull
    public final String component6() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component7() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component8() {
        return this.telephoneType;
    }

    @NotNull
    public final String component9() {
        return this.userCode;
    }

    @NotNull
    public final BuyOfferFailRequest copy(@NotNull String errorCode, @NotNull String errorDescription, @NotNull String flowID, @NotNull String locationID, @NotNull String requestID, @NotNull String requesterApplication, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String userCode, @NotNull String userLan, @NotNull String userFormatType, @NotNull String togglePostpaidEnable, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @NotNull String requesterZone, @Nullable String str) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(flowID, "flowID");
        Intrinsics.checkNotNullParameter(locationID, "locationID");
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(togglePostpaidEnable, "togglePostpaidEnable");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        return new BuyOfferFailRequest(errorCode, errorDescription, flowID, locationID, requestID, requesterApplication, subscriberNumber, telephoneType, userCode, userLan, userFormatType, togglePostpaidEnable, campaignID, offerPOID, requesterChannel, requesterZone, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyOfferFailRequest) {
            BuyOfferFailRequest buyOfferFailRequest = (BuyOfferFailRequest) obj;
            return Intrinsics.areEqual(this.errorCode, buyOfferFailRequest.errorCode) && Intrinsics.areEqual(this.errorDescription, buyOfferFailRequest.errorDescription) && Intrinsics.areEqual(this.flowID, buyOfferFailRequest.flowID) && Intrinsics.areEqual(this.locationID, buyOfferFailRequest.locationID) && Intrinsics.areEqual(this.requestID, buyOfferFailRequest.requestID) && Intrinsics.areEqual(this.requesterApplication, buyOfferFailRequest.requesterApplication) && Intrinsics.areEqual(this.subscriberNumber, buyOfferFailRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, buyOfferFailRequest.telephoneType) && Intrinsics.areEqual(this.userCode, buyOfferFailRequest.userCode) && Intrinsics.areEqual(this.userLan, buyOfferFailRequest.userLan) && Intrinsics.areEqual(this.userFormatType, buyOfferFailRequest.userFormatType) && Intrinsics.areEqual(this.togglePostpaidEnable, buyOfferFailRequest.togglePostpaidEnable) && Intrinsics.areEqual(this.campaignID, buyOfferFailRequest.campaignID) && Intrinsics.areEqual(this.offerPOID, buyOfferFailRequest.offerPOID) && Intrinsics.areEqual(this.requesterChannel, buyOfferFailRequest.requesterChannel) && Intrinsics.areEqual(this.requesterZone, buyOfferFailRequest.requesterZone) && Intrinsics.areEqual(this.togglePrepaidEnable, buyOfferFailRequest.togglePrepaidEnable);
        }
        return false;
    }

    @NotNull
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    public final String getFlowID() {
        return this.flowID;
    }

    @NotNull
    public final String getLocationID() {
        return this.locationID;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final String getRequestID() {
        return this.requestID;
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
        int hashCode = ((((((((((((((((((((((((((((((this.errorCode.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.flowID.hashCode()) * 31) + this.locationID.hashCode()) * 31) + this.requestID.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.togglePostpaidEnable.hashCode()) * 31) + this.campaignID.hashCode()) * 31) + this.offerPOID.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterZone.hashCode()) * 31;
        String str = this.togglePrepaidEnable;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.errorCode;
        String str2 = this.errorDescription;
        String str3 = this.flowID;
        String str4 = this.locationID;
        String str5 = this.requestID;
        String str6 = this.requesterApplication;
        String str7 = this.subscriberNumber;
        String str8 = this.telephoneType;
        String str9 = this.userCode;
        String str10 = this.userLan;
        String str11 = this.userFormatType;
        String str12 = this.togglePostpaidEnable;
        String str13 = this.campaignID;
        String str14 = this.offerPOID;
        String str15 = this.requesterChannel;
        String str16 = this.requesterZone;
        String str17 = this.togglePrepaidEnable;
        return "BuyOfferFailRequest(errorCode=" + str + ", errorDescription=" + str2 + ", flowID=" + str3 + ", locationID=" + str4 + ", requestID=" + str5 + ", requesterApplication=" + str6 + ", subscriberNumber=" + str7 + ", telephoneType=" + str8 + ", userCode=" + str9 + ", userLan=" + str10 + ", userFormatType=" + str11 + ", togglePostpaidEnable=" + str12 + ", campaignID=" + str13 + ", offerPOID=" + str14 + ", requesterChannel=" + str15 + ", requesterZone=" + str16 + ", togglePrepaidEnable=" + str17 + ")";
    }

    public /* synthetic */ BuyOfferFailRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? RequestKt.REQUESTER_APPLICATION : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, str12, str13, str14, (i & 16384) != 0 ? "" : str15, (32768 & i) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
