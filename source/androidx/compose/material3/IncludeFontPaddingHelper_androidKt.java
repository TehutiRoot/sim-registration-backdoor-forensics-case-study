package androidx.compose.material3;

import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m28850d2 = {"copyAndSetFontPadding", "Landroidx/compose/ui/text/TextStyle;", "style", "includeFontPadding", "", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class IncludeFontPaddingHelper_androidKt {
    @NotNull
    public static final TextStyle copyAndSetFontPadding(@NotNull TextStyle style, boolean z) {
        TextStyle m73230copyCXVQc50;
        Intrinsics.checkNotNullParameter(style, "style");
        m73230copyCXVQc50 = style.m73230copyCXVQc50((r46 & 1) != 0 ? style.f31112a.m73176getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? style.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? style.f31112a.getFontWeight() : null, (r46 & 8) != 0 ? style.f31112a.m73178getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? style.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? style.f31112a.getFontFamily() : null, (r46 & 64) != 0 ? style.f31112a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? style.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? style.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? style.f31112a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? style.f31112a.getLocaleList() : null, (r46 & 2048) != 0 ? style.f31112a.m73174getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? style.f31112a.getTextDecoration() : null, (r46 & 8192) != 0 ? style.f31112a.getShadow() : null, (r46 & 16384) != 0 ? style.f31113b.m73132getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? style.f31113b.m73134getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? style.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? style.f31113b.getTextIndent() : null, (r46 & 262144) != 0 ? style.f31114c : new PlatformTextStyle(z), (r46 & 524288) != 0 ? style.f31113b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? style.f31113b.m73129getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? style.f31113b.m73127getHyphensEaSxIns() : null);
        return m73230copyCXVQc50;
    }
}
