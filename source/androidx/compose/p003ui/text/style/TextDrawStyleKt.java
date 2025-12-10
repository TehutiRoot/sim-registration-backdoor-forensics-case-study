package androidx.compose.p003ui.text.style;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.text.SpanStyleKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "modulate", "Lkotlin/Function0;", "block", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FLkotlin/jvm/functions/Function0;)F", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@JvmName(name = "TextDrawStyleKt")
/* renamed from: androidx.compose.ui.text.style.TextDrawStyleKt */
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    /* renamed from: a */
    public static final float m58969a(float f, Function0 function0) {
        if (Float.isNaN(f)) {
            return ((Number) function0.invoke()).floatValue();
        }
        return f;
    }

    @NotNull
    public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle start, @NotNull TextForegroundStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        boolean z = start instanceof C0750Kc;
        if (!z && !(stop instanceof C0750Kc)) {
            return TextForegroundStyle.Companion.m73567from8_81llA(ColorKt.m71785lerpjxsXWHM(start.mo69180getColor0d7_KjU(), stop.mo69180getColor0d7_KjU(), f));
        }
        if (z && (stop instanceof C0750Kc)) {
            return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((C0750Kc) start).getBrush(), ((C0750Kc) stop).getBrush(), f), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), f));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(start, stop, f);
    }

    /* renamed from: modulate-DxMtmZc  reason: not valid java name */
    public static final long m73566modulateDxMtmZc(long j, float f) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return Color.m71734copywmQWz5c$default(j, Color.m71737getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j;
    }
}
