package androidx.compose.p003ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u0019\u001bB\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "<init>", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getAlignment-PIaL0Z0", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getTrim-EVpEnUU", "Companion", "Alignment", "Trim", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.style.LineHeightStyle */
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final LineHeightStyle f31624c = new LineHeightStyle(Alignment.Companion.m73711getProportionalPIaL0Z0(), Trim.Companion.m73721getBothEVpEnUU(), null);

    /* renamed from: a */
    public final float f31625a;

    /* renamed from: b */
    public final int f31626b;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "topRatio", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment */
    /* loaded from: classes2.dex */
    public static final class Alignment {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final float f31627b = m73703constructorimpl(0.0f);

        /* renamed from: c */
        public static final float f31628c = m73703constructorimpl(0.5f);

        /* renamed from: d */
        public static final float f31629d = m73703constructorimpl(-1.0f);

        /* renamed from: e */
        public static final float f31630e = m73703constructorimpl(1.0f);

        /* renamed from: a */
        public final float f31631a;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0  reason: not valid java name */
            public final float m73709getBottomPIaL0Z0() {
                return Alignment.f31630e;
            }

            /* renamed from: getCenter-PIaL0Z0  reason: not valid java name */
            public final float m73710getCenterPIaL0Z0() {
                return Alignment.f31628c;
            }

            /* renamed from: getProportional-PIaL0Z0  reason: not valid java name */
            public final float m73711getProportionalPIaL0Z0() {
                return Alignment.f31629d;
            }

            /* renamed from: getTop-PIaL0Z0  reason: not valid java name */
            public final float m73712getTopPIaL0Z0() {
                return Alignment.f31627b;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Alignment(float f) {
            this.f31631a = f;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Alignment m73702boximpl(float f) {
            return new Alignment(f);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static float m73703constructorimpl(float f) {
            if ((0.0f <= f && f <= 1.0f) || f == -1.0f) {
                return f;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73704equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m73708unboximpl()) == 0;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73705equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73706hashCodeimpl(float f) {
            return Float.floatToIntBits(f);
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73707toStringimpl(float f) {
            if (f == f31627b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == f31628c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == f31629d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == f31630e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m73704equalsimpl(this.f31631a, obj);
        }

        public int hashCode() {
            return m73706hashCodeimpl(this.f31631a);
        }

        @NotNull
        public String toString() {
            return m73707toStringimpl(this.f31631a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ float m73708unboximpl() {
            return this.f31631a;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.f31624c;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimFirstLineTop", "isTrimLastLineBottom-impl$ui_text_release", "isTrimLastLineBottom", "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim */
    /* loaded from: classes2.dex */
    public static final class Trim {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31632b = m58920a(1);

        /* renamed from: c */
        public static final int f31633c = m58920a(16);

        /* renamed from: d */
        public static final int f31634d = m58920a(17);

        /* renamed from: e */
        public static final int f31635e = m58920a(0);

        /* renamed from: a */
        public final int f31636a;

        @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m29142d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", PDTableAttributeObject.SCOPE_BOTH, "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU  reason: not valid java name */
            public final int m73721getBothEVpEnUU() {
                return Trim.f31634d;
            }

            /* renamed from: getFirstLineTop-EVpEnUU  reason: not valid java name */
            public final int m73722getFirstLineTopEVpEnUU() {
                return Trim.f31632b;
            }

            /* renamed from: getLastLineBottom-EVpEnUU  reason: not valid java name */
            public final int m73723getLastLineBottomEVpEnUU() {
                return Trim.f31633c;
            }

            /* renamed from: getNone-EVpEnUU  reason: not valid java name */
            public final int m73724getNoneEVpEnUU() {
                return Trim.f31635e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Trim(int i) {
            this.f31636a = i;
        }

        /* renamed from: a */
        public static int m58920a(int i) {
            return i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Trim m73713boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73714equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m73720unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73715equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73716hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release  reason: not valid java name */
        public static final boolean m73717isTrimFirstLineTopimpl$ui_text_release(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release  reason: not valid java name */
        public static final boolean m73718isTrimLastLineBottomimpl$ui_text_release(int i) {
            return (i & 16) > 0;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73719toStringimpl(int i) {
            if (i == f31632b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == f31633c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == f31634d) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i == f31635e) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73714equalsimpl(this.f31636a, obj);
        }

        public int hashCode() {
            return m73716hashCodeimpl(this.f31636a);
        }

        @NotNull
        public String toString() {
            return m73719toStringimpl(this.f31636a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73720unboximpl() {
            return this.f31636a;
        }
    }

    public /* synthetic */ LineHeightStyle(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        if (Alignment.m73705equalsimpl0(this.f31625a, lineHeightStyle.f31625a) && Trim.m73715equalsimpl0(this.f31626b, lineHeightStyle.f31626b)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0  reason: not valid java name */
    public final float m73700getAlignmentPIaL0Z0() {
        return this.f31625a;
    }

    /* renamed from: getTrim-EVpEnUU  reason: not valid java name */
    public final int m73701getTrimEVpEnUU() {
        return this.f31626b;
    }

    public int hashCode() {
        return (Alignment.m73706hashCodeimpl(this.f31625a) * 31) + Trim.m73716hashCodeimpl(this.f31626b);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m73707toStringimpl(this.f31625a)) + ", trim=" + ((Object) Trim.m73719toStringimpl(this.f31626b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LineHeightStyle(float f, int i) {
        this.f31625a = f;
        this.f31626b = i;
    }
}