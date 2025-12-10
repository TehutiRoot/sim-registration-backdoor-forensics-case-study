package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$DatePickerDialogSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ ButtonColors $textButtonColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$DatePickerDialogSection$2(Function0<Unit> function0, ButtonColors buttonColors, int i) {
        super(2);
        this.$onDismiss = function0;
        this.$textButtonColors = buttonColors;
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
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-435004089, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.DatePickerDialogSection.<anonymous> (InputInfoScreen.kt:1136)");
        }
        ButtonKt.TextButton(this.$onDismiss, null, false, null, this.$textButtonColors, null, null, null, null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75219getLambda9$app_prodRelease(), composer, ((this.$$dirty >> 6) & 14) | 805306368, 494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}