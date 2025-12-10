package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;", "", "userLan", "", "userCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getSubscriberNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest */
/* loaded from: classes8.dex */
public final class OneTopUpGetMainBalanceRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public OneTopUpGetMainBalanceRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneTopUpGetMainBalanceRequest copy$default(OneTopUpGetMainBalanceRequest oneTopUpGetMainBalanceRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTopUpGetMainBalanceRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = oneTopUpGetMainBalanceRequest.userCode;
        }
        if ((i & 4) != 0) {
            str3 = oneTopUpGetMainBalanceRequest.subscriberNumber;
        }
        if ((i & 8) != 0) {
            str4 = oneTopUpGetMainBalanceRequest.customerNumber;
        }
        return oneTopUpGetMainBalanceRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.userLan;
    }

    @Nullable
    public final String component2() {
        return this.userCode;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.customerNumber;
    }

    @NotNull
    public final OneTopUpGetMainBalanceRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneTopUpGetMainBalanceRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTopUpGetMainBalanceRequest) {
            OneTopUpGetMainBalanceRequest oneTopUpGetMainBalanceRequest = (OneTopUpGetMainBalanceRequest) obj;
            return Intrinsics.areEqual(this.userLan, oneTopUpGetMainBalanceRequest.userLan) && Intrinsics.areEqual(this.userCode, oneTopUpGetMainBalanceRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, oneTopUpGetMainBalanceRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, oneTopUpGetMainBalanceRequest.customerNumber);
        }
        return false;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
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
        String str = this.userLan;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerNumber;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.subscriberNumber;
        String str4 = this.customerNumber;
        return "OneTopUpGetMainBalanceRequest(userLan=" + str + ", userCode=" + str2 + ", subscriberNumber=" + str3 + ", customerNumber=" + str4 + ")";
    }

    public OneTopUpGetMainBalanceRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.userLan = str;
        this.userCode = str2;
        this.subscriberNumber = str3;
        this.customerNumber = str4;
    }

    public /* synthetic */ OneTopUpGetMainBalanceRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
