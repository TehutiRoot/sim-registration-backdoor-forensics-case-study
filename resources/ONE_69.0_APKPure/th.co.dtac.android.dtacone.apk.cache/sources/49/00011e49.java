package th.p047co.dtac.android.dtacone.model.dtacAtHome;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/dtacAtHome/DtacAtHomeConfig;", "Landroid/os/Parcelable;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "locationToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocationToken", "()Ljava/lang/String;", "getPhoneNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.dtacAtHome.DtacAtHomeConfig */
/* loaded from: classes8.dex */
public final class DtacAtHomeConfig implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<DtacAtHomeConfig> CREATOR = new Creator();
    @SerializedName("locationToken")
    @NotNull
    private final String locationToken;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @NotNull
    private final String phoneNumber;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.dtacAtHome.DtacAtHomeConfig$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<DtacAtHomeConfig> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DtacAtHomeConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DtacAtHomeConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DtacAtHomeConfig[] newArray(int i) {
            return new DtacAtHomeConfig[i];
        }
    }

    public DtacAtHomeConfig(@NotNull String phoneNumber, @NotNull String locationToken) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(locationToken, "locationToken");
        this.phoneNumber = phoneNumber;
        this.locationToken = locationToken;
    }

    public static /* synthetic */ DtacAtHomeConfig copy$default(DtacAtHomeConfig dtacAtHomeConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dtacAtHomeConfig.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = dtacAtHomeConfig.locationToken;
        }
        return dtacAtHomeConfig.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.phoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.locationToken;
    }

    @NotNull
    public final DtacAtHomeConfig copy(@NotNull String phoneNumber, @NotNull String locationToken) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(locationToken, "locationToken");
        return new DtacAtHomeConfig(phoneNumber, locationToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DtacAtHomeConfig) {
            DtacAtHomeConfig dtacAtHomeConfig = (DtacAtHomeConfig) obj;
            return Intrinsics.areEqual(this.phoneNumber, dtacAtHomeConfig.phoneNumber) && Intrinsics.areEqual(this.locationToken, dtacAtHomeConfig.locationToken);
        }
        return false;
    }

    @NotNull
    public final String getLocationToken() {
        return this.locationToken;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (this.phoneNumber.hashCode() * 31) + this.locationToken.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.locationToken;
        return "DtacAtHomeConfig(phoneNumber=" + str + ", locationToken=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.phoneNumber);
        out.writeString(this.locationToken);
    }
}