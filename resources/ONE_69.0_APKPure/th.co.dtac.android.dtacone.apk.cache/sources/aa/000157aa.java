package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.profile.GetProfileResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$retryLoginMrtr$3 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$retryLoginMrtr$3 extends Lambda implements Function1<GetProfileResponse, GetProfileResponse> {
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$retryLoginMrtr$3(GetProfileViewModel getProfileViewModel) {
        super(1);
        this.this$0 = getProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetProfileResponse invoke(@NotNull GetProfileResponse it) {
        LoginRepository loginRepository;
        String userFormatType;
        LoginRepository loginRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        loginRepository = this.this$0.f106079b;
        String userName = it.getUserName();
        if (userName != null && userName.length() != 0) {
            loginRepository2 = this.this$0.f106079b;
            UserNameType checkUserTypeByUserName = loginRepository2.checkUserTypeByUserName(it.getUserName());
            UserNameType.TELEPHONE_NUMBER telephone_number = UserNameType.TELEPHONE_NUMBER.INSTANCE;
            if (Intrinsics.areEqual(checkUserTypeByUserName, telephone_number)) {
                userFormatType = telephone_number.getUserFormatType();
                loginRepository.setUserFormatType(userFormatType);
                return it;
            }
        }
        userFormatType = UserNameType.USER_LAN.INSTANCE.getUserFormatType();
        loginRepository.setUserFormatType(userFormatType);
        return it;
    }
}