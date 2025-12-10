package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2CancelStatusRequest;", "", "customerMobileNumber", "", "simCardNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerMobileNumber", "()Ljava/lang/String;", "getSimCardNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2CancelStatusRequest */
/* loaded from: classes8.dex */
public final class Kyc2CancelStatusRequest {
    public static final int $stable = 0;
    @SerializedName("customerMobileNumber")
    @NotNull
    private final String customerMobileNumber;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;

    public Kyc2CancelStatusRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Kyc2CancelStatusRequest copy$default(Kyc2CancelStatusRequest kyc2CancelStatusRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kyc2CancelStatusRequest.customerMobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = kyc2CancelStatusRequest.simCardNumber;
        }
        return kyc2CancelStatusRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.customerMobileNumber;
    }

    @NotNull
    public final String component2() {
        return this.simCardNumber;
    }

    @NotNull
    public final Kyc2CancelStatusRequest copy(@NotNull String customerMobileNumber, @NotNull String simCardNumber) {
        Intrinsics.checkNotNullParameter(customerMobileNumber, "customerMobileNumber");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        return new Kyc2CancelStatusRequest(customerMobileNumber, simCardNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2CancelStatusRequest) {
            Kyc2CancelStatusRequest kyc2CancelStatusRequest = (Kyc2CancelStatusRequest) obj;
            return Intrinsics.areEqual(this.customerMobileNumber, kyc2CancelStatusRequest.customerMobileNumber) && Intrinsics.areEqual(this.simCardNumber, kyc2CancelStatusRequest.simCardNumber);
        }
        return false;
    }

    @NotNull
    public final String getCustomerMobileNumber() {
        return this.customerMobileNumber;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    public int hashCode() {
        return (this.customerMobileNumber.hashCode() * 31) + this.simCardNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.customerMobileNumber;
        String str2 = this.simCardNumber;
        return "Kyc2CancelStatusRequest(customerMobileNumber=" + str + ", simCardNumber=" + str2 + ")";
    }

    public Kyc2CancelStatusRequest(@NotNull String customerMobileNumber, @NotNull String simCardNumber) {
        Intrinsics.checkNotNullParameter(customerMobileNumber, "customerMobileNumber");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        this.customerMobileNumber = customerMobileNumber;
        this.simCardNumber = simCardNumber;
    }

    public /* synthetic */ Kyc2CancelStatusRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}