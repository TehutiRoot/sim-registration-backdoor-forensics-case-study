package th.p047co.dtac.android.dtacone.model.appOne.tol.device;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData;", "", NotificationCompat.CATEGORY_STATUS, "", "deviceList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceList", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceData */
/* loaded from: classes8.dex */
public final class DeviceData {
    @SerializedName("deviceList")
    @NotNull
    private final List<DeviceRouterItem> deviceList;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceData$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceData mock() {
            return new DeviceData("Success", CollectionsKt__CollectionsKt.listOf((Object[]) new DeviceRouterItem[]{new DeviceRouterItem("T62B_T623_T625Pro_F66DDR", "T62B_T623_T625Pro_F66DDR : T628 T623_T625Pro_F66DDR", true, AbstractC10108ds.listOf(new DeviceMeshItem("MESH6_AP", "MESH6_AP", "MESH6_AP", 3, 0, 16, null))), new DeviceRouterItem("T623L_T625LM_T626PRO_F66DDP", "T623L_T625LM_T626PRO_F66DDP : T623L_T625LM_T626Pro_F66DDP", false, CollectionsKt__CollectionsKt.listOf((Object[]) new DeviceMeshItem[]{new DeviceMeshItem("MESH1_AP", "MESH1_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH2_AP", "MESH2_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH3_AP", "MESH3_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH4_AP", "MESH4_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH5_AP", "MESH5_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH6_AP", "MESH6_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH7_AP", "MESH7_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH8_AP", "MESH8_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH9_AP", "MESH9_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH10_AP", "MESH10_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH11_AP", "MESH11_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH12_AP", "MESH12_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH13_AP", "MESH13_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH14_AP", "MESH14_AP", null, 0, 0, 28, null), new DeviceMeshItem("MESH15_AP", "MESH15_AP", null, 0, 0, 28, null)})), new DeviceRouterItem("T629L_T625LM_T626PRO_F66DDP", "T629L_T625LM_T626PRO_F66DDP : T629L_T625LM_T626Pro_F66DDP", true, CollectionsKt__CollectionsKt.emptyList())}));
        }

        private Companion() {
        }
    }

    public DeviceData() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceData.status;
        }
        if ((i & 2) != 0) {
            list = deviceData.deviceList;
        }
        return deviceData.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final List<DeviceRouterItem> component2() {
        return this.deviceList;
    }

    @NotNull
    public final DeviceData copy(@NotNull String status, @NotNull List<DeviceRouterItem> deviceList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        return new DeviceData(status, deviceList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceData) {
            DeviceData deviceData = (DeviceData) obj;
            return Intrinsics.areEqual(this.status, deviceData.status) && Intrinsics.areEqual(this.deviceList, deviceData.deviceList);
        }
        return false;
    }

    @NotNull
    public final List<DeviceRouterItem> getDeviceList() {
        return this.deviceList;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.deviceList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.status;
        List<DeviceRouterItem> list = this.deviceList;
        return "DeviceData(status=" + str + ", deviceList=" + list + ")";
    }

    public DeviceData(@NotNull String status, @NotNull List<DeviceRouterItem> deviceList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        this.status = status;
        this.deviceList = deviceList;
    }

    public /* synthetic */ DeviceData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
