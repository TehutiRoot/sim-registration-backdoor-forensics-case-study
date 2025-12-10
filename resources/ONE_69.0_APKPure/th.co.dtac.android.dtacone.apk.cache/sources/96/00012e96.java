package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$3 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$3(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
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
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        OneFontButton oneFontButton3;
        OneFontButton oneFontButton4;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        OneFontButton oneFontButton5 = null;
        if (it.booleanValue()) {
            oneFontButton3 = this.this$0.f90247m;
            if (oneFontButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonChangeMain");
                oneFontButton3 = null;
            }
            ViewEnableKt.toEnable(oneFontButton3);
            oneFontButton4 = this.this$0.f90248n;
            if (oneFontButton4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonChangeAdditional");
            } else {
                oneFontButton5 = oneFontButton4;
            }
            ViewEnableKt.toEnable(oneFontButton5);
            return;
        }
        oneFontButton = this.this$0.f90247m;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonChangeMain");
            oneFontButton = null;
        }
        ViewEnableKt.toDisable(oneFontButton);
        oneFontButton2 = this.this$0.f90248n;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonChangeAdditional");
        } else {
            oneFontButton5 = oneFontButton2;
        }
        ViewEnableKt.toDisable(oneFontButton5);
    }
}