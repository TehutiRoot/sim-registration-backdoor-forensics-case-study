package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneButtonKt$OneButtonOutline$1 */
/* loaded from: classes7.dex */
public final class OneButtonKt$OneButtonOutline$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $color;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonKt$OneButtonOutline$1(String str, long j, int i) {
        super(3);
        this.$text = str;
        this.$color = j;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull RowScope Button, @Nullable Composer composer, int i) {
        TextStyle textStyle;
        TextStyle m73234copyv2rsoow;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2118412894, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneButtonOutline.<anonymous> (OneButton.kt:124)");
        }
        String str = this.$text;
        textStyle = OneButtonKt.f82885a;
        m73234copyv2rsoow = textStyle.m73234copyv2rsoow((r48 & 1) != 0 ? textStyle.f31112a.m73176getColor0d7_KjU() : this.$color, (r48 & 2) != 0 ? textStyle.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? textStyle.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.f31112a.getShadow() : null, (r48 & 16384) != 0 ? textStyle.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? textStyle.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? textStyle.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.f31114c : null, (r48 & 1048576) != 0 ? textStyle.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? textStyle.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? textStyle.f31113b.getTextMotion() : null);
        TextKt.m70698Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73234copyv2rsoow, composer, (this.$$dirty >> 3) & 14, 0, 65534);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
