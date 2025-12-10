package th.p047co.dtac.android.dtacone.model.esim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.AutoTransferEsimResponse */
/* loaded from: classes8.dex */
public final class AutoTransferEsimResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<AutoTransferEsimResponse> CREATOR = new Creator();
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.esim.AutoTransferEsimResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<AutoTransferEsimResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AutoTransferEsimResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTransferEsimResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AutoTransferEsimResponse[] newArray(int i) {
            return new AutoTransferEsimResponse[i];
        }
    }

    public AutoTransferEsimResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ AutoTransferEsimResponse copy$default(AutoTransferEsimResponse autoTransferEsimResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTransferEsimResponse.status;
        }
        return autoTransferEsimResponse.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final AutoTransferEsimResponse copy(@Nullable String str) {
        return new AutoTransferEsimResponse(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoTransferEsimResponse) && Intrinsics.areEqual(this.status, ((AutoTransferEsimResponse) obj).status);
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
        return "AutoTransferEsimResponse(status=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.status);
    }

    public AutoTransferEsimResponse(@Nullable String str) {
        this.status = str;
    }

    public /* synthetic */ AutoTransferEsimResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}