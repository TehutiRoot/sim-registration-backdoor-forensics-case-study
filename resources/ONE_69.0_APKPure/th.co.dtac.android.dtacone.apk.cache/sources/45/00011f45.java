package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/Location;", "", "flowIds", "", "", "locationId", "(Ljava/util/List;Ljava/lang/String;)V", "getFlowIds", "()Ljava/util/List;", "getLocationId", "()Ljava/lang/String;", "setLocationId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.Location */
/* loaded from: classes8.dex */
public final class Location {
    public static final int $stable = 8;
    @SerializedName("flowIds")
    @NotNull
    private final List<String> flowIds;
    @SerializedName("locationId")
    @NotNull
    private String locationId;

    public Location() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Location copy$default(Location location, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = location.flowIds;
        }
        if ((i & 2) != 0) {
            str = location.locationId;
        }
        return location.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.flowIds;
    }

    @NotNull
    public final String component2() {
        return this.locationId;
    }

    @NotNull
    public final Location copy(@NotNull List<String> flowIds, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(flowIds, "flowIds");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        return new Location(flowIds, locationId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Location) {
            Location location = (Location) obj;
            return Intrinsics.areEqual(this.flowIds, location.flowIds) && Intrinsics.areEqual(this.locationId, location.locationId);
        }
        return false;
    }

    @NotNull
    public final List<String> getFlowIds() {
        return this.flowIds;
    }

    @NotNull
    public final String getLocationId() {
        return this.locationId;
    }

    public int hashCode() {
        return (this.flowIds.hashCode() * 31) + this.locationId.hashCode();
    }

    public final void setLocationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locationId = str;
    }

    @NotNull
    public String toString() {
        List<String> list = this.flowIds;
        String str = this.locationId;
        return "Location(flowIds=" + list + ", locationId=" + str + ")";
    }

    public Location(@NotNull List<String> flowIds, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(flowIds, "flowIds");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.flowIds = flowIds;
        this.locationId = locationId;
    }

    public /* synthetic */ Location(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
    }
}