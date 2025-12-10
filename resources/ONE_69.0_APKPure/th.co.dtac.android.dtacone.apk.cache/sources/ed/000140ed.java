package th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryTolInfo;", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "tolCampaign", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "tolMarketing", "<init>", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;)V", "component1", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "component2", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "copy", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryTolInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "getTolCampaign", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "getTolMarketing", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryTolInfo */
/* loaded from: classes10.dex */
public final class PaymentSummaryTolInfo {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Campaign f98051a;

    /* renamed from: b */
    public final MarketingDetails f98052b;

    public PaymentSummaryTolInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PaymentSummaryTolInfo copy$default(PaymentSummaryTolInfo paymentSummaryTolInfo, Campaign campaign, MarketingDetails marketingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            campaign = paymentSummaryTolInfo.f98051a;
        }
        if ((i & 2) != 0) {
            marketingDetails = paymentSummaryTolInfo.f98052b;
        }
        return paymentSummaryTolInfo.copy(campaign, marketingDetails);
    }

    @NotNull
    public final Campaign component1() {
        return this.f98051a;
    }

    @NotNull
    public final MarketingDetails component2() {
        return this.f98052b;
    }

    @NotNull
    public final PaymentSummaryTolInfo copy(@NotNull Campaign tolCampaign, @NotNull MarketingDetails tolMarketing) {
        Intrinsics.checkNotNullParameter(tolCampaign, "tolCampaign");
        Intrinsics.checkNotNullParameter(tolMarketing, "tolMarketing");
        return new PaymentSummaryTolInfo(tolCampaign, tolMarketing);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSummaryTolInfo) {
            PaymentSummaryTolInfo paymentSummaryTolInfo = (PaymentSummaryTolInfo) obj;
            return Intrinsics.areEqual(this.f98051a, paymentSummaryTolInfo.f98051a) && Intrinsics.areEqual(this.f98052b, paymentSummaryTolInfo.f98052b);
        }
        return false;
    }

    @NotNull
    public final Campaign getTolCampaign() {
        return this.f98051a;
    }

    @NotNull
    public final MarketingDetails getTolMarketing() {
        return this.f98052b;
    }

    public int hashCode() {
        return (this.f98051a.hashCode() * 31) + this.f98052b.hashCode();
    }

    @NotNull
    public String toString() {
        Campaign campaign = this.f98051a;
        MarketingDetails marketingDetails = this.f98052b;
        return "PaymentSummaryTolInfo(tolCampaign=" + campaign + ", tolMarketing=" + marketingDetails + ")";
    }

    public PaymentSummaryTolInfo(@NotNull Campaign tolCampaign, @NotNull MarketingDetails tolMarketing) {
        Intrinsics.checkNotNullParameter(tolCampaign, "tolCampaign");
        Intrinsics.checkNotNullParameter(tolMarketing, "tolMarketing");
        this.f98051a = tolCampaign;
        this.f98052b = tolMarketing;
    }

    public /* synthetic */ PaymentSummaryTolInfo(Campaign campaign, MarketingDetails marketingDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PaymentSummaryTolInfo paymentSummaryTolInfo;
        MarketingDetails marketingDetails2;
        Campaign campaign2 = (i & 1) != 0 ? new Campaign(null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, 16383, null) : campaign;
        if ((i & 2) != 0) {
            marketingDetails2 = new MarketingDetails(null, null, null, null, null, null, 0, 127, null);
            paymentSummaryTolInfo = this;
        } else {
            paymentSummaryTolInfo = this;
            marketingDetails2 = marketingDetails;
        }
        new PaymentSummaryTolInfo(campaign2, marketingDetails2);
    }
}