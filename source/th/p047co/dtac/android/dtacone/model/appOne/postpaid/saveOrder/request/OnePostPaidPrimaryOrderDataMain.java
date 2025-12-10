package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidPrimaryOrderDataMain;", "", "campaignDesc", "", "verifyValue", "serviceID", "serviceDesc", "privilegeType", "promotionSetCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignDesc", "()Ljava/lang/String;", "getPrivilegeType", "getPromotionSetCode", "getServiceDesc", "getServiceID", "getVerifyValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidPrimaryOrderDataMain */
/* loaded from: classes8.dex */
public final class OnePostPaidPrimaryOrderDataMain {
    public static final int $stable = 0;
    @SerializedName("campaignDesc")
    @Nullable
    private final String campaignDesc;
    @SerializedName("privilegeType")
    @NotNull
    private final String privilegeType;
    @SerializedName("promotionSetCode")
    @Nullable
    private final String promotionSetCode;
    @SerializedName("serviceDesc")
    @Nullable
    private final String serviceDesc;
    @SerializedName("serviceID")
    @Nullable
    private final String serviceID;
    @SerializedName("verifyValue")
    @Nullable
    private final String verifyValue;

    public OnePostPaidPrimaryOrderDataMain(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String privilegeType, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(privilegeType, "privilegeType");
        this.campaignDesc = str;
        this.verifyValue = str2;
        this.serviceID = str3;
        this.serviceDesc = str4;
        this.privilegeType = privilegeType;
        this.promotionSetCode = str5;
    }

    public static /* synthetic */ OnePostPaidPrimaryOrderDataMain copy$default(OnePostPaidPrimaryOrderDataMain onePostPaidPrimaryOrderDataMain, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostPaidPrimaryOrderDataMain.campaignDesc;
        }
        if ((i & 2) != 0) {
            str2 = onePostPaidPrimaryOrderDataMain.verifyValue;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onePostPaidPrimaryOrderDataMain.serviceID;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onePostPaidPrimaryOrderDataMain.serviceDesc;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onePostPaidPrimaryOrderDataMain.privilegeType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onePostPaidPrimaryOrderDataMain.promotionSetCode;
        }
        return onePostPaidPrimaryOrderDataMain.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.campaignDesc;
    }

    @Nullable
    public final String component2() {
        return this.verifyValue;
    }

    @Nullable
    public final String component3() {
        return this.serviceID;
    }

    @Nullable
    public final String component4() {
        return this.serviceDesc;
    }

    @NotNull
    public final String component5() {
        return this.privilegeType;
    }

    @Nullable
    public final String component6() {
        return this.promotionSetCode;
    }

    @NotNull
    public final OnePostPaidPrimaryOrderDataMain copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String privilegeType, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(privilegeType, "privilegeType");
        return new OnePostPaidPrimaryOrderDataMain(str, str2, str3, str4, privilegeType, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidPrimaryOrderDataMain) {
            OnePostPaidPrimaryOrderDataMain onePostPaidPrimaryOrderDataMain = (OnePostPaidPrimaryOrderDataMain) obj;
            return Intrinsics.areEqual(this.campaignDesc, onePostPaidPrimaryOrderDataMain.campaignDesc) && Intrinsics.areEqual(this.verifyValue, onePostPaidPrimaryOrderDataMain.verifyValue) && Intrinsics.areEqual(this.serviceID, onePostPaidPrimaryOrderDataMain.serviceID) && Intrinsics.areEqual(this.serviceDesc, onePostPaidPrimaryOrderDataMain.serviceDesc) && Intrinsics.areEqual(this.privilegeType, onePostPaidPrimaryOrderDataMain.privilegeType) && Intrinsics.areEqual(this.promotionSetCode, onePostPaidPrimaryOrderDataMain.promotionSetCode);
        }
        return false;
    }

    @Nullable
    public final String getCampaignDesc() {
        return this.campaignDesc;
    }

    @NotNull
    public final String getPrivilegeType() {
        return this.privilegeType;
    }

    @Nullable
    public final String getPromotionSetCode() {
        return this.promotionSetCode;
    }

    @Nullable
    public final String getServiceDesc() {
        return this.serviceDesc;
    }

    @Nullable
    public final String getServiceID() {
        return this.serviceID;
    }

    @Nullable
    public final String getVerifyValue() {
        return this.verifyValue;
    }

    public int hashCode() {
        String str = this.campaignDesc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.verifyValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceDesc;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.privilegeType.hashCode()) * 31;
        String str5 = this.promotionSetCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.campaignDesc;
        String str2 = this.verifyValue;
        String str3 = this.serviceID;
        String str4 = this.serviceDesc;
        String str5 = this.privilegeType;
        String str6 = this.promotionSetCode;
        return "OnePostPaidPrimaryOrderDataMain(campaignDesc=" + str + ", verifyValue=" + str2 + ", serviceID=" + str3 + ", serviceDesc=" + str4 + ", privilegeType=" + str5 + ", promotionSetCode=" + str6 + ")";
    }

    public /* synthetic */ OnePostPaidPrimaryOrderDataMain(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6);
    }
}
