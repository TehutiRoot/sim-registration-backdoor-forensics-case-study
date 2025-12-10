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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/config/FaceNotFoundCountBeforeManualAccept;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "idCard", "", "customerPhoto", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCustomerPhoto", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdCard", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/p2post/config/FaceNotFoundCountBeforeManualAccept;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.config.FaceNotFoundCountBeforeManualAccept */
/* loaded from: classes8.dex */
public final class FaceNotFoundCountBeforeManualAccept implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("customerPhoto")
    @Nullable
    private final Integer customerPhoto;
    @SerializedName("idCard")
    @Nullable
    private final Integer idCard;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/config/FaceNotFoundCountBeforeManualAccept$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/p2post/config/FaceNotFoundCountBeforeManualAccept;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/p2post/config/FaceNotFoundCountBeforeManualAccept;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.config.FaceNotFoundCountBeforeManualAccept$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<FaceNotFoundCountBeforeManualAccept> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceNotFoundCountBeforeManualAccept createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceNotFoundCountBeforeManualAccept(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceNotFoundCountBeforeManualAccept[] newArray(int i) {
            return new FaceNotFoundCountBeforeManualAccept[i];
        }
    }

    public FaceNotFoundCountBeforeManualAccept() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FaceNotFoundCountBeforeManualAccept copy$default(FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = faceNotFoundCountBeforeManualAccept.idCard;
        }
        if ((i & 2) != 0) {
            num2 = faceNotFoundCountBeforeManualAccept.customerPhoto;
        }
        return faceNotFoundCountBeforeManualAccept.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.idCard;
    }

    @Nullable
    public final Integer component2() {
        return this.customerPhoto;
    }

    @NotNull
    public final FaceNotFoundCountBeforeManualAccept copy(@Nullable Integer num, @Nullable Integer num2) {
        return new FaceNotFoundCountBeforeManualAccept(num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceNotFoundCountBeforeManualAccept) {
            FaceNotFoundCountBeforeManualAccept faceNotFoundCountBeforeManualAccept = (FaceNotFoundCountBeforeManualAccept) obj;
            return Intrinsics.areEqual(this.idCard, faceNotFoundCountBeforeManualAccept.idCard) && Intrinsics.areEqual(this.customerPhoto, faceNotFoundCountBeforeManualAccept.customerPhoto);
        }
        return false;
    }

    @Nullable
    public final Integer getCustomerPhoto() {
        return this.customerPhoto;
    }

    @Nullable
    public final Integer getIdCard() {
        return this.idCard;
    }

    public int hashCode() {
        Integer num = this.idCard;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.customerPhoto;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.idCard;
        Integer num2 = this.customerPhoto;
        return "FaceNotFoundCountBeforeManualAccept(idCard=" + num + ", customerPhoto=" + num2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.idCard);
        parcel.writeValue(this.customerPhoto);
    }

    public FaceNotFoundCountBeforeManualAccept(@Nullable Integer num, @Nullable Integer num2) {
        this.idCard = num;
        this.customerPhoto = num2;
    }

    public /* synthetic */ FaceNotFoundCountBeforeManualAccept(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FaceNotFoundCountBeforeManualAccept(@org.jetbrains.annotations.NotNull android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r5.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L17
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L18
        L17:
            r1 = r3
        L18:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r5 = r5.readValue(r0)
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            r3 = r5
            java.lang.Integer r3 = (java.lang.Integer) r3
        L27:
            r4.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.p2post.config.FaceNotFoundCountBeforeManualAccept.<init>(android.os.Parcel):void");
    }
}