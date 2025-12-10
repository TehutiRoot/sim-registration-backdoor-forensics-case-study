package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$navigateNextToCommon$onExitCallback$1 */
/* loaded from: classes10.dex */
public final class C15086x3cdac295 extends Lambda implements Function1<ExitCallbackState, Unit> {
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15086x3cdac295(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
        invoke2(exitCallbackState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ExitCallbackState state) {
        OnePrepaidValidationViewModel onePrepaidValidationViewModel;
        OnePrepaidValidationViewModel onePrepaidValidationViewModel2;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ExitCallbackState.UpPassForm) {
            onePrepaidValidationViewModel = this.this$0.f95768i;
            OnePrepaidValidationViewModel onePrepaidValidationViewModel3 = null;
            if (onePrepaidValidationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                onePrepaidValidationViewModel = null;
            }
            if (!(onePrepaidValidationViewModel.getCurrentFormType() instanceof UpPassFormType.Ocr)) {
                onePrepaidValidationViewModel2 = this.this$0.f95768i;
                if (onePrepaidValidationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                } else {
                    onePrepaidValidationViewModel3 = onePrepaidValidationViewModel2;
                }
                if (!(onePrepaidValidationViewModel3.getCurrentFormType() instanceof UpPassFormType.OcrFaceCompareLiveness)) {
                    this.this$0.m10648x();
                    return;
                }
            }
            this.this$0.m10647y();
            return;
        }
        if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareRetakeIdDocument.INSTANCE) ? true : Intrinsics.areEqual(state, ExitCallbackState.FaceCompareFailed.INSTANCE)) {
            this.this$0.m10648x();
        } else {
            this.this$0.m10648x();
        }
    }
}