package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "d", "()Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "node", "", "e", "(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {

    /* renamed from: b */
    public final BringIntoViewResponder f13939b;

    public BringIntoViewResponderElement(BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        this.f13939b = responder;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public BringIntoViewResponderNode create() {
        return new BringIntoViewResponderNode(this.f13939b);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(BringIntoViewResponderNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61085e(this.f13939b);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof BringIntoViewResponderElement) || !Intrinsics.areEqual(this.f13939b, ((BringIntoViewResponderElement) obj).f13939b))) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return this.f13939b.hashCode();
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.f13939b);
    }
}
