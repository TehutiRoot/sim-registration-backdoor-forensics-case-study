package th.p047co.dtac.android.dtacone.model.change_pro_happy.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/OneSubmitChangeProHappyTRequest;", "", "customerInfo", "Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/CustomerInfo;", "orderItems", "Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/OrderItems;", "(Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/CustomerInfo;Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/OrderItems;)V", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/CustomerInfo;", "getOrderItems", "()Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/OrderItems;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.submit.request.OneSubmitChangeProHappyTRequest */
/* loaded from: classes8.dex */
public final class OneSubmitChangeProHappyTRequest {
    public static final int $stable = 0;
    @SerializedName("customerInfo")
    @Nullable
    private final CustomerInfo customerInfo;
    @SerializedName("orderItems")
    @Nullable
    private final OrderItems orderItems;

    public OneSubmitChangeProHappyTRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneSubmitChangeProHappyTRequest copy$default(OneSubmitChangeProHappyTRequest oneSubmitChangeProHappyTRequest, CustomerInfo customerInfo, OrderItems orderItems, int i, Object obj) {
        if ((i & 1) != 0) {
            customerInfo = oneSubmitChangeProHappyTRequest.customerInfo;
        }
        if ((i & 2) != 0) {
            orderItems = oneSubmitChangeProHappyTRequest.orderItems;
        }
        return oneSubmitChangeProHappyTRequest.copy(customerInfo, orderItems);
    }

    @Nullable
    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    @Nullable
    public final OrderItems component2() {
        return this.orderItems;
    }

    @NotNull
    public final OneSubmitChangeProHappyTRequest copy(@Nullable CustomerInfo customerInfo, @Nullable OrderItems orderItems) {
        return new OneSubmitChangeProHappyTRequest(customerInfo, orderItems);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneSubmitChangeProHappyTRequest) {
            OneSubmitChangeProHappyTRequest oneSubmitChangeProHappyTRequest = (OneSubmitChangeProHappyTRequest) obj;
            return Intrinsics.areEqual(this.customerInfo, oneSubmitChangeProHappyTRequest.customerInfo) && Intrinsics.areEqual(this.orderItems, oneSubmitChangeProHappyTRequest.orderItems);
        }
        return false;
    }

    @Nullable
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    @Nullable
    public final OrderItems getOrderItems() {
        return this.orderItems;
    }

    public int hashCode() {
        CustomerInfo customerInfo = this.customerInfo;
        int hashCode = (customerInfo == null ? 0 : customerInfo.hashCode()) * 31;
        OrderItems orderItems = this.orderItems;
        return hashCode + (orderItems != null ? orderItems.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CustomerInfo customerInfo = this.customerInfo;
        OrderItems orderItems = this.orderItems;
        return "OneSubmitChangeProHappyTRequest(customerInfo=" + customerInfo + ", orderItems=" + orderItems + ")";
    }

    public OneSubmitChangeProHappyTRequest(@Nullable CustomerInfo customerInfo, @Nullable OrderItems orderItems) {
        this.customerInfo = customerInfo;
        this.orderItems = orderItems;
    }

    public /* synthetic */ OneSubmitChangeProHappyTRequest(CustomerInfo customerInfo, OrderItems orderItems, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerInfo, (i & 2) != 0 ? null : orderItems);
    }
}