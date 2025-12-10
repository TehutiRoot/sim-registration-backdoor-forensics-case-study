package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundBillingRequest;", "", "unpaidBillCount", "", "product", "contactStatus", "", "dueStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getContactStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDueStatus", "()Ljava/lang/String;", "getProduct", "getUnpaidBillCount", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundBillingRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundBillingRequest */
/* loaded from: classes8.dex */
public final class OneNadOutboundBillingRequest {
    public static final int $stable = 0;
    @SerializedName("contactStatus")
    @Nullable
    private final Boolean contactStatus;
    @SerializedName("dueStatus")
    @Nullable
    private final String dueStatus;
    @SerializedName("product")
    @NotNull
    private final String product;
    @SerializedName("unpaidBillCount")
    @NotNull
    private final String unpaidBillCount;

    public OneNadOutboundBillingRequest(@NotNull String unpaidBillCount, @NotNull String product, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        Intrinsics.checkNotNullParameter(product, "product");
        this.unpaidBillCount = unpaidBillCount;
        this.product = product;
        this.contactStatus = bool;
        this.dueStatus = str;
    }

    public static /* synthetic */ OneNadOutboundBillingRequest copy$default(OneNadOutboundBillingRequest oneNadOutboundBillingRequest, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundBillingRequest.unpaidBillCount;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundBillingRequest.product;
        }
        if ((i & 4) != 0) {
            bool = oneNadOutboundBillingRequest.contactStatus;
        }
        if ((i & 8) != 0) {
            str3 = oneNadOutboundBillingRequest.dueStatus;
        }
        return oneNadOutboundBillingRequest.copy(str, str2, bool, str3);
    }

    @NotNull
    public final String component1() {
        return this.unpaidBillCount;
    }

    @NotNull
    public final String component2() {
        return this.product;
    }

    @Nullable
    public final Boolean component3() {
        return this.contactStatus;
    }

    @Nullable
    public final String component4() {
        return this.dueStatus;
    }

    @NotNull
    public final OneNadOutboundBillingRequest copy(@NotNull String unpaidBillCount, @NotNull String product, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(unpaidBillCount, "unpaidBillCount");
        Intrinsics.checkNotNullParameter(product, "product");
        return new OneNadOutboundBillingRequest(unpaidBillCount, product, bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundBillingRequest) {
            OneNadOutboundBillingRequest oneNadOutboundBillingRequest = (OneNadOutboundBillingRequest) obj;
            return Intrinsics.areEqual(this.unpaidBillCount, oneNadOutboundBillingRequest.unpaidBillCount) && Intrinsics.areEqual(this.product, oneNadOutboundBillingRequest.product) && Intrinsics.areEqual(this.contactStatus, oneNadOutboundBillingRequest.contactStatus) && Intrinsics.areEqual(this.dueStatus, oneNadOutboundBillingRequest.dueStatus);
        }
        return false;
    }

    @Nullable
    public final Boolean getContactStatus() {
        return this.contactStatus;
    }

    @Nullable
    public final String getDueStatus() {
        return this.dueStatus;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    public final String getUnpaidBillCount() {
        return this.unpaidBillCount;
    }

    public int hashCode() {
        int hashCode = ((this.unpaidBillCount.hashCode() * 31) + this.product.hashCode()) * 31;
        Boolean bool = this.contactStatus;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.dueStatus;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.unpaidBillCount;
        String str2 = this.product;
        Boolean bool = this.contactStatus;
        String str3 = this.dueStatus;
        return "OneNadOutboundBillingRequest(unpaidBillCount=" + str + ", product=" + str2 + ", contactStatus=" + bool + ", dueStatus=" + str3 + ")";
    }
}