package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J¥\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00069"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/AddressData;", "", "type", "", "contactName", "contactLastname", "number", "buildingName", "buildingRoom", "buildingFloor", "moo", "village", "street", "soi", "subDistrict", "district", "province", "zip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingFloor", "()Ljava/lang/String;", "getBuildingName", "getBuildingRoom", "getContactLastname", "getContactName", "getDistrict", "getMoo", "getNumber", "getProvince", "getSoi", "getStreet", "getSubDistrict", "getType", "getVillage", "getZip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.AddressData */
/* loaded from: classes8.dex */
public final class AddressData {
    public static final int $stable = 0;
    @SerializedName("buildingFloor")
    @NotNull
    private final String buildingFloor;
    @SerializedName("buildingName")
    @NotNull
    private final String buildingName;
    @SerializedName("buildingRoom")
    @NotNull
    private final String buildingRoom;
    @SerializedName("contactLastname")
    @Nullable
    private final String contactLastname;
    @SerializedName("contactName")
    @Nullable
    private final String contactName;
    @SerializedName("district")
    @NotNull
    private final String district;
    @SerializedName("moo")
    @NotNull
    private final String moo;
    @SerializedName("number")
    @NotNull
    private final String number;
    @SerializedName("province")
    @NotNull
    private final String province;
    @SerializedName("soi")
    @NotNull
    private final String soi;
    @SerializedName("street")
    @NotNull
    private final String street;
    @SerializedName("subDistrict")
    @NotNull
    private final String subDistrict;
    @SerializedName("type")
    @Nullable
    private final String type;
    @SerializedName("village")
    @NotNull
    private final String village;
    @SerializedName("zip")
    @NotNull
    private final String zip;

    public AddressData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component10() {
        return this.street;
    }

    @NotNull
    public final String component11() {
        return this.soi;
    }

    @NotNull
    public final String component12() {
        return this.subDistrict;
    }

    @NotNull
    public final String component13() {
        return this.district;
    }

    @NotNull
    public final String component14() {
        return this.province;
    }

    @NotNull
    public final String component15() {
        return this.zip;
    }

    @Nullable
    public final String component2() {
        return this.contactName;
    }

    @Nullable
    public final String component3() {
        return this.contactLastname;
    }

    @NotNull
    public final String component4() {
        return this.number;
    }

    @NotNull
    public final String component5() {
        return this.buildingName;
    }

    @NotNull
    public final String component6() {
        return this.buildingRoom;
    }

    @NotNull
    public final String component7() {
        return this.buildingFloor;
    }

    @NotNull
    public final String component8() {
        return this.moo;
    }

    @NotNull
    public final String component9() {
        return this.village;
    }

