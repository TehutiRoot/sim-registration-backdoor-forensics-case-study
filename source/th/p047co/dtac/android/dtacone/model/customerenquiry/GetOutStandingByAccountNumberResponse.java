package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetOutStandingByAccountNumberResponse;", "", "amount", "", "customerNumber", "netAmount", "otherCharge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCustomerNumber", "getNetAmount", "getOtherCharge", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetOutStandingByAccountNumberResponse */
/* loaded from: classes8.dex */
public final class GetOutStandingByAccountNumberResponse {
    public static final int $stable = 0;
    @SerializedName("amount")
    @Nullable
    private final String amount;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("netAmount")
    @Nullable
    private final String netAmount;
    @SerializedName("otherCharge")
    @Nullable
    private final String otherCharge;

    public GetOutStandingByAccountNumberResponse(@Nullable String str, @NotNull String customerNumber, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.amount = str;
        this.customerNumber = customerNumber;
        this.netAmount = str2;
        this.otherCharge = str3;
    }

    public static /* synthetic */ GetOutStandingByAccountNumberResponse copy$default(GetOutStandingByAccountNumberResponse getOutStandingByAccountNumberResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOutStandingByAccountNumberResponse.amount;
        }
        if ((i & 2) != 0) {
            str2 = getOutStandingByAccountNumberResponse.customerNumber;
        }
        if ((i & 4) != 0) {
            str3 = getOutStandingByAccountNumberResponse.netAmount;
        }
        if ((i & 8) != 0) {
            str4 = getOutStandingByAccountNumberResponse.otherCharge;
        }
        return getOutStandingByAccountNumberResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    @Nullable
    public final String component3() {
        return this.netAmount;
    }

    @Nullable
    public final String component4() {
        return this.otherCharge;
    }

    @NotNull
    public final GetOutStandingByAccountNumberResponse copy(@Nullable String str, @NotNull String customerNumber, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new GetOutStandingByAccountNumberResponse(str, customerNumber, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutStandingByAccountNumberResponse) {
            GetOutStandingByAccountNumberResponse getOutStandingByAccountNumberResponse = (GetOutStandingByAccountNumberResponse) obj;
            return Intrinsics.areEqual(this.amount, getOutStandingByAccountNumberResponse.amount) && Intrinsics.areEqual(this.customerNumber, getOutStandingByAccountNumberResponse.customerNumber) && Intrinsics.areEqual(this.netAmount, getOutStandingByAccountNumberResponse.netAmount) && Intrinsics.areEqual(this.otherCharge, getOutStandingByAccountNumberResponse.otherCharge);
        }
        return false;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getNetAmount() {
        return this.netAmount;
    }

    @Nullable
    public final String getOtherCharge() {
        return this.otherCharge;
    }

    public int hashCode() {
        String str = this.amount;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.customerNumber.hashCode()) * 31;
        String str2 = this.netAmount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.otherCharge;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.amount;
        String str2 = this.customerNumber;
        String str3 = this.netAmount;
        String str4 = this.otherCharge;
        return "GetOutStandingByAccountNumberResponse(amount=" + str + ", customerNumber=" + str2 + ", netAmount=" + str3 + ", otherCharge=" + str4 + ")";
    }
}
