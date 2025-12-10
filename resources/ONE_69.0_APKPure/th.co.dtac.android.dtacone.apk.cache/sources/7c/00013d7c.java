package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputOTPFragment$initViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneInputOTPFragment$initViewModel$1$1 extends Lambda implements Function1<Resource<? extends Void>, Unit> {
    final /* synthetic */ OneRegistrationViewModel $this_with;
    final /* synthetic */ OneInputOTPFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputOTPFragment$initViewModel$1$1(OneInputOTPFragment oneInputOTPFragment, OneRegistrationViewModel oneRegistrationViewModel) {
        super(1);
        this.this$0 = oneInputOTPFragment;
        this.$this_with = oneRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Void> resource) {
        invoke2((Resource<Void>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Void> resource) {
        OneTextInputLayoutText oneTextInputLayoutText;
        OneTextInputLayoutText oneTextInputLayoutText2;
        OneRegistrationActivity m10436n;
        if (resource != null) {
            OneInputOTPFragment oneInputOTPFragment = this.this$0;
            OneRegistrationViewModel oneRegistrationViewModel = this.$this_with;
            if (resource.getStatus() == StatusResource.SUCCESS) {
                oneTextInputLayoutText = oneInputOTPFragment.f96211k;
                OneTextInputLayoutText oneTextInputLayoutText3 = null;
                if (oneTextInputLayoutText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyOTP");
                    oneTextInputLayoutText = null;
                }
                oneTextInputLayoutText.setText("");
                oneTextInputLayoutText2 = oneInputOTPFragment.f96211k;
                if (oneTextInputLayoutText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyOTP");
                } else {
                    oneTextInputLayoutText3 = oneTextInputLayoutText2;
                }
                oneTextInputLayoutText3.focus();
                m10436n = oneInputOTPFragment.m10436n();
                m10436n.showKeyboard();
                oneRegistrationViewModel.clearNextStepRequestOtp();
            }
        }
    }
}