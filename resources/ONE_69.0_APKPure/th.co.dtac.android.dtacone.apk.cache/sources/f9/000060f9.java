package androidx.compose.p003ui.input.nestedscroll;

import androidx.compose.p003ui.modifier.ModifierLocalKt;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.p003ui.node.DelegatableNode;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/node/DelegatableNode;", "nestedScrollModifierNode", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalNestedScroll", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalNestedScroll", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt */
/* loaded from: classes2.dex */
public final class NestedScrollNodeKt {

    /* renamed from: a */
    public static final ProvidableModifierLocal f29980a = ModifierLocalKt.modifierLocalOf(NestedScrollNodeKt$ModifierLocalNestedScroll$1.INSTANCE);

    @NotNull
    public static final ProvidableModifierLocal<NestedScrollNode> getModifierLocalNestedScroll() {
        return f29980a;
    }

    @NotNull
    public static final DelegatableNode nestedScrollModifierNode(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        return new NestedScrollNode(connection, nestedScrollDispatcher);
    }
}