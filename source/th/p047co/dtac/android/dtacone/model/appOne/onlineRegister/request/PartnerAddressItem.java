package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010C\u001a\u00020\u0003J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015¨\u0006F"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;", "", "sameAsAddress", "", "amphurId", "", "address2", "addressType", "address1", "addressTypeName", "tumbonId", "provinceId", "postCodeValue", "postCodeId", "provinceValue", "tumbonValue", "amphurValue", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "getAddress2", "setAddress2", "getAddressType", "setAddressType", "getAddressTypeName", "setAddressTypeName", "getAmphurId", "()Ljava/lang/Integer;", "setAmphurId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAmphurValue", "setAmphurValue", "getPostCodeId", "setPostCodeId", "getPostCodeValue", "setPostCodeValue", "getProvinceId", "setProvinceId", "getProvinceValue", "setProvinceValue", "getSameAsAddress", "setSameAsAddress", "getTumbonId", "setTumbonId", "getTumbonValue", "setTumbonValue", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/request/PartnerAddressItem;", "equals", "", "other", "getFullAddress", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.request.PartnerAddressItem */
/* loaded from: classes8.dex */
public final class PartnerAddressItem {
    public static final int $stable = 8;
    @SerializedName("address1")
    @Nullable
    private String address1;
    @SerializedName("address2")
    @Nullable
    private String address2;
    @SerializedName("addressType")
    @Nullable
    private String addressType;
    @SerializedName("addressTypeName")
    @Nullable
    private String addressTypeName;
    @SerializedName("amphurId")
    @Nullable
    private Integer amphurId;
    @Nullable
    private transient String amphurValue;
    @SerializedName("postCodeId")
    @Nullable
    private Integer postCodeId;
    @SerializedName("postCodeValue")
    @Nullable
    private String postCodeValue;
    @SerializedName("provinceId")
    @Nullable
    private Integer provinceId;
    @Nullable
    private transient String provinceValue;
    @SerializedName("sameAsAddress")
    @Nullable
    private String sameAsAddress;
    @SerializedName("tumbonId")
    @Nullable
    private Integer tumbonId;
    @Nullable
    private transient String tumbonValue;

    public PartnerAddressItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    public final String component1() {
        return this.sameAsAddress;
    }

    @Nullable
    public final Integer component10() {
        return this.postCodeId;
    }

    @Nullable
    public final String component11() {
        return this.provinceValue;
    }

    @Nullable
    public final String component12() {
        return this.tumbonValue;
    }

    @Nullable
    public final String component13() {
        return this.amphurValue;
    }

    @Nullable
    public final Integer component2() {
        return this.amphurId;
    }

    @Nullable
    public final String component3() {
        return this.address2;
    }

    @Nullable
    public final String component4() {
        return this.addressType;
    }

    @Nullable
    public final String component5() {
        return this.address1;
    }

    @Nullable
    public final String component6() {
        return this.addressTypeName;
    }

    @Nullable
    public final Integer component7() {
        return this.tumbonId;
    }

    @Nullable
    public final Integer component8() {
        return this.provinceId;
    }

    @Nullable
    public final String component9() {
        return this.postCodeValue;
    }

    @NotNull
    public final PartnerAddressItem copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new PartnerAddressItem(str, num, str2, str3, str4, str5, num2, num3, str6, num4, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerAddressItem) {
            PartnerAddressItem partnerAddressItem = (PartnerAddressItem) obj;
            return Intrinsics.areEqual(this.sameAsAddress, partnerAddressItem.sameAsAddress) && Intrinsics.areEqual(this.amphurId, partnerAddressItem.amphurId) && Intrinsics.areEqual(this.address2, partnerAddressItem.address2) && Intrinsics.areEqual(this.addressType, partnerAddressItem.addressType) && Intrinsics.areEqual(this.address1, partnerAddressItem.address1) && Intrinsics.areEqual(this.addressTypeName, partnerAddressItem.addressTypeName) && Intrinsics.areEqual(this.tumbonId, partnerAddressItem.tumbonId) && Intrinsics.areEqual(this.provinceId, partnerAddressItem.provinceId) && Intrinsics.areEqual(this.postCodeValue, partnerAddressItem.postCodeValue) && Intrinsics.areEqual(this.postCodeId, partnerAddressItem.postCodeId) && Intrinsics.areEqual(this.provinceValue, partnerAddressItem.provinceValue) && Intrinsics.areEqual(this.tumbonValue, partnerAddressItem.tumbonValue) && Intrinsics.areEqual(this.amphurValue, partnerAddressItem.amphurValue);
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
    public final String getAddressType() {
        return this.addressType;
    }

    @Nullable
    public final String getAddressTypeName() {
        return this.addressTypeName;
    }

    @Nullable
    public final Integer getAmphurId() {
        return this.amphurId;
    }

    @Nullable
    public final String getAmphurValue() {
        return this.amphurValue;
    }

    @NotNull
    public final String getFullAddress() {
        String str;
        String str2;
        if (CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"กรุงเทพ", "จ.กรุงเทพ", "กรุงเทพมหานคร", "จ.กรุงเทพมหานคร"}), this.provinceValue)) {
            str = "แขวง";
            str2 = "เขต";
        } else {
            str = "ตำบล";
            str2 = "อำเภอ";
        }
        String str3 = this.address1;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = this.address2;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.tumbonValue;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = this.amphurValue;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = this.provinceValue;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = this.postCodeValue;
        if (str9 != null) {
            str4 = str9;
        }
        return str3 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str5 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str + str6 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2 + str7 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str8 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str4;
    }

    @Nullable
    public final Integer getPostCodeId() {
        return this.postCodeId;
    }

    @Nullable
    public final String getPostCodeValue() {
        return this.postCodeValue;
    }

    @Nullable
    public final Integer getProvinceId() {
        return this.provinceId;
    }

    @Nullable
    public final String getProvinceValue() {
        return this.provinceValue;
    }

    @Nullable
    public final String getSameAsAddress() {
        return this.sameAsAddress;
    }

    @Nullable
    public final Integer getTumbonId() {
        return this.tumbonId;
    }

    @Nullable
    public final String getTumbonValue() {
        return this.tumbonValue;
    }

    public int hashCode() {
        String str = this.sameAsAddress;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.amphurId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.address2;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address1;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressTypeName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.tumbonId;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.provinceId;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.postCodeValue;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.postCodeId;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.provinceValue;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tumbonValue;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.amphurValue;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setAddress1(@Nullable String str) {
        this.address1 = str;
    }

    public final void setAddress2(@Nullable String str) {
        this.address2 = str;
    }

    public final void setAddressType(@Nullable String str) {
        this.addressType = str;
    }

    public final void setAddressTypeName(@Nullable String str) {
        this.addressTypeName = str;
    }

    public final void setAmphurId(@Nullable Integer num) {
        this.amphurId = num;
    }

    public final void setAmphurValue(@Nullable String str) {
        this.amphurValue = str;
    }

    public final void setPostCodeId(@Nullable Integer num) {
        this.postCodeId = num;
    }

    public final void setPostCodeValue(@Nullable String str) {
        this.postCodeValue = str;
    }

    public final void setProvinceId(@Nullable Integer num) {
        this.provinceId = num;
    }

    public final void setProvinceValue(@Nullable String str) {
        this.provinceValue = str;
    }

    public final void setSameAsAddress(@Nullable String str) {
        this.sameAsAddress = str;
    }

    public final void setTumbonId(@Nullable Integer num) {
        this.tumbonId = num;
    }

    public final void setTumbonValue(@Nullable String str) {
        this.tumbonValue = str;
    }

    @NotNull
    public String toString() {
        String str = this.sameAsAddress;
        Integer num = this.amphurId;
        String str2 = this.address2;
        String str3 = this.addressType;
        String str4 = this.address1;
        String str5 = this.addressTypeName;
        Integer num2 = this.tumbonId;
        Integer num3 = this.provinceId;
        String str6 = this.postCodeValue;
        Integer num4 = this.postCodeId;
        String str7 = this.provinceValue;
        String str8 = this.tumbonValue;
        String str9 = this.amphurValue;
        return "PartnerAddressItem(sameAsAddress=" + str + ", amphurId=" + num + ", address2=" + str2 + ", addressType=" + str3 + ", address1=" + str4 + ", addressTypeName=" + str5 + ", tumbonId=" + num2 + ", provinceId=" + num3 + ", postCodeValue=" + str6 + ", postCodeId=" + num4 + ", provinceValue=" + str7 + ", tumbonValue=" + str8 + ", amphurValue=" + str9 + ")";
    }

    public PartnerAddressItem(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str6, @Nullable Integer num4, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.sameAsAddress = str;
        this.amphurId = num;
        this.address2 = str2;
        this.addressType = str3;
        this.address1 = str4;
        this.addressTypeName = str5;
        this.tumbonId = num2;
        this.provinceId = num3;
        this.postCodeValue = str6;
        this.postCodeId = num4;
        this.provinceValue = str7;
        this.tumbonValue = str8;
        this.amphurValue = str9;
    }

    public /* synthetic */ PartnerAddressItem(String str, Integer num, String str2, String str3, String str4, String str5, Integer num2, Integer num3, String str6, Integer num4, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) == 0 ? str9 : null);
    }
}
