package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpTSummitOrderRequest;", "", "orderId", "", "flowName", "orderData", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SummitOrderData;", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SummitOrderData;)V", "getFlowName", "()Ljava/lang/String;", "getOrderData", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SummitOrderData;", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpTSummitOrderRequest */
/* loaded from: classes8.dex */
public final class OneMnpTSummitOrderRequest {
    public static final int $stable = 0;
    @SerializedName("flowName")
    @Nullable
    private final String flowName;
    @SerializedName("orderData")
    @Nullable
    private final SummitOrderData orderData;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    public OneMnpTSummitOrderRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneMnpTSummitOrderRequest copy$default(OneMnpTSummitOrderRequest oneMnpTSummitOrderRequest, String str, String str2, SummitOrderData summitOrderData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpTSummitOrderRequest.orderId;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpTSummitOrderRequest.flowName;
        }
        if ((i & 4) != 0) {
            summitOrderData = oneMnpTSummitOrderRequest.orderData;
        }
        return oneMnpTSummitOrderRequest.copy(str, str2, summitOrderData);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final String component2() {
        return this.flowName;
    }

    @Nullable
    public final SummitOrderData component3() {
        return this.orderData;
    }

    @NotNull
    public final OneMnpTSummitOrderRequest copy(@Nullable String str, @Nullable String str2, @Nullable SummitOrderData summitOrderData) {
        return new OneMnpTSummitOrderRequest(str, str2, summitOrderData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpTSummitOrderRequest) {
            OneMnpTSummitOrderRequest oneMnpTSummitOrderRequest = (OneMnpTSummitOrderRequest) obj;
            return Intrinsics.areEqual(this.orderId, oneMnpTSummitOrderRequest.orderId) && Intrinsics.areEqual(this.flowName, oneMnpTSummitOrderRequest.flowName) && Intrinsics.areEqual(this.orderData, oneMnpTSummitOrderRequest.orderData);
        }
        return false;
    }

    @Nullable
    public final String getFlowName() {
        return this.flowName;
    }

    @Nullable
    public final SummitOrderData getOrderData() {
        return this.orderData;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SummitOrderData summitOrderData = this.orderData;
        return hashCode2 + (summitOrderData != null ? summitOrderData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.flowName;
        SummitOrderData summitOrderData = this.orderData;
        return "OneMnpTSummitOrderRequest(orderId=" + str + ", flowName=" + str2 + ", orderData=" + summitOrderData + ")";
    }

    public OneMnpTSummitOrderRequest(@Nullable String str, @Nullable String str2, @Nullable SummitOrderData summitOrderData) {
        this.orderId = str;
        this.flowName = str2;
        this.orderData = summitOrderData;
    }

    public /* synthetic */ OneMnpTSummitOrderRequest(String str, String str2, SummitOrderData summitOrderData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : summitOrderData);
    }
}
