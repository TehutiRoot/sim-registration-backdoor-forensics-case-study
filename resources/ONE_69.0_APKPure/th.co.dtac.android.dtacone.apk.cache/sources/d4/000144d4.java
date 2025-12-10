package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,423:1\n153#2:424\n156#2:433\n50#3:425\n49#3:426\n1097#4,6:427\n*S KotlinDebug\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4\n*L\n153#1:425\n153#1:426\n153#1:427,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$3$1$4$invoke$$inlined$items$default$4 */
/* loaded from: classes10.dex */
public final class C15606x7fcf4d9f extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ MutableState $filterText$delegate$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onSelect$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15606x7fcf4d9f(List list, Function1 function1, int i, MutableState mutableState) {
        super(4);
        this.$items = list;
        this.$onSelect$inlined = function1;
        this.$$dirty$inlined = i;
        this.$filterText$delegate$inlined = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
        int i3;
        String m9387e;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        MarketingDetails marketingDetails = (MarketingDetails) this.$items.get(i);
        m9387e = MarketingCodeSelectScreenKt.m9387e(this.$filterText$delegate$inlined);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(this.$onSelect$inlined) | composer.changed(marketingDetails);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C15607x36d031ee(this.$onSelect$inlined, marketingDetails);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MarketingCodeSelectScreenKt.m9385g(marketingDetails, m9387e, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}