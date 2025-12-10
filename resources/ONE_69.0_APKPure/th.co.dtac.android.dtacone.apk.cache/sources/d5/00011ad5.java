package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleValidateStockRequest;", "", "orderId", "", "type", "serialNo", "dtrCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getOrderId", "getSerialNo", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleValidateStockRequest */
/* loaded from: classes8.dex */
public final class OneDeviceSaleValidateStockRequest {
    public static final int $stable = 0;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("serialNo")
    @Nullable
    private final String serialNo;
    @SerializedName("type")
    @Nullable
    private final String type;

    public OneDeviceSaleValidateStockRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneDeviceSaleValidateStockRequest copy$default(OneDeviceSaleValidateStockRequest oneDeviceSaleValidateStockRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneDeviceSaleValidateStockRequest.orderId;
        }
        if ((i & 2) != 0) {
            str2 = oneDeviceSaleValidateStockRequest.type;
        }
        if ((i & 4) != 0) {
            str3 = oneDeviceSaleValidateStockRequest.serialNo;
        }
        if ((i & 8) != 0) {
            str4 = oneDeviceSaleValidateStockRequest.dtrCode;
        }
        return oneDeviceSaleValidateStockRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.serialNo;
    }

    @Nullable
    public final String component4() {
        return this.dtrCode;
    }

    @NotNull
    public final OneDeviceSaleValidateStockRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneDeviceSaleValidateStockRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleValidateStockRequest) {
            OneDeviceSaleValidateStockRequest oneDeviceSaleValidateStockRequest = (OneDeviceSaleValidateStockRequest) obj;
            return Intrinsics.areEqual(this.orderId, oneDeviceSaleValidateStockRequest.orderId) && Intrinsics.areEqual(this.type, oneDeviceSaleValidateStockRequest.type) && Intrinsics.areEqual(this.serialNo, oneDeviceSaleValidateStockRequest.serialNo) && Intrinsics.areEqual(this.dtrCode, oneDeviceSaleValidateStockRequest.dtrCode);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getSerialNo() {
        return this.serialNo;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serialNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dtrCode;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.type;
        String str3 = this.serialNo;
        String str4 = this.dtrCode;
        return "OneDeviceSaleValidateStockRequest(orderId=" + str + ", type=" + str2 + ", serialNo=" + str3 + ", dtrCode=" + str4 + ")";
    }

    public OneDeviceSaleValidateStockRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.orderId = str;
        this.type = str2;
        this.serialNo = str3;
        this.dtrCode = str4;
    }

    public /* synthetic */ OneDeviceSaleValidateStockRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}