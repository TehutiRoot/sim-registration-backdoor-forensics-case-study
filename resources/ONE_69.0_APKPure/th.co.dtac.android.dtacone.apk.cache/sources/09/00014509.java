package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.EntryFeeReasonState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneFeeInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,407:1\n50#2:408\n49#2:409\n36#2:416\n1097#3,6:410\n1097#3,6:417\n*S KotlinDebug\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2\n*L\n94#1:408\n94#1:409\n101#1:416\n94#1:410,6\n101#1:417,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ EntryFeeReasonState $feeInfoState;
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ Function3<String, String, CampaignWaiveReason, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2(EntryFeeReasonState entryFeeReasonState, CampaignInfo campaignInfo, Function3<? super String, ? super String, ? super CampaignWaiveReason, Unit> function3, int i, MutableState<String> mutableState) {
        super(3);
        this.$feeInfoState = entryFeeReasonState;
        this.$campaignInfo = campaignInfo;
        this.$onSelect = function3;
        this.$$dirty = i;
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.Composer] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        String m9367d;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1722736106, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreen.<anonymous>.<anonymous>.<anonymous> (OneFeeInfoScreen.kt:88)");
        }
        EntryFeeReasonState entryFeeReasonState = this.$feeInfoState;
        m9367d = OneFeeInfoScreenKt.m9367d(this.$filterText$delegate);
        CampaignInfo campaignInfo = this.$campaignInfo;
        Function3<String, String, CampaignWaiveReason, Unit> function3 = this.$onSelect;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(function3) | composer.changed(campaignInfo);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2$1$1(function3, campaignInfo);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function1 function1 = rememberedValue;
        MutableState<String> mutableState = this.$filterText$delegate;
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new OneFeeInfoScreenKt$OneFeeInfoScreen$2$1$2$2$1(mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        int i2 = this.$$dirty;
        OneFeeInfoScreenKt.ReasonSelection(entryFeeReasonState, m9367d, campaignInfo, function1, rememberedValue2, composer, (i2 & 14) | ((i2 << 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}