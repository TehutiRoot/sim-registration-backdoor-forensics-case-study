package th.p047co.dtac.android.dtacone.model.appOne.tol.device;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRouterItem;", "", "deviceOfferCode", "", "deviceOfferName", "selectedByDefault", "", "deviceMeshList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceMeshItem;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getDeviceMeshList", "()Ljava/util/List;", "getDeviceOfferCode", "()Ljava/lang/String;", "getDeviceOfferName", "getSelectedByDefault", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem */
/* loaded from: classes8.dex */
public final class DeviceRouterItem {
    public static final int $stable = 8;
    @SerializedName("deviceMeshList")
    @NotNull
    private final List<DeviceMeshItem> deviceMeshList;
    @SerializedName("deviceOfferCode")
    @NotNull
    private final String deviceOfferCode;
    @SerializedName("deviceOfferName")
    @NotNull
    private final String deviceOfferName;
    @SerializedName("selectedByDefault")
    private final boolean selectedByDefault;

    public DeviceRouterItem() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceRouterItem copy$default(DeviceRouterItem deviceRouterItem, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceRouterItem.deviceOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = deviceRouterItem.deviceOfferName;
        }
        if ((i & 4) != 0) {
            z = deviceRouterItem.selectedByDefault;
        }
        if ((i & 8) != 0) {
            list = deviceRouterItem.deviceMeshList;
        }
        return deviceRouterItem.copy(str, str2, z, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.deviceOfferName;
    }

    public final boolean component3() {
        return this.selectedByDefault;
    }

    @NotNull
    public final List<DeviceMeshItem> component4() {
        return this.deviceMeshList;
    }

    @NotNull
    public final DeviceRouterItem copy(@NotNull String deviceOfferCode, @NotNull String deviceOfferName, boolean z, @NotNull List<DeviceMeshItem> deviceMeshList) {
        Intrinsics.checkNotNullParameter(deviceOfferCode, "deviceOfferCode");
        Intrinsics.checkNotNullParameter(deviceOfferName, "deviceOfferName");
        Intrinsics.checkNotNullParameter(deviceMeshList, "deviceMeshList");
        return new DeviceRouterItem(deviceOfferCode, deviceOfferName, z, deviceMeshList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceRouterItem) {
            DeviceRouterItem deviceRouterItem = (DeviceRouterItem) obj;
            return Intrinsics.areEqual(this.deviceOfferCode, deviceRouterItem.deviceOfferCode) && Intrinsics.areEqual(this.deviceOfferName, deviceRouterItem.deviceOfferName) && this.selectedByDefault == deviceRouterItem.selectedByDefault && Intrinsics.areEqual(this.deviceMeshList, deviceRouterItem.deviceMeshList);
        }
        return false;
    }

    @NotNull
    public final List<DeviceMeshItem> getDeviceMeshList() {
        return this.deviceMeshList;
    }

    @NotNull
    public final String getDeviceOfferCode() {
        return this.deviceOfferCode;
    }

    @NotNull
    public final String getDeviceOfferName() {
        return this.deviceOfferName;
    }

    public final boolean getSelectedByDefault() {
        return this.selectedByDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.deviceOfferCode.hashCode() * 31) + this.deviceOfferName.hashCode()) * 31;
        boolean z = this.selectedByDefault;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.deviceMeshList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.deviceOfferCode;
        String str2 = this.deviceOfferName;
        boolean z = this.selectedByDefault;
        List<DeviceMeshItem> list = this.deviceMeshList;
        return "DeviceRouterItem(deviceOfferCode=" + str + ", deviceOfferName=" + str2 + ", selectedByDefault=" + z + ", deviceMeshList=" + list + ")";
    }

    public DeviceRouterItem(@NotNull String deviceOfferCode, @NotNull String deviceOfferName, boolean z, @NotNull List<DeviceMeshItem> deviceMeshList) {
        Intrinsics.checkNotNullParameter(deviceOfferCode, "deviceOfferCode");
        Intrinsics.checkNotNullParameter(deviceOfferName, "deviceOfferName");
        Intrinsics.checkNotNullParameter(deviceMeshList, "deviceMeshList");
        this.deviceOfferCode = deviceOfferCode;
        this.deviceOfferName = deviceOfferName;
        this.selectedByDefault = z;
        this.deviceMeshList = deviceMeshList;
    }

    public /* synthetic */ DeviceRouterItem(String str, String str2, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
