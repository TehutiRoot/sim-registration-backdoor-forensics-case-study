package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$ReasonSelection$1$2\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,423:1\n332#2,2:424\n336#2:434\n50#3:426\n49#3:427\n1097#4,6:428\n*S KotlinDebug\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$ReasonSelection$1$2\n*L\n333#1:426\n333#1:427\n333#1:428,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$ReasonSelection$1$2$invoke$$inlined$items$default$4 */
/* loaded from: classes10.dex */
public final class C15618x205f7ada extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ CampaignInfo $campaignInfo$inlined;
    final /* synthetic */ String $filterText$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onSelect$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15618x205f7ada(List list, CampaignInfo campaignInfo, String str, Function1 function1, int i) {
        super(4);
        this.$items = list;
        this.$campaignInfo$inlined = campaignInfo;
        this.$filterText$inlined = str;
        this.$onSelect$inlined = function1;
        this.$$dirty$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Composable
    public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
        int i3;
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
        CampaignWaiveReason campaignWaiveReason = (CampaignWaiveReason) this.$items.get(i);
        boolean areEqual = Intrinsics.areEqual(this.$campaignInfo$inlined.getCampaignEntryFeeReasonCode(), campaignWaiveReason.getReasonCode());
        String reasonDesc = campaignWaiveReason.getReasonDesc();
        String str = this.$filterText$inlined;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(this.$onSelect$inlined) | composer.changed(campaignWaiveReason);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneFeeInfoScreenKt$ReasonSelection$1$2$1$1$1(this.$onSelect$inlined, campaignWaiveReason);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        OneFeeInfoScreenKt.ReasonCard(reasonDesc, str, areEqual, rememberedValue, composer, this.$$dirty$inlined & 112, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}