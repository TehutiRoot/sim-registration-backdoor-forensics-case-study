package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;", "Landroid/os/Parcelable;", "idCardCounter", "", "customerPhotoCounter", "(II)V", "getCustomerPhotoCounter", "()I", "getIdCardCounter", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.FaceDetectionConfig */
/* loaded from: classes8.dex */
public final class FaceDetectionConfig implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<FaceDetectionConfig> CREATOR = new Creator();
    @SerializedName("customerPhoto")
    private final int customerPhotoCounter;
    @SerializedName("idCard")
    private final int idCardCounter;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.FaceDetectionConfig$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<FaceDetectionConfig> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceDetectionConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceDetectionConfig(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceDetectionConfig[] newArray(int i) {
            return new FaceDetectionConfig[i];
        }
    }

    public FaceDetectionConfig(int i, int i2) {
        this.idCardCounter = i;
        this.customerPhotoCounter = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCustomerPhotoCounter() {
        return this.customerPhotoCounter;
    }

    public final int getIdCardCounter() {
        return this.idCardCounter;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.idCardCounter);
        out.writeInt(this.customerPhotoCounter);
    }
}