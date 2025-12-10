package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileAddressInfoFragment$setupRetailerSubAddress2Data$3 */
/* loaded from: classes10.dex */
public final class C15132x1defb9ef extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneRetailerProfileAddressInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15132x1defb9ef(OneRetailerProfileAddressInfoFragment oneRetailerProfileAddressInfoFragment) {
        super(0);
        this.this$0 = oneRetailerProfileAddressInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DtacEditText dtacEditText;
        dtacEditText = this.this$0.f96813r;
        if (dtacEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retailerSubAddress2EditText");
            dtacEditText = null;
        }
        dtacEditText.setText("");
    }
}