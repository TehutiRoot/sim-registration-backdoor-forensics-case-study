package th.p047co.dtac.android.dtacone.view.appOne.online_activation.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.online_activation.activate.OneOnlineActivateRequest;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "token", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModel$verifyOTP$1 */
/* loaded from: classes10.dex */
public final class OneOnlineActivationViewModel$verifyOTP$1 extends Lambda implements Function1<TokenCollection, ObservableSource<? extends OneCommonResponse>> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ OneOnlineActivationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineActivationViewModel$verifyOTP$1(OneOnlineActivationViewModel oneOnlineActivationViewModel, String str) {
        super(1);
        this.this$0 = oneOnlineActivationViewModel;
        this.$phoneNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends OneCommonResponse> invoke(@NotNull TokenCollection token) {
        OneOnlineActivationRepository oneOnlineActivationRepository;
        OneOnlineActivationRepository oneOnlineActivationRepository2;
        OneOnlineActivationRepository oneOnlineActivationRepository3;
        Intrinsics.checkNotNullParameter(token, "token");
        oneOnlineActivationRepository = this.this$0.f93013b;
        oneOnlineActivationRepository2 = this.this$0.f93013b;
        String rtrCode = oneOnlineActivationRepository2.getUserSession().getRtrCode();
        oneOnlineActivationRepository3 = this.this$0.f93013b;
        return oneOnlineActivationRepository.oneOnlineActivateDol(new OneOnlineActivateRequest(rtrCode, oneOnlineActivationRepository3.toEncrypt(StringExtKt.toRemoveAllSpecialCharacter(PhoneNumberExtKt.toInternational(this.$phoneNumber))), token.getToken()));
    }
}