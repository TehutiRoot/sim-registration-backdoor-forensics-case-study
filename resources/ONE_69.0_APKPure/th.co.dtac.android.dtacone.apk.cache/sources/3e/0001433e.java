package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$DatePickerDialogSection$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1296:1\n50#2:1297\n49#2:1298\n1097#3,6:1299\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$DatePickerDialogSection$1\n*L\n1125#1:1297\n1125#1:1298\n1125#1:1299,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$DatePickerDialogSection$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerState $birthdayPickerState;
    final /* synthetic */ Function1<String, Unit> $onDatePick;
    final /* synthetic */ ButtonColors $textButtonColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$DatePickerDialogSection$1(DatePickerState datePickerState, Function1<? super String, Unit> function1, int i, ButtonColors buttonColors) {
        super(2);
        this.$birthdayPickerState = datePickerState;
        this.$onDatePick = function1;
        this.$$dirty = i;
        this.$textButtonColors = buttonColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1083596859, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.DatePickerDialogSection.<anonymous> (InputInfoScreen.kt:1122)");
        }
        DatePickerState datePickerState = this.$birthdayPickerState;
        Function1<String, Unit> function1 = this.$onDatePick;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(datePickerState) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InputInfoScreenKt$DatePickerDialogSection$1$1$1(datePickerState, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ButtonKt.TextButton(rememberedValue, null, this.$birthdayPickerState.getSelectedDateMillis() != null, null, this.$textButtonColors, null, null, null, null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75218getLambda8$app_prodRelease(), composer, 805306368, 490);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}