package androidx.compose.p003ui.text.platform;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.EmojiSupportMatch;
import androidx.compose.p003ui.text.ParagraphIntrinsics;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.PlatformParagraphStyle;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.unit.Density;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "resolveTextDirectionHeuristics-9GRLPo0", "(Landroidx/compose/ui/text/style/TextDirection;Landroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/TextStyle;)Z", "hasEmojiCompat", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt */
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* renamed from: a */
    public static final boolean m58998a(TextStyle textStyle) {
        EmojiSupportMatch emojiSupportMatch;
        boolean m73099equalsimpl0;
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphStyle = platformStyle.getParagraphStyle()) != null) {
            emojiSupportMatch = EmojiSupportMatch.m73097boximpl(paragraphStyle.m73155getEmojiSupportMatch_3YsG6Y());
        } else {
            emojiSupportMatch = null;
        }
        int m73104getNone_3YsG6Y = EmojiSupportMatch.Companion.m73104getNone_3YsG6Y();
        if (emojiSupportMatch == null) {
            m73099equalsimpl0 = false;
        } else {
            m73099equalsimpl0 = EmojiSupportMatch.m73099equalsimpl0(emojiSupportMatch.m73102unboximpl(), m73104getNone_3YsG6Y);
        }
        return !m73099equalsimpl0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r6 == null) goto L25;
     */
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m73432resolveTextDirectionHeuristics9GRLPo0(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextDirection r6, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.intl.LocaleList r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.m73560unboximpl()
            goto Ld
        L7:
            androidx.compose.ui.text.style.TextDirection$Companion r6 = androidx.compose.p003ui.text.style.TextDirection.Companion
            int r6 = r6.m73561getContents_7Xco()
        Ld:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.p003ui.text.style.TextDirection.Companion
            int r1 = r0.m73562getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.p003ui.text.style.TextDirection.m73557equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto L1b
            goto L6f
        L1b:
            int r1 = r0.m73563getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.p003ui.text.style.TextDirection.m73557equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L28
        L26:
            r2 = 3
            goto L6f
        L28:
            int r1 = r0.m73564getLtrs_7Xco()
            boolean r1 = androidx.compose.p003ui.text.style.TextDirection.m73557equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L35
            r2 = 0
            goto L6f
        L35:
            int r1 = r0.m73565getRtls_7Xco()
            boolean r1 = androidx.compose.p003ui.text.style.TextDirection.m73557equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L42
            r2 = 1
            goto L6f
        L42:
            int r0 = r0.m73561getContents_7Xco()
            boolean r6 = androidx.compose.p003ui.text.style.TextDirection.m73557equalsimpl0(r6, r0)
            if (r6 == 0) goto L70
            if (r7 == 0) goto L63
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale$ui_text_release()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.p003ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L67
        L63:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L67:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L6f
            if (r6 == r5) goto L26
        L6f:
            return r2
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.platform.AndroidParagraphIntrinsics_androidKt.m73432resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default  reason: not valid java name */
    public static /* synthetic */ int m73433resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            textDirection = null;
        }
        if ((i & 2) != 0) {
            localeList = null;
        }
        return m73432resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
