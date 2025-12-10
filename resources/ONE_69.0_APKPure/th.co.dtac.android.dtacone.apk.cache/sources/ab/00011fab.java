package th.p047co.dtac.android.dtacone.model.p2post.config;

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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/config/FaceRecognition;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "byPass", "", "attemptedCountBeforeKnowYourCustomer", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAttemptedCountBeforeKnowYourCustomer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getByPass", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/p2post/config/FaceRecognition;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.config.FaceRecognition */
/* loaded from: classes8.dex */
public final class FaceRecognition implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("attemptedCountBeforeKnowYourCustomer")
    @Nullable
    private final Integer attemptedCountBeforeKnowYourCustomer;
    @SerializedName("byPass")
    @Nullable
    private final Boolean byPass;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/config/FaceRecognition$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/p2post/config/FaceRecognition;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/p2post/config/FaceRecognition;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.config.FaceRecognition$CREATOR */
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

    public FaceRecognition() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FaceRecognition copy$default(FaceRecognition faceRecognition, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = faceRecognition.byPass;
        }
        if ((i & 2) != 0) {
            num = faceRecognition.attemptedCountBeforeKnowYourCustomer;
        }
        return faceRecognition.copy(bool, num);
    }

    @Nullable
    public final Boolean component1() {
        return this.byPass;
    }

    @Nullable
    public final Integer component2() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    @NotNull
    public final FaceRecognition copy(@Nullable Boolean bool, @Nullable Integer num) {
        return new FaceRecognition(bool, num);
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
            return Intrinsics.areEqual(this.byPass, faceRecognition.byPass) && Intrinsics.areEqual(this.attemptedCountBeforeKnowYourCustomer, faceRecognition.attemptedCountBeforeKnowYourCustomer);
        }
        return false;
    }

    @Nullable
    public final Integer getAttemptedCountBeforeKnowYourCustomer() {
        return this.attemptedCountBeforeKnowYourCustomer;
    }

    @Nullable
    public final Boolean getByPass() {
        return this.byPass;
    }

    public int hashCode() {
        Boolean bool = this.byPass;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.attemptedCountBeforeKnowYourCustomer;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.byPass;
        Integer num = this.attemptedCountBeforeKnowYourCustomer;
        return "FaceRecognition(byPass=" + bool + ", attemptedCountBeforeKnowYourCustomer=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.byPass);
        parcel.writeValue(this.attemptedCountBeforeKnowYourCustomer);
    }

    public FaceRecognition(@Nullable Boolean bool, @Nullable Integer num) {
        this.byPass = bool;
        this.attemptedCountBeforeKnowYourCustomer = num;
    }

    public /* synthetic */ FaceRecognition(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FaceRecognition(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r4.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L18
        L17:
            r0 = r2
        L18:
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r4 = r4.readValue(r1)
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L29
            r2 = r4
            java.lang.Integer r2 = (java.lang.Integer) r2
        L29:
            r3.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.p2post.config.FaceRecognition.<init>(android.os.Parcel):void");
    }
}