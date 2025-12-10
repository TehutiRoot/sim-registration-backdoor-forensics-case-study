package th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid;

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
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidBrandedAllPackageGroupRequest;", "", "companyCode", "", "userLan", "packageGroupType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "hardwareNumber", ConstsKt.TELEPHONE_TYPE, "customerNumber", "minimumPrice", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerNumber", "getHardwareNumber", "getMinimumPrice", "getPackageGroupType", "getSubscriberNumber", "getTelephoneType", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidBrandedAllPackageGroupRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidBrandedAllPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName("hardwareNumber")
    @Nullable
    private final String hardwareNumber;
    @SerializedName("minimumPrice")
    @Nullable
    private final String minimumPrice;
    @SerializedName("packageGroupType")
    @Nullable
    private final String packageGroupType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @Nullable
    private final String telephoneType;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public OnePostpaidBrandedAllPackageGroupRequest() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component2() {
        return this.userLan;
    }

    @Nullable
    public final String component3() {
        return this.packageGroupType;
    }

    @Nullable
    public final String component4() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component5() {
        return this.hardwareNumber;
    }

    @Nullable
    public final String component6() {
        return this.telephoneType;
    }

    @Nullable
    public final String component7() {
        return this.customerNumber;
    }

    @Nullable
    public final String component8() {
        return this.minimumPrice;
    }

    @Nullable
    public final String component9() {
        return this.userCode;
    }

    @NotNull
    public final OnePostpaidBrandedAllPackageGroupRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new OnePostpaidBrandedAllPackageGroupRequest(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidBrandedAllPackageGroupRequest) {
            OnePostpaidBrandedAllPackageGroupRequest onePostpaidBrandedAllPackageGroupRequest = (OnePostpaidBrandedAllPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.companyCode, onePostpaidBrandedAllPackageGroupRequest.companyCode) && Intrinsics.areEqual(this.userLan, onePostpaidBrandedAllPackageGroupRequest.userLan) && Intrinsics.areEqual(this.packageGroupType, onePostpaidBrandedAllPackageGroupRequest.packageGroupType) && Intrinsics.areEqual(this.subscriberNumber, onePostpaidBrandedAllPackageGroupRequest.subscriberNumber) && Intrinsics.areEqual(this.hardwareNumber, onePostpaidBrandedAllPackageGroupRequest.hardwareNumber) && Intrinsics.areEqual(this.telephoneType, onePostpaidBrandedAllPackageGroupRequest.telephoneType) && Intrinsics.areEqual(this.customerNumber, onePostpaidBrandedAllPackageGroupRequest.customerNumber) && Intrinsics.areEqual(this.minimumPrice, onePostpaidBrandedAllPackageGroupRequest.minimumPrice) && Intrinsics.areEqual(this.userCode, onePostpaidBrandedAllPackageGroupRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @Nullable
    public final String getMinimumPrice() {
        return this.minimumPrice;
    }

    @Nullable
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageGroupType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriberNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hardwareNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.telephoneType;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customerNumber;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.minimumPrice;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userCode;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.userLan;
        String str3 = this.packageGroupType;
        String str4 = this.subscriberNumber;
        String str5 = this.hardwareNumber;
        String str6 = this.telephoneType;
        String str7 = this.customerNumber;
        String str8 = this.minimumPrice;
        String str9 = this.userCode;
        return "OnePostpaidBrandedAllPackageGroupRequest(companyCode=" + str + ", userLan=" + str2 + ", packageGroupType=" + str3 + ", subscriberNumber=" + str4 + ", hardwareNumber=" + str5 + ", telephoneType=" + str6 + ", customerNumber=" + str7 + ", minimumPrice=" + str8 + ", userCode=" + str9 + ")";
    }

    public OnePostpaidBrandedAllPackageGroupRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.companyCode = str;
        this.userLan = str2;
        this.packageGroupType = str3;
        this.subscriberNumber = str4;
        this.hardwareNumber = str5;
        this.telephoneType = str6;
        this.customerNumber = str7;
        this.minimumPrice = str8;
        this.userCode = str9;
    }

    public /* synthetic */ OnePostpaidBrandedAllPackageGroupRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
