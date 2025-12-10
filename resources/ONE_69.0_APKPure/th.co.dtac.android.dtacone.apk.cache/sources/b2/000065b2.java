package androidx.compose.p003ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.android.style.TypefaceSpan;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1 */
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {
    final /* synthetic */ Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
        invoke(spanStyle, num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull SpanStyle spanStyle, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function4 = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m73362getFontStyle4Lr2A7w = spanStyle.m73362getFontStyle4Lr2A7w();
        FontStyle m73492boximpl = FontStyle.m73492boximpl(m73362getFontStyle4Lr2A7w != null ? m73362getFontStyle4Lr2A7w.m73498unboximpl() : FontStyle.Companion.m73500getNormal_LCdwA());
        FontSynthesis m73363getFontSynthesisZQGJjVo = spanStyle.m73363getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan(function4.invoke(fontFamily, fontWeight, m73492boximpl, FontSynthesis.m73501boximpl(m73363getFontSynthesisZQGJjVo != null ? m73363getFontSynthesisZQGJjVo.m73509unboximpl() : FontSynthesis.Companion.m73510getAllGVVA2EU()))), i, i2, 33);
    }
}