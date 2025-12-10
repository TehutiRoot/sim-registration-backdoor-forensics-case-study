package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

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
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/Data;", "", "packages", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PackagesItem;", "(Ljava/util/List;)V", "getPackages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("packages")
    @NotNull
    private final List<PackagesItem> packages;

    public Data() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = data.packages;
        }
        return data.copy(list);
    }

    @NotNull
    public final List<PackagesItem> component1() {
        return this.packages;
    }

    @NotNull
    public final Data copy(@NotNull List<PackagesItem> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        return new Data(packages);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Data) && Intrinsics.areEqual(this.packages, ((Data) obj).packages);
    }

    @NotNull
    public final List<PackagesItem> getPackages() {
        return this.packages;
    }

    public int hashCode() {
        return this.packages.hashCode();
    }

    @NotNull
    public String toString() {
        List<PackagesItem> list = this.packages;
        return "Data(packages=" + list + ")";
    }

    public Data(@NotNull List<PackagesItem> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.packages = packages;
    }

    public /* synthetic */ Data(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}