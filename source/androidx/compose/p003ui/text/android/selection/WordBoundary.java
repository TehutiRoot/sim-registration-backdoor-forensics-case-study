package androidx.compose.p003ui.text.android.selection;

import androidx.compose.p003ui.text.android.InternalPlatformTextApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "Ljava/util/Locale;", "locale", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "(I)I", "getWordEnd", "Landroidx/compose/ui/text/android/selection/WordIterator;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.selection.WordBoundary */
/* loaded from: classes2.dex */
public final class WordBoundary {

    /* renamed from: a */
    public final WordIterator f31171a;

    public WordBoundary(@NotNull Locale locale, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f31171a = new WordIterator(text, 0, text.length(), locale);
    }

    public final int getWordEnd(int i) {
        int nextWordEndOnTwoWordBoundary;
        if (this.f31171a.isAfterPunctuation(this.f31171a.nextBoundary(i))) {
            nextWordEndOnTwoWordBoundary = this.f31171a.getPunctuationEnd(i);
        } else {
            nextWordEndOnTwoWordBoundary = this.f31171a.getNextWordEndOnTwoWordBoundary(i);
        }
        if (nextWordEndOnTwoWordBoundary != -1) {
            return nextWordEndOnTwoWordBoundary;
        }
        return i;
    }

    public final int getWordStart(int i) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.f31171a.isOnPunctuation(this.f31171a.prevBoundary(i))) {
            prevWordBeginningOnTwoWordsBoundary = this.f31171a.getPunctuationBeginning(i);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.f31171a.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        if (prevWordBeginningOnTwoWordsBoundary != -1) {
            return prevWordBeginningOnTwoWordsBoundary;
        }
        return i;
    }
}
