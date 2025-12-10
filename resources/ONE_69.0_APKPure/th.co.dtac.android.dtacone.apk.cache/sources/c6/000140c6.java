package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingResponse;", "", "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingItem;", "marketingList", "", "marketingCount", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getMarketingList", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getMarketingCount", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.MarketingResponse */
/* loaded from: classes10.dex */
public final class MarketingResponse {

    /* renamed from: a */
    public final List f97967a;

    /* renamed from: b */
    public final int f97968b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingResponse$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/MarketingResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.MarketingResponse$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MarketingResponse mock() {
            return new MarketingResponse(CollectionsKt__CollectionsKt.listOf((Object[]) new MarketingItem[]{new MarketingItem("MKT001", "FTOT66-1000 FTTH Gigatex Flexi 1G/500M. 4POTT+TMH15GB insurance", "100", "20", "Mbps", "Mbps", true, true, 500), new MarketingItem("MKT002", "FTOT67-1000 FTTH Gigatex Flexi 1G/500M. 4POTT+TMH15GB insurance", Constant.SERVER_ERROR_CODE, "50", "Mbps", "Mbps", true, true, 800), new MarketingItem("MKT003", "FTOT68-1000 FTTH Gigatex Flexi 1G/500M. 4POTT+TMH15GB insurance", "50", "10", "Mbps", "Mbps", true, true, 300)}), 3);
        }

        public Companion() {
        }
    }

    public MarketingResponse() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketingResponse copy$default(MarketingResponse marketingResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = marketingResponse.f97967a;
        }
        if ((i2 & 2) != 0) {
            i = marketingResponse.f97968b;
        }
        return marketingResponse.copy(list, i);
    }

    @NotNull
    public final List<MarketingItem> component1() {
        return this.f97967a;
    }

    public final int component2() {
        return this.f97968b;
    }

    @NotNull
    public final MarketingResponse copy(@NotNull List<MarketingItem> marketingList, int i) {
        Intrinsics.checkNotNullParameter(marketingList, "marketingList");
        return new MarketingResponse(marketingList, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarketingResponse) {
            MarketingResponse marketingResponse = (MarketingResponse) obj;
            return Intrinsics.areEqual(this.f97967a, marketingResponse.f97967a) && this.f97968b == marketingResponse.f97968b;
        }
        return false;
    }

    public final int getMarketingCount() {
        return this.f97968b;
    }

    @NotNull
    public final List<MarketingItem> getMarketingList() {
        return this.f97967a;
    }

    public int hashCode() {
        return (this.f97967a.hashCode() * 31) + this.f97968b;
    }

    @NotNull
    public String toString() {
        List list = this.f97967a;
        int i = this.f97968b;
        return "MarketingResponse(marketingList=" + list + ", marketingCount=" + i + ")";
    }

    public MarketingResponse(@NotNull List<MarketingItem> marketingList, int i) {
        Intrinsics.checkNotNullParameter(marketingList, "marketingList");
        this.f97967a = marketingList;
        this.f97968b = i;
    }

    public /* synthetic */ MarketingResponse(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}