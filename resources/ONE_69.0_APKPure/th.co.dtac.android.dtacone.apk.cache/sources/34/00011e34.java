package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;", "", "address1", "", "address2", "amphur", "country", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "lastChangeDatetime", "postcode", "postcodeSequence", "province", "provinceCode", "validProvinceCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "getAddress2", "setAddress2", "getAmphur", "setAmphur", "getCountry", "getCountryCode", "getLastChangeDatetime", "getPostcode", "setPostcode", "getPostcodeSequence", "getProvince", "setProvince", "getProvinceCode", "getValidProvinceCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.LegalAddress */
/* loaded from: classes8.dex */
public final class LegalAddress {
    public static final int $stable = 8;
    @SerializedName("address1")
    @NotNull
    private String address1;
    @SerializedName("address2")
    @NotNull
    private String address2;
    @SerializedName("amphur")
    @NotNull
    private String amphur;
    @SerializedName("country")
    @NotNull
    private final String country;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    @NotNull
    private final String countryCode;
    @SerializedName("lastChangeDatetime")
    @NotNull
    private final String lastChangeDatetime;
    @SerializedName("postcode")
    @NotNull
    private String postcode;
    @SerializedName("postcodeSequence")
    @NotNull
    private final String postcodeSequence;
    @SerializedName("province")
    @NotNull
    private String province;
    @SerializedName("provinceCode")
    @NotNull
    private final String provinceCode;
    @SerializedName("validProvinceCode")
    @NotNull
    private final String validProvinceCode;

    public LegalAddress(@NotNull String address1, @NotNull String address2, @NotNull String amphur, @NotNull String country, @NotNull String countryCode, @NotNull String lastChangeDatetime, @NotNull String postcode, @NotNull String postcodeSequence, @NotNull String province, @NotNull String provinceCode, @NotNull String validProvinceCode) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(amphur, "amphur");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(lastChangeDatetime, "lastChangeDatetime");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(postcodeSequence, "postcodeSequence");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(validProvinceCode, "validProvinceCode");
        this.address1 = address1;
        this.address2 = address2;
        this.amphur = amphur;
        this.country = country;
        this.countryCode = countryCode;
        this.lastChangeDatetime = lastChangeDatetime;
        this.postcode = postcode;
        this.postcodeSequence = postcodeSequence;
        this.province = province;
        this.provinceCode = provinceCode;
        this.validProvinceCode = validProvinceCode;
    }

    @NotNull
    public final String component1() {
        return this.address1;
    }

    @NotNull
    public final String component10() {
        return this.provinceCode;
    }

    @NotNull
    public final String component11() {
        return this.validProvinceCode;
    }

    @NotNull
    public final String component2() {
        return this.address2;
    }

    @NotNull
    public final String component3() {
        return this.amphur;
    }

    @NotNull
    public final String component4() {
        return this.country;
    }

    @NotNull
    public final String component5() {
        return this.countryCode;
    }

    @NotNull
    public final String component6() {
        return this.lastChangeDatetime;
    }

    @NotNull
    public final String component7() {
        return this.postcode;
    }

    @NotNull
    public final String component8() {
        return this.postcodeSequence;
    }

    @NotNull
    public final String component9() {
        return this.province;
    }

    @NotNull
    public final LegalAddress copy(@NotNull String address1, @NotNull String address2, @NotNull String amphur, @NotNull String country, @NotNull String countryCode, @NotNull String lastChangeDatetime, @NotNull String postcode, @NotNull String postcodeSequence, @NotNull String province, @NotNull String provinceCode, @NotNull String validProvinceCode) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(amphur, "amphur");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(lastChangeDatetime, "lastChangeDatetime");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(postcodeSequence, "postcodeSequence");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(validProvinceCode, "validProvinceCode");
        return new LegalAddress(address1, address2, amphur, country, countryCode, lastChangeDatetime, postcode, postcodeSequence, province, provinceCode, validProvinceCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegalAddress) {
            LegalAddress legalAddress = (LegalAddress) obj;
            return Intrinsics.areEqual(this.address1, legalAddress.address1) && Intrinsics.areEqual(this.address2, legalAddress.address2) && Intrinsics.areEqual(this.amphur, legalAddress.amphur) && Intrinsics.areEqual(this.country, legalAddress.country) && Intrinsics.areEqual(this.countryCode, legalAddress.countryCode) && Intrinsics.areEqual(this.lastChangeDatetime, legalAddress.lastChangeDatetime) && Intrinsics.areEqual(this.postcode, legalAddress.postcode) && Intrinsics.areEqual(this.postcodeSequence, legalAddress.postcodeSequence) && Intrinsics.areEqual(this.province, legalAddress.province) && Intrinsics.areEqual(this.provinceCode, legalAddress.provinceCode) && Intrinsics.areEqual(this.validProvinceCode, legalAddress.validProvinceCode);
        }
        return false;
    }

    @NotNull
    public final String getAddress1() {
        return this.address1;
    }

    @NotNull
    public final String getAddress2() {
        return this.address2;
    }

    @NotNull
    public final String getAmphur() {
        return this.amphur;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getLastChangeDatetime() {
        return this.lastChangeDatetime;
    }

    @NotNull
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    public final String getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    @NotNull
    public final String getValidProvinceCode() {
        return this.validProvinceCode;
    }

    public int hashCode() {
        return (((((((((((((((((((this.address1.hashCode() * 31) + this.address2.hashCode()) * 31) + this.amphur.hashCode()) * 31) + this.country.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.lastChangeDatetime.hashCode()) * 31) + this.postcode.hashCode()) * 31) + this.postcodeSequence.hashCode()) * 31) + this.province.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + this.validProvinceCode.hashCode();
    }

    public final void setAddress1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address1 = str;
    }

    public final void setAddress2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address2 = str;
    }

    public final void setAmphur(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amphur = str;
    }

    public final void setPostcode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postcode = str;
    }

    public final void setProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.province = str;
    }

    @NotNull
    public String toString() {
        String str = this.address1;
        String str2 = this.address2;
        String str3 = this.amphur;
        String str4 = this.country;
        String str5 = this.countryCode;
        String str6 = this.lastChangeDatetime;
        String str7 = this.postcode;
        String str8 = this.postcodeSequence;
        String str9 = this.province;
        String str10 = this.provinceCode;
        String str11 = this.validProvinceCode;
        return "LegalAddress(address1=" + str + ", address2=" + str2 + ", amphur=" + str3 + ", country=" + str4 + ", countryCode=" + str5 + ", lastChangeDatetime=" + str6 + ", postcode=" + str7 + ", postcodeSequence=" + str8 + ", province=" + str9 + ", provinceCode=" + str10 + ", validProvinceCode=" + str11 + ")";
    }
}