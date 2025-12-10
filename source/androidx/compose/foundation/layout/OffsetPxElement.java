package androidx.compose.foundation.layout;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BD\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR+\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b(\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28850d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", TypedValues.CycleType.S_WAVE_OFFSET, "", "rtlAware", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/foundation/layout/OffsetPxNode;", "node", "e", "(Landroidx/compose/foundation/layout/OffsetPxNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getOffset", "()Lkotlin/jvm/functions/Function1;", OperatorName.CURVE_TO, "Z", "getRtlAware", "()Z", "getInspectorInfo", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {

    /* renamed from: b */
    public final Function1 f13190b;

    /* renamed from: c */
    public final boolean f13191c;

    /* renamed from: d */
    public final Function1 f13192d;

    public OffsetPxElement(Function1 offset, boolean z, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f13190b = offset;
        this.f13191c = z;
        this.f13192d = inspectorInfo;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public OffsetPxNode create() {
        return new OffsetPxNode(this.f13190b, this.f13191c);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(OffsetPxNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61362c(this.f13190b);
        node.m61361d(this.f13191c);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && Intrinsics.areEqual(this.f13190b, offsetPxElement.f13190b) && this.f13191c == offsetPxElement.f13191c) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.f13190b.hashCode() * 31) + AbstractC1705Xp.m65430a(this.f13191c);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f13192d.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f13190b + ", rtlAware=" + this.f13191c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
