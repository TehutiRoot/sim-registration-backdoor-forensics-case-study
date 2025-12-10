package th.p047co.dtac.android.dtacone.presenter.cli;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.Cli;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/login/Cli;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.cli.CliPresenterImpl$callCli$2 */
/* loaded from: classes8.dex */
public final class CliPresenterImpl$callCli$2 extends Lambda implements Function1<Cli, String> {
    public static final CliPresenterImpl$callCli$2 INSTANCE = new CliPresenterImpl$callCli$2();

    public CliPresenterImpl$callCli$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Cli cli) {
        return cli.getPhoneNumber();
    }
}