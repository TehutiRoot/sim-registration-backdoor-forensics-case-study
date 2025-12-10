package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfoResponse;", "", "deviceSIM", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SIMInfoResponse;", "dtacApp", "(Ljava/util/List;Ljava/util/List;)V", "getDeviceSIM", "()Ljava/util/List;", "getDtacApp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfoResponse */
/* loaded from: classes8.dex */
public final class DeviceSIMInfoResponse {
    public static final int $stable = 8;
    @SerializedName("deviceSIM")
    @NotNull
    private final List<SIMInfoResponse> deviceSIM;
    @SerializedName("dtacApp")
    @NotNull
    private final List<SIMInfoResponse> dtacApp;

    public DeviceSIMInfoResponse(@NotNull List<SIMInfoResponse> deviceSIM, @NotNull List<SIMInfoResponse> dtacApp) {
        Intrinsics.checkNotNullParameter(deviceSIM, "deviceSIM");
        Intrinsics.checkNotNullParameter(dtacApp, "dtacApp");
        this.deviceSIM = deviceSIM;
        this.dtacApp = dtacApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSIMInfoResponse copy$default(DeviceSIMInfoResponse deviceSIMInfoResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceSIMInfoResponse.deviceSIM;
        }
        if ((i & 2) != 0) {
            list2 = deviceSIMInfoResponse.dtacApp;
        }
        return deviceSIMInfoResponse.copy(list, list2);
    }

    @NotNull
    public final List<SIMInfoResponse> component1() {
        return this.deviceSIM;
    }

    @NotNull
    public final List<SIMInfoResponse> component2() {
        return this.dtacApp;
    }

    @NotNull
    public final DeviceSIMInfoResponse copy(@NotNull List<SIMInfoResponse> deviceSIM, @NotNull List<SIMInfoResponse> dtacApp) {
        Intrinsics.checkNotNullParameter(deviceSIM, "deviceSIM");
        Intrinsics.checkNotNullParameter(dtacApp, "dtacApp");
        return new DeviceSIMInfoResponse(deviceSIM, dtacApp);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSIMInfoResponse) {
            DeviceSIMInfoResponse deviceSIMInfoResponse = (DeviceSIMInfoResponse) obj;
            return Intrinsics.areEqual(this.deviceSIM, deviceSIMInfoResponse.deviceSIM) && Intrinsics.areEqual(this.dtacApp, deviceSIMInfoResponse.dtacApp);
        }
        return false;
    }

    @NotNull
    public final List<SIMInfoResponse> getDeviceSIM() {
        return this.deviceSIM;
    }

    @NotNull
    public final List<SIMInfoResponse> getDtacApp() {
        return this.dtacApp;
    }

    public int hashCode() {
        return (this.deviceSIM.hashCode() * 31) + this.dtacApp.hashCode();
    }

    @NotNull
    public String toString() {
        List<SIMInfoResponse> list = this.deviceSIM;
        List<SIMInfoResponse> list2 = this.dtacApp;
        return "DeviceSIMInfoResponse(deviceSIM=" + list + ", dtacApp=" + list2 + ")";
    }
}