    @NotNull
    public final AddressData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String number, @NotNull String buildingName, @NotNull String buildingRoom, @NotNull String buildingFloor, @NotNull String moo, @NotNull String village, @NotNull String street, @NotNull String soi, @NotNull String subDistrict, @NotNull String district, @NotNull String province, @NotNull String zip) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(buildingName, "buildingName");
        Intrinsics.checkNotNullParameter(buildingRoom, "buildingRoom");
        Intrinsics.checkNotNullParameter(buildingFloor, "buildingFloor");
        Intrinsics.checkNotNullParameter(moo, "moo");
        Intrinsics.checkNotNullParameter(village, "village");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(soi, "soi");
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(zip, "zip");
        return new AddressData(str, str2, str3, number, buildingName, buildingRoom, buildingFloor, moo, village, street, soi, subDistrict, district, province, zip);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressData) {
            AddressData addressData = (AddressData) obj;
            return Intrinsics.areEqual(this.type, addressData.type) && Intrinsics.areEqual(this.contactName, addressData.contactName) && Intrinsics.areEqual(this.contactLastname, addressData.contactLastname) && Intrinsics.areEqual(this.number, addressData.number) && Intrinsics.areEqual(this.buildingName, addressData.buildingName) && Intrinsics.areEqual(this.buildingRoom, addressData.buildingRoom) && Intrinsics.areEqual(this.buildingFloor, addressData.buildingFloor) && Intrinsics.areEqual(this.moo, addressData.moo) && Intrinsics.areEqual(this.village, addressData.village) && Intrinsics.areEqual(this.street, addressData.street) && Intrinsics.areEqual(this.soi, addressData.soi) && Intrinsics.areEqual(this.subDistrict, addressData.subDistrict) && Intrinsics.areEqual(this.district, addressData.district) && Intrinsics.areEqual(this.province, addressData.province) && Intrinsics.areEqual(this.zip, addressData.zip);
        }
        return false;
    }

    @NotNull
    public final String getBuildingFloor() {
        return this.buildingFloor;
    }

    @NotNull
    public final String getBuildingName() {
        return this.buildingName;
    }

    @NotNull
    public final String getBuildingRoom() {
        return this.buildingRoom;
    }

    @Nullable
    public final String getContactLastname() {
        return this.contactLastname;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @NotNull
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    public final String getMoo() {
        return this.moo;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final String getSoi() {
        return this.soi;
    }

    @NotNull
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    public final String getSubDistrict() {
        return this.subDistrict;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getVillage() {
        return this.village;
    }

    @NotNull
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactLastname;
        return ((((((((((((((((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.number.hashCode()) * 31) + this.buildingName.hashCode()) * 31) + this.buildingRoom.hashCode()) * 31) + this.buildingFloor.hashCode()) * 31) + this.moo.hashCode()) * 31) + this.village.hashCode()) * 31) + this.street.hashCode()) * 31) + this.soi.hashCode()) * 31) + this.subDistrict.hashCode()) * 31) + this.district.hashCode()) * 31) + this.province.hashCode()) * 31) + this.zip.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.contactName;
        String str3 = this.contactLastname;
        String str4 = this.number;
        String str5 = this.buildingName;
        String str6 = this.buildingRoom;
        String str7 = this.buildingFloor;
        String str8 = this.moo;
        String str9 = this.village;
        String str10 = this.street;
        String str11 = this.soi;
        String str12 = this.subDistrict;
        String str13 = this.district;
        String str14 = this.province;
        String str15 = this.zip;
        return "AddressData(type=" + str + ", contactName=" + str2 + ", contactLastname=" + str3 + ", number=" + str4 + ", buildingName=" + str5 + ", buildingRoom=" + str6 + ", buildingFloor=" + str7 + ", moo=" + str8 + ", village=" + str9 + ", street=" + str10 + ", soi=" + str11 + ", subDistrict=" + str12 + ", district=" + str13 + ", province=" + str14 + ", zip=" + str15 + ")";
    }

    public AddressData(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String number, @NotNull String buildingName, @NotNull String buildingRoom, @NotNull String buildingFloor, @NotNull String moo, @NotNull String village, @NotNull String street, @NotNull String soi, @NotNull String subDistrict, @NotNull String district, @NotNull String province, @NotNull String zip) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(buildingName, "buildingName");
        Intrinsics.checkNotNullParameter(buildingRoom, "buildingRoom");
        Intrinsics.checkNotNullParameter(buildingFloor, "buildingFloor");
        Intrinsics.checkNotNullParameter(moo, "moo");
        Intrinsics.checkNotNullParameter(village, "village");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(soi, "soi");
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(zip, "zip");
        this.type = str;
        this.contactName = str2;
        this.contactLastname = str3;
        this.number = number;
        this.buildingName = buildingName;
        this.buildingRoom = buildingRoom;
        this.buildingFloor = buildingFloor;
        this.moo = moo;
        this.village = village;
        this.street = street;
        this.soi = soi;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.zip = zip;
    }

    public /* synthetic */ AddressData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str4, (i & 16) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str5, (i & 32) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str6, (i & 64) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str7, (i & 128) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str8, (i & 256) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str9, (i & 512) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str10, (i & 1024) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str11, (i & 2048) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str12, (i & 4096) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str13, (i & 8192) != 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : str14, (i & 16384) == 0 ? str15 : HelpFormatter.DEFAULT_OPT_PREFIX);
    }
}
