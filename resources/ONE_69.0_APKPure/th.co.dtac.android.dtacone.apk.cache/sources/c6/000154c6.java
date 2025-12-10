package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.customerenquiry.AuthorizePrepaidResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/AuthorizePrepaidResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$3 */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$3 extends Lambda implements Function1<AuthorizePrepaidResponse, Unit> {
    final /* synthetic */ Offer $offer;
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$3(InfoAnalyticViewModel infoAnalyticViewModel, Offer offer) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
        this.$offer = offer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AuthorizePrepaidResponse authorizePrepaidResponse) {
        invoke2(authorizePrepaidResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AuthorizePrepaidResponse authorizePrepaidResponse) {
        Offer tempSelectOfferPackage = this.this$0.getTempSelectOfferPackage();
        if (tempSelectOfferPackage != null) {
            tempSelectOfferPackage.setAmount(authorizePrepaidResponse.getAmount());
        }
        this.this$0.m3163Z(this.$offer);
    }
}