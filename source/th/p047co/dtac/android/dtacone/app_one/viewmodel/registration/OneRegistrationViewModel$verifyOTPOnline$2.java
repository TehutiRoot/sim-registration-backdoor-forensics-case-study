package th.p047co.dtac.android.dtacone.app_one.viewmodel.registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel$verifyOTPOnline$2 */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModel$verifyOTPOnline$2 extends Lambda implements Function1<TokenCollection, Unit> {
    final /* synthetic */ OneRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationViewModel$verifyOTPOnline$2(OneRegistrationViewModel oneRegistrationViewModel) {
        super(1);
        this.this$0 = oneRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TokenCollection tokenCollection) {
        invoke2(tokenCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TokenCollection tokenCollection) {
        this.this$0.getVerifyOnlineToken().setValue(tokenCollection.getToken());
        this.this$0.registerOwner(Boolean.FALSE);
    }
}
