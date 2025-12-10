package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.PinnableContainer;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class FocusablePinnableContainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    /* renamed from: n */
    public PinnableContainer.PinnedHandle f12852n;

    /* renamed from: o */
    public boolean f12853o;

    /* renamed from: a */
    public final PinnableContainer m61582a() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new FocusablePinnableContainerNode$retrievePinnableContainer$1(objectRef, this));
        return (PinnableContainer) objectRef.element;
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer.PinnedHandle pinnedHandle;
        PinnableContainer m61582a = m61582a();
        if (this.f12853o) {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.f12852n;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            if (m61582a != null) {
                pinnedHandle = m61582a.pin();
            } else {
                pinnedHandle = null;
            }
            this.f12852n = pinnedHandle;
        }
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.f12852n;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.f12852n = null;
    }

    public final void setFocus(boolean z) {
        PinnableContainer.PinnedHandle pinnedHandle = null;
        if (z) {
            PinnableContainer m61582a = m61582a();
            if (m61582a != null) {
                pinnedHandle = m61582a.pin();
            }
            this.f12852n = pinnedHandle;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.f12852n;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            this.f12852n = null;
        }
        this.f12853o = z;
    }
}
