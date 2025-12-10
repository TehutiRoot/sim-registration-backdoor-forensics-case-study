package th.p047co.dtac.android.dtacone.presenter.cli;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.Cli;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/login/Cli;", "invoke", "(Lth/co/dtac/android/dtacone/model/login/Cli;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.cli.CliPresenterImpl$callCli$1 */
/* loaded from: classes8.dex */
public final class CliPresenterImpl$callCli$1 extends Lambda implements Function1<Cli, Boolean> {
    public static final CliPresenterImpl$callCli$1 INSTANCE = new CliPresenterImpl$callCli$1();

    public CliPresenterImpl$callCli$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Cli cli) {
        return Boolean.valueOf(new PhoneNumberValidator().validate(cli.getPhoneNumber()));
    }
}