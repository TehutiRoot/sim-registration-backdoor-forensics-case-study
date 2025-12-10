package th.p047co.dtac.android.dtacone.model.esim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimRequest;", "Landroid/os/Parcelable;", "simCardNumber", "", "userLan", "userFormatType", "retailerCode", "airportShop", "", "locationCode", "userCode", "subFeature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirportShop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLocationCode", "()Ljava/lang/String;", "getRetailerCode", "getSimCardNumber", "getSubFeature", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimRequest;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.AutoTransferEsimRequest */
/* loaded from: classes8.dex */
public final class AutoTransferEsimRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<AutoTransferEsimRequest> CREATOR = new Creator();
    @SerializedName("airportShop")
    @Nullable
    private final Boolean airportShop;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("retailerCode")
    @Nullable
    private final String retailerCode;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("subFeature")
    @Nullable
    private final String subFeature;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.esim.AutoTransferEsimRequest$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<AutoTransferEsimRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AutoTransferEsimRequest createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoTransferEsimRequest(readString, readString2, readString3, readString4, valueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AutoTransferEsimRequest[] newArray(int i) {
            return new AutoTransferEsimRequest[i];
        }
    }

    public AutoTransferEsimRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userLan;
    }

    @Nullable
    public final String component3() {
        return this.userFormatType;
    }

    @Nullable
    public final String component4() {
        return this.retailerCode;
    }

    @Nullable
    public final Boolean component5() {
        return this.airportShop;
    }

    @Nullable
    public final String component6() {
        return this.locationCode;
    }

    @Nullable
    public final String component7() {
        return this.userCode;
    }

    @Nullable
    public final String component8() {
        return this.subFeature;
    }

    @NotNull
    public final AutoTransferEsimRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new AutoTransferEsimRequest(str, str2, str3, str4, bool, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoTransferEsimRequest) {
            AutoTransferEsimRequest autoTransferEsimRequest = (AutoTransferEsimRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, autoTransferEsimRequest.simCardNumber) && Intrinsics.areEqual(this.userLan, autoTransferEsimRequest.userLan) && Intrinsics.areEqual(this.userFormatType, autoTransferEsimRequest.userFormatType) && Intrinsics.areEqual(this.retailerCode, autoTransferEsimRequest.retailerCode) && Intrinsics.areEqual(this.airportShop, autoTransferEsimRequest.airportShop) && Intrinsics.areEqual(this.locationCode, autoTransferEsimRequest.locationCode) && Intrinsics.areEqual(this.userCode, autoTransferEsimRequest.userCode) && Intrinsics.areEqual(this.subFeature, autoTransferEsimRequest.subFeature);
        }
        return false;
    }

    @Nullable
    public final Boolean getAirportShop() {
        return this.airportShop;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final String getRetailerCode() {
        return this.retailerCode;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSubFeature() {
        return this.subFeature;
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
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFormatType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retailerCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.airportShop;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.locationCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userCode;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subFeature;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.userLan;
        String str3 = this.userFormatType;
        String str4 = this.retailerCode;
        Boolean bool = this.airportShop;
        String str5 = this.locationCode;
        String str6 = this.userCode;
        String str7 = this.subFeature;
        return "AutoTransferEsimRequest(simCardNumber=" + str + ", userLan=" + str2 + ", userFormatType=" + str3 + ", retailerCode=" + str4 + ", airportShop=" + bool + ", locationCode=" + str5 + ", userCode=" + str6 + ", subFeature=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.simCardNumber);
        out.writeString(this.userLan);
        out.writeString(this.userFormatType);
        out.writeString(this.retailerCode);
        Boolean bool = this.airportShop;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.locationCode);
        out.writeString(this.userCode);
        out.writeString(this.subFeature);
    }

    public AutoTransferEsimRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.simCardNumber = str;
        this.userLan = str2;
        this.userFormatType = str3;
        this.retailerCode = str4;
        this.airportShop = bool;
        this.locationCode = str5;
        this.userCode = str6;
        this.subFeature = str7;
    }

    public /* synthetic */ AutoTransferEsimRequest(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}