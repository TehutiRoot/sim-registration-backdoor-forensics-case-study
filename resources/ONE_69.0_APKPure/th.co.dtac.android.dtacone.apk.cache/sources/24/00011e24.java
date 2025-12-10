package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetAuthDeviceSaleResponse;", "", "isRequirePaymentInfo", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetAuthDeviceSaleResponse */
/* loaded from: classes8.dex */
public final class GetAuthDeviceSaleResponse {
    public static final int $stable = 0;
    @SerializedName("isRequirePaymentInfo")
    private final boolean isRequirePaymentInfo;

    public GetAuthDeviceSaleResponse(boolean z) {
        this.isRequirePaymentInfo = z;
    }

    public static /* synthetic */ GetAuthDeviceSaleResponse copy$default(GetAuthDeviceSaleResponse getAuthDeviceSaleResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getAuthDeviceSaleResponse.isRequirePaymentInfo;
        }
        return getAuthDeviceSaleResponse.copy(z);
    }

    public final boolean component1() {
        return this.isRequirePaymentInfo;
    }

    @NotNull
    public final GetAuthDeviceSaleResponse copy(boolean z) {
        return new GetAuthDeviceSaleResponse(z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAuthDeviceSaleResponse) && this.isRequirePaymentInfo == ((GetAuthDeviceSaleResponse) obj).isRequirePaymentInfo;
    }

    public int hashCode() {
        boolean z = this.isRequirePaymentInfo;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isRequirePaymentInfo() {
        return this.isRequirePaymentInfo;
    }

    @NotNull
    public String toString() {
        boolean z = this.isRequirePaymentInfo;
        return "GetAuthDeviceSaleResponse(isRequirePaymentInfo=" + z + ")";
    }
}