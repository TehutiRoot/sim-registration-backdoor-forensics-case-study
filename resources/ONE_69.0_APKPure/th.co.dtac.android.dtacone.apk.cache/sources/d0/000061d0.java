package androidx.compose.p003ui.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/layout/PinnableContainer;", "", "pin", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "PinnedHandle", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.PinnableContainer */
/* loaded from: classes2.dex */
public interface PinnableContainer {

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "", "release", "", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.PinnableContainer$PinnedHandle */
    /* loaded from: classes2.dex */
    public interface PinnedHandle {
        void release();
    }

    @NotNull
    PinnedHandle pin();
}