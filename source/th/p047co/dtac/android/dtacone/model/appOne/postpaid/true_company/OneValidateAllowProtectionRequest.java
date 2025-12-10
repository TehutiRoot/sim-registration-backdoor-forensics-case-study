package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionRequest;", "", "flow", "", "orderId", "campaignService", "campaignCode", "campaignType", "dtrCode", "idNumber", "matCode", "msisdn", FirebaseAnalytics.Param.PRICE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCode", "()Ljava/lang/String;", "getCampaignService", "getCampaignType", "getDtrCode", "getFlow", "getIdNumber", "getMatCode", "getMsisdn", "getOrderId", "getPrice", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionRequest */
/* loaded from: classes8.dex */
public final class OneValidateAllowProtectionRequest {
    public static final int $stable = 0;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("campaignService")
    @Nullable
    private final String campaignService;
    @SerializedName("campaignType")
    @Nullable
    private final String campaignType;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("flow")
    @Nullable
    private final String flow;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("matCode")
    @Nullable
    private final String matCode;
    @SerializedName("msisdn")
    @Nullable
    private final String msisdn;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final String price;

    public OneValidateAllowProtectionRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final String component1() {
        return this.flow;
    }

    @Nullable
    public final String component10() {
        return this.price;
    }

    @Nullable
    public final String component2() {
        return this.orderId;
    }

    @Nullable
    public final String component3() {
        return this.campaignService;
    }

    @Nullable
    public final String component4() {
        return this.campaignCode;
    }

    @Nullable
    public final String component5() {
        return this.campaignType;
    }

    @Nullable
    public final String component6() {
        return this.dtrCode;
    }

    @Nullable
    public final String component7() {
        return this.idNumber;
    }

    @Nullable
    public final String component8() {
        return this.matCode;
    }

    @Nullable
    public final String component9() {
        return this.msisdn;
    }

    @NotNull
    public final OneValidateAllowProtectionRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        return new OneValidateAllowProtectionRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneValidateAllowProtectionRequest) {
            OneValidateAllowProtectionRequest oneValidateAllowProtectionRequest = (OneValidateAllowProtectionRequest) obj;
            return Intrinsics.areEqual(this.flow, oneValidateAllowProtectionRequest.flow) && Intrinsics.areEqual(this.orderId, oneValidateAllowProtectionRequest.orderId) && Intrinsics.areEqual(this.campaignService, oneValidateAllowProtectionRequest.campaignService) && Intrinsics.areEqual(this.campaignCode, oneValidateAllowProtectionRequest.campaignCode) && Intrinsics.areEqual(this.campaignType, oneValidateAllowProtectionRequest.campaignType) && Intrinsics.areEqual(this.dtrCode, oneValidateAllowProtectionRequest.dtrCode) && Intrinsics.areEqual(this.idNumber, oneValidateAllowProtectionRequest.idNumber) && Intrinsics.areEqual(this.matCode, oneValidateAllowProtectionRequest.matCode) && Intrinsics.areEqual(this.msisdn, oneValidateAllowProtectionRequest.msisdn) && Intrinsics.areEqual(this.price, oneValidateAllowProtectionRequest.price);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignService() {
        return this.campaignService;
    }

    @Nullable
    public final String getCampaignType() {
        return this.campaignType;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getFlow() {
        return this.flow;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getMatCode() {
        return this.matCode;
    }

    @Nullable
    public final String getMsisdn() {
        return this.msisdn;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.flow;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignService;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaignCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campaignType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dtrCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.idNumber;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.matCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.msisdn;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.price;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.flow;
        String str2 = this.orderId;
        String str3 = this.campaignService;
        String str4 = this.campaignCode;
        String str5 = this.campaignType;
        String str6 = this.dtrCode;
        String str7 = this.idNumber;
        String str8 = this.matCode;
        String str9 = this.msisdn;
        String str10 = this.price;
        return "OneValidateAllowProtectionRequest(flow=" + str + ", orderId=" + str2 + ", campaignService=" + str3 + ", campaignCode=" + str4 + ", campaignType=" + str5 + ", dtrCode=" + str6 + ", idNumber=" + str7 + ", matCode=" + str8 + ", msisdn=" + str9 + ", price=" + str10 + ")";
    }

    public OneValidateAllowProtectionRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.flow = str;
        this.orderId = str2;
        this.campaignService = str3;
        this.campaignCode = str4;
        this.campaignType = str5;
        this.dtrCode = str6;
        this.idNumber = str7;
        this.matCode = str8;
        this.msisdn = str9;
        this.price = str10;
    }

    public /* synthetic */ OneValidateAllowProtectionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
