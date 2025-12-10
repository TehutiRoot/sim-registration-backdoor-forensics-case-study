package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment$navigateNextToCommon$onExitCallback$1 */
/* loaded from: classes10.dex */
public final class C14512x432901ca extends Lambda implements Function1<ExitCallbackState, Unit> {
    final /* synthetic */ UpPassFormType $commonFormType;
    final /* synthetic */ OneChangeOwnerVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14512x432901ca(UpPassFormType upPassFormType, OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment) {
        super(1);
        this.$commonFormType = upPassFormType;
        this.this$0 = oneChangeOwnerVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
        invoke2(exitCallbackState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ExitCallbackState state) {
        OneChangeOwnerViewModel oneChangeOwnerViewModel;
        OneChangeOwnerViewModel oneChangeOwnerViewModel2;
        UpPassViewModel upPassViewModel;
        OneChangeOwnerViewModel oneChangeOwnerViewModel3;
        OneChangeOwnerViewModel oneChangeOwnerViewModel4;
        OneChangeOwnerViewModel oneChangeOwnerViewModel5;
        OneChangeOwnerViewModel oneChangeOwnerViewModel6;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = this.$commonFormType instanceof UpPassFormType.Ocr;
        oneChangeOwnerViewModel = this.this$0.f89095k;
        OneChangeOwnerViewModel oneChangeOwnerViewModel7 = null;
        if (oneChangeOwnerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            oneChangeOwnerViewModel = null;
        }
        boolean z2 = oneChangeOwnerViewModel.getUpPassStepState() == UpPassStepState.NONE;
        oneChangeOwnerViewModel2 = this.this$0.f89095k;
        if (oneChangeOwnerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            oneChangeOwnerViewModel2 = null;
        }
        UpPassStepState upPassStepState = oneChangeOwnerViewModel2.getUpPassStepState();
        UpPassStepState upPassStepState2 = UpPassStepState.OCR_DONE;
        boolean z3 = upPassStepState == upPassStepState2;
        upPassViewModel = this.this$0.f89094j;
        if (upPassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
            upPassViewModel = null;
        }
        boolean isCardReader = upPassViewModel.getFormResult().isCardReader();
        oneChangeOwnerViewModel3 = this.this$0.f89095k;
        if (oneChangeOwnerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            oneChangeOwnerViewModel3 = null;
        }
        boolean isAllowManualKYC = oneChangeOwnerViewModel3.isAllowManualKYC();
        if (z && z2) {
            OneChangeOwnerVerifyOtpFragment.m15605L(this.this$0);
        } else if (!z && z3) {
            oneChangeOwnerViewModel6 = this.this$0.f89095k;
            if (oneChangeOwnerViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                oneChangeOwnerViewModel7 = oneChangeOwnerViewModel6;
            }
            oneChangeOwnerViewModel7.setBackFromSelfieOCRDipChip(true);
            OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
        } else if (!(state instanceof ExitCallbackState.UpPassForm)) {
            if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareRetakeIdDocument.INSTANCE)) {
                OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
            } else if (!Intrinsics.areEqual(state, ExitCallbackState.FaceCompareFailed.INSTANCE)) {
                OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
            } else if (!isAllowManualKYC) {
                OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
            } else if (isCardReader) {
                OneChangeOwnerVerifyOtpFragment.m15606K(this.this$0);
            } else {
                OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
            }
        } else if (!z) {
            oneChangeOwnerViewModel4 = this.this$0.f89095k;
            if (oneChangeOwnerViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                oneChangeOwnerViewModel4 = null;
            }
            oneChangeOwnerViewModel4.setUpPassStepState(upPassStepState2);
            oneChangeOwnerViewModel5 = this.this$0.f89095k;
            if (oneChangeOwnerViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                oneChangeOwnerViewModel5 = null;
            }
            oneChangeOwnerViewModel5.setFaceCompareResult(null);
            OneChangeOwnerVerifyOtpFragment.m15606K(this.this$0);
        } else {
            OneChangeOwnerVerifyOtpFragment.m15607J(this.this$0);
        }
    }
}