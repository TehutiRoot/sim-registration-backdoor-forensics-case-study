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
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanItem;", "", "transactionId", "", "pricePlans", "", "(Ljava/lang/String;Ljava/util/List;)V", "getPricePlans", "()Ljava/util/List;", "getTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.PricePlanItem */
/* loaded from: classes8.dex */
public final class PricePlanItem {
    public static final int $stable = 8;
    @SerializedName("pricePlans")
    @Nullable
    private final List<String> pricePlans;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    public PricePlanItem() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PricePlanItem copy$default(PricePlanItem pricePlanItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pricePlanItem.transactionId;
        }
        if ((i & 2) != 0) {
            list = pricePlanItem.pricePlans;
        }
        return pricePlanItem.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.transactionId;
    }

    @Nullable
    public final List<String> component2() {
        return this.pricePlans;
    }

    @NotNull
    public final PricePlanItem copy(@Nullable String str, @Nullable List<String> list) {
        return new PricePlanItem(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricePlanItem) {
            PricePlanItem pricePlanItem = (PricePlanItem) obj;
            return Intrinsics.areEqual(this.transactionId, pricePlanItem.transactionId) && Intrinsics.areEqual(this.pricePlans, pricePlanItem.pricePlans);
        }
        return false;
    }

    @Nullable
    public final List<String> getPricePlans() {
        return this.pricePlans;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.pricePlans;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.transactionId;
        List<String> list = this.pricePlans;
        return "PricePlanItem(transactionId=" + str + ", pricePlans=" + list + ")";
    }

    public PricePlanItem(@Nullable String str, @Nullable List<String> list) {
        this.transactionId = str;
        this.pricePlans = list;
    }

    public /* synthetic */ PricePlanItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
