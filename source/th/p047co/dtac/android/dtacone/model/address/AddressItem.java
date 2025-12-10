package th.p047co.dtac.android.dtacone.model.address;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/address/AddressItem;", "", "provinceItem", "Lkotlin/Pair;", "", "", "districtItem", "subDistrictItem", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;)V", "getDistrictItem", "()Lkotlin/Pair;", "getProvinceItem", "getSubDistrictItem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.address.AddressItem */
/* loaded from: classes8.dex */
public final class AddressItem {
    public static final int $stable = 0;
    @Nullable
    private final Pair<Long, String> districtItem;
    @Nullable
    private final Pair<Long, String> provinceItem;
    @Nullable
    private final Pair<Long, String> subDistrictItem;

    public AddressItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, Pair pair, Pair pair2, Pair pair3, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = addressItem.provinceItem;
        }
        if ((i & 2) != 0) {
            pair2 = addressItem.districtItem;
        }
        if ((i & 4) != 0) {
            pair3 = addressItem.subDistrictItem;
        }
        return addressItem.copy(pair, pair2, pair3);
    }

    @Nullable
    public final Pair<Long, String> component1() {
        return this.provinceItem;
    }

    @Nullable
    public final Pair<Long, String> component2() {
        return this.districtItem;
    }

    @Nullable
    public final Pair<Long, String> component3() {
        return this.subDistrictItem;
    }

    @NotNull
    public final AddressItem copy(@Nullable Pair<Long, String> pair, @Nullable Pair<Long, String> pair2, @Nullable Pair<Long, String> pair3) {
        return new AddressItem(pair, pair2, pair3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressItem) {
            AddressItem addressItem = (AddressItem) obj;
            return Intrinsics.areEqual(this.provinceItem, addressItem.provinceItem) && Intrinsics.areEqual(this.districtItem, addressItem.districtItem) && Intrinsics.areEqual(this.subDistrictItem, addressItem.subDistrictItem);
        }
        return false;
    }

    @Nullable
    public final Pair<Long, String> getDistrictItem() {
        return this.districtItem;
    }

    @Nullable
    public final Pair<Long, String> getProvinceItem() {
        return this.provinceItem;
    }

    @Nullable
    public final Pair<Long, String> getSubDistrictItem() {
        return this.subDistrictItem;
    }

    public int hashCode() {
        Pair<Long, String> pair = this.provinceItem;
        int hashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair<Long, String> pair2 = this.districtItem;
        int hashCode2 = (hashCode + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair<Long, String> pair3 = this.subDistrictItem;
        return hashCode2 + (pair3 != null ? pair3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Pair<Long, String> pair = this.provinceItem;
        Pair<Long, String> pair2 = this.districtItem;
        Pair<Long, String> pair3 = this.subDistrictItem;
        return "AddressItem(provinceItem=" + pair + ", districtItem=" + pair2 + ", subDistrictItem=" + pair3 + ")";
    }

    public AddressItem(@Nullable Pair<Long, String> pair, @Nullable Pair<Long, String> pair2, @Nullable Pair<Long, String> pair3) {
        this.provinceItem = pair;
        this.districtItem = pair2;
        this.subDistrictItem = pair3;
    }

    public /* synthetic */ AddressItem(Pair pair, Pair pair2, Pair pair3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pair, (i & 2) != 0 ? null : pair2, (i & 4) != 0 ? null : pair3);
    }
}
