package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u001a¨\u00067"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostBuyRecommendRequest;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "requesterId", "requesterChannel", "requesterApplication", "requesterZone", "requesterLocation", "campaignID", "offerPOID", "userCode", "packageGroupCode", "offersPackage", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCampaignID", "()Ljava/lang/String;", "getOfferPOID", "getOffersPackage", "()Ljava/util/List;", "setOffersPackage", "(Ljava/util/List;)V", "getPackageGroupCode", "setPackageGroupCode", "(Ljava/lang/String;)V", "getRequesterApplication", "getRequesterChannel", "getRequesterId", "setRequesterId", "getRequesterLocation", "getRequesterZone", "getSubscriberNumber", "setSubscriberNumber", "getUserCode", "setUserCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostBuyRecommendRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostBuyRecommendRequest {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @Nullable
    private final String campaignID;
    @SerializedName("offerPOID")
    @Nullable
    private final String offerPOID;
    @SerializedName("offersPackage")
    @NotNull
    private List<OffersPackage> offersPackage;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("requesterApplication")
    @NotNull
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private final String requesterChannel;
    @SerializedName("requesterId")
    @NotNull
    private String requesterId;
    @SerializedName("requesterLocation")
    @Nullable
    private final String requesterLocation;
    @SerializedName("requesterZone")
    @NotNull
    private final String requesterZone;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private String userCode;

    public OnePre2PostBuyRecommendRequest(@NotNull String subscriberNumber, @NotNull String requesterId, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String userCode, @NotNull String packageGroupCode, @NotNull List<OffersPackage> offersPackage) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        this.subscriberNumber = subscriberNumber;
        this.requesterId = requesterId;
        this.requesterChannel = requesterChannel;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.requesterLocation = str;
        this.campaignID = str2;
        this.offerPOID = str3;
        this.userCode = userCode;
        this.packageGroupCode = packageGroupCode;
        this.offersPackage = offersPackage;
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component10() {
        return this.packageGroupCode;
    }

    @NotNull
    public final List<OffersPackage> component11() {
        return this.offersPackage;
    }

    @NotNull
    public final String component2() {
        return this.requesterId;
    }

    @NotNull
    public final String component3() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component4() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component5() {
        return this.requesterZone;
    }

    @Nullable
    public final String component6() {
        return this.requesterLocation;
    }

    @Nullable
    public final String component7() {
        return this.campaignID;
    }

    @Nullable
    public final String component8() {
        return this.offerPOID;
    }

    @NotNull
    public final String component9() {
        return this.userCode;
    }

    @NotNull
    public final OnePre2PostBuyRecommendRequest copy(@NotNull String subscriberNumber, @NotNull String requesterId, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String userCode, @NotNull String packageGroupCode, @NotNull List<OffersPackage> offersPackage) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        return new OnePre2PostBuyRecommendRequest(subscriberNumber, requesterId, requesterChannel, requesterApplication, requesterZone, str, str2, str3, userCode, packageGroupCode, offersPackage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostBuyRecommendRequest) {
            OnePre2PostBuyRecommendRequest onePre2PostBuyRecommendRequest = (OnePre2PostBuyRecommendRequest) obj;
            return Intrinsics.areEqual(this.subscriberNumber, onePre2PostBuyRecommendRequest.subscriberNumber) && Intrinsics.areEqual(this.requesterId, onePre2PostBuyRecommendRequest.requesterId) && Intrinsics.areEqual(this.requesterChannel, onePre2PostBuyRecommendRequest.requesterChannel) && Intrinsics.areEqual(this.requesterApplication, onePre2PostBuyRecommendRequest.requesterApplication) && Intrinsics.areEqual(this.requesterZone, onePre2PostBuyRecommendRequest.requesterZone) && Intrinsics.areEqual(this.requesterLocation, onePre2PostBuyRecommendRequest.requesterLocation) && Intrinsics.areEqual(this.campaignID, onePre2PostBuyRecommendRequest.campaignID) && Intrinsics.areEqual(this.offerPOID, onePre2PostBuyRecommendRequest.offerPOID) && Intrinsics.areEqual(this.userCode, onePre2PostBuyRecommendRequest.userCode) && Intrinsics.areEqual(this.packageGroupCode, onePre2PostBuyRecommendRequest.packageGroupCode) && Intrinsics.areEqual(this.offersPackage, onePre2PostBuyRecommendRequest.offersPackage);
        }
        return false;
    }

    @Nullable
    public final String getCampaignID() {
        return this.campaignID;
    }

    @Nullable
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final List<OffersPackage> getOffersPackage() {
        return this.offersPackage;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
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
    public final String getRequesterId() {
        return this.requesterId;
    }

    @Nullable
    public final String getRequesterLocation() {
        return this.requesterLocation;
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
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        int hashCode = ((((((((this.subscriberNumber.hashCode() * 31) + this.requesterId.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31;
        String str = this.requesterLocation;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.campaignID;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerPOID;
        return ((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.userCode.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.offersPackage.hashCode();
    }

    public final void setOffersPackage(@NotNull List<OffersPackage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.offersPackage = list;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setRequesterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterId = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.requesterId;
        String str3 = this.requesterChannel;
        String str4 = this.requesterApplication;
        String str5 = this.requesterZone;
        String str6 = this.requesterLocation;
        String str7 = this.campaignID;
        String str8 = this.offerPOID;
        String str9 = this.userCode;
        String str10 = this.packageGroupCode;
        List<OffersPackage> list = this.offersPackage;
        return "OnePre2PostBuyRecommendRequest(subscriberNumber=" + str + ", requesterId=" + str2 + ", requesterChannel=" + str3 + ", requesterApplication=" + str4 + ", requesterZone=" + str5 + ", requesterLocation=" + str6 + ", campaignID=" + str7 + ", offerPOID=" + str8 + ", userCode=" + str9 + ", packageGroupCode=" + str10 + ", offersPackage=" + list + ")";
    }

    public /* synthetic */ OnePre2PostBuyRecommendRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, str9, str10, list);
    }
}
