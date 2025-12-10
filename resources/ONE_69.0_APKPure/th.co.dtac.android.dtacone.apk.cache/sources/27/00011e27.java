package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetDiscountResponse;", "", "campaignCode", "", "campaignType", "discounts", "", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCampaignCode", "()Ljava/lang/String;", "getCampaignType", "getDiscounts", "()Ljava/util/List;", "setDiscounts", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetDiscountResponse */
/* loaded from: classes8.dex */
public final class GetDiscountResponse {
    public static final int $stable = 8;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("campaignType")
    @Nullable
    private final String campaignType;
    @SerializedName("discounts")
    @Nullable
    private List<Discount> discounts;

    public GetDiscountResponse(@Nullable String str, @Nullable String str2, @Nullable List<Discount> list) {
        this.campaignCode = str;
        this.campaignType = str2;
        this.discounts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDiscountResponse copy$default(GetDiscountResponse getDiscountResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDiscountResponse.campaignCode;
        }
        if ((i & 2) != 0) {
            str2 = getDiscountResponse.campaignType;
        }
        if ((i & 4) != 0) {
            list = getDiscountResponse.discounts;
        }
        return getDiscountResponse.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.campaignCode;
    }

    @Nullable
    public final String component2() {
        return this.campaignType;
    }

    @Nullable
    public final List<Discount> component3() {
        return this.discounts;
    }

    @NotNull
    public final GetDiscountResponse copy(@Nullable String str, @Nullable String str2, @Nullable List<Discount> list) {
        return new GetDiscountResponse(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDiscountResponse) {
            GetDiscountResponse getDiscountResponse = (GetDiscountResponse) obj;
            return Intrinsics.areEqual(this.campaignCode, getDiscountResponse.campaignCode) && Intrinsics.areEqual(this.campaignType, getDiscountResponse.campaignType) && Intrinsics.areEqual(this.discounts, getDiscountResponse.discounts);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignType() {
        return this.campaignType;
    }

    @Nullable
    public final List<Discount> getDiscounts() {
        return this.discounts;
    }

    public int hashCode() {
        String str = this.campaignCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Discount> list = this.discounts;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setDiscounts(@Nullable List<Discount> list) {
        this.discounts = list;
    }

    @NotNull
    public String toString() {
        String str = this.campaignCode;
        String str2 = this.campaignType;
        List<Discount> list = this.discounts;
        return "GetDiscountResponse(campaignCode=" + str + ", campaignType=" + str2 + ", discounts=" + list + ")";
    }
}