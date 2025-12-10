package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanData;", "", "pricePlansStatus", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlansStatus;", "pricePlansList", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanListItem;", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlansStatus;Ljava/util/List;)V", "getPricePlansList", "()Ljava/util/List;", "getPricePlansStatus", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlansStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.PricePlanData */
/* loaded from: classes8.dex */
public final class PricePlanData {
    public static final int $stable = 8;
    @SerializedName("pricePlansList")
    @Nullable
    private final List<PricePlanListItem> pricePlansList;
    @SerializedName("pricePlansStatus")
    @Nullable
    private final PricePlansStatus pricePlansStatus;

    public PricePlanData() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PricePlanData copy$default(PricePlanData pricePlanData, PricePlansStatus pricePlansStatus, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pricePlansStatus = pricePlanData.pricePlansStatus;
        }
        if ((i & 2) != 0) {
            list = pricePlanData.pricePlansList;
        }
        return pricePlanData.copy(pricePlansStatus, list);
    }

    @Nullable
    public final PricePlansStatus component1() {
        return this.pricePlansStatus;
    }

    @Nullable
    public final List<PricePlanListItem> component2() {
        return this.pricePlansList;
    }

    @NotNull
    public final PricePlanData copy(@Nullable PricePlansStatus pricePlansStatus, @Nullable List<PricePlanListItem> list) {
        return new PricePlanData(pricePlansStatus, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricePlanData) {
            PricePlanData pricePlanData = (PricePlanData) obj;
            return Intrinsics.areEqual(this.pricePlansStatus, pricePlanData.pricePlansStatus) && Intrinsics.areEqual(this.pricePlansList, pricePlanData.pricePlansList);
        }
        return false;
    }

    @Nullable
    public final List<PricePlanListItem> getPricePlansList() {
        return this.pricePlansList;
    }

    @Nullable
    public final PricePlansStatus getPricePlansStatus() {
        return this.pricePlansStatus;
    }

    public int hashCode() {
        PricePlansStatus pricePlansStatus = this.pricePlansStatus;
        int hashCode = (pricePlansStatus == null ? 0 : pricePlansStatus.hashCode()) * 31;
        List<PricePlanListItem> list = this.pricePlansList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        PricePlansStatus pricePlansStatus = this.pricePlansStatus;
        List<PricePlanListItem> list = this.pricePlansList;
        return "PricePlanData(pricePlansStatus=" + pricePlansStatus + ", pricePlansList=" + list + ")";
    }

    public PricePlanData(@Nullable PricePlansStatus pricePlansStatus, @Nullable List<PricePlanListItem> list) {
        this.pricePlansStatus = pricePlansStatus;
        this.pricePlansList = list;
    }

    public /* synthetic */ PricePlanData(PricePlansStatus pricePlansStatus, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pricePlansStatus, (i & 2) != 0 ? null : list);
    }
}
