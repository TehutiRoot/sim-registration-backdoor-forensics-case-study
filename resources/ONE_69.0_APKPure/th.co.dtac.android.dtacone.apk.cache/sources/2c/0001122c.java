package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nAutoResizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoResizeText.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/AutoResizeTextKt$AutoResizeText$2$1\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,52:1\n159#2,2:53\n*S KotlinDebug\n*F\n+ 1 AutoResizeText.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/AutoResizeTextKt$AutoResizeText$2$1\n*L\n46#1:53,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.AutoResizeTextKt$AutoResizeText$2$1 */
/* loaded from: classes7.dex */
public final class AutoResizeTextKt$AutoResizeText$2$1 extends Lambda implements Function1<TextLayoutResult, Unit> {
    final /* synthetic */ long $defaultFontSize;
    final /* synthetic */ MutableState<Boolean> $readyToDraw$delegate;
    final /* synthetic */ MutableState<TextStyle> $resizedTextStyle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoResizeTextKt$AutoResizeText$2$1(long j, MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$defaultFontSize = j;
        this.$resizedTextStyle$delegate = mutableState;
        this.$readyToDraw$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextLayoutResult result) {
        TextStyle m20024a;
        TextStyle m20024a2;
        TextStyle m20024a3;
        TextStyle m73418copyv2rsoow;
        TextStyle m20024a4;
        TextStyle m73418copyv2rsoow2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getDidOverflowWidth()) {
            m20024a = AutoResizeTextKt.m20024a(this.$resizedTextStyle$delegate);
            if (TextUnitKt.m74041isUnspecifiedR2X_6o(m20024a.m73422getFontSizeXSAIIZE())) {
                MutableState<TextStyle> mutableState = this.$resizedTextStyle$delegate;
                m20024a4 = AutoResizeTextKt.m20024a(mutableState);
                m73418copyv2rsoow2 = m20024a4.m73418copyv2rsoow((r48 & 1) != 0 ? m20024a4.f31200a.m73360getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? m20024a4.f31200a.m73361getFontSizeXSAIIZE() : this.$defaultFontSize, (r48 & 4) != 0 ? m20024a4.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? m20024a4.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? m20024a4.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? m20024a4.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? m20024a4.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? m20024a4.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? m20024a4.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? m20024a4.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? m20024a4.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? m20024a4.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? m20024a4.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? m20024a4.f31200a.getShadow() : null, (r48 & 16384) != 0 ? m20024a4.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? m20024a4.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? m20024a4.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? m20024a4.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? m20024a4.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? m20024a4.f31202c : null, (r48 & 1048576) != 0 ? m20024a4.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? m20024a4.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? m20024a4.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? m20024a4.f31201b.getTextMotion() : null);
                AutoResizeTextKt.m20023b(mutableState, m73418copyv2rsoow2);
            }
            MutableState<TextStyle> mutableState2 = this.$resizedTextStyle$delegate;
            m20024a2 = AutoResizeTextKt.m20024a(mutableState2);
            m20024a3 = AutoResizeTextKt.m20024a(this.$resizedTextStyle$delegate);
            long m73422getFontSizeXSAIIZE = m20024a3.m73422getFontSizeXSAIIZE();
            TextUnitKt.m74036checkArithmeticR2X_6o(m73422getFontSizeXSAIIZE);
            m73418copyv2rsoow = m20024a2.m73418copyv2rsoow((r48 & 1) != 0 ? m20024a2.f31200a.m73360getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? m20024a2.f31200a.m73361getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m74021getRawTypeimpl(m73422getFontSizeXSAIIZE), (float) (TextUnit.m74023getValueimpl(m73422getFontSizeXSAIIZE) * 0.99d)), (r48 & 4) != 0 ? m20024a2.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? m20024a2.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? m20024a2.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? m20024a2.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? m20024a2.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? m20024a2.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? m20024a2.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? m20024a2.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? m20024a2.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? m20024a2.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? m20024a2.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? m20024a2.f31200a.getShadow() : null, (r48 & 16384) != 0 ? m20024a2.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? m20024a2.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? m20024a2.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? m20024a2.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? m20024a2.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? m20024a2.f31202c : null, (r48 & 1048576) != 0 ? m20024a2.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? m20024a2.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? m20024a2.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? m20024a2.f31201b.getTextMotion() : null);
            AutoResizeTextKt.m20023b(mutableState2, m73418copyv2rsoow);
            return;
        }
        AutoResizeTextKt.m20021d(this.$readyToDraw$delegate, true);
    }
}