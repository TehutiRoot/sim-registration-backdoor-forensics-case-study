package androidx.compose.p003ui.text.input;

import androidx.compose.runtime.Stable;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization */
/* loaded from: classes2.dex */
public final class KeyboardCapitalization {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31387b = m73381constructorimpl(0);

    /* renamed from: c */
    public static final int f31388c = m73381constructorimpl(1);

    /* renamed from: d */
    public static final int f31389d = m73381constructorimpl(2);

    /* renamed from: e */
    public static final int f31390e = m73381constructorimpl(3);

    /* renamed from: a */
    public final int f31391a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;", "", "()V", AFMParser.CHARACTERS, "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCharacters-IUNYP9k$annotations", "getCharacters-IUNYP9k", "()I", "I", "None", "getNone-IUNYP9k$annotations", "getNone-IUNYP9k", "Sentences", "getSentences-IUNYP9k$annotations", "getSentences-IUNYP9k", "Words", "getWords-IUNYP9k$annotations", "getWords-IUNYP9k", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m73387getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m73388getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m73389getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m73390getWordsIUNYP9k$annotations() {
        }

        /* renamed from: getCharacters-IUNYP9k  reason: not valid java name */
        public final int m73391getCharactersIUNYP9k() {
            return KeyboardCapitalization.f31388c;
        }

        /* renamed from: getNone-IUNYP9k  reason: not valid java name */
        public final int m73392getNoneIUNYP9k() {
            return KeyboardCapitalization.f31387b;
        }

        /* renamed from: getSentences-IUNYP9k  reason: not valid java name */
        public final int m73393getSentencesIUNYP9k() {
            return KeyboardCapitalization.f31390e;
        }

        /* renamed from: getWords-IUNYP9k  reason: not valid java name */
        public final int m73394getWordsIUNYP9k() {
            return KeyboardCapitalization.f31389d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ KeyboardCapitalization(int i) {
        this.f31391a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m73380boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m73381constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73382equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).m73386unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73383equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73384hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73385toStringimpl(int i) {
        if (m73383equalsimpl0(i, f31387b)) {
            return "None";
        }
        if (m73383equalsimpl0(i, f31388c)) {
            return AFMParser.CHARACTERS;
        }
        if (m73383equalsimpl0(i, f31389d)) {
            return "Words";
        }
        if (m73383equalsimpl0(i, f31390e)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73382equalsimpl(this.f31391a, obj);
    }

    public int hashCode() {
        return m73384hashCodeimpl(this.f31391a);
    }

    @NotNull
    public String toString() {
        return m73385toStringimpl(this.f31391a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73386unboximpl() {
        return this.f31391a;
    }
}
