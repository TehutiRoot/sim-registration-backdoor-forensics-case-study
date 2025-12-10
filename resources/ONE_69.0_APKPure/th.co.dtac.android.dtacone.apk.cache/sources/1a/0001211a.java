package th.p047co.dtac.android.dtacone.model.withDevice.discount.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/discount/request/DiscountUssdRequest;", "", "inputFieldValue", "", "transactionId", "saleOrderTranId", "inputFieldId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInputFieldId", "()Ljava/lang/String;", "getInputFieldValue", "getSaleOrderTranId", "getTransactionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.discount.request.DiscountUssdRequest */
/* loaded from: classes8.dex */
public final class DiscountUssdRequest {
    public static final int $stable = 0;
    @SerializedName("inputFieldId")
    @Nullable
    private final String inputFieldId;
    @SerializedName("inputFieldValue")
    @Nullable
    private final String inputFieldValue;
    @SerializedName("saleOrderTranId")
    @Nullable
    private final String saleOrderTranId;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    public DiscountUssdRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DiscountUssdRequest copy$default(DiscountUssdRequest discountUssdRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountUssdRequest.inputFieldValue;
        }
        if ((i & 2) != 0) {
            str2 = discountUssdRequest.transactionId;
        }
        if ((i & 4) != 0) {
            str3 = discountUssdRequest.saleOrderTranId;
        }
        if ((i & 8) != 0) {
            str4 = discountUssdRequest.inputFieldId;
        }
        return discountUssdRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.inputFieldValue;
    }

    @Nullable
    public final String component2() {
        return this.transactionId;
    }

    @Nullable
    public final String component3() {
        return this.saleOrderTranId;
    }

    @Nullable
    public final String component4() {
        return this.inputFieldId;
    }

    @NotNull
    public final DiscountUssdRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new DiscountUssdRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscountUssdRequest) {
            DiscountUssdRequest discountUssdRequest = (DiscountUssdRequest) obj;
            return Intrinsics.areEqual(this.inputFieldValue, discountUssdRequest.inputFieldValue) && Intrinsics.areEqual(this.transactionId, discountUssdRequest.transactionId) && Intrinsics.areEqual(this.saleOrderTranId, discountUssdRequest.saleOrderTranId) && Intrinsics.areEqual(this.inputFieldId, discountUssdRequest.inputFieldId);
        }
        return false;
    }

    @Nullable
    public final String getInputFieldId() {
        return this.inputFieldId;
    }

    @Nullable
    public final String getInputFieldValue() {
        return this.inputFieldValue;
    }

    @Nullable
    public final String getSaleOrderTranId() {
        return this.saleOrderTranId;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.inputFieldValue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.saleOrderTranId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inputFieldId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.inputFieldValue;
        String str2 = this.transactionId;
        String str3 = this.saleOrderTranId;
        String str4 = this.inputFieldId;
        return "DiscountUssdRequest(inputFieldValue=" + str + ", transactionId=" + str2 + ", saleOrderTranId=" + str3 + ", inputFieldId=" + str4 + ")";
    }

    public DiscountUssdRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.inputFieldValue = str;
        this.transactionId = str2;
        this.saleOrderTranId = str3;
        this.inputFieldId = str4;
    }

    public /* synthetic */ DiscountUssdRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}