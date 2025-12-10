package androidx.compose.runtime;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class DerivedSnapshotState implements StateObject, DerivedState {

    /* renamed from: a */
    public final Function0 f28403a;

    /* renamed from: b */
    public final SnapshotMutationPolicy f28404b;

    /* renamed from: c */
    public ResultRecord f28405c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u0000 <*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001<B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0013\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\u0014\u00107\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, m29142d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "<init>", "()V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "readableHash", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", OperatorName.CURVE_TO, "I", "getValidSnapshotId", "()I", "setValidSnapshotId", "(I)V", "validSnapshotId", "d", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "validSnapshotWriteCount", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "e", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "get_dependencies", "()Landroidx/compose/runtime/collection/IdentityArrayMap;", "set_dependencies", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)V", "_dependencies", "", OperatorName.FILL_NON_ZERO, "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "result", OperatorName.NON_STROKING_GRAY, "getResultHash", "setResultHash", "resultHash", "getCurrentValue", "currentValue", "", "getDependencies", "()[Ljava/lang/Object;", "dependencies", "Companion", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,385:1\n1722#2:386\n1722#2:388\n1722#2:390\n70#3:387\n70#3:389\n70#3:391\n357#4,2:392\n359#4,2:405\n362#4,2:412\n460#5,11:394\n153#6,5:407\n26#7:414\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n100#1:386\n107#1:388\n118#1:390\n100#1:387\n107#1:389\n118#1:391\n120#1:392,2\n120#1:405,2\n120#1:412,2\n120#1:394,11\n121#1:407,5\n150#1:414\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* renamed from: c */
        public int f28407c;

        /* renamed from: d */
        public int f28408d;

        /* renamed from: e */
        public IdentityArrayMap f28409e;

        /* renamed from: f */
        public Object f28410f = f28406h;

        /* renamed from: g */
        public int f28411g;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* renamed from: h */
        public static final Object f28406h = new Object();

        @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m29142d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Object getUnset() {
                return ResultRecord.f28406h;
            }

            public Companion() {
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ResultRecord resultRecord = (ResultRecord) value;
            this.f28409e = resultRecord.f28409e;
            this.f28410f = resultRecord.f28410f;
            this.f28411g = resultRecord.f28411g;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.f28410f;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        @NotNull
        public Object[] getDependencies() {
            Object[] keys;
            IdentityArrayMap identityArrayMap = this.f28409e;
            if (identityArrayMap == null || (keys = identityArrayMap.getKeys()) == null) {
                return new Object[0];
            }
            return keys;
        }

        @Nullable
        public final Object getResult() {
            return this.f28410f;
        }

        public final int getResultHash() {
            return this.f28411g;
        }

        public final int getValidSnapshotId() {
            return this.f28407c;
        }

        public final int getValidSnapshotWriteCount() {
            return this.f28408d;
        }

        @Nullable
        public final IdentityArrayMap<StateObject, Integer> get_dependencies() {
            return this.f28409e;
        }

        public final boolean isValid(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                z = true;
                if (this.f28407c == snapshot.getId()) {
                    if (this.f28408d == snapshot.getWriteCount$runtime_release()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.f28410f == f28406h || (z2 && this.f28411g != readableHash(derivedState, snapshot))) {
                z = false;
            }
            if (z && z2) {
                synchronized (SnapshotKt.getLock()) {
                    this.f28407c = snapshot.getId();
                    this.f28408d = snapshot.getWriteCount$runtime_release();
                    Unit unit = Unit.INSTANCE;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:13:0x0030, B:15:0x0037, B:25:0x0076, B:18:0x0053, B:20:0x0057, B:24:0x0068, B:23:0x0060, B:26:0x0078), top: B:46:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int readableHash(@org.jetbrains.annotations.NotNull androidx.compose.runtime.DerivedState<?> r10, @org.jetbrains.annotations.NotNull androidx.compose.runtime.snapshots.Snapshot r11) {
            /*
                r9 = this;
                r0 = 1
                java.lang.String r1 = "derivedState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
                java.lang.String r1 = "snapshot"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                java.lang.Object r1 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r1)
                androidx.compose.runtime.collection.IdentityArrayMap r2 = r9.f28409e     // Catch: java.lang.Throwable -> La6
                monitor-exit(r1)
                r1 = 7
                if (r2 == 0) goto La5
                androidx.compose.runtime.collection.MutableVector r3 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers()
                int r4 = r3.getSize()
                r5 = 0
                if (r4 <= 0) goto L30
                java.lang.Object[] r6 = r3.getContent()
                r7 = 0
            L26:
                r8 = r6[r7]
                androidx.compose.runtime.DerivedStateObserver r8 = (androidx.compose.runtime.DerivedStateObserver) r8
                r8.start(r10)
                int r7 = r7 + r0
                if (r7 < r4) goto L26
            L30:
                int r4 = r2.getSize()     // Catch: java.lang.Throwable -> L5e
                r6 = 0
            L35:
                if (r6 >= r4) goto L78
                java.lang.Object[] r7 = r2.getKeys()     // Catch: java.lang.Throwable -> L5e
                r7 = r7[r6]     // Catch: java.lang.Throwable -> L5e
                java.lang.String r8 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)     // Catch: java.lang.Throwable -> L5e
                java.lang.Object[] r8 = r2.getValues()     // Catch: java.lang.Throwable -> L5e
                r8 = r8[r6]     // Catch: java.lang.Throwable -> L5e
                java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L5e
                int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L5e
                androidx.compose.runtime.snapshots.StateObject r7 = (androidx.compose.runtime.snapshots.StateObject) r7     // Catch: java.lang.Throwable -> L5e
                if (r8 == r0) goto L53
                goto L76
            L53:
                boolean r8 = r7 instanceof androidx.compose.runtime.DerivedSnapshotState     // Catch: java.lang.Throwable -> L5e
                if (r8 == 0) goto L60
                androidx.compose.runtime.DerivedSnapshotState r7 = (androidx.compose.runtime.DerivedSnapshotState) r7     // Catch: java.lang.Throwable -> L5e
                androidx.compose.runtime.snapshots.StateRecord r7 = r7.m60225a(r11)     // Catch: java.lang.Throwable -> L5e
                goto L68
            L5e:
                r11 = move-exception
                goto L8f
            L60:
                androidx.compose.runtime.snapshots.StateRecord r7 = r7.getFirstStateRecord()     // Catch: java.lang.Throwable -> L5e
                androidx.compose.runtime.snapshots.StateRecord r7 = androidx.compose.runtime.snapshots.SnapshotKt.current(r7, r11)     // Catch: java.lang.Throwable -> L5e
            L68:
                int r1 = r1 * 31
                int r8 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r7)     // Catch: java.lang.Throwable -> L5e
                int r1 = r1 + r8
                int r1 = r1 * 31
                int r7 = r7.getSnapshotId$runtime_release()     // Catch: java.lang.Throwable -> L5e
                int r1 = r1 + r7
            L76:
                int r6 = r6 + r0
                goto L35
            L78:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
                int r11 = r3.getSize()
                if (r11 <= 0) goto La5
                java.lang.Object[] r2 = r3.getContent()
            L84:
                r3 = r2[r5]
                androidx.compose.runtime.DerivedStateObserver r3 = (androidx.compose.runtime.DerivedStateObserver) r3
                r3.done(r10)
                int r5 = r5 + r0
                if (r5 < r11) goto L84
                goto La5
            L8f:
                int r1 = r3.getSize()
                if (r1 <= 0) goto La4
                java.lang.Object[] r2 = r3.getContent()
            L99:
                r3 = r2[r5]
                androidx.compose.runtime.DerivedStateObserver r3 = (androidx.compose.runtime.DerivedStateObserver) r3
                r3.done(r10)
                int r5 = r5 + r0
                if (r5 >= r1) goto La4
                goto L99
            La4:
                throw r11
            La5:
                return r1
            La6:
                r10 = move-exception
                monitor-exit(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.readableHash(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):int");
        }

        public final void setResult(@Nullable Object obj) {
            this.f28410f = obj;
        }

        public final void setResultHash(int i) {
            this.f28411g = i;
        }

        public final void setValidSnapshotId(int i) {
            this.f28407c = i;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.f28408d = i;
        }

        public final void set_dependencies(@Nullable IdentityArrayMap<StateObject, Integer> identityArrayMap) {
            this.f28409e = identityArrayMap;
        }
    }

    public DerivedSnapshotState(Function0 calculation, SnapshotMutationPolicy snapshotMutationPolicy) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f28403a = calculation;
        this.f28404b = snapshotMutationPolicy;
        this.f28405c = new ResultRecord();
    }

    /* renamed from: a */
    public final StateRecord m60225a(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return m60224b((ResultRecord) SnapshotKt.current(this.f28405c, snapshot), snapshot, false, this.f28403a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:10:0x0023, B:12:0x0033, B:17:0x003d, B:19:0x0044, B:21:0x006f, B:22:0x0072, B:23:0x0074), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:10:0x0023, B:12:0x0033, B:17:0x003d, B:19:0x0044, B:21:0x006f, B:22:0x0072, B:23:0x0074), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.DerivedSnapshotState.ResultRecord m60224b(androidx.compose.runtime.DerivedSnapshotState.ResultRecord r10, androidx.compose.runtime.snapshots.Snapshot r11, boolean r12, kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.m60224b(androidx.compose.runtime.DerivedSnapshotState$ResultRecord, androidx.compose.runtime.snapshots.Snapshot, boolean, kotlin.jvm.functions.Function0):androidx.compose.runtime.DerivedSnapshotState$ResultRecord");
    }

    /* renamed from: c */
    public final String m60223c() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.f28405c);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record getCurrentRecord() {
        return m60224b((ResultRecord) SnapshotKt.current(this.f28405c), Snapshot.Companion.getCurrent(), false, this.f28403a);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.f28405c;
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy getPolicy() {
        return this.f28404b;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        Function1<Object, Unit> readObserver$runtime_release = companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return m60224b((ResultRecord) SnapshotKt.current(this.f28405c), companion.getCurrent(), true, this.f28403a).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return VM1.m66004a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f28405c = (ResultRecord) value;
    }

    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.f28405c);
        return "DerivedState(value=" + m60223c() + ")@" + hashCode();
    }
}