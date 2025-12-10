package androidx.compose.material;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
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

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        TextStyle textStyle;
        TextStyle m73234copyv2rsoow;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(362863774, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getSubtitle1(), materialTheme.getTypography(composer, 6).getCaption(), this.$labelProgress);
        boolean z = this.$shouldOverrideTextStyleColor;
        long j = this.$labelTextStyleColor;
        if (z) {
            m73234copyv2rsoow = lerp.m73234copyv2rsoow((r48 & 1) != 0 ? lerp.f31112a.m73176getColor0d7_KjU() : j, (r48 & 2) != 0 ? lerp.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? lerp.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? lerp.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.f31112a.getShadow() : null, (r48 & 16384) != 0 ? lerp.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? lerp.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? lerp.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? lerp.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.f31114c : null, (r48 & 1048576) != 0 ? lerp.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? lerp.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? lerp.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? lerp.f31113b.getTextMotion() : null);
            textStyle = m73234copyv2rsoow;
        } else {
            textStyle = lerp;
        }
        TextFieldImplKt.m70149DecorationeuL9pac(this.$labelContentColor, textStyle, null, this.$it, composer, ((this.$$dirty >> 6) & 14) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
