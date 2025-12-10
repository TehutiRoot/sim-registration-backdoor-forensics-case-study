package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedAllPackageGroupRequest;", "", "userLan", "", "userCode", "companyCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "customerNumber", "hardwareNumber", "packageGroupType", "minimumPrice", "newIdFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerNumber", "getHardwareNumber", "getMinimumPrice", "getNewIdFlag", "getPackageGroupType", "getSubscriberNumber", "getTelephoneType", "getUserCode", "getUserLan", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedAllPackageGroupRequest */
/* loaded from: classes8.dex */
public final class MrtrBrandedAllPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("hardwareNumber")
    @NotNull
    private final String hardwareNumber;
    @SerializedName("minimumPrice")
    @NotNull
    private final String minimumPrice;
    @SerializedName("newIdFlag")
    @NotNull
    private final String newIdFlag;
    @SerializedName("packageGroupType")
    @NotNull
    private final String packageGroupType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public MrtrBrandedAllPackageGroupRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String companyCode, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String packageGroupType, @NotNull String minimumPrice, @NotNull String newIdFlag) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(minimumPrice, "minimumPrice");
        Intrinsics.checkNotNullParameter(newIdFlag, "newIdFlag");
        this.userLan = userLan;
        this.userCode = userCode;
        this.companyCode = companyCode;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.customerNumber = customerNumber;
        this.hardwareNumber = hardwareNumber;
        this.packageGroupType = packageGroupType;
        this.minimumPrice = minimumPrice;
        this.newIdFlag = newIdFlag;
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component10() {
        return this.newIdFlag;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.companyCode;
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
        return this.customerNumber;
    }

    @NotNull
    public final String component7() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String component8() {
        return this.packageGroupType;
    }

    @NotNull
    public final String component9() {
        return this.minimumPrice;
    }

    @NotNull
    public final MrtrBrandedAllPackageGroupRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String companyCode, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String packageGroupType, @NotNull String minimumPrice, @NotNull String newIdFlag) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(minimumPrice, "minimumPrice");
        Intrinsics.checkNotNullParameter(newIdFlag, "newIdFlag");
        return new MrtrBrandedAllPackageGroupRequest(userLan, userCode, companyCode, subscriberNumber, telephoneType, customerNumber, hardwareNumber, packageGroupType, minimumPrice, newIdFlag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrBrandedAllPackageGroupRequest) {
            MrtrBrandedAllPackageGroupRequest mrtrBrandedAllPackageGroupRequest = (MrtrBrandedAllPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.userLan, mrtrBrandedAllPackageGroupRequest.userLan) && Intrinsics.areEqual(this.userCode, mrtrBrandedAllPackageGroupRequest.userCode) && Intrinsics.areEqual(this.companyCode, mrtrBrandedAllPackageGroupRequest.companyCode) && Intrinsics.areEqual(this.subscriberNumber, mrtrBrandedAllPackageGroupRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, mrtrBrandedAllPackageGroupRequest.telephoneType) && Intrinsics.areEqual(this.customerNumber, mrtrBrandedAllPackageGroupRequest.customerNumber) && Intrinsics.areEqual(this.hardwareNumber, mrtrBrandedAllPackageGroupRequest.hardwareNumber) && Intrinsics.areEqual(this.packageGroupType, mrtrBrandedAllPackageGroupRequest.packageGroupType) && Intrinsics.areEqual(this.minimumPrice, mrtrBrandedAllPackageGroupRequest.minimumPrice) && Intrinsics.areEqual(this.newIdFlag, mrtrBrandedAllPackageGroupRequest.newIdFlag);
        }
        return false;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String getMinimumPrice() {
        return this.minimumPrice;
    }

    @NotNull
    public final String getNewIdFlag() {
        return this.newIdFlag;
    }

    @NotNull
    public final String getPackageGroupType() {
        return this.packageGroupType;
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
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((((((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.packageGroupType.hashCode()) * 31) + this.minimumPrice.hashCode()) * 31) + this.newIdFlag.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.companyCode;
        String str4 = this.subscriberNumber;
        String str5 = this.telephoneType;
        String str6 = this.customerNumber;
        String str7 = this.hardwareNumber;
        String str8 = this.packageGroupType;
        String str9 = this.minimumPrice;
        String str10 = this.newIdFlag;
        return "MrtrBrandedAllPackageGroupRequest(userLan=" + str + ", userCode=" + str2 + ", companyCode=" + str3 + ", subscriberNumber=" + str4 + ", telephoneType=" + str5 + ", customerNumber=" + str6 + ", hardwareNumber=" + str7 + ", packageGroupType=" + str8 + ", minimumPrice=" + str9 + ", newIdFlag=" + str10 + ")";
    }
}