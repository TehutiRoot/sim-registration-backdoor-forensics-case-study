package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneBuyDolPriceListSimRModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "priceList", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$getPriceList$3 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$getPriceList$3 extends Lambda implements Function1<OneBuyDolPriceListResponse, Unit> {
    final /* synthetic */ String $featureCode;
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$getPriceList$3(String str, OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.$featureCode = str;
        this.this$0 = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneBuyDolPriceListResponse oneBuyDolPriceListResponse) {
        invoke2(oneBuyDolPriceListResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneBuyDolPriceListResponse oneBuyDolPriceListResponse) {
        MutableLiveData m20169G0;
        Pair pair = new Pair(this.$featureCode, new OneBuyDolPriceListSimRModel(this.this$0.getSimR(), oneBuyDolPriceListResponse));
        m20169G0 = this.this$0.m20169G0();
        m20169G0.setValue(Resource.Companion.success(pair));
    }
}