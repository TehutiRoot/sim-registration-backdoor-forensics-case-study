package androidx.compose.foundation.layout;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m28850d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "", "weight", "", "fill", "<init>", "(FZ)V", "create", "()Landroidx/compose/foundation/layout/LayoutWeightNode;", "node", "", "update", "(Landroidx/compose/foundation/layout/LayoutWeightNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getWeight", "()F", OperatorName.CURVE_TO, "Z", "getFill", "()Z", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {

    /* renamed from: b */
    public final float f13174b;

    /* renamed from: c */
    public final boolean f13175c;

    public LayoutWeightElement(float f, boolean z) {
        this.f13174b = f;
        this.f13175c = z;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.f13174b == layoutWeightElement.f13174b && this.f13175c == layoutWeightElement.f13175c) {
            return true;
        }
        return false;
    }

    public final boolean getFill() {
        return this.f13175c;
    }

    public final float getWeight() {
        return this.f13174b;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.floatToIntBits(this.f13174b) * 31) + AbstractC1705Xp.m65430a(this.f13175c);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("weight");
        inspectorInfo.setValue(Float.valueOf(this.f13174b));
        inspectorInfo.getProperties().set("weight", Float.valueOf(this.f13174b));
        inspectorInfo.getProperties().set("fill", Boolean.valueOf(this.f13175c));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public LayoutWeightNode create() {
        return new LayoutWeightNode(this.f13174b, this.f13175c);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull LayoutWeightNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setWeight(this.f13174b);
        node.setFill(this.f13175c);
    }
}
