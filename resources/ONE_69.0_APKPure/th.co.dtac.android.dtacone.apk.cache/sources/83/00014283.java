package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation.SelectGisLocationScreenKt$SelectGisLocationScreen$3 */
/* loaded from: classes10.dex */
public final class SelectGisLocationScreenKt$SelectGisLocationScreen$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ GisAuthenticationState.Success $gisAuthState;
    final /* synthetic */ Function0<Unit> $onGisSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGisLocationScreenKt$SelectGisLocationScreen$3(GisAuthenticationState.Success success, Function0<Unit> function0, int i) {
        super(2);
        this.$gisAuthState = success;
        this.$onGisSuccess = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectGisLocationScreenKt.SelectGisLocationScreen(this.$gisAuthState, this.$onGisSuccess, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}