package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Lkotlinx/coroutines/CancellableContinuation;", "", "frameTime", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1502:1\n46#2,5:1503\n46#2,3:1508\n50#2:1537\n70#3:1511\n70#3:1536\n33#4,6:1512\n33#4,6:1518\n33#4,6:1524\n33#4,6:1530\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n833#1:1503,5\n843#1:1508,3\n843#1:1537\n848#1:1511\n881#1:1536\n849#1:1512,6\n851#1:1518,6\n859#1:1524,6\n874#1:1530,6\n*E\n"})
/* loaded from: classes2.dex */
public final class Recomposer$runFrameLoop$2 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {
    final /* synthetic */ C21820qo1 $frameSignal;
    final /* synthetic */ List<ControlledComposition> $toApply;
    final /* synthetic */ List<ControlledComposition> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, C21820qo1 c21820qo1) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = c21820qo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
        return invoke(l.longValue());
    }

    @Nullable
    public final CancellableContinuation<Unit> invoke(long j) {
        boolean m60241e;
        Object beginSection;
        List list;
        int i;
        List list2;
        List list3;
        List list4;
        CancellableContinuation<Unit> m60243c;
        ControlledComposition m60232n;
        BroadcastFrameClock broadcastFrameClock;
        m60241e = this.this$0.m60241e();
        if (m60241e) {
            Recomposer recomposer = this.this$0;
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer.f28387b;
                broadcastFrameClock.sendFrame(j);
                Snapshot.Companion.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<ControlledComposition> list5 = this.$toRecompose;
        List<ControlledComposition> list6 = this.$toApply;
        C21820qo1 c21820qo1 = this.$frameSignal;
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.m60227s();
            synchronized (recomposer2.f28388c) {
                list = recomposer2.f28394i;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list6.add((ControlledComposition) list.get(i2));
                }
                list2 = recomposer2.f28394i;
                list2.clear();
                list3 = recomposer2.f28393h;
                int size2 = list3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    list5.add((ControlledComposition) list3.get(i3));
                }
                list4 = recomposer2.f28393h;
                list4.clear();
                c21820qo1.m23430e();
                Unit unit2 = Unit.INSTANCE;
            }
            IdentityArraySet identityArraySet = new IdentityArraySet();
            int size3 = list5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                m60232n = recomposer2.m60232n(list5.get(i4), identityArraySet);
                if (m60232n != null) {
                    list6.add(m60232n);
                }
            }
            list5.clear();
            if (!list6.isEmpty()) {
                recomposer2.f28386a = recomposer2.getChangeCount() + 1;
            }
            int size4 = list6.size();
            for (i = 0; i < size4; i++) {
                list6.get(i).applyChanges();
            }
            list6.clear();
            synchronized (recomposer2.f28388c) {
                m60243c = recomposer2.m60243c();
            }
            return m60243c;
        } finally {
        }
    }
}
