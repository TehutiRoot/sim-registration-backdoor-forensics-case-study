package androidx.compose.material3;

import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m29142d2 = {"copyAndSetFontPadding", "Landroidx/compose/ui/text/TextStyle;", "style", "includeFontPadding", "", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class IncludeFontPaddingHelper_androidKt {
    @NotNull
    public static final TextStyle copyAndSetFontPadding(@NotNull TextStyle style, boolean z) {
        TextStyle m73414copyCXVQc50;
        Intrinsics.checkNotNullParameter(style, "style");
        m73414copyCXVQc50 = style.m73414copyCXVQc50((r46 & 1) != 0 ? style.f31200a.m73360getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? style.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? style.f31200a.getFontWeight() : null, (r46 & 8) != 0 ? style.f31200a.m73362getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? style.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? style.f31200a.getFontFamily() : null, (r46 & 64) != 0 ? style.f31200a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? style.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? style.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? style.f31200a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? style.f31200a.getLocaleList() : null, (r46 & 2048) != 0 ? style.f31200a.m73358getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? style.f31200a.getTextDecoration() : null, (r46 & 8192) != 0 ? style.f31200a.getShadow() : null, (r46 & 16384) != 0 ? style.f31201b.m73316getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? style.f31201b.m73318getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? style.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? style.f31201b.getTextIndent() : null, (r46 & 262144) != 0 ? style.f31202c : new PlatformTextStyle(z), (r46 & 524288) != 0 ? style.f31201b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? style.f31201b.m73313getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? style.f31201b.m73311getHyphensEaSxIns() : null);
        return m73414copyCXVQc50;
    }
}