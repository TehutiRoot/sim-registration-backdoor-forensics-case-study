package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R*\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaveOrderRequest;", "", "customer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidCustomer;", "order", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrder;", "orderData", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderData;", "orderDataContent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderDataContent;", "orderItems", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderItem;", "Lkotlin/collections/ArrayList;", "saleAgent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaleAgent;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidCustomer;Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrder;Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderData;Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderDataContent;Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaleAgent;)V", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidCustomer;", "getOrder", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrder;", "getOrderData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderData;", "getOrderDataContent", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidOrderDataContent;", "getOrderItems", "()Ljava/util/ArrayList;", "getSaleAgent", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaleAgent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidSaveOrderRequest */
/* loaded from: classes8.dex */
public final class OnePostPaidSaveOrderRequest {
    public static final int $stable = 8;
    @SerializedName("customer")
    @Nullable
    private final OnePostPaidCustomer customer;
    @SerializedName("order")
    @Nullable
    private final OnePostPaidOrder order;
    @SerializedName("orderData")
    @Nullable
    private final OnePostPaidOrderData orderData;
    @SerializedName("orderDataContent")
    @Nullable
    private final OnePostPaidOrderDataContent orderDataContent;
    @SerializedName("orderItems")
    @Nullable
    private final ArrayList<OnePostPaidOrderItem> orderItems;
    @SerializedName("saleAgent")
    @Nullable
    private final OnePostPaidSaleAgent saleAgent;

    public OnePostPaidSaveOrderRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnePostPaidSaveOrderRequest copy$default(OnePostPaidSaveOrderRequest onePostPaidSaveOrderRequest, OnePostPaidCustomer onePostPaidCustomer, OnePostPaidOrder onePostPaidOrder, OnePostPaidOrderData onePostPaidOrderData, OnePostPaidOrderDataContent onePostPaidOrderDataContent, ArrayList arrayList, OnePostPaidSaleAgent onePostPaidSaleAgent, int i, Object obj) {
        if ((i & 1) != 0) {
            onePostPaidCustomer = onePostPaidSaveOrderRequest.customer;
        }
        if ((i & 2) != 0) {
            onePostPaidOrder = onePostPaidSaveOrderRequest.order;
        }
        OnePostPaidOrder onePostPaidOrder2 = onePostPaidOrder;
        if ((i & 4) != 0) {
            onePostPaidOrderData = onePostPaidSaveOrderRequest.orderData;
        }
        OnePostPaidOrderData onePostPaidOrderData2 = onePostPaidOrderData;
        if ((i & 8) != 0) {
            onePostPaidOrderDataContent = onePostPaidSaveOrderRequest.orderDataContent;
        }
        OnePostPaidOrderDataContent onePostPaidOrderDataContent2 = onePostPaidOrderDataContent;
        ArrayList<OnePostPaidOrderItem> arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = onePostPaidSaveOrderRequest.orderItems;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 32) != 0) {
            onePostPaidSaleAgent = onePostPaidSaveOrderRequest.saleAgent;
        }
        return onePostPaidSaveOrderRequest.copy(onePostPaidCustomer, onePostPaidOrder2, onePostPaidOrderData2, onePostPaidOrderDataContent2, arrayList3, onePostPaidSaleAgent);
    }

    @Nullable
    public final OnePostPaidCustomer component1() {
        return this.customer;
    }

    @Nullable
    public final OnePostPaidOrder component2() {
        return this.order;
    }

    @Nullable
    public final OnePostPaidOrderData component3() {
        return this.orderData;
    }

    @Nullable
    public final OnePostPaidOrderDataContent component4() {
        return this.orderDataContent;
    }

    @Nullable
    public final ArrayList<OnePostPaidOrderItem> component5() {
        return this.orderItems;
    }

    @Nullable
    public final OnePostPaidSaleAgent component6() {
        return this.saleAgent;
    }

    @NotNull
    public final OnePostPaidSaveOrderRequest copy(@Nullable OnePostPaidCustomer onePostPaidCustomer, @Nullable OnePostPaidOrder onePostPaidOrder, @Nullable OnePostPaidOrderData onePostPaidOrderData, @Nullable OnePostPaidOrderDataContent onePostPaidOrderDataContent, @Nullable ArrayList<OnePostPaidOrderItem> arrayList, @Nullable OnePostPaidSaleAgent onePostPaidSaleAgent) {
        return new OnePostPaidSaveOrderRequest(onePostPaidCustomer, onePostPaidOrder, onePostPaidOrderData, onePostPaidOrderDataContent, arrayList, onePostPaidSaleAgent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidSaveOrderRequest) {
            OnePostPaidSaveOrderRequest onePostPaidSaveOrderRequest = (OnePostPaidSaveOrderRequest) obj;
            return Intrinsics.areEqual(this.customer, onePostPaidSaveOrderRequest.customer) && Intrinsics.areEqual(this.order, onePostPaidSaveOrderRequest.order) && Intrinsics.areEqual(this.orderData, onePostPaidSaveOrderRequest.orderData) && Intrinsics.areEqual(this.orderDataContent, onePostPaidSaveOrderRequest.orderDataContent) && Intrinsics.areEqual(this.orderItems, onePostPaidSaveOrderRequest.orderItems) && Intrinsics.areEqual(this.saleAgent, onePostPaidSaveOrderRequest.saleAgent);
        }
        return false;
    }

    @Nullable
    public final OnePostPaidCustomer getCustomer() {
        return this.customer;
    }

    @Nullable
    public final OnePostPaidOrder getOrder() {
        return this.order;
    }

    @Nullable
    public final OnePostPaidOrderData getOrderData() {
        return this.orderData;
    }

    @Nullable
    public final OnePostPaidOrderDataContent getOrderDataContent() {
        return this.orderDataContent;
    }

    @Nullable
    public final ArrayList<OnePostPaidOrderItem> getOrderItems() {
        return this.orderItems;
    }

    @Nullable
    public final OnePostPaidSaleAgent getSaleAgent() {
        return this.saleAgent;
    }

    public int hashCode() {
        OnePostPaidCustomer onePostPaidCustomer = this.customer;
        int hashCode = (onePostPaidCustomer == null ? 0 : onePostPaidCustomer.hashCode()) * 31;
        OnePostPaidOrder onePostPaidOrder = this.order;
        int hashCode2 = (hashCode + (onePostPaidOrder == null ? 0 : onePostPaidOrder.hashCode())) * 31;
        OnePostPaidOrderData onePostPaidOrderData = this.orderData;
        int hashCode3 = (hashCode2 + (onePostPaidOrderData == null ? 0 : onePostPaidOrderData.hashCode())) * 31;
        OnePostPaidOrderDataContent onePostPaidOrderDataContent = this.orderDataContent;
        int hashCode4 = (hashCode3 + (onePostPaidOrderDataContent == null ? 0 : onePostPaidOrderDataContent.hashCode())) * 31;
        ArrayList<OnePostPaidOrderItem> arrayList = this.orderItems;
        int hashCode5 = (hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        OnePostPaidSaleAgent onePostPaidSaleAgent = this.saleAgent;
        return hashCode5 + (onePostPaidSaleAgent != null ? onePostPaidSaleAgent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OnePostPaidCustomer onePostPaidCustomer = this.customer;
        OnePostPaidOrder onePostPaidOrder = this.order;
        OnePostPaidOrderData onePostPaidOrderData = this.orderData;
        OnePostPaidOrderDataContent onePostPaidOrderDataContent = this.orderDataContent;
        ArrayList<OnePostPaidOrderItem> arrayList = this.orderItems;
        OnePostPaidSaleAgent onePostPaidSaleAgent = this.saleAgent;
        return "OnePostPaidSaveOrderRequest(customer=" + onePostPaidCustomer + ", order=" + onePostPaidOrder + ", orderData=" + onePostPaidOrderData + ", orderDataContent=" + onePostPaidOrderDataContent + ", orderItems=" + arrayList + ", saleAgent=" + onePostPaidSaleAgent + ")";
    }

    public OnePostPaidSaveOrderRequest(@Nullable OnePostPaidCustomer onePostPaidCustomer, @Nullable OnePostPaidOrder onePostPaidOrder, @Nullable OnePostPaidOrderData onePostPaidOrderData, @Nullable OnePostPaidOrderDataContent onePostPaidOrderDataContent, @Nullable ArrayList<OnePostPaidOrderItem> arrayList, @Nullable OnePostPaidSaleAgent onePostPaidSaleAgent) {
        this.customer = onePostPaidCustomer;
        this.order = onePostPaidOrder;
        this.orderData = onePostPaidOrderData;
        this.orderDataContent = onePostPaidOrderDataContent;
        this.orderItems = arrayList;
        this.saleAgent = onePostPaidSaleAgent;
    }

    public /* synthetic */ OnePostPaidSaveOrderRequest(OnePostPaidCustomer onePostPaidCustomer, OnePostPaidOrder onePostPaidOrder, OnePostPaidOrderData onePostPaidOrderData, OnePostPaidOrderDataContent onePostPaidOrderDataContent, ArrayList arrayList, OnePostPaidSaleAgent onePostPaidSaleAgent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onePostPaidCustomer, (i & 2) != 0 ? null : onePostPaidOrder, (i & 4) != 0 ? null : onePostPaidOrderData, (i & 8) != 0 ? null : onePostPaidOrderDataContent, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : onePostPaidSaleAgent);
    }
}
