package androidx.compose.p003ui.text.style;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.style.TextAlign */
/* loaded from: classes2.dex */
public final class TextAlign {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31549b = m73542constructorimpl(1);

    /* renamed from: c */
    public static final int f31550c = m73542constructorimpl(2);

    /* renamed from: d */
    public static final int f31551d = m73542constructorimpl(3);

    /* renamed from: e */
    public static final int f31552e = m73542constructorimpl(4);

    /* renamed from: f */
    public static final int f31553f = m73542constructorimpl(5);

    /* renamed from: g */
    public static final int f31554g = m73542constructorimpl(6);

    /* renamed from: a */
    public final int f31555a;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013ø\u0001\u0000R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "()V", "Center", "Landroidx/compose/ui/text/style/TextAlign;", "getCenter-e0LSkKk", "()I", "I", "End", "getEnd-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Left", "getLeft-e0LSkKk", "Right", "getRight-e0LSkKk", "Start", "getStart-e0LSkKk", "values", "", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.style.TextAlign$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk  reason: not valid java name */
        public final int m73548getCentere0LSkKk() {
            return TextAlign.f31551d;
        }

        /* renamed from: getEnd-e0LSkKk  reason: not valid java name */
        public final int m73549getEnde0LSkKk() {
            return TextAlign.f31554g;
        }

        /* renamed from: getJustify-e0LSkKk  reason: not valid java name */
        public final int m73550getJustifye0LSkKk() {
            return TextAlign.f31552e;
        }

        /* renamed from: getLeft-e0LSkKk  reason: not valid java name */
        public final int m73551getLefte0LSkKk() {
            return TextAlign.f31549b;
        }

        /* renamed from: getRight-e0LSkKk  reason: not valid java name */
        public final int m73552getRighte0LSkKk() {
            return TextAlign.f31550c;
        }

        /* renamed from: getStart-e0LSkKk  reason: not valid java name */
        public final int m73553getStarte0LSkKk() {
            return TextAlign.f31553f;
        }

        @NotNull
        public final List<TextAlign> values() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new TextAlign[]{TextAlign.m73541boximpl(m73551getLefte0LSkKk()), TextAlign.m73541boximpl(m73552getRighte0LSkKk()), TextAlign.m73541boximpl(m73548getCentere0LSkKk()), TextAlign.m73541boximpl(m73550getJustifye0LSkKk()), TextAlign.m73541boximpl(m73553getStarte0LSkKk()), TextAlign.m73541boximpl(m73549getEnde0LSkKk())});
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextAlign(int i) {
        this.f31555a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextAlign m73541boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m73542constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73543equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m73547unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73544equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73545hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73546toStringimpl(int i) {
        if (m73544equalsimpl0(i, f31549b)) {
            return "Left";
        }
        if (m73544equalsimpl0(i, f31550c)) {
            return "Right";
        }
        if (m73544equalsimpl0(i, f31551d)) {
            return "Center";
        }
        if (m73544equalsimpl0(i, f31552e)) {
            return "Justify";
        }
        if (m73544equalsimpl0(i, f31553f)) {
            return "Start";
        }
        if (m73544equalsimpl0(i, f31554g)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73543equalsimpl(this.f31555a, obj);
    }

    public int hashCode() {
        return m73545hashCodeimpl(this.f31555a);
    }

    @NotNull
    public String toString() {
        return m73546toStringimpl(this.f31555a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73547unboximpl() {
        return this.f31555a;
    }
}
