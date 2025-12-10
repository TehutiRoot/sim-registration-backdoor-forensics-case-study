package th.p047co.dtac.android.dtacone.model.appOne.tol.discount;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "", "discountOfferCode", "", "discountOfferName", "discountInfoList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountInfoItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDiscountInfoList", "()Ljava/util/List;", "getDiscountOfferCode", "()Ljava/lang/String;", "getDiscountOfferName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.discount.DiscountItem */
/* loaded from: classes8.dex */
public final class DiscountItem {
    public static final int $stable = 8;
    @SerializedName("discountInfoList")
    @NotNull
    private final List<DiscountInfoItem> discountInfoList;
    @SerializedName("discountOfferCode")
    @NotNull
    private final String discountOfferCode;
    @SerializedName("discountOfferName")
    @NotNull
    private final String discountOfferName;

    public DiscountItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscountItem copy$default(DiscountItem discountItem, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountItem.discountOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = discountItem.discountOfferName;
        }
        if ((i & 4) != 0) {
            list = discountItem.discountInfoList;
        }
        return discountItem.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.discountOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.discountOfferName;
    }

    @NotNull
    public final List<DiscountInfoItem> component3() {
        return this.discountInfoList;
    }

    @NotNull
    public final DiscountItem copy(@NotNull String discountOfferCode, @NotNull String discountOfferName, @NotNull List<DiscountInfoItem> discountInfoList) {
        Intrinsics.checkNotNullParameter(discountOfferCode, "discountOfferCode");
        Intrinsics.checkNotNullParameter(discountOfferName, "discountOfferName");
        Intrinsics.checkNotNullParameter(discountInfoList, "discountInfoList");
        return new DiscountItem(discountOfferCode, discountOfferName, discountInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscountItem) {
            DiscountItem discountItem = (DiscountItem) obj;
            return Intrinsics.areEqual(this.discountOfferCode, discountItem.discountOfferCode) && Intrinsics.areEqual(this.discountOfferName, discountItem.discountOfferName) && Intrinsics.areEqual(this.discountInfoList, discountItem.discountInfoList);
        }
        return false;
    }

    @NotNull
    public final List<DiscountInfoItem> getDiscountInfoList() {
        return this.discountInfoList;
    }

    @NotNull
    public final String getDiscountOfferCode() {
        return this.discountOfferCode;
    }

    @NotNull
    public final String getDiscountOfferName() {
        return this.discountOfferName;
    }

    public int hashCode() {
        return (((this.discountOfferCode.hashCode() * 31) + this.discountOfferName.hashCode()) * 31) + this.discountInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.discountOfferCode;
        String str2 = this.discountOfferName;
        List<DiscountInfoItem> list = this.discountInfoList;
        return "DiscountItem(discountOfferCode=" + str + ", discountOfferName=" + str2 + ", discountInfoList=" + list + ")";
    }

    public DiscountItem(@NotNull String discountOfferCode, @NotNull String discountOfferName, @NotNull List<DiscountInfoItem> discountInfoList) {
        Intrinsics.checkNotNullParameter(discountOfferCode, "discountOfferCode");
        Intrinsics.checkNotNullParameter(discountOfferName, "discountOfferName");
        Intrinsics.checkNotNullParameter(discountInfoList, "discountInfoList");
        this.discountOfferCode = discountOfferCode;
        this.discountOfferName = discountOfferName;
        this.discountInfoList = discountInfoList;
    }

    public /* synthetic */ DiscountItem(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
