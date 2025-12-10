package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/VerifyIDPinRequest;", "", "customerNumber", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "IDPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIDPin", "()Ljava/lang/String;", "getCustomerNumber", "getSubscriberNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.VerifyIDPinRequest */
/* loaded from: classes8.dex */
public final class VerifyIDPinRequest {
    public static final int $stable = 0;
    @SerializedName("IDPin")
    @NotNull
    private final String IDPin;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;

    public VerifyIDPinRequest(@NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String IDPin) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(IDPin, "IDPin");
        this.customerNumber = customerNumber;
        this.subscriberNumber = subscriberNumber;
        this.IDPin = IDPin;
    }

    public static /* synthetic */ VerifyIDPinRequest copy$default(VerifyIDPinRequest verifyIDPinRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyIDPinRequest.customerNumber;
        }
        if ((i & 2) != 0) {
            str2 = verifyIDPinRequest.subscriberNumber;
        }
        if ((i & 4) != 0) {
            str3 = verifyIDPinRequest.IDPin;
        }
        return verifyIDPinRequest.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.customerNumber;
    }

    @NotNull
    public final String component2() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component3() {
        return this.IDPin;
    }

    @NotNull
    public final VerifyIDPinRequest copy(@NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String IDPin) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(IDPin, "IDPin");
        return new VerifyIDPinRequest(customerNumber, subscriberNumber, IDPin);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyIDPinRequest) {
            VerifyIDPinRequest verifyIDPinRequest = (VerifyIDPinRequest) obj;
            return Intrinsics.areEqual(this.customerNumber, verifyIDPinRequest.customerNumber) && Intrinsics.areEqual(this.subscriberNumber, verifyIDPinRequest.subscriberNumber) && Intrinsics.areEqual(this.IDPin, verifyIDPinRequest.IDPin);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getIDPin() {
        return this.IDPin;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        return (((this.customerNumber.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.IDPin.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.customerNumber;
        String str2 = this.subscriberNumber;
        String str3 = this.IDPin;
        return "VerifyIDPinRequest(customerNumber=" + str + ", subscriberNumber=" + str2 + ", IDPin=" + str3 + ")";
    }
}