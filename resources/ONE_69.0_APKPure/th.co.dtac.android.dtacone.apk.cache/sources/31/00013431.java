package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueMoveHFragment$setupNadOutboundListAdapter$1$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundTrueMoveHFragment$setupNadOutboundListAdapter$1$1 extends Lambda implements Function1<OneNadOutboundBillingItem, Unit> {
    final /* synthetic */ OneNadOutboundTrueMoveHFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundTrueMoveHFragment$setupNadOutboundListAdapter$1$1(OneNadOutboundTrueMoveHFragment oneNadOutboundTrueMoveHFragment) {
        super(1);
        this.this$0 = oneNadOutboundTrueMoveHFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneNadOutboundBillingItem oneNadOutboundBillingItem) {
        invoke2(oneNadOutboundBillingItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OneNadOutboundBillingItem item) {
        OneNadOutboundViewModel m13314r;
        Intrinsics.checkNotNullParameter(item, "item");
        m13314r = this.this$0.m13314r();
        m13314r.getOneModel().setSelectedNadItem(item);
        m13314r.getOneNadOutboundInvoice();
    }
}