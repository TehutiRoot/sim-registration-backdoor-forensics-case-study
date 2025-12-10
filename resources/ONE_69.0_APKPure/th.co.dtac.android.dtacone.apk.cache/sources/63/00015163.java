package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1 */
/* loaded from: classes9.dex */
public final class C16374x9d408b3d extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ MrtrPrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16374x9d408b3d(MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = mrtrPrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        MrtrPrepaidRegistrationActivity m4814o;
        MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel;
        MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel2;
        Intrinsics.checkNotNullParameter(result, "result");
        MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel3 = null;
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            mrtrPrepaidValidateIdCardNumberViewModel2 = this.this$0.f103591j;
            if (mrtrPrepaidValidateIdCardNumberViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
            } else {
                mrtrPrepaidValidateIdCardNumberViewModel3 = mrtrPrepaidValidateIdCardNumberViewModel2;
            }
            mrtrPrepaidValidateIdCardNumberViewModel3.mapIDDocument(result);
            this.this$0.m4816m();
            return;
        }
        FaceCompareResult faceCompare = result.getFaceCompare();
        if (faceCompare == null || !faceCompare.isSuccess()) {
            m4814o = this.this$0.m4814o();
            if (!m4814o.is2ndLineFlow()) {
                return;
            }
        }
        mrtrPrepaidValidateIdCardNumberViewModel = this.this$0.f103591j;
        if (mrtrPrepaidValidateIdCardNumberViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
        } else {
            mrtrPrepaidValidateIdCardNumberViewModel3 = mrtrPrepaidValidateIdCardNumberViewModel;
        }
        mrtrPrepaidValidateIdCardNumberViewModel3.mapCompareDocument(result);
        this.this$0.m4806w();
    }
}