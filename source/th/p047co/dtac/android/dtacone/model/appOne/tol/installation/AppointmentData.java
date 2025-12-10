package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentData;", "", NotificationCompat.CATEGORY_STATUS, "", "needTechnician", "", "availableDateList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDateItem;", "(Ljava/lang/String;ZLjava/util/List;)V", "getAvailableDateList", "()Ljava/util/List;", "getNeedTechnician", "()Z", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentData */
/* loaded from: classes8.dex */
public final class AppointmentData {
    public static final int $stable = 8;
    @SerializedName("availableDateList")
    @NotNull
    private final List<AppointmentDateItem> availableDateList;
    @SerializedName("needTechnician")
    private final boolean needTechnician;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;

    public AppointmentData(@NotNull String status, boolean z, @NotNull List<AppointmentDateItem> availableDateList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableDateList, "availableDateList");
        this.status = status;
        this.needTechnician = z;
        this.availableDateList = availableDateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppointmentData copy$default(AppointmentData appointmentData, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appointmentData.status;
        }
        if ((i & 2) != 0) {
            z = appointmentData.needTechnician;
        }
        if ((i & 4) != 0) {
            list = appointmentData.availableDateList;
        }
        return appointmentData.copy(str, z, list);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    public final boolean component2() {
        return this.needTechnician;
    }

    @NotNull
    public final List<AppointmentDateItem> component3() {
        return this.availableDateList;
    }

    @NotNull
    public final AppointmentData copy(@NotNull String status, boolean z, @NotNull List<AppointmentDateItem> availableDateList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableDateList, "availableDateList");
        return new AppointmentData(status, z, availableDateList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppointmentData) {
            AppointmentData appointmentData = (AppointmentData) obj;
            return Intrinsics.areEqual(this.status, appointmentData.status) && this.needTechnician == appointmentData.needTechnician && Intrinsics.areEqual(this.availableDateList, appointmentData.availableDateList);
        }
        return false;
    }

    @NotNull
    public final List<AppointmentDateItem> getAvailableDateList() {
        return this.availableDateList;
    }

    public final boolean getNeedTechnician() {
        return this.needTechnician;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        boolean z = this.needTechnician;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.availableDateList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.status;
        boolean z = this.needTechnician;
        List<AppointmentDateItem> list = this.availableDateList;
        return "AppointmentData(status=" + str + ", needTechnician=" + z + ", availableDateList=" + list + ")";
    }

    public /* synthetic */ AppointmentData(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, list);
    }
}
