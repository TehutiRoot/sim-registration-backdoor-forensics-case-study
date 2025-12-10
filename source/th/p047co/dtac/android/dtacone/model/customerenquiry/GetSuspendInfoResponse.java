package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetSuspendInfoResponse;", "", "suspendInfo", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SuspendInfo;", "(Ljava/util/List;)V", ConstsKt.RECALL_GET_SUSPEND_INFO, "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetSuspendInfoResponse */
/* loaded from: classes8.dex */
public final class GetSuspendInfoResponse {
    public static final int $stable = 8;
    @SerializedName("suspendInfo")
    @NotNull
    private final List<SuspendInfo> suspendInfo;

    public GetSuspendInfoResponse(@NotNull List<SuspendInfo> suspendInfo) {
        Intrinsics.checkNotNullParameter(suspendInfo, "suspendInfo");
        this.suspendInfo = suspendInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSuspendInfoResponse copy$default(GetSuspendInfoResponse getSuspendInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSuspendInfoResponse.suspendInfo;
        }
        return getSuspendInfoResponse.copy(list);
    }

    @NotNull
    public final List<SuspendInfo> component1() {
        return this.suspendInfo;
    }

    @NotNull
    public final GetSuspendInfoResponse copy(@NotNull List<SuspendInfo> suspendInfo) {
        Intrinsics.checkNotNullParameter(suspendInfo, "suspendInfo");
        return new GetSuspendInfoResponse(suspendInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSuspendInfoResponse) && Intrinsics.areEqual(this.suspendInfo, ((GetSuspendInfoResponse) obj).suspendInfo);
    }

    @NotNull
    public final List<SuspendInfo> getSuspendInfo() {
        return this.suspendInfo;
    }

    public int hashCode() {
        return this.suspendInfo.hashCode();
    }

    @NotNull
    public String toString() {
        List<SuspendInfo> list = this.suspendInfo;
        return "GetSuspendInfoResponse(suspendInfo=" + list + ")";
    }
}
