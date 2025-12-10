package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.postpaid.FaceDetectionConfig;
import th.p047co.dtac.android.dtacone.model.postpaid.FaceRecognitionConfig;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\nHÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0017H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "faceRecognition", "Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;", "faceNotFoundCountBeforeManualAccept", "Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;", "kYCRequireVerifyJC", "", "(Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;Z)V", "getFaceNotFoundCountBeforeManualAccept", "()Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;", "getKYCRequireVerifyJC", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimConfig */
/* loaded from: classes8.dex */
public final class ChangeSimConfig implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("faceNotFoundCountBeforeManualAccept")
    @Nullable
    private final FaceDetectionConfig faceNotFoundCountBeforeManualAccept;
    @SerializedName("faceRecognition")
    @Nullable
    private final FaceRecognitionConfig faceRecognition;
    @SerializedName("KYCRequireVerifyJC")
    private final boolean kYCRequireVerifyJC;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<ChangeSimConfig> CREATOR = new Parcelable.Creator<ChangeSimConfig>() { // from class: th.co.dtac.android.dtacone.model.change_sim.ChangeSimConfig$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimConfig createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ChangeSimConfig(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimConfig[] newArray(int i) {
            return new ChangeSimConfig[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimConfig$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChangeSimConfig(@Nullable FaceRecognitionConfig faceRecognitionConfig, @Nullable FaceDetectionConfig faceDetectionConfig, boolean z) {
        this.faceRecognition = faceRecognitionConfig;
        this.faceNotFoundCountBeforeManualAccept = faceDetectionConfig;
        this.kYCRequireVerifyJC = z;
    }

    public static /* synthetic */ ChangeSimConfig copy$default(ChangeSimConfig changeSimConfig, FaceRecognitionConfig faceRecognitionConfig, FaceDetectionConfig faceDetectionConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            faceRecognitionConfig = changeSimConfig.faceRecognition;
        }
        if ((i & 2) != 0) {
            faceDetectionConfig = changeSimConfig.faceNotFoundCountBeforeManualAccept;
        }
        if ((i & 4) != 0) {
            z = changeSimConfig.kYCRequireVerifyJC;
        }
        return changeSimConfig.copy(faceRecognitionConfig, faceDetectionConfig, z);
    }

    @Nullable
    public final FaceRecognitionConfig component1() {
        return this.faceRecognition;
    }

    @Nullable
    public final FaceDetectionConfig component2() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    public final boolean component3() {
        return this.kYCRequireVerifyJC;
    }

    @NotNull
    public final ChangeSimConfig copy(@Nullable FaceRecognitionConfig faceRecognitionConfig, @Nullable FaceDetectionConfig faceDetectionConfig, boolean z) {
        return new ChangeSimConfig(faceRecognitionConfig, faceDetectionConfig, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeSimConfig) {
            ChangeSimConfig changeSimConfig = (ChangeSimConfig) obj;
            return Intrinsics.areEqual(this.faceRecognition, changeSimConfig.faceRecognition) && Intrinsics.areEqual(this.faceNotFoundCountBeforeManualAccept, changeSimConfig.faceNotFoundCountBeforeManualAccept) && this.kYCRequireVerifyJC == changeSimConfig.kYCRequireVerifyJC;
        }
        return false;
    }

    @Nullable
    public final FaceDetectionConfig getFaceNotFoundCountBeforeManualAccept() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    @Nullable
    public final FaceRecognitionConfig getFaceRecognition() {
        return this.faceRecognition;
    }

    public final boolean getKYCRequireVerifyJC() {
        return this.kYCRequireVerifyJC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        FaceRecognitionConfig faceRecognitionConfig = this.faceRecognition;
        int hashCode = (faceRecognitionConfig == null ? 0 : faceRecognitionConfig.hashCode()) * 31;
        FaceDetectionConfig faceDetectionConfig = this.faceNotFoundCountBeforeManualAccept;
        int hashCode2 = (hashCode + (faceDetectionConfig != null ? faceDetectionConfig.hashCode() : 0)) * 31;
        boolean z = this.kYCRequireVerifyJC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        FaceRecognitionConfig faceRecognitionConfig = this.faceRecognition;
        FaceDetectionConfig faceDetectionConfig = this.faceNotFoundCountBeforeManualAccept;
        boolean z = this.kYCRequireVerifyJC;
        return "ChangeSimConfig(faceRecognition=" + faceRecognitionConfig + ", faceNotFoundCountBeforeManualAccept=" + faceDetectionConfig + ", kYCRequireVerifyJC=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.faceRecognition, 0);
        dest.writeParcelable(this.faceNotFoundCountBeforeManualAccept, 0);
        dest.writeInt(this.kYCRequireVerifyJC ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimConfig(@NotNull Parcel source) {
        this((FaceRecognitionConfig) source.readParcelable(FaceRecognitionConfig.class.getClassLoader()), (FaceDetectionConfig) source.readParcelable(FaceDetectionConfig.class.getClassLoader()), source.readInt() == 1);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}