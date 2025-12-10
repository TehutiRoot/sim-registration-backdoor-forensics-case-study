package androidx.compose.p003ui.text.font;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy */
/* loaded from: classes2.dex */
public final class FontLoadingStrategy {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31282b = m59047a(0);

    /* renamed from: c */
    public static final int f31283c = m59047a(1);

    /* renamed from: d */
    public static final int f31284d = m59047a(2);

    /* renamed from: a */
    public final int f31285a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;", "", "()V", "Async", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getAsync-PKNRLFQ", "()I", "I", "Blocking", "getBlocking-PKNRLFQ", "OptionalLocal", "getOptionalLocal-PKNRLFQ", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ  reason: not valid java name */
        public final int m73302getAsyncPKNRLFQ() {
            return FontLoadingStrategy.f31284d;
        }

        /* renamed from: getBlocking-PKNRLFQ  reason: not valid java name */
        public final int m73303getBlockingPKNRLFQ() {
            return FontLoadingStrategy.f31282b;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ  reason: not valid java name */
        public final int m73304getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.f31283c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FontLoadingStrategy(int i) {
        this.f31285a = i;
    }

    /* renamed from: a */
    public static int m59047a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m73296boximpl(int i) {
        return new FontLoadingStrategy(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73297equalsimpl(int i, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i == ((FontLoadingStrategy) obj).m73301unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73298equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73299hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73300toStringimpl(int i) {
        if (m73298equalsimpl0(i, f31282b)) {
            return "Blocking";
        }
        if (m73298equalsimpl0(i, f31283c)) {
            return "Optional";
        }
        if (m73298equalsimpl0(i, f31284d)) {
            return "Async";
        }
        return "Invalid(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73297equalsimpl(this.f31285a, obj);
    }

    public final int getValue() {
        return this.f31285a;
    }

    public int hashCode() {
        return m73299hashCodeimpl(this.f31285a);
    }

    @NotNull
    public String toString() {
        return m73300toStringimpl(this.f31285a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73301unboximpl() {
        return this.f31285a;
    }
}
