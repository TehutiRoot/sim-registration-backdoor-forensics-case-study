package th.p047co.dtac.android.dtacone.model.mrtr_change_sim.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/FaceRecognition;", "", "nbtcStatus", "", "verifyIDNumber", "manualReason", "nbtcMessage", "nbtcConfidence", "", "verifyAttempt", "verifyType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getManualReason", "()Ljava/lang/String;", "getNbtcConfidence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNbtcMessage", "getNbtcStatus", "getVerifyAttempt", "getVerifyIDNumber", "getVerifyType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/FaceRecognition;", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.submit.request.FaceRecognition */
/* loaded from: classes8.dex */
public final class FaceRecognition {
    public static final int $stable = 0;
    @SerializedName("manualReason")
    @Nullable
    private final String manualReason;
    @SerializedName("nbtcConfidence")
    @Nullable
    private final Double nbtcConfidence;
    @SerializedName("nbtcMessage")
    @Nullable
    private final String nbtcMessage;
    @SerializedName("nbtcStatus")
    @Nullable
    private final String nbtcStatus;
    @SerializedName("verifyAttempt")
    @Nullable
    private final String verifyAttempt;
    @SerializedName("verifyIDNumber")
    @Nullable
    private final String verifyIDNumber;
    @SerializedName("verifyType")
    @Nullable
    private final String verifyType;

    public FaceRecognition() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ FaceRecognition copy$default(FaceRecognition faceRecognition, String str, String str2, String str3, String str4, Double d, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceRecognition.nbtcStatus;
        }
        if ((i & 2) != 0) {
            str2 = faceRecognition.verifyIDNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = faceRecognition.manualReason;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = faceRecognition.nbtcMessage;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            d = faceRecognition.nbtcConfidence;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            str5 = faceRecognition.verifyAttempt;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = faceRecognition.verifyType;
        }
        return faceRecognition.copy(str, str7, str8, str9, d2, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.nbtcStatus;
    }

    @Nullable
    public final String component2() {
        return this.verifyIDNumber;
    }

    @Nullable
    public final String component3() {
        return this.manualReason;
    }

    @Nullable
    public final String component4() {
        return this.nbtcMessage;
    }

    @Nullable
    public final Double component5() {
        return this.nbtcConfidence;
    }

    @Nullable
    public final String component6() {
        return this.verifyAttempt;
    }

    @Nullable
    public final String component7() {
        return this.verifyType;
    }

    @NotNull
    public final FaceRecognition copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d, @Nullable String str5, @Nullable String str6) {
        return new FaceRecognition(str, str2, str3, str4, d, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceRecognition) {
            FaceRecognition faceRecognition = (FaceRecognition) obj;
            return Intrinsics.areEqual(this.nbtcStatus, faceRecognition.nbtcStatus) && Intrinsics.areEqual(this.verifyIDNumber, faceRecognition.verifyIDNumber) && Intrinsics.areEqual(this.manualReason, faceRecognition.manualReason) && Intrinsics.areEqual(this.nbtcMessage, faceRecognition.nbtcMessage) && Intrinsics.areEqual((Object) this.nbtcConfidence, (Object) faceRecognition.nbtcConfidence) && Intrinsics.areEqual(this.verifyAttempt, faceRecognition.verifyAttempt) && Intrinsics.areEqual(this.verifyType, faceRecognition.verifyType);
        }
        return false;
    }

    @Nullable
    public final String getManualReason() {
        return this.manualReason;
    }

    @Nullable
    public final Double getNbtcConfidence() {
        return this.nbtcConfidence;
    }

    @Nullable
    public final String getNbtcMessage() {
        return this.nbtcMessage;
    }

    @Nullable
    public final String getNbtcStatus() {
        return this.nbtcStatus;
    }

    @Nullable
    public final String getVerifyAttempt() {
        return this.verifyAttempt;
    }

    @Nullable
    public final String getVerifyIDNumber() {
        return this.verifyIDNumber;
    }

    @Nullable
    public final String getVerifyType() {
        return this.verifyType;
    }

    public int hashCode() {
        String str = this.nbtcStatus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.verifyIDNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.manualReason;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nbtcMessage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.nbtcConfidence;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str5 = this.verifyAttempt;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.verifyType;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.nbtcStatus;
        String str2 = this.verifyIDNumber;
        String str3 = this.manualReason;
        String str4 = this.nbtcMessage;
        Double d = this.nbtcConfidence;
        String str5 = this.verifyAttempt;
        String str6 = this.verifyType;
        return "FaceRecognition(nbtcStatus=" + str + ", verifyIDNumber=" + str2 + ", manualReason=" + str3 + ", nbtcMessage=" + str4 + ", nbtcConfidence=" + d + ", verifyAttempt=" + str5 + ", verifyType=" + str6 + ")";
    }

    public FaceRecognition(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d, @Nullable String str5, @Nullable String str6) {
        this.nbtcStatus = str;
        this.verifyIDNumber = str2;
        this.manualReason = str3;
        this.nbtcMessage = str4;
        this.nbtcConfidence = d;
        this.verifyAttempt = str5;
        this.verifyType = str6;
    }

    public /* synthetic */ FaceRecognition(String str, String str2, String str3, String str4, Double d, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}