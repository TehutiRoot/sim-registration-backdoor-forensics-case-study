package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/LegalAddress;", "", "province", "", "postcodeSequence", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "address1", "postcode", "amphur", "tumbon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAmphur", "getCountryCode", "getPostcode", "getPostcodeSequence", "getProvince", "getTumbon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register.LegalAddress */
/* loaded from: classes8.dex */
public final class LegalAddress {
    public static final int $stable = 0;
    @SerializedName("address1")
    @Nullable
    private final String address1;
    @SerializedName("amphur")
    @Nullable
    private final String amphur;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    @Nullable
    private final String countryCode;
    @SerializedName("postcode")
    @Nullable
    private final String postcode;
    @SerializedName("postcodeSequence")
    @Nullable
    private final String postcodeSequence;
    @SerializedName("province")
    @Nullable
    private final String province;
    @SerializedName("tumbon")
    @Nullable
    private final String tumbon;

    public LegalAddress() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LegalAddress copy$default(LegalAddress legalAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalAddress.province;
        }
        if ((i & 2) != 0) {
            str2 = legalAddress.postcodeSequence;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = legalAddress.countryCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = legalAddress.address1;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = legalAddress.postcode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = legalAddress.amphur;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = legalAddress.tumbon;
        }
        return legalAddress.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.province;
    }

    @Nullable
    public final String component2() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String component3() {
        return this.countryCode;
    }

    @Nullable
    public final String component4() {
        return this.address1;
    }

    @Nullable
    public final String component5() {
        return this.postcode;
    }

    @Nullable
    public final String component6() {
        return this.amphur;
    }

    @Nullable
    public final String component7() {
        return this.tumbon;
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
            return Intrinsics.areEqual(this.province, legalAddress.province) && Intrinsics.areEqual(this.postcodeSequence, legalAddress.postcodeSequence) && Intrinsics.areEqual(this.countryCode, legalAddress.countryCode) && Intrinsics.areEqual(this.address1, legalAddress.address1) && Intrinsics.areEqual(this.postcode, legalAddress.postcode) && Intrinsics.areEqual(this.amphur, legalAddress.amphur) && Intrinsics.areEqual(this.tumbon, legalAddress.tumbon);
        }
        return false;
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    public final String getAmphur() {
        return this.amphur;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
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
    public final String getTumbon() {
        return this.tumbon;
    }

    public int hashCode() {
        String str = this.province;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postcodeSequence;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address1;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.amphur;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tumbon;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.province;
        String str2 = this.postcodeSequence;
        String str3 = this.countryCode;
        String str4 = this.address1;
        String str5 = this.postcode;
        String str6 = this.amphur;
        String str7 = this.tumbon;
        return "LegalAddress(province=" + str + ", postcodeSequence=" + str2 + ", countryCode=" + str3 + ", address1=" + str4 + ", postcode=" + str5 + ", amphur=" + str6 + ", tumbon=" + str7 + ")";
    }

    public LegalAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.province = str;
        this.postcodeSequence = str2;
        this.countryCode = str3;
        this.address1 = str4;
        this.postcode = str5;
        this.amphur = str6;
        this.tumbon = str7;
    }

    public /* synthetic */ LegalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}