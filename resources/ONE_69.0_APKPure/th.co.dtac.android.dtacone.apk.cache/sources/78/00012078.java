package th.p047co.dtac.android.dtacone.model.self_update;

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
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\b\u0010 \u001a\u00020!H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020!H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "rtrContactPerson", "Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson;", "rtrInformation", "Lth/co/dtac/android/dtacone/model/self_update/RtrInformation;", "commissionInformation", "Lth/co/dtac/android/dtacone/model/self_update/RtrCommissionInformation;", "areaManager", "Lth/co/dtac/android/dtacone/model/self_update/RtrAreaManager;", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileStatus;", "(Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson;Lth/co/dtac/android/dtacone/model/self_update/RtrInformation;Lth/co/dtac/android/dtacone/model/self_update/RtrCommissionInformation;Lth/co/dtac/android/dtacone/model/self_update/RtrAreaManager;Lth/co/dtac/android/dtacone/model/self_update/RtrProfileStatus;)V", "getAreaManager", "()Lth/co/dtac/android/dtacone/model/self_update/RtrAreaManager;", "getCommissionInformation", "()Lth/co/dtac/android/dtacone/model/self_update/RtrCommissionInformation;", "getRtrContactPerson", "()Lth/co/dtac/android/dtacone/model/self_update/RtrContactPerson;", "getRtrInformation", "()Lth/co/dtac/android/dtacone/model/self_update/RtrInformation;", "getStatus", "()Lth/co/dtac/android/dtacone/model/self_update/RtrProfileStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileResponse */
/* loaded from: classes8.dex */
public final class RtrProfileResponse implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("areaManager")
    @Nullable
    private final RtrAreaManager areaManager;
    @SerializedName("commissionInformation")
    @Nullable
    private final RtrCommissionInformation commissionInformation;
    @SerializedName("contactPerson")
    @Nullable
    private final RtrContactPerson rtrContactPerson;
    @SerializedName("rtrInformation")
    @Nullable
    private final RtrInformation rtrInformation;
    @NotNull
    private final transient RtrProfileStatus status;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<RtrProfileResponse> CREATOR = new Parcelable.Creator<RtrProfileResponse>() { // from class: th.co.dtac.android.dtacone.model.self_update.RtrProfileResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RtrProfileResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new RtrProfileResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RtrProfileResponse[] newArray(int i) {
            return new RtrProfileResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.self_update.RtrProfileResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RtrProfileResponse(@Nullable RtrContactPerson rtrContactPerson, @Nullable RtrInformation rtrInformation, @Nullable RtrCommissionInformation rtrCommissionInformation, @Nullable RtrAreaManager rtrAreaManager, @NotNull RtrProfileStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.rtrContactPerson = rtrContactPerson;
        this.rtrInformation = rtrInformation;
        this.commissionInformation = rtrCommissionInformation;
        this.areaManager = rtrAreaManager;
        this.status = status;
    }

    public static /* synthetic */ RtrProfileResponse copy$default(RtrProfileResponse rtrProfileResponse, RtrContactPerson rtrContactPerson, RtrInformation rtrInformation, RtrCommissionInformation rtrCommissionInformation, RtrAreaManager rtrAreaManager, RtrProfileStatus rtrProfileStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            rtrContactPerson = rtrProfileResponse.rtrContactPerson;
        }
        if ((i & 2) != 0) {
            rtrInformation = rtrProfileResponse.rtrInformation;
        }
        RtrInformation rtrInformation2 = rtrInformation;
        if ((i & 4) != 0) {
            rtrCommissionInformation = rtrProfileResponse.commissionInformation;
        }
        RtrCommissionInformation rtrCommissionInformation2 = rtrCommissionInformation;
        if ((i & 8) != 0) {
            rtrAreaManager = rtrProfileResponse.areaManager;
        }
        RtrAreaManager rtrAreaManager2 = rtrAreaManager;
        if ((i & 16) != 0) {
            rtrProfileStatus = rtrProfileResponse.status;
        }
        return rtrProfileResponse.copy(rtrContactPerson, rtrInformation2, rtrCommissionInformation2, rtrAreaManager2, rtrProfileStatus);
    }

    @Nullable
    public final RtrContactPerson component1() {
        return this.rtrContactPerson;
    }

    @Nullable
    public final RtrInformation component2() {
        return this.rtrInformation;
    }

    @Nullable
    public final RtrCommissionInformation component3() {
        return this.commissionInformation;
    }

    @Nullable
    public final RtrAreaManager component4() {
        return this.areaManager;
    }

    @NotNull
    public final RtrProfileStatus component5() {
        return this.status;
    }

    @NotNull
    public final RtrProfileResponse copy(@Nullable RtrContactPerson rtrContactPerson, @Nullable RtrInformation rtrInformation, @Nullable RtrCommissionInformation rtrCommissionInformation, @Nullable RtrAreaManager rtrAreaManager, @NotNull RtrProfileStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new RtrProfileResponse(rtrContactPerson, rtrInformation, rtrCommissionInformation, rtrAreaManager, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtrProfileResponse) {
            RtrProfileResponse rtrProfileResponse = (RtrProfileResponse) obj;
            return Intrinsics.areEqual(this.rtrContactPerson, rtrProfileResponse.rtrContactPerson) && Intrinsics.areEqual(this.rtrInformation, rtrProfileResponse.rtrInformation) && Intrinsics.areEqual(this.commissionInformation, rtrProfileResponse.commissionInformation) && Intrinsics.areEqual(this.areaManager, rtrProfileResponse.areaManager) && this.status == rtrProfileResponse.status;
        }
        return false;
    }

    @Nullable
    public final RtrAreaManager getAreaManager() {
        return this.areaManager;
    }

    @Nullable
    public final RtrCommissionInformation getCommissionInformation() {
        return this.commissionInformation;
    }

    @Nullable
    public final RtrContactPerson getRtrContactPerson() {
        return this.rtrContactPerson;
    }

    @Nullable
    public final RtrInformation getRtrInformation() {
        return this.rtrInformation;
    }

    @NotNull
    public final RtrProfileStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        RtrContactPerson rtrContactPerson = this.rtrContactPerson;
        int hashCode = (rtrContactPerson == null ? 0 : rtrContactPerson.hashCode()) * 31;
        RtrInformation rtrInformation = this.rtrInformation;
        int hashCode2 = (hashCode + (rtrInformation == null ? 0 : rtrInformation.hashCode())) * 31;
        RtrCommissionInformation rtrCommissionInformation = this.commissionInformation;
        int hashCode3 = (hashCode2 + (rtrCommissionInformation == null ? 0 : rtrCommissionInformation.hashCode())) * 31;
        RtrAreaManager rtrAreaManager = this.areaManager;
        return ((hashCode3 + (rtrAreaManager != null ? rtrAreaManager.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        RtrContactPerson rtrContactPerson = this.rtrContactPerson;
        RtrInformation rtrInformation = this.rtrInformation;
        RtrCommissionInformation rtrCommissionInformation = this.commissionInformation;
        RtrAreaManager rtrAreaManager = this.areaManager;
        RtrProfileStatus rtrProfileStatus = this.status;
        return "RtrProfileResponse(rtrContactPerson=" + rtrContactPerson + ", rtrInformation=" + rtrInformation + ", commissionInformation=" + rtrCommissionInformation + ", areaManager=" + rtrAreaManager + ", status=" + rtrProfileStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.rtrContactPerson, 0);
        dest.writeParcelable(this.rtrInformation, 0);
        dest.writeParcelable(this.commissionInformation, 0);
        dest.writeParcelable(this.areaManager, 0);
        dest.writeInt(this.status.ordinal());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RtrProfileResponse(@NotNull Parcel source) {
        this((RtrContactPerson) source.readParcelable(RtrContactPerson.class.getClassLoader()), (RtrInformation) source.readParcelable(RtrInformation.class.getClassLoader()), (RtrCommissionInformation) source.readParcelable(RtrCommissionInformation.class.getClassLoader()), (RtrAreaManager) source.readParcelable(RtrAreaManager.class.getClassLoader()), RtrProfileStatus.values()[source.readInt()]);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}