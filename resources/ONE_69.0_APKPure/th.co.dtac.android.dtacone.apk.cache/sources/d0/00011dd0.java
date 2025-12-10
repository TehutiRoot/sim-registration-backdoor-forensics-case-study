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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/NextDayPackage;", "", "packageGroupCode", "", "packageGroupDescription", "mainPackage", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMainPackage", "()Ljava/util/List;", "getPackageGroupCode", "()Ljava/lang/String;", "getPackageGroupDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.NextDayPackage */
/* loaded from: classes8.dex */
public final class NextDayPackage {
    public static final int $stable = 8;
    @SerializedName("mainPackage")
    @Nullable
    private final List<PackageItem> mainPackage;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @Nullable
    private final String packageGroupDescription;

    public NextDayPackage() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NextDayPackage copy$default(NextDayPackage nextDayPackage, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nextDayPackage.packageGroupCode;
        }
        if ((i & 2) != 0) {
            str2 = nextDayPackage.packageGroupDescription;
        }
        if ((i & 4) != 0) {
            list = nextDayPackage.mainPackage;
        }
        return nextDayPackage.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String component2() {
        return this.packageGroupDescription;
    }

    @Nullable
    public final List<PackageItem> component3() {
        return this.mainPackage;
    }

    @NotNull
    public final NextDayPackage copy(@Nullable String str, @Nullable String str2, @Nullable List<PackageItem> list) {
        return new NextDayPackage(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NextDayPackage) {
            NextDayPackage nextDayPackage = (NextDayPackage) obj;
            return Intrinsics.areEqual(this.packageGroupCode, nextDayPackage.packageGroupCode) && Intrinsics.areEqual(this.packageGroupDescription, nextDayPackage.packageGroupDescription) && Intrinsics.areEqual(this.mainPackage, nextDayPackage.mainPackage);
        }
        return false;
    }

    @Nullable
    public final List<PackageItem> getMainPackage() {
        return this.mainPackage;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    public int hashCode() {
        String str = this.packageGroupCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageGroupDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PackageItem> list = this.mainPackage;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupCode;
        String str2 = this.packageGroupDescription;
        List<PackageItem> list = this.mainPackage;
        return "NextDayPackage(packageGroupCode=" + str + ", packageGroupDescription=" + str2 + ", mainPackage=" + list + ")";
    }

    public NextDayPackage(@Nullable String str, @Nullable String str2, @Nullable List<PackageItem> list) {
        this.packageGroupCode = str;
        this.packageGroupDescription = str2;
        this.mainPackage = list;
    }

    public /* synthetic */ NextDayPackage(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}