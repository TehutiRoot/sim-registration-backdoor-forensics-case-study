package th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/response/OneUploadDocumentDataResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response.OneUploadDocumentDataResponse */
/* loaded from: classes8.dex */
public final class OneUploadDocumentDataResponse {
    public static final int $stable = 0;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public OneUploadDocumentDataResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneUploadDocumentDataResponse copy$default(OneUploadDocumentDataResponse oneUploadDocumentDataResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneUploadDocumentDataResponse.status;
        }
        return oneUploadDocumentDataResponse.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final OneUploadDocumentDataResponse copy(@Nullable String str) {
        return new OneUploadDocumentDataResponse(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneUploadDocumentDataResponse) && Intrinsics.areEqual(this.status, ((OneUploadDocumentDataResponse) obj).status);
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.status;
        return "OneUploadDocumentDataResponse(status=" + str + ")";
    }

    public OneUploadDocumentDataResponse(@Nullable String str) {
        this.status = str;
    }

    public /* synthetic */ OneUploadDocumentDataResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
