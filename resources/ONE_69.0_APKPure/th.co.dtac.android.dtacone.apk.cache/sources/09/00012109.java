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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "byPass", "", "attemptedCountBeforeKnowYourCustomer", "", "(ZLjava/lang/Integer;)V", "getAttemptedCountBeforeKnowYourCustomer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getByPass", "()Z", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.config.FaceRecognition */
/* loaded from: classes8.dex */
public final class FaceRecognition implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("attemptedCountBeforeKnowYourCustomer")
    @Nullable
    private final Integer attemptedCountBeforeKnowYourCustomer;
    @SerializedName("byPass")
    private final boolean byPass;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/updateprepaid/config/FaceRecognition;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.config.FaceRecognition$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<FaceRecognition> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceRecognition createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceRecognition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceRecognition[] newArray(int i) {
            return new FaceRecognition[i];
        }
    }

    public FaceRecognition(boolean z, @Nullable Integer num) {
        this.byPass = z;
        this.attemptedCountBeforeKnowYourCustomer = num;
    }

    public static /* synthetic */ FaceRecognition copy$default(FaceRecognition faceRecognition, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = faceRecognition.byPass;
        }
        if ((i & 2) != 0) {
            num = faceRecognition.attemptedCountBeforeKnowYourCustomer;
        }
        return faceRecognition.copy(z, num);
    }

    public final boolean component1() {
        return this.byPass;
    }

    @Nullable
    public final Integer component2() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    @NotNull
    public final FaceRecognition copy(boolean z, @Nullable Integer num) {
        return new FaceRecognition(z, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceRecognition) {
            FaceRecognition faceRecognition = (FaceRecognition) obj;
            return this.byPass == faceRecognition.byPass && Intrinsics.areEqual(this.attemptedCountBeforeKnowYourCustomer, faceRecognition.attemptedCountBeforeKnowYourCustomer);
        }
        return false;
    }

    @Nullable
    public final Integer getAttemptedCountBeforeKnowYourCustomer() {
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
        int i = r0 * 31;
        Integer num = this.attemptedCountBeforeKnowYourCustomer;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z = this.byPass;
        Integer num = this.attemptedCountBeforeKnowYourCustomer;
        return "FaceRecognition(byPass=" + z + ", attemptedCountBeforeKnowYourCustomer=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.byPass ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.attemptedCountBeforeKnowYourCustomer);
    }

    public /* synthetic */ FaceRecognition(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FaceRecognition(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte r0 = r3.readByte()
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r3 = r3.readValue(r1)
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto L1f
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L20
        L1f:
            r3 = 0
        L20:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.updateprepaid.config.FaceRecognition.<init>(android.os.Parcel):void");
    }
}