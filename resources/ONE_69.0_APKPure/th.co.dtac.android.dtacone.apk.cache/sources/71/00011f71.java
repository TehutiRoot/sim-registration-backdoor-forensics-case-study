package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimDisCountItem;", "", "name", "", "countNumber", "", "countValue", "(Ljava/lang/String;II)V", "getCountNumber", "()I", "getCountValue", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSimDisCountItem */
/* loaded from: classes8.dex */
public final class MultiSimDisCountItem {
    public static final int $stable = 0;
    private final int countNumber;
    private final int countValue;
    @NotNull
    private final String name;

    public MultiSimDisCountItem(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.countNumber = i;
        this.countValue = i2;
    }

    public static /* synthetic */ MultiSimDisCountItem copy$default(MultiSimDisCountItem multiSimDisCountItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = multiSimDisCountItem.name;
        }
        if ((i3 & 2) != 0) {
            i = multiSimDisCountItem.countNumber;
        }
        if ((i3 & 4) != 0) {
            i2 = multiSimDisCountItem.countValue;
        }
        return multiSimDisCountItem.copy(str, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.countNumber;
    }

    public final int component3() {
        return this.countValue;
    }

    @NotNull
    public final MultiSimDisCountItem copy(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MultiSimDisCountItem(name, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiSimDisCountItem) {
            MultiSimDisCountItem multiSimDisCountItem = (MultiSimDisCountItem) obj;
            return Intrinsics.areEqual(this.name, multiSimDisCountItem.name) && this.countNumber == multiSimDisCountItem.countNumber && this.countValue == multiSimDisCountItem.countValue;
        }
        return false;
    }

    public final int getCountNumber() {
        return this.countNumber;
    }

    public final int getCountValue() {
        return this.countValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.countNumber) * 31) + this.countValue;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        int i = this.countNumber;
        int i2 = this.countValue;
        return "MultiSimDisCountItem(name=" + str + ", countNumber=" + i + ", countValue=" + i2 + ")";
    }
}