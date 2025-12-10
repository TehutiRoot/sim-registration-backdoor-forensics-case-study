package th.p047co.dtac.android.dtacone.model.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/PrepaidStatusResponse;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", NotificationCompat.CATEGORY_STATUS, "", "rtrTransactionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getRtrTransactionId", "()Ljava/lang/String;", "getStatus", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidStatusResponse */
/* loaded from: classes8.dex */
public final class PrepaidStatusResponse implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("rtrTransactionId")
    @Nullable
    private final String rtrTransactionId;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<PrepaidStatusResponse> CREATOR = new Parcelable.Creator<PrepaidStatusResponse>() { // from class: th.co.dtac.android.dtacone.model.prepaid.PrepaidStatusResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidStatusResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new PrepaidStatusResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidStatusResponse[] newArray(int i) {
            return new PrepaidStatusResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/PrepaidStatusResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidStatusResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidStatusResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PrepaidStatusResponse(@Nullable String str, @Nullable String str2) {
        this.status = str;
        this.rtrTransactionId = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getRtrTransactionId() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.status);
        dest.writeString(this.rtrTransactionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrepaidStatusResponse(@NotNull Parcel source) {
        this(source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}