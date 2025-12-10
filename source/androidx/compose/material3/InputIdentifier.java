package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/material3/InputIdentifier;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* loaded from: classes2.dex */
public final class InputIdentifier {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f25828b = m70435constructorimpl(0);

    /* renamed from: c */
    public static final int f25829c = m70435constructorimpl(1);

    /* renamed from: d */
    public static final int f25830d = m70435constructorimpl(2);

    /* renamed from: a */
    public final int f25831a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28850d2 = {"Landroidx/compose/material3/InputIdentifier$Companion;", "", "()V", "EndDateInput", "Landroidx/compose/material3/InputIdentifier;", "getEndDateInput-J2x2o4M", "()I", "I", "SingleDateInput", "getSingleDateInput-J2x2o4M", "StartDateInput", "getStartDateInput-J2x2o4M", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M  reason: not valid java name */
        public final int m70441getEndDateInputJ2x2o4M() {
            return InputIdentifier.f25830d;
        }

        /* renamed from: getSingleDateInput-J2x2o4M  reason: not valid java name */
        public final int m70442getSingleDateInputJ2x2o4M() {
            return InputIdentifier.f25828b;
        }

        /* renamed from: getStartDateInput-J2x2o4M  reason: not valid java name */
        public final int m70443getStartDateInputJ2x2o4M() {
            return InputIdentifier.f25829c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ InputIdentifier(int i) {
        this.f25831a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m70434boximpl(int i) {
        return new InputIdentifier(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m70435constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m70436equalsimpl(int i, Object obj) {
        return (obj instanceof InputIdentifier) && i == ((InputIdentifier) obj).m70440unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m70437equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m70438hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m70439toStringimpl(int i) {
        if (m70437equalsimpl0(i, f25828b)) {
            return "SingleDateInput";
        }
        if (m70437equalsimpl0(i, f25829c)) {
            return "StartDateInput";
        }
        if (m70437equalsimpl0(i, f25830d)) {
            return "EndDateInput";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m70436equalsimpl(this.f25831a, obj);
    }

    public int hashCode() {
        return m70438hashCodeimpl(this.f25831a);
    }

    @NotNull
    public String toString() {
        return m70439toStringimpl(this.f25831a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m70440unboximpl() {
        return this.f25831a;
    }
}
