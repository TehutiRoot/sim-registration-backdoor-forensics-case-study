package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Paginate;", "", "totalItem", "", "itemPerPage", "pageIndex", "(III)V", "getItemPerPage", "()I", "getPageIndex", "getTotalItem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.Paginate */
/* loaded from: classes8.dex */
public final class Paginate {
    public static final int $stable = 0;
    private final int itemPerPage;
    private final int pageIndex;
    private final int totalItem;

    public Paginate() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ Paginate copy$default(Paginate paginate, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = paginate.totalItem;
        }
        if ((i4 & 2) != 0) {
            i2 = paginate.itemPerPage;
        }
        if ((i4 & 4) != 0) {
            i3 = paginate.pageIndex;
        }
        return paginate.copy(i, i2, i3);
    }

    public final int component1() {
        return this.totalItem;
    }

    public final int component2() {
        return this.itemPerPage;
    }

    public final int component3() {
        return this.pageIndex;
    }

    @NotNull
    public final Paginate copy(int i, int i2, int i3) {
        return new Paginate(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Paginate) {
            Paginate paginate = (Paginate) obj;
            return this.totalItem == paginate.totalItem && this.itemPerPage == paginate.itemPerPage && this.pageIndex == paginate.pageIndex;
        }
        return false;
    }

    public final int getItemPerPage() {
        return this.itemPerPage;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getTotalItem() {
        return this.totalItem;
    }

    public int hashCode() {
        return (((this.totalItem * 31) + this.itemPerPage) * 31) + this.pageIndex;
    }

    @NotNull
    public String toString() {
        int i = this.totalItem;
        int i2 = this.itemPerPage;
        int i3 = this.pageIndex;
        return "Paginate(totalItem=" + i + ", itemPerPage=" + i2 + ", pageIndex=" + i3 + ")";
    }

    public Paginate(int i, int i2, int i3) {
        this.totalItem = i;
        this.itemPerPage = i2;
        this.pageIndex = i3;
    }

    public /* synthetic */ Paginate(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}