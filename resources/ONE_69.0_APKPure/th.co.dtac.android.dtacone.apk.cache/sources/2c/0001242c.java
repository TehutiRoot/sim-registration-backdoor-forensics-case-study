package th.p047co.dtac.android.dtacone.presenter.password;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.PasswordRequest;
import th.p047co.dtac.android.dtacone.util.validation.password.VerifyPasswordValidate;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/PasswordRequest;", "invoke", "(Lth/co/dtac/android/dtacone/model/PasswordRequest;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.password.VerifyPasswordPresenter$verifyPasswordObservable$1 */
/* loaded from: classes8.dex */
public final class VerifyPasswordPresenter$verifyPasswordObservable$1 extends Lambda implements Function1<PasswordRequest, Boolean> {
    public static final VerifyPasswordPresenter$verifyPasswordObservable$1 INSTANCE = new VerifyPasswordPresenter$verifyPasswordObservable$1();

    public VerifyPasswordPresenter$verifyPasswordObservable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull PasswordRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(new VerifyPasswordValidate().validate(it.getPassword()));
    }
}