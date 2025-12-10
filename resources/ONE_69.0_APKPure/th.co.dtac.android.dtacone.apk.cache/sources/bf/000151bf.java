package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment$navigateNextToCommon$onExitCallback$1 */
/* loaded from: classes9.dex */
public final class C16389x72907e92 extends Lambda implements Function1<ExitCallbackState, Unit> {
    final /* synthetic */ UpPassFormType $commonFormType;
    final /* synthetic */ MrtrPrepaidReregistVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16389x72907e92(UpPassFormType upPassFormType, MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment) {
        super(1);
        this.$commonFormType = upPassFormType;
        this.this$0 = mrtrPrepaidReregistVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
        invoke2(exitCallbackState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ExitCallbackState state) {
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel;
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel2;
        UpPassViewModel upPassViewModel;
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel3;
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel4;
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel5;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean areEqual = Intrinsics.areEqual(this.$commonFormType, new UpPassFormType.Ocr(null, null, false, null, 15, null));
        mrtrPrepaidReregistViewModel = this.this$0.f103849l;
        if (mrtrPrepaidReregistViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mrtrPrepaidReregistViewModel");
            mrtrPrepaidReregistViewModel = null;
        }
        boolean z = mrtrPrepaidReregistViewModel.getUpPassStepState() == UpPassStepState.NONE;
        mrtrPrepaidReregistViewModel2 = this.this$0.f103849l;
        if (mrtrPrepaidReregistViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mrtrPrepaidReregistViewModel");
            mrtrPrepaidReregistViewModel2 = null;
        }
        UpPassStepState upPassStepState = mrtrPrepaidReregistViewModel2.getUpPassStepState();
        UpPassStepState upPassStepState2 = UpPassStepState.OCR_DONE;
        boolean z2 = upPassStepState == upPassStepState2;
        upPassViewModel = this.this$0.f103846i;
        if (upPassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
            upPassViewModel = null;
        }
        boolean isCardReader = upPassViewModel.getFormResult().isCardReader();
        mrtrPrepaidReregistViewModel3 = this.this$0.f103849l;
        if (mrtrPrepaidReregistViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mrtrPrepaidReregistViewModel");
            mrtrPrepaidReregistViewModel3 = null;
        }
        boolean isAllowManualKYC = mrtrPrepaidReregistViewModel3.isAllowManualKYC();
        if (areEqual && z) {
            this.this$0.m4559F();
        } else if (!areEqual && z2) {
            this.this$0.m4561D();
        } else if (!(state instanceof ExitCallbackState.UpPassForm)) {
            if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareRetakeIdDocument.INSTANCE)) {
                this.this$0.m4561D();
            } else if (!Intrinsics.areEqual(state, ExitCallbackState.FaceCompareFailed.INSTANCE)) {
                this.this$0.m4561D();
            } else if (!isAllowManualKYC) {
                this.this$0.m4561D();
            } else if (isCardReader) {
                this.this$0.m4560E();
            } else {
                this.this$0.m4561D();
            }
        } else if (!areEqual) {
            mrtrPrepaidReregistViewModel4 = this.this$0.f103849l;
            if (mrtrPrepaidReregistViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mrtrPrepaidReregistViewModel");
                mrtrPrepaidReregistViewModel4 = null;
            }
            mrtrPrepaidReregistViewModel4.setUpPassStepState(upPassStepState2);
            mrtrPrepaidReregistViewModel5 = this.this$0.f103849l;
            if (mrtrPrepaidReregistViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mrtrPrepaidReregistViewModel");
                mrtrPrepaidReregistViewModel5 = null;
            }
            mrtrPrepaidReregistViewModel5.setFaceCompareResult(null);
            this.this$0.m4560E();
        } else {
            this.this$0.m4561D();
        }
    }
}