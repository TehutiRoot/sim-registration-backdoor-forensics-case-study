package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/PaymentTypeListResponse;", "", "listCampaignPaymentType", "", "Lth/co/dtac/android/dtacone/model/device_sale/PaymentTypeResponse;", "(Ljava/util/List;)V", "getListCampaignPaymentType", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.PaymentTypeListResponse */
/* loaded from: classes8.dex */
public final class PaymentTypeListResponse {
    public static final int $stable = 8;
    @SerializedName("listCampaignPaymentType")
    @NotNull
    private final List<PaymentTypeResponse> listCampaignPaymentType;

    public PaymentTypeListResponse(@NotNull List<PaymentTypeResponse> listCampaignPaymentType) {
        Intrinsics.checkNotNullParameter(listCampaignPaymentType, "listCampaignPaymentType");
        this.listCampaignPaymentType = listCampaignPaymentType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentTypeListResponse copy$default(PaymentTypeListResponse paymentTypeListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentTypeListResponse.listCampaignPaymentType;
        }
        return paymentTypeListResponse.copy(list);
    }

    @NotNull
    public final List<PaymentTypeResponse> component1() {
        return this.listCampaignPaymentType;
    }

    @NotNull
    public final PaymentTypeListResponse copy(@NotNull List<PaymentTypeResponse> listCampaignPaymentType) {
        Intrinsics.checkNotNullParameter(listCampaignPaymentType, "listCampaignPaymentType");
        return new PaymentTypeListResponse(listCampaignPaymentType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentTypeListResponse) && Intrinsics.areEqual(this.listCampaignPaymentType, ((PaymentTypeListResponse) obj).listCampaignPaymentType);
    }

    @NotNull
    public final List<PaymentTypeResponse> getListCampaignPaymentType() {
        return this.listCampaignPaymentType;
    }

    public int hashCode() {
        return this.listCampaignPaymentType.hashCode();
    }

    @NotNull
    public String toString() {
        List<PaymentTypeResponse> list = this.listCampaignPaymentType;
        return "PaymentTypeListResponse(listCampaignPaymentType=" + list + ")";
    }
}