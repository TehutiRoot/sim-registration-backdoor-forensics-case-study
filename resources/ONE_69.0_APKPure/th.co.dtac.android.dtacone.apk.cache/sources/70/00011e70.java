package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/SendSaleTransToRichPOSRequest;", "", "simCardNumber", "", "cashAmount", "locationCode", "sku", "paymentType", "userLan", "creditCardAmount", "cardNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCashAmount", "getCreditCardAmount", "getLocationCode", "getPaymentType", "getSimCardNumber", "getSku", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.SendSaleTransToRichPOSRequest */
/* loaded from: classes8.dex */
public final class SendSaleTransToRichPOSRequest {
    public static final int $stable = 0;
    @SerializedName("cardNumber")
    @Nullable
    private final String cardNumber;
    @SerializedName("cashAmount")
    @Nullable
    private final String cashAmount;
    @SerializedName("creditCardAmount")
    @Nullable
    private final String creditCardAmount;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("paymentType")
    @Nullable
    private final String paymentType;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("sku")
    @Nullable
    private final String sku;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public SendSaleTransToRichPOSRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.cashAmount;
    }

    @Nullable
    public final String component3() {
        return this.locationCode;
    }

    @Nullable
    public final String component4() {
        return this.sku;
    }

    @Nullable
    public final String component5() {
        return this.paymentType;
    }

    @Nullable
    public final String component6() {
        return this.userLan;
    }

    @Nullable
    public final String component7() {
        return this.creditCardAmount;
    }

    @Nullable
    public final String component8() {
        return this.cardNumber;
    }

    @NotNull
    public final SendSaleTransToRichPOSRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new SendSaleTransToRichPOSRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendSaleTransToRichPOSRequest) {
            SendSaleTransToRichPOSRequest sendSaleTransToRichPOSRequest = (SendSaleTransToRichPOSRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, sendSaleTransToRichPOSRequest.simCardNumber) && Intrinsics.areEqual(this.cashAmount, sendSaleTransToRichPOSRequest.cashAmount) && Intrinsics.areEqual(this.locationCode, sendSaleTransToRichPOSRequest.locationCode) && Intrinsics.areEqual(this.sku, sendSaleTransToRichPOSRequest.sku) && Intrinsics.areEqual(this.paymentType, sendSaleTransToRichPOSRequest.paymentType) && Intrinsics.areEqual(this.userLan, sendSaleTransToRichPOSRequest.userLan) && Intrinsics.areEqual(this.creditCardAmount, sendSaleTransToRichPOSRequest.creditCardAmount) && Intrinsics.areEqual(this.cardNumber, sendSaleTransToRichPOSRequest.cardNumber);
        }
        return false;
    }

    @Nullable
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final String getCashAmount() {
        return this.cashAmount;
    }

    @Nullable
    public final String getCreditCardAmount() {
        return this.creditCardAmount;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSku() {
        return this.sku;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashAmount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locationCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sku;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userLan;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.creditCardAmount;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardNumber;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.cashAmount;
        String str3 = this.locationCode;
        String str4 = this.sku;
        String str5 = this.paymentType;
        String str6 = this.userLan;
        String str7 = this.creditCardAmount;
        String str8 = this.cardNumber;
        return "SendSaleTransToRichPOSRequest(simCardNumber=" + str + ", cashAmount=" + str2 + ", locationCode=" + str3 + ", sku=" + str4 + ", paymentType=" + str5 + ", userLan=" + str6 + ", creditCardAmount=" + str7 + ", cardNumber=" + str8 + ")";
    }

    public SendSaleTransToRichPOSRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.simCardNumber = str;
        this.cashAmount = str2;
        this.locationCode = str3;
        this.sku = str4;
        this.paymentType = str5;
        this.userLan = str6;
        this.creditCardAmount = str7;
        this.cardNumber = str8;
    }

    public /* synthetic */ SendSaleTransToRichPOSRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}