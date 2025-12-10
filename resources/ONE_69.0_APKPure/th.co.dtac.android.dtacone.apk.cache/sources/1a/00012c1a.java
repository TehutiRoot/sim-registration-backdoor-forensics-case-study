package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_order.Data;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_order.OneChangeOwnerSubmitOrderResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneChangeOwnerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneChangeOwnerViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/change_owner/viewModel/OneChangeOwnerViewModel$submitOrder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1#2:886\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel$submitOrder$3 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModel$submitOrder$3 extends Lambda implements Function1<OneChangeOwnerSubmitOrderResponse, Unit> {
    final /* synthetic */ OneChangeOwnerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerViewModel$submitOrder$3(OneChangeOwnerViewModel oneChangeOwnerViewModel) {
        super(1);
        this.this$0 = oneChangeOwnerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeOwnerSubmitOrderResponse oneChangeOwnerSubmitOrderResponse) {
        invoke2(oneChangeOwnerSubmitOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeOwnerSubmitOrderResponse oneChangeOwnerSubmitOrderResponse) {
        String orderId;
        Data data = oneChangeOwnerSubmitOrderResponse.getData();
        if (data == null || (orderId = data.getOrderId()) == null) {
            return;
        }
        this.this$0.m15299r(orderId);
    }
}