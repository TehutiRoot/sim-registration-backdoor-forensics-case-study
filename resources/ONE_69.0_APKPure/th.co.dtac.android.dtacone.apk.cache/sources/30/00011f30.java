package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/FaceRecognition;", "", "knowYourCustomer", "", "confidence", "", "threshold", "nbtcStatusCode", "", "nbtcResponseMessage", "attempted", "", "laserId", "customerPhoto", "(ZDDLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAttempted", "()J", "setAttempted", "(J)V", "getConfidence", "()D", "setConfidence", "(D)V", "getCustomerPhoto", "()Ljava/lang/String;", "setCustomerPhoto", "(Ljava/lang/String;)V", "getKnowYourCustomer", "()Z", "setKnowYourCustomer", "(Z)V", "getLaserId", "setLaserId", "getNbtcResponseMessage", "setNbtcResponseMessage", "getNbtcStatusCode", "setNbtcStatusCode", "getThreshold", "setThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.registration.FaceRecognition */
/* loaded from: classes8.dex */
public final class FaceRecognition {
    public static final int $stable = 8;
    @SerializedName("attempted")
    private long attempted;
    @SerializedName("confidence")
    private double confidence;
    @SerializedName("customerPhoto")
    @NotNull
    private String customerPhoto;
    @SerializedName("knowYourCustomer")
    private boolean knowYourCustomer;
    @SerializedName("laserId")
    @NotNull
    private String laserId;
    @SerializedName("nbtcResponseMessage")
    @NotNull
    private String nbtcResponseMessage;
    @SerializedName("nbtcStatusCode")
    @NotNull
    private String nbtcStatusCode;
    @SerializedName("threshold")
    private double threshold;

    public FaceRecognition(boolean z, double d, double d2, @NotNull String nbtcStatusCode, @NotNull String nbtcResponseMessage, long j, @NotNull String laserId, @NotNull String customerPhoto) {
        Intrinsics.checkNotNullParameter(nbtcStatusCode, "nbtcStatusCode");
        Intrinsics.checkNotNullParameter(nbtcResponseMessage, "nbtcResponseMessage");
        Intrinsics.checkNotNullParameter(laserId, "laserId");
        Intrinsics.checkNotNullParameter(customerPhoto, "customerPhoto");
        this.knowYourCustomer = z;
        this.confidence = d;
        this.threshold = d2;
        this.nbtcStatusCode = nbtcStatusCode;
        this.nbtcResponseMessage = nbtcResponseMessage;
        this.attempted = j;
        this.laserId = laserId;
        this.customerPhoto = customerPhoto;
    }

    public final boolean component1() {
        return this.knowYourCustomer;
    }

    public final double component2() {
        return this.confidence;
    }

    public final double component3() {
        return this.threshold;
    }

    @NotNull
    public final String component4() {
        return this.nbtcStatusCode;
    }

    @NotNull
    public final String component5() {
        return this.nbtcResponseMessage;
    }

    public final long component6() {
        return this.attempted;
    }

    @NotNull
    public final String component7() {
        return this.laserId;
    }

    @NotNull
    public final String component8() {
        return this.customerPhoto;
    }

    @NotNull
    public final FaceRecognition copy(boolean z, double d, double d2, @NotNull String nbtcStatusCode, @NotNull String nbtcResponseMessage, long j, @NotNull String laserId, @NotNull String customerPhoto) {
        Intrinsics.checkNotNullParameter(nbtcStatusCode, "nbtcStatusCode");
        Intrinsics.checkNotNullParameter(nbtcResponseMessage, "nbtcResponseMessage");
        Intrinsics.checkNotNullParameter(laserId, "laserId");
        Intrinsics.checkNotNullParameter(customerPhoto, "customerPhoto");
        return new FaceRecognition(z, d, d2, nbtcStatusCode, nbtcResponseMessage, j, laserId, customerPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceRecognition) {
            FaceRecognition faceRecognition = (FaceRecognition) obj;
            return this.knowYourCustomer == faceRecognition.knowYourCustomer && Double.compare(this.confidence, faceRecognition.confidence) == 0 && Double.compare(this.threshold, faceRecognition.threshold) == 0 && Intrinsics.areEqual(this.nbtcStatusCode, faceRecognition.nbtcStatusCode) && Intrinsics.areEqual(this.nbtcResponseMessage, faceRecognition.nbtcResponseMessage) && this.attempted == faceRecognition.attempted && Intrinsics.areEqual(this.laserId, faceRecognition.laserId) && Intrinsics.areEqual(this.customerPhoto, faceRecognition.customerPhoto);
        }
        return false;
    }

    public final long getAttempted() {
        return this.attempted;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getCustomerPhoto() {
        return this.customerPhoto;
    }

    public final boolean getKnowYourCustomer() {
        return this.knowYourCustomer;
    }

    @NotNull
    public final String getLaserId() {
        return this.laserId;
    }

    @NotNull
    public final String getNbtcResponseMessage() {
        return this.nbtcResponseMessage;
    }

    @NotNull
    public final String getNbtcStatusCode() {
        return this.nbtcStatusCode;
    }

    public final double getThreshold() {
        return this.threshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.knowYourCustomer;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((r0 * 31) + Double.doubleToLongBits(this.confidence)) * 31) + Double.doubleToLongBits(this.threshold)) * 31) + this.nbtcStatusCode.hashCode()) * 31) + this.nbtcResponseMessage.hashCode()) * 31) + AbstractC17631Fh1.m68395a(this.attempted)) * 31) + this.laserId.hashCode()) * 31) + this.customerPhoto.hashCode();
    }

    public final void setAttempted(long j) {
        this.attempted = j;
    }

    public final void setConfidence(double d) {
        this.confidence = d;
    }

    public final void setCustomerPhoto(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerPhoto = str;
    }

    public final void setKnowYourCustomer(boolean z) {
        this.knowYourCustomer = z;
    }

    public final void setLaserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.laserId = str;
    }

    public final void setNbtcResponseMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nbtcResponseMessage = str;
    }

    public final void setNbtcStatusCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nbtcStatusCode = str;
    }

    public final void setThreshold(double d) {
        this.threshold = d;
    }

    @NotNull
    public String toString() {
        boolean z = this.knowYourCustomer;
        double d = this.confidence;
        double d2 = this.threshold;
        String str = this.nbtcStatusCode;
        String str2 = this.nbtcResponseMessage;
        long j = this.attempted;
        String str3 = this.laserId;
        String str4 = this.customerPhoto;
        return "FaceRecognition(knowYourCustomer=" + z + ", confidence=" + d + ", threshold=" + d2 + ", nbtcStatusCode=" + str + ", nbtcResponseMessage=" + str2 + ", attempted=" + j + ", laserId=" + str3 + ", customerPhoto=" + str4 + ")";
    }
}