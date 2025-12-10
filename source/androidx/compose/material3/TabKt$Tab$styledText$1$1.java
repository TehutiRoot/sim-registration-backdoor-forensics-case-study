package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TabKt$Tab$styledText$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$Tab$styledText$1$1(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$text = function2;
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
        TextStyle m73230copyCXVQc50;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(708874428, i, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
        }
        m73230copyCXVQc50 = r4.m73230copyCXVQc50((r46 & 1) != 0 ? r4.f31112a.m73176getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r4.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r4.f31112a.getFontWeight() : null, (r46 & 8) != 0 ? r4.f31112a.m73178getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r4.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r4.f31112a.getFontFamily() : null, (r46 & 64) != 0 ? r4.f31112a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r4.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r4.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r4.f31112a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r4.f31112a.getLocaleList() : null, (r46 & 2048) != 0 ? r4.f31112a.m73174getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r4.f31112a.getTextDecoration() : null, (r46 & 8192) != 0 ? r4.f31112a.getShadow() : null, (r46 & 16384) != 0 ? r4.f31113b.m73132getTextAlignbuA522U() : TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (r46 & 32768) != 0 ? r4.f31113b.m73134getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r4.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r4.f31113b.getTextIndent() : null, (r46 & 262144) != 0 ? r4.f31114c : null, (r46 & 524288) != 0 ? r4.f31113b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r4.f31113b.m73129getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).f31113b.m73127getHyphensEaSxIns() : null);
        TextKt.ProvideTextStyle(m73230copyCXVQc50, this.$text, composer, (this.$$dirty >> 9) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
