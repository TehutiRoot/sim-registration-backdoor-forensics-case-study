package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDeviceItem;", "", "action", "", "deviceType", "deviceName", FirebaseAnalytics.Param.QUANTITY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAction", "()Ljava/lang/String;", "getDeviceName", "getDeviceType", "getQuantity", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDeviceItem */
/* loaded from: classes8.dex */
public final class AppointmentDeviceItem {
    public static final int $stable = 0;
    @SerializedName("action")
    @NotNull
    private final String action;
    @SerializedName("deviceName")
    @NotNull
    private final String deviceName;
    @SerializedName("deviceType")
    @NotNull
    private final String deviceType;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final int quantity;

    public AppointmentDeviceItem(@NotNull String action, @NotNull String deviceType, @NotNull String deviceName, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.action = action;
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.quantity = i;
    }

    public static /* synthetic */ AppointmentDeviceItem copy$default(AppointmentDeviceItem appointmentDeviceItem, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appointmentDeviceItem.action;
        }
        if ((i2 & 2) != 0) {
            str2 = appointmentDeviceItem.deviceType;
        }
        if ((i2 & 4) != 0) {
            str3 = appointmentDeviceItem.deviceName;
        }
        if ((i2 & 8) != 0) {
            i = appointmentDeviceItem.quantity;
        }
        return appointmentDeviceItem.copy(str, str2, str3, i);
    }

    @NotNull
    public final String component1() {
        return this.action;
    }

    @NotNull
    public final String component2() {
        return this.deviceType;
    }

    @NotNull
    public final String component3() {
        return this.deviceName;
    }

    public final int component4() {
        return this.quantity;
    }

    @NotNull
    public final AppointmentDeviceItem copy(@NotNull String action, @NotNull String deviceType, @NotNull String deviceName, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        return new AppointmentDeviceItem(action, deviceType, deviceName, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppointmentDeviceItem) {
            AppointmentDeviceItem appointmentDeviceItem = (AppointmentDeviceItem) obj;
            return Intrinsics.areEqual(this.action, appointmentDeviceItem.action) && Intrinsics.areEqual(this.deviceType, appointmentDeviceItem.deviceType) && Intrinsics.areEqual(this.deviceName, appointmentDeviceItem.deviceName) && this.quantity == appointmentDeviceItem.quantity;
        }
        return false;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((((this.action.hashCode() * 31) + this.deviceType.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.quantity;
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        int i = this.quantity;
        return "AppointmentDeviceItem(action=" + str + ", deviceType=" + str2 + ", deviceName=" + str3 + ", quantity=" + i + ")";
    }
}