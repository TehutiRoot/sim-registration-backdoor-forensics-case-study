package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "Landroidx/compose/ui/graphics/Shape;", "shape", "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "", "toString-impl", "(Landroidx/compose/ui/graphics/Shape;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/ui/graphics/Shape;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment */
/* loaded from: classes2.dex */
public final class BlurredEdgeTreatment {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final Shape f28873b = m71414constructorimpl(RectangleShapeKt.getRectangleShape());

    /* renamed from: c */
    public static final Shape f28874c = m71414constructorimpl(null);

    /* renamed from: a */
    public final Shape f28875a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment$Companion;", "", "()V", "Rectangle", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "getRectangle---Goahg", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Shape;", "Unbounded", "getUnbounded---Goahg", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: getRectangle---Goahg  reason: not valid java name */
        public final Shape m71420getRectangleGoahg() {
            return BlurredEdgeTreatment.f28873b;
        }

        @NotNull
        /* renamed from: getUnbounded---Goahg  reason: not valid java name */
        public final Shape m71421getUnboundedGoahg() {
            return BlurredEdgeTreatment.f28874c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.f28875a = shape;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m71413boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static Shape m71414constructorimpl(@Nullable Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71415equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && Intrinsics.areEqual(shape, ((BlurredEdgeTreatment) obj).m71419unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71416equalsimpl0(Shape shape, Shape shape2) {
        return Intrinsics.areEqual(shape, shape2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71417hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71418toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m71415equalsimpl(this.f28875a, obj);
    }

    @Nullable
    public final Shape getShape() {
        return this.f28875a;
    }

    public int hashCode() {
        return m71417hashCodeimpl(this.f28875a);
    }

    public String toString() {
        return m71418toStringimpl(this.f28875a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Shape m71419unboximpl() {
        return this.f28875a;
    }
}
