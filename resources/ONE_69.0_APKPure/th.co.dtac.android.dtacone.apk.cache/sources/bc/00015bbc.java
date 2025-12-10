package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneButtonKt$OneButtonOutline$1 */
/* loaded from: classes9.dex */
public final class OneButtonKt$OneButtonOutline$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonKt$OneButtonOutline$1(String str, int i) {
        super(3);
        this.$text = str;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull RowScope OutlinedButton, @Nullable Composer composer, int i) {
        TextStyle m73418copyv2rsoow;
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1420704540, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneButtonOutline.<anonymous> (OneButton.kt:180)");
        }
        String str = this.$text;
        m73418copyv2rsoow = r6.m73418copyv2rsoow((r48 & 1) != 0 ? r6.f31200a.m73360getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r6.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r6.f31200a.getFontWeight() : FontWeight.Companion.getMedium(), (r48 & 8) != 0 ? r6.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r6.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r6.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r6.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r6.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r6.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r6.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r6.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r6.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r6.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r6.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r6.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r6.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r6.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r6.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r6.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r6.f31202c : null, (r48 & 1048576) != 0 ? r6.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r6.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r6.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getDisplayLarge().f31201b.getTextMotion() : null);
        AutoResizeTextKt.m75305AutoResizeTextww6aTOc(str, null, m73418copyv2rsoow, 0L, composer, (this.$$dirty >> 3) & 14, 10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}