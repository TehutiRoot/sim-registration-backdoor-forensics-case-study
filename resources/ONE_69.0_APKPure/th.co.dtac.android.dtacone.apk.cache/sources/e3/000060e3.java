package androidx.compose.p003ui.input.key;

import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/input/key/KeyEventType;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.input.key.KeyEventType */
/* loaded from: classes2.dex */
public final class KeyEventType {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f29964b = m72779constructorimpl(0);

    /* renamed from: c */
    public static final int f29965c = m72779constructorimpl(1);

    /* renamed from: d */
    public static final int f29966d = m72779constructorimpl(2);

    /* renamed from: a */
    public final int f29967a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m29142d2 = {"Landroidx/compose/ui/input/key/KeyEventType$Companion;", "", "()V", "KeyDown", "Landroidx/compose/ui/input/key/KeyEventType;", "getKeyDown-CS__XNY", "()I", "I", "KeyUp", "getKeyUp-CS__XNY", OpenTypeScript.UNKNOWN, "getUnknown-CS__XNY", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.input.key.KeyEventType$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY  reason: not valid java name */
        public final int m72785getKeyDownCS__XNY() {
            return KeyEventType.f29966d;
        }

        /* renamed from: getKeyUp-CS__XNY  reason: not valid java name */
        public final int m72786getKeyUpCS__XNY() {
            return KeyEventType.f29965c;
        }

        /* renamed from: getUnknown-CS__XNY  reason: not valid java name */
        public final int m72787getUnknownCS__XNY() {
            return KeyEventType.f29964b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ KeyEventType(int i) {
        this.f29967a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEventType m72778boximpl(int i) {
        return new KeyEventType(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m72779constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72780equalsimpl(int i, Object obj) {
        return (obj instanceof KeyEventType) && i == ((KeyEventType) obj).m72784unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72781equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72782hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72783toStringimpl(int i) {
        if (m72781equalsimpl0(i, f29965c)) {
            return "KeyUp";
        }
        if (m72781equalsimpl0(i, f29966d)) {
            return "KeyDown";
        }
        if (m72781equalsimpl0(i, f29964b)) {
            return OpenTypeScript.UNKNOWN;
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m72780equalsimpl(this.f29967a, obj);
    }

    public int hashCode() {
        return m72782hashCodeimpl(this.f29967a);
    }

    @NotNull
    public String toString() {
        return m72783toStringimpl(this.f29967a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72784unboximpl() {
        return this.f29967a;
    }
}