package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$8 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callAPILoginMrtr$8 extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
    final /* synthetic */ boolean $isForceChangedPass;
    final /* synthetic */ String $userName;
    final /* synthetic */ LoginMrtrViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callAPILoginMrtr$8(LoginMrtrViewModel loginMrtrViewModel, String str, boolean z) {
        super(1);
        this.this$0 = loginMrtrViewModel;
        this.$userName = str;
        this.$isForceChangedPass = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
        invoke2((Map<String, String>) map);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> map) {
        MutableLiveData m2475R;
        PreferencesRepository preferencesRepository;
        MutableLiveData m2479N;
        m2475R = this.this$0.m2475R();
        Resource.Companion companion = Resource.Companion;
        m2475R.setValue(companion.success(Boolean.FALSE));
        preferencesRepository = this.this$0.f106147d;
        preferencesRepository.setString(Constant.SHARE_REMEMBER_USERNAME, PhoneNumberFormat.removeDashCharacter(this.$userName));
        m2479N = this.this$0.m2479N();
        m2479N.setValue(companion.success(this.$userName));
        if (this.$isForceChangedPass) {
            this.this$0.m2473T();
        } else {
            this.this$0.m2472U();
        }
    }
}