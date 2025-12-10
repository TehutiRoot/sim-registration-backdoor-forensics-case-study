package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContactLanguage;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallContactScreenKt$LanguageSection$1$2$1$1 */
/* loaded from: classes10.dex */
public final class InstallContactScreenKt$LanguageSection$1$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InstallContact $installContact;
    final /* synthetic */ InstallContactLanguage $language;
    final /* synthetic */ Function1<InstallContact, Unit> $onInstallInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallContactScreenKt$LanguageSection$1$2$1$1(Function1<? super InstallContact, Unit> function1, InstallContact installContact, InstallContactLanguage installContactLanguage) {
        super(0);
        this.$onInstallInfoChange = function1;
        this.$installContact = installContact;
        this.$language = installContactLanguage;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onInstallInfoChange.invoke(InstallContact.copy$default(this.$installContact, null, null, this.$language, false, null, 27, null));
    }
}