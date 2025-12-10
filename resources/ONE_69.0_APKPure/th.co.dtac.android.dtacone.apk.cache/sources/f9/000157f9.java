package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.login.LoginCollection;
import th.p047co.dtac.android.dtacone.model.login_mrtr.LoginMrtrRequest;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtrRequest;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/login/LoginCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$validateTelephoneNumber$4 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$validateTelephoneNumber$4 extends Lambda implements Function1<LoginCollection, LoginMrtrRequest> {
    final /* synthetic */ String $password;
    final /* synthetic */ LoginMrtrViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$validateTelephoneNumber$4(String str, LoginMrtrViewModel loginMrtrViewModel) {
        super(1);
        this.$password = str;
        this.this$0 = loginMrtrViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LoginMrtrRequest invoke(@NotNull LoginCollection it) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(it, "it");
        String str3 = this.$password;
        str = this.this$0.f106152i;
        String encryptCBC = AESCryptUtil.encryptCBC(str3, str);
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(PhoneNumberExtKt.toInternational(it.getUsername()));
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacte…ername.toInternational())");
        str2 = this.this$0.f106152i;
        return new LoginMrtrRequest(encryptCBC, UserNameType.TELEPHONE_NUMBER.INSTANCE.getUserFormatType(), AESCryptUtil.encryptCBC(removeAllSpecialCharacter, str2));
    }
}