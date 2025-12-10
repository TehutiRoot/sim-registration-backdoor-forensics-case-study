package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.login_mrtr.LoginMrtrRequest;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtrRequest;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$2 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callAPILoginMrtr$2 extends Lambda implements Function1<LoginMrtrRequest, LoginMrtrRequest> {
    final /* synthetic */ String $userName;
    final /* synthetic */ LoginMrtrViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callAPILoginMrtr$2(LoginMrtrViewModel loginMrtrViewModel, String str) {
        super(1);
        this.this$0 = loginMrtrViewModel;
        this.$userName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LoginMrtrRequest invoke(@NotNull LoginMrtrRequest it) {
        LoginRepository loginRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        loginRepository = this.this$0.f106145b;
        String str = this.$userName;
        loginRepository.setUserFormatType(it.getUserFormatType());
        loginRepository.setToken(null);
        loginRepository.setRetailerNumber(str);
        loginRepository.setStatus(null);
        loginRepository.setUserType(null);
        return it;
    }
}