package androidx.compose.p003ui.text.style;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Immutable
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000  2\u00020\u0001:\u0004 !\"#B$\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tB\u0014\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r\u0088\u0001\u000b\u0092\u0001\u00020\nø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "wordBreak", "constructor-impl", "(III)I", "", "mask", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "copy-gijOMQM", "(IIII)I", "copy", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "Companion", "Strategy", "Strictness", "WordBreak", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.style.LineBreak */
/* loaded from: classes2.dex */
public final class LineBreak {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31520b;

    /* renamed from: c */
    public static final int f31521c;

    /* renamed from: d */
    public static final int f31522d;

    /* renamed from: a */
    public final int f31523a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k", "()I", "I", PDAnnotationText.NAME_PARAGRAPH, "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k  reason: not valid java name */
        public final int m73483getHeadingrAG3T2k() {
            return LineBreak.f31521c;
        }

        /* renamed from: getParagraph-rAG3T2k  reason: not valid java name */
        public final int m73484getParagraphrAG3T2k() {
            return LineBreak.f31522d;
        }

        /* renamed from: getSimple-rAG3T2k  reason: not valid java name */
        public final int m73485getSimplerAG3T2k() {
            return LineBreak.f31520b;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy */
    /* loaded from: classes2.dex */
    public static final class Strategy {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31524b = m73487constructorimpl(1);

        /* renamed from: c */
        public static final int f31525c = m73487constructorimpl(2);

        /* renamed from: d */
        public static final int f31526d = m73487constructorimpl(3);

        /* renamed from: a */
        public final int f31527a;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "()V", "Balanced", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getBalanced-fcGXIks", "()I", "I", "HighQuality", "getHighQuality-fcGXIks", "Simple", "getSimple-fcGXIks", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks  reason: not valid java name */
            public final int m73493getBalancedfcGXIks() {
                return Strategy.f31526d;
            }

            /* renamed from: getHighQuality-fcGXIks  reason: not valid java name */
            public final int m73494getHighQualityfcGXIks() {
                return Strategy.f31525c;
            }

            /* renamed from: getSimple-fcGXIks  reason: not valid java name */
            public final int m73495getSimplefcGXIks() {
                return Strategy.f31524b;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Strategy(int i) {
            this.f31527a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strategy m73486boximpl(int i) {
            return new Strategy(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73487constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73488equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m73492unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73489equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73490hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73491toStringimpl(int i) {
            if (m73489equalsimpl0(i, f31524b)) {
                return "Strategy.Simple";
            }
            if (m73489equalsimpl0(i, f31525c)) {
                return "Strategy.HighQuality";
            }
            if (m73489equalsimpl0(i, f31526d)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73488equalsimpl(this.f31527a, obj);
        }

        public int hashCode() {
            return m73490hashCodeimpl(this.f31527a);
        }

        @NotNull
        public String toString() {
            return m73491toStringimpl(this.f31527a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73492unboximpl() {
            return this.f31527a;
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness */
    /* loaded from: classes2.dex */
    public static final class Strictness {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31528b = m73497constructorimpl(1);

        /* renamed from: c */
        public static final int f31529c = m73497constructorimpl(2);

        /* renamed from: d */
        public static final int f31530d = m73497constructorimpl(3);

        /* renamed from: e */
        public static final int f31531e = m73497constructorimpl(4);

        /* renamed from: a */
        public final int f31532a;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getDefault-usljTpc", "()I", "I", "Loose", "getLoose-usljTpc", PDLayoutAttributeObject.LINE_HEIGHT_NORMAL, "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-usljTpc  reason: not valid java name */
            public final int m73503getDefaultusljTpc() {
                return Strictness.f31528b;
            }

            /* renamed from: getLoose-usljTpc  reason: not valid java name */
            public final int m73504getLooseusljTpc() {
                return Strictness.f31529c;
            }

            /* renamed from: getNormal-usljTpc  reason: not valid java name */
            public final int m73505getNormalusljTpc() {
                return Strictness.f31530d;
            }

            /* renamed from: getStrict-usljTpc  reason: not valid java name */
            public final int m73506getStrictusljTpc() {
                return Strictness.f31531e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Strictness(int i) {
            this.f31532a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strictness m73496boximpl(int i) {
            return new Strictness(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73497constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73498equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m73502unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73499equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73500hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73501toStringimpl(int i) {
            if (m73499equalsimpl0(i, f31528b)) {
                return "Strictness.None";
            }
            if (m73499equalsimpl0(i, f31529c)) {
                return "Strictness.Loose";
            }
            if (m73499equalsimpl0(i, f31530d)) {
                return "Strictness.Normal";
            }
            if (m73499equalsimpl0(i, f31531e)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73498equalsimpl(this.f31532a, obj);
        }

        public int hashCode() {
            return m73500hashCodeimpl(this.f31532a);
        }

        @NotNull
        public String toString() {
            return m73501toStringimpl(this.f31532a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73502unboximpl() {
            return this.f31532a;
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak */
    /* loaded from: classes2.dex */
    public static final class WordBreak {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31533b = m73508constructorimpl(1);

        /* renamed from: c */
        public static final int f31534c = m73508constructorimpl(2);

        /* renamed from: a */
        public final int f31535a;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getDefault-jp8hJ3c", "()I", "I", "Phrase", "getPhrase-jp8hJ3c", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c  reason: not valid java name */
            public final int m73514getDefaultjp8hJ3c() {
                return WordBreak.f31533b;
            }

            /* renamed from: getPhrase-jp8hJ3c  reason: not valid java name */
            public final int m73515getPhrasejp8hJ3c() {
                return WordBreak.f31534c;
            }

            public Companion() {
            }
        }

        public /* synthetic */ WordBreak(int i) {
            this.f31535a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ WordBreak m73507boximpl(int i) {
            return new WordBreak(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73508constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73509equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m73513unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73510equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73511hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73512toStringimpl(int i) {
            if (m73510equalsimpl0(i, f31533b)) {
                return "WordBreak.None";
            }
            if (m73510equalsimpl0(i, f31534c)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73509equalsimpl(this.f31535a, obj);
        }

        public int hashCode() {
            return m73511hashCodeimpl(this.f31535a);
        }

        @NotNull
        public String toString() {
            return m73512toStringimpl(this.f31535a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73513unboximpl() {
            return this.f31535a;
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int m73495getSimplefcGXIks = companion.m73495getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m73505getNormalusljTpc = companion2.m73505getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        f31520b = m73472constructorimpl(m73495getSimplefcGXIks, m73505getNormalusljTpc, companion3.m73514getDefaultjp8hJ3c());
        f31521c = m73472constructorimpl(companion.m73493getBalancedfcGXIks(), companion2.m73504getLooseusljTpc(), companion3.m73515getPhrasejp8hJ3c());
        f31522d = m73472constructorimpl(companion.m73494getHighQualityfcGXIks(), companion2.m73506getStrictusljTpc(), companion3.m73514getDefaultjp8hJ3c());
    }

    public /* synthetic */ LineBreak(int i) {
        this.f31523a = i;
    }

    /* renamed from: a */
    public static int m58975a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineBreak m73471boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m73472constructorimpl(int i, int i2, int i3) {
        int m58974a;
        m58974a = LineBreak_androidKt.m58974a(i, i2, i3);
        return m58975a(m58974a);
    }

    /* renamed from: copy-gijOMQM  reason: not valid java name */
    public static final int m73473copygijOMQM(int i, int i2, int i3, int i4) {
        return m73472constructorimpl(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM$default  reason: not valid java name */
    public static /* synthetic */ int m73474copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m73477getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m73478getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m73479getWordBreakjp8hJ3c(i);
        }
        return m73473copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73475equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m73482unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73476equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getStrategy-fcGXIks  reason: not valid java name */
    public static final int m73477getStrategyfcGXIks(int i) {
        int m58973b;
        m58973b = LineBreak_androidKt.m58973b(i);
        return Strategy.m73487constructorimpl(m58973b);
    }

    /* renamed from: getStrictness-usljTpc  reason: not valid java name */
    public static final int m73478getStrictnessusljTpc(int i) {
        int m58972c;
        m58972c = LineBreak_androidKt.m58972c(i);
        return Strictness.m73497constructorimpl(m58972c);
    }

    /* renamed from: getWordBreak-jp8hJ3c  reason: not valid java name */
    public static final int m73479getWordBreakjp8hJ3c(int i) {
        int m58971d;
        m58971d = LineBreak_androidKt.m58971d(i);
        return WordBreak.m73508constructorimpl(m58971d);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73480hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73481toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m73491toStringimpl(m73477getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m73501toStringimpl(m73478getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m73512toStringimpl(m73479getWordBreakjp8hJ3c(i))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73475equalsimpl(this.f31523a, obj);
    }

    public int hashCode() {
        return m73480hashCodeimpl(this.f31523a);
    }

    @NotNull
    public String toString() {
        return m73481toStringimpl(this.f31523a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73482unboximpl() {
        return this.f31523a;
    }
}
