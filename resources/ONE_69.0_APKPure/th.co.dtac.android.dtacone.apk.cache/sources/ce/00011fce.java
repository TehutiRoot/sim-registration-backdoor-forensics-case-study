package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;", "Landroid/os/Parcelable;", "byPass", "", "attemptedCountBeforeKnowYourCustomer", "", "(ZLjava/lang/Integer;)V", "getAttemptedCountBeforeKnowYourCustomer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getByPass", "()Z", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.FaceRecognitionConfig */
/* loaded from: classes8.dex */
public final class FaceRecognitionConfig implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<FaceRecognitionConfig> CREATOR = new Creator();
    @SerializedName("attemptedCountBeforeKnowYourCustomer")
    @Nullable
    private final Integer attemptedCountBeforeKnowYourCustomer;
    @SerializedName("byPass")
    private final boolean byPass;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.FaceRecognitionConfig$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<FaceRecognitionConfig> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceRecognitionConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceRecognitionConfig(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceRecognitionConfig[] newArray(int i) {
            return new FaceRecognitionConfig[i];
        }
    }

    public FaceRecognitionConfig(boolean z, @Nullable Integer num) {
        this.byPass = z;
        this.attemptedCountBeforeKnowYourCustomer = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Integer getAttemptedCountBeforeKnowYourCustomer() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    public final boolean getByPass() {
        return this.byPass;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.byPass ? 1 : 0);
        Integer num = this.attemptedCountBeforeKnowYourCustomer;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }
}