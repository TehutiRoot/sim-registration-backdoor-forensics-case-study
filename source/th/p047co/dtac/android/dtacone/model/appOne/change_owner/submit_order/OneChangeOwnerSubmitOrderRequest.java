package th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_order;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest;", "", "customerInfo", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/CustomerInfo;", "orderItems", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OrderItems;", "orderData", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest$OrderData;", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/CustomerInfo;Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OrderItems;Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest$OrderData;)V", "getCustomerInfo", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/CustomerInfo;", "getOrderData", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest$OrderData;", "getOrderItems", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OrderItems;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OrderData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.submit_order.OneChangeOwnerSubmitOrderRequest */
/* loaded from: classes8.dex */
public final class OneChangeOwnerSubmitOrderRequest {
    public static final int $stable = 0;
    @SerializedName("customerInfo")
    @Nullable
    private final CustomerInfo customerInfo;
    @SerializedName("orderData")
    @Nullable
    private final OrderData orderData;
    @SerializedName("orderItems")
    @Nullable
    private final OrderItems orderItems;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest$OrderData;", "", "verifyDocType", "", "resultMatching", "dipChipStatus", "dopaStatus", "slugID", "verifyForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDipChipStatus", "()Ljava/lang/String;", "getDopaStatus", "getResultMatching", "getSlugID", "getVerifyDocType", "getVerifyForm", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.submit_order.OneChangeOwnerSubmitOrderRequest$OrderData */
    /* loaded from: classes8.dex */
    public static final class OrderData {
        public static final int $stable = 0;
        @SerializedName("dipChipStatus")
        @Nullable
        private final String dipChipStatus;
        @SerializedName("dopaStatus")
        @Nullable
        private final String dopaStatus;
        @SerializedName("resultMatching")
        @Nullable
        private final String resultMatching;
        @SerializedName("slugID")
        @Nullable
        private final String slugID;
        @SerializedName("verifyDocType")
        @Nullable
        private final String verifyDocType;
        @SerializedName("verifyForm")
        @Nullable
        private final String verifyForm;

        public OrderData() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ OrderData copy$default(OrderData orderData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderData.verifyDocType;
            }
            if ((i & 2) != 0) {
                str2 = orderData.resultMatching;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = orderData.dipChipStatus;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = orderData.dopaStatus;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = orderData.slugID;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = orderData.verifyForm;
            }
            return orderData.copy(str, str7, str8, str9, str10, str6);
        }

        @Nullable
        public final String component1() {
            return this.verifyDocType;
        }

        @Nullable
        public final String component2() {
            return this.resultMatching;
        }

        @Nullable
        public final String component3() {
            return this.dipChipStatus;
        }

        @Nullable
        public final String component4() {
            return this.dopaStatus;
        }

        @Nullable
        public final String component5() {
            return this.slugID;
        }

        @Nullable
        public final String component6() {
            return this.verifyForm;
        }

        @NotNull
        public final OrderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            return new OrderData(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OrderData) {
                OrderData orderData = (OrderData) obj;
                return Intrinsics.areEqual(this.verifyDocType, orderData.verifyDocType) && Intrinsics.areEqual(this.resultMatching, orderData.resultMatching) && Intrinsics.areEqual(this.dipChipStatus, orderData.dipChipStatus) && Intrinsics.areEqual(this.dopaStatus, orderData.dopaStatus) && Intrinsics.areEqual(this.slugID, orderData.slugID) && Intrinsics.areEqual(this.verifyForm, orderData.verifyForm);
            }
            return false;
        }

        @Nullable
        public final String getDipChipStatus() {
            return this.dipChipStatus;
        }

        @Nullable
        public final String getDopaStatus() {
            return this.dopaStatus;
        }

        @Nullable
        public final String getResultMatching() {
            return this.resultMatching;
        }

        @Nullable
        public final String getSlugID() {
            return this.slugID;
        }

        @Nullable
        public final String getVerifyDocType() {
            return this.verifyDocType;
        }

        @Nullable
        public final String getVerifyForm() {
            return this.verifyForm;
        }

        public int hashCode() {
            String str = this.verifyDocType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.resultMatching;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dipChipStatus;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dopaStatus;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.slugID;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifyForm;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.verifyDocType;
            String str2 = this.resultMatching;
            String str3 = this.dipChipStatus;
            String str4 = this.dopaStatus;
            String str5 = this.slugID;
            String str6 = this.verifyForm;
            return "OrderData(verifyDocType=" + str + ", resultMatching=" + str2 + ", dipChipStatus=" + str3 + ", dopaStatus=" + str4 + ", slugID=" + str5 + ", verifyForm=" + str6 + ")";
        }

        public OrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.verifyDocType = str;
            this.resultMatching = str2;
            this.dipChipStatus = str3;
            this.dopaStatus = str4;
            this.slugID = str5;
            this.verifyForm = str6;
        }

        public /* synthetic */ OrderData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }
    }

    public OneChangeOwnerSubmitOrderRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneChangeOwnerSubmitOrderRequest copy$default(OneChangeOwnerSubmitOrderRequest oneChangeOwnerSubmitOrderRequest, CustomerInfo customerInfo, OrderItems orderItems, OrderData orderData, int i, Object obj) {
        if ((i & 1) != 0) {
            customerInfo = oneChangeOwnerSubmitOrderRequest.customerInfo;
        }
        if ((i & 2) != 0) {
            orderItems = oneChangeOwnerSubmitOrderRequest.orderItems;
        }
        if ((i & 4) != 0) {
            orderData = oneChangeOwnerSubmitOrderRequest.orderData;
        }
        return oneChangeOwnerSubmitOrderRequest.copy(customerInfo, orderItems, orderData);
    }

    @Nullable
    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    @Nullable
    public final OrderItems component2() {
        return this.orderItems;
    }

    @Nullable
    public final OrderData component3() {
        return this.orderData;
    }

    @NotNull
    public final OneChangeOwnerSubmitOrderRequest copy(@Nullable CustomerInfo customerInfo, @Nullable OrderItems orderItems, @Nullable OrderData orderData) {
        return new OneChangeOwnerSubmitOrderRequest(customerInfo, orderItems, orderData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneChangeOwnerSubmitOrderRequest) {
            OneChangeOwnerSubmitOrderRequest oneChangeOwnerSubmitOrderRequest = (OneChangeOwnerSubmitOrderRequest) obj;
            return Intrinsics.areEqual(this.customerInfo, oneChangeOwnerSubmitOrderRequest.customerInfo) && Intrinsics.areEqual(this.orderItems, oneChangeOwnerSubmitOrderRequest.orderItems) && Intrinsics.areEqual(this.orderData, oneChangeOwnerSubmitOrderRequest.orderData);
        }
        return false;
    }

    @Nullable
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    @Nullable
    public final OrderData getOrderData() {
        return this.orderData;
    }

    @Nullable
    public final OrderItems getOrderItems() {
        return this.orderItems;
    }

    public int hashCode() {
        CustomerInfo customerInfo = this.customerInfo;
        int hashCode = (customerInfo == null ? 0 : customerInfo.hashCode()) * 31;
        OrderItems orderItems = this.orderItems;
        int hashCode2 = (hashCode + (orderItems == null ? 0 : orderItems.hashCode())) * 31;
        OrderData orderData = this.orderData;
        return hashCode2 + (orderData != null ? orderData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CustomerInfo customerInfo = this.customerInfo;
        OrderItems orderItems = this.orderItems;
        OrderData orderData = this.orderData;
        return "OneChangeOwnerSubmitOrderRequest(customerInfo=" + customerInfo + ", orderItems=" + orderItems + ", orderData=" + orderData + ")";
    }

    public OneChangeOwnerSubmitOrderRequest(@Nullable CustomerInfo customerInfo, @Nullable OrderItems orderItems, @Nullable OrderData orderData) {
        this.customerInfo = customerInfo;
        this.orderItems = orderItems;
        this.orderData = orderData;
    }

    public /* synthetic */ OneChangeOwnerSubmitOrderRequest(CustomerInfo customerInfo, OrderItems orderItems, OrderData orderData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerInfo, (i & 2) != 0 ? null : orderItems, (i & 4) != 0 ? null : orderData);
    }
}
