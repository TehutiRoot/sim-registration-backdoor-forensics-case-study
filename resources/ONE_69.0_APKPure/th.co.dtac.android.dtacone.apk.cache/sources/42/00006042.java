package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent */
/* loaded from: classes2.dex */
public final class RenderIntent {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f29364b = m72297constructorimpl(0);

    /* renamed from: c */
    public static final int f29365c = m72297constructorimpl(1);

    /* renamed from: d */
    public static final int f29366d = m72297constructorimpl(2);

    /* renamed from: e */
    public static final int f29367e = m72297constructorimpl(3);

    /* renamed from: a */
    public final int f29368a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;", "", "()V", "Absolute", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "getAbsolute-uksYyKA", "()I", "I", "Perceptual", "getPerceptual-uksYyKA", "Relative", "getRelative-uksYyKA", ExifInterface.TAG_SATURATION, "getSaturation-uksYyKA", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.RenderIntent$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA  reason: not valid java name */
        public final int m72303getAbsoluteuksYyKA() {
            return RenderIntent.f29367e;
        }

        /* renamed from: getPerceptual-uksYyKA  reason: not valid java name */
        public final int m72304getPerceptualuksYyKA() {
            return RenderIntent.f29364b;
        }

        /* renamed from: getRelative-uksYyKA  reason: not valid java name */
        public final int m72305getRelativeuksYyKA() {
            return RenderIntent.f29365c;
        }

        /* renamed from: getSaturation-uksYyKA  reason: not valid java name */
        public final int m72306getSaturationuksYyKA() {
            return RenderIntent.f29366d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ RenderIntent(int i) {
        this.f29368a = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ RenderIntent m72296boximpl(int i) {
        return new RenderIntent(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m72297constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72298equalsimpl(int i, Object obj) {
        return (obj instanceof RenderIntent) && i == ((RenderIntent) obj).m72302unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72299equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72300hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72301toStringimpl(int i) {
        if (m72299equalsimpl0(i, f29364b)) {
            return "Perceptual";
        }
        if (m72299equalsimpl0(i, f29365c)) {
            return "Relative";
        }
        if (m72299equalsimpl0(i, f29366d)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m72299equalsimpl0(i, f29367e)) {
            return "Absolute";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m72298equalsimpl(this.f29368a, obj);
    }

    public int hashCode() {
        return m72300hashCodeimpl(this.f29368a);
    }

    @NotNull
    public String toString() {
        return m72301toStringimpl(this.f29368a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m72302unboximpl() {
        return this.f29368a;
    }
}