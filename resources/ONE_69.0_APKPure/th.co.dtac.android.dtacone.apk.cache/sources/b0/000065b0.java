package androidx.compose.p003ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.PlaceholderVerticalAlign;
import androidx.compose.p003ui.text.android.style.PlaceholderSpan;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"!\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"!\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m29142d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "", "setPlaceholders", "(Landroid/text/Spannable;Ljava/util/List;Landroidx/compose/ui/unit/Density;)V", "placeholder", "", "start", "end", OperatorName.CURVE_TO, "(Landroid/text/Spannable;Landroidx/compose/ui/text/Placeholder;IILandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/TextUnit;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt */
/* loaded from: classes2.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: a */
    public static final int m58945a(long j) {
        long m74022getTypeUIouoOA = TextUnit.m74022getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74056getSpUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74055getEmUIouoOA())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static final int m58944b(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73332getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73338getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73333getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73334getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73337getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73335getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m73328equalsimpl0(i, companion.m73336getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: c */
    public static final void m58943c(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        Object[] spans = spannable.getSpans(i, i2, EmojiSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m74023getValueimpl(placeholder.m73324getWidthXSAIIZE()), m58945a(placeholder.m73324getWidthXSAIIZE()), TextUnit.m74023getValueimpl(placeholder.m73322getHeightXSAIIZE()), m58945a(placeholder.m73322getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m58944b(placeholder.m73323getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    public static final void setPlaceholders(@NotNull Spannable spannable, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<Placeholder> range = placeholders.get(i);
            m58943c(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}