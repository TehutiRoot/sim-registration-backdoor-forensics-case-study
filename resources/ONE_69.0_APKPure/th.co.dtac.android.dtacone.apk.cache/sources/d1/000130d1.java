package th.p047co.dtac.android.dtacone.view.appOne.forgot_password.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneInputForgotPasswordBinding;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment$initViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneInputForgotPasswordFragment$initViewModel$1$2 extends Lambda implements Function1<Resource<? extends Void>, Unit> {
    final /* synthetic */ OneForgotPasswordViewModel $this_with;
    final /* synthetic */ OneInputForgotPasswordFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputForgotPasswordFragment$initViewModel$1$2(OneInputForgotPasswordFragment oneInputForgotPasswordFragment, OneForgotPasswordViewModel oneForgotPasswordViewModel) {
        super(1);
        this.this$0 = oneInputForgotPasswordFragment;
        this.$this_with = oneForgotPasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Void> resource) {
        invoke2((Resource<Void>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Void> resource) {
        Resource<Void> resourceContentIfNotHandled;
        FragmentOneInputForgotPasswordBinding m14302o;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneInputForgotPasswordFragment oneInputForgotPasswordFragment = this.this$0;
        OneForgotPasswordViewModel oneForgotPasswordViewModel = this.$this_with;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            m14302o = oneInputForgotPasswordFragment.m14302o();
            m14302o.edtVerifyOTP.enableEditText(false);
            oneForgotPasswordViewModel.clearNavigateVerifyOtp();
        }
    }
}