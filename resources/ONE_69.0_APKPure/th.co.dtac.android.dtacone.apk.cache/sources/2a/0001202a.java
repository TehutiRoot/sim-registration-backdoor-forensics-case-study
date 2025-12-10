package th.p047co.dtac.android.dtacone.model.prepaid.config;

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
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\r\"\u0004\b\u0014\u0010\u0015¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/config/PrepaidConfigResponse;", "Landroid/os/Parcelable;", "imageOptionals", "", "faceNotFoundCountBeforeManualAccept", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "faceRecognition", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "KYCRequireVerifyJC", "", "isWithDtacAtHome", "(ILth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;ZZ)V", "getKYCRequireVerifyJC", "()Z", "getFaceNotFoundCountBeforeManualAccept", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceNotFoundCountBeforeManualAccept;", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "getImageOptionals", "()I", "setWithDtacAtHome", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.config.PrepaidConfigResponse */
/* loaded from: classes8.dex */
public final class PrepaidConfigResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<PrepaidConfigResponse> CREATOR = new Creator();
    @SerializedName("KYCRequireVerifyJC")
    private final boolean KYCRequireVerifyJC;
    @SerializedName("faceNotFoundCountBeforeManualAccept")
    @NotNull
    private final FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept;
    @SerializedName("faceRecognition")
    @NotNull
    private final FaceRecognitionByPass faceRecognition;
    @SerializedName("imageOptionals")
    private final int imageOptionals;
    private transient boolean isWithDtacAtHome;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.config.PrepaidConfigResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PrepaidConfigResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrepaidConfigResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrepaidConfigResponse(parcel.readInt(), (FaceNotFoundCountBeforeManualAccept) parcel.readParcelable(PrepaidConfigResponse.class.getClassLoader()), (FaceRecognitionByPass) parcel.readParcelable(PrepaidConfigResponse.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrepaidConfigResponse[] newArray(int i) {
            return new PrepaidConfigResponse[i];
        }
    }

    public PrepaidConfigResponse(int i, @NotNull FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, @NotNull FaceRecognitionByPass faceRecognition, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(faceNotFoundCountBeforeManualAccept, "faceNotFoundCountBeforeManualAccept");
        Intrinsics.checkNotNullParameter(faceRecognition, "faceRecognition");
        this.imageOptionals = i;
        this.faceNotFoundCountBeforeManualAccept = faceNotFoundCountBeforeManualAccept;
        this.faceRecognition = faceRecognition;
        this.KYCRequireVerifyJC = z;
        this.isWithDtacAtHome = z2;
    }

    public static /* synthetic */ PrepaidConfigResponse copy$default(PrepaidConfigResponse prepaidConfigResponse, int i, FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, FaceRecognitionByPass faceRecognitionByPass, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = prepaidConfigResponse.imageOptionals;
        }
        if ((i2 & 2) != 0) {
            faceNotFoundCountBeforeManualAccept = prepaidConfigResponse.faceNotFoundCountBeforeManualAccept;
        }
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept2 = faceNotFoundCountBeforeManualAccept;
        if ((i2 & 4) != 0) {
            faceRecognitionByPass = prepaidConfigResponse.faceRecognition;
        }
        FaceRecognitionByPass faceRecognitionByPass2 = faceRecognitionByPass;
        if ((i2 & 8) != 0) {
            z = prepaidConfigResponse.KYCRequireVerifyJC;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = prepaidConfigResponse.isWithDtacAtHome;
        }
        return prepaidConfigResponse.copy(i, faceNotFoundCountBeforeManualAccept2, faceRecognitionByPass2, z3, z2);
    }

    public final int component1() {
        return this.imageOptionals;
    }

    @NotNull
    public final FaceNotFoundCountBeforeManualAccept component2() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    @NotNull
    public final FaceRecognitionByPass component3() {
        return this.faceRecognition;
    }

    public final boolean component4() {
        return this.KYCRequireVerifyJC;
    }

    public final boolean component5() {
        return this.isWithDtacAtHome;
    }

    @NotNull
    public final PrepaidConfigResponse copy(int i, @NotNull FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, @NotNull FaceRecognitionByPass faceRecognition, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(faceNotFoundCountBeforeManualAccept, "faceNotFoundCountBeforeManualAccept");
        Intrinsics.checkNotNullParameter(faceRecognition, "faceRecognition");
        return new PrepaidConfigResponse(i, faceNotFoundCountBeforeManualAccept, faceRecognition, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrepaidConfigResponse) {
            PrepaidConfigResponse prepaidConfigResponse = (PrepaidConfigResponse) obj;
            return this.imageOptionals == prepaidConfigResponse.imageOptionals && Intrinsics.areEqual(this.faceNotFoundCountBeforeManualAccept, prepaidConfigResponse.faceNotFoundCountBeforeManualAccept) && Intrinsics.areEqual(this.faceRecognition, prepaidConfigResponse.faceRecognition) && this.KYCRequireVerifyJC == prepaidConfigResponse.KYCRequireVerifyJC && this.isWithDtacAtHome == prepaidConfigResponse.isWithDtacAtHome;
        }
        return false;
    }

    @NotNull
    public final FaceNotFoundCountBeforeManualAccept getFaceNotFoundCountBeforeManualAccept() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    @NotNull
    public final FaceRecognitionByPass getFaceRecognition() {
        return this.faceRecognition;
    }

    public final int getImageOptionals() {
        return this.imageOptionals;
    }

    public final boolean getKYCRequireVerifyJC() {
        return this.KYCRequireVerifyJC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.imageOptionals * 31) + this.faceNotFoundCountBeforeManualAccept.hashCode()) * 31) + this.faceRecognition.hashCode()) * 31;
        boolean z = this.KYCRequireVerifyJC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isWithDtacAtHome;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isWithDtacAtHome() {
        return this.isWithDtacAtHome;
    }

    public final void setWithDtacAtHome(boolean z) {
        this.isWithDtacAtHome = z;
    }

    @NotNull
    public String toString() {
        int i = this.imageOptionals;
        FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = this.faceNotFoundCountBeforeManualAccept;
        FaceRecognitionByPass faceRecognitionByPass = this.faceRecognition;
        boolean z = this.KYCRequireVerifyJC;
        boolean z2 = this.isWithDtacAtHome;
        return "PrepaidConfigResponse(imageOptionals=" + i + ", faceNotFoundCountBeforeManualAccept=" + faceNotFoundCountBeforeManualAccept + ", faceRecognition=" + faceRecognitionByPass + ", KYCRequireVerifyJC=" + z + ", isWithDtacAtHome=" + z2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.imageOptionals);
        out.writeParcelable(this.faceNotFoundCountBeforeManualAccept, i);
        out.writeParcelable(this.faceRecognition, i);
        out.writeInt(this.KYCRequireVerifyJC ? 1 : 0);
        out.writeInt(this.isWithDtacAtHome ? 1 : 0);
    }

    public /* synthetic */ PrepaidConfigResponse(int i, FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, FaceRecognitionByPass faceRecognitionByPass, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, faceNotFoundCountBeforeManualAccept, faceRecognitionByPass, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }
}