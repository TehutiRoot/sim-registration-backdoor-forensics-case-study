package th.p047co.dtac.android.dtacone.model.blacklist;

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
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;", "", "userCode", "", "retailerNumber", ConstsKt.TELEPHONE_TYPE, "idNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getIdNumber", "getRetailerNumber", "getSubscriberNumber", "getTelephoneType", "getUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.GetBlacklistSharingConsentTemplateRequest */
/* loaded from: classes8.dex */
public final class GetBlacklistSharingConsentTemplateRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("retailerNumber")
    @NotNull
    private final String retailerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public GetBlacklistSharingConsentTemplateRequest(@NotNull String userCode, @NotNull String retailerNumber, @NotNull String telephoneType, @Nullable String str, @Nullable String str2, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.userCode = userCode;
        this.retailerNumber = retailerNumber;
        this.telephoneType = telephoneType;
        this.idNumber = str;
        this.subscriberNumber = str2;
        this.customerNumber = customerNumber;
    }

    public static /* synthetic */ GetBlacklistSharingConsentTemplateRequest copy$default(GetBlacklistSharingConsentTemplateRequest getBlacklistSharingConsentTemplateRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBlacklistSharingConsentTemplateRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = getBlacklistSharingConsentTemplateRequest.retailerNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getBlacklistSharingConsentTemplateRequest.telephoneType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getBlacklistSharingConsentTemplateRequest.idNumber;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getBlacklistSharingConsentTemplateRequest.subscriberNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getBlacklistSharingConsentTemplateRequest.customerNumber;
        }
        return getBlacklistSharingConsentTemplateRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.retailerNumber;
    }

    @NotNull
    public final String component3() {
        return this.telephoneType;
    }

    @Nullable
    public final String component4() {
        return this.idNumber;
    }

    @Nullable
    public final String component5() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component6() {
        return this.customerNumber;
    }

    @NotNull
    public final GetBlacklistSharingConsentTemplateRequest copy(@NotNull String userCode, @NotNull String retailerNumber, @NotNull String telephoneType, @Nullable String str, @Nullable String str2, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new GetBlacklistSharingConsentTemplateRequest(userCode, retailerNumber, telephoneType, str, str2, customerNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetBlacklistSharingConsentTemplateRequest) {
            GetBlacklistSharingConsentTemplateRequest getBlacklistSharingConsentTemplateRequest = (GetBlacklistSharingConsentTemplateRequest) obj;
            return Intrinsics.areEqual(this.userCode, getBlacklistSharingConsentTemplateRequest.userCode) && Intrinsics.areEqual(this.retailerNumber, getBlacklistSharingConsentTemplateRequest.retailerNumber) && Intrinsics.areEqual(this.telephoneType, getBlacklistSharingConsentTemplateRequest.telephoneType) && Intrinsics.areEqual(this.idNumber, getBlacklistSharingConsentTemplateRequest.idNumber) && Intrinsics.areEqual(this.subscriberNumber, getBlacklistSharingConsentTemplateRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, getBlacklistSharingConsentTemplateRequest.customerNumber);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getRetailerNumber() {
        return this.retailerNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        int hashCode = ((((this.userCode.hashCode() * 31) + this.retailerNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31;
        String str = this.idNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriberNumber;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.customerNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.retailerNumber;
        String str3 = this.telephoneType;
        String str4 = this.idNumber;
        String str5 = this.subscriberNumber;
        String str6 = this.customerNumber;
        return "GetBlacklistSharingConsentTemplateRequest(userCode=" + str + ", retailerNumber=" + str2 + ", telephoneType=" + str3 + ", idNumber=" + str4 + ", subscriberNumber=" + str5 + ", customerNumber=" + str6 + ")";
    }

    public /* synthetic */ GetBlacklistSharingConsentTemplateRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6);
    }
}
