package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0011¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeRequest;", "", "userCode", "", "companyCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "customerNumber", "hardwareNumber", "packageGroupCode", "packageGroupType", "cmpFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmpFlag", "()Ljava/lang/String;", "getCompanyCode", "setCompanyCode", "(Ljava/lang/String;)V", "getCustomerNumber", "setCustomerNumber", "getHardwareNumber", "setHardwareNumber", "getPackageGroupCode", "setPackageGroupCode", "getPackageGroupType", "setPackageGroupType", "getSubscriberNumber", "setSubscriberNumber", "getTelephoneType", "setTelephoneType", "getUserCode", "setUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeRequest */
/* loaded from: classes8.dex */
public final class ValidatePackageGroupCodeRequest {
    public static final int $stable = 8;
    @SerializedName("cmpFlag")
    @NotNull
    private final String cmpFlag;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("hardwareNumber")
    @NotNull
    private String hardwareNumber;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("packageGroupType")
    @NotNull
    private String packageGroupType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private String userCode;

    public ValidatePackageGroupCodeRequest() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.companyCode;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.telephoneType;
    }

    @NotNull
    public final String component5() {
        return this.customerNumber;
    }

    @NotNull
    public final String component6() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String component7() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component8() {
        return this.packageGroupType;
    }

    @NotNull
    public final String component9() {
        return this.cmpFlag;
    }

    @NotNull
    public final ValidatePackageGroupCodeRequest copy(@NotNull String userCode, @NotNull String companyCode, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String packageGroupCode, @NotNull String packageGroupType, @NotNull String cmpFlag) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        return new ValidatePackageGroupCodeRequest(userCode, companyCode, subscriberNumber, telephoneType, customerNumber, hardwareNumber, packageGroupCode, packageGroupType, cmpFlag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidatePackageGroupCodeRequest) {
            ValidatePackageGroupCodeRequest validatePackageGroupCodeRequest = (ValidatePackageGroupCodeRequest) obj;
            return Intrinsics.areEqual(this.userCode, validatePackageGroupCodeRequest.userCode) && Intrinsics.areEqual(this.companyCode, validatePackageGroupCodeRequest.companyCode) && Intrinsics.areEqual(this.subscriberNumber, validatePackageGroupCodeRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, validatePackageGroupCodeRequest.telephoneType) && Intrinsics.areEqual(this.customerNumber, validatePackageGroupCodeRequest.customerNumber) && Intrinsics.areEqual(this.hardwareNumber, validatePackageGroupCodeRequest.hardwareNumber) && Intrinsics.areEqual(this.packageGroupCode, validatePackageGroupCodeRequest.packageGroupCode) && Intrinsics.areEqual(this.packageGroupType, validatePackageGroupCodeRequest.packageGroupType) && Intrinsics.areEqual(this.cmpFlag, validatePackageGroupCodeRequest.cmpFlag);
        }
        return false;
    }

    @NotNull
    public final String getCmpFlag() {
        return this.cmpFlag;
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
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
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

    public int hashCode() {
        return (((((((((((((((this.userCode.hashCode() * 31) + this.companyCode.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.packageGroupType.hashCode()) * 31) + this.cmpFlag.hashCode();
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareNumber = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setPackageGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupType = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.companyCode;
        String str3 = this.subscriberNumber;
        String str4 = this.telephoneType;
        String str5 = this.customerNumber;
        String str6 = this.hardwareNumber;
        String str7 = this.packageGroupCode;
        String str8 = this.packageGroupType;
        String str9 = this.cmpFlag;
        return "ValidatePackageGroupCodeRequest(userCode=" + str + ", companyCode=" + str2 + ", subscriberNumber=" + str3 + ", telephoneType=" + str4 + ", customerNumber=" + str5 + ", hardwareNumber=" + str6 + ", packageGroupCode=" + str7 + ", packageGroupType=" + str8 + ", cmpFlag=" + str9 + ")";
    }

    public ValidatePackageGroupCodeRequest(@NotNull String userCode, @NotNull String companyCode, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String packageGroupCode, @NotNull String packageGroupType, @NotNull String cmpFlag) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        this.userCode = userCode;
        this.companyCode = companyCode;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.customerNumber = customerNumber;
        this.hardwareNumber = hardwareNumber;
        this.packageGroupCode = packageGroupCode;
        this.packageGroupType = packageGroupType;
        this.cmpFlag = cmpFlag;
    }

    public /* synthetic */ ValidatePackageGroupCodeRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? "N" : str9);
    }
}