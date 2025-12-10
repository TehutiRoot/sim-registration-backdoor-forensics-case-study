package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpOffer;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 OneRegisterTrueOnlineFlpMarketingCodeScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n135#2:424\n138#2,3:432\n141#2:436\n139#2,6:437\n36#3:425\n1097#4,6:426\n154#5:435\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineFlpMarketingCodeScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1\n*L\n135#1:425\n135#1:426,6\n140#1:435\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1$invoke$$inlined$itemsIndexed$default$3 */
/* loaded from: classes10.dex */
public final class C15380x6718dc58 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ MutableState $filterText$delegate$inlined;
    final /* synthetic */ List $filteredMarketingCodes$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onSelect$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15380x6718dc58(List list, Function1 function1, int i, List list2, MutableState mutableState) {
        super(4);
        this.$items = list;
        this.$onSelect$inlined = function1;
        this.$$dirty$inlined = i;
        this.$filteredMarketingCodes$inlined = list2;
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
        String m9558a;
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
            ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
        }
        FlpOffer flpOffer = (FlpOffer) this.$items.get(i);
        m9558a = OneRegisterTrueOnlineFlpMarketingCodeScreenKt.m9558a(this.$filterText$delegate$inlined);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this.$onSelect$inlined);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C15386xbd9ff781(this.$onSelect$inlined);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        OneRegisterTrueOnlineFlpMarketingCodeScreenKt.m9556c(flpOffer, m9558a, (Function1) rememberedValue, composer, 8);
        if (i < this.$filteredMarketingCodes$inlined.size() - 1) {
            DividerKt.m70554Divider9IZ8Weo(null, C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.line_platinum, composer, 0), composer, 48, 1);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}