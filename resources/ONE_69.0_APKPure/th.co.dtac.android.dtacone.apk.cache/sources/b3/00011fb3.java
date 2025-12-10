package th.p047co.dtac.android.dtacone.model.p2post.submit.omr.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0017Jj\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\tHÖ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\tHÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;", "Landroid/os/Parcelable;", "nbtcStatusCode", "", "customerPhoto", "confidence", "", "threshold", "attempted", "", "laserId", "nbtcResponseMessage", "knowYourCustomer", "", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAttempted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfidence", "()F", "getCustomerPhoto", "()Ljava/lang/String;", "getKnowYourCustomer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaserId", "getNbtcResponseMessage", "getNbtcStatusCode", "getThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.FaceRecognition */
/* loaded from: classes8.dex */
public final class FaceRecognition implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<FaceRecognition> CREATOR = new Creator();
    @SerializedName("attempted")
    @Nullable
    private final Integer attempted;
    @SerializedName("confidence")
    private final float confidence;
    @SerializedName("customerPhoto")
    @Nullable
    private final String customerPhoto;
    @SerializedName("knowYourCustomer")
    @Nullable
    private final Boolean knowYourCustomer;
    @SerializedName("laserId")
    @Nullable
    private final String laserId;
    @SerializedName("nbtcResponseMessage")
    @Nullable
    private final String nbtcResponseMessage;
    @SerializedName("nbtcStatusCode")
    @Nullable
    private final String nbtcStatusCode;
    @SerializedName("threshold")
    private final float threshold;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.FaceRecognition$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<FaceRecognition> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceRecognition createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FaceRecognition(readString, readString2, readFloat, readFloat2, valueOf2, readString3, readString4, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FaceRecognition[] newArray(int i) {
            return new FaceRecognition[i];
        }
    }

    public FaceRecognition(@Nullable String str, @Nullable String str2, float f, float f2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        this.nbtcStatusCode = str;
        this.customerPhoto = str2;
        this.confidence = f;
        this.threshold = f2;
        this.attempted = num;
        this.laserId = str3;
        this.nbtcResponseMessage = str4;
        this.knowYourCustomer = bool;
    }

    @Nullable
    public final String component1() {
        return this.nbtcStatusCode;
    }

    @Nullable
    public final String component2() {
        return this.customerPhoto;
    }

    public final float component3() {
        return this.confidence;
    }

    public final float component4() {
        return this.threshold;
    }

    @Nullable
    public final Integer component5() {
        return this.attempted;
    }

    @Nullable
    public final String component6() {
        return this.laserId;
    }

    @Nullable
    public final String component7() {
        return this.nbtcResponseMessage;
    }

    @Nullable
    public final Boolean component8() {
        return this.knowYourCustomer;
    }

    @NotNull
    public final FaceRecognition copy(@Nullable String str, @Nullable String str2, float f, float f2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        return new FaceRecognition(str, str2, f, f2, num, str3, str4, bool);
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
            return Intrinsics.areEqual(this.nbtcStatusCode, faceRecognition.nbtcStatusCode) && Intrinsics.areEqual(this.customerPhoto, faceRecognition.customerPhoto) && Float.compare(this.confidence, faceRecognition.confidence) == 0 && Float.compare(this.threshold, faceRecognition.threshold) == 0 && Intrinsics.areEqual(this.attempted, faceRecognition.attempted) && Intrinsics.areEqual(this.laserId, faceRecognition.laserId) && Intrinsics.areEqual(this.nbtcResponseMessage, faceRecognition.nbtcResponseMessage) && Intrinsics.areEqual(this.knowYourCustomer, faceRecognition.knowYourCustomer);
        }
        return false;
    }

    @Nullable
    public final Integer getAttempted() {
        return this.attempted;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getCustomerPhoto() {
        return this.customerPhoto;
    }

    @Nullable
    public final Boolean getKnowYourCustomer() {
        return this.knowYourCustomer;
    }

    @Nullable
    public final String getLaserId() {
        return this.laserId;
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

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.nbtcStatusCode;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.customerPhoto;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int floatToIntBits = (((((i2 + hashCode2) * 31) + Float.floatToIntBits(this.confidence)) * 31) + Float.floatToIntBits(this.threshold)) * 31;
        Integer num = this.attempted;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i3 = (floatToIntBits + hashCode3) * 31;
        String str3 = this.laserId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str4 = this.nbtcResponseMessage;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Boolean bool = this.knowYourCustomer;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public String toString() {
        String str = this.nbtcStatusCode;
        String str2 = this.customerPhoto;
        float f = this.confidence;
        float f2 = this.threshold;
        Integer num = this.attempted;
        String str3 = this.laserId;
        String str4 = this.nbtcResponseMessage;
        Boolean bool = this.knowYourCustomer;
        return "FaceRecognition(nbtcStatusCode=" + str + ", customerPhoto=" + str2 + ", confidence=" + f + ", threshold=" + f2 + ", attempted=" + num + ", laserId=" + str3 + ", nbtcResponseMessage=" + str4 + ", knowYourCustomer=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.nbtcStatusCode);
        out.writeString(this.customerPhoto);
        out.writeFloat(this.confidence);
        out.writeFloat(this.threshold);
        Integer num = this.attempted;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.laserId);
        out.writeString(this.nbtcResponseMessage);
        Boolean bool = this.knowYourCustomer;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ FaceRecognition(String str, String str2, float f, float f2, Integer num, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, f, f2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : bool);
    }
}