package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.login.Data;
import th.p047co.dtac.android.dtacone.model.appOne.login.OneLoginResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/appOne/login/OneLoginResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callOneLoginApi$4 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callOneLoginApi$4 extends Lambda implements Function1<OneLoginResponse, SingleSource<? extends Map<String, ? extends String>>> {
    final /* synthetic */ String $userName;
    final /* synthetic */ LoginMrtrViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callOneLoginApi$4(LoginMrtrViewModel loginMrtrViewModel, String str) {
        super(1);
        this.this$0 = loginMrtrViewModel;
        this.$userName = str;
    }

    public static final Map invoke$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AbstractC11663a.emptyMap();
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends Map<String, String>> invoke(@NotNull OneLoginResponse it) {
        LoginRepository loginRepository;
        ConfigurationRepository configurationRepository;
        LoginRepository loginRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        loginRepository = this.this$0.f106145b;
        String str = this.$userName;
        Data data = it.getData();
        loginRepository.setToken(data != null ? data.getToken() : null);
        loginRepository.setUserName(str);
        Data data2 = it.getData();
        loginRepository.setPromoterId((data2 == null || (r1 = data2.getPromoterId()) == null) ? "" : "");
        Data data3 = it.getData();
        if (data3 != null) {
            loginRepository2 = this.this$0.f106145b;
            loginRepository2.storeOneLoginResponse(data3);
        }
        configurationRepository = this.this$0.f106146c;
        return configurationRepository.getMobileConfig().onErrorReturn(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.login_mrtr.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Map invoke$lambda$2;
                invoke$lambda$2 = LoginMrtrViewModel$callOneLoginApi$4.invoke$lambda$2((Throwable) obj);
                return invoke$lambda$2;
            }
        });
    }
}