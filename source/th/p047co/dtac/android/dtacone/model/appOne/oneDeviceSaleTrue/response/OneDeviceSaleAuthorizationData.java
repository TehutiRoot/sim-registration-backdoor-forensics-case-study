package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response;

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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BM\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001cH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "redZone", "", "dtrCode", "dtrName", "rtrName", "rtrType", "rtrSubType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getDtrName", "getRedZone", "getRtrName", "getRtrSubType", "getRtrType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData */
/* loaded from: classes8.dex */
public final class OneDeviceSaleAuthorizationData implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("dtrName")
    @Nullable
    private final String dtrName;
    @SerializedName("redZone")
    @Nullable
    private final String redZone;
    @SerializedName("rtrName")
    @Nullable
    private final String rtrName;
    @SerializedName("rtrSubType")
    @Nullable
    private final String rtrSubType;
    @SerializedName("rtrType")
    @Nullable
    private final String rtrType;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneDeviceSaleAuthorizationData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDeviceSaleAuthorizationData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneDeviceSaleAuthorizationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDeviceSaleAuthorizationData[] newArray(int i) {
            return new OneDeviceSaleAuthorizationData[i];
        }
    }

    public OneDeviceSaleAuthorizationData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneDeviceSaleAuthorizationData copy$default(OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneDeviceSaleAuthorizationData.redZone;
        }
        if ((i & 2) != 0) {
            str2 = oneDeviceSaleAuthorizationData.dtrCode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneDeviceSaleAuthorizationData.dtrName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneDeviceSaleAuthorizationData.rtrName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneDeviceSaleAuthorizationData.rtrType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneDeviceSaleAuthorizationData.rtrSubType;
        }
        return oneDeviceSaleAuthorizationData.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.redZone;
    }

    @Nullable
    public final String component2() {
        return this.dtrCode;
    }

    @Nullable
    public final String component3() {
        return this.dtrName;
    }

    @Nullable
    public final String component4() {
        return this.rtrName;
    }

    @Nullable
    public final String component5() {
        return this.rtrType;
    }

    @Nullable
    public final String component6() {
        return this.rtrSubType;
    }

    @NotNull
    public final OneDeviceSaleAuthorizationData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneDeviceSaleAuthorizationData(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleAuthorizationData) {
            OneDeviceSaleAuthorizationData oneDeviceSaleAuthorizationData = (OneDeviceSaleAuthorizationData) obj;
            return Intrinsics.areEqual(this.redZone, oneDeviceSaleAuthorizationData.redZone) && Intrinsics.areEqual(this.dtrCode, oneDeviceSaleAuthorizationData.dtrCode) && Intrinsics.areEqual(this.dtrName, oneDeviceSaleAuthorizationData.dtrName) && Intrinsics.areEqual(this.rtrName, oneDeviceSaleAuthorizationData.rtrName) && Intrinsics.areEqual(this.rtrType, oneDeviceSaleAuthorizationData.rtrType) && Intrinsics.areEqual(this.rtrSubType, oneDeviceSaleAuthorizationData.rtrSubType);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getDtrName() {
        return this.dtrName;
    }

    @Nullable
    public final String getRedZone() {
        return this.redZone;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getRtrSubType() {
        return this.rtrSubType;
    }

    @Nullable
    public final String getRtrType() {
        return this.rtrType;
    }

    public int hashCode() {
        String str = this.redZone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dtrCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dtrName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rtrName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rtrType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rtrSubType;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.redZone;
        String str2 = this.dtrCode;
        String str3 = this.dtrName;
        String str4 = this.rtrName;
        String str5 = this.rtrType;
        String str6 = this.rtrSubType;
        return "OneDeviceSaleAuthorizationData(redZone=" + str + ", dtrCode=" + str2 + ", dtrName=" + str3 + ", rtrName=" + str4 + ", rtrType=" + str5 + ", rtrSubType=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.redZone);
        parcel.writeString(this.dtrCode);
        parcel.writeString(this.dtrName);
        parcel.writeString(this.rtrName);
        parcel.writeString(this.rtrType);
        parcel.writeString(this.rtrSubType);
    }

    public OneDeviceSaleAuthorizationData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.redZone = str;
        this.dtrCode = str2;
        this.dtrName = str3;
        this.rtrName = str4;
        this.rtrType = str5;
        this.rtrSubType = str6;
    }

    public /* synthetic */ OneDeviceSaleAuthorizationData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleAuthorizationData(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
