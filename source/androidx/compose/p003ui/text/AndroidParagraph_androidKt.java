package androidx.compose.p003ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p003ui.text.android.TextLayout;
import androidx.compose.p003ui.text.android.style.IndentationFixSpan;
import androidx.compose.p003ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28850d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "align", "", "d", "(Landroidx/compose/ui/text/style/TextAlign;)I", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/text/style/Hyphens;)I", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "breakStrategy", "e", "(Landroidx/compose/ui/text/style/LineBreak$Strategy;)I", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "lineBreakStrictness", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/text/style/LineBreak$Strictness;)I", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "lineBreakWordStyle", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/text/style/LineBreak$WordBreak;)I", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/android/TextLayout;I)I", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "ellipsis", OperatorName.CURVE_TO, "(Landroidx/compose/ui/text/TextStyle;Z)Z", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.AndroidParagraph_androidKt */
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    /* renamed from: a */
    public static final CharSequence m59127a(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* renamed from: b */
    public static final int m59126b(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* renamed from: c */
    public static final boolean m59125c(TextStyle textStyle, boolean z) {
        boolean m73544equalsimpl0;
        boolean m73544equalsimpl02;
        if (!z || TextUnit.m73836equalsimpl0(textStyle.m73242getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m73836equalsimpl0(textStyle.m73242getLetterSpacingXSAIIZE(), TextUnit.Companion.m73850getUnspecifiedXSAIIZE()) || textStyle.m73245getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign m73245getTextAlignbuA522U = textStyle.m73245getTextAlignbuA522U();
        TextAlign.Companion companion = TextAlign.Companion;
        int m73553getStarte0LSkKk = companion.m73553getStarte0LSkKk();
        if (m73245getTextAlignbuA522U == null) {
            m73544equalsimpl0 = false;
        } else {
            m73544equalsimpl0 = TextAlign.m73544equalsimpl0(m73245getTextAlignbuA522U.m73547unboximpl(), m73553getStarte0LSkKk);
        }
        if (m73544equalsimpl0) {
            return false;
        }
        TextAlign m73245getTextAlignbuA522U2 = textStyle.m73245getTextAlignbuA522U();
        int m73550getJustifye0LSkKk = companion.m73550getJustifye0LSkKk();
        if (m73245getTextAlignbuA522U2 == null) {
            m73544equalsimpl02 = false;
        } else {
            m73544equalsimpl02 = TextAlign.m73544equalsimpl0(m73245getTextAlignbuA522U2.m73547unboximpl(), m73550getJustifye0LSkKk);
        }
        if (m73544equalsimpl02) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final int m59124d(TextAlign textAlign) {
        boolean m73544equalsimpl0;
        boolean m73544equalsimpl02;
        boolean m73544equalsimpl03;
        boolean m73544equalsimpl04;
        boolean m73544equalsimpl05;
        TextAlign.Companion companion = TextAlign.Companion;
        int m73551getLefte0LSkKk = companion.m73551getLefte0LSkKk();
        if (textAlign == null) {
            m73544equalsimpl0 = false;
        } else {
            m73544equalsimpl0 = TextAlign.m73544equalsimpl0(textAlign.m73547unboximpl(), m73551getLefte0LSkKk);
        }
        if (m73544equalsimpl0) {
            return 3;
        }
        int m73552getRighte0LSkKk = companion.m73552getRighte0LSkKk();
        if (textAlign == null) {
            m73544equalsimpl02 = false;
        } else {
            m73544equalsimpl02 = TextAlign.m73544equalsimpl0(textAlign.m73547unboximpl(), m73552getRighte0LSkKk);
        }
        if (m73544equalsimpl02) {
            return 4;
        }
        int m73548getCentere0LSkKk = companion.m73548getCentere0LSkKk();
        if (textAlign == null) {
            m73544equalsimpl03 = false;
        } else {
            m73544equalsimpl03 = TextAlign.m73544equalsimpl0(textAlign.m73547unboximpl(), m73548getCentere0LSkKk);
        }
        if (m73544equalsimpl03) {
            return 2;
        }
        int m73553getStarte0LSkKk = companion.m73553getStarte0LSkKk();
        if (textAlign == null) {
            m73544equalsimpl04 = false;
        } else {
            m73544equalsimpl04 = TextAlign.m73544equalsimpl0(textAlign.m73547unboximpl(), m73553getStarte0LSkKk);
        }
        if (m73544equalsimpl04) {
            return 0;
        }
        int m73549getEnde0LSkKk = companion.m73549getEnde0LSkKk();
        if (textAlign == null) {
            m73544equalsimpl05 = false;
        } else {
            m73544equalsimpl05 = TextAlign.m73544equalsimpl0(textAlign.m73547unboximpl(), m73549getEnde0LSkKk);
        }
        if (!m73544equalsimpl05) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e */
    public static final int m59123e(LineBreak.Strategy strategy) {
        boolean m73489equalsimpl0;
        boolean m73489equalsimpl02;
        boolean m73489equalsimpl03;
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        int m73495getSimplefcGXIks = companion.m73495getSimplefcGXIks();
        if (strategy == null) {
            m73489equalsimpl0 = false;
        } else {
            m73489equalsimpl0 = LineBreak.Strategy.m73489equalsimpl0(strategy.m73492unboximpl(), m73495getSimplefcGXIks);
        }
        if (m73489equalsimpl0) {
            return 0;
        }
        int m73494getHighQualityfcGXIks = companion.m73494getHighQualityfcGXIks();
        if (strategy == null) {
            m73489equalsimpl02 = false;
        } else {
            m73489equalsimpl02 = LineBreak.Strategy.m73489equalsimpl0(strategy.m73492unboximpl(), m73494getHighQualityfcGXIks);
        }
        if (m73489equalsimpl02) {
            return 1;
        }
        int m73493getBalancedfcGXIks = companion.m73493getBalancedfcGXIks();
        if (strategy == null) {
            m73489equalsimpl03 = false;
        } else {
            m73489equalsimpl03 = LineBreak.Strategy.m73489equalsimpl0(strategy.m73492unboximpl(), m73493getBalancedfcGXIks);
        }
        if (!m73489equalsimpl03) {
            return 0;
        }
        return 2;
    }

    /* renamed from: f */
    public static final int m59122f(Hyphens hyphens) {
        boolean m73465equalsimpl0;
        Hyphens.Companion companion = Hyphens.Companion;
        int m73469getAutovmbZdU8 = companion.m73469getAutovmbZdU8();
        if (hyphens == null) {
            m73465equalsimpl0 = false;
        } else {
            m73465equalsimpl0 = Hyphens.m73465equalsimpl0(hyphens.m73468unboximpl(), m73469getAutovmbZdU8);
        }
        if (m73465equalsimpl0) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        int m73470getNonevmbZdU8 = companion.m73470getNonevmbZdU8();
        if (hyphens == null) {
            return 0;
        }
        Hyphens.m73465equalsimpl0(hyphens.m73468unboximpl(), m73470getNonevmbZdU8);
        return 0;
    }

    /* renamed from: g */
    public static final int m59121g(LineBreak.Strictness strictness) {
        boolean m73499equalsimpl0;
        boolean m73499equalsimpl02;
        boolean m73499equalsimpl03;
        boolean m73499equalsimpl04;
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        int m73503getDefaultusljTpc = companion.m73503getDefaultusljTpc();
        if (strictness == null) {
            m73499equalsimpl0 = false;
        } else {
            m73499equalsimpl0 = LineBreak.Strictness.m73499equalsimpl0(strictness.m73502unboximpl(), m73503getDefaultusljTpc);
        }
        if (m73499equalsimpl0) {
            return 0;
        }
        int m73504getLooseusljTpc = companion.m73504getLooseusljTpc();
        if (strictness == null) {
            m73499equalsimpl02 = false;
        } else {
            m73499equalsimpl02 = LineBreak.Strictness.m73499equalsimpl0(strictness.m73502unboximpl(), m73504getLooseusljTpc);
        }
        if (m73499equalsimpl02) {
            return 1;
        }
        int m73505getNormalusljTpc = companion.m73505getNormalusljTpc();
        if (strictness == null) {
            m73499equalsimpl03 = false;
        } else {
            m73499equalsimpl03 = LineBreak.Strictness.m73499equalsimpl0(strictness.m73502unboximpl(), m73505getNormalusljTpc);
        }
        if (m73499equalsimpl03) {
            return 2;
        }
        int m73506getStrictusljTpc = companion.m73506getStrictusljTpc();
        if (strictness == null) {
            m73499equalsimpl04 = false;
        } else {
            m73499equalsimpl04 = LineBreak.Strictness.m73499equalsimpl0(strictness.m73502unboximpl(), m73506getStrictusljTpc);
        }
        if (!m73499equalsimpl04) {
            return 0;
        }
        return 3;
    }

    /* renamed from: h */
    public static final int m59120h(LineBreak.WordBreak wordBreak) {
        boolean m73510equalsimpl0;
        boolean m73510equalsimpl02;
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        int m73514getDefaultjp8hJ3c = companion.m73514getDefaultjp8hJ3c();
        if (wordBreak == null) {
            m73510equalsimpl0 = false;
        } else {
            m73510equalsimpl0 = LineBreak.WordBreak.m73510equalsimpl0(wordBreak.m73513unboximpl(), m73514getDefaultjp8hJ3c);
        }
        if (m73510equalsimpl0) {
            return 0;
        }
        int m73515getPhrasejp8hJ3c = companion.m73515getPhrasejp8hJ3c();
        if (wordBreak == null) {
            m73510equalsimpl02 = false;
        } else {
            m73510equalsimpl02 = LineBreak.WordBreak.m73510equalsimpl0(wordBreak.m73513unboximpl(), m73515getPhrasejp8hJ3c);
        }
        if (!m73510equalsimpl02) {
            return 0;
        }
        return 1;
    }
}
