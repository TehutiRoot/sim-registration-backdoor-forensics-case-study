package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolCardListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "response", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolCardListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$getPaymentInfo$3 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$getPaymentInfo$3 extends Lambda implements Function1<Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse>, Unit> {
    final /* synthetic */ OneBuyDolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolViewModel$getPaymentInfo$3(OneBuyDolViewModel oneBuyDolViewModel) {
        super(1);
        this.this$0 = oneBuyDolViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends OneBuyDolDirectAccountResponse, ? extends OneBuyDolCardListResponse> pair) {
        invoke2((Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<OneBuyDolDirectAccountResponse, OneBuyDolCardListResponse> pair) {
        MutableLiveData m15884b0;
        m15884b0 = this.this$0.m15884b0();
        m15884b0.setValue(Resource.Companion.success(pair));
    }
}