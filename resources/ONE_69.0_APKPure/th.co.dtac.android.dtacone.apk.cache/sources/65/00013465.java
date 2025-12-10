package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "response", "", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel$clickToggleBillRemaining$3 */
/* loaded from: classes10.dex */
public final class OneNadOutboundViewModel$clickToggleBillRemaining$3 extends Lambda implements Function1<List<? extends OneNadOutboundBillingItem>, Unit> {
    final /* synthetic */ OneNadOutboundViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundViewModel$clickToggleBillRemaining$3(OneNadOutboundViewModel oneNadOutboundViewModel) {
        super(1);
        this.this$0 = oneNadOutboundViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends OneNadOutboundBillingItem> list) {
        invoke2((List<OneNadOutboundBillingItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<OneNadOutboundBillingItem> list) {
        MutableLiveData m13254w;
        m13254w = this.this$0.m13254w();
        m13254w.setValue(Resource.Companion.success(list));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}