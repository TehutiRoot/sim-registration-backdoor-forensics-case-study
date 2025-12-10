package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\"\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, m28850d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/BorderModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/BorderModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Landroidx/compose/ui/graphics/Brush;", "component3", "()Landroidx/compose/ui/graphics/Shape;", "copy-8Feqmps", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/foundation/BorderModifierNodeElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getWidth-D9Ej5fM", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "d", "Landroidx/compose/ui/graphics/Shape;", "getShape", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {

    /* renamed from: b */
    public final float f12803b;

    /* renamed from: c */
    public final Brush f12804c;

    /* renamed from: d */
    public final Shape f12805d;

    public /* synthetic */ BorderModifierNodeElement(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default  reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m69332copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f, Brush brush, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderModifierNodeElement.f12803b;
        }
        if ((i & 2) != 0) {
            brush = borderModifierNodeElement.f12804c;
        }
        if ((i & 4) != 0) {
            shape = borderModifierNodeElement.f12805d;
        }
        return borderModifierNodeElement.m69334copy8Feqmps(f, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m69333component1D9Ej5fM() {
        return this.f12803b;
    }

    @NotNull
    public final Brush component2() {
        return this.f12804c;
    }

    @NotNull
    public final Shape component3() {
        return this.f12805d;
    }

    @NotNull
    /* renamed from: copy-8Feqmps  reason: not valid java name */
    public final BorderModifierNodeElement m69334copy8Feqmps(float f, @NotNull Brush brush, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new BorderModifierNodeElement(f, brush, shape, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BorderModifierNodeElement) {
            BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
            return C3641Dp.m73663equalsimpl0(this.f12803b, borderModifierNodeElement.f12803b) && Intrinsics.areEqual(this.f12804c, borderModifierNodeElement.f12804c) && Intrinsics.areEqual(this.f12805d, borderModifierNodeElement.f12805d);
        }
        return false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.f12804c;
    }

    @NotNull
    public final Shape getShape() {
        return this.f12805d;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m69335getWidthD9Ej5fM() {
        return this.f12803b;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (((C3641Dp.m73664hashCodeimpl(this.f12803b) * 31) + this.f12804c.hashCode()) * 31) + this.f12805d.hashCode();
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", C3641Dp.m73656boximpl(this.f12803b));
        if (this.f12804c instanceof SolidColor) {
            inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m71725boximpl(((SolidColor) this.f12804c).m72025getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m71725boximpl(((SolidColor) this.f12804c).m72025getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.f12804c);
        }
        inspectorInfo.getProperties().set("shape", this.f12805d);
    }

    @NotNull
    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C3641Dp.m73669toStringimpl(this.f12803b)) + ", brush=" + this.f12804c + ", shape=" + this.f12805d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public BorderModifierNodeElement(float f, Brush brush, Shape shape) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f12803b = f;
        this.f12804c = brush;
        this.f12805d = shape;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public BorderModifierNode create() {
        return new BorderModifierNode(this.f12803b, this.f12804c, this.f12805d, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull BorderModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m69331setWidth0680j_4(this.f12803b);
        node.setBrush(this.f12804c);
        node.setShape(this.f12805d);
    }
}
