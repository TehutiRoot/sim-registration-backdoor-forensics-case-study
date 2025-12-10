package androidx.compose.p003ui.text.style;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u001c\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLinearity-4e0Vf04$ui_text_release", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getSubpixelTextPositioning$ui_text_release", "()Z", "Companion", "Linearity", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.style.TextMotion */
/* loaded from: classes2.dex */
public final class TextMotion {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final TextMotion f31573c;

    /* renamed from: d */
    public static final TextMotion f31574d;

    /* renamed from: a */
    public final int f31575a;

    /* renamed from: b */
    public final boolean f31576b;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.style.TextMotion$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextMotion getAnimated() {
            return TextMotion.f31574d;
        }

        @NotNull
        public final TextMotion getStatic() {
            return TextMotion.f31573c;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.text.style.TextMotion$Linearity */
    /* loaded from: classes2.dex */
    public static final class Linearity {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f31577b = m58966a(1);

        /* renamed from: c */
        public static final int f31578c = m58966a(2);

        /* renamed from: d */
        public static final int f31579d = m58966a(3);

        /* renamed from: a */
        public final int f31580a;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28850d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", "I", "Linear", "getLinear-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.text.style.TextMotion$Linearity$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04  reason: not valid java name */
            public final int m73581getFontHinting4e0Vf04() {
                return Linearity.f31578c;
            }

            /* renamed from: getLinear-4e0Vf04  reason: not valid java name */
            public final int m73582getLinear4e0Vf04() {
                return Linearity.f31577b;
            }

            /* renamed from: getNone-4e0Vf04  reason: not valid java name */
            public final int m73583getNone4e0Vf04() {
                return Linearity.f31579d;
            }

            public Companion() {
            }
        }

        public /* synthetic */ Linearity(int i) {
            this.f31580a = i;
        }

        /* renamed from: a */
        public static int m58966a(int i) {
            return i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Linearity m73575boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m73576equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m73580unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m73577equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m73578hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m73579toStringimpl(int i) {
            if (m73577equalsimpl0(i, f31577b)) {
                return "Linearity.Linear";
            }
            if (m73577equalsimpl0(i, f31578c)) {
                return "Linearity.FontHinting";
            }
            if (m73577equalsimpl0(i, f31579d)) {
                return "Linearity.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m73576equalsimpl(this.f31580a, obj);
        }

        public int hashCode() {
            return m73578hashCodeimpl(this.f31580a);
        }

        @NotNull
        public String toString() {
            return m73579toStringimpl(this.f31580a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m73580unboximpl() {
            return this.f31580a;
        }
    }

    static {
        Linearity.Companion companion = Linearity.Companion;
        f31573c = new TextMotion(companion.m73581getFontHinting4e0Vf04(), false, null);
        f31574d = new TextMotion(companion.m73582getLinear4e0Vf04(), true, null);
    }

    public /* synthetic */ TextMotion(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default  reason: not valid java name */
    public static /* synthetic */ TextMotion m73572copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.f31575a;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.f31576b;
        }
        return textMotion.m73573copyJdDtMQo$ui_text_release(i, z);
    }

    @NotNull
    /* renamed from: copy-JdDtMQo$ui_text_release  reason: not valid java name */
    public final TextMotion m73573copyJdDtMQo$ui_text_release(int i, boolean z) {
        return new TextMotion(i, z, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        if (Linearity.m73577equalsimpl0(this.f31575a, textMotion.f31575a) && this.f31576b == textMotion.f31576b) {
            return true;
        }
        return false;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release  reason: not valid java name */
    public final int m73574getLinearity4e0Vf04$ui_text_release() {
        return this.f31575a;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.f31576b;
    }

    public int hashCode() {
        return (Linearity.m73578hashCodeimpl(this.f31575a) * 31) + AbstractC1705Xp.m65430a(this.f31576b);
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f31573c)) {
            return "TextMotion.Static";
        }
        if (Intrinsics.areEqual(this, f31574d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public TextMotion(int i, boolean z) {
        this.f31575a = i;
        this.f31576b = z;
    }
}
