package androidx.compose.material3;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f, long j, Function2<? super Composer, ? super Integer, Unit> function2, int i, boolean z, long j2) {
        super(2);
        this.$labelProgress = f;
        this.$labelContentColor = j;
        this.$it = function2;
        this.$$dirty = i;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        TextStyle textStyle;
        TextStyle m73230copyCXVQc50;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-382297919, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getBodyLarge(), materialTheme.getTypography(composer, 6).getBodySmall(), this.$labelProgress);
        boolean z = this.$shouldOverrideTextStyleColor;
        long j = this.$labelTextStyleColor;
        if (z) {
            m73230copyCXVQc50 = lerp.m73230copyCXVQc50((r46 & 1) != 0 ? lerp.f31112a.m73176getColor0d7_KjU() : j, (r46 & 2) != 0 ? lerp.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? lerp.f31112a.getFontWeight() : null, (r46 & 8) != 0 ? lerp.f31112a.m73178getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? lerp.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? lerp.f31112a.getFontFamily() : null, (r46 & 64) != 0 ? lerp.f31112a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? lerp.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? lerp.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? lerp.f31112a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? lerp.f31112a.getLocaleList() : null, (r46 & 2048) != 0 ? lerp.f31112a.m73174getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? lerp.f31112a.getTextDecoration() : null, (r46 & 8192) != 0 ? lerp.f31112a.getShadow() : null, (r46 & 16384) != 0 ? lerp.f31113b.m73132getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? lerp.f31113b.m73134getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? lerp.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? lerp.f31113b.getTextIndent() : null, (r46 & 262144) != 0 ? lerp.f31114c : null, (r46 & 524288) != 0 ? lerp.f31113b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? lerp.f31113b.m73129getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? lerp.f31113b.m73127getHyphensEaSxIns() : null);
            textStyle = m73230copyCXVQc50;
        } else {
            textStyle = lerp;
        }
        TextFieldImplKt.m70691DecorationKTwxG1Y(this.$labelContentColor, textStyle, this.$it, composer, (this.$$dirty >> 6) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
