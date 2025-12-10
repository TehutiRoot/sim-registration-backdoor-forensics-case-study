package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/material3/InputIdentifier;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* loaded from: classes2.dex */
public final class InputIdentifier {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f25916b = m70619constructorimpl(0);

    /* renamed from: c */
    public static final int f25917c = m70619constructorimpl(1);

    /* renamed from: d */
    public static final int f25918d = m70619constructorimpl(2);

    /* renamed from: a */
    public final int f25919a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m29142d2 = {"Landroidx/compose/material3/InputIdentifier$Companion;", "", "()V", "EndDateInput", "Landroidx/compose/material3/InputIdentifier;", "getEndDateInput-J2x2o4M", "()I", "I", "SingleDateInput", "getSingleDateInput-J2x2o4M", "StartDateInput", "getStartDateInput-J2x2o4M", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M  reason: not valid java name */
        public final int m70625getEndDateInputJ2x2o4M() {
            return InputIdentifier.f25918d;
        }

        /* renamed from: getSingleDateInput-J2x2o4M  reason: not valid java name */
        public final int m70626getSingleDateInputJ2x2o4M() {
            return InputIdentifier.f25916b;
        }

        /* renamed from: getStartDateInput-J2x2o4M  reason: not valid java name */
        public final int m70627getStartDateInputJ2x2o4M() {
            return InputIdentifier.f25917c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ InputIdentifier(int i) {
        this.f25919a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m70618boximpl(int i) {
        return new InputIdentifier(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m70619constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m70620equalsimpl(int i, Object obj) {
        return (obj instanceof InputIdentifier) && i == ((InputIdentifier) obj).m70624unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m70621equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m70622hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m70623toStringimpl(int i) {
        if (m70621equalsimpl0(i, f25916b)) {
            return "SingleDateInput";
        }
        if (m70621equalsimpl0(i, f25917c)) {
            return "StartDateInput";
        }
        if (m70621equalsimpl0(i, f25918d)) {
            return "EndDateInput";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m70620equalsimpl(this.f25919a, obj);
    }

    public int hashCode() {
        return m70622hashCodeimpl(this.f25919a);
    }

    @NotNull
    public String toString() {
        return m70623toStringimpl(this.f25919a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m70624unboximpl() {
        return this.f25919a;
    }
}