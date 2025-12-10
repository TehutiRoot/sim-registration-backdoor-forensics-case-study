package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostAuthorizationByRtrResponse;", "Landroid/os/Parcelable;", "requireFaceRecognition", "", "invoiceAlertMethod", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getInvoiceAlertMethod", "()Ljava/lang/String;", "getRequireFaceRecognition", "()Ljava/lang/Boolean;", "setRequireFaceRecognition", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostAuthorizationByRtrResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostAuthorizationByRtrResponse */
/* loaded from: classes8.dex */
public final class GetPre2PostAuthorizationByRtrResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<GetPre2PostAuthorizationByRtrResponse> CREATOR = new Creator();
    @SerializedName("invoiceAlertMethod")
    @Nullable
    private final String invoiceAlertMethod;
    @SerializedName("requireFaceRecognition")
    @Nullable
    private Boolean requireFaceRecognition;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostAuthorizationByRtrResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<GetPre2PostAuthorizationByRtrResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetPre2PostAuthorizationByRtrResponse createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GetPre2PostAuthorizationByRtrResponse(valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetPre2PostAuthorizationByRtrResponse[] newArray(int i) {
            return new GetPre2PostAuthorizationByRtrResponse[i];
        }
    }

    public GetPre2PostAuthorizationByRtrResponse(@Nullable Boolean bool, @Nullable String str) {
        this.requireFaceRecognition = bool;
        this.invoiceAlertMethod = str;
    }

    public static /* synthetic */ GetPre2PostAuthorizationByRtrResponse copy$default(GetPre2PostAuthorizationByRtrResponse getPre2PostAuthorizationByRtrResponse, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = getPre2PostAuthorizationByRtrResponse.requireFaceRecognition;
        }
        if ((i & 2) != 0) {
            str = getPre2PostAuthorizationByRtrResponse.invoiceAlertMethod;
        }
        return getPre2PostAuthorizationByRtrResponse.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component2() {
        return this.invoiceAlertMethod;
    }

    @NotNull
    public final GetPre2PostAuthorizationByRtrResponse copy(@Nullable Boolean bool, @Nullable String str) {
        return new GetPre2PostAuthorizationByRtrResponse(bool, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPre2PostAuthorizationByRtrResponse) {
            GetPre2PostAuthorizationByRtrResponse getPre2PostAuthorizationByRtrResponse = (GetPre2PostAuthorizationByRtrResponse) obj;
            return Intrinsics.areEqual(this.requireFaceRecognition, getPre2PostAuthorizationByRtrResponse.requireFaceRecognition) && Intrinsics.areEqual(this.invoiceAlertMethod, getPre2PostAuthorizationByRtrResponse.invoiceAlertMethod);
        }
        return false;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final Boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    public int hashCode() {
        Boolean bool = this.requireFaceRecognition;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.invoiceAlertMethod;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setRequireFaceRecognition(@Nullable Boolean bool) {
        this.requireFaceRecognition = bool;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.requireFaceRecognition;
        String str = this.invoiceAlertMethod;
        return "GetPre2PostAuthorizationByRtrResponse(requireFaceRecognition=" + bool + ", invoiceAlertMethod=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(out, "out");
        Boolean bool = this.requireFaceRecognition;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.invoiceAlertMethod);
    }
}