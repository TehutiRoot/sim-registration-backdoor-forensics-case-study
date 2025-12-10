package th.p047co.dtac.android.dtacone.model.change_pro_happy.validateProfile.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/request/OneChangeProHappyValidateProfileRequest;", "", "customerInfo", "Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/request/CustomerInfo;", "(Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/request/CustomerInfo;)V", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/request/CustomerInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.validateProfile.request.OneChangeProHappyValidateProfileRequest */
/* loaded from: classes8.dex */
public final class OneChangeProHappyValidateProfileRequest {
    public static final int $stable = 8;
    @SerializedName("customerInfo")
    @Nullable
    private final CustomerInfo customerInfo;

    public OneChangeProHappyValidateProfileRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneChangeProHappyValidateProfileRequest copy$default(OneChangeProHappyValidateProfileRequest oneChangeProHappyValidateProfileRequest, CustomerInfo customerInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            customerInfo = oneChangeProHappyValidateProfileRequest.customerInfo;
        }
        return oneChangeProHappyValidateProfileRequest.copy(customerInfo);
    }

    @Nullable
    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    @NotNull
    public final OneChangeProHappyValidateProfileRequest copy(@Nullable CustomerInfo customerInfo) {
        return new OneChangeProHappyValidateProfileRequest(customerInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneChangeProHappyValidateProfileRequest) && Intrinsics.areEqual(this.customerInfo, ((OneChangeProHappyValidateProfileRequest) obj).customerInfo);
    }

    @Nullable
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public int hashCode() {
        CustomerInfo customerInfo = this.customerInfo;
        if (customerInfo == null) {
            return 0;
        }
        return customerInfo.hashCode();
    }

    @NotNull
    public String toString() {
        CustomerInfo customerInfo = this.customerInfo;
        return "OneChangeProHappyValidateProfileRequest(customerInfo=" + customerInfo + ")";
    }

    public OneChangeProHappyValidateProfileRequest(@Nullable CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public /* synthetic */ OneChangeProHappyValidateProfileRequest(CustomerInfo customerInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerInfo);
    }
}
