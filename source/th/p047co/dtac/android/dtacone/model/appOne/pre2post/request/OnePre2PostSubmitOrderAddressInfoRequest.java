package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitOrderAddressInfoRequest;", "", "district", "", "number", "province", "street", "subDistrict", "zip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistrict", "()Ljava/lang/String;", "getNumber", "getProvince", "getStreet", "getSubDistrict", "getZip", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitOrderAddressInfoRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostSubmitOrderAddressInfoRequest {
    public static final int $stable = 0;
    @SerializedName("district")
    @Nullable
    private final String district;
    @SerializedName("number")
    @Nullable
    private final String number;
    @SerializedName("province")
    @Nullable
    private final String province;
    @SerializedName("street")
    @Nullable
    private final String street;
    @SerializedName("subDistrict")
    @Nullable
    private final String subDistrict;
    @SerializedName("zip")
    @Nullable
    private final String zip;

    public OnePre2PostSubmitOrderAddressInfoRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnePre2PostSubmitOrderAddressInfoRequest copy$default(OnePre2PostSubmitOrderAddressInfoRequest onePre2PostSubmitOrderAddressInfoRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostSubmitOrderAddressInfoRequest.district;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostSubmitOrderAddressInfoRequest.number;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onePre2PostSubmitOrderAddressInfoRequest.province;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onePre2PostSubmitOrderAddressInfoRequest.street;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onePre2PostSubmitOrderAddressInfoRequest.subDistrict;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onePre2PostSubmitOrderAddressInfoRequest.zip;
        }
        return onePre2PostSubmitOrderAddressInfoRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.district;
    }

    @Nullable
    public final String component2() {
        return this.number;
    }

    @Nullable
    public final String component3() {
        return this.province;
    }

    @Nullable
    public final String component4() {
        return this.street;
    }

    @Nullable
    public final String component5() {
        return this.subDistrict;
    }

    @Nullable
    public final String component6() {
        return this.zip;
    }

    @NotNull
    public final OnePre2PostSubmitOrderAddressInfoRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OnePre2PostSubmitOrderAddressInfoRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostSubmitOrderAddressInfoRequest) {
            OnePre2PostSubmitOrderAddressInfoRequest onePre2PostSubmitOrderAddressInfoRequest = (OnePre2PostSubmitOrderAddressInfoRequest) obj;
            return Intrinsics.areEqual(this.district, onePre2PostSubmitOrderAddressInfoRequest.district) && Intrinsics.areEqual(this.number, onePre2PostSubmitOrderAddressInfoRequest.number) && Intrinsics.areEqual(this.province, onePre2PostSubmitOrderAddressInfoRequest.province) && Intrinsics.areEqual(this.street, onePre2PostSubmitOrderAddressInfoRequest.street) && Intrinsics.areEqual(this.subDistrict, onePre2PostSubmitOrderAddressInfoRequest.subDistrict) && Intrinsics.areEqual(this.zip, onePre2PostSubmitOrderAddressInfoRequest.zip);
        }
        return false;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final String getStreet() {
        return this.street;
    }

    @Nullable
    public final String getSubDistrict() {
        return this.subDistrict;
    }

    @Nullable
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.district;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.province;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subDistrict;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zip;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.district;
        String str2 = this.number;
        String str3 = this.province;
        String str4 = this.street;
        String str5 = this.subDistrict;
        String str6 = this.zip;
        return "OnePre2PostSubmitOrderAddressInfoRequest(district=" + str + ", number=" + str2 + ", province=" + str3 + ", street=" + str4 + ", subDistrict=" + str5 + ", zip=" + str6 + ")";
    }

    public OnePre2PostSubmitOrderAddressInfoRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.district = str;
        this.number = str2;
        this.province = str3;
        this.street = str4;
        this.subDistrict = str5;
        this.zip = str6;
    }

    public /* synthetic */ OnePre2PostSubmitOrderAddressInfoRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
