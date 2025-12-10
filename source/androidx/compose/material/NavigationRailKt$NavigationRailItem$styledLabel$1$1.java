package androidx.compose.material;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItem$styledLabel$1$1(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$label = function2;
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
        TextStyle m73234copyv2rsoow;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180398615, i, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
        }
        m73234copyv2rsoow = r3.m73234copyv2rsoow((r48 & 1) != 0 ? r3.f31112a.m73176getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r3.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? r3.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r3.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r3.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? r3.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r3.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r3.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? r3.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r3.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.f31112a.getShadow() : null, (r48 & 16384) != 0 ? r3.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.f31113b.m73132getTextAlignbuA522U() : TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (r48 & 65536) != 0 ? r3.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r3.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r3.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? r3.f31114c : null, (r48 & 1048576) != 0 ? r3.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r3.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption().f31113b.getTextMotion() : null);
        TextKt.ProvideTextStyle(m73234copyv2rsoow, this.$label, composer, (this.$$dirty >> 12) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
