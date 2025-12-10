package androidx.compose.p003ui.graphics;

import androidx.compose.runtime.Immutable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getValue", "()I", "Companion", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.FilterQuality */
/* loaded from: classes2.dex */
public final class FilterQuality {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f29141b = m72004constructorimpl(0);

    /* renamed from: c */
    public static final int f29142c = m72004constructorimpl(1);

    /* renamed from: d */
    public static final int f29143d = m72004constructorimpl(2);

    /* renamed from: e */
    public static final int f29144e = m72004constructorimpl(3);

    /* renamed from: a */
    public final int f29145a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "()V", "High", "Landroidx/compose/ui/graphics/FilterQuality;", "getHigh-f-v9h1I", "()I", "I", "Low", "getLow-f-v9h1I", "Medium", "getMedium-f-v9h1I", "None", "getNone-f-v9h1I", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.FilterQuality$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I  reason: not valid java name */
        public final int m72010getHighfv9h1I() {
            return FilterQuality.f29144e;
        }

        /* renamed from: getLow-f-v9h1I  reason: not valid java name */
        public final int m72011getLowfv9h1I() {
            return FilterQuality.f29142c;
        }

        /* renamed from: getMedium-f-v9h1I  reason: not valid java name */
        public final int m72012getMediumfv9h1I() {
            return FilterQuality.f29143d;
        }

        /* renamed from: getNone-f-v9h1I  reason: not valid java name */
        public final int m72013getNonefv9h1I() {
            return FilterQuality.f29141b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FilterQuality(int i) {
        this.f29145a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FilterQuality m72003boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m72004constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72005equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m72009unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72006equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72007hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72008toStringimpl(int i) {
        if (m72006equalsimpl0(i, f29141b)) {
            return "None";
        }
        if (m72006equalsimpl0(i, f29142c)) {
            return "Low";
        }
        if (m72006equalsimpl0(i, f29143d)) {
            return "Medium";
        }
        if (m72006equalsimpl0(i, f29144e)) {
            return "High";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m72005equalsimpl(this.f29145a, obj);
    }

    public final int getValue() {
        return this.f29145a;
    }

    public int hashCode() {
        return m72007hashCodeimpl(this.f29145a);
    }

    @NotNull
    public String toString() {
        return m72008toStringimpl(this.f29145a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72009unboximpl() {
        return this.f29145a;
    }
}