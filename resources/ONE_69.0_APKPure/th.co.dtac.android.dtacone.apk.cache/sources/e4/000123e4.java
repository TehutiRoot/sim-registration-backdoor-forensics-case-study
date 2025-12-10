package th.p047co.dtac.android.dtacone.presenter.login;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.login.NewRequestOtpPresenter$requestOtp$3 */
/* loaded from: classes8.dex */
public final class NewRequestOtpPresenter$requestOtp$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ boolean $forVerifySimR;
    final /* synthetic */ RequestOtpBody $requestOtpBody;
    final /* synthetic */ NewRequestOtpPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRequestOtpPresenter$requestOtp$3(RequestOtpBody requestOtpBody, boolean z, NewRequestOtpPresenter newRequestOtpPresenter) {
        super(1);
        this.$requestOtpBody = requestOtpBody;
        this.$forVerifySimR = z;
        this.this$0 = newRequestOtpPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        this.$requestOtpBody.setMobileNumber(str);
        if (this.$forVerifySimR) {
            return;
        }
        this.this$0.getTemporaryCache().setRetailerNumber(str);
    }
}