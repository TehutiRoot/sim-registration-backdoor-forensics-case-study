package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;", "", "address1", "", "address2", "district", "province", "postcode", "postcodeSequence", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getDistrict", "getPostcode", "getPostcodeSequence", "getProvince", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.Address */
/* loaded from: classes8.dex */
public final class Address {
    public static final int $stable = 0;
    @SerializedName("address1")
    @NotNull
    private final String address1;
    @SerializedName("address2")
    @NotNull
    private final String address2;
    @SerializedName("district")
    @NotNull
    private final String district;
    @SerializedName("postcode")
    @NotNull
    private final String postcode;
    @SerializedName("postcodeSequence")
    @NotNull
    private final String postcodeSequence;
    @SerializedName("province")
    @NotNull
    private final String province;

    public Address() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.address1;
        }
        if ((i & 2) != 0) {
            str2 = address.address2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = address.district;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = address.province;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = address.postcode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = address.postcodeSequence;
        }
        return address.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.address1;
    }

    @NotNull
    public final String component2() {
        return this.address2;
    }

    @NotNull
    public final String component3() {
        return this.district;
    }

    @NotNull
    public final String component4() {
        return this.province;
    }

    @NotNull
    public final String component5() {
        return this.postcode;
    }

    @NotNull
    public final String component6() {
        return this.postcodeSequence;
    }

    @NotNull
    public final Address copy(@NotNull String address1, @NotNull String address2, @NotNull String district, @NotNull String province, @NotNull String postcode, @NotNull String postcodeSequence) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(postcodeSequence, "postcodeSequence");
        return new Address(address1, address2, district, province, postcode, postcodeSequence);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return Intrinsics.areEqual(this.address1, address.address1) && Intrinsics.areEqual(this.address2, address.address2) && Intrinsics.areEqual(this.district, address.district) && Intrinsics.areEqual(this.province, address.province) && Intrinsics.areEqual(this.postcode, address.postcode) && Intrinsics.areEqual(this.postcodeSequence, address.postcodeSequence);
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
    public final String getDistrict() {
        return this.district;
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

    public int hashCode() {
        return (((((((((this.address1.hashCode() * 31) + this.address2.hashCode()) * 31) + this.district.hashCode()) * 31) + this.province.hashCode()) * 31) + this.postcode.hashCode()) * 31) + this.postcodeSequence.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.address1;
        String str2 = this.address2;
        String str3 = this.district;
        String str4 = this.province;
        String str5 = this.postcode;
        String str6 = this.postcodeSequence;
        return "Address(address1=" + str + ", address2=" + str2 + ", district=" + str3 + ", province=" + str4 + ", postcode=" + str5 + ", postcodeSequence=" + str6 + ")";
    }

    public Address(@NotNull String address1, @NotNull String address2, @NotNull String district, @NotNull String province, @NotNull String postcode, @NotNull String postcodeSequence) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(postcodeSequence, "postcodeSequence");
        this.address1 = address1;
        this.address2 = address2;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
        this.postcodeSequence = postcodeSequence;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}