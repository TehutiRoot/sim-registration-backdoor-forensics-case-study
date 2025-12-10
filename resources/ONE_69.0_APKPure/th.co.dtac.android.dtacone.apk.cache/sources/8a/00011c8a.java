package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

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
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingData;", "", "marketingCount", "", "marketingList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "(ILjava/util/List;)V", "getMarketingCount", "()I", "getMarketingList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingData */
/* loaded from: classes8.dex */
public final class MarketingData {
    public static final int $stable = 8;
    @SerializedName("marketingCount")
    private final int marketingCount;
    @SerializedName("marketingList")
    @NotNull
    private final List<MarketingDetails> marketingList;

    public MarketingData() {
        this(0, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketingData copy$default(MarketingData marketingData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = marketingData.marketingCount;
        }
        if ((i2 & 2) != 0) {
            list = marketingData.marketingList;
        }
        return marketingData.copy(i, list);
    }

    public final int component1() {
        return this.marketingCount;
    }

    @NotNull
    public final List<MarketingDetails> component2() {
        return this.marketingList;
    }

    @NotNull
    public final MarketingData copy(int i, @NotNull List<MarketingDetails> marketingList) {
        Intrinsics.checkNotNullParameter(marketingList, "marketingList");
        return new MarketingData(i, marketingList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarketingData) {
            MarketingData marketingData = (MarketingData) obj;
            return this.marketingCount == marketingData.marketingCount && Intrinsics.areEqual(this.marketingList, marketingData.marketingList);
        }
        return false;
    }

    public final int getMarketingCount() {
        return this.marketingCount;
    }

    @NotNull
    public final List<MarketingDetails> getMarketingList() {
        return this.marketingList;
    }

    public int hashCode() {
        return (this.marketingCount * 31) + this.marketingList.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.marketingCount;
        List<MarketingDetails> list = this.marketingList;
        return "MarketingData(marketingCount=" + i + ", marketingList=" + list + ")";
    }

    public MarketingData(int i, @NotNull List<MarketingDetails> marketingList) {
        Intrinsics.checkNotNullParameter(marketingList, "marketingList");
        this.marketingCount = i;
        this.marketingList = marketingList;
    }

    public /* synthetic */ MarketingData(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}