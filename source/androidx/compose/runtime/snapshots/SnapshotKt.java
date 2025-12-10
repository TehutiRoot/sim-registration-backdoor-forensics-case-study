package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000²\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a@\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010!\u001a\u00020\n2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)\u001a<\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.\u001a'\u00100\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u0002022\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105\u001a3\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u0002022\u0006\u00106\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a+\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\n¢\u0006\u0004\b;\u0010=\u001a\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0019\u00106\u001a\u0004\u0018\u0001022\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b6\u0010A\u001a\u0017\u0010B\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\u0007H\u0002¢\u0006\u0004\bD\u0010)\u001a\u0017\u0010E\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\nH\u0001¢\u0006\u0004\bG\u0010=\u001a5\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\n2\u0006\u0010H\u001a\u00028\u0000H\u0000¢\u0006\u0004\bI\u0010J\u001a-\u0010K\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\bK\u0010=\u001a-\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010=\u001a%\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000202*\u00028\u00002\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\bM\u0010<\u001a\u001f\u0010N\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\bN\u0010O\u001aP\u0010R\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000202\"\u0004\b\u0001\u0010P*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\n2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bQH\u0086\bø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001aH\u0010R\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000202\"\u0004\b\u0001\u0010P*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bQH\u0086\bø\u0001\u0000¢\u0006\u0004\bR\u0010T\u001aP\u0010U\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000202\"\u0004\b\u0001\u0010P*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010H\u001a\u00028\u00002\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bQH\u0080\bø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a5\u0010[\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u00010Z2\u0006\u0010\u000b\u001a\u00020W2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0002H\u0002¢\u0006\u0004\b[\u0010\\\u001a\u000f\u0010]\u001a\u00020>H\u0002¢\u0006\u0004\b]\u0010@\u001a)\u0010^\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u0002022\u0006\u00106\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\nH\u0001¢\u0006\u0004\b^\u0010_\u001a!\u0010^\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u0002022\u0006\u00106\u001a\u00028\u0000H\u0001¢\u0006\u0004\b^\u0010`\u001aJ\u0010a\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000202\"\u0004\b\u0001\u0010P*\u00028\u00002!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\ba\u0010b\u001a#\u0010e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0000H\u0000¢\u0006\u0004\be\u0010f\"/\u0010h\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010g\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\n0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010j\" \u0010p\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bD\u0010l\u0012\u0004\bo\u0010)\u001a\u0004\bm\u0010n\"\u0016\u0010r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010q\"\u0016\u0010u\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010t\"\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010w\"\u001a\u0010|\u001a\b\u0012\u0004\u0012\u0002090y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{\"4\u0010\u0081\u0001\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u007f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070~0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0080\u0001\"(\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010\u0080\u0001\">\u0010\u0088\u0001\u001a*\u0012\u000f\u0012\r \u0085\u0001*\u0005\u0018\u00010\u0084\u00010\u0084\u00010\u0083\u0001j\u0014\u0012\u000f\u0012\r \u0085\u0001*\u0005\u0018\u00010\u0084\u00010\u0084\u0001`\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0087\u0001\"$\u0010\u008c\u0001\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\bB\u0010\u0089\u0001\u0012\u0005\b\u008b\u0001\u0010)\u001a\u0005\b\u008a\u0001\u0010\f\"\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010\u008e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0090\u0001"}, m28850d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "d", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", OperatorName.FILL_NON_ZERO, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", OperatorName.CLOSE_PATH, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Lkotlin/Function0;", "block", "sync", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previousGlobalSnapshot", "Lkotlin/ParameterName;", "name", "p", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", OperatorName.SAVE, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "u", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "candidateSnapshot", OperatorName.CLOSE_AND_STROKE, "(IILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.ENDPATH, "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", RemoteConfigConstants.ResponseFieldKey.STATE, "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", OperatorName.MOVE_TO, "()Ljava/lang/Void;", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", OperatorName.NON_STROKING_CMYK, "(Landroidx/compose/runtime/snapshots/StateObject;)Z", OperatorName.CURVE_TO, OperatorName.LINE_TO, "(Landroidx/compose/runtime/snapshots/StateObject;)V", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "i", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "R", "Lkotlin/ExtensionFunctionType;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "o", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "from", "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;II)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/jvm/functions/Function1;", "emptyLambda", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "lock", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "e", "I", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "", "Lkotlin/Function2;", "", "Ljava/util/List;", "applyObservers", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "Landroidx/compose/runtime/AtomicInt;", "Landroidx/compose/runtime/AtomicInt;", "pendingApplyObserverCount", "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2290:1\n1722#1:2291\n1722#1:2294\n1722#1:2296\n1722#1:2298\n1722#1:2306\n1722#1:2315\n2029#1,9:2317\n1722#1:2354\n1722#1:2356\n1722#1:2358\n1722#1:2361\n1722#1:2363\n1722#1:2372\n70#2:2292\n70#2:2293\n70#2:2295\n70#2:2297\n70#2:2299\n70#2:2307\n70#2:2316\n70#2:2355\n70#2:2357\n70#2:2359\n70#2:2362\n70#2:2364\n70#2:2373\n33#3,6:2300\n108#4,7:2308\n108#4,7:2365\n125#5,28:2326\n1#6:2360\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n611#1:2291\n1782#1:2294\n1808#1:2296\n1822#1:2298\n1831#1:2306\n1901#1:2315\n2011#1:2317,9\n2084#1:2354\n2093#1:2356\n2161#1:2358\n2173#1:2361\n2201#1:2363\n2266#1:2372\n611#1:2292\n1722#1:2293\n1782#1:2295\n1808#1:2297\n1822#1:2299\n1831#1:2307\n1901#1:2316\n2084#1:2355\n2093#1:2357\n2161#1:2359\n2173#1:2362\n2201#1:2364\n2266#1:2373\n1823#1:2300,6\n1833#1:2308,7\n2224#1:2365,7\n2041#1:2326,28\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotKt {

    /* renamed from: a */
    public static final Function1 f28740a = SnapshotKt$emptyLambda$1.INSTANCE;

    /* renamed from: b */
    public static final SnapshotThreadLocal f28741b = new SnapshotThreadLocal();

    /* renamed from: c */
    public static final Object f28742c = new Object();

    /* renamed from: d */
    public static SnapshotIdSet f28743d;

    /* renamed from: e */
    public static int f28744e;

    /* renamed from: f */
    public static final SnapshotDoubleIndexHeap f28745f;

    /* renamed from: g */
    public static final SnapshotWeakSet f28746g;

    /* renamed from: h */
    public static final List f28747h;

    /* renamed from: i */
    public static final List f28748i;

    /* renamed from: j */
    public static final AtomicReference f28749j;

    /* renamed from: k */
    public static final Snapshot f28750k;

    /* renamed from: l */
    public static AtomicInt f28751l;

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        f28743d = companion.getEMPTY();
        f28744e = 1;
        f28745f = new SnapshotDoubleIndexHeap();
        f28746g = new SnapshotWeakSet();
        f28747h = new ArrayList();
        f28748i = new ArrayList();
        int i = f28744e;
        f28744e = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, companion.getEMPTY());
        f28743d = f28743d.set(globalSnapshot.getId());
        AtomicReference atomicReference = new AtomicReference(globalSnapshot);
        f28749j = atomicReference;
        Object obj = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
        f28750k = (Snapshot) obj;
        f28751l = new AtomicInt(0);
    }

    /* renamed from: a */
    public static final Object m59920a(Function1 function1) {
        Object obj;
        IdentityArraySet<StateObject> modified$runtime_release;
        Object m59905p;
        List mutableList;
        Snapshot snapshot = f28750k;
        Intrinsics.checkNotNull(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot = (GlobalSnapshot) snapshot;
        synchronized (getLock()) {
            try {
                obj = f28749j.get();
                Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
                modified$runtime_release = ((GlobalSnapshot) obj).getModified$runtime_release();
                if (modified$runtime_release != null) {
                    f28751l.add(1);
                }
                m59905p = m59905p((Snapshot) obj, function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (modified$runtime_release != null) {
            try {
                synchronized (getLock()) {
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) f28747h);
                }
                int size = mutableList.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) mutableList.get(i)).invoke(modified$runtime_release, obj);
                }
            } finally {
                f28751l.add(-1);
            }
        }
        synchronized (getLock()) {
            try {
                m59918c();
                if (modified$runtime_release != null) {
                    Object[] values = modified$runtime_release.getValues();
                    int size2 = modified$runtime_release.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj2 = values[i2];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        m59909l((StateObject) obj2);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return m59905p;
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.set(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* renamed from: b */
    public static final void m59919b() {
        m59920a(SnapshotKt$advanceGlobalSnapshot$3.INSTANCE);
    }

    /* renamed from: c */
    public static final void m59918c() {
        SnapshotWeakSet snapshotWeakSet = f28746g;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i >= size$runtime_release) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.getValues$runtime_release()[i];
            if (weakReference != null) {
                obj = weakReference.get();
            }
            if (obj != null && !(!m59910k((StateObject) obj))) {
                if (i2 != i) {
                    snapshotWeakSet.getValues$runtime_release()[i2] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i2] = snapshotWeakSet.getHashes$runtime_release()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime_release; i3++) {
            snapshotWeakSet.getValues$runtime_release()[i3] = null;
            snapshotWeakSet.getHashes$runtime_release()[i3] = 0;
        }
        if (i2 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i2);
        }
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t = (T) m59907n(r, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t != null) {
            return t;
        }
        m59908m();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = (Snapshot) f28741b.get();
        if (snapshot == null) {
            Object obj = f28749j.get();
            Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
            return (Snapshot) obj;
        }
        return snapshot;
    }

    /* renamed from: d */
    public static final Snapshot m59917d(Snapshot snapshot, Function1 function1, boolean z) {
        MutableSnapshot mutableSnapshot;
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (!z2 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, function1, false, z);
        }
        if (z2) {
            mutableSnapshot = (MutableSnapshot) snapshot;
        } else {
            mutableSnapshot = null;
        }
        return new TransparentObserverMutableSnapshot(mutableSnapshot, function1, null, false, z);
    }

    /* renamed from: e */
    public static /* synthetic */ Snapshot m59916e(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m59917d(snapshot, function1, z);
    }

    /* renamed from: f */
    public static final Function1 m59915f(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !Intrinsics.areEqual(function1, function12)) {
            return new SnapshotKt$mergedReadObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* renamed from: g */
    public static /* synthetic */ Function1 m59914g(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m59915f(function1, function12, z);
    }

    @NotNull
    public static final Object getLock() {
        return f28742c;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return f28750k;
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* renamed from: h */
    public static final Function1 m59913h(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && !Intrinsics.areEqual(function1, function12)) {
            return new SnapshotKt$mergedWriteObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* renamed from: i */
    public static final StateRecord m59912i(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord newOverwritableRecordLocked = newOverwritableRecordLocked(stateRecord, stateObject);
        newOverwritableRecordLocked.assign(stateRecord);
        newOverwritableRecordLocked.setSnapshotId$runtime_release(snapshot.getId());
        return newOverwritableRecordLocked;
    }

    /* renamed from: j */
    public static final Map m59911j(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord m59907n;
        IdentityArraySet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id2 = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet m59922or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).m59922or(mutableSnapshot2.getPreviousIds$runtime_release());
        Object[] values = modified$runtime_release.getValues();
        int size = modified$runtime_release.size();
        HashMap hashMap = null;
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            StateObject stateObject = (StateObject) obj;
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord m59907n2 = m59907n(firstStateRecord, id2, snapshotIdSet);
            if (m59907n2 != null && (m59907n = m59907n(firstStateRecord, id2, m59922or)) != null && !Intrinsics.areEqual(m59907n2, m59907n)) {
                StateRecord m59907n3 = m59907n(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (m59907n3 != null) {
                    StateRecord mergeRecords = stateObject.mergeRecords(m59907n, m59907n2, m59907n3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(m59907n2, mergeRecords);
                    hashMap = hashMap;
                } else {
                    m59908m();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    public static final boolean m59910k(StateObject stateObject) {
        StateRecord stateRecord;
        int lowestOrDefault = f28745f.lowestOrDefault(f28744e);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release < lowestOrDefault) {
                    if (stateRecord2 == null) {
                        i++;
                        stateRecord2 = firstStateRecord;
                    } else {
                        if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                            stateRecord = stateRecord2;
                            stateRecord2 = firstStateRecord;
                        } else {
                            stateRecord = firstStateRecord;
                        }
                        if (stateRecord3 == null) {
                            stateRecord3 = stateObject.getFirstStateRecord();
                            StateRecord stateRecord4 = stateRecord3;
                            while (true) {
                                if (stateRecord3 != null) {
                                    if (stateRecord3.getSnapshotId$runtime_release() >= lowestOrDefault) {
                                        break;
                                    }
                                    if (stateRecord4.getSnapshotId$runtime_release() < stateRecord3.getSnapshotId$runtime_release()) {
                                        stateRecord4 = stateRecord3;
                                    }
                                    stateRecord3 = stateRecord3.getNext$runtime_release();
                                } else {
                                    stateRecord3 = stateRecord4;
                                    break;
                                }
                            }
                        }
                        stateRecord2.setSnapshotId$runtime_release(0);
                        stateRecord2.assign(stateRecord3);
                        stateRecord2 = stateRecord;
                    }
                } else {
                    i++;
                }
            }
        }
        if (i <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final void m59909l(StateObject stateObject) {
        if (m59910k(stateObject)) {
            f28746g.add(stateObject);
        }
    }

    /* renamed from: m */
    public static final Void m59908m() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: n */
    public static final StateRecord m59907n(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            if (m59901t(stateRecord, i, snapshotIdSet) && (stateRecord2 == null || stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release())) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        if (stateRecord2 == null) {
            return null;
        }
        return stateRecord2;
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        T t2 = (T) m59903r(state);
        if (t2 != null) {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(state.getFirstStateRecord());
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        state.prependStateRecord(t3);
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        synchronized (getLock()) {
            t2 = (T) m59912i(t, state, snapshot);
        }
        return t2;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(state);
        }
    }

    /* renamed from: o */
    public static final Void m59906o() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t, @NotNull StateObject state, @NotNull T candidate, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(overwritableRecord(t, state, current, candidate));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, state);
        return invoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull T candidate) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(state);
        }
        int id2 = snapshot.getId();
        if (candidate.getSnapshotId$runtime_release() == id2) {
            return candidate;
        }
        synchronized (getLock()) {
            t2 = (T) newOverwritableRecordLocked(t, state);
        }
        t2.setSnapshotId$runtime_release(id2);
        snapshot.recordModified$runtime_release(state);
        return t2;
    }

    /* renamed from: p */
    public static final Object m59905p(Snapshot snapshot, Function1 function1) {
        Object invoke = function1.invoke(f28743d.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = f28744e;
            f28744e = i + 1;
            f28743d = f28743d.clear(snapshot.getId());
            f28749j.set(new GlobalSnapshot(i, f28743d));
            snapshot.dispose();
            f28743d = f28743d.set(i);
            Unit unit = Unit.INSTANCE;
        }
        return invoke;
    }

    /* renamed from: q */
    public static final Snapshot m59904q(Function1 function1) {
        return (Snapshot) m59920a(new SnapshotKt$takeNewSnapshot$1(function1));
    }

    /* renamed from: r */
    public static final StateRecord m59903r(StateObject stateObject) {
        int lowestOrDefault = f28745f.lowestOrDefault(f28744e) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (m59901t(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord == null) {
                    stateRecord = firstStateRecord;
                } else if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                    return stateRecord;
                } else {
                    return firstStateRecord;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject state) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t3 = (T) m59907n(t, current.getId(), current.getInvalid$runtime_release());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current2 = companion.getCurrent();
                StateRecord firstStateRecord = state.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                t2 = (T) m59907n(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
                if (t2 == null) {
                    m59908m();
                    throw new KotlinNothingValueException();
                }
            }
            return t2;
        }
        return t3;
    }

    public static final void releasePinningLocked(int i) {
        f28745f.remove(i);
    }

    /* renamed from: s */
    public static final boolean m59902s(int i, int i2, SnapshotIdSet snapshotIdSet) {
        if (i2 != 0 && i2 <= i && !snapshotIdSet.get(i2)) {
            return true;
        }
        return false;
    }

    @PublishedApi
    public static final <T> T sync(@NotNull Function0<? extends T> block) {
        T invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }

    /* renamed from: t */
    public static final boolean m59901t(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return m59902s(i, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final int trackPinning(int i, @NotNull SnapshotIdSet invalid) {
        int add;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        int lowest = invalid.lowest(i);
        synchronized (getLock()) {
            add = f28745f.add(lowest);
        }
        return add;
    }

    /* renamed from: u */
    public static final void m59900u(Snapshot snapshot) {
        if (f28743d.get(snapshot.getId())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(current(t));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject state, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(writableRecord(t, state, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, state);
        return invoke;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(state);
        }
        T t2 = (T) m59907n(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            if (t2.getSnapshotId$runtime_release() == snapshot.getId()) {
                return t2;
            }
            T t3 = (T) newWritableRecord(t2, state, snapshot);
            snapshot.recordModified$runtime_release(state);
            return t3;
        }
        m59908m();
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r) {
        T t;
        Intrinsics.checkNotNullParameter(r, "r");
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t2 = (T) m59907n(r, current.getId(), current.getInvalid$runtime_release());
        if (t2 == null) {
            synchronized (getLock()) {
                Snapshot current2 = companion.getCurrent();
                t = (T) m59907n(r, current2.getId(), current2.getInvalid$runtime_release());
            }
            if (t != null) {
                return t;
            }
            m59908m();
            throw new KotlinNothingValueException();
        }
        return t2;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke(writableRecord(t, state, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, state);
        return invoke;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t2 = (T) m59907n(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            return t2;
        }
        m59908m();
        throw new KotlinNothingValueException();
    }
}
