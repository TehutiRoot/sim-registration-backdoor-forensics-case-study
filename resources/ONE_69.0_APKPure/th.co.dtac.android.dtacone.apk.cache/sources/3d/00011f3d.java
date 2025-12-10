package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetAllPackageGroupPre2PostRequest;", "", "companyCode", "", "customerNumber", "hardwareNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "userCode", "userLan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerNumber", "getHardwareNumber", "getSubscriberNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetAllPackageGroupPre2PostRequest */
/* loaded from: classes8.dex */
public final class GetAllPackageGroupPre2PostRequest {
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
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetAllPackageGroupPre2PostRequest(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.hardwareNumber = hardwareNumber;
        this.subscriberNumber = subscriberNumber;
        this.userCode = userCode;
        this.userLan = userLan;
    }

    public static /* synthetic */ GetAllPackageGroupPre2PostRequest copy$default(GetAllPackageGroupPre2PostRequest getAllPackageGroupPre2PostRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAllPackageGroupPre2PostRequest.companyCode;
        }
        if ((i & 2) != 0) {
            str2 = getAllPackageGroupPre2PostRequest.customerNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getAllPackageGroupPre2PostRequest.hardwareNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getAllPackageGroupPre2PostRequest.subscriberNumber;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getAllPackageGroupPre2PostRequest.userCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getAllPackageGroupPre2PostRequest.userLan;
        }
        return getAllPackageGroupPre2PostRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.companyCode;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    @NotNull
    public final String component3() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component5() {
        return this.userCode;
    }

    @NotNull
    public final String component6() {
        return this.userLan;
    }

    @NotNull
    public final GetAllPackageGroupPre2PostRequest copy(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        return new GetAllPackageGroupPre2PostRequest(companyCode, customerNumber, hardwareNumber, subscriberNumber, userCode, userLan);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAllPackageGroupPre2PostRequest) {
            GetAllPackageGroupPre2PostRequest getAllPackageGroupPre2PostRequest = (GetAllPackageGroupPre2PostRequest) obj;
            return Intrinsics.areEqual(this.companyCode, getAllPackageGroupPre2PostRequest.companyCode) && Intrinsics.areEqual(this.customerNumber, getAllPackageGroupPre2PostRequest.customerNumber) && Intrinsics.areEqual(this.hardwareNumber, getAllPackageGroupPre2PostRequest.hardwareNumber) && Intrinsics.areEqual(this.subscriberNumber, getAllPackageGroupPre2PostRequest.subscriberNumber) && Intrinsics.areEqual(this.userCode, getAllPackageGroupPre2PostRequest.userCode) && Intrinsics.areEqual(this.userLan, getAllPackageGroupPre2PostRequest.userLan);
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
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
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
        return (((((((((this.companyCode.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.customerNumber;
        String str3 = this.hardwareNumber;
        String str4 = this.subscriberNumber;
        String str5 = this.userCode;
        String str6 = this.userLan;
        return "GetAllPackageGroupPre2PostRequest(companyCode=" + str + ", customerNumber=" + str2 + ", hardwareNumber=" + str3 + ", subscriberNumber=" + str4 + ", userCode=" + str5 + ", userLan=" + str6 + ")";
    }
}