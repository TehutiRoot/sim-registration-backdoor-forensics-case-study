package androidx.compose.foundation;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C3641Dp;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m28850d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "d", "()Landroidx/compose/foundation/MarqueeModifierNode;", "node", "e", "(Landroidx/compose/foundation/MarqueeModifierNode;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/MarqueeSpacing;", OperatorName.NON_STROKING_GRAY, "F", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {

    /* renamed from: b */
    public final int f12877b;

    /* renamed from: c */
    public final int f12878c;

    /* renamed from: d */
    public final int f12879d;

    /* renamed from: e */
    public final int f12880e;

    /* renamed from: f */
    public final MarqueeSpacing f12881f;

    /* renamed from: g */
    public final float f12882g;

    public /* synthetic */ MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.f12877b, this.f12878c, this.f12879d, this.f12880e, this.f12881f, this.f12882g, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(MarqueeModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61544y(this.f12877b, this.f12878c, this.f12879d, this.f12880e, this.f12881f, this.f12882g);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarqueeModifierElement) {
            MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
            return this.f12877b == marqueeModifierElement.f12877b && MarqueeAnimationMode.m69372equalsimpl0(this.f12878c, marqueeModifierElement.f12878c) && this.f12879d == marqueeModifierElement.f12879d && this.f12880e == marqueeModifierElement.f12880e && Intrinsics.areEqual(this.f12881f, marqueeModifierElement.f12881f) && C3641Dp.m73663equalsimpl0(this.f12882g, marqueeModifierElement.f12882g);
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((this.f12877b * 31) + MarqueeAnimationMode.m69373hashCodeimpl(this.f12878c)) * 31) + this.f12879d) * 31) + this.f12880e) * 31) + this.f12881f.hashCode()) * 31) + C3641Dp.m73664hashCodeimpl(this.f12882g);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.f12877b));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m69370boximpl(this.f12878c));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.f12879d));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.f12880e));
        inspectorInfo.getProperties().set("spacing", this.f12881f);
        inspectorInfo.getProperties().set("velocity", C3641Dp.m73656boximpl(this.f12882g));
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.f12877b + ", animationMode=" + ((Object) MarqueeAnimationMode.m69374toStringimpl(this.f12878c)) + ", delayMillis=" + this.f12879d + ", initialDelayMillis=" + this.f12880e + ", spacing=" + this.f12881f + ", velocity=" + ((Object) C3641Dp.m73669toStringimpl(this.f12882g)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public MarqueeModifierElement(int i, int i2, int i3, int i4, MarqueeSpacing spacing, float f) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f12877b = i;
        this.f12878c = i2;
        this.f12879d = i3;
        this.f12880e = i4;
        this.f12881f = spacing;
        this.f12882g = f;
    }
}
