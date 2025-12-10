package th.p047co.dtac.android.dtacone.model.updateprepaid.config;

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
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\nHÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/config/UpdatePrepaidConfigResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "faceRecognition", "Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "faceNotFoundCountBeforeManualAccept", "Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceNotFoundCountBeforeManualAccept;", "kYCRequireVerifyJC", "", "(Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceNotFoundCountBeforeManualAccept;Z)V", "getFaceNotFoundCountBeforeManualAccept", "()Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceNotFoundCountBeforeManualAccept;", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "getKYCRequireVerifyJC", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.config.UpdatePrepaidConfigResponse */
/* loaded from: classes8.dex */
public final class UpdatePrepaidConfigResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("faceNotFoundCountBeforeManualAccept")
    @Nullable
    private final FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept;
    @SerializedName("faceRecognition")
    @Nullable
    private final FaceRecognition faceRecognition;
    @SerializedName("KYCRequireVerifyJC")
    private final boolean kYCRequireVerifyJC;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/config/UpdatePrepaidConfigResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/updateprepaid/config/UpdatePrepaidConfigResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/updateprepaid/config/UpdatePrepaidConfigResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.config.UpdatePrepaidConfigResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<UpdatePrepaidConfigResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidConfigResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpdatePrepaidConfigResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UpdatePrepaidConfigResponse[] newArray(int i) {
            return new UpdatePrepaidConfigResponse[i];
        }
    }

    public UpdatePrepaidConfigResponse(@Nullable FaceRecognition faceRecognition, @Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, boolean z) {
        this.faceRecognition = faceRecognition;
        this.faceNotFoundCountBeforeManualAccept = faceNotFoundCountBeforeManualAccept;
        this.kYCRequireVerifyJC = z;
    }

    public static /* synthetic */ UpdatePrepaidConfigResponse copy$default(UpdatePrepaidConfigResponse updatePrepaidConfigResponse, FaceRecognition faceRecognition, FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            faceRecognition = updatePrepaidConfigResponse.faceRecognition;
        }
        if ((i & 2) != 0) {
            faceNotFoundCountBeforeManualAccept = updatePrepaidConfigResponse.faceNotFoundCountBeforeManualAccept;
        }
        if ((i & 4) != 0) {
            z = updatePrepaidConfigResponse.kYCRequireVerifyJC;
        }
        return updatePrepaidConfigResponse.copy(faceRecognition, faceNotFoundCountBeforeManualAccept, z);
    }

    @Nullable
    public final FaceRecognition component1() {
        return this.faceRecognition;
    }

    @Nullable
    public final FaceNotFoundCountBeforeManualAccept component2() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    public final boolean component3() {
        return this.kYCRequireVerifyJC;
    }

    @NotNull
    public final UpdatePrepaidConfigResponse copy(@Nullable FaceRecognition faceRecognition, @Nullable FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, boolean z) {
        return new UpdatePrepaidConfigResponse(faceRecognition, faceNotFoundCountBeforeManualAccept, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatePrepaidConfigResponse) {
            UpdatePrepaidConfigResponse updatePrepaidConfigResponse = (UpdatePrepaidConfigResponse) obj;
            return Intrinsics.areEqual(this.faceRecognition, updatePrepaidConfigResponse.faceRecognition) && Intrinsics.areEqual(this.faceNotFoundCountBeforeManualAccept, updatePrepaidConfigResponse.faceNotFoundCountBeforeManualAccept) && this.kYCRequireVerifyJC == updatePrepaidConfigResponse.kYCRequireVerifyJC;
        }
        return false;
    }

    @Nullable
    public final FaceNotFoundCountBeforeManualAccept getFaceNotFoundCountBeforeManualAccept() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    @Nullable
    public final FaceRecognition getFaceRecognition() {
        return this.faceRecognition;
    }

    public final boolean getKYCRequireVerifyJC() {
        return this.kYCRequireVerifyJC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        FaceRecognition faceRecognition = this.faceRecognition;
        int hashCode = (faceRecognition == null ? 0 : faceRecognition.hashCode()) * 31;
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = this.faceNotFoundCountBeforeManualAccept;
        int hashCode2 = (hashCode + (faceNotFoundCountBeforeManualAccept != null ? faceNotFoundCountBeforeManualAccept.hashCode() : 0)) * 31;
        boolean z = this.kYCRequireVerifyJC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        FaceRecognition faceRecognition = this.faceRecognition;
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = this.faceNotFoundCountBeforeManualAccept;
        boolean z = this.kYCRequireVerifyJC;
        return "UpdatePrepaidConfigResponse(faceRecognition=" + faceRecognition + ", faceNotFoundCountBeforeManualAccept=" + faceNotFoundCountBeforeManualAccept + ", kYCRequireVerifyJC=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.faceRecognition, i);
        parcel.writeParcelable(this.faceNotFoundCountBeforeManualAccept, i);
        parcel.writeInt(this.kYCRequireVerifyJC ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidConfigResponse(@NotNull Parcel parcel) {
        this((FaceRecognition) parcel.readParcelable(FaceRecognition.class.getClassLoader()), (FaceNotFoundCountBeforeManualAccept) parcel.readParcelable(FaceNotFoundCountBeforeManualAccept.class.getClassLoader()), parcel.readInt() == 1);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}