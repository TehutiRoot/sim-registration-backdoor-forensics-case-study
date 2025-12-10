package th.p047co.dtac.android.dtacone.model.mrtr_postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "Landroid/os/Parcelable;", "paymentSimPrice", "", "paymentChanel", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentChanel;", "paymentToggleReceipt", "paymentCredit", "", "paymentCashAndCreditNumber", "paymentCashAndCreditCardAmount", "paymentCashRemainForCombine", "(ZLth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentChanel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentCashAndCreditCardAmount", "()Ljava/lang/String;", "setPaymentCashAndCreditCardAmount", "(Ljava/lang/String;)V", "getPaymentCashAndCreditNumber", "setPaymentCashAndCreditNumber", "getPaymentCashRemainForCombine", "setPaymentCashRemainForCombine", "getPaymentChanel", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentChanel;", "setPaymentChanel", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentChanel;)V", "getPaymentCredit", "setPaymentCredit", "getPaymentSimPrice", "()Z", "setPaymentSimPrice", "(Z)V", "getPaymentToggleReceipt", "setPaymentToggleReceipt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.PaymentReceiptData */
/* loaded from: classes8.dex */
public final class PaymentReceiptData implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<PaymentReceiptData> CREATOR = new Creator();
    @SerializedName("paymentCashAndCreditCardAmount")
    @NotNull
    private String paymentCashAndCreditCardAmount;
    @SerializedName("paymentCashAndCreditNumber")
    @NotNull
    private String paymentCashAndCreditNumber;
    @SerializedName("paymentCashRemainForCombine")
    @NotNull
    private String paymentCashRemainForCombine;
    @SerializedName("paymentChanel")
    @NotNull
    private PaymentChanel paymentChanel;
    @SerializedName("paymentCredit")
    @NotNull
    private String paymentCredit;
    @SerializedName("paymentSimPrice")
    private boolean paymentSimPrice;
    @SerializedName("paymentToggleReceipt")
    private boolean paymentToggleReceipt;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.PaymentReceiptData$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PaymentReceiptData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentReceiptData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentReceiptData(parcel.readInt() != 0, PaymentChanel.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentReceiptData[] newArray(int i) {
            return new PaymentReceiptData[i];
        }
    }

    public PaymentReceiptData(boolean z, @NotNull PaymentChanel paymentChanel, boolean z2, @NotNull String paymentCredit, @NotNull String paymentCashAndCreditNumber, @NotNull String paymentCashAndCreditCardAmount, @NotNull String paymentCashRemainForCombine) {
        Intrinsics.checkNotNullParameter(paymentChanel, "paymentChanel");
        Intrinsics.checkNotNullParameter(paymentCredit, "paymentCredit");
        Intrinsics.checkNotNullParameter(paymentCashAndCreditNumber, "paymentCashAndCreditNumber");
        Intrinsics.checkNotNullParameter(paymentCashAndCreditCardAmount, "paymentCashAndCreditCardAmount");
        Intrinsics.checkNotNullParameter(paymentCashRemainForCombine, "paymentCashRemainForCombine");
        this.paymentSimPrice = z;
        this.paymentChanel = paymentChanel;
        this.paymentToggleReceipt = z2;
        this.paymentCredit = paymentCredit;
        this.paymentCashAndCreditNumber = paymentCashAndCreditNumber;
        this.paymentCashAndCreditCardAmount = paymentCashAndCreditCardAmount;
        this.paymentCashRemainForCombine = paymentCashRemainForCombine;
    }

    public static /* synthetic */ PaymentReceiptData copy$default(PaymentReceiptData paymentReceiptData, boolean z, PaymentChanel paymentChanel, boolean z2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentReceiptData.paymentSimPrice;
        }
        if ((i & 2) != 0) {
            paymentChanel = paymentReceiptData.paymentChanel;
        }
        PaymentChanel paymentChanel2 = paymentChanel;
        if ((i & 4) != 0) {
            z2 = paymentReceiptData.paymentToggleReceipt;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            str = paymentReceiptData.paymentCredit;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            str2 = paymentReceiptData.paymentCashAndCreditNumber;
        }
        String str6 = str2;
        if ((i & 32) != 0) {
            str3 = paymentReceiptData.paymentCashAndCreditCardAmount;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = paymentReceiptData.paymentCashRemainForCombine;
        }
        return paymentReceiptData.copy(z, paymentChanel2, z3, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.paymentSimPrice;
    }

    @NotNull
    public final PaymentChanel component2() {
        return this.paymentChanel;
    }

    public final boolean component3() {
        return this.paymentToggleReceipt;
    }

    @NotNull
    public final String component4() {
        return this.paymentCredit;
    }

    @NotNull
    public final String component5() {
        return this.paymentCashAndCreditNumber;
    }

    @NotNull
    public final String component6() {
        return this.paymentCashAndCreditCardAmount;
    }

    @NotNull
    public final String component7() {
        return this.paymentCashRemainForCombine;
    }

    @NotNull
    public final PaymentReceiptData copy(boolean z, @NotNull PaymentChanel paymentChanel, boolean z2, @NotNull String paymentCredit, @NotNull String paymentCashAndCreditNumber, @NotNull String paymentCashAndCreditCardAmount, @NotNull String paymentCashRemainForCombine) {
        Intrinsics.checkNotNullParameter(paymentChanel, "paymentChanel");
        Intrinsics.checkNotNullParameter(paymentCredit, "paymentCredit");
        Intrinsics.checkNotNullParameter(paymentCashAndCreditNumber, "paymentCashAndCreditNumber");
        Intrinsics.checkNotNullParameter(paymentCashAndCreditCardAmount, "paymentCashAndCreditCardAmount");
        Intrinsics.checkNotNullParameter(paymentCashRemainForCombine, "paymentCashRemainForCombine");
        return new PaymentReceiptData(z, paymentChanel, z2, paymentCredit, paymentCashAndCreditNumber, paymentCashAndCreditCardAmount, paymentCashRemainForCombine);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentReceiptData) {
            PaymentReceiptData paymentReceiptData = (PaymentReceiptData) obj;
            return this.paymentSimPrice == paymentReceiptData.paymentSimPrice && this.paymentChanel == paymentReceiptData.paymentChanel && this.paymentToggleReceipt == paymentReceiptData.paymentToggleReceipt && Intrinsics.areEqual(this.paymentCredit, paymentReceiptData.paymentCredit) && Intrinsics.areEqual(this.paymentCashAndCreditNumber, paymentReceiptData.paymentCashAndCreditNumber) && Intrinsics.areEqual(this.paymentCashAndCreditCardAmount, paymentReceiptData.paymentCashAndCreditCardAmount) && Intrinsics.areEqual(this.paymentCashRemainForCombine, paymentReceiptData.paymentCashRemainForCombine);
        }
        return false;
    }

    @NotNull
    public final String getPaymentCashAndCreditCardAmount() {
        return this.paymentCashAndCreditCardAmount;
    }

    @NotNull
    public final String getPaymentCashAndCreditNumber() {
        return this.paymentCashAndCreditNumber;
    }

    @NotNull
    public final String getPaymentCashRemainForCombine() {
        return this.paymentCashRemainForCombine;
    }

    @NotNull
    public final PaymentChanel getPaymentChanel() {
        return this.paymentChanel;
    }

    @NotNull
    public final String getPaymentCredit() {
        return this.paymentCredit;
    }

    public final boolean getPaymentSimPrice() {
        return this.paymentSimPrice;
    }

    public final boolean getPaymentToggleReceipt() {
        return this.paymentToggleReceipt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.paymentSimPrice;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.paymentChanel.hashCode()) * 31;
        boolean z2 = this.paymentToggleReceipt;
        return ((((((((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.paymentCredit.hashCode()) * 31) + this.paymentCashAndCreditNumber.hashCode()) * 31) + this.paymentCashAndCreditCardAmount.hashCode()) * 31) + this.paymentCashRemainForCombine.hashCode();
    }

    public final void setPaymentCashAndCreditCardAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentCashAndCreditCardAmount = str;
    }

    public final void setPaymentCashAndCreditNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentCashAndCreditNumber = str;
    }

    public final void setPaymentCashRemainForCombine(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentCashRemainForCombine = str;
    }

    public final void setPaymentChanel(@NotNull PaymentChanel paymentChanel) {
        Intrinsics.checkNotNullParameter(paymentChanel, "<set-?>");
        this.paymentChanel = paymentChanel;
    }

    public final void setPaymentCredit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentCredit = str;
    }

    public final void setPaymentSimPrice(boolean z) {
        this.paymentSimPrice = z;
    }

    public final void setPaymentToggleReceipt(boolean z) {
        this.paymentToggleReceipt = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.paymentSimPrice;
        PaymentChanel paymentChanel = this.paymentChanel;
        boolean z2 = this.paymentToggleReceipt;
        String str = this.paymentCredit;
        String str2 = this.paymentCashAndCreditNumber;
        String str3 = this.paymentCashAndCreditCardAmount;
        String str4 = this.paymentCashRemainForCombine;
        return "PaymentReceiptData(paymentSimPrice=" + z + ", paymentChanel=" + paymentChanel + ", paymentToggleReceipt=" + z2 + ", paymentCredit=" + str + ", paymentCashAndCreditNumber=" + str2 + ", paymentCashAndCreditCardAmount=" + str3 + ", paymentCashRemainForCombine=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.paymentSimPrice ? 1 : 0);
        out.writeString(this.paymentChanel.name());
        out.writeInt(this.paymentToggleReceipt ? 1 : 0);
        out.writeString(this.paymentCredit);
        out.writeString(this.paymentCashAndCreditNumber);
        out.writeString(this.paymentCashAndCreditCardAmount);
        out.writeString(this.paymentCashRemainForCombine);
    }
}