package th.p047co.dtac.android.dtacone.view.appOne.eSign.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.compose.ESignTopAppBarKt$ESignTopAppBar$3 */
/* loaded from: classes10.dex */
public final class ESignTopAppBarKt$ESignTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $currentRoute;
    final /* synthetic */ Function0<Unit> $onBackPressed;
    final /* synthetic */ String $previousRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESignTopAppBarKt$ESignTopAppBar$3(String str, String str2, Function0<Unit> function0, int i) {
        super(2);
        this.$currentRoute = str;
        this.$previousRoute = str2;
        this.$onBackPressed = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ESignTopAppBarKt.ESignTopAppBar(this.$currentRoute, this.$previousRoute, this.$onBackPressed, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}