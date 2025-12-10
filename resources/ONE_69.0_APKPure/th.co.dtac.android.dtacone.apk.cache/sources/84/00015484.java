package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.util.p052enum.SellingType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$callAPIBuyOfferFail$2 */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel$callAPIBuyOfferFail$2 extends Lambda implements Function1<ResponseBody, Unit> {
    final /* synthetic */ Offer $offer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticViewModel$callAPIBuyOfferFail$2(Offer offer) {
        super(1);
        this.$offer = offer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ResponseBody responseBody) {
        invoke2(responseBody);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ResponseBody responseBody) {
        SellingType sellingType = this.$offer.getSellingType();
        StringBuilder sb = new StringBuilder();
        sb.append("Call BuyOffer");
        sb.append(sellingType);
        sb.append("Fail Success");
    }
}