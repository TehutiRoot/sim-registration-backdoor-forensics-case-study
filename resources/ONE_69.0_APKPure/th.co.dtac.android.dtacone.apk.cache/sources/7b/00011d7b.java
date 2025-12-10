package th.p047co.dtac.android.dtacone.model.change_sim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001bH\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifySimV2;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "transactionId", "", "mrtrConsentId", "identityPhotoName", "faceRecognition", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;", "changeSim", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;", "simCard", "Lth/co/dtac/android/dtacone/model/change_sim/SimCardInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;Lth/co/dtac/android/dtacone/model/change_sim/SimCardInfo;)V", "getChangeSim", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimInfo;", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;", "getIdentityPhotoName", "()Ljava/lang/String;", "getMrtrConsentId", "getSimCard", "()Lth/co/dtac/android/dtacone/model/change_sim/SimCardInfo;", "getTransactionId", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifySimV2 */
/* loaded from: classes8.dex */
public final class ChangeSimRequestVerifySimV2 implements Parcelable {
    @SerializedName("changeSim")
    @Nullable
    private final ChangeSimInfo changeSim;
    @SerializedName("faceRecognition")
    @Nullable
    private final ChangeSimFaceRecognitionInfo faceRecognition;
    @SerializedName("identityPhotoName")
    @Nullable
    private final String identityPhotoName;
    @SerializedName("mrtrConsentId")
    @Nullable
    private final String mrtrConsentId;
    @SerializedName("simCard")
    @Nullable
    private final SimCardInfo simCard;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifySimV2$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifySimV2;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifySimV2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifySimV2$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ChangeSimRequestVerifySimV2> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimRequestVerifySimV2 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeSimRequestVerifySimV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimRequestVerifySimV2[] newArray(int i) {
            return new ChangeSimRequestVerifySimV2[i];
        }
    }

    public ChangeSimRequestVerifySimV2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ChangeSimFaceRecognitionInfo changeSimFaceRecognitionInfo, @Nullable ChangeSimInfo changeSimInfo, @Nullable SimCardInfo simCardInfo) {
        this.transactionId = str;
        this.mrtrConsentId = str2;
        this.identityPhotoName = str3;
        this.faceRecognition = changeSimFaceRecognitionInfo;
        this.changeSim = changeSimInfo;
        this.simCard = simCardInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final ChangeSimInfo getChangeSim() {
        return this.changeSim;
    }

    @Nullable
    public final ChangeSimFaceRecognitionInfo getFaceRecognition() {
        return this.faceRecognition;
    }

    @Nullable
    public final String getIdentityPhotoName() {
        return this.identityPhotoName;
    }

    @Nullable
    public final String getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final SimCardInfo getSimCard() {
        return this.simCard;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.transactionId);
        parcel.writeString(this.mrtrConsentId);
        parcel.writeString(this.identityPhotoName);
        parcel.writeParcelable(this.faceRecognition, i);
        parcel.writeParcelable(this.changeSim, i);
        parcel.writeParcelable(this.simCard, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimRequestVerifySimV2(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), (ChangeSimFaceRecognitionInfo) parcel.readParcelable(FaceCompareResponse.class.getClassLoader()), (ChangeSimInfo) parcel.readParcelable(ChangeSimInfo.class.getClassLoader()), (SimCardInfo) parcel.readParcelable(SimCardInfo.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}