package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.Immutable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/ui/semantics/Role;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.semantics.Role */
/* loaded from: classes2.dex */
public final class Role {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f30964b = m59096a(0);

    /* renamed from: c */
    public static final int f30965c = m59096a(1);

    /* renamed from: d */
    public static final int f30966d = m59096a(2);

    /* renamed from: e */
    public static final int f30967e = m59096a(3);

    /* renamed from: f */
    public static final int f30968f = m59096a(4);

    /* renamed from: g */
    public static final int f30969g = m59096a(5);

    /* renamed from: h */
    public static final int f30970h = m59096a(6);

    /* renamed from: a */
    public final int f30971a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.semantics.Role$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButton-o7Vup1c  reason: not valid java name */
        public final int m73253getButtono7Vup1c() {
            return Role.f30964b;
        }

        /* renamed from: getCheckbox-o7Vup1c  reason: not valid java name */
        public final int m73254getCheckboxo7Vup1c() {
            return Role.f30965c;
        }

        /* renamed from: getDropdownList-o7Vup1c  reason: not valid java name */
        public final int m73255getDropdownListo7Vup1c() {
            return Role.f30970h;
        }

        /* renamed from: getImage-o7Vup1c  reason: not valid java name */
        public final int m73256getImageo7Vup1c() {
            return Role.f30969g;
        }

        /* renamed from: getRadioButton-o7Vup1c  reason: not valid java name */
        public final int m73257getRadioButtono7Vup1c() {
            return Role.f30967e;
        }

        /* renamed from: getSwitch-o7Vup1c  reason: not valid java name */
        public final int m73258getSwitcho7Vup1c() {
            return Role.f30966d;
        }

        /* renamed from: getTab-o7Vup1c  reason: not valid java name */
        public final int m73259getTabo7Vup1c() {
            return Role.f30968f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Role(int i) {
        this.f30971a = i;
    }

    /* renamed from: a */
    public static int m59096a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Role m73247boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73248equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m73252unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73249equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73250hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73251toStringimpl(int i) {
        if (m73249equalsimpl0(i, f30964b)) {
            return "Button";
        }
        if (m73249equalsimpl0(i, f30965c)) {
            return "Checkbox";
        }
        if (m73249equalsimpl0(i, f30966d)) {
            return "Switch";
        }
        if (m73249equalsimpl0(i, f30967e)) {
            return "RadioButton";
        }
        if (m73249equalsimpl0(i, f30968f)) {
            return "Tab";
        }
        if (m73249equalsimpl0(i, f30969g)) {
            return "Image";
        }
        if (m73249equalsimpl0(i, f30970h)) {
            return "DropdownList";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m73248equalsimpl(this.f30971a, obj);
    }

    public int hashCode() {
        return m73250hashCodeimpl(this.f30971a);
    }

    @NotNull
    public String toString() {
        return m73251toStringimpl(this.f30971a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73252unboximpl() {
        return this.f30971a;
    }
}