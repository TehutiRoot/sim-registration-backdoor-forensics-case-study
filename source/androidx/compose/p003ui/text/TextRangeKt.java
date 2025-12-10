package androidx.compose.p003ui.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\n\u0010\r\u001a'\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28850d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", "start", "end", "TextRange", "(II)J", FirebaseAnalytics.Param.INDEX, "(I)J", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "coerceIn", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextRangeKt */
/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m73205constructorimpl(m59092a(i, i2));
    }

    /* renamed from: a */
    public static final long m59092a(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                return (i2 & BodyPartID.bodyIdMax) | (i << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + AbstractJsonLexerKt.END_LIST).toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + AbstractJsonLexerKt.END_LIST).toString());
    }

    /* renamed from: coerceIn-8ffj60Q  reason: not valid java name */
    public static final long m73222coerceIn8ffj60Q(long j, int i, int i2) {
        int coerceIn = AbstractC11719c.coerceIn(TextRange.m73216getStartimpl(j), i, i2);
        int coerceIn2 = AbstractC11719c.coerceIn(TextRange.m73211getEndimpl(j), i, i2);
        if (coerceIn == TextRange.m73216getStartimpl(j) && coerceIn2 == TextRange.m73211getEndimpl(j)) {
            return j;
        }
        return TextRange(coerceIn, coerceIn2);
    }

    @NotNull
    /* renamed from: substring-FDrldGo  reason: not valid java name */
    public static final String m73223substringFDrldGo(@NotNull CharSequence substring, long j) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(TextRange.m73214getMinimpl(j), TextRange.m73213getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
