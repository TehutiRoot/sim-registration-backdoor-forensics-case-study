package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/VerificationResponse;", "", "companyCode", "", "customerNumber", "simcardNumber", "subscriberStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerNumber", "getSimcardNumber", "getSubscriberStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.VerificationResponse */
/* loaded from: classes8.dex */
public final class VerificationResponse {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("simcardNumber")
    @NotNull
    private final String simcardNumber;
    @SerializedName("subscriberStatus")
    @NotNull
    private final String subscriberStatus;

    public VerificationResponse(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String simcardNumber, @NotNull String subscriberStatus) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simcardNumber, "simcardNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.simcardNumber = simcardNumber;
        this.subscriberStatus = subscriberStatus;
    }

    public static /* synthetic */ VerificationResponse copy$default(VerificationResponse verificationResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verificationResponse.companyCode;
        }
        if ((i & 2) != 0) {
            str2 = verificationResponse.customerNumber;
        }
        if ((i & 4) != 0) {
            str3 = verificationResponse.simcardNumber;
        }
        if ((i & 8) != 0) {
            str4 = verificationResponse.subscriberStatus;
        }
        return verificationResponse.copy(str, str2, str3, str4);
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
        return this.simcardNumber;
    }

    @NotNull
    public final String component4() {
        return this.subscriberStatus;
    }

    @NotNull
    public final VerificationResponse copy(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String simcardNumber, @NotNull String subscriberStatus) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(simcardNumber, "simcardNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        return new VerificationResponse(companyCode, customerNumber, simcardNumber, subscriberStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerificationResponse) {
            VerificationResponse verificationResponse = (VerificationResponse) obj;
            return Intrinsics.areEqual(this.companyCode, verificationResponse.companyCode) && Intrinsics.areEqual(this.customerNumber, verificationResponse.customerNumber) && Intrinsics.areEqual(this.simcardNumber, verificationResponse.simcardNumber) && Intrinsics.areEqual(this.subscriberStatus, verificationResponse.subscriberStatus);
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
    public final String getSimcardNumber() {
        return this.simcardNumber;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    public int hashCode() {
        return (((((this.companyCode.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.simcardNumber.hashCode()) * 31) + this.subscriberStatus.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.customerNumber;
        String str3 = this.simcardNumber;
        String str4 = this.subscriberStatus;
        return "VerificationResponse(companyCode=" + str + ", customerNumber=" + str2 + ", simcardNumber=" + str3 + ", subscriberStatus=" + str4 + ")";
    }
}