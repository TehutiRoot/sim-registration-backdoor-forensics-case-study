package androidx.compose.p003ui;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.runtime.CompositionLocalMap;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/runtime/CompositionLocalMap;", "map", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "", "onAttach", "()V", "value", OperatorName.ENDPATH, "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.CompositionLocalMapInjectionNode */
/* loaded from: classes2.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {

    /* renamed from: n */
    public CompositionLocalMap f28844n;

    public CompositionLocalMapInjectionNode(@NotNull CompositionLocalMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f28844n = map;
    }

    @NotNull
    public final CompositionLocalMap getMap() {
        return this.f28844n;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.f28844n);
    }

    public final void setMap(@NotNull CompositionLocalMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f28844n = value;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(value);
    }
}
