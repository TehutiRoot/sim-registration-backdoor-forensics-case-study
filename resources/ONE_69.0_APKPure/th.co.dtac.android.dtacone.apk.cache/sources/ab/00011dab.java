package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfo;", "", "deviceSIM", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SIMInfo;", "dtacApp", "(Ljava/util/List;Ljava/util/List;)V", "getDeviceSIM", "()Ljava/util/List;", "setDeviceSIM", "(Ljava/util/List;)V", "getDtacApp", "setDtacApp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfo */
/* loaded from: classes8.dex */
public final class DeviceSIMInfo {
    public static final int $stable = 8;
    @SerializedName("deviceSIM")
    @Nullable
    private List<SIMInfo> deviceSIM;
    @SerializedName("dtacApp")
    @Nullable
    private List<SIMInfo> dtacApp;

    public DeviceSIMInfo() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSIMInfo copy$default(DeviceSIMInfo deviceSIMInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceSIMInfo.deviceSIM;
        }
        if ((i & 2) != 0) {
            list2 = deviceSIMInfo.dtacApp;
        }
        return deviceSIMInfo.copy(list, list2);
    }

    @Nullable
    public final List<SIMInfo> component1() {
        return this.deviceSIM;
    }

    @Nullable
    public final List<SIMInfo> component2() {
        return this.dtacApp;
    }

    @NotNull
    public final DeviceSIMInfo copy(@Nullable List<SIMInfo> list, @Nullable List<SIMInfo> list2) {
        return new DeviceSIMInfo(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSIMInfo) {
            DeviceSIMInfo deviceSIMInfo = (DeviceSIMInfo) obj;
            return Intrinsics.areEqual(this.deviceSIM, deviceSIMInfo.deviceSIM) && Intrinsics.areEqual(this.dtacApp, deviceSIMInfo.dtacApp);
        }
        return false;
    }

    @Nullable
    public final List<SIMInfo> getDeviceSIM() {
        return this.deviceSIM;
    }

    @Nullable
    public final List<SIMInfo> getDtacApp() {
        return this.dtacApp;
    }

    public int hashCode() {
        List<SIMInfo> list = this.deviceSIM;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SIMInfo> list2 = this.dtacApp;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setDeviceSIM(@Nullable List<SIMInfo> list) {
        this.deviceSIM = list;
    }

    public final void setDtacApp(@Nullable List<SIMInfo> list) {
        this.dtacApp = list;
    }

    @NotNull
    public String toString() {
        List<SIMInfo> list = this.deviceSIM;
        List<SIMInfo> list2 = this.dtacApp;
        return "DeviceSIMInfo(deviceSIM=" + list + ", dtacApp=" + list2 + ")";
    }

    public DeviceSIMInfo(@Nullable List<SIMInfo> list, @Nullable List<SIMInfo> list2) {
        this.deviceSIM = list;
        this.dtacApp = list2;
    }

    public /* synthetic */ DeviceSIMInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}