package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeItemResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "businessTypeDesc", "", "businessTypeCode", "businessTypeID", "simFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessTypeCode", "()Ljava/lang/String;", "getBusinessTypeDesc", "getBusinessTypeID", "getSimFlag", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeItemResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationBusinessTypeItemResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("businessTypeCode")
    @Nullable
    private final String businessTypeCode;
    @SerializedName("businessTypeDesc")
    @Nullable
    private final String businessTypeDesc;
    @SerializedName("businessTypeID")
    @Nullable
    private final String businessTypeID;
    @SerializedName("simFlag")
    @Nullable
    private final String simFlag;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeItemResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeItemResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeItemResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeItemResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOnlineRegistrationBusinessTypeItemResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationBusinessTypeItemResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOnlineRegistrationBusinessTypeItemResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationBusinessTypeItemResponse[] newArray(int i) {
            return new OneOnlineRegistrationBusinessTypeItemResponse[i];
        }
    }

    public OneOnlineRegistrationBusinessTypeItemResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneOnlineRegistrationBusinessTypeItemResponse copy$default(OneOnlineRegistrationBusinessTypeItemResponse oneOnlineRegistrationBusinessTypeItemResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOnlineRegistrationBusinessTypeItemResponse.businessTypeDesc;
        }
        if ((i & 2) != 0) {
            str2 = oneOnlineRegistrationBusinessTypeItemResponse.businessTypeCode;
        }
        if ((i & 4) != 0) {
            str3 = oneOnlineRegistrationBusinessTypeItemResponse.businessTypeID;
        }
        if ((i & 8) != 0) {
            str4 = oneOnlineRegistrationBusinessTypeItemResponse.simFlag;
        }
        return oneOnlineRegistrationBusinessTypeItemResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.businessTypeDesc;
    }

    @Nullable
    public final String component2() {
        return this.businessTypeCode;
    }

    @Nullable
    public final String component3() {
        return this.businessTypeID;
    }

    @Nullable
    public final String component4() {
        return this.simFlag;
    }

    @NotNull
    public final OneOnlineRegistrationBusinessTypeItemResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneOnlineRegistrationBusinessTypeItemResponse(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationBusinessTypeItemResponse) {
            OneOnlineRegistrationBusinessTypeItemResponse oneOnlineRegistrationBusinessTypeItemResponse = (OneOnlineRegistrationBusinessTypeItemResponse) obj;
            return Intrinsics.areEqual(this.businessTypeDesc, oneOnlineRegistrationBusinessTypeItemResponse.businessTypeDesc) && Intrinsics.areEqual(this.businessTypeCode, oneOnlineRegistrationBusinessTypeItemResponse.businessTypeCode) && Intrinsics.areEqual(this.businessTypeID, oneOnlineRegistrationBusinessTypeItemResponse.businessTypeID) && Intrinsics.areEqual(this.simFlag, oneOnlineRegistrationBusinessTypeItemResponse.simFlag);
        }
        return false;
    }

    @Nullable
    public final String getBusinessTypeCode() {
        return this.businessTypeCode;
    }

    @Nullable
    public final String getBusinessTypeDesc() {
        return this.businessTypeDesc;
    }

    @Nullable
    public final String getBusinessTypeID() {
        return this.businessTypeID;
    }

    @Nullable
    public final String getSimFlag() {
        return this.simFlag;
    }

    public int hashCode() {
        String str = this.businessTypeDesc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessTypeCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessTypeID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.simFlag;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.businessTypeDesc;
        String str2 = this.businessTypeCode;
        String str3 = this.businessTypeID;
        String str4 = this.simFlag;
        return "OneOnlineRegistrationBusinessTypeItemResponse(businessTypeDesc=" + str + ", businessTypeCode=" + str2 + ", businessTypeID=" + str3 + ", simFlag=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.businessTypeDesc);
        parcel.writeString(this.businessTypeCode);
        parcel.writeString(this.businessTypeID);
        parcel.writeString(this.simFlag);
    }

    public OneOnlineRegistrationBusinessTypeItemResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.businessTypeDesc = str;
        this.businessTypeCode = str2;
        this.businessTypeID = str3;
        this.simFlag = str4;
    }

    public /* synthetic */ OneOnlineRegistrationBusinessTypeItemResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationBusinessTypeItemResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
