package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001GB0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u000f\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0017\u001a\u00020\u00042!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\u0002¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001f\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0019J\u000f\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0019J\u001d\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J-\u0010.\u001a\u00020-\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b.\u0010/R5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R(\u00104\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00105R,\u00109\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00108R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020-0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00105R\u0018\u0010F\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, m28850d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "T", Action.SCOPE_ATTRIBUTE, "onValueChangedForScope", "block", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "(Lkotlin/jvm/functions/Function0;)V", "clear", "(Ljava/lang/Object;)V", "", "predicate", "clearIf", "start", "()V", "stop", "", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Z", OperatorName.FILL_NON_ZERO, "set", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Set;)V", "d", "()Ljava/util/Set;", "", "e", "()Ljava/lang/Void;", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", OperatorName.CURVE_TO, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "Z", "sendingNotifications", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "applyObserver", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/snapshots/ObserverHandle;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", OperatorName.CLOSE_PATH, "isPaused", "i", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMap", "ObservedScopeMap", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,610:1\n182#1,2:615\n184#1,2:628\n182#1,2:641\n184#1,2:654\n182#1,2:656\n184#1,2:669\n182#1,2:671\n184#1,2:684\n1182#2:611\n1161#2,2:612\n1#3:614\n460#4,11:617\n460#4,11:630\n460#4,11:643\n460#4,11:658\n460#4,11:673\n366#4,12:686\n728#4,2:698\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n66#1:615,2\n66#1:628,2\n263#1:641,2\n263#1:654,2\n273#1:656,2\n273#1:669,2\n305#1:671,2\n305#1:684,2\n174#1:611\n174#1:612,2\n66#1:617,11\n183#1:630,11\n263#1:643,11\n273#1:658,11\n305#1:673,11\n318#1:686,12\n321#1:698,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Function1 f28763a;

    /* renamed from: b */
    public final AtomicReference f28764b;

    /* renamed from: c */
    public boolean f28765c;

    /* renamed from: d */
    public final Function2 f28766d;

    /* renamed from: e */
    public final Function1 f28767e;

    /* renamed from: f */
    public final MutableVector f28768f;

    /* renamed from: g */
    public ObserverHandle f28769g;

    /* renamed from: h */
    public boolean f28770h;

    /* renamed from: i */
    public ObservedScopeMap f28771i;

    /* loaded from: classes2.dex */
    public static final class ObservedScopeMap {

        /* renamed from: a */
        public final Function1 f28772a;

        /* renamed from: b */
        public Object f28773b;

        /* renamed from: c */
        public IdentityArrayIntMap f28774c;

        /* renamed from: d */
        public int f28775d;

        /* renamed from: e */
        public final IdentityScopeMap f28776e;

        /* renamed from: f */
        public final IdentityArrayMap f28777f;

        /* renamed from: g */
        public final IdentityArraySet f28778g;

        /* renamed from: h */
        public final MutableVector f28779h;

        /* renamed from: i */
        public final DerivedStateObserver f28780i;

        /* renamed from: j */
        public int f28781j;

        /* renamed from: k */
        public final IdentityScopeMap f28782k;

        /* renamed from: l */
        public final HashMap f28783l;

        public ObservedScopeMap(Function1 onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.f28772a = onChanged;
            this.f28775d = -1;
            this.f28776e = new IdentityScopeMap();
            this.f28777f = new IdentityArrayMap(0, 1, null);
            this.f28778g = new IdentityArraySet();
            this.f28779h = new MutableVector(new DerivedState[16], 0);
            this.f28780i = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
                @Override // androidx.compose.runtime.DerivedStateObserver
                public void done(@NotNull DerivedState<?> derivedState) {
                    Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                    SnapshotStateObserver.ObservedScopeMap.m59889b(observedScopeMap, SnapshotStateObserver.ObservedScopeMap.m59890a(observedScopeMap) - 1);
                }

                @Override // androidx.compose.runtime.DerivedStateObserver
                public void start(@NotNull DerivedState<?> derivedState) {
                    Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                    SnapshotStateObserver.ObservedScopeMap.m59889b(observedScopeMap, SnapshotStateObserver.ObservedScopeMap.m59890a(observedScopeMap) + 1);
                }
            };
            this.f28782k = new IdentityScopeMap();
            this.f28783l = new HashMap();
        }

        /* renamed from: a */
        public static final /* synthetic */ int m59890a(ObservedScopeMap observedScopeMap) {
            return observedScopeMap.f28781j;
        }

        /* renamed from: b */
        public static final /* synthetic */ void m59889b(ObservedScopeMap observedScopeMap, int i) {
            observedScopeMap.f28781j = i;
        }

        /* renamed from: c */
        public final void m59888c() {
            this.f28776e.clear();
            this.f28777f.clear();
            this.f28782k.clear();
            this.f28783l.clear();
        }

        /* renamed from: d */
        public final void m59887d(Object obj) {
            boolean z;
            int i = this.f28775d;
            IdentityArrayIntMap identityArrayIntMap = this.f28774c;
            if (identityArrayIntMap != null) {
                Object[] keys = identityArrayIntMap.getKeys();
                int[] values = identityArrayIntMap.getValues();
                int size = identityArrayIntMap.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = keys[i3];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = values[i3];
                    if (i4 != i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m59879l(obj, obj2);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            keys[i2] = obj2;
                            values[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < size; i5++) {
                    keys[i5] = null;
                }
                identityArrayIntMap.f28486a = i2;
            }
        }

        /* renamed from: e */
        public final void m59886e(Object scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) this.f28777f.remove(scope);
            if (identityArrayIntMap == null) {
                return;
            }
            Object[] keys = identityArrayIntMap.getKeys();
            int[] values = identityArrayIntMap.getValues();
            int size = identityArrayIntMap.getSize();
            for (int i = 0; i < size; i++) {
                Object obj = keys[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i2 = values[i];
                m59879l(scope, obj);
            }
        }

        /* renamed from: f */
        public final Function1 m59885f() {
            return this.f28772a;
        }

        /* renamed from: g */
        public final void m59884g() {
            IdentityArraySet identityArraySet = this.f28778g;
            Function1 function1 = this.f28772a;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                function1.invoke(obj);
            }
            identityArraySet.clear();
        }

        /* renamed from: h */
        public final void m59883h(Object scope, Function1 readObserver, Function0 block) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(readObserver, "readObserver");
            Intrinsics.checkNotNullParameter(block, "block");
            Object obj = this.f28773b;
            IdentityArrayIntMap identityArrayIntMap = this.f28774c;
            int i = this.f28775d;
            this.f28773b = scope;
            this.f28774c = (IdentityArrayIntMap) this.f28777f.get(scope);
            if (this.f28775d == -1) {
                this.f28775d = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.f28780i;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(readObserver, null, block);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj2 = this.f28773b;
                Intrinsics.checkNotNull(obj2);
                m59887d(obj2);
                this.f28773b = obj;
                this.f28774c = identityArrayIntMap;
                this.f28775d = i;
            } catch (Throwable th2) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th2;
            }
        }

        /* renamed from: i */
        public final boolean m59882i(Set changes) {
            boolean z;
            int m60104a;
            int i;
            Object[] objArr;
            int m60104a2;
            Intrinsics.checkNotNullParameter(changes, "changes");
            IdentityScopeMap identityScopeMap = this.f28782k;
            HashMap hashMap = this.f28783l;
            IdentityScopeMap identityScopeMap2 = this.f28776e;
            IdentityArraySet identityArraySet = this.f28778g;
            if (changes instanceof IdentityArraySet) {
                IdentityArraySet identityArraySet2 = (IdentityArraySet) changes;
                Object[] values = identityArraySet2.getValues();
                int size = identityArraySet2.size();
                int i2 = 0;
                z = false;
                while (i2 < size) {
                    Object obj = values[i2];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (identityScopeMap.contains(obj) && (m60104a2 = identityScopeMap.m60104a(obj)) >= 0) {
                        IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a2);
                        Object[] values2 = m60101d.getValues();
                        int size2 = m60101d.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = values2[i3];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            DerivedState derivedState = (DerivedState) obj2;
                            Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            int i4 = size;
                            Object obj3 = hashMap.get(derivedState);
                            SnapshotMutationPolicy policy = derivedState.getPolicy();
                            if (policy == null) {
                                policy = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            Object[] objArr2 = values;
                            boolean z2 = z;
                            if (!policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj3)) {
                                int m60104a3 = identityScopeMap2.m60104a(derivedState);
                                if (m60104a3 >= 0) {
                                    IdentityArraySet m60101d2 = identityScopeMap2.m60101d(m60104a3);
                                    Object[] values3 = m60101d2.getValues();
                                    int size3 = m60101d2.size();
                                    z = z2;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj4 = values3[i5];
                                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        identityArraySet.add(obj4);
                                        i5++;
                                        z = true;
                                    }
                                    i3++;
                                    size = i4;
                                    values = objArr2;
                                }
                            } else {
                                this.f28779h.add(derivedState);
                            }
                            z = z2;
                            i3++;
                            size = i4;
                            values = objArr2;
                        }
                        i = size;
                        objArr = values;
                    } else {
                        i = size;
                        objArr = values;
                    }
                    int m60104a4 = identityScopeMap2.m60104a(obj);
                    if (m60104a4 >= 0) {
                        IdentityArraySet m60101d3 = identityScopeMap2.m60101d(m60104a4);
                        Object[] values4 = m60101d3.getValues();
                        int size4 = m60101d3.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = values4[i6];
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            identityArraySet.add(obj5);
                            i6++;
                            z = true;
                        }
                    }
                    i2++;
                    size = i;
                    values = objArr;
                }
            } else {
                Iterator it = changes.iterator();
                z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (identityScopeMap.contains(next) && (m60104a = identityScopeMap.m60104a(next)) >= 0) {
                        IdentityArraySet m60101d4 = identityScopeMap.m60101d(m60104a);
                        Object[] values5 = m60101d4.getValues();
                        int size5 = m60101d4.size();
                        int i7 = 0;
                        while (i7 < size5) {
                            Object obj6 = values5[i7];
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            DerivedState derivedState2 = (DerivedState) obj6;
                            Intrinsics.checkNotNull(derivedState2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            Object obj7 = hashMap.get(derivedState2);
                            SnapshotMutationPolicy policy2 = derivedState2.getPolicy();
                            if (policy2 == null) {
                                policy2 = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            Iterator it2 = it;
                            if (!policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj7)) {
                                int m60104a5 = identityScopeMap2.m60104a(derivedState2);
                                if (m60104a5 >= 0) {
                                    IdentityArraySet m60101d5 = identityScopeMap2.m60101d(m60104a5);
                                    Object[] values6 = m60101d5.getValues();
                                    int size6 = m60101d5.size();
                                    int i8 = 0;
                                    while (i8 < size6) {
                                        Object obj8 = values6[i8];
                                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        identityArraySet.add(obj8);
                                        i8++;
                                        z = true;
                                    }
                                }
                            } else {
                                this.f28779h.add(derivedState2);
                            }
                            i7++;
                            it = it2;
                        }
                    }
                    Iterator it3 = it;
                    int m60104a6 = identityScopeMap2.m60104a(next);
                    if (m60104a6 >= 0) {
                        IdentityArraySet m60101d6 = identityScopeMap2.m60101d(m60104a6);
                        Object[] values7 = m60101d6.getValues();
                        int size7 = m60101d6.size();
                        int i9 = 0;
                        while (i9 < size7) {
                            Object obj9 = values7[i9];
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            identityArraySet.add(obj9);
                            i9++;
                            z = true;
                        }
                    }
                    it = it3;
                }
            }
            if (this.f28779h.isNotEmpty()) {
                MutableVector mutableVector = this.f28779h;
                int size8 = mutableVector.getSize();
                if (size8 > 0) {
                    Object[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        m59877n((DerivedState) content[i10]);
                        i10++;
                    } while (i10 < size8);
                    this.f28779h.clear();
                } else {
                    this.f28779h.clear();
                }
            }
            return z;
        }

        /* renamed from: j */
        public final void m59881j(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = this.f28773b;
            Intrinsics.checkNotNull(obj);
            int i = this.f28775d;
            IdentityArrayIntMap identityArrayIntMap = this.f28774c;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                this.f28774c = identityArrayIntMap;
                this.f28777f.set(obj, identityArrayIntMap);
                Unit unit = Unit.INSTANCE;
            }
            m59880k(value, i, obj, identityArrayIntMap);
        }

        /* renamed from: k */
        public final void m59880k(Object obj, int i, Object obj2, IdentityArrayIntMap identityArrayIntMap) {
            if (this.f28781j > 0) {
                return;
            }
            int add = identityArrayIntMap.add(obj, i);
            if ((obj instanceof DerivedState) && add != i) {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.f28783l.put(obj, currentRecord.getCurrentValue());
                Object[] dependencies = currentRecord.getDependencies();
                IdentityScopeMap identityScopeMap = this.f28782k;
                identityScopeMap.removeScope(obj);
                for (Object obj3 : dependencies) {
                    if (obj3 == null) {
                        break;
                    }
                    identityScopeMap.add(obj3, obj);
                }
            }
            if (add == -1) {
                this.f28776e.add(obj, obj2);
            }
        }

        /* renamed from: l */
        public final void m59879l(Object obj, Object obj2) {
            this.f28776e.remove(obj2, obj);
            if ((obj2 instanceof DerivedState) && !this.f28776e.contains(obj2)) {
                this.f28782k.removeScope(obj2);
                this.f28783l.remove(obj2);
            }
        }

        /* renamed from: m */
        public final void m59878m(Function1 predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            IdentityArrayMap identityArrayMap = this.f28777f;
            int size = identityArrayMap.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = identityArrayMap.getKeys()[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.getValues()[i2];
                Boolean bool = (Boolean) predicate.invoke(obj);
                if (bool.booleanValue()) {
                    Object[] keys = identityArrayIntMap.getKeys();
                    int[] values = identityArrayIntMap.getValues();
                    int size2 = identityArrayIntMap.getSize();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj2 = keys[i3];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = values[i3];
                        m59879l(obj, obj2);
                    }
                }
                if (!bool.booleanValue()) {
                    if (i != i2) {
                        identityArrayMap.getKeys()[i] = obj;
                        identityArrayMap.getValues()[i] = identityArrayMap.getValues()[i2];
                    }
                    i++;
                }
            }
            if (identityArrayMap.getSize() > i) {
                int size3 = identityArrayMap.getSize();
                for (int i5 = i; i5 < size3; i5++) {
                    identityArrayMap.getKeys()[i5] = null;
                    identityArrayMap.getValues()[i5] = null;
                }
                identityArrayMap.f28491c = i;
            }
        }

        /* renamed from: n */
        public final void m59877n(DerivedState derivedState) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            IdentityArrayMap identityArrayMap = this.f28777f;
            int id2 = SnapshotKt.currentSnapshot().getId();
            IdentityScopeMap identityScopeMap = this.f28776e;
            int m60104a = identityScopeMap.m60104a(derivedState);
            if (m60104a >= 0) {
                IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a);
                Object[] values = m60101d.getValues();
                int size = m60101d.size();
                for (int i = 0; i < size; i++) {
                    Object obj = values[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.get(obj);
                    if (identityArrayIntMap == null) {
                        identityArrayIntMap = new IdentityArrayIntMap();
                        identityArrayMap.set(obj, identityArrayIntMap);
                        Unit unit = Unit.INSTANCE;
                    }
                    m59880k(derivedState, id2, obj, identityArrayIntMap);
                }
            }
        }
    }

    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f28763a = onChangedExecutor;
        this.f28764b = new AtomicReference(null);
        this.f28766d = new SnapshotStateObserver$applyObserver$1(this);
        this.f28767e = new SnapshotStateObserver$readObserver$1(this);
        this.f28768f = new MutableVector(new ObservedScopeMap[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m59896a(Set set) {
        Object obj;
        List plus;
        do {
            obj = this.f28764b.get();
            if (obj == null) {
                plus = set;
            } else if (obj instanceof Set) {
                plus = CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else if (obj instanceof List) {
                plus = CollectionsKt___CollectionsKt.plus((Collection) obj, (Iterable) AbstractC10108ds.listOf(set));
            } else {
                m59892e();
                throw new KotlinNothingValueException();
            }
        } while (!AbstractC17300An1.m69050a(this.f28764b, obj, plus));
    }

    /* renamed from: b */
    public final boolean m59895b() {
        boolean z;
        synchronized (this.f28768f) {
            z = this.f28765c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set m59893d = m59893d();
            if (m59893d == null) {
                return z2;
            }
            synchronized (this.f28768f) {
                try {
                    MutableVector mutableVector = this.f28768f;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i = 0;
                        do {
                            if (!((ObservedScopeMap) content[i]).m59882i(m59893d) && !z2) {
                                z2 = false;
                                i++;
                            }
                            z2 = true;
                            i++;
                        } while (i < size);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* renamed from: c */
    public final ObservedScopeMap m59894c(Function1 function1) {
        ObservedScopeMap observedScopeMap;
        MutableVector mutableVector = this.f28768f;
        int size = mutableVector.getSize();
        if (size > 0) {
            ?? content = mutableVector.getContent();
            int i = 0;
            do {
                observedScopeMap = content[i];
                if (((ObservedScopeMap) observedScopeMap).m59885f() == function1) {
                    break;
                }
                i++;
            } while (i < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            this.f28768f.add(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }

    public final void clear(@NotNull Object scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.f28768f) {
            try {
                MutableVector mutableVector = this.f28768f;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        ((ObservedScopeMap) content[i]).m59886e(scope);
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.f28768f) {
            try {
                MutableVector mutableVector = this.f28768f;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        ((ObservedScopeMap) content[i]).m59878m(predicate);
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final Set m59893d() {
        Object obj;
        Object obj2;
        Set set;
        do {
            obj = this.f28764b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                m59892e();
                throw new KotlinNothingValueException();
            }
        } while (!AbstractC17300An1.m69050a(this.f28764b, obj, obj2));
        return set;
    }

    /* renamed from: e */
    public final Void m59892e() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public final void m59891f() {
        this.f28763a.invoke(new SnapshotStateObserver$sendNotifications$1(this));
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f28766d.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ObservedScopeMap m59894c;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f28768f) {
            m59894c = m59894c(onValueChangedForScope);
        }
        boolean z = this.f28770h;
        ObservedScopeMap observedScopeMap = this.f28771i;
        try {
            this.f28770h = false;
            this.f28771i = m59894c;
            m59894c.m59883h(scope, this.f28767e, block);
        } finally {
            this.f28771i = observedScopeMap;
            this.f28770h = z;
        }
    }

    public final void start() {
        this.f28769g = Snapshot.Companion.registerApplyObserver(this.f28766d);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.f28769g;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z = this.f28770h;
        this.f28770h = true;
        try {
            block.invoke();
        } finally {
            this.f28770h = z;
        }
    }

    public final void clear() {
        synchronized (this.f28768f) {
            try {
                MutableVector mutableVector = this.f28768f;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        ((ObservedScopeMap) content[i]).m59888c();
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
