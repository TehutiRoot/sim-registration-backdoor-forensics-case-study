package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.esim.TelephoneNumberListItem;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimSelectNumberFragment$setOnClickItem$1 */
/* loaded from: classes9.dex */
public final class ESimSelectNumberFragment$setOnClickItem$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TelephoneNumberListItem $item;
    final /* synthetic */ ESimSelectNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimSelectNumberFragment$setOnClickItem$1(ESimSelectNumberFragment eSimSelectNumberFragment, TelephoneNumberListItem telephoneNumberListItem) {
        super(0);
        this.this$0 = eSimSelectNumberFragment;
        this.$item = telephoneNumberListItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ESimViewModel viewModel;
        ESimViewModel viewModel2;
        ESimViewModel viewModel3;
        String telephoneNumber;
        viewModel = this.this$0.getViewModel();
        TelephoneNumberListItem telephoneNumberListItem = this.$item;
        String str = "";
        viewModel.setDisplayTelephoneNumber((telephoneNumberListItem == null || (r1 = telephoneNumberListItem.getDisplayTelephoneNumber()) == null) ? "" : "");
        viewModel2 = this.this$0.getViewModel();
        TelephoneNumberListItem telephoneNumberListItem2 = this.$item;
        if (telephoneNumberListItem2 != null && (telephoneNumber = telephoneNumberListItem2.getTelephoneNumber()) != null) {
            str = telephoneNumber;
        }
        viewModel2.setTelephoneNumber(str);
        viewModel3 = this.this$0.getViewModel();
        viewModel3.getSimCardNumber();
    }
}