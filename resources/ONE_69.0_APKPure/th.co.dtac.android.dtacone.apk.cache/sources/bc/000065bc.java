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
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000  2\u00020\u0001:\u0004 !\"#B$\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tB\u0014\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r\u0088\u0001\u000b\u0092\u0001\u00020\nø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "wordBreak", "constructor-impl", "(III)I", "", "mask", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "copy-gijOMQM", "(IIII)I", "copy", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "Companion", "Strategy", "Strictness", "WordBreak", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.style.LineBreak */
/* loaded from: classes2.dex */
public final class LineBreak {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31608b;

    /* renamed from: c */
    public static final int f31609c;

    /* renamed from: d */
    public static final int f31610d;

    /* renamed from: a */
    public final int f31611a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k", "()I", "I", PDAnnotationText.NAME_PARAGRAPH, "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k  reason: not valid java name */
        public final int m73667getHeadingrAG3T2k() {
            return LineBreak.f31609c;
        }

        /* renamed from: getParagraph-rAG3T2k  reason: not valid java name */
        public final int m73668getParagraphrAG3T2k() {
            return LineBreak.f31610d;
        }

        /* renamed from: getSimple-rAG3T2k  reason: not valid java name */
        public final int m73669getSimplerAG3T2k() {
            return LineBreak.f31608b;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy */
    /* loaded from: classes2.dex */
    public static final class Strategy {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31612b = m73671constructorimpl(1);

        /* renamed from: c */
        public static final int f31613c = m73671constructorimpl(2);

        /* renamed from: d */
        public static final int f31614d = m73671constructorimpl(3);

        /* renamed from: a */
        public final int f31615a;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "()V", "Balanced", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getBalanced-fcGXIks", "()I", "I", "HighQuality", "getHighQuality-fcGXIks", "Simple", "getSimple-fcGXIks", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks  reason: not valid java name */
            public final int m73677getBalancedfcGXIks() {
                return Strategy.f31614d;
            }

            /* renamed from: getHighQuality-fcGXIks  reason: not valid java name */
            public final int m73678getHighQualityfcGXIks() {
                return Strategy.f31613c;
            }

            /* renamed from: getSimple-fcGXIks  reason: not valid java name */
            public final int m73679getSimplefcGXIks() {
                return Strategy.f31612b;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Strategy(int i) {
            this.f31615a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strategy m73670boximpl(int i) {
            return new Strategy(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73671constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73672equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m73676unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73673equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73674hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73675toStringimpl(int i) {
            if (m73673equalsimpl0(i, f31612b)) {
                return "Strategy.Simple";
            }
            if (m73673equalsimpl0(i, f31613c)) {
                return "Strategy.HighQuality";
            }
            if (m73673equalsimpl0(i, f31614d)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73672equalsimpl(this.f31615a, obj);
        }

        public int hashCode() {
            return m73674hashCodeimpl(this.f31615a);
        }

        @NotNull
        public String toString() {
            return m73675toStringimpl(this.f31615a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73676unboximpl() {
            return this.f31615a;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness */
    /* loaded from: classes2.dex */
    public static final class Strictness {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31616b = m73681constructorimpl(1);

        /* renamed from: c */
        public static final int f31617c = m73681constructorimpl(2);

        /* renamed from: d */
        public static final int f31618d = m73681constructorimpl(3);

        /* renamed from: e */
        public static final int f31619e = m73681constructorimpl(4);

        /* renamed from: a */
        public final int f31620a;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getDefault-usljTpc", "()I", "I", "Loose", "getLoose-usljTpc", PDLayoutAttributeObject.LINE_HEIGHT_NORMAL, "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-usljTpc  reason: not valid java name */
            public final int m73687getDefaultusljTpc() {
                return Strictness.f31616b;
            }

            /* renamed from: getLoose-usljTpc  reason: not valid java name */
            public final int m73688getLooseusljTpc() {
                return Strictness.f31617c;
            }

            /* renamed from: getNormal-usljTpc  reason: not valid java name */
            public final int m73689getNormalusljTpc() {
                return Strictness.f31618d;
            }

            /* renamed from: getStrict-usljTpc  reason: not valid java name */
            public final int m73690getStrictusljTpc() {
                return Strictness.f31619e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Strictness(int i) {
            this.f31620a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strictness m73680boximpl(int i) {
            return new Strictness(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73681constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73682equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m73686unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73683equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73684hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73685toStringimpl(int i) {
            if (m73683equalsimpl0(i, f31616b)) {
                return "Strictness.None";
            }
            if (m73683equalsimpl0(i, f31617c)) {
                return "Strictness.Loose";
            }
            if (m73683equalsimpl0(i, f31618d)) {
                return "Strictness.Normal";
            }
            if (m73683equalsimpl0(i, f31619e)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73682equalsimpl(this.f31620a, obj);
        }

        public int hashCode() {
            return m73684hashCodeimpl(this.f31620a);
        }

        @NotNull
        public String toString() {
            return m73685toStringimpl(this.f31620a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73686unboximpl() {
            return this.f31620a;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak */
    /* loaded from: classes2.dex */
    public static final class WordBreak {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31621b = m73692constructorimpl(1);

        /* renamed from: c */
        public static final int f31622c = m73692constructorimpl(2);

        /* renamed from: a */
        public final int f31623a;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getDefault-jp8hJ3c", "()I", "I", "Phrase", "getPhrase-jp8hJ3c", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c  reason: not valid java name */
            public final int m73698getDefaultjp8hJ3c() {
                return WordBreak.f31621b;
            }

            /* renamed from: getPhrase-jp8hJ3c  reason: not valid java name */
            public final int m73699getPhrasejp8hJ3c() {
                return WordBreak.f31622c;
            }

            public Companion() {
            }
        }

        public /* synthetic */ WordBreak(int i) {
            this.f31623a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ WordBreak m73691boximpl(int i) {
            return new WordBreak(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m73692constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73693equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m73697unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73694equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73695hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73696toStringimpl(int i) {
            if (m73694equalsimpl0(i, f31621b)) {
                return "WordBreak.None";
            }
            if (m73694equalsimpl0(i, f31622c)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73693equalsimpl(this.f31623a, obj);
        }

        public int hashCode() {
            return m73695hashCodeimpl(this.f31623a);
        }

        @NotNull
        public String toString() {
            return m73696toStringimpl(this.f31623a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73697unboximpl() {
            return this.f31623a;
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int m73679getSimplefcGXIks = companion.m73679getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m73689getNormalusljTpc = companion2.m73689getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        f31608b = m73656constructorimpl(m73679getSimplefcGXIks, m73689getNormalusljTpc, companion3.m73698getDefaultjp8hJ3c());
        f31609c = m73656constructorimpl(companion.m73677getBalancedfcGXIks(), companion2.m73688getLooseusljTpc(), companion3.m73699getPhrasejp8hJ3c());
        f31610d = m73656constructorimpl(companion.m73678getHighQualityfcGXIks(), companion2.m73690getStrictusljTpc(), companion3.m73698getDefaultjp8hJ3c());
    }

    public /* synthetic */ LineBreak(int i) {
        this.f31611a = i;
    }

    /* renamed from: a */
    public static int m58925a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineBreak m73655boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m73656constructorimpl(int i, int i2, int i3) {
        int m58924a;
        m58924a = LineBreak_androidKt.m58924a(i, i2, i3);
        return m58925a(m58924a);
    }

    /* renamed from: copy-gijOMQM  reason: not valid java name */
    public static final int m73657copygijOMQM(int i, int i2, int i3, int i4) {
        return m73656constructorimpl(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM$default  reason: not valid java name */
    public static /* synthetic */ int m73658copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m73661getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m73662getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m73663getWordBreakjp8hJ3c(i);
        }
        return m73657copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73659equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m73666unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73660equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getStrategy-fcGXIks  reason: not valid java name */
    public static final int m73661getStrategyfcGXIks(int i) {
        int m58923b;
        m58923b = LineBreak_androidKt.m58923b(i);
        return Strategy.m73671constructorimpl(m58923b);
    }

    /* renamed from: getStrictness-usljTpc  reason: not valid java name */
    public static final int m73662getStrictnessusljTpc(int i) {
        int m58922c;
        m58922c = LineBreak_androidKt.m58922c(i);
        return Strictness.m73681constructorimpl(m58922c);
    }

    /* renamed from: getWordBreak-jp8hJ3c  reason: not valid java name */
    public static final int m73663getWordBreakjp8hJ3c(int i) {
        int m58921d;
        m58921d = LineBreak_androidKt.m58921d(i);
        return WordBreak.m73692constructorimpl(m58921d);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73664hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73665toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m73675toStringimpl(m73661getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m73685toStringimpl(m73662getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m73696toStringimpl(m73663getWordBreakjp8hJ3c(i))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73659equalsimpl(this.f31611a, obj);
    }

    public int hashCode() {
        return m73664hashCodeimpl(this.f31611a);
    }

    @NotNull
    public String toString() {
        return m73665toStringimpl(this.f31611a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73666unboximpl() {
        return this.f31611a;
    }
}