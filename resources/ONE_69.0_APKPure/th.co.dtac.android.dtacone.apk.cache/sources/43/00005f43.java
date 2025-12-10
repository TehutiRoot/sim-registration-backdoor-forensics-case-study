package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.node.DrawModifierNodeKt;
import androidx.compose.p003ui.node.LayoutModifierNodeKt;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m29143d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m29142d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "d", "()Landroidx/compose/ui/draw/PainterNode;", "node", "", "e", "(Landroidx/compose/ui/draw/PainterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", OperatorName.CURVE_TO, "Z", "getSizeToIntrinsics", "()Z", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", OperatorName.FILL_NON_ZERO, "F", "getAlpha", "()F", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.PainterElement */
/* loaded from: classes2.dex */
public final class PainterElement extends ModifierNodeElement<PainterNode> {

    /* renamed from: b */
    public final Painter f28974b;

    /* renamed from: c */
    public final boolean f28975c;

    /* renamed from: d */
    public final Alignment f28976d;

    /* renamed from: e */
    public final ContentScale f28977e;

    /* renamed from: f */
    public final float f28978f;

    /* renamed from: g */
    public final ColorFilter f28979g;

    public PainterElement(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f28974b = painter;
        this.f28975c = z;
        this.f28976d = alignment;
        this.f28977e = contentScale;
        this.f28978f = f;
        this.f28979g = colorFilter;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public PainterNode create() {
        return new PainterNode(this.f28974b, this.f28975c, this.f28976d, this.f28977e, this.f28978f, this.f28979g);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(PainterNode node) {
        boolean z;
        Intrinsics.checkNotNullParameter(node, "node");
        boolean m59791c = node.m59791c();
        boolean z2 = this.f28975c;
        if (m59791c == z2 && (!z2 || Size.m71751equalsimpl0(node.m59792b().mo72420getIntrinsicSizeNHjbRc(), this.f28974b.mo72420getIntrinsicSizeNHjbRc()))) {
            z = false;
        } else {
            z = true;
        }
        node.m59783k(this.f28974b);
        node.m59782l(this.f28975c);
        node.m59786h(this.f28976d);
        node.m59784j(this.f28977e);
        node.setAlpha(this.f28978f);
        node.m59785i(this.f28979g);
        if (z) {
            LayoutModifierNodeKt.invalidateMeasurement(node);
        }
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PainterElement) {
            PainterElement painterElement = (PainterElement) obj;
            return Intrinsics.areEqual(this.f28974b, painterElement.f28974b) && this.f28975c == painterElement.f28975c && Intrinsics.areEqual(this.f28976d, painterElement.f28976d) && Intrinsics.areEqual(this.f28977e, painterElement.f28977e) && Float.compare(this.f28978f, painterElement.f28978f) == 0 && Intrinsics.areEqual(this.f28979g, painterElement.f28979g);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f28974b.hashCode() * 31;
        boolean z = this.f28975c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.f28976d.hashCode()) * 31) + this.f28977e.hashCode()) * 31) + Float.floatToIntBits(this.f28978f)) * 31;
        ColorFilter colorFilter = this.f28979g;
        if (colorFilter == null) {
            hashCode = 0;
        } else {
            hashCode = colorFilter.hashCode();
        }
        return hashCode3 + hashCode;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.f28974b);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.f28975c));
        inspectorInfo.getProperties().set("alignment", this.f28976d);
        inspectorInfo.getProperties().set("contentScale", this.f28977e);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f28978f));
        inspectorInfo.getProperties().set("colorFilter", this.f28979g);
    }

    public String toString() {
        return "PainterElement(painter=" + this.f28974b + ", sizeToIntrinsics=" + this.f28975c + ", alignment=" + this.f28976d + ", contentScale=" + this.f28977e + ", alpha=" + this.f28978f + ", colorFilter=" + this.f28979g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}