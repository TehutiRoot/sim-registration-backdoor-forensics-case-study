package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineFlpSelectNumberScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineFlpSelectNumberScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpSelectNumberScreenKt$OneRegisterTrueOnlineFlpSelectNumberScreen$2$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,286:1\n1855#2:287\n1856#2:296\n36#3:288\n1097#4,6:289\n154#5:295\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineFlpSelectNumberScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpSelectNumberScreenKt$OneRegisterTrueOnlineFlpSelectNumberScreen$2$1$3\n*L\n136#1:287\n136#1:296\n137#1:288\n137#1:289,6\n141#1:295\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpSelectNumberScreenKt$OneRegisterTrueOnlineFlpSelectNumberScreen$2$1$3 */
/* loaded from: classes10.dex */
public final class C15399x81f5a8c5 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ List<String> $filteredPhoneNumbers;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15399x81f5a8c5(List<String> list, Function1<? super String, Unit> function1, int i, MutableState<String> mutableState) {
        super(3);
        this.$filteredPhoneNumbers = list;
        this.$onSelect = function1;
        this.$$dirty = i;
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        String m9550a;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(663036942, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpSelectNumberScreen.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineFlpSelectNumberScreen.kt:134)");
        }
        Function1<String, Unit> function1 = this.$onSelect;
        MutableState<String> mutableState = this.$filterText$delegate;
        for (String str : this.$filteredPhoneNumbers) {
            m9550a = OneRegisterTrueOnlineFlpSelectNumberScreenKt.m9550a(mutableState);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C15400x827550ec(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            OneRegisterTrueOnlineFlpSelectNumberScreenKt.m9548c(str, m9550a, (Function1) rememberedValue, composer, 0);
            DividerKt.m70554Divider9IZ8Weo(null, C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.line_platinum, composer, 0), composer, 48, 1);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}