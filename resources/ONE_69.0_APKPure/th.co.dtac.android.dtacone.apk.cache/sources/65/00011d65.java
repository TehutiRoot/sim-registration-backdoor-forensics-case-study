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
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B]\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0013J\b\u0010'\u001a\u00020\u0010H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0010H\u0016R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "confidence", "", "threshold", "knowYourCustomer", "", "knowYourCustomerError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "nbtcStatusCode", "", "nbtcResponseMessage", "attempted", "", "laseId", "customerPhoto", "(FFZLth/co/dtac/android/dtacone/model/error/ErrorCollection;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAttempted", "()I", "setAttempted", "(I)V", "getConfidence", "()F", "getCustomerPhoto", "()Ljava/lang/String;", "setCustomerPhoto", "(Ljava/lang/String;)V", "getKnowYourCustomer", "()Z", "getKnowYourCustomerError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "getLaseId", "setLaseId", "getNbtcResponseMessage", "getNbtcStatusCode", "getThreshold", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimFaceRecognitionInfo */
/* loaded from: classes8.dex */
public final class ChangeSimFaceRecognitionInfo implements Parcelable {
    @SerializedName("attempted")
    private int attempted;
    @SerializedName("confidence")
    private final float confidence;
    @SerializedName("customerPhoto")
    @Nullable
    private String customerPhoto;
    @SerializedName("knowYourCustomer")
    private final boolean knowYourCustomer;
    @SerializedName("knowYourCustomerError")
    @Nullable
    private final ErrorCollection knowYourCustomerError;
    @SerializedName("laserId")
    @Nullable
    private String laseId;
    @SerializedName("nbtcResponseMessage")
    @Nullable
    private final String nbtcResponseMessage;
    @SerializedName("nbtcStatusCode")
    @Nullable
    private final String nbtcStatusCode;
    @SerializedName("threshold")
    private final float threshold;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimFaceRecognitionInfo;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimFaceRecognitionInfo$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ChangeSimFaceRecognitionInfo> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimFaceRecognitionInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeSimFaceRecognitionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChangeSimFaceRecognitionInfo[] newArray(int i) {
            return new ChangeSimFaceRecognitionInfo[i];
        }
    }

    public ChangeSimFaceRecognitionInfo(float f, float f2, boolean z, @Nullable ErrorCollection errorCollection, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4) {
        this.confidence = f;
        this.threshold = f2;
        this.knowYourCustomer = z;
        this.knowYourCustomerError = errorCollection;
        this.nbtcStatusCode = str;
        this.nbtcResponseMessage = str2;
        this.attempted = i;
        this.laseId = str3;
        this.customerPhoto = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAttempted() {
        return this.attempted;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getCustomerPhoto() {
        return this.customerPhoto;
    }

    public final boolean getKnowYourCustomer() {
        return this.knowYourCustomer;
    }

    @Nullable
    public final ErrorCollection getKnowYourCustomerError() {
        return this.knowYourCustomerError;
    }

    @Nullable
    public final String getLaseId() {
        return this.laseId;
    }

    @Nullable
    public final String getNbtcResponseMessage() {
        return this.nbtcResponseMessage;
    }

    @Nullable
    public final String getNbtcStatusCode() {
        return this.nbtcStatusCode;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final void setAttempted(int i) {
        this.attempted = i;
    }

    public final void setCustomerPhoto(@Nullable String str) {
        this.customerPhoto = str;
    }

    public final void setLaseId(@Nullable String str) {
        this.laseId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeFloat(this.confidence);
        parcel.writeFloat(this.threshold);
        parcel.writeByte(this.knowYourCustomer ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.knowYourCustomerError, i);
        parcel.writeString(this.nbtcStatusCode);
        parcel.writeString(this.nbtcResponseMessage);
        parcel.writeInt(this.attempted);
        parcel.writeString(this.laseId);
        parcel.writeString(this.customerPhoto);
    }

    public /* synthetic */ ChangeSimFaceRecognitionInfo(float f, float f2, boolean z, ErrorCollection errorCollection, String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z, errorCollection, str, str2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeSimFaceRecognitionInfo(@NotNull Parcel parcel) {
        this(parcel.readFloat(), parcel.readFloat(), parcel.readByte() != 0, (ErrorCollection) parcel.readParcelable(ErrorCollection.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}