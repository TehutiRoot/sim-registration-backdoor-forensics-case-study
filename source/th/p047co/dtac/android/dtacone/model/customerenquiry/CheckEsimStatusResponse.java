package th.p047co.dtac.android.dtacone.model.customerenquiry;

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
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/CheckEsimStatusResponse;", "Landroid/os/Parcelable;", "displayQRType", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisplayQRType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CheckEsimStatusResponse */
/* loaded from: classes8.dex */
public final class CheckEsimStatusResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CheckEsimStatusResponse> CREATOR = new Creator();
    @SerializedName("statusDescription")
    @Nullable
    private final String description;
    @SerializedName("displayQRType")
    @Nullable
    private final String displayQRType;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CheckEsimStatusResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CheckEsimStatusResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckEsimStatusResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckEsimStatusResponse(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckEsimStatusResponse[] newArray(int i) {
            return new CheckEsimStatusResponse[i];
        }
    }

    public CheckEsimStatusResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CheckEsimStatusResponse copy$default(CheckEsimStatusResponse checkEsimStatusResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEsimStatusResponse.displayQRType;
        }
        if ((i & 2) != 0) {
            str2 = checkEsimStatusResponse.description;
        }
        return checkEsimStatusResponse.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.displayQRType;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final CheckEsimStatusResponse copy(@Nullable String str, @Nullable String str2) {
        return new CheckEsimStatusResponse(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckEsimStatusResponse) {
            CheckEsimStatusResponse checkEsimStatusResponse = (CheckEsimStatusResponse) obj;
            return Intrinsics.areEqual(this.displayQRType, checkEsimStatusResponse.displayQRType) && Intrinsics.areEqual(this.description, checkEsimStatusResponse.description);
        }
        return false;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDisplayQRType() {
        return this.displayQRType;
    }

    public int hashCode() {
        String str = this.displayQRType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.displayQRType;
        String str2 = this.description;
        return "CheckEsimStatusResponse(displayQRType=" + str + ", description=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.displayQRType);
        out.writeString(this.description);
    }

    public CheckEsimStatusResponse(@Nullable String str, @Nullable String str2) {
        this.displayQRType = str;
        this.description = str2;
    }

    public /* synthetic */ CheckEsimStatusResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
