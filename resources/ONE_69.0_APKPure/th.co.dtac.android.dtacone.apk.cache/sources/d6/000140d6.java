package th.p047co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixLinePlusMarketingResponse;", "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/MarketingData;", "data", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/MarketingData;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/MarketingData;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/MarketingData;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixLinePlusMarketingResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/MarketingData;", "getData", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.FixLinePlusMarketingResponse */
/* loaded from: classes10.dex */
public final class FixLinePlusMarketingResponse {

    /* renamed from: a */
    public final MarketingData f98015a;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixLinePlusMarketingResponse$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixLinePlusMarketingResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.FixLinePlusMarketingResponse$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FixLinePlusMarketingResponse mock() {
            return new FixLinePlusMarketingResponse(new MarketingData("S", CollectionsKt__CollectionsKt.listOf((Object[]) new MarketingCode[]{new MarketingCode("FL3POTT", "FL3POTT : TrueSmartChoice 3POTT + Fixedline plus"), new MarketingCode("FL4POTT", "FL4POTT : TrueSmartChoice 4POTT + Fixedline plus"), new MarketingCode("FL5POTT", "FL5POTT : TrueSmartChoice 3POTT + Fixedline plus")})));
        }

        public Companion() {
        }
    }

    public FixLinePlusMarketingResponse(@NotNull MarketingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f98015a = data;
    }

    public static /* synthetic */ FixLinePlusMarketingResponse copy$default(FixLinePlusMarketingResponse fixLinePlusMarketingResponse, MarketingData marketingData, int i, Object obj) {
        if ((i & 1) != 0) {
            marketingData = fixLinePlusMarketingResponse.f98015a;
        }
        return fixLinePlusMarketingResponse.copy(marketingData);
    }

    @NotNull
    public final MarketingData component1() {
        return this.f98015a;
    }

    @NotNull
    public final FixLinePlusMarketingResponse copy(@NotNull MarketingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new FixLinePlusMarketingResponse(data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixLinePlusMarketingResponse) && Intrinsics.areEqual(this.f98015a, ((FixLinePlusMarketingResponse) obj).f98015a);
    }

    @NotNull
    public final MarketingData getData() {
        return this.f98015a;
    }

    public int hashCode() {
        return this.f98015a.hashCode();
    }

    @NotNull
    public String toString() {
        MarketingData marketingData = this.f98015a;
        return "FixLinePlusMarketingResponse(data=" + marketingData + ")";
    }
}