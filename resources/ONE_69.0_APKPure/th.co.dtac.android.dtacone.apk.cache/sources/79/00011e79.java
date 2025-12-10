package th.p047co.dtac.android.dtacone.model.face_recognition;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "confidence", "displayMessage", "responseDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfidence", "()Ljava/lang/String;", "setConfidence", "(Ljava/lang/String;)V", "getDisplayMessage", "setDisplayMessage", "getMessage", "setMessage", "getResponseDateTime", "setResponseDateTime", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.face_recognition.FaceRecResponse */
/* loaded from: classes8.dex */
public final class FaceRecResponse {
    public static final int $stable = 8;
    @SerializedName("confidence")
    @Nullable
    private String confidence;
    @SerializedName("displayMessage")
    @Nullable
    private String displayMessage;
    @SerializedName("message")
    @Nullable
    private String message;
    @SerializedName("responseDateTime")
    @Nullable
    private String responseDateTime;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private String status;

    public FaceRecResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.status = str;
        this.message = str2;
        this.confidence = str3;
        this.displayMessage = str4;
        this.responseDateTime = str5;
    }

    public static /* synthetic */ FaceRecResponse copy$default(FaceRecResponse faceRecResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceRecResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = faceRecResponse.message;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = faceRecResponse.confidence;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = faceRecResponse.displayMessage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = faceRecResponse.responseDateTime;
        }
        return faceRecResponse.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @Nullable
    public final String component3() {
        return this.confidence;
    }

    @Nullable
    public final String component4() {
        return this.displayMessage;
    }

    @Nullable
    public final String component5() {
        return this.responseDateTime;
    }

    @NotNull
    public final FaceRecResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new FaceRecResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceRecResponse) {
            FaceRecResponse faceRecResponse = (FaceRecResponse) obj;
            return Intrinsics.areEqual(this.status, faceRecResponse.status) && Intrinsics.areEqual(this.message, faceRecResponse.message) && Intrinsics.areEqual(this.confidence, faceRecResponse.confidence) && Intrinsics.areEqual(this.displayMessage, faceRecResponse.displayMessage) && Intrinsics.areEqual(this.responseDateTime, faceRecResponse.responseDateTime);
        }
        return false;
    }

    @Nullable
    public final String getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confidence;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayMessage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.responseDateTime;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setConfidence(@Nullable String str) {
        this.confidence = str;
    }

    public final void setDisplayMessage(@Nullable String str) {
        this.displayMessage = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setResponseDateTime(@Nullable String str) {
        this.responseDateTime = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.message;
        String str3 = this.confidence;
        String str4 = this.displayMessage;
        String str5 = this.responseDateTime;
        return "FaceRecResponse(status=" + str + ", message=" + str2 + ", confidence=" + str3 + ", displayMessage=" + str4 + ", responseDateTime=" + str5 + ")";
    }
}