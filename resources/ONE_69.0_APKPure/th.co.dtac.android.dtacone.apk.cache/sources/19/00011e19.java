package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/DeviceSalePaymentHeader;", "", "totalAmount", "", "discountAmount", "paymentAmount", "balanceAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalanceAmount", "()Ljava/lang/String;", "setBalanceAmount", "(Ljava/lang/String;)V", "getDiscountAmount", "setDiscountAmount", "getPaymentAmount", "setPaymentAmount", "getTotalAmount", "setTotalAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.DeviceSalePaymentHeader */
/* loaded from: classes8.dex */
public final class DeviceSalePaymentHeader {
    public static final int $stable = 8;
    @NotNull
    private String balanceAmount;
    @NotNull
    private String discountAmount;
    @NotNull
    private String paymentAmount;
    @NotNull
    private String totalAmount;

    public DeviceSalePaymentHeader() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DeviceSalePaymentHeader copy$default(DeviceSalePaymentHeader deviceSalePaymentHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSalePaymentHeader.totalAmount;
        }
        if ((i & 2) != 0) {
            str2 = deviceSalePaymentHeader.discountAmount;
        }
        if ((i & 4) != 0) {
            str3 = deviceSalePaymentHeader.paymentAmount;
        }
        if ((i & 8) != 0) {
            str4 = deviceSalePaymentHeader.balanceAmount;
        }
        return deviceSalePaymentHeader.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.totalAmount;
    }

    @NotNull
    public final String component2() {
        return this.discountAmount;
    }

    @NotNull
    public final String component3() {
        return this.paymentAmount;
    }

    @NotNull
    public final String component4() {
        return this.balanceAmount;
    }

    @NotNull
    public final DeviceSalePaymentHeader copy(@NotNull String totalAmount, @NotNull String discountAmount, @NotNull String paymentAmount, @NotNull String balanceAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(discountAmount, "discountAmount");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(balanceAmount, "balanceAmount");
        return new DeviceSalePaymentHeader(totalAmount, discountAmount, paymentAmount, balanceAmount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSalePaymentHeader) {
            DeviceSalePaymentHeader deviceSalePaymentHeader = (DeviceSalePaymentHeader) obj;
            return Intrinsics.areEqual(this.totalAmount, deviceSalePaymentHeader.totalAmount) && Intrinsics.areEqual(this.discountAmount, deviceSalePaymentHeader.discountAmount) && Intrinsics.areEqual(this.paymentAmount, deviceSalePaymentHeader.paymentAmount) && Intrinsics.areEqual(this.balanceAmount, deviceSalePaymentHeader.balanceAmount);
        }
        return false;
    }

    @NotNull
    public final String getBalanceAmount() {
        return this.balanceAmount;
    }

    @NotNull
    public final String getDiscountAmount() {
        return this.discountAmount;
    }

    @NotNull
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @NotNull
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        return (((((this.totalAmount.hashCode() * 31) + this.discountAmount.hashCode()) * 31) + this.paymentAmount.hashCode()) * 31) + this.balanceAmount.hashCode();
    }

    public final void setBalanceAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.balanceAmount = str;
    }

    public final void setDiscountAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.discountAmount = str;
    }

    public final void setPaymentAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentAmount = str;
    }

    public final void setTotalAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalAmount = str;
    }

    @NotNull
    public String toString() {
        String str = this.totalAmount;
        String str2 = this.discountAmount;
        String str3 = this.paymentAmount;
        String str4 = this.balanceAmount;
        return "DeviceSalePaymentHeader(totalAmount=" + str + ", discountAmount=" + str2 + ", paymentAmount=" + str3 + ", balanceAmount=" + str4 + ")";
    }

    public DeviceSalePaymentHeader(@NotNull String totalAmount, @NotNull String discountAmount, @NotNull String paymentAmount, @NotNull String balanceAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(discountAmount, "discountAmount");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(balanceAmount, "balanceAmount");
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.paymentAmount = paymentAmount;
        this.balanceAmount = balanceAmount;
    }

    public /* synthetic */ DeviceSalePaymentHeader(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0.00" : str, (i & 2) != 0 ? "0.00" : str2, (i & 4) != 0 ? "0.00" : str3, (i & 8) != 0 ? "0.00" : str4);
    }
}