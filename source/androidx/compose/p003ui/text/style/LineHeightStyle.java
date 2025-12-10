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
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u0019\u001bB\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "<init>", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getAlignment-PIaL0Z0", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getTrim-EVpEnUU", "Companion", "Alignment", "Trim", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.style.LineHeightStyle */
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final LineHeightStyle f31536c = new LineHeightStyle(Alignment.Companion.m73527getProportionalPIaL0Z0(), Trim.Companion.m73537getBothEVpEnUU(), null);

    /* renamed from: a */
    public final float f31537a;

    /* renamed from: b */
    public final int f31538b;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "topRatio", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment */
    /* loaded from: classes2.dex */
    public static final class Alignment {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final float f31539b = m73519constructorimpl(0.0f);

        /* renamed from: c */
        public static final float f31540c = m73519constructorimpl(0.5f);

        /* renamed from: d */
        public static final float f31541d = m73519constructorimpl(-1.0f);

        /* renamed from: e */
        public static final float f31542e = m73519constructorimpl(1.0f);

        /* renamed from: a */
        public final float f31543a;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Alignment$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0  reason: not valid java name */
            public final float m73525getBottomPIaL0Z0() {
                return Alignment.f31542e;
            }

            /* renamed from: getCenter-PIaL0Z0  reason: not valid java name */
            public final float m73526getCenterPIaL0Z0() {
                return Alignment.f31540c;
            }

            /* renamed from: getProportional-PIaL0Z0  reason: not valid java name */
            public final float m73527getProportionalPIaL0Z0() {
                return Alignment.f31541d;
            }

            /* renamed from: getTop-PIaL0Z0  reason: not valid java name */
            public final float m73528getTopPIaL0Z0() {
                return Alignment.f31539b;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Alignment(float f) {
            this.f31543a = f;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Alignment m73518boximpl(float f) {
            return new Alignment(f);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static float m73519constructorimpl(float f) {
            if ((0.0f <= f && f <= 1.0f) || f == -1.0f) {
                return f;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73520equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m73524unboximpl()) == 0;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73521equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73522hashCodeimpl(float f) {
            return Float.floatToIntBits(f);
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73523toStringimpl(float f) {
            if (f == f31539b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == f31540c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == f31541d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == f31542e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m73520equalsimpl(this.f31543a, obj);
        }

        public int hashCode() {
            return m73522hashCodeimpl(this.f31543a);
        }

        @NotNull
        public String toString() {
            return m73523toStringimpl(this.f31543a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ float m73524unboximpl() {
            return this.f31543a;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.f31536c;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimFirstLineTop", "isTrimLastLineBottom-impl$ui_text_release", "isTrimLastLineBottom", "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim */
    /* loaded from: classes2.dex */
    public static final class Trim {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31544b = m58970a(1);

        /* renamed from: c */
        public static final int f31545c = m58970a(16);

        /* renamed from: d */
        public static final int f31546d = m58970a(17);

        /* renamed from: e */
        public static final int f31547e = m58970a(0);

        /* renamed from: a */
        public final int f31548a;

        @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", PDTableAttributeObject.SCOPE_BOTH, "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.LineHeightStyle$Trim$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU  reason: not valid java name */
            public final int m73537getBothEVpEnUU() {
                return Trim.f31546d;
            }

            /* renamed from: getFirstLineTop-EVpEnUU  reason: not valid java name */
            public final int m73538getFirstLineTopEVpEnUU() {
                return Trim.f31544b;
            }

            /* renamed from: getLastLineBottom-EVpEnUU  reason: not valid java name */
            public final int m73539getLastLineBottomEVpEnUU() {
                return Trim.f31545c;
            }

            /* renamed from: getNone-EVpEnUU  reason: not valid java name */
            public final int m73540getNoneEVpEnUU() {
                return Trim.f31547e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Trim(int i) {
            this.f31548a = i;
        }

        /* renamed from: a */
        public static int m58970a(int i) {
            return i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Trim m73529boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73530equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m73536unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73531equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73532hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release  reason: not valid java name */
        public static final boolean m73533isTrimFirstLineTopimpl$ui_text_release(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release  reason: not valid java name */
        public static final boolean m73534isTrimLastLineBottomimpl$ui_text_release(int i) {
            return (i & 16) > 0;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73535toStringimpl(int i) {
            if (i == f31544b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == f31545c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == f31546d) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i == f31547e) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73530equalsimpl(this.f31548a, obj);
        }

        public int hashCode() {
            return m73532hashCodeimpl(this.f31548a);
        }

        @NotNull
        public String toString() {
            return m73535toStringimpl(this.f31548a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73536unboximpl() {
            return this.f31548a;
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
        if (Alignment.m73521equalsimpl0(this.f31537a, lineHeightStyle.f31537a) && Trim.m73531equalsimpl0(this.f31538b, lineHeightStyle.f31538b)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0  reason: not valid java name */
    public final float m73516getAlignmentPIaL0Z0() {
        return this.f31537a;
    }

    /* renamed from: getTrim-EVpEnUU  reason: not valid java name */
    public final int m73517getTrimEVpEnUU() {
        return this.f31538b;
    }

    public int hashCode() {
        return (Alignment.m73522hashCodeimpl(this.f31537a) * 31) + Trim.m73532hashCodeimpl(this.f31538b);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m73523toStringimpl(this.f31537a)) + ", trim=" + ((Object) Trim.m73535toStringimpl(this.f31538b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LineHeightStyle(float f, int i) {
        this.f31537a = f;
        this.f31538b = i;
    }
}
