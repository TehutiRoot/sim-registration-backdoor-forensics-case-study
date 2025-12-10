package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$UpPassDemoTopBar$5 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$UpPassDemoTopBar$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $foreColor;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ String $route;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$UpPassDemoTopBar$5(String str, long j, Function0<Unit> function0, int i) {
        super(2);
        this.$route = str;
        this.$foreColor = j;
        this.$onBack = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        Set set;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(396972434, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBar.<anonymous> (UpPassDemoTopBar.kt:86)");
        }
        set = UpPassDemoTopBarKt.f88066c;
        if (!set.contains(this.$route)) {
            UpPassDemoTopBarKt.m75160NavIconIv8Zu3U(this.$foreColor, this.$onBack, composer, (this.$$dirty >> 9) & 112);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}