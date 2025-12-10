package co.omise.android.models;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, m29142d2 = {"Lco/omise/android/models/TokenizationParam;", "", FirebaseAnalytics.Param.METHOD, "", "data", "billingName", "billingCity", "billingCountry", "billingPostalCode", "billingState", "billingStreet1", "billingStreet2", "billingPhoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillingCity", "()Ljava/lang/String;", "getBillingCountry", "getBillingName", "getBillingPhoneNumber", "getBillingPostalCode", "getBillingState", "getBillingStreet1", "getBillingStreet2", "getData", "getMethod", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class TokenizationParam {
    @JsonProperty("billing_city")
    @Nullable
    private final String billingCity;
    @JsonProperty("billing_country")
    @Nullable
    private final String billingCountry;
    @JsonProperty("billing_name")
    @Nullable
    private final String billingName;
    @JsonProperty("billing_phone_number")
    @Nullable
    private final String billingPhoneNumber;
    @JsonProperty("billing_postal_code")
    @Nullable
    private final String billingPostalCode;
    @JsonProperty("billing_state")
    @Nullable
    private final String billingState;
    @JsonProperty("billing_street1")
    @Nullable
    private final String billingStreet1;
    @JsonProperty("billing_street2")
    @Nullable
    private final String billingStreet2;
    @JsonProperty
    @NotNull
    private final String data;
    @JsonProperty
    @NotNull
    private final String method;

    public TokenizationParam(@NotNull String method, @NotNull String data, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(data, "data");
        this.method = method;
        this.data = data;
        this.billingName = str;
        this.billingCity = str2;
        this.billingCountry = str3;
        this.billingPostalCode = str4;
        this.billingState = str5;
        this.billingStreet1 = str6;
        this.billingStreet2 = str7;
        this.billingPhoneNumber = str8;
    }

    @NotNull
    public final String component1() {
        return this.method;
    }

    @Nullable
    public final String component10() {
        return this.billingPhoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.data;
    }

    @Nullable
    public final String component3() {
        return this.billingName;
    }

    @Nullable
    public final String component4() {
        return this.billingCity;
    }

    @Nullable
    public final String component5() {
        return this.billingCountry;
    }

    @Nullable
    public final String component6() {
        return this.billingPostalCode;
    }

    @Nullable
    public final String component7() {
        return this.billingState;
    }

    @Nullable
    public final String component8() {
        return this.billingStreet1;
    }

    @Nullable
    public final String component9() {
        return this.billingStreet2;
    }

    @NotNull
    public final TokenizationParam copy(@NotNull String method, @NotNull String data, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(data, "data");
        return new TokenizationParam(method, data, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenizationParam) {
            TokenizationParam tokenizationParam = (TokenizationParam) obj;
            return Intrinsics.areEqual(this.method, tokenizationParam.method) && Intrinsics.areEqual(this.data, tokenizationParam.data) && Intrinsics.areEqual(this.billingName, tokenizationParam.billingName) && Intrinsics.areEqual(this.billingCity, tokenizationParam.billingCity) && Intrinsics.areEqual(this.billingCountry, tokenizationParam.billingCountry) && Intrinsics.areEqual(this.billingPostalCode, tokenizationParam.billingPostalCode) && Intrinsics.areEqual(this.billingState, tokenizationParam.billingState) && Intrinsics.areEqual(this.billingStreet1, tokenizationParam.billingStreet1) && Intrinsics.areEqual(this.billingStreet2, tokenizationParam.billingStreet2) && Intrinsics.areEqual(this.billingPhoneNumber, tokenizationParam.billingPhoneNumber);
        }
        return false;
    }

    @Nullable
    public final String getBillingCity() {
        return this.billingCity;
    }

    @Nullable
    public final String getBillingCountry() {
        return this.billingCountry;
    }

    @Nullable
    public final String getBillingName() {
        return this.billingName;
    }

    @Nullable
    public final String getBillingPhoneNumber() {
        return this.billingPhoneNumber;
    }

    @Nullable
    public final String getBillingPostalCode() {
        return this.billingPostalCode;
    }

    @Nullable
    public final String getBillingState() {
        return this.billingState;
    }

    @Nullable
    public final String getBillingStreet1() {
        return this.billingStreet1;
    }

    @Nullable
    public final String getBillingStreet2() {
        return this.billingStreet2;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        int hashCode = ((this.method.hashCode() * 31) + this.data.hashCode()) * 31;
        String str = this.billingName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingCity;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingCountry;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingPostalCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingState;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billingStreet1;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billingStreet2;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billingPhoneNumber;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TokenizationParam(method=" + this.method + ", data=" + this.data + ", billingName=" + this.billingName + ", billingCity=" + this.billingCity + ", billingCountry=" + this.billingCountry + ", billingPostalCode=" + this.billingPostalCode + ", billingState=" + this.billingState + ", billingStreet1=" + this.billingStreet1 + ", billingStreet2=" + this.billingStreet2 + ", billingPhoneNumber=" + this.billingPhoneNumber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ TokenizationParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}