package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetAdditionalPackageGroupResponse;", "", "packageRefNo", "", "(Ljava/lang/String;)V", "getPackageRefNo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetAdditionalPackageGroupResponse */
/* loaded from: classes8.dex */
public final class GetAdditionalPackageGroupResponse {
    public static final int $stable = 0;
    @SerializedName("packageRefNo")
    @NotNull
    private final String packageRefNo;

    public GetAdditionalPackageGroupResponse(@NotNull String packageRefNo) {
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        this.packageRefNo = packageRefNo;
    }

    public static /* synthetic */ GetAdditionalPackageGroupResponse copy$default(GetAdditionalPackageGroupResponse getAdditionalPackageGroupResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdditionalPackageGroupResponse.packageRefNo;
        }
        return getAdditionalPackageGroupResponse.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.packageRefNo;
    }

    @NotNull
    public final GetAdditionalPackageGroupResponse copy(@NotNull String packageRefNo) {
        Intrinsics.checkNotNullParameter(packageRefNo, "packageRefNo");
        return new GetAdditionalPackageGroupResponse(packageRefNo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAdditionalPackageGroupResponse) && Intrinsics.areEqual(this.packageRefNo, ((GetAdditionalPackageGroupResponse) obj).packageRefNo);
    }

    @NotNull
    public final String getPackageRefNo() {
        return this.packageRefNo;
    }

    public int hashCode() {
        return this.packageRefNo.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.packageRefNo;
        return "GetAdditionalPackageGroupResponse(packageRefNo=" + str + ")";
    }
}