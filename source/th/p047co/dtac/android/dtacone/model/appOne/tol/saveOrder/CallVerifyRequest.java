package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyRequest;", "", "orderId", "", "customerType", "idType", "wssoSaleCode", "wssoChannelAlias", "productList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyProduct;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCustomerType", "()Ljava/lang/String;", "getIdType", "getOrderId", "getProductList", "()Ljava/util/List;", "getWssoChannelAlias", "getWssoSaleCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.CallVerifyRequest */
/* loaded from: classes8.dex */
public final class CallVerifyRequest {
    public static final int $stable = 8;
    @SerializedName("customerType")
    @NotNull
    private final String customerType;
    @SerializedName("idType")
    @NotNull
    private final String idType;
    @SerializedName("orderId")
    @NotNull
    private final String orderId;
    @SerializedName("productList")
    @NotNull
    private final List<CallVerifyProduct> productList;
    @SerializedName("wssoChannelAlias")
    @NotNull
    private final String wssoChannelAlias;
    @SerializedName("wssoSaleCode")
    @NotNull
    private final String wssoSaleCode;

    public CallVerifyRequest(@NotNull String orderId, @NotNull String customerType, @NotNull String idType, @NotNull String wssoSaleCode, @NotNull String wssoChannelAlias, @NotNull List<CallVerifyProduct> productList) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(wssoSaleCode, "wssoSaleCode");
        Intrinsics.checkNotNullParameter(wssoChannelAlias, "wssoChannelAlias");
        Intrinsics.checkNotNullParameter(productList, "productList");
        this.orderId = orderId;
        this.customerType = customerType;
        this.idType = idType;
        this.wssoSaleCode = wssoSaleCode;
        this.wssoChannelAlias = wssoChannelAlias;
        this.productList = productList;
    }

    public static /* synthetic */ CallVerifyRequest copy$default(CallVerifyRequest callVerifyRequest, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callVerifyRequest.orderId;
        }
        if ((i & 2) != 0) {
            str2 = callVerifyRequest.customerType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = callVerifyRequest.idType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = callVerifyRequest.wssoSaleCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = callVerifyRequest.wssoChannelAlias;
        }
        String str9 = str5;
        List<CallVerifyProduct> list2 = list;
        if ((i & 32) != 0) {
            list2 = callVerifyRequest.productList;
        }
        return callVerifyRequest.copy(str, str6, str7, str8, str9, list2);
    }

    @NotNull
    public final String component1() {
        return this.orderId;
    }

    @NotNull
    public final String component2() {
        return this.customerType;
    }

    @NotNull
    public final String component3() {
        return this.idType;
    }

    @NotNull
    public final String component4() {
        return this.wssoSaleCode;
    }

    @NotNull
    public final String component5() {
        return this.wssoChannelAlias;
    }

    @NotNull
    public final List<CallVerifyProduct> component6() {
        return this.productList;
    }

    @NotNull
    public final CallVerifyRequest copy(@NotNull String orderId, @NotNull String customerType, @NotNull String idType, @NotNull String wssoSaleCode, @NotNull String wssoChannelAlias, @NotNull List<CallVerifyProduct> productList) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(wssoSaleCode, "wssoSaleCode");
        Intrinsics.checkNotNullParameter(wssoChannelAlias, "wssoChannelAlias");
        Intrinsics.checkNotNullParameter(productList, "productList");
        return new CallVerifyRequest(orderId, customerType, idType, wssoSaleCode, wssoChannelAlias, productList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallVerifyRequest) {
            CallVerifyRequest callVerifyRequest = (CallVerifyRequest) obj;
            return Intrinsics.areEqual(this.orderId, callVerifyRequest.orderId) && Intrinsics.areEqual(this.customerType, callVerifyRequest.customerType) && Intrinsics.areEqual(this.idType, callVerifyRequest.idType) && Intrinsics.areEqual(this.wssoSaleCode, callVerifyRequest.wssoSaleCode) && Intrinsics.areEqual(this.wssoChannelAlias, callVerifyRequest.wssoChannelAlias) && Intrinsics.areEqual(this.productList, callVerifyRequest.productList);
        }
        return false;
    }

    @NotNull
    public final String getCustomerType() {
        return this.customerType;
    }

    @NotNull
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final List<CallVerifyProduct> getProductList() {
        return this.productList;
    }

    @NotNull
    public final String getWssoChannelAlias() {
        return this.wssoChannelAlias;
    }

    @NotNull
    public final String getWssoSaleCode() {
        return this.wssoSaleCode;
    }

    public int hashCode() {
        return (((((((((this.orderId.hashCode() * 31) + this.customerType.hashCode()) * 31) + this.idType.hashCode()) * 31) + this.wssoSaleCode.hashCode()) * 31) + this.wssoChannelAlias.hashCode()) * 31) + this.productList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.customerType;
        String str3 = this.idType;
        String str4 = this.wssoSaleCode;
        String str5 = this.wssoChannelAlias;
        List<CallVerifyProduct> list = this.productList;
        return "CallVerifyRequest(orderId=" + str + ", customerType=" + str2 + ", idType=" + str3 + ", wssoSaleCode=" + str4 + ", wssoChannelAlias=" + str5 + ", productList=" + list + ")";
    }

    public /* synthetic */ CallVerifyRequest(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "I" : str2, str3, str4, str5, list);
    }
}
