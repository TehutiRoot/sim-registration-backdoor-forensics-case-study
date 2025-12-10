package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "bankInfo", "", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAdditionalPictureResponse;", "additionalPicture", "faceDetectionAttemptMax", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAdditionalPicture", "()Ljava/util/List;", "getBankInfo", "getFaceDetectionAttemptMax", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationConfigResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationConfigResponse implements Parcelable {
    @SerializedName("additionalPicture")
    @Nullable
    private final List<OneOnlineRegistrationAdditionalPictureResponse> additionalPicture;
    @SerializedName("bankInfo")
    @Nullable
    private final List<OneOnlineRegistrationAdditionalPictureResponse> bankInfo;
    @SerializedName("faceDetection.attempt.max")
    @Nullable
    private final String faceDetectionAttemptMax;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationConfigResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationConfigResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOnlineRegistrationConfigResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationConfigResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOnlineRegistrationConfigResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationConfigResponse[] newArray(int i) {
            return new OneOnlineRegistrationConfigResponse[i];
        }
    }

    public OneOnlineRegistrationConfigResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOnlineRegistrationConfigResponse copy$default(OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneOnlineRegistrationConfigResponse.bankInfo;
        }
        if ((i & 2) != 0) {
            list2 = oneOnlineRegistrationConfigResponse.additionalPicture;
        }
        if ((i & 4) != 0) {
            str = oneOnlineRegistrationConfigResponse.faceDetectionAttemptMax;
        }
        return oneOnlineRegistrationConfigResponse.copy(list, list2, str);
    }

    @Nullable
    public final List<OneOnlineRegistrationAdditionalPictureResponse> component1() {
        return this.bankInfo;
    }

    @Nullable
    public final List<OneOnlineRegistrationAdditionalPictureResponse> component2() {
        return this.additionalPicture;
    }

    @Nullable
    public final String component3() {
        return this.faceDetectionAttemptMax;
    }

    @NotNull
    public final OneOnlineRegistrationConfigResponse copy(@Nullable List<OneOnlineRegistrationAdditionalPictureResponse> list, @Nullable List<OneOnlineRegistrationAdditionalPictureResponse> list2, @Nullable String str) {
        return new OneOnlineRegistrationConfigResponse(list, list2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationConfigResponse) {
            OneOnlineRegistrationConfigResponse oneOnlineRegistrationConfigResponse = (OneOnlineRegistrationConfigResponse) obj;
            return Intrinsics.areEqual(this.bankInfo, oneOnlineRegistrationConfigResponse.bankInfo) && Intrinsics.areEqual(this.additionalPicture, oneOnlineRegistrationConfigResponse.additionalPicture) && Intrinsics.areEqual(this.faceDetectionAttemptMax, oneOnlineRegistrationConfigResponse.faceDetectionAttemptMax);
        }
        return false;
    }

    @Nullable
    public final List<OneOnlineRegistrationAdditionalPictureResponse> getAdditionalPicture() {
        return this.additionalPicture;
    }

    @Nullable
    public final List<OneOnlineRegistrationAdditionalPictureResponse> getBankInfo() {
        return this.bankInfo;
    }

    @Nullable
    public final String getFaceDetectionAttemptMax() {
        return this.faceDetectionAttemptMax;
    }

    public int hashCode() {
        List<OneOnlineRegistrationAdditionalPictureResponse> list = this.bankInfo;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<OneOnlineRegistrationAdditionalPictureResponse> list2 = this.additionalPicture;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.faceDetectionAttemptMax;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<OneOnlineRegistrationAdditionalPictureResponse> list = this.bankInfo;
        List<OneOnlineRegistrationAdditionalPictureResponse> list2 = this.additionalPicture;
        String str = this.faceDetectionAttemptMax;
        return "OneOnlineRegistrationConfigResponse(bankInfo=" + list + ", additionalPicture=" + list2 + ", faceDetectionAttemptMax=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.bankInfo);
        parcel.writeTypedList(this.additionalPicture);
        parcel.writeString(this.faceDetectionAttemptMax);
    }

    public OneOnlineRegistrationConfigResponse(@Nullable List<OneOnlineRegistrationAdditionalPictureResponse> list, @Nullable List<OneOnlineRegistrationAdditionalPictureResponse> list2, @Nullable String str) {
        this.bankInfo = list;
        this.additionalPicture = list2;
        this.faceDetectionAttemptMax = str;
    }

    public /* synthetic */ OneOnlineRegistrationConfigResponse(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? ExifInterface.GPS_MEASUREMENT_3D : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneOnlineRegistrationConfigResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAdditionalPictureResponse$CREATOR r0 = th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAdditionalPictureResponse.CREATOR
            java.util.ArrayList r1 = r3.createTypedArrayList(r0)
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            java.lang.String r3 = r3.readString()
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationConfigResponse.<init>(android.os.Parcel):void");
    }
}
