package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getComponentCount-impl", "getComponentCount$annotations", "()V", "componentCount", "Companion", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n55#2:90\n48#2:91\n48#2:92\n48#2:93\n48#2:94\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n48#1:90\n57#1:91\n64#1:92\n71#1:93\n79#1:94\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel */
/* loaded from: classes2.dex */
public final class ColorModel {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final long f29307b;

    /* renamed from: c */
    public static final long f29308c;

    /* renamed from: d */
    public static final long f29309d;

    /* renamed from: e */
    public static final long f29310e;

    /* renamed from: a */
    public final long f29311a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", OperatorName.SET_LINE_CAPSTYLE, "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw  reason: not valid java name */
        public final long m72285getCmykxdoWZVw() {
            return ColorModel.f29310e;
        }

        /* renamed from: getLab-xdoWZVw  reason: not valid java name */
        public final long m72286getLabxdoWZVw() {
            return ColorModel.f29309d;
        }

        /* renamed from: getRgb-xdoWZVw  reason: not valid java name */
        public final long m72287getRgbxdoWZVw() {
            return ColorModel.f29307b;
        }

        /* renamed from: getXyz-xdoWZVw  reason: not valid java name */
        public final long m72288getXyzxdoWZVw() {
            return ColorModel.f29308c;
        }

        public Companion() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f29307b = m72278constructorimpl((0 & BodyPartID.bodyIdMax) | j2);
        f29308c = m72278constructorimpl((1 & BodyPartID.bodyIdMax) | j2);
        f29309d = m72278constructorimpl(j2 | (2 & BodyPartID.bodyIdMax));
        f29310e = m72278constructorimpl((j & BodyPartID.bodyIdMax) | (4 << 32));
    }

    public /* synthetic */ ColorModel(long j) {
        this.f29311a = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorModel m72277boximpl(long j) {
        return new ColorModel(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m72278constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m72279equalsimpl(long j, Object obj) {
        return (obj instanceof ColorModel) && j == ((ColorModel) obj).m72284unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m72280equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: getComponentCount-impl  reason: not valid java name */
    public static final int m72281getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m72282hashCodeimpl(long j) {
        return AbstractC17631Fh1.m68395a(j);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m72283toStringimpl(long j) {
        if (m72280equalsimpl0(j, f29307b)) {
            return "Rgb";
        }
        if (m72280equalsimpl0(j, f29308c)) {
            return "Xyz";
        }
        if (m72280equalsimpl0(j, f29309d)) {
            return "Lab";
        }
        if (m72280equalsimpl0(j, f29310e)) {
            return "Cmyk";
        }
        return OpenTypeScript.UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m72279equalsimpl(this.f29311a, obj);
    }

    public int hashCode() {
        return m72282hashCodeimpl(this.f29311a);
    }

    @NotNull
    public String toString() {
        return m72283toStringimpl(this.f29311a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m72284unboximpl() {
        return this.f29311a;
    }
}