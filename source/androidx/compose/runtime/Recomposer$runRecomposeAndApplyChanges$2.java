package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m28800f = "Recomposer.kt", m28799i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m28798l = {526, 537}, m28797m = "invokeSuspend", m28796n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, m28795s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1502:1\n70#2:1503\n33#3,6:1504\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n519#1:1503\n520#1:1504,6\n*E\n"})
/* loaded from: classes2.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Recomposer this$0;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1502:1\n46#2,5:1503\n46#2,3:1508\n50#2:1524\n70#3:1511\n70#3:1525\n70#3:1548\n33#4,6:1512\n33#4,6:1518\n33#4,6:1526\n33#4,6:1532\n33#4,6:1538\n1855#5,2:1544\n1855#5,2:1546\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n541#1:1503,5\n551#1:1508,3\n551#1:1524\n555#1:1511\n586#1:1525\n665#1:1548\n556#1:1512,6\n567#1:1518,6\n587#1:1526,6\n621#1:1532,6\n624#1:1538,6\n639#1:1544,2\n653#1:1546,2\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1 */
    /* loaded from: classes2.dex */
    public static final class C34481 extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ List<ControlledComposition> $toApply;
        final /* synthetic */ Set<ControlledComposition> $toComplete;
        final /* synthetic */ List<MovableContentStateReference> $toInsert;
        final /* synthetic */ Set<ControlledComposition> $toLateApply;
        final /* synthetic */ List<ControlledComposition> $toRecompose;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34481(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, Set<ControlledComposition> set, List<ControlledComposition> list3, Set<ControlledComposition> set2) {
            super(1);
            this.this$0 = recomposer;
            this.$toRecompose = list;
            this.$toInsert = list2;
            this.$toLateApply = set;
            this.$toApply = list3;
            this.$toComplete = set2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            boolean m60241e;
            Object beginSection;
            List list;
            List list2;
            List m60233m;
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
            List<ControlledComposition> list3 = this.$toRecompose;
            List<MovableContentStateReference> list4 = this.$toInsert;
            Set<ControlledComposition> set = this.$toLateApply;
            List<ControlledComposition> list5 = this.$toApply;
            Set<ControlledComposition> set2 = this.$toComplete;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer2.m60227s();
                synchronized (recomposer2.f28388c) {
                    list = recomposer2.f28393h;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list3.add((ControlledComposition) list.get(i));
                    }
                    list2 = recomposer2.f28393h;
                    list2.clear();
                    Unit unit2 = Unit.INSTANCE;
                }
                IdentityArraySet identityArraySet = new IdentityArraySet();
                IdentityArraySet identityArraySet2 = new IdentityArraySet();
                while (true) {
                    if (!(!list3.isEmpty()) && !(!list4.isEmpty())) {
                        break;
                    }
                    try {
                        int size2 = list3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ControlledComposition controlledComposition = list3.get(i2);
                            identityArraySet2.add(controlledComposition);
                            m60232n = recomposer2.m60232n(controlledComposition, identityArraySet);
                            if (m60232n != null) {
                                list5.add(m60232n);
                            }
                        }
                        list3.clear();
                        if (identityArraySet.isNotEmpty()) {
                            synchronized (recomposer2.f28388c) {
                                List list6 = recomposer2.f28391f;
                                int size3 = list6.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) list6.get(i3);
                                    if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                        list3.add(controlledComposition2);
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                        }
                        if (list3.isEmpty()) {
                            try {
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list4, recomposer2);
                                while (!list4.isEmpty()) {
                                    m60233m = recomposer2.m60233m(list4, identityArraySet);
                                    AbstractC10410hs.addAll(set, m60233m);
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list4, recomposer2);
                                }
                            } catch (Exception e) {
                                Recomposer.m60230p(recomposer2, e, null, true, 2, null);
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list3, list4, list5, set, set2);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        Recomposer.m60230p(recomposer2, e2, null, true, 2, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list3, list4, list5, set, set2);
                        list3.clear();
                    }
                }
                if (!list5.isEmpty()) {
                    recomposer2.f28386a = recomposer2.getChangeCount() + 1;
                    try {
                        int size4 = list5.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            set2.add(list5.get(i4));
                        }
                        int size5 = list5.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            list5.get(i5).applyChanges();
                        }
                        list5.clear();
                    } catch (Exception e3) {
                        Recomposer.m60230p(recomposer2, e3, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list3, list4, list5, set, set2);
                        list5.clear();
                        return;
                    }
                }
                if (!set.isEmpty()) {
                    try {
                        AbstractC10410hs.addAll(set2, set);
                        for (ControlledComposition controlledComposition3 : set) {
                            controlledComposition3.applyLateChanges();
                        }
                        set.clear();
                    } catch (Exception e4) {
                        Recomposer.m60230p(recomposer2, e4, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list3, list4, list5, set, set2);
                        set.clear();
                        return;
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        for (ControlledComposition controlledComposition4 : set2) {
                            controlledComposition4.changesApplied();
                        }
                        set2.clear();
                    } catch (Exception e5) {
                        Recomposer.m60230p(recomposer2, e5, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list3, list4, list5, set, set2);
                        set2.clear();
                        return;
                    }
                }
                synchronized (recomposer2.f28388c) {
                    recomposer2.m60243c();
                }
                Snapshot.Companion.notifyObjectsInitialized();
                recomposer2.f28399n = null;
                Unit unit4 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.f28388c) {
            try {
                list2 = recomposer.f28395j;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) list2.get(i));
                }
                list3 = recomposer.f28395j;
                list3.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00da -> B:23:0x00de). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e5 -> B:11:0x0086). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }
}
