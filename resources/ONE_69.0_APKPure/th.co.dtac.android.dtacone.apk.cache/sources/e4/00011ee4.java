package th.p047co.dtac.android.dtacone.model.mrtr_mnp.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/request/LegalAddress;", "", "province", "", "address2", "postcodeSequence", "address1", "provinceCode", "district", "postcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "getAddress2", "setAddress2", "getDistrict", "setDistrict", "getPostcode", "setPostcode", "getPostcodeSequence", "setPostcodeSequence", "getProvince", "setProvince", "getProvinceCode", "setProvinceCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.submit.request.LegalAddress */
/* loaded from: classes8.dex */
public final class LegalAddress {
    public static final int $stable = 8;
    @SerializedName("address1")
    @Nullable
    private String address1;
    @SerializedName("address2")
    @Nullable
    private String address2;
    @SerializedName("district")
    @Nullable
    private String district;
    @SerializedName("postcode")
    @Nullable
    private String postcode;
    @SerializedName("postcodeSequence")
    @Nullable
    private String postcodeSequence;
    @SerializedName("province")
    @Nullable
    private String province;
    @SerializedName("provinceCode")
    @Nullable
    private String provinceCode;

    public LegalAddress() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LegalAddress copy$default(LegalAddress legalAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalAddress.province;
        }
        if ((i & 2) != 0) {
            str2 = legalAddress.address2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = legalAddress.postcodeSequence;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = legalAddress.address1;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = legalAddress.provinceCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = legalAddress.district;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = legalAddress.postcode;
        }
        return legalAddress.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.province;
    }

    @Nullable
    public final String component2() {
        return this.address2;
    }

    @Nullable
    public final String component3() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String component4() {
        return this.address1;
    }

    @Nullable
    public final String component5() {
        return this.provinceCode;
    }

    @Nullable
    public final String component6() {
        return this.district;
    }

    @Nullable
    public final String component7() {
        return this.postcode;
    }

    @NotNull
    public final LegalAddress copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new LegalAddress(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegalAddress) {
            LegalAddress legalAddress = (LegalAddress) obj;
            return Intrinsics.areEqual(this.province, legalAddress.province) && Intrinsics.areEqual(this.address2, legalAddress.address2) && Intrinsics.areEqual(this.postcodeSequence, legalAddress.postcodeSequence) && Intrinsics.areEqual(this.address1, legalAddress.address1) && Intrinsics.areEqual(this.provinceCode, legalAddress.provinceCode) && Intrinsics.areEqual(this.district, legalAddress.district) && Intrinsics.areEqual(this.postcode, legalAddress.postcode);
        }
        return false;
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final String getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    public int hashCode() {
        String str = this.province;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postcodeSequence;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address1;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.provinceCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.district;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postcode;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAddress1(@Nullable String str) {
        this.address1 = str;
    }

    public final void setAddress2(@Nullable String str) {
        this.address2 = str;
    }

    public final void setDistrict(@Nullable String str) {
        this.district = str;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequence(@Nullable String str) {
        this.postcodeSequence = str;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final void setProvinceCode(@Nullable String str) {
        this.provinceCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.province;
        String str2 = this.address2;
        String str3 = this.postcodeSequence;
        String str4 = this.address1;
        String str5 = this.provinceCode;
        String str6 = this.district;
        String str7 = this.postcode;
        return "LegalAddress(province=" + str + ", address2=" + str2 + ", postcodeSequence=" + str3 + ", address1=" + str4 + ", provinceCode=" + str5 + ", district=" + str6 + ", postcode=" + str7 + ")";
    }

    public LegalAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.province = str;
        this.address2 = str2;
        this.postcodeSequence = str3;
        this.address1 = str4;
        this.provinceCode = str5;
        this.district = str6;
        this.postcode = str7;
    }

    public /* synthetic */ LegalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}