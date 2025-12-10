package th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordResponse;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel$checkForgotPassword$3 */
/* loaded from: classes7.dex */
public final class OneChangePasswordViewModel$checkForgotPassword$3 extends Lambda implements Function1<ChangePasswordResponse, Unit> {
    final /* synthetic */ OneChangePasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangePasswordViewModel$checkForgotPassword$3(OneChangePasswordViewModel oneChangePasswordViewModel) {
        super(1);
        this.this$0 = oneChangePasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChangePasswordResponse changePasswordResponse) {
        invoke2(changePasswordResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChangePasswordResponse changePasswordResponse) {
        MutableLiveData m20252d;
        m20252d = this.this$0.m20252d();
        m20252d.setValue(Resource.Companion.success(changePasswordResponse));
    }
}