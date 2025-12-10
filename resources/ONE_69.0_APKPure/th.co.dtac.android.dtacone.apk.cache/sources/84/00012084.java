package th.p047co.dtac.android.dtacone.model.sellerID.shopList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/sellerID/shopList/ShopResponse;", "", "isOverDisplayLimit", "", "retailerList", "", "Lth/co/dtac/android/dtacone/model/sellerID/shopList/RetailerItem;", "(ZLjava/util/List;)V", "()Z", "getRetailerList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.sellerID.shopList.ShopResponse */
/* loaded from: classes8.dex */
public final class ShopResponse {
    public static final int $stable = 8;
    @SerializedName("isOverDisplayLimit")
    private final boolean isOverDisplayLimit;
    @SerializedName("retailerList")
    @Nullable
    private final List<RetailerItem> retailerList;

    public ShopResponse() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopResponse copy$default(ShopResponse shopResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shopResponse.isOverDisplayLimit;
        }
        if ((i & 2) != 0) {
            list = shopResponse.retailerList;
        }
        return shopResponse.copy(z, list);
    }

    public final boolean component1() {
        return this.isOverDisplayLimit;
    }

    @Nullable
    public final List<RetailerItem> component2() {
        return this.retailerList;
    }

    @NotNull
    public final ShopResponse copy(boolean z, @Nullable List<RetailerItem> list) {
        return new ShopResponse(z, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShopResponse) {
            ShopResponse shopResponse = (ShopResponse) obj;
            return this.isOverDisplayLimit == shopResponse.isOverDisplayLimit && Intrinsics.areEqual(this.retailerList, shopResponse.retailerList);
        }
        return false;
    }

    @Nullable
    public final List<RetailerItem> getRetailerList() {
        return this.retailerList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isOverDisplayLimit;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<RetailerItem> list = this.retailerList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final boolean isOverDisplayLimit() {
        return this.isOverDisplayLimit;
    }

    @NotNull
    public String toString() {
        boolean z = this.isOverDisplayLimit;
        List<RetailerItem> list = this.retailerList;
        return "ShopResponse(isOverDisplayLimit=" + z + ", retailerList=" + list + ")";
    }

    public ShopResponse(boolean z, @Nullable List<RetailerItem> list) {
        this.isOverDisplayLimit = z;
        this.retailerList = list;
    }

    public /* synthetic */ ShopResponse(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}