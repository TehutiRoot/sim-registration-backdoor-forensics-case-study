package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003JW\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpSaveOrderRequest;", "", "order", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderData;", "customer", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/CustomerData;", "saleAgent", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleAgentData;", "orderItems", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderItemData;", "orderData", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderConfigData;", "orderDataContent", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderDataContent;", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderData;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/CustomerData;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleAgentData;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderConfigData;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderDataContent;)V", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/CustomerData;", "getOrder", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderData;", "getOrderData", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderConfigData;", "getOrderDataContent", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderDataContent;", "getOrderItems", "()Ljava/util/List;", "getSaleAgent", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleAgentData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpSaveOrderRequest */
/* loaded from: classes8.dex */
public final class OneMnpSaveOrderRequest {
    public static final int $stable = 8;
    @SerializedName("customer")
    @Nullable
    private final CustomerData customer;
    @SerializedName("order")
    @Nullable
    private final OrderData order;
    @SerializedName("orderData")
    @Nullable
    private final OrderConfigData orderData;
    @SerializedName("orderDataContent")
    @Nullable
    private final OrderDataContent orderDataContent;
    @SerializedName("orderItems")
    @Nullable
    private final List<OrderItemData> orderItems;
    @SerializedName("saleAgent")
    @Nullable
    private final SaleAgentData saleAgent;

    public OneMnpSaveOrderRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneMnpSaveOrderRequest copy$default(OneMnpSaveOrderRequest oneMnpSaveOrderRequest, OrderData orderData, CustomerData customerData, SaleAgentData saleAgentData, List list, OrderConfigData orderConfigData, OrderDataContent orderDataContent, int i, Object obj) {
        if ((i & 1) != 0) {
            orderData = oneMnpSaveOrderRequest.order;
        }
        if ((i & 2) != 0) {
            customerData = oneMnpSaveOrderRequest.customer;
        }
        CustomerData customerData2 = customerData;
        if ((i & 4) != 0) {
            saleAgentData = oneMnpSaveOrderRequest.saleAgent;
        }
        SaleAgentData saleAgentData2 = saleAgentData;
        List<OrderItemData> list2 = list;
        if ((i & 8) != 0) {
            list2 = oneMnpSaveOrderRequest.orderItems;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            orderConfigData = oneMnpSaveOrderRequest.orderData;
        }
        OrderConfigData orderConfigData2 = orderConfigData;
        if ((i & 32) != 0) {
            orderDataContent = oneMnpSaveOrderRequest.orderDataContent;
        }
        return oneMnpSaveOrderRequest.copy(orderData, customerData2, saleAgentData2, list3, orderConfigData2, orderDataContent);
    }

    @Nullable
    public final OrderData component1() {
        return this.order;
    }

    @Nullable
    public final CustomerData component2() {
        return this.customer;
    }

    @Nullable
    public final SaleAgentData component3() {
        return this.saleAgent;
    }

    @Nullable
    public final List<OrderItemData> component4() {
        return this.orderItems;
    }

    @Nullable
    public final OrderConfigData component5() {
        return this.orderData;
    }

    @Nullable
    public final OrderDataContent component6() {
        return this.orderDataContent;
    }

    @NotNull
    public final OneMnpSaveOrderRequest copy(@Nullable OrderData orderData, @Nullable CustomerData customerData, @Nullable SaleAgentData saleAgentData, @Nullable List<OrderItemData> list, @Nullable OrderConfigData orderConfigData, @Nullable OrderDataContent orderDataContent) {
        return new OneMnpSaveOrderRequest(orderData, customerData, saleAgentData, list, orderConfigData, orderDataContent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpSaveOrderRequest) {
            OneMnpSaveOrderRequest oneMnpSaveOrderRequest = (OneMnpSaveOrderRequest) obj;
            return Intrinsics.areEqual(this.order, oneMnpSaveOrderRequest.order) && Intrinsics.areEqual(this.customer, oneMnpSaveOrderRequest.customer) && Intrinsics.areEqual(this.saleAgent, oneMnpSaveOrderRequest.saleAgent) && Intrinsics.areEqual(this.orderItems, oneMnpSaveOrderRequest.orderItems) && Intrinsics.areEqual(this.orderData, oneMnpSaveOrderRequest.orderData) && Intrinsics.areEqual(this.orderDataContent, oneMnpSaveOrderRequest.orderDataContent);
        }
        return false;
    }

    @Nullable
    public final CustomerData getCustomer() {
        return this.customer;
    }

    @Nullable
    public final OrderData getOrder() {
        return this.order;
    }

    @Nullable
    public final OrderConfigData getOrderData() {
        return this.orderData;
    }

    @Nullable
    public final OrderDataContent getOrderDataContent() {
        return this.orderDataContent;
    }

    @Nullable
    public final List<OrderItemData> getOrderItems() {
        return this.orderItems;
    }

    @Nullable
    public final SaleAgentData getSaleAgent() {
        return this.saleAgent;
    }

    public int hashCode() {
        OrderData orderData = this.order;
        int hashCode = (orderData == null ? 0 : orderData.hashCode()) * 31;
        CustomerData customerData = this.customer;
        int hashCode2 = (hashCode + (customerData == null ? 0 : customerData.hashCode())) * 31;
        SaleAgentData saleAgentData = this.saleAgent;
        int hashCode3 = (hashCode2 + (saleAgentData == null ? 0 : saleAgentData.hashCode())) * 31;
        List<OrderItemData> list = this.orderItems;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        OrderConfigData orderConfigData = this.orderData;
        int hashCode5 = (hashCode4 + (orderConfigData == null ? 0 : orderConfigData.hashCode())) * 31;
        OrderDataContent orderDataContent = this.orderDataContent;
        return hashCode5 + (orderDataContent != null ? orderDataContent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OrderData orderData = this.order;
        CustomerData customerData = this.customer;
        SaleAgentData saleAgentData = this.saleAgent;
        List<OrderItemData> list = this.orderItems;
        OrderConfigData orderConfigData = this.orderData;
        OrderDataContent orderDataContent = this.orderDataContent;
        return "OneMnpSaveOrderRequest(order=" + orderData + ", customer=" + customerData + ", saleAgent=" + saleAgentData + ", orderItems=" + list + ", orderData=" + orderConfigData + ", orderDataContent=" + orderDataContent + ")";
    }

    public OneMnpSaveOrderRequest(@Nullable OrderData orderData, @Nullable CustomerData customerData, @Nullable SaleAgentData saleAgentData, @Nullable List<OrderItemData> list, @Nullable OrderConfigData orderConfigData, @Nullable OrderDataContent orderDataContent) {
        this.order = orderData;
        this.customer = customerData;
        this.saleAgent = saleAgentData;
        this.orderItems = list;
        this.orderData = orderConfigData;
        this.orderDataContent = orderDataContent;
    }

    public /* synthetic */ OneMnpSaveOrderRequest(OrderData orderData, CustomerData customerData, SaleAgentData saleAgentData, List list, OrderConfigData orderConfigData, OrderDataContent orderDataContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderData, (i & 2) != 0 ? null : customerData, (i & 4) != 0 ? null : saleAgentData, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : orderConfigData, (i & 32) != 0 ? null : orderDataContent);
    }
}