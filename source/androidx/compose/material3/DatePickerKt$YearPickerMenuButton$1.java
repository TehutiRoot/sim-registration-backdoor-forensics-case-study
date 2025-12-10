package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$YearPickerMenuButton$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $expanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPickerMenuButton$1(Function2<? super Composer, ? super Integer, Unit> function2, int i, boolean z) {
        super(3);
        this.$content = function2;
        this.$$dirty = i;
        this.$expanded = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer, int i) {
        String m70619getStringNWtq28;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899012021, i, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:1844)");
        }
        this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
        Modifier.Companion companion = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m69564size3ABfNKs(companion, ButtonDefaults.INSTANCE.m70217getIconSpacingD9Ej5fM()), composer, 6);
        ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
        if (this.$expanded) {
            composer.startReplaceableGroup(1071182504);
            m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(Strings.Companion.m70578getDatePickerSwitchToDaySelectionadMyvUU(), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1071182591);
            m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(Strings.Companion.m70582getDatePickerSwitchToYearSelectionadMyvUU(), composer, 6);
            composer.endReplaceableGroup();
        }
        IconKt.m70427Iconww6aTOc(arrowDropDown, m70619getStringNWtq28, RotateKt.rotate(companion, this.$expanded ? 180.0f : 0.0f), 0L, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
