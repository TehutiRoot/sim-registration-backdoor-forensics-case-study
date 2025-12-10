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

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        TextStyle m19849a;
        TextStyle m19849a2;
        TextStyle m19849a3;
        TextStyle m73234copyv2rsoow;
        TextStyle m19849a4;
        TextStyle m73234copyv2rsoow2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getDidOverflowWidth()) {
            m19849a = AutoResizeTextKt.m19849a(this.$resizedTextStyle$delegate);
            if (TextUnitKt.m73857isUnspecifiedR2X_6o(m19849a.m73238getFontSizeXSAIIZE())) {
                MutableState<TextStyle> mutableState = this.$resizedTextStyle$delegate;
                m19849a4 = AutoResizeTextKt.m19849a(mutableState);
                m73234copyv2rsoow2 = m19849a4.m73234copyv2rsoow((r48 & 1) != 0 ? m19849a4.f31112a.m73176getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? m19849a4.f31112a.m73177getFontSizeXSAIIZE() : this.$defaultFontSize, (r48 & 4) != 0 ? m19849a4.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? m19849a4.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? m19849a4.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? m19849a4.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? m19849a4.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? m19849a4.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? m19849a4.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? m19849a4.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? m19849a4.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? m19849a4.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? m19849a4.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? m19849a4.f31112a.getShadow() : null, (r48 & 16384) != 0 ? m19849a4.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? m19849a4.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? m19849a4.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? m19849a4.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? m19849a4.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? m19849a4.f31114c : null, (r48 & 1048576) != 0 ? m19849a4.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? m19849a4.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? m19849a4.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? m19849a4.f31113b.getTextMotion() : null);
                AutoResizeTextKt.m19848b(mutableState, m73234copyv2rsoow2);
            }
            MutableState<TextStyle> mutableState2 = this.$resizedTextStyle$delegate;
            m19849a2 = AutoResizeTextKt.m19849a(mutableState2);
            m19849a3 = AutoResizeTextKt.m19849a(this.$resizedTextStyle$delegate);
            long m73238getFontSizeXSAIIZE = m19849a3.m73238getFontSizeXSAIIZE();
            TextUnitKt.m73852checkArithmeticR2X_6o(m73238getFontSizeXSAIIZE);
            m73234copyv2rsoow = m19849a2.m73234copyv2rsoow((r48 & 1) != 0 ? m19849a2.f31112a.m73176getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? m19849a2.f31112a.m73177getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m73837getRawTypeimpl(m73238getFontSizeXSAIIZE), (float) (TextUnit.m73839getValueimpl(m73238getFontSizeXSAIIZE) * 0.99d)), (r48 & 4) != 0 ? m19849a2.f31112a.getFontWeight() : null, (r48 & 8) != 0 ? m19849a2.f31112a.m73178getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? m19849a2.f31112a.m73179getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? m19849a2.f31112a.getFontFamily() : null, (r48 & 64) != 0 ? m19849a2.f31112a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? m19849a2.f31112a.m73180getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? m19849a2.f31112a.m73175getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? m19849a2.f31112a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? m19849a2.f31112a.getLocaleList() : null, (r48 & 2048) != 0 ? m19849a2.f31112a.m73174getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? m19849a2.f31112a.getTextDecoration() : null, (r48 & 8192) != 0 ? m19849a2.f31112a.getShadow() : null, (r48 & 16384) != 0 ? m19849a2.f31112a.getDrawStyle() : null, (r48 & 32768) != 0 ? m19849a2.f31113b.m73132getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? m19849a2.f31113b.m73134getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? m19849a2.f31113b.m73131getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? m19849a2.f31113b.getTextIndent() : null, (r48 & 524288) != 0 ? m19849a2.f31114c : null, (r48 & 1048576) != 0 ? m19849a2.f31113b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? m19849a2.f31113b.m73129getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? m19849a2.f31113b.m73127getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? m19849a2.f31113b.getTextMotion() : null);
            AutoResizeTextKt.m19848b(mutableState2, m73234copyv2rsoow);
            return;
        }
        AutoResizeTextKt.m19846d(this.$readyToDraw$delegate, true);
    }
}
