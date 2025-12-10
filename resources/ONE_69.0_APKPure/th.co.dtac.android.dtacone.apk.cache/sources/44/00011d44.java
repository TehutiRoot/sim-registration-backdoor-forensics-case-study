package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/OffersPackageItem;", "", "packageGroupCode", "", "packageCode", "locationId", "flowId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlowId", "()Ljava/lang/String;", "setFlowId", "(Ljava/lang/String;)V", "getLocationId", "setLocationId", "getPackageCode", "setPackageCode", "getPackageGroupCode", "setPackageGroupCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.OffersPackageItem */
/* loaded from: classes8.dex */
public final class OffersPackageItem {
    public static final int $stable = 8;
    @SerializedName("flowId")
    @NotNull
    private String flowId;
    @SerializedName("locationId")
    @NotNull
    private String locationId;
    @SerializedName("packageCode")
    @NotNull
    private String packageCode;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;

    public OffersPackageItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OffersPackageItem copy$default(OffersPackageItem offersPackageItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offersPackageItem.packageGroupCode;
        }
        if ((i & 2) != 0) {
            str2 = offersPackageItem.packageCode;
        }
        if ((i & 4) != 0) {
            str3 = offersPackageItem.locationId;
        }
        if ((i & 8) != 0) {
            str4 = offersPackageItem.flowId;
        }
        return offersPackageItem.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component2() {
        return this.packageCode;
    }

    @NotNull
    public final String component3() {
        return this.locationId;
    }

    @NotNull
    public final String component4() {
        return this.flowId;
    }

    @NotNull
    public final OffersPackageItem copy(@NotNull String packageGroupCode, @NotNull String packageCode, @NotNull String locationId, @NotNull String flowId) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return new OffersPackageItem(packageGroupCode, packageCode, locationId, flowId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffersPackageItem) {
            OffersPackageItem offersPackageItem = (OffersPackageItem) obj;
            return Intrinsics.areEqual(this.packageGroupCode, offersPackageItem.packageGroupCode) && Intrinsics.areEqual(this.packageCode, offersPackageItem.packageCode) && Intrinsics.areEqual(this.locationId, offersPackageItem.locationId) && Intrinsics.areEqual(this.flowId, offersPackageItem.flowId);
        }
        return false;
    }

    @NotNull
    public final String getFlowId() {
        return this.flowId;
    }

    @NotNull
    public final String getLocationId() {
        return this.locationId;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    public int hashCode() {
        return (((((this.packageGroupCode.hashCode() * 31) + this.packageCode.hashCode()) * 31) + this.locationId.hashCode()) * 31) + this.flowId.hashCode();
    }

    public final void setFlowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flowId = str;
    }

    public final void setLocationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locationId = str;
    }

    public final void setPackageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageCode = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupCode;
        String str2 = this.packageCode;
        String str3 = this.locationId;
        String str4 = this.flowId;
        return "OffersPackageItem(packageGroupCode=" + str + ", packageCode=" + str2 + ", locationId=" + str3 + ", flowId=" + str4 + ")";
    }

    public OffersPackageItem(@NotNull String packageGroupCode, @NotNull String packageCode, @NotNull String locationId, @NotNull String flowId) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        this.packageGroupCode = packageGroupCode;
        this.packageCode = packageCode;
        this.locationId = locationId;
        this.flowId = flowId;
    }

    public /* synthetic */ OffersPackageItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}