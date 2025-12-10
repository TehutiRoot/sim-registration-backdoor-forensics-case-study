package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.configuration.featureconfig.BuyDolConfig;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolChargeV2Request;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolChargeResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$charge$3 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$charge$3 extends Lambda implements Function1<OneBuyDolChargeResponse, Unit> {
    final /* synthetic */ OneBuyDolChargeV2Request $charge;
    final /* synthetic */ OneBuyDolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolViewModel$charge$3(OneBuyDolChargeV2Request oneBuyDolChargeV2Request, OneBuyDolViewModel oneBuyDolViewModel) {
        super(1);
        this.$charge = oneBuyDolChargeV2Request;
        this.this$0 = oneBuyDolViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneBuyDolChargeResponse oneBuyDolChargeResponse) {
        invoke2(oneBuyDolChargeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneBuyDolChargeResponse oneBuyDolChargeResponse) {
        MutableLiveData m15891V;
        String authorizeUrl;
        MutableLiveData m15891V2;
        MutableLiveData m15891V3;
        if (this.$charge.isChargeByDirectAccount()) {
            m15891V3 = this.this$0.m15891V();
            m15891V3.setValue(Resource.Companion.success(new Pair(oneBuyDolChargeResponse, new Pair(BuyDolConfig.ON_CHARGE_DIRECT_ACCOUNT_RESULT, null))));
        } else if (this.$charge.isChargeByCreditCard() && (authorizeUrl = oneBuyDolChargeResponse.getAuthorizeUrl()) != null && authorizeUrl.length() != 0) {
            m15891V2 = this.this$0.m15891V();
            m15891V2.setValue(Resource.Companion.success(new Pair(oneBuyDolChargeResponse, new Pair(BuyDolConfig.ON_3DS_CHARGE_CREDIT_CARD_RESULT, this.$charge.getCardCharge()))));
        } else if (this.$charge.isChargeByCreditCard()) {
            String authorizeUrl2 = oneBuyDolChargeResponse.getAuthorizeUrl();
            if (authorizeUrl2 == null || authorizeUrl2.length() == 0) {
                m15891V = this.this$0.m15891V();
                m15891V.setValue(Resource.Companion.success(new Pair(oneBuyDolChargeResponse, new Pair(BuyDolConfig.ON_CHARGE_CREDIT_CARD_RESULT, this.$charge.getCardCharge()))));
            }
        }
    }
}