package th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B¹\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J½\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u00108\u001a\u000209H\u0016J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u000209HÖ\u0001J\t\u0010?\u001a\u00020\u0006HÖ\u0001J\u0018\u0010@\u001a\u00020A2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u000209H\u0016R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006D"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "cpCode", "", "cpEndDate", "cpDetail", "cpType", "cpName", "cpRegisterDateTo", "cpTypeName", "partnerRegisterDate", "cpStartDate", "cpStatusName", "partnerRegisterStatus", "cpRegisterDateFrom", "cpPhoto", "cpStatus", "base64Image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBase64Image", "()Ljava/lang/String;", "setBase64Image", "(Ljava/lang/String;)V", "getCpCode", "getCpDetail", "getCpEndDate", "getCpName", "getCpPhoto", "getCpRegisterDateFrom", "getCpRegisterDateTo", "getCpStartDate", "getCpStatus", "getCpStatusName", "getCpType", "getCpTypeName", "getPartnerRegisterDate", "getPartnerRegisterStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem */
/* loaded from: classes8.dex */
public final class DataItem implements Parcelable {
    @Nullable
    private transient String base64Image;
    @SerializedName("cpCode")
    @Nullable
    private final String cpCode;
    @SerializedName("cpDetail")
    @Nullable
    private final String cpDetail;
    @SerializedName("cpEndDate")
    @Nullable
    private final String cpEndDate;
    @SerializedName("cpName")
    @Nullable
    private final String cpName;
    @SerializedName("cpPhoto")
    @Nullable
    private final String cpPhoto;
    @SerializedName("cpRegisterDateFrom")
    @Nullable
    private final String cpRegisterDateFrom;
    @SerializedName("cpRegisterDateTo")
    @Nullable
    private final String cpRegisterDateTo;
    @SerializedName("cpStartDate")
    @Nullable
    private final String cpStartDate;
    @SerializedName("tmlStatus")
    @Nullable
    private final String cpStatus;
    @SerializedName("tmlStatusLabel")
    @Nullable
    private final String cpStatusName;
    @SerializedName("cpType")
    @Nullable
    private final String cpType;
    @SerializedName("cpTypeName")
    @Nullable
    private final String cpTypeName;
    @SerializedName("partnerRegisterDate")
    @Nullable
    private final String partnerRegisterDate;
    @SerializedName("partnerRegisterStatus")
    @Nullable
    private final String partnerRegisterStatus;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<DataItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DataItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DataItem[] newArray(int i) {
            return new DataItem[i];
        }
    }

    public DataItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    public final String component1() {
        return this.cpCode;
    }

    @Nullable
    public final String component10() {
        return this.cpStatusName;
    }

    @Nullable
    public final String component11() {
        return this.partnerRegisterStatus;
    }

    @Nullable
    public final String component12() {
        return this.cpRegisterDateFrom;
    }

    @Nullable
    public final String component13() {
        return this.cpPhoto;
    }

    @Nullable
    public final String component14() {
        return this.cpStatus;
    }

    @Nullable
    public final String component15() {
        return this.base64Image;
    }

    @Nullable
    public final String component2() {
        return this.cpEndDate;
    }

    @Nullable
    public final String component3() {
        return this.cpDetail;
    }

    @Nullable
    public final String component4() {
        return this.cpType;
    }

    @Nullable
    public final String component5() {
        return this.cpName;
    }

    @Nullable
    public final String component6() {
        return this.cpRegisterDateTo;
    }

    @Nullable
    public final String component7() {
        return this.cpTypeName;
    }

    @Nullable
    public final String component8() {
        return this.partnerRegisterDate;
    }

    @Nullable
    public final String component9() {
        return this.cpStartDate;
    }

    @NotNull
    public final DataItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        return new DataItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataItem) {
            DataItem dataItem = (DataItem) obj;
            return Intrinsics.areEqual(this.cpCode, dataItem.cpCode) && Intrinsics.areEqual(this.cpEndDate, dataItem.cpEndDate) && Intrinsics.areEqual(this.cpDetail, dataItem.cpDetail) && Intrinsics.areEqual(this.cpType, dataItem.cpType) && Intrinsics.areEqual(this.cpName, dataItem.cpName) && Intrinsics.areEqual(this.cpRegisterDateTo, dataItem.cpRegisterDateTo) && Intrinsics.areEqual(this.cpTypeName, dataItem.cpTypeName) && Intrinsics.areEqual(this.partnerRegisterDate, dataItem.partnerRegisterDate) && Intrinsics.areEqual(this.cpStartDate, dataItem.cpStartDate) && Intrinsics.areEqual(this.cpStatusName, dataItem.cpStatusName) && Intrinsics.areEqual(this.partnerRegisterStatus, dataItem.partnerRegisterStatus) && Intrinsics.areEqual(this.cpRegisterDateFrom, dataItem.cpRegisterDateFrom) && Intrinsics.areEqual(this.cpPhoto, dataItem.cpPhoto) && Intrinsics.areEqual(this.cpStatus, dataItem.cpStatus) && Intrinsics.areEqual(this.base64Image, dataItem.base64Image);
        }
        return false;
    }

    @Nullable
    public final String getBase64Image() {
        return this.base64Image;
    }

    @Nullable
    public final String getCpCode() {
        return this.cpCode;
    }

    @Nullable
    public final String getCpDetail() {
        return this.cpDetail;
    }

    @Nullable
    public final String getCpEndDate() {
        return this.cpEndDate;
    }

    @Nullable
    public final String getCpName() {
        return this.cpName;
    }

    @Nullable
    public final String getCpPhoto() {
        return this.cpPhoto;
    }

    @Nullable
    public final String getCpRegisterDateFrom() {
        return this.cpRegisterDateFrom;
    }

    @Nullable
    public final String getCpRegisterDateTo() {
        return this.cpRegisterDateTo;
    }

    @Nullable
    public final String getCpStartDate() {
        return this.cpStartDate;
    }

    @Nullable
    public final String getCpStatus() {
        return this.cpStatus;
    }

    @Nullable
    public final String getCpStatusName() {
        return this.cpStatusName;
    }

    @Nullable
    public final String getCpType() {
        return this.cpType;
    }

    @Nullable
    public final String getCpTypeName() {
        return this.cpTypeName;
    }

    @Nullable
    public final String getPartnerRegisterDate() {
        return this.partnerRegisterDate;
    }

    @Nullable
    public final String getPartnerRegisterStatus() {
        return this.partnerRegisterStatus;
    }

    public int hashCode() {
        String str = this.cpCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cpEndDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cpDetail;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cpType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cpName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cpRegisterDateTo;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cpTypeName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.partnerRegisterDate;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cpStartDate;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cpStatusName;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.partnerRegisterStatus;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cpRegisterDateFrom;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cpPhoto;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cpStatus;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.base64Image;
        return hashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public final void setBase64Image(@Nullable String str) {
        this.base64Image = str;
    }

    @NotNull
    public String toString() {
        String str = this.cpCode;
        String str2 = this.cpEndDate;
        String str3 = this.cpDetail;
        String str4 = this.cpType;
        String str5 = this.cpName;
        String str6 = this.cpRegisterDateTo;
        String str7 = this.cpTypeName;
        String str8 = this.partnerRegisterDate;
        String str9 = this.cpStartDate;
        String str10 = this.cpStatusName;
        String str11 = this.partnerRegisterStatus;
        String str12 = this.cpRegisterDateFrom;
        String str13 = this.cpPhoto;
        String str14 = this.cpStatus;
        String str15 = this.base64Image;
        return "DataItem(cpCode=" + str + ", cpEndDate=" + str2 + ", cpDetail=" + str3 + ", cpType=" + str4 + ", cpName=" + str5 + ", cpRegisterDateTo=" + str6 + ", cpTypeName=" + str7 + ", partnerRegisterDate=" + str8 + ", cpStartDate=" + str9 + ", cpStatusName=" + str10 + ", partnerRegisterStatus=" + str11 + ", cpRegisterDateFrom=" + str12 + ", cpPhoto=" + str13 + ", cpStatus=" + str14 + ", base64Image=" + str15 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.cpCode);
        parcel.writeString(this.cpEndDate);
        parcel.writeString(this.cpDetail);
        parcel.writeString(this.cpType);
        parcel.writeString(this.cpName);
        parcel.writeString(this.cpRegisterDateTo);
        parcel.writeString(this.cpTypeName);
        parcel.writeString(this.partnerRegisterDate);
        parcel.writeString(this.cpStartDate);
        parcel.writeString(this.cpStatusName);
        parcel.writeString(this.partnerRegisterStatus);
        parcel.writeString(this.cpRegisterDateFrom);
        parcel.writeString(this.cpPhoto);
        parcel.writeString(this.cpStatus);
        parcel.writeString(this.base64Image);
    }

    public DataItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.cpCode = str;
        this.cpEndDate = str2;
        this.cpDetail = str3;
        this.cpType = str4;
        this.cpName = str5;
        this.cpRegisterDateTo = str6;
        this.cpTypeName = str7;
        this.partnerRegisterDate = str8;
        this.cpStartDate = str9;
        this.cpStatusName = str10;
        this.partnerRegisterStatus = str11;
        this.cpRegisterDateFrom = str12;
        this.cpPhoto = str13;
        this.cpStatus = str14;
        this.base64Image = str15;
    }

    public /* synthetic */ DataItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) == 0 ? str15 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}