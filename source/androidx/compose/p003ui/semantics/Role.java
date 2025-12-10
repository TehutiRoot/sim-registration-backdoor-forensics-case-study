package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.Immutable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/semantics/Role;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.semantics.Role */
/* loaded from: classes2.dex */
public final class Role {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f30876b = m59146a(0);

    /* renamed from: c */
    public static final int f30877c = m59146a(1);

    /* renamed from: d */
    public static final int f30878d = m59146a(2);

    /* renamed from: e */
    public static final int f30879e = m59146a(3);

    /* renamed from: f */
    public static final int f30880f = m59146a(4);

    /* renamed from: g */
    public static final int f30881g = m59146a(5);

    /* renamed from: h */
    public static final int f30882h = m59146a(6);

    /* renamed from: a */
    public final int f30883a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.semantics.Role$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButton-o7Vup1c  reason: not valid java name */
        public final int m73069getButtono7Vup1c() {
            return Role.f30876b;
        }

        /* renamed from: getCheckbox-o7Vup1c  reason: not valid java name */
        public final int m73070getCheckboxo7Vup1c() {
            return Role.f30877c;
        }

        /* renamed from: getDropdownList-o7Vup1c  reason: not valid java name */
        public final int m73071getDropdownListo7Vup1c() {
            return Role.f30882h;
        }

        /* renamed from: getImage-o7Vup1c  reason: not valid java name */
        public final int m73072getImageo7Vup1c() {
            return Role.f30881g;
        }

        /* renamed from: getRadioButton-o7Vup1c  reason: not valid java name */
        public final int m73073getRadioButtono7Vup1c() {
            return Role.f30879e;
        }

        /* renamed from: getSwitch-o7Vup1c  reason: not valid java name */
        public final int m73074getSwitcho7Vup1c() {
            return Role.f30878d;
        }

        /* renamed from: getTab-o7Vup1c  reason: not valid java name */
        public final int m73075getTabo7Vup1c() {
            return Role.f30880f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Role(int i) {
        this.f30883a = i;
    }

    /* renamed from: a */
    public static int m59146a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Role m73063boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73064equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m73068unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73065equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73066hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73067toStringimpl(int i) {
        if (m73065equalsimpl0(i, f30876b)) {
            return "Button";
        }
        if (m73065equalsimpl0(i, f30877c)) {
            return "Checkbox";
        }
        if (m73065equalsimpl0(i, f30878d)) {
            return "Switch";
        }
        if (m73065equalsimpl0(i, f30879e)) {
            return "RadioButton";
        }
        if (m73065equalsimpl0(i, f30880f)) {
            return "Tab";
        }
        if (m73065equalsimpl0(i, f30881g)) {
            return "Image";
        }
        if (m73065equalsimpl0(i, f30882h)) {
            return "DropdownList";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m73064equalsimpl(this.f30883a, obj);
    }

    public int hashCode() {
        return m73066hashCodeimpl(this.f30883a);
    }

    @NotNull
    public String toString() {
        return m73067toStringimpl(this.f30883a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73068unboximpl() {
        return this.f30883a;
    }
}
