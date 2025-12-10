package androidx.compose.material;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily;", "default", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TypographyKt {

    /* renamed from: a */
    public static final TextStyle f14749a;

    /* renamed from: b */
    public static final ProvidableCompositionLocal f14750b;

    static {
        TextStyle m73234copyv2rsoow;
        m73234copyv2rsoow = r1.m73234copyv2rsoow((r48 & 1) != 0 ? r1.f31112a.m73176getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r1.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r1.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? r1.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r1.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r1.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? r1.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r1.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r1.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r1.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r1.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? r1.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r1.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? r1.f31112a.getShadow() : null, (r48 & 16384) != 0 ? r1.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? r1.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r1.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r1.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r1.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? r1.f31114c : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r1.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r1.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r1.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TextStyle.Companion.getDefault().f31113b.getTextMotion() : null);
        f14749a = m73234copyv2rsoow;
        f14750b = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);
    }

    /* renamed from: a */
    public static final TextStyle m60756a(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m73234copyv2rsoow;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m73234copyv2rsoow = textStyle.m73234copyv2rsoow((r48 & 1) != 0 ? textStyle.f31112a.m73176getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.f31112a.m73177getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.f31112a.getFontFamily() : fontFamily, (r48 & 64) != 0 ? textStyle.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.f31112a.getShadow() : null, (r48 & 16384) != 0 ? textStyle.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? textStyle.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? textStyle.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.f31114c : null, (r48 & 1048576) != 0 ? textStyle.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? textStyle.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? textStyle.f31113b.getTextMotion() : null);
        return m73234copyv2rsoow;
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return f14749a;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return f14750b;
    }
}
