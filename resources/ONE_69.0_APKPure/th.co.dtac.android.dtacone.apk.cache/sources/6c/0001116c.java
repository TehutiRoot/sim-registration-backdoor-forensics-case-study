package th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel$checkForgotPassword$3 */
/* loaded from: classes7.dex */
public final class OneForgotPasswordViewModel$checkForgotPassword$3 extends Lambda implements Function1<ForgotPasswordResponse, Unit> {
    final /* synthetic */ OneForgotPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneForgotPasswordViewModel$checkForgotPassword$3(OneForgotPasswordViewModel oneForgotPasswordViewModel) {
        super(1);
        this.this$0 = oneForgotPasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ForgotPasswordResponse forgotPasswordResponse) {
        invoke2(forgotPasswordResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ForgotPasswordResponse forgotPasswordResponse) {
        MutableLiveData m20242k;
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m20242k = this.this$0.m20242k();
        m20242k.setValue(Resource.Companion.success(forgotPasswordResponse));
    }
}