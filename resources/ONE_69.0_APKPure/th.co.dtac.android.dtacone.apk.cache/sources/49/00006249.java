package androidx.compose.p003ui.node;

import android.view.View;
import androidx.compose.p003ui.InternalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H&\u0082\u0001\u0001\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/node/InteroperableComposeUiNode;", "", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@InternalComposeUiApi
/* renamed from: androidx.compose.ui.node.InteroperableComposeUiNode */
/* loaded from: classes2.dex */
public interface InteroperableComposeUiNode {
    @Nullable
    View getInteropView();
}