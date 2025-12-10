package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/UploadRetailerDocumentResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "fileName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getMessage", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.submit.UploadRetailerDocumentResponse */
/* loaded from: classes8.dex */
public final class UploadRetailerDocumentResponse {
    public static final int $stable = 8;
    @SerializedName("fileName")
    @Nullable
    private String fileName;
    @SerializedName("message")
    @NotNull
    private final String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;

    public UploadRetailerDocumentResponse(@NotNull String status, @NotNull String message, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = status;
        this.message = message;
        this.fileName = str;
    }

    public static /* synthetic */ UploadRetailerDocumentResponse copy$default(UploadRetailerDocumentResponse uploadRetailerDocumentResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadRetailerDocumentResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = uploadRetailerDocumentResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = uploadRetailerDocumentResponse.fileName;
        }
        return uploadRetailerDocumentResponse.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @Nullable
    public final String component3() {
        return this.fileName;
    }

    @NotNull
    public final UploadRetailerDocumentResponse copy(@NotNull String status, @NotNull String message, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        return new UploadRetailerDocumentResponse(status, message, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadRetailerDocumentResponse) {
            UploadRetailerDocumentResponse uploadRetailerDocumentResponse = (UploadRetailerDocumentResponse) obj;
            return Intrinsics.areEqual(this.status, uploadRetailerDocumentResponse.status) && Intrinsics.areEqual(this.message, uploadRetailerDocumentResponse.message) && Intrinsics.areEqual(this.fileName, uploadRetailerDocumentResponse.fileName);
        }
        return false;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.status.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.fileName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.message;
        String str3 = this.fileName;
        return "UploadRetailerDocumentResponse(status=" + str + ", message=" + str2 + ", fileName=" + str3 + ")";
    }

    public /* synthetic */ UploadRetailerDocumentResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }
}