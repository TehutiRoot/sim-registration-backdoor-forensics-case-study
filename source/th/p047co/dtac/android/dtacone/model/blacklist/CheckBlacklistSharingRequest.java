package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/CheckBlacklistSharingRequest;", "", "userCode", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getIdNumber", "getSubscriberNumber", "getUserCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.CheckBlacklistSharingRequest */
/* loaded from: classes8.dex */
public final class CheckBlacklistSharingRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("idNumber")
    @NotNull
    private final String idNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public CheckBlacklistSharingRequest(@NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String idNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.idNumber = idNumber;
    }

    public static /* synthetic */ CheckBlacklistSharingRequest copy$default(CheckBlacklistSharingRequest checkBlacklistSharingRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkBlacklistSharingRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = checkBlacklistSharingRequest.subscriberNumber;
        }
        if ((i & 4) != 0) {
            str3 = checkBlacklistSharingRequest.customerNumber;
        }
        if ((i & 8) != 0) {
            str4 = checkBlacklistSharingRequest.idNumber;
        }
        return checkBlacklistSharingRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component3() {
        return this.customerNumber;
    }

    @NotNull
    public final String component4() {
        return this.idNumber;
    }

    @NotNull
    public final CheckBlacklistSharingRequest copy(@NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String idNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        return new CheckBlacklistSharingRequest(userCode, subscriberNumber, customerNumber, idNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckBlacklistSharingRequest) {
            CheckBlacklistSharingRequest checkBlacklistSharingRequest = (CheckBlacklistSharingRequest) obj;
            return Intrinsics.areEqual(this.userCode, checkBlacklistSharingRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, checkBlacklistSharingRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, checkBlacklistSharingRequest.customerNumber) && Intrinsics.areEqual(this.idNumber, checkBlacklistSharingRequest.idNumber);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
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
        return (((((this.userCode.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.idNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.subscriberNumber;
        String str3 = this.customerNumber;
        String str4 = this.idNumber;
        return "CheckBlacklistSharingRequest(userCode=" + str + ", subscriberNumber=" + str2 + ", customerNumber=" + str3 + ", idNumber=" + str4 + ")";
    }
}
