package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$1(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        OneFontTextView oneFontTextView3 = null;
        if (it.booleanValue()) {
            oneFontTextView2 = this.this$0.f90249o;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewContract");
            } else {
                oneFontTextView3 = oneFontTextView2;
            }
            oneFontTextView3.setText(this.this$0.getString(R.string.postpaid_choose_with_contract_button_with_contract));
            return;
        }
        oneFontTextView = this.this$0.f90249o;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewContract");
        } else {
            oneFontTextView3 = oneFontTextView;
        }
        oneFontTextView3.setText(this.this$0.getString(R.string.postpaid_choose_with_contract_button_with_out_contract));
    }
}