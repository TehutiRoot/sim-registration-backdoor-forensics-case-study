package androidx.compose.p003ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m29142d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager */
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager {
    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    /* renamed from: a */
    public static final AtomicBoolean f30775a = new AtomicBoolean(false);

    public final void ensureStarted() {
        if (f30775a.compareAndSet(false, true)) {
            Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            AbstractC1539Vc.m65885e(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(Channel$default, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new GlobalSnapshotManager$ensureStarted$2(Channel$default));
        }
    }
}