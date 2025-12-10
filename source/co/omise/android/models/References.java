package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006:"}, m28850d2 = {"Lco/omise/android/models/References;", "Landroid/os/Parcelable;", "vaCode", "", "omiseTaxId", "referenceNumber1", "referenceNumber2", OptionalModuleUtils.BARCODE, "expiresAt", "Lorg/joda/time/DateTime;", "deviceId", "customerAmount", "", "customerCurrency", "customerExchangeRate", "", "paymentCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;DLjava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getCustomerAmount", "()J", "getCustomerCurrency", "getCustomerExchangeRate", "()D", "getDeviceId", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getOmiseTaxId", "getPaymentCode", "getReferenceNumber1", "getReferenceNumber2", "getVaCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class References implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<References> CREATOR = new Creator();
    @Nullable
    private final String barcode;
    @JsonProperty("customer_amount")
    private final long customerAmount;
    @JsonProperty("customer_currency")
    @Nullable
    private final String customerCurrency;
    @JsonProperty("customer_exchange_rate")
    private final double customerExchangeRate;
    @JsonProperty("device_id")
    @Nullable
    private final String deviceId;
    @JsonProperty("expires_at")
    @Nullable
    private final DateTime expiresAt;
    @JsonProperty("omise_tax_id")
    @Nullable
    private final String omiseTaxId;
    @JsonProperty("payment_code")
    @Nullable
    private final String paymentCode;
    @JsonProperty("reference_number_1")
    @Nullable
    private final String referenceNumber1;
    @JsonProperty("reference_number_2")
    @Nullable
    private final String referenceNumber2;
    @JsonProperty("va_code")
    @Nullable
    private final String vaCode;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<References> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final References createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new References(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final References[] newArray(int i) {
            return new References[i];
        }
    }

    public References() {
        this(null, null, null, null, null, null, null, 0L, null, 0.0d, null, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.vaCode;
    }

    public final double component10() {
        return this.customerExchangeRate;
    }

    @Nullable
    public final String component11() {
        return this.paymentCode;
    }

    @Nullable
    public final String component2() {
        return this.omiseTaxId;
    }

    @Nullable
    public final String component3() {
        return this.referenceNumber1;
    }

    @Nullable
    public final String component4() {
        return this.referenceNumber2;
    }

    @Nullable
    public final String component5() {
        return this.barcode;
    }

    @Nullable
    public final DateTime component6() {
        return this.expiresAt;
    }

    @Nullable
    public final String component7() {
        return this.deviceId;
    }

    public final long component8() {
        return this.customerAmount;
    }

    @Nullable
    public final String component9() {
        return this.customerCurrency;
    }

    @NotNull
    public final References copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable DateTime dateTime, @Nullable String str6, long j, @Nullable String str7, double d, @Nullable String str8) {
        return new References(str, str2, str3, str4, str5, dateTime, str6, j, str7, d, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof References) {
            References references = (References) obj;
            return Intrinsics.areEqual(this.vaCode, references.vaCode) && Intrinsics.areEqual(this.omiseTaxId, references.omiseTaxId) && Intrinsics.areEqual(this.referenceNumber1, references.referenceNumber1) && Intrinsics.areEqual(this.referenceNumber2, references.referenceNumber2) && Intrinsics.areEqual(this.barcode, references.barcode) && Intrinsics.areEqual(this.expiresAt, references.expiresAt) && Intrinsics.areEqual(this.deviceId, references.deviceId) && this.customerAmount == references.customerAmount && Intrinsics.areEqual(this.customerCurrency, references.customerCurrency) && Intrinsics.areEqual((Object) Double.valueOf(this.customerExchangeRate), (Object) Double.valueOf(references.customerExchangeRate)) && Intrinsics.areEqual(this.paymentCode, references.paymentCode);
        }
        return false;
    }

    @Nullable
    public final String getBarcode() {
        return this.barcode;
    }

    public final long getCustomerAmount() {
        return this.customerAmount;
    }

    @Nullable
    public final String getCustomerCurrency() {
        return this.customerCurrency;
    }

    public final double getCustomerExchangeRate() {
        return this.customerExchangeRate;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final String getOmiseTaxId() {
        return this.omiseTaxId;
    }

    @Nullable
    public final String getPaymentCode() {
        return this.paymentCode;
    }

    @Nullable
    public final String getReferenceNumber1() {
        return this.referenceNumber1;
    }

    @Nullable
    public final String getReferenceNumber2() {
        return this.referenceNumber2;
    }

    @Nullable
    public final String getVaCode() {
        return this.vaCode;
    }

    public int hashCode() {
        String str = this.vaCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.omiseTaxId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referenceNumber1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referenceNumber2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.barcode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DateTime dateTime = this.expiresAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str6 = this.deviceId;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + AbstractC17792Ig1.m67882a(this.customerAmount)) * 31;
        String str7 = this.customerCurrency;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Double.doubleToLongBits(this.customerExchangeRate)) * 31;
        String str8 = this.paymentCode;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "References(vaCode=" + this.vaCode + ", omiseTaxId=" + this.omiseTaxId + ", referenceNumber1=" + this.referenceNumber1 + ", referenceNumber2=" + this.referenceNumber2 + ", barcode=" + this.barcode + ", expiresAt=" + this.expiresAt + ", deviceId=" + this.deviceId + ", customerAmount=" + this.customerAmount + ", customerCurrency=" + this.customerCurrency + ", customerExchangeRate=" + this.customerExchangeRate + ", paymentCode=" + this.paymentCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.vaCode);
        out.writeString(this.omiseTaxId);
        out.writeString(this.referenceNumber1);
        out.writeString(this.referenceNumber2);
        out.writeString(this.barcode);
        out.writeSerializable(this.expiresAt);
        out.writeString(this.deviceId);
        out.writeLong(this.customerAmount);
        out.writeString(this.customerCurrency);
        out.writeDouble(this.customerExchangeRate);
        out.writeString(this.paymentCode);
    }

    public References(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable DateTime dateTime, @Nullable String str6, long j, @Nullable String str7, double d, @Nullable String str8) {
        this.vaCode = str;
        this.omiseTaxId = str2;
        this.referenceNumber1 = str3;
        this.referenceNumber2 = str4;
        this.barcode = str5;
        this.expiresAt = dateTime;
        this.deviceId = str6;
        this.customerAmount = j;
        this.customerCurrency = str7;
        this.customerExchangeRate = d;
        this.paymentCode = str8;
    }

    public /* synthetic */ References(String str, String str2, String str3, String str4, String str5, DateTime dateTime, String str6, long j, String str7, double d, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : dateTime, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? 0.0d : d, (i & 1024) == 0 ? str8 : null);
    }
}
