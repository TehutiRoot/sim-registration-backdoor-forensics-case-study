package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/IdentityInfoModel;", "", "()V", "blackList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/BlackListResponse;", "getBlackList", "()Ljava/util/List;", "setBlackList", "(Ljava/util/List;)V", "contractEndDayBySubscriberNumber", "", "getContractEndDayBySubscriberNumber", "()I", "setContractEndDayBySubscriberNumber", "(I)V", "deviceSummary", "Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSummaryResponse;", "getDeviceSummary", "setDeviceSummary", "grayList", "getGrayList", "setGrayList", "idNumber", "", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "isLockBy3Level", "", "()Z", "setLockBy3Level", "(Z)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.IdentityInfoModel */
/* loaded from: classes8.dex */
public final class IdentityInfoModel {
    public static final int $stable = 8;
    @SerializedName("blackList")
    @Nullable
    private List<BlackListResponse> blackList;
    @SerializedName("contractEndDayBySubscriberNumber")
    private int contractEndDayBySubscriberNumber;
    @SerializedName("deviceSummary")
    @Nullable
    private List<DeviceSummaryResponse> deviceSummary;
    @SerializedName("grayList")
    @Nullable
    private List<BlackListResponse> grayList;
    @SerializedName("idNumber")
    @NotNull
    private String idNumber = "";
    @SerializedName("isLockBy3Level")
    private boolean isLockBy3Level;

    @Nullable
    public final List<BlackListResponse> getBlackList() {
        return this.blackList;
    }

    public final int getContractEndDayBySubscriberNumber() {
        return this.contractEndDayBySubscriberNumber;
    }

    @Nullable
    public final List<DeviceSummaryResponse> getDeviceSummary() {
        return this.deviceSummary;
    }

    @Nullable
    public final List<BlackListResponse> getGrayList() {
        return this.grayList;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    public final boolean isLockBy3Level() {
        return this.isLockBy3Level;
    }

    public final void setBlackList(@Nullable List<BlackListResponse> list) {
        this.blackList = list;
    }

    public final void setContractEndDayBySubscriberNumber(int i) {
        this.contractEndDayBySubscriberNumber = i;
    }

    public final void setDeviceSummary(@Nullable List<DeviceSummaryResponse> list) {
        this.deviceSummary = list;
    }

    public final void setGrayList(@Nullable List<BlackListResponse> list) {
        this.grayList = list;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setLockBy3Level(boolean z) {
        this.isLockBy3Level = z;
    }
}