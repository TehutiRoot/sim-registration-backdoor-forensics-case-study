package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContactType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallContactScreenKt$ContactSection$1$1$1 */
/* loaded from: classes10.dex */
public final class InstallContactScreenKt$ContactSection$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ InstallContact $installContact;
    final /* synthetic */ Function1<InstallContact, Unit> $onInstallInfoChange;
    final /* synthetic */ InstallContactType $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallContactScreenKt$ContactSection$1$1$1(Function1<? super InstallContact, Unit> function1, InstallContact installContact, InstallContactType installContactType) {
        super(1);
        this.$onInstallInfoChange = function1;
        this.$installContact = installContact;
        this.$type = installContactType;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$onInstallInfoChange.invoke(InstallContact.copy$default(this.$installContact, this.$type, null, null, false, null, 30, null));
    }
}