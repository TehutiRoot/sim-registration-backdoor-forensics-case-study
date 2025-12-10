package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/LegalAddress;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "provinceCode", "provinceName", "district", "subDistrict", "houseNo", "moo", "postCode", "postCodeSeqn", "road", "soi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getDistrict", "setDistrict", "getHouseNo", "setHouseNo", "getMoo", "setMoo", "getPostCode", "setPostCode", "getPostCodeSeqn", "setPostCodeSeqn", "getProvinceCode", "setProvinceCode", "getProvinceName", "setProvinceName", "getRoad", "setRoad", "getSoi", "setSoi", "getSubDistrict", "setSubDistrict", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.LegalAddress */
/* loaded from: classes8.dex */
public final class LegalAddress {
    public static final int $stable = 8;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    @NotNull
    private String countryCode;
    @SerializedName("district")
    @NotNull
    private String district;
    @SerializedName("houseNo")
    @NotNull
    private String houseNo;
    @SerializedName("moo")
    @NotNull
    private String moo;
    @SerializedName("postCode")
    @NotNull
    private String postCode;
    @SerializedName("postCodeSeqn")
    @NotNull
    private String postCodeSeqn;
    @SerializedName("provinceCode")
    @NotNull
    private String provinceCode;
    @SerializedName("provinceName")
    @NotNull
    private String provinceName;
    @SerializedName("road")
    @NotNull
    private String road;
    @SerializedName("soi")
    @NotNull
    private String soi;
    @SerializedName("subDistrict")
    @NotNull
    private String subDistrict;

    public LegalAddress(@NotNull String countryCode, @NotNull String provinceCode, @NotNull String provinceName, @NotNull String district, @NotNull String subDistrict, @NotNull String houseNo, @NotNull String moo, @NotNull String postCode, @NotNull String postCodeSeqn, @NotNull String road, @NotNull String soi) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(moo, "moo");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        Intrinsics.checkNotNullParameter(postCodeSeqn, "postCodeSeqn");
        Intrinsics.checkNotNullParameter(road, "road");
        Intrinsics.checkNotNullParameter(soi, "soi");
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
        this.district = district;
        this.subDistrict = subDistrict;
        this.houseNo = houseNo;
        this.moo = moo;
        this.postCode = postCode;
        this.postCodeSeqn = postCodeSeqn;
        this.road = road;
        this.soi = soi;
    }

    @NotNull
    public final String component1() {
        return this.countryCode;
    }

    @NotNull
    public final String component10() {
        return this.road;
    }

    @NotNull
    public final String component11() {
        return this.soi;
    }

    @NotNull
    public final String component2() {
        return this.provinceCode;
    }

    @NotNull
    public final String component3() {
        return this.provinceName;
    }

    @NotNull
    public final String component4() {
        return this.district;
    }

    @NotNull
    public final String component5() {
        return this.subDistrict;
    }

    @NotNull
    public final String component6() {
        return this.houseNo;
    }

    @NotNull
    public final String component7() {
        return this.moo;
    }

    @NotNull
    public final String component8() {
        return this.postCode;
    }

    @NotNull
    public final String component9() {
        return this.postCodeSeqn;
    }

    @NotNull
    public final LegalAddress copy(@NotNull String countryCode, @NotNull String provinceCode, @NotNull String provinceName, @NotNull String district, @NotNull String subDistrict, @NotNull String houseNo, @NotNull String moo, @NotNull String postCode, @NotNull String postCodeSeqn, @NotNull String road, @NotNull String soi) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceCode, "provinceCode");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(moo, "moo");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        Intrinsics.checkNotNullParameter(postCodeSeqn, "postCodeSeqn");
        Intrinsics.checkNotNullParameter(road, "road");
        Intrinsics.checkNotNullParameter(soi, "soi");
        return new LegalAddress(countryCode, provinceCode, provinceName, district, subDistrict, houseNo, moo, postCode, postCodeSeqn, road, soi);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegalAddress) {
            LegalAddress legalAddress = (LegalAddress) obj;
            return Intrinsics.areEqual(this.countryCode, legalAddress.countryCode) && Intrinsics.areEqual(this.provinceCode, legalAddress.provinceCode) && Intrinsics.areEqual(this.provinceName, legalAddress.provinceName) && Intrinsics.areEqual(this.district, legalAddress.district) && Intrinsics.areEqual(this.subDistrict, legalAddress.subDistrict) && Intrinsics.areEqual(this.houseNo, legalAddress.houseNo) && Intrinsics.areEqual(this.moo, legalAddress.moo) && Intrinsics.areEqual(this.postCode, legalAddress.postCode) && Intrinsics.areEqual(this.postCodeSeqn, legalAddress.postCodeSeqn) && Intrinsics.areEqual(this.road, legalAddress.road) && Intrinsics.areEqual(this.soi, legalAddress.soi);
        }
        return false;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    public final String getHouseNo() {
        return this.houseNo;
    }

    @NotNull
    public final String getMoo() {
        return this.moo;
    }

    @NotNull
    public final String getPostCode() {
        return this.postCode;
    }

    @NotNull
    public final String getPostCodeSeqn() {
        return this.postCodeSeqn;
    }

    @NotNull
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    @NotNull
    public final String getProvinceName() {
        return this.provinceName;
    }

    @NotNull
    public final String getRoad() {
        return this.road;
    }

    @NotNull
    public final String getSoi() {
        return this.soi;
    }

    @NotNull
    public final String getSubDistrict() {
        return this.subDistrict;
    }

    public int hashCode() {
        return (((((((((((((((((((this.countryCode.hashCode() * 31) + this.provinceCode.hashCode()) * 31) + this.provinceName.hashCode()) * 31) + this.district.hashCode()) * 31) + this.subDistrict.hashCode()) * 31) + this.houseNo.hashCode()) * 31) + this.moo.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.postCodeSeqn.hashCode()) * 31) + this.road.hashCode()) * 31) + this.soi.hashCode();
    }

    public final void setCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.district = str;
    }

    public final void setHouseNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.houseNo = str;
    }

    public final void setMoo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moo = str;
    }

    public final void setPostCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postCode = str;
    }

    public final void setPostCodeSeqn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postCodeSeqn = str;
    }

    public final void setProvinceCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.provinceCode = str;
    }

    public final void setProvinceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.provinceName = str;
    }

    public final void setRoad(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.road = str;
    }

    public final void setSoi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.soi = str;
    }

    public final void setSubDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subDistrict = str;
    }

    @NotNull
    public String toString() {
        String str = this.countryCode;
        String str2 = this.provinceCode;
        String str3 = this.provinceName;
        String str4 = this.district;
        String str5 = this.subDistrict;
        String str6 = this.houseNo;
        String str7 = this.moo;
        String str8 = this.postCode;
        String str9 = this.postCodeSeqn;
        String str10 = this.road;
        String str11 = this.soi;
        return "LegalAddress(countryCode=" + str + ", provinceCode=" + str2 + ", provinceName=" + str3 + ", district=" + str4 + ", subDistrict=" + str5 + ", houseNo=" + str6 + ", moo=" + str7 + ", postCode=" + str8 + ", postCodeSeqn=" + str9 + ", road=" + str10 + ", soi=" + str11 + ")";
    }
}