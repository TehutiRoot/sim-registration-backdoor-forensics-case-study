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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tambonId", "", "tambonName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getTambonId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTambonName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationTambonResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationTambonResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("tumbonId")
    @Nullable
    private final Integer tambonId;
    @SerializedName("tumbonName")
    @Nullable
    private final String tambonName;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationTambonResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOnlineRegistrationTambonResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationTambonResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOnlineRegistrationTambonResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationTambonResponse[] newArray(int i) {
            return new OneOnlineRegistrationTambonResponse[i];
        }
    }

    public OneOnlineRegistrationTambonResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneOnlineRegistrationTambonResponse copy$default(OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oneOnlineRegistrationTambonResponse.tambonId;
        }
        if ((i & 2) != 0) {
            str = oneOnlineRegistrationTambonResponse.tambonName;
        }
        return oneOnlineRegistrationTambonResponse.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.tambonId;
    }

    @Nullable
    public final String component2() {
        return this.tambonName;
    }

    @NotNull
    public final OneOnlineRegistrationTambonResponse copy(@Nullable Integer num, @Nullable String str) {
        return new OneOnlineRegistrationTambonResponse(num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationTambonResponse) {
            OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse = (OneOnlineRegistrationTambonResponse) obj;
            return Intrinsics.areEqual(this.tambonId, oneOnlineRegistrationTambonResponse.tambonId) && Intrinsics.areEqual(this.tambonName, oneOnlineRegistrationTambonResponse.tambonName);
        }
        return false;
    }

    @Nullable
    public final Integer getTambonId() {
        return this.tambonId;
    }

    @Nullable
    public final String getTambonName() {
        return this.tambonName;
    }

    public int hashCode() {
        Integer num = this.tambonId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tambonName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.tambonId;
        String str = this.tambonName;
        return "OneOnlineRegistrationTambonResponse(tambonId=" + num + ", tambonName=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.tambonId);
        parcel.writeString(this.tambonName);
    }

    public OneOnlineRegistrationTambonResponse(@Nullable Integer num, @Nullable String str) {
        this.tambonId = num;
        this.tambonName = str;
    }

    public /* synthetic */ OneOnlineRegistrationTambonResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneOnlineRegistrationTambonResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L16
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationTambonResponse.<init>(android.os.Parcel):void");
    }
}
