package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "onAttach", "onDetach", "", OperatorName.ENDPATH, "Z", "getAttachHasBeenRun", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.TailModifierNode */
/* loaded from: classes2.dex */
public final class TailModifierNode extends Modifier.Node {

    /* renamed from: n */
    public boolean f30432n;

    public TailModifierNode() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.f30432n;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        this.f30432n = true;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        this.f30432n = false;
    }

    public final void setAttachHasBeenRun(boolean z) {
        this.f30432n = z;
    }

    @NotNull
    public String toString() {
        return "<tail>";
    }
}
