package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundCustomerInfoRequest;", "", "productNumber", "", "product", "ban", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBan", "()Ljava/lang/String;", "getProduct", "getProductNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundCustomerInfoRequest */
/* loaded from: classes8.dex */
public final class OneNadOutboundCustomerInfoRequest {
    public static final int $stable = 0;
    @SerializedName("ban")
    @NotNull
    private final String ban;
    @SerializedName("product")
    @NotNull
    private final String product;
    @SerializedName("productNumber")
    @NotNull
    private final String productNumber;

    public OneNadOutboundCustomerInfoRequest(@NotNull String productNumber, @NotNull String product, @NotNull String ban) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(ban, "ban");
        this.productNumber = productNumber;
        this.product = product;
        this.ban = ban;
    }

    public static /* synthetic */ OneNadOutboundCustomerInfoRequest copy$default(OneNadOutboundCustomerInfoRequest oneNadOutboundCustomerInfoRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundCustomerInfoRequest.productNumber;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundCustomerInfoRequest.product;
        }
        if ((i & 4) != 0) {
            str3 = oneNadOutboundCustomerInfoRequest.ban;
        }
        return oneNadOutboundCustomerInfoRequest.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.productNumber;
    }

    @NotNull
    public final String component2() {
        return this.product;
    }

    @NotNull
    public final String component3() {
        return this.ban;
    }

    @NotNull
    public final OneNadOutboundCustomerInfoRequest copy(@NotNull String productNumber, @NotNull String product, @NotNull String ban) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(ban, "ban");
        return new OneNadOutboundCustomerInfoRequest(productNumber, product, ban);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundCustomerInfoRequest) {
            OneNadOutboundCustomerInfoRequest oneNadOutboundCustomerInfoRequest = (OneNadOutboundCustomerInfoRequest) obj;
            return Intrinsics.areEqual(this.productNumber, oneNadOutboundCustomerInfoRequest.productNumber) && Intrinsics.areEqual(this.product, oneNadOutboundCustomerInfoRequest.product) && Intrinsics.areEqual(this.ban, oneNadOutboundCustomerInfoRequest.ban);
        }
        return false;
    }

    @NotNull
    public final String getBan() {
        return this.ban;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    public final String getProductNumber() {
        return this.productNumber;
    }

    public int hashCode() {
        return (((this.productNumber.hashCode() * 31) + this.product.hashCode()) * 31) + this.ban.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.productNumber;
        String str2 = this.product;
        String str3 = this.ban;
        return "OneNadOutboundCustomerInfoRequest(productNumber=" + str + ", product=" + str2 + ", ban=" + str3 + ")";
    }
}