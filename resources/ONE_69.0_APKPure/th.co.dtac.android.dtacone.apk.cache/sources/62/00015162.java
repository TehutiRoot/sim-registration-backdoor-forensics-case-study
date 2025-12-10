package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment$navigateNextToCommon$onExitCallback$1 */
/* loaded from: classes9.dex */
public final class C16373x221113f8 extends Lambda implements Function1<ExitCallbackState, Unit> {
    final /* synthetic */ MrtrPrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16373x221113f8(MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = mrtrPrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
        invoke2(exitCallbackState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ExitCallbackState state) {
        MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ExitCallbackState.UpPassForm) {
            mrtrPrepaidValidateIdCardNumberViewModel = this.this$0.f103591j;
            if (mrtrPrepaidValidateIdCardNumberViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                mrtrPrepaidValidateIdCardNumberViewModel = null;
            }
            if (mrtrPrepaidValidateIdCardNumberViewModel.getCurrentFormType() instanceof UpPassFormType.Ocr) {
                this.this$0.m4808u();
                return;
            } else {
                this.this$0.m4809t();
                return;
            }
        }
        if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareRetakeIdDocument.INSTANCE) ? true : Intrinsics.areEqual(state, ExitCallbackState.FaceCompareFailed.INSTANCE)) {
            this.this$0.m4809t();
        } else {
            this.this$0.m4809t();
        }
    }
}