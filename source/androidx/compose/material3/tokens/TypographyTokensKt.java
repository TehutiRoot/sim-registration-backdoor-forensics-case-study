package androidx.compose.material3.tokens;

import androidx.compose.material3.DefaultPlatformTextStyle_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/ui/text/TextStyle;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TypographyTokensKt {

    /* renamed from: a */
    public static final TextStyle f28185a;

    static {
        TextStyle m73230copyCXVQc50;
        m73230copyCXVQc50 = r1.m73230copyCXVQc50((r46 & 1) != 0 ? r1.f31112a.m73176getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r1.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r1.f31112a.getFontWeight() : null, (r46 & 8) != 0 ? r1.f31112a.m73178getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r1.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r1.f31112a.getFontFamily() : null, (r46 & 64) != 0 ? r1.f31112a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r1.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r1.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r1.f31112a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r1.f31112a.getLocaleList() : null, (r46 & 2048) != 0 ? r1.f31112a.m73174getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r1.f31112a.getTextDecoration() : null, (r46 & 8192) != 0 ? r1.f31112a.getShadow() : null, (r46 & 16384) != 0 ? r1.f31113b.m73132getTextAlignbuA522U() : null, (r46 & 32768) != 0 ? r1.f31113b.m73134getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r1.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r1.f31113b.getTextIndent() : null, (r46 & 262144) != 0 ? r1.f31114c : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r46 & 524288) != 0 ? r1.f31113b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r1.f31113b.m73129getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TextStyle.Companion.getDefault().f31113b.m73127getHyphensEaSxIns() : null);
        f28185a = m73230copyCXVQc50;
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return f28185a;
    }
}
