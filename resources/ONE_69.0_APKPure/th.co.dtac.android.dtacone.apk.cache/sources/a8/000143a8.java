package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallContactScreenKt$InstallContactScreen$2 */
/* loaded from: classes10.dex */
public final class InstallContactScreenKt$InstallContactScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $installAddress;
    final /* synthetic */ InstallContact $installContact;
    final /* synthetic */ Function1<InstallContact, Unit> $onInstallInfoChange;
    final /* synthetic */ Function0<Unit> $onNext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallContactScreenKt$InstallContactScreen$2(InstallContact installContact, String str, Function1<? super InstallContact, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$installContact = installContact;
        this.$installAddress = str;
        this.$onInstallInfoChange = function1;
        this.$onNext = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InstallContactScreenKt.InstallContactScreen(this.$installContact, this.$installAddress, this.$onInstallInfoChange, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}