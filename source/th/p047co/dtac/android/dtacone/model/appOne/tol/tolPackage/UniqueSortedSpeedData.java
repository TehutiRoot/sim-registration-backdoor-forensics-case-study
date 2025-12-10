package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/UniqueSortedSpeedData;", "", "uniqueSpeed", "", "uniqueUnit", "", "uniqueSpeedMbps", "(ILjava/lang/String;I)V", "getUniqueSpeed", "()I", "getUniqueSpeedMbps", "getUniqueUnit", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData */
/* loaded from: classes8.dex */
public final class UniqueSortedSpeedData {
    public static final int $stable = 0;
    private final int uniqueSpeed;
    private final int uniqueSpeedMbps;
    @NotNull
    private final String uniqueUnit;

    public UniqueSortedSpeedData() {
        this(0, null, 0, 7, null);
    }

    public static /* synthetic */ UniqueSortedSpeedData copy$default(UniqueSortedSpeedData uniqueSortedSpeedData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = uniqueSortedSpeedData.uniqueSpeed;
        }
        if ((i3 & 2) != 0) {
            str = uniqueSortedSpeedData.uniqueUnit;
        }
        if ((i3 & 4) != 0) {
            i2 = uniqueSortedSpeedData.uniqueSpeedMbps;
        }
        return uniqueSortedSpeedData.copy(i, str, i2);
    }

    public final int component1() {
        return this.uniqueSpeed;
    }

    @NotNull
    public final String component2() {
        return this.uniqueUnit;
    }

    public final int component3() {
        return this.uniqueSpeedMbps;
    }

    @NotNull
    public final UniqueSortedSpeedData copy(int i, @NotNull String uniqueUnit, int i2) {
        Intrinsics.checkNotNullParameter(uniqueUnit, "uniqueUnit");
        return new UniqueSortedSpeedData(i, uniqueUnit, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueSortedSpeedData) {
            UniqueSortedSpeedData uniqueSortedSpeedData = (UniqueSortedSpeedData) obj;
            return this.uniqueSpeed == uniqueSortedSpeedData.uniqueSpeed && Intrinsics.areEqual(this.uniqueUnit, uniqueSortedSpeedData.uniqueUnit) && this.uniqueSpeedMbps == uniqueSortedSpeedData.uniqueSpeedMbps;
        }
        return false;
    }

    public final int getUniqueSpeed() {
        return this.uniqueSpeed;
    }

    public final int getUniqueSpeedMbps() {
        return this.uniqueSpeedMbps;
    }

    @NotNull
    public final String getUniqueUnit() {
        return this.uniqueUnit;
    }

    public int hashCode() {
        return (((this.uniqueSpeed * 31) + this.uniqueUnit.hashCode()) * 31) + this.uniqueSpeedMbps;
    }

    @NotNull
    public String toString() {
        int i = this.uniqueSpeed;
        String str = this.uniqueUnit;
        int i2 = this.uniqueSpeedMbps;
        return "UniqueSortedSpeedData(uniqueSpeed=" + i + ", uniqueUnit=" + str + ", uniqueSpeedMbps=" + i2 + ")";
    }

    public UniqueSortedSpeedData(int i, @NotNull String uniqueUnit, int i2) {
        Intrinsics.checkNotNullParameter(uniqueUnit, "uniqueUnit");
        this.uniqueSpeed = i;
        this.uniqueUnit = uniqueUnit;
        this.uniqueSpeedMbps = i2;
    }

    public /* synthetic */ UniqueSortedSpeedData(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
