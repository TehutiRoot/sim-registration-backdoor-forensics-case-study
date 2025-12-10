package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import android.graphics.drawable.Drawable;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", Constants.ENABLE_DISABLE, "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$onResume$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$onResume$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$onResume$1$1(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean isEnabled) {
        Drawable m14677q;
        Drawable m14677q2;
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        OneFontButton oneFontButton3;
        OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment = this.this$0;
        int i = R.drawable.ic_iconschange;
        Intrinsics.checkNotNullExpressionValue(isEnabled, "isEnabled");
        m14677q = oneDeviceSalePrepareProfileInfoFragment.m14677q(i, isEnabled.booleanValue() ? R.color.white : R.color.warmGrey);
        m14677q2 = this.this$0.m14677q(R.drawable.ic_arrow_right, isEnabled.booleanValue() ? R.color.white : R.color.warmGrey);
        OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment2 = this.this$0;
        oneFontButton = oneDeviceSalePrepareProfileInfoFragment2.f90247m;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonChangeMain");
            oneFontButton2 = null;
        } else {
            oneFontButton2 = oneFontButton;
        }
        oneDeviceSalePrepareProfileInfoFragment2.m14668z(oneFontButton2, isEnabled.booleanValue(), isEnabled.booleanValue() ? R.drawable.background_one_button_blue_v2 : R.drawable.background_one_button_disable, isEnabled.booleanValue() ? R.color.white : R.color.warmGrey, m14677q);
        OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment3 = this.this$0;
        oneFontButton3 = oneDeviceSalePrepareProfileInfoFragment3.f90248n;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonChangeAdditional");
            oneFontButton3 = null;
        }
        oneDeviceSalePrepareProfileInfoFragment3.m14668z(oneFontButton3, isEnabled.booleanValue(), isEnabled.booleanValue() ? R.drawable.background_one_button_blue_v2 : R.drawable.background_one_button_disable, isEnabled.booleanValue() ? R.color.white : R.color.warmGrey, m14677q2);
    }
}