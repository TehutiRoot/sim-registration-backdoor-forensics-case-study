package th.p047co.dtac.android.dtacone.model.prepaid.config;

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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "byPass", "", "attemptedCountBeforeKnowYourCustomer", "", "(ZI)V", "getAttemptedCountBeforeKnowYourCustomer", "()I", "getByPass", "()Z", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass */
/* loaded from: classes8.dex */
public final class FaceRecognitionByPass implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("attemptedCountBeforeKnowYourCustomer")
    private final int attemptedCountBeforeKnowYourCustomer;
    @SerializedName("byPass")
    private final boolean byPass;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/prepaid/config/FaceRecognitionByPass;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<FaceRecognitionByPass> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceRecognitionByPass createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceRecognitionByPass(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceRecognitionByPass[] newArray(int i) {
            return new FaceRecognitionByPass[i];
        }
    }

    public FaceRecognitionByPass(boolean z, int i) {
        this.byPass = z;
        this.attemptedCountBeforeKnowYourCustomer = i;
    }

    public static /* synthetic */ FaceRecognitionByPass copy$default(FaceRecognitionByPass faceRecognitionByPass, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = faceRecognitionByPass.byPass;
        }
        if ((i2 & 2) != 0) {
            i = faceRecognitionByPass.attemptedCountBeforeKnowYourCustomer;
        }
        return faceRecognitionByPass.copy(z, i);
    }

    public final boolean component1() {
        return this.byPass;
    }

    public final int component2() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    @NotNull
    public final FaceRecognitionByPass copy(boolean z, int i) {
        return new FaceRecognitionByPass(z, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceRecognitionByPass) {
            FaceRecognitionByPass faceRecognitionByPass = (FaceRecognitionByPass) obj;
            return this.byPass == faceRecognitionByPass.byPass && this.attemptedCountBeforeKnowYourCustomer == faceRecognitionByPass.attemptedCountBeforeKnowYourCustomer;
        }
        return false;
    }

    public final int getAttemptedCountBeforeKnowYourCustomer() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    public final boolean getByPass() {
        return this.byPass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.byPass;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.attemptedCountBeforeKnowYourCustomer;
    }

    @NotNull
    public String toString() {
        boolean z = this.byPass;
        int i = this.attemptedCountBeforeKnowYourCustomer;
        return "FaceRecognitionByPass(byPass=" + z + ", attemptedCountBeforeKnowYourCustomer=" + i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.byPass ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.attemptedCountBeforeKnowYourCustomer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionByPass(@NotNull Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}