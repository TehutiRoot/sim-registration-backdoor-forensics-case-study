package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b!\b\u0017\u0018\u0000 \u007f2\u00020\u0001:\u0001\u0010BE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ%\u0010\u001b\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010$\u001a\u00020\bH\u0010¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010&\u001a\u00020\bH\u0010¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010(\u001a\u00020\bH\u0010¢\u0006\u0004\b'\u0010\u000eJ5\u00100\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00022\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010/J'\u00106\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0080\bø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH\u0000¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00109\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u00108J\u0017\u0010@\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010D\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u0004H\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0010¢\u0006\u0004\bG\u0010HR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\"\u0010U\u001a\u00020\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u00108R:\u0010^\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010V2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010V8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010f\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010l\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010CR\"\u0010r\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010?R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010QR\"\u0010y\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\u0014\"\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\u0014R\u0014\u0010~\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0080\u0001"}, m28850d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", OperatorName.CURVE_TO, "()V", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", "hasPendingChanges", "()Z", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "T", "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "advance", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", RemoteConfigConstants.ResponseFieldKey.STATE, "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", OperatorName.FILL_NON_ZERO, "getWriteObserver$runtime_release", OperatorName.NON_STROKING_GRAY, "I", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "writeCount", "Landroidx/compose/runtime/collection/IdentityArraySet;", "<set-?>", OperatorName.CLOSE_PATH, "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "modified", "", "i", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousIds", OperatorName.NON_STROKING_CMYK, "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", OperatorName.LINE_TO, OperatorName.MOVE_TO, "Z", "getApplied$runtime_release", "setApplied$runtime_release", "(Z)V", "applied", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", OperatorName.ENDPATH, "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2290:1\n978#1,2:2291\n984#1,3:2295\n987#1,6:2300\n978#1,2:2342\n984#1,3:2346\n987#1,6:2351\n978#1,9:2387\n987#1,6:2398\n1722#2:2293\n1722#2:2298\n1722#2:2306\n1722#2:2320\n1722#2:2344\n1722#2:2349\n1722#2:2376\n1722#2:2385\n1722#2:2396\n1722#2:2404\n1722#2:2406\n70#3:2294\n70#3:2299\n70#3:2307\n70#3:2321\n70#3:2345\n70#3:2350\n70#3:2377\n70#3:2386\n70#3:2397\n70#3:2405\n70#3:2407\n33#4,6:2308\n33#4,6:2314\n33#4,6:2336\n33#4,4:2372\n38#4:2378\n33#4,6:2379\n108#5,7:2322\n108#5,7:2329\n108#5,7:2358\n108#5,7:2365\n192#6:2357\n1#7:2408\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n676#1:2291,2\n676#1:2295,3\n676#1:2300,6\n808#1:2342,2\n808#1:2346,3\n808#1:2351,6\n995#1:2387,9\n995#1:2398,6\n677#1:2293\n676#1:2298\n728#1:2306\n781#1:2320\n809#1:2344\n808#1:2349\n961#1:2376\n986#1:2385\n995#1:2396\n998#1:2404\n1022#1:2406\n677#1:2294\n676#1:2299\n728#1:2307\n781#1:2321\n809#1:2345\n808#1:2350\n961#1:2377\n986#1:2386\n995#1:2397\n998#1:2405\n1022#1:2407\n767#1:2308,6\n773#1:2314,6\n786#1:2336,6\n958#1:2372,4\n958#1:2378\n969#1:2379,6\n784#1:2322,7\n785#1:2329,7\n873#1:2358,7\n908#1:2365,7\n855#1:2357\n*E\n"})
/* loaded from: classes2.dex */
public class MutableSnapshot extends Snapshot {

    /* renamed from: e */
    public final Function1 f28707e;

    /* renamed from: f */
    public final Function1 f28708f;

    /* renamed from: g */
    public int f28709g;

    /* renamed from: h */
    public IdentityArraySet f28710h;

    /* renamed from: i */
    public List f28711i;

    /* renamed from: j */
    public SnapshotIdSet f28712j;

    /* renamed from: k */
    public int[] f28713k;

    /* renamed from: l */
    public int f28714l;

    /* renamed from: m */
    public boolean f28715m;

    /* renamed from: n */
    public static final C3467a f28705n = new C3467a(null);
    public static final int $stable = 8;

    /* renamed from: o */
    public static final int[] f28706o = new int[0];

    /* renamed from: androidx.compose.runtime.snapshots.MutableSnapshot$a */
    /* loaded from: classes2.dex */
    public static final class C3467a {
        public /* synthetic */ C3467a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C3467a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i, @NotNull SnapshotIdSet invalid, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
        super(i, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.f28707e = function1;
        this.f28708f = function12;
        this.f28712j = SnapshotIdSet.Companion.getEMPTY();
        this.f28713k = f28706o;
        this.f28714l = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    /* renamed from: a */
    public final void m59933a() {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            m59931c();
            setModified(null);
            int id2 = getId();
            Object[] values = modified$runtime_release.getValues();
            int size = modified$runtime_release.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (StateRecord firstStateRecord = ((StateObject) obj).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
                    if (firstStateRecord.getSnapshotId$runtime_release() == id2 || CollectionsKt___CollectionsKt.contains(this.f28712j, Integer.valueOf(firstStateRecord.getSnapshotId$runtime_release()))) {
                        firstStateRecord.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    public final <T> T advance$runtime_release(@NotNull Function0<? extends T> block) {
        int i;
        SnapshotIdSet snapshotIdSet;
        Intrinsics.checkNotNullParameter(block, "block");
        recordPrevious$runtime_release(getId());
        T invoke = block.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    i = SnapshotKt.f28744e;
                    SnapshotKt.f28744e = i + 1;
                    setId$runtime_release(i);
                    snapshotIdSet = SnapshotKt.f28743d;
                    SnapshotKt.f28743d = snapshotIdSet.set(getId());
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[LOOP:0: B:35:0x00e0->B:36:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[LOOP:1: B:42:0x00fb->B:43:0x00fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    /* renamed from: b */
    public final void m59932b() {
        int length = this.f28713k.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.f28713k[i]);
        }
    }

    /* renamed from: c */
    public final void m59931c() {
        if (!this.f28715m) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.f28743d;
        SnapshotKt.f28743d = snapshotIdSet.clear(getId()).andNot(this.f28712j);
    }

    /* renamed from: d */
    public final void m59930d() {
        if (this.f28715m && this.f28725d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.f28715m;
    }

    @Nullable
    public final List<StateObject> getMerged$runtime_release() {
        return this.f28711i;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return this.f28710h;
    }

    @NotNull
    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.f28712j;
    }

    @NotNull
    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.f28713k;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.f28707e;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.f28709g;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.f28708f;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null || !modified$runtime_release.isNotEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        r15 = androidx.compose.runtime.snapshots.SnapshotKt.m59907n(r12, getId(), r3);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime_release(int r18, @org.jetbrains.annotations.Nullable java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r19, @org.jetbrains.annotations.NotNull androidx.compose.runtime.snapshots.SnapshotIdSet r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApplyLocked$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f28714l++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.f28714l;
        if (i > 0) {
            int i2 = i - 1;
            this.f28714l = i2;
            if (i2 == 0 && !this.f28715m) {
                m59933a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (!this.f28715m && !getDisposed$runtime_release()) {
            advance$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(@NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(state, "state");
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new IdentityArraySet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int i) {
        synchronized (SnapshotKt.getLock()) {
            this.f28712j = this.f28712j.set(i);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.f28712j = this.f28712j.m59922or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i) {
        if (i >= 0) {
            this.f28713k = ArraysKt___ArraysJvmKt.plus(this.f28713k, i);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@NotNull int[] handles) {
        Intrinsics.checkNotNullParameter(handles, "handles");
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.f28713k;
        if (iArr.length != 0) {
            handles = ArraysKt___ArraysJvmKt.plus(iArr, handles);
        }
        this.f28713k = handles;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        m59932b();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z) {
        this.f28715m = z;
    }

    public final void setMerged$runtime_release(@Nullable List<? extends StateObject> list) {
        this.f28711i = list;
    }

    public void setModified(@Nullable IdentityArraySet<StateObject> identityArraySet) {
        this.f28710h = identityArraySet;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.f28712j = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f28713k = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i) {
        this.f28709g = i;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
        int i;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        Function1 m59913h;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        m59930d();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.f28744e;
            SnapshotKt.f28744e = i + 1;
            snapshotIdSet = SnapshotKt.f28743d;
            SnapshotKt.f28743d = snapshotIdSet.set(i);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i);
            Function1 m59914g = SnapshotKt.m59914g(function1, getReadObserver$runtime_release(), false, 4, null);
            m59913h = SnapshotKt.m59913h(function12, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(i, addRange, m59914g, m59913h, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                i2 = SnapshotKt.f28744e;
                SnapshotKt.f28744e = i2 + 1;
                setId$runtime_release(i2);
                snapshotIdSet2 = SnapshotKt.f28743d;
                SnapshotKt.f28743d = snapshotIdSet2.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> function1) {
        int i;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        m59930d();
        int id2 = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.f28744e;
            SnapshotKt.f28744e = i + 1;
            snapshotIdSet = SnapshotKt.f28743d;
            SnapshotKt.f28743d = snapshotIdSet.set(i);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i, SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, i), function1, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id3 = getId();
            synchronized (SnapshotKt.getLock()) {
                i2 = SnapshotKt.f28744e;
                SnapshotKt.f28744e = i2 + 1;
                setId$runtime_release(i2);
                snapshotIdSet2 = SnapshotKt.f28743d;
                SnapshotKt.f28743d = snapshotIdSet2.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id3 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        int i;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return;
        }
        int id2 = getId();
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.f28744e;
            SnapshotKt.f28744e = i + 1;
            setId$runtime_release(i);
            snapshotIdSet = SnapshotKt.f28743d;
            SnapshotKt.f28743d = snapshotIdSet.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
    }
}
