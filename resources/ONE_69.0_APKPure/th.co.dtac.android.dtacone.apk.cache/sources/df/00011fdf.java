package th.p047co.dtac.android.dtacone.model.postpaid;

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
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BU\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\b\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\fH\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PostpaidFaceRecognition;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "confidence", "", "threshold", "nbtcStatusCode", "", "nbtcResponseMessage", "attempted", "", "customerPhoto", "knowYourCustomer", "", "laseId", "(FFLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getAttempted", "()I", "getConfidence", "()F", "getCustomerPhoto", "()Ljava/lang/String;", "getKnowYourCustomer", "()Z", "getLaseId", "getNbtcResponseMessage", "getNbtcStatusCode", "getThreshold", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidFaceRecognition */
/* loaded from: classes8.dex */
public final class PostpaidFaceRecognition implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("attempted")
    private final int attempted;
    @SerializedName("confidence")
    private final float confidence;
    @SerializedName("customerPhoto")
    @Nullable
    private final String customerPhoto;
    @SerializedName("knowYourCustomer")
    private final boolean knowYourCustomer;
    @SerializedName("laserId")
    @Nullable
    private final String laseId;
    @SerializedName("nbtcResponseMessage")
    @Nullable
    private final String nbtcResponseMessage;
    @SerializedName("nbtcStatusCode")
    @Nullable
    private final String nbtcStatusCode;
    @SerializedName("threshold")
    private final float threshold;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PostpaidFaceRecognition$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidFaceRecognition;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/postpaid/PostpaidFaceRecognition;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidFaceRecognition$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PostpaidFaceRecognition> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidFaceRecognition createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostpaidFaceRecognition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PostpaidFaceRecognition[] newArray(int i) {
            return new PostpaidFaceRecognition[i];
        }
    }

    public PostpaidFaceRecognition(float f, float f2, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, boolean z, @Nullable String str4) {
        this.confidence = f;
        this.threshold = f2;
        this.nbtcStatusCode = str;
        this.nbtcResponseMessage = str2;
        this.attempted = i;
        this.customerPhoto = str3;
        this.knowYourCustomer = z;
        this.laseId = str4;
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

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeFloat(this.confidence);
        parcel.writeFloat(this.threshold);
        parcel.writeString(this.nbtcStatusCode);
        parcel.writeString(this.nbtcResponseMessage);
        parcel.writeInt(this.attempted);
        parcel.writeString(this.customerPhoto);
        parcel.writeByte(this.knowYourCustomer ? (byte) 1 : (byte) 0);
        parcel.writeString(this.laseId);
    }

    public /* synthetic */ PostpaidFaceRecognition(float f, float f2, String str, String str2, int i, String str3, boolean z, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, str3, z, (i2 & 128) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostpaidFaceRecognition(@NotNull Parcel parcel) {
        this(parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readByte() != 0, parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}