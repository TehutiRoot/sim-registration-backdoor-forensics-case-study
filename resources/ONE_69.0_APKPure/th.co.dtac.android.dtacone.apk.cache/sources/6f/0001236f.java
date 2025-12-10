package th.p047co.dtac.android.dtacone.presenter.force_change_password;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.force_change_password.ForceChangeOtpPassword;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordOtpPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordOtpPresenter$getOtp$2 */
/* loaded from: classes8.dex */
public final class ForceChangePasswordOtpPresenter$getOtp$2 extends Lambda implements Function1<RequestOtpResponse, Unit> {
    final /* synthetic */ ServerErrorException $exception;
    final /* synthetic */ ForceChangeOtpPassword $forceChangePassword;
    final /* synthetic */ ForceChangePasswordOtpPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordOtpPresenter$getOtp$2(ForceChangePasswordOtpPresenter forceChangePasswordOtpPresenter, ForceChangeOtpPassword forceChangeOtpPassword, ServerErrorException serverErrorException) {
        super(1);
        this.this$0 = forceChangePasswordOtpPresenter;
        this.$forceChangePassword = forceChangeOtpPassword;
        this.$exception = serverErrorException;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpResponse requestOtpResponse) {
        invoke2(requestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpResponse it) {
        ForceChangePasswordOtpPresenter.View view;
        view = this.this$0.f85810d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        ForceChangeOtpPassword forceChangeOtpPassword = this.$forceChangePassword;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onRequestOtpForChangePasswordSuccess(forceChangeOtpPassword, it, this.$exception);
    }
}