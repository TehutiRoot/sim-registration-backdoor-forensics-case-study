package androidx.compose.p003ui.platform;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/platform/ViewRootForInspector;", "", "subCompositionView", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "viewRoot", "Landroid/view/View;", "getViewRoot", "()Landroid/view/View;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.platform.ViewRootForInspector */
/* loaded from: classes2.dex */
public interface ViewRootForInspector {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.platform.ViewRootForInspector$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static AbstractComposeView getSubCompositionView(@NotNull ViewRootForInspector viewRootForInspector) {
            AbstractComposeView m52057a;
            m52057a = AbstractC19114b32.m52057a(viewRootForInspector);
            return m52057a;
        }

        @Deprecated
        @Nullable
        public static View getViewRoot(@NotNull ViewRootForInspector viewRootForInspector) {
            View m52056b;
            m52056b = AbstractC19114b32.m52056b(viewRootForInspector);
            return m52056b;
        }
    }

    @Nullable
    AbstractComposeView getSubCompositionView();

    @Nullable
    View getViewRoot();
}
