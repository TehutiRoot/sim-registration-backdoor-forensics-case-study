package androidx.compose.p003ui.text.android.selection;

import androidx.compose.p003ui.text.android.CharSequenceCharacterIterator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006'"}, m29142d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", TypedValues.CycleType.S_WAVE_OFFSET, "nextBoundary", "(I)I", "prevBoundary", "getPrevWordBeginningOnTwoWordsBoundary", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "", "isAfterPunctuation", "(I)Z", "isOnPunctuation", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(IZ)I", OperatorName.CURVE_TO, OperatorName.NON_STROKING_GRAY, OperatorName.FILL_NON_ZERO, "d", "e", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)V", "Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.selection.WordIterator */
/* loaded from: classes2.dex */
public final class WordIterator {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final CharSequence f31260a;

    /* renamed from: b */
    public final int f31261b;

    /* renamed from: c */
    public final int f31262c;

    /* renamed from: d */
    public final BreakIterator f31263d;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.android.selection.WordIterator$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i) {
            int type = Character.getType(i);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }

        public Companion() {
        }
    }

    public WordIterator(@NotNull CharSequence charSequence, int i, int i2, @Nullable Locale locale) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f31260a = charSequence;
        if (i >= 0 && i <= charSequence.length()) {
            if (i2 >= 0 && i2 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
                this.f31263d = wordInstance;
                this.f31261b = Math.max(0, i - 50);
                this.f31262c = Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    /* renamed from: a */
    public final void m59012a(int i) {
        int i2 = this.f31261b;
        if (i <= this.f31262c && i2 <= i) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.f31261b + " , " + this.f31262c + AbstractJsonLexerKt.END_LIST).toString());
    }

    /* renamed from: b */
    public final int m59011b(int i, boolean z) {
        m59012a(i);
        if (m59008e(i)) {
            if (!this.f31263d.isBoundary(i) || (m59009d(i) && z)) {
                return this.f31263d.preceding(i);
            }
            return i;
        } else if (m59009d(i)) {
            return this.f31263d.preceding(i);
        } else {
            return -1;
        }
    }

    /* renamed from: c */
    public final int m59010c(int i, boolean z) {
        m59012a(i);
        if (m59009d(i)) {
            if (!this.f31263d.isBoundary(i) || (m59008e(i) && z)) {
                return this.f31263d.following(i);
            }
            return i;
        } else if (m59008e(i)) {
            return this.f31263d.following(i);
        } else {
            return -1;
        }
    }

    /* renamed from: d */
    public final boolean m59009d(int i) {
        int i2 = this.f31261b + 1;
        if (i <= this.f31262c && i2 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.f31260a, i))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m59008e(int i) {
        int i2 = this.f31261b;
        if (i < this.f31262c && i2 <= i && Character.isLetterOrDigit(Character.codePointAt(this.f31260a, i))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m59007f(int i) {
        if (!isOnPunctuation(i) && isAfterPunctuation(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m59006g(int i) {
        if (isOnPunctuation(i) && !isAfterPunctuation(i)) {
            return true;
        }
        return false;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return m59010c(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return m59011b(i, true);
    }

    public final int getPunctuationBeginning(int i) {
        m59012a(i);
        while (i != -1 && !m59006g(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        m59012a(i);
        while (i != -1 && !m59007f(i)) {
            i = nextBoundary(i);
        }
        return i;
    }

    public final boolean isAfterPunctuation(int i) {
        int i2 = this.f31261b + 1;
        if (i <= this.f31262c && i2 <= i) {
            return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.f31260a, i));
        }
        return false;
    }

    public final boolean isOnPunctuation(int i) {
        int i2 = this.f31261b;
        if (i < this.f31262c && i2 <= i) {
            return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.f31260a, i));
        }
        return false;
    }

    public final int nextBoundary(int i) {
        m59012a(i);
        return this.f31263d.following(i);
    }

    public final int prevBoundary(int i) {
        m59012a(i);
        return this.f31263d.preceding(i);
    }
}