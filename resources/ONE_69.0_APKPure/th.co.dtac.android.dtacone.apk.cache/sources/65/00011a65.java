package th.p047co.dtac.android.dtacone.model.appOne.getProfile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.profile.GroupPermission;
import th.p047co.dtac.android.dtacone.model.profile.Permission;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÕ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018¨\u0006C"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;", "", "rtrCode", "", "dolStatus", "retailerType", "retailerSubType", "dtrCode", "channel", "simR", "userCode", "userLan", "permissions", "", "Lth/co/dtac/android/dtacone/model/profile/Permission;", "rtrName", "subChannel", "groupPermission", "Lth/co/dtac/android/dtacone/model/profile/GroupPermission;", "locationCode", "locationName", "userFormatType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getDolStatus", "getDtrCode", "getGroupPermission", "()Ljava/util/List;", "getLocationCode", "getLocationName", "getPermissions", "getRetailerSubType", "getRetailerType", "getRtrCode", "getRtrName", "getSimR", "setSimR", "(Ljava/lang/String;)V", "getSubChannel", "getUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.getProfile.Company */
/* loaded from: classes8.dex */
public final class Company {
    public static final int $stable = 8;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("dolStatus")
    @Nullable
    private final String dolStatus;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("groupPermission")
    @Nullable
    private final List<GroupPermission> groupPermission;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("locationName")
    @Nullable
    private final String locationName;
    @SerializedName("permissions")
    @Nullable
    private final List<Permission> permissions;
    @SerializedName("retailerSubType")
    @Nullable
    private final String retailerSubType;
    @SerializedName("retailerType")
    @Nullable
    private final String retailerType;
    @SerializedName("rtrCode")
    @Nullable
    private final String rtrCode;
    @SerializedName("rtrName")
    @Nullable
    private final String rtrName;
    @SerializedName("simR")
    @Nullable
    private String simR;
    @SerializedName("subChannel")
    @Nullable
    private final String subChannel;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @Nullable
    private transient String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public Company() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @Nullable
    public final String component1() {
        return this.rtrCode;
    }

    @Nullable
    public final List<Permission> component10() {
        return this.permissions;
    }

    @Nullable
    public final String component11() {
        return this.rtrName;
    }

    @Nullable
    public final String component12() {
        return this.subChannel;
    }

    @Nullable
    public final List<GroupPermission> component13() {
        return this.groupPermission;
    }

    @Nullable
    public final String component14() {
        return this.locationCode;
    }

    @Nullable
    public final String component15() {
        return this.locationName;
    }

    @Nullable
    public final String component16() {
        return this.userFormatType;
    }

    @Nullable
    public final String component2() {
        return this.dolStatus;
    }

    @Nullable
    public final String component3() {
        return this.retailerType;
    }

    @Nullable
    public final String component4() {
        return this.retailerSubType;
    }

    @Nullable
    public final String component5() {
        return this.dtrCode;
    }

    @Nullable
    public final String component6() {
        return this.channel;
    }

    @Nullable
    public final String component7() {
        return this.simR;
    }

    @Nullable
    public final String component8() {
        return this.userCode;
    }

    @Nullable
    public final String component9() {
        return this.userLan;
    }

    @NotNull
    public final Company copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<Permission> list, @Nullable String str10, @Nullable String str11, @Nullable List<GroupPermission> list2, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new Company(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, str11, list2, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Company) {
            Company company = (Company) obj;
            return Intrinsics.areEqual(this.rtrCode, company.rtrCode) && Intrinsics.areEqual(this.dolStatus, company.dolStatus) && Intrinsics.areEqual(this.retailerType, company.retailerType) && Intrinsics.areEqual(this.retailerSubType, company.retailerSubType) && Intrinsics.areEqual(this.dtrCode, company.dtrCode) && Intrinsics.areEqual(this.channel, company.channel) && Intrinsics.areEqual(this.simR, company.simR) && Intrinsics.areEqual(this.userCode, company.userCode) && Intrinsics.areEqual(this.userLan, company.userLan) && Intrinsics.areEqual(this.permissions, company.permissions) && Intrinsics.areEqual(this.rtrName, company.rtrName) && Intrinsics.areEqual(this.subChannel, company.subChannel) && Intrinsics.areEqual(this.groupPermission, company.groupPermission) && Intrinsics.areEqual(this.locationCode, company.locationCode) && Intrinsics.areEqual(this.locationName, company.locationName) && Intrinsics.areEqual(this.userFormatType, company.userFormatType);
        }
        return false;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getDolStatus() {
        return this.dolStatus;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final List<GroupPermission> getGroupPermission() {
        return this.groupPermission;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final String getLocationName() {
        return this.locationName;
    }

    @Nullable
    public final List<Permission> getPermissions() {
        return this.permissions;
    }

    @Nullable
    public final String getRetailerSubType() {
        return this.retailerSubType;
    }

    @Nullable
    public final String getRetailerType() {
        return this.retailerType;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getSimR() {
        return this.simR;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.rtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dolStatus;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.retailerType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retailerSubType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dtrCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channel;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.simR;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLan;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<Permission> list = this.permissions;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.rtrName;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subChannel;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<GroupPermission> list2 = this.groupPermission;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str12 = this.locationCode;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.locationName;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.userFormatType;
        return hashCode15 + (str14 != null ? str14.hashCode() : 0);
    }

    public final void setSimR(@Nullable String str) {
        this.simR = str;
    }

    public final void setUserFormatType(@Nullable String str) {
        this.userFormatType = str;
    }

    @NotNull
    public String toString() {
        String str = this.rtrCode;
        String str2 = this.dolStatus;
        String str3 = this.retailerType;
        String str4 = this.retailerSubType;
        String str5 = this.dtrCode;
        String str6 = this.channel;
        String str7 = this.simR;
        String str8 = this.userCode;
        String str9 = this.userLan;
        List<Permission> list = this.permissions;
        String str10 = this.rtrName;
        String str11 = this.subChannel;
        List<GroupPermission> list2 = this.groupPermission;
        String str12 = this.locationCode;
        String str13 = this.locationName;
        String str14 = this.userFormatType;
        return "Company(rtrCode=" + str + ", dolStatus=" + str2 + ", retailerType=" + str3 + ", retailerSubType=" + str4 + ", dtrCode=" + str5 + ", channel=" + str6 + ", simR=" + str7 + ", userCode=" + str8 + ", userLan=" + str9 + ", permissions=" + list + ", rtrName=" + str10 + ", subChannel=" + str11 + ", groupPermission=" + list2 + ", locationCode=" + str12 + ", locationName=" + str13 + ", userFormatType=" + str14 + ")";
    }

    public Company(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<Permission> list, @Nullable String str10, @Nullable String str11, @Nullable List<GroupPermission> list2, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.rtrCode = str;
        this.dolStatus = str2;
        this.retailerType = str3;
        this.retailerSubType = str4;
        this.dtrCode = str5;
        this.channel = str6;
        this.simR = str7;
        this.userCode = str8;
        this.userLan = str9;
        this.permissions = list;
        this.rtrName = str10;
        this.subChannel = str11;
        this.groupPermission = list2;
        this.locationCode = str12;
        this.locationName = str13;
        this.userFormatType = str14;
    }

    public /* synthetic */ Company(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, List list2, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : list2, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14);
    }
}