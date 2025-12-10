package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.util.ToastMessage;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/util/ToastMessage;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$5 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$5 extends Lambda implements Function1<Event<? extends ToastMessage>, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel $this_run;
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$5(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment, OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
        this.$this_run = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Event<? extends ToastMessage> event) {
        invoke2((Event<ToastMessage>) event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Event<ToastMessage> event) {
        ToastMessage contentIfNotHandled;
        if (event == null || (contentIfNotHandled = event.getContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment = this.this$0;
        OneDeviceSaleViewModel oneDeviceSaleViewModel = this.$this_run;
        oneDeviceSalePrepareProfileInfoFragment.f90258x = contentIfNotHandled;
        oneDeviceSaleViewModel.updateSubscriberNumberInfo();
    }
}