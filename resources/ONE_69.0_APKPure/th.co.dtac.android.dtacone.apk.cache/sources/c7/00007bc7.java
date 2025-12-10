package co.omise.android.models;

import androidx.autofill.HintConstants;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00061"}, m29142d2 = {"Lco/omise/android/models/CardParam;", "", "name", "", "number", "expirationMonth", "", "expirationYear", "securityCode", "city", RemoteConfigConstants.ResponseFieldKey.STATE, HintConstants.AUTOFILL_HINT_POSTAL_CODE, "country", "street1", "street2", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getExpirationMonth", "()I", "getExpirationYear", "getName", "getNumber", "getPhoneNumber", "getPostalCode", "getSecurityCode", "getState", "getStreet1", "getStreet2", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class CardParam {
    @JsonProperty
    @Nullable
    private final String city;
    @JsonProperty
    @Nullable
    private final String country;
    @JsonProperty("expiration_month")
    private final int expirationMonth;
    @JsonProperty("expiration_year")
    private final int expirationYear;
    @JsonProperty
    @NotNull
    private final String name;
    @JsonProperty
    @NotNull
    private final String number;
    @JsonProperty("phone_number")
    @Nullable
    private final String phoneNumber;
    @JsonProperty("postal_code")
    @Nullable
    private final String postalCode;
    @JsonProperty("security_code")
    @NotNull
    private final String securityCode;
    @JsonProperty
    @Nullable
    private final String state;
    @JsonProperty
    @Nullable
    private final String street1;
    @JsonProperty
    @Nullable
    private final String street2;

    public CardParam(@NotNull String name, @NotNull String number, int i, int i2, @NotNull String securityCode, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        this.name = name;
        this.number = number;
        this.expirationMonth = i;
        this.expirationYear = i2;
        this.securityCode = securityCode;
        this.city = str;
        this.state = str2;
        this.postalCode = str3;
        this.country = str4;
        this.street1 = str5;
        this.street2 = str6;
        this.phoneNumber = str7;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component10() {
        return this.street1;
    }

    @Nullable
    public final String component11() {
        return this.street2;
    }

    @Nullable
    public final String component12() {
        return this.phoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.number;
    }

    public final int component3() {
        return this.expirationMonth;
    }

    public final int component4() {
        return this.expirationYear;
    }

    @NotNull
    public final String component5() {
        return this.securityCode;
    }

    @Nullable
    public final String component6() {
        return this.city;
    }

    @Nullable
    public final String component7() {
        return this.state;
    }

    @Nullable
    public final String component8() {
        return this.postalCode;
    }

    @Nullable
    public final String component9() {
        return this.country;
    }

    @NotNull
    public final CardParam copy(@NotNull String name, @NotNull String number, int i, int i2, @NotNull String securityCode, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        return new CardParam(name, number, i, i2, securityCode, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardParam) {
            CardParam cardParam = (CardParam) obj;
            return Intrinsics.areEqual(this.name, cardParam.name) && Intrinsics.areEqual(this.number, cardParam.number) && this.expirationMonth == cardParam.expirationMonth && this.expirationYear == cardParam.expirationYear && Intrinsics.areEqual(this.securityCode, cardParam.securityCode) && Intrinsics.areEqual(this.city, cardParam.city) && Intrinsics.areEqual(this.state, cardParam.state) && Intrinsics.areEqual(this.postalCode, cardParam.postalCode) && Intrinsics.areEqual(this.country, cardParam.country) && Intrinsics.areEqual(this.street1, cardParam.street1) && Intrinsics.areEqual(this.street2, cardParam.street2) && Intrinsics.areEqual(this.phoneNumber, cardParam.phoneNumber);
        }
        return false;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final int getExpirationMonth() {
        return this.expirationMonth;
    }

    public final int getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getSecurityCode() {
        return this.securityCode;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getStreet1() {
        return this.street1;
    }

    @Nullable
    public final String getStreet2() {
        return this.street2;
    }

    public int hashCode() {
        int hashCode = ((((((((this.name.hashCode() * 31) + this.number.hashCode()) * 31) + this.expirationMonth) * 31) + this.expirationYear) * 31) + this.securityCode.hashCode()) * 31;
        String str = this.city;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.street1;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street2;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneNumber;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardParam(name=" + this.name + ", number=" + this.number + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", securityCode=" + this.securityCode + ", city=" + this.city + ", state=" + this.state + ", postalCode=" + this.postalCode + ", country=" + this.country + ", street1=" + this.street1 + ", street2=" + this.street2 + ", phoneNumber=" + this.phoneNumber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ CardParam(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & 1024) != 0 ? null : str9, (i3 & 2048) != 0 ? null : str10);
    }
}