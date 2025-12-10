package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundSubmitResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundSubmitResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel$oneNadOutboundSubmit$2 */
/* loaded from: classes10.dex */
public final class OneNadOutboundViewModel$oneNadOutboundSubmit$2 extends Lambda implements Function1<OneNadOutboundSubmitResponse, Unit> {
    final /* synthetic */ OneNadOutboundViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundViewModel$oneNadOutboundSubmit$2(OneNadOutboundViewModel oneNadOutboundViewModel) {
        super(1);
        this.this$0 = oneNadOutboundViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneNadOutboundSubmitResponse oneNadOutboundSubmitResponse) {
        invoke2(oneNadOutboundSubmitResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneNadOutboundSubmitResponse oneNadOutboundSubmitResponse) {
        MutableLiveData m13255v;
        m13255v = this.this$0.m13255v();
        m13255v.setValue(Resource.Companion.success(null));
    }
}