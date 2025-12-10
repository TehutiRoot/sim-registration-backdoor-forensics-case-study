package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 Ï\u00012\u00020\u0001:\u0007Ï\u0001x\\BÐ\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0010J\u001d\u0010#\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b'\u0010%J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b)\u0010%J\u0017\u0010/\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00104\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b5\u00103J\u001f\u0010;\u001a\u00020\t2\u0006\u00101\u001a\u0002002\u0006\u00108\u001a\u000207H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b<\u0010%J\u0019\u0010@\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010AH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ1\u0010P\u001a\u00020\t2\n\u0010M\u001a\u00060Kj\u0002`L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010O\u001a\u00020DH\u0002¢\u0006\u0004\bP\u0010QJ\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u0010J#\u0010Z\u001a\u00020\t2\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0082@ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\\\u0010\u000bJQ\u0010e\u001a\u00020\t2<\u0010d\u001a8\b\u0001\u0012\u0004\u0012\u00020^\u0012\u0013\u0012\u00110V¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b(W\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0a\u0012\u0006\u0012\u0004\u0018\u00010b0]¢\u0006\u0002\bcH\u0082@ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bg\u0010%J)\u0010j\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010hH\u0002¢\u0006\u0004\bj\u0010kJ3\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130l2\f\u0010m\u001a\b\u0012\u0004\u0012\u0002000l2\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010hH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\tH\u0002¢\u0006\u0004\bp\u0010\u0010J#\u0010r\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\t0q2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\br\u0010sJ3\u0010t\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\t0q2\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010hH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020\t2\u0006\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\bx\u0010yR$\u0010\u007f\u001a\u00020z2\u0006\u0010{\u001a\u00020z8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010|\u001a\u0004\b}\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010\u0083\u0001R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u0088\u0001R\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020b0h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008c\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008c\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002000\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008c\u0001R3\u0010\u009a\u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010b0\u0098\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u008a\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0099\u0001R$\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002070\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0099\u0001R!\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u008c\u0001R \u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u009e\u0001R \u0010¡\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\br\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\be\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010¦\u0001R\u001e\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u00ad\u0001R\u0017\u0010±\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010°\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bU\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001b\u0010·\u0001\u001a\u00070µ\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010¶\u0001R\u0016\u0010\f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010´\u0001R&\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010¹\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¼\u0001\u0010\u0010\u001a\u0006\bº\u0001\u0010»\u0001R\u001c\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0013\u0010Ã\u0001\u001a\u00020D8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010FR\u0018\u0010Æ\u0001\u001a\u00030¢\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010È\u0001\u001a\u00020D8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010FR\u0016\u0010É\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010FR\u0015\u0010Ê\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010FR\u0016\u0010Ë\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010FR\u0016\u0010Ì\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010FR\u0016\u0010Í\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010FR\u0016\u0010Î\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ñ\u0001"}, m28850d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", Action.SCOPE_ATTRIBUTE, "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "Lkotlinx/coroutines/CancellableContinuation;", OperatorName.CURVE_TO, "()Lkotlinx/coroutines/CancellableContinuation;", "", OperatorName.CLOSE_AND_STROKE, "()Z", "Lkotlinx/coroutines/Job;", "callingJob", "t", "(Lkotlinx/coroutines/Job;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failedInitialComposition", "recoverable", "o", "(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V", "Landroidx/compose/runtime/Recomposer$b;", "u", "()Landroidx/compose/runtime/Recomposer$b;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Lqo1;", "frameSignal", OperatorName.SET_LINE_WIDTH, "(Landroidx/compose/runtime/MonotonicFrameClock;Lqo1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/runtime/collection/IdentityArraySet;", "modifiedValues", OperatorName.ENDPATH, "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;", "", "references", OperatorName.MOVE_TO, "(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;", "d", "Lkotlin/Function1;", OperatorName.SAVE, "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "x", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "", "<set-?>", OperatorName.SET_LINE_CAPSTYLE, "getChangeCount", "()J", "changeCount", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Ljava/lang/Object;", "stateLock", "Lkotlinx/coroutines/Job;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "knownCompositions", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/collection/IdentityArraySet;", "snapshotInvalidations", OperatorName.CLOSE_PATH, "compositionInvalidations", "i", "compositionsAwaitingApply", OperatorName.SET_LINE_JOINSTYLE, "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/MovableContent;", "Ljava/util/Map;", "compositionValuesRemoved", OperatorName.LINE_TO, "compositionValueStatesAvailable", "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "Lkotlinx/coroutines/CancellableContinuation;", "workContinuation", "", "p", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Landroidx/compose/runtime/Recomposer$b;", "errorState", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "effectJob", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer$c;", "recomposerInfo", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/Flow;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getState$annotations", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "hasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaiters", "shouldKeepRecomposing", "hasSchedulingWork", "hasFrameWorkLocked", "hasConcurrentFrameWorkLocked", "Companion", "State", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1502:1\n1162#1,5:1550\n1168#1:1560\n1162#1,5:1573\n1168#1:1583\n1162#1,5:1604\n1168#1:1625\n70#2:1503\n70#2:1504\n70#2:1507\n70#2:1509\n70#2:1516\n70#2:1517\n70#2:1530\n70#2:1531\n70#2:1532\n70#2:1533\n70#2:1534\n70#2:1535\n70#2:1545\n70#2:1548\n70#2:1549\n70#2:1561\n70#2:1562\n70#2:1612\n70#2:1626\n70#2:1649\n70#2:1650\n70#2:1651\n70#2:1652\n70#2:1653\n70#2:1654\n70#2:1655\n70#2:1656\n70#2:1657\n70#2:1658\n70#2:1659\n70#2:1660\n1229#3,2:1505\n1#4:1508\n33#5,6:1510\n33#5,6:1518\n33#5,6:1524\n93#5,2:1563\n33#5,4:1565\n95#5,2:1569\n38#5:1571\n97#5:1572\n120#5,3:1584\n33#5,4:1587\n123#5,2:1591\n125#5,2:1600\n38#5:1602\n127#5:1603\n82#5,3:1613\n33#5,4:1616\n85#5,2:1620\n38#5:1622\n87#5:1623\n82#5,3:1627\n33#5,4:1630\n85#5,2:1634\n38#5:1636\n87#5:1637\n33#5,6:1638\n314#6,9:1536\n323#6,2:1546\n129#7,5:1555\n129#7,5:1578\n129#7,3:1609\n133#7:1624\n129#7,5:1644\n361#8,7:1593\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1012#1:1550,5\n1012#1:1560\n1089#1:1573,5\n1089#1:1583\n1109#1:1604,5\n1109#1:1625\n282#1:1503\n332#1:1504\n426#1:1507\n430#1:1509\n451#1:1516\n456#1:1517\n482#1:1530\n689#1:1531\n725#1:1532\n737#1:1533\n754#1:1534\n890#1:1535\n902#1:1545\n977#1:1548\n993#1:1549\n1025#1:1561\n1056#1:1562\n1112#1:1612\n1125#1:1626\n1192#1:1649\n1229#1:1650\n1244#1:1651\n1270#1:1652\n1278#1:1653\n1287#1:1654\n1294#1:1655\n1301#1:1656\n1310#1:1657\n1316#1:1658\n1328#1:1659\n1062#1:1660\n333#1:1505,2\n436#1:1510,6\n469#1:1518,6\n474#1:1524,6\n1057#1:1563,2\n1057#1:1565,4\n1057#1:1569,2\n1057#1:1571\n1057#1:1572\n1106#1:1584,3\n1106#1:1587,4\n1106#1:1591,2\n1106#1:1600,2\n1106#1:1602\n1106#1:1603\n1113#1:1613,3\n1113#1:1616,4\n1113#1:1620,2\n1113#1:1622\n1113#1:1623\n1129#1:1627,3\n1129#1:1630,4\n1129#1:1634,2\n1129#1:1636\n1129#1:1637\n1136#1:1638,6\n901#1:1536,9\n901#1:1546,2\n1012#1:1555,5\n1089#1:1578,5\n1109#1:1609,3\n1109#1:1624\n1166#1:1644,5\n1106#1:1593,7\n*E\n"})
/* loaded from: classes2.dex */
public final class Recomposer extends CompositionContext {

    /* renamed from: a */
    public long f28386a;

    /* renamed from: b */
    public final BroadcastFrameClock f28387b;

    /* renamed from: c */
    public final Object f28388c;

    /* renamed from: d */
    public Job f28389d;

    /* renamed from: e */
    public Throwable f28390e;

    /* renamed from: f */
    public final List f28391f;

    /* renamed from: g */
    public IdentityArraySet f28392g;

    /* renamed from: h */
    public final List f28393h;

    /* renamed from: i */
    public final List f28394i;

    /* renamed from: j */
    public final List f28395j;

    /* renamed from: k */
    public final Map f28396k;

    /* renamed from: l */
    public final Map f28397l;

    /* renamed from: m */
    public List f28398m;

    /* renamed from: n */
    public Set f28399n;

    /* renamed from: o */
    public CancellableContinuation f28400o;

    /* renamed from: p */
    public int f28401p;

    /* renamed from: q */
    public boolean f28402q;

    /* renamed from: r */
    public C3445b f28403r;

    /* renamed from: s */
    public boolean f28404s;

    /* renamed from: t */
    public final MutableStateFlow f28405t;

    /* renamed from: u */
    public final CompletableJob f28406u;

    /* renamed from: v */
    public final CoroutineContext f28407v;

    /* renamed from: w */
    public final C3446c f28408w;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: x */
    public static final MutableStateFlow f28384x = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());

    /* renamed from: y */
    public static final AtomicReference f28385y = new AtomicReference(Boolean.FALSE);

    @Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0003J\u001b\u0010 \u001a\u00020\u00062\n\u0010\u001f\u001a\u00060\u001dR\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u00062\n\u0010\u001f\u001a\u00060\u001dR\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8F¢\u0006\u0006\u001a\u0004\b&\u0010'R4\u0010,\u001a\"\u0012\f\u0012\n **\u0004\u0018\u00010\u00040\u00040)j\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00040\u0004`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001dR\u00020\u001e0/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m28850d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "", "value", "", "setHotReloadEnabled$runtime_release", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", Action.KEY_ATTRIBUTE, "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "clearErrors", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer;", "info", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Recomposer$c;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1502:1\n1360#2:1503\n1446#2,5:1504\n1855#2,2:1509\n1855#2,2:1523\n1855#2,2:1525\n1603#2,9:1527\n1855#2:1536\n1856#2:1538\n1612#2:1539\n1603#2,9:1540\n1855#2:1549\n1856#2:1551\n1612#2:1552\n33#3,6:1511\n33#3,6:1517\n1#4:1537\n1#4:1550\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1379#1:1503\n1379#1:1504,5\n1387#1:1509,2\n1396#1:1523,2\n1403#1:1525,2\n1417#1:1527,9\n1417#1:1536\n1417#1:1538\n1417#1:1539\n1422#1:1540,9\n1422#1:1549\n1422#1:1551\n1422#1:1552\n1393#1:1511,6\n1394#1:1517,6\n1417#1:1537\n1422#1:1550\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m60221a(C3446c c3446c) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer.f28384x.getValue();
                add = persistentSet.add((PersistentSet) c3446c);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer.f28384x.compareAndSet(persistentSet, add));
        }

        /* renamed from: b */
        public final void m60220b(C3446c c3446c) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer.f28384x.getValue();
                remove = persistentSet.remove((PersistentSet) c3446c);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer.f28384x.compareAndSet(persistentSet, remove));
        }

        public final void clearErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (C3446c c3446c : (Iterable) Recomposer.f28384x.getValue()) {
                C3445b m60214c = c3446c.m60214c();
                if (m60214c != null) {
                    arrayList.add(m60214c);
                }
            }
        }

        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            ArrayList arrayList = new ArrayList();
            for (C3446c c3446c : (Iterable) Recomposer.f28384x.getValue()) {
                RecomposerErrorInfo m60216a = c3446c.m60216a();
                if (m60216a != null) {
                    arrayList.add(m60216a);
                }
            }
            return arrayList;
        }

        @NotNull
        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer.f28384x;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i) {
            Recomposer.f28385y.set(Boolean.TRUE);
            for (C3446c c3446c : (Iterable) Recomposer.f28384x.getValue()) {
                RecomposerErrorInfo m60216a = c3446c.m60216a();
                if (m60216a == null || m60216a.getRecoverable()) {
                    c3446c.m60214c();
                    c3446c.m60215b(i);
                    c3446c.m60213d();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Intrinsics.checkNotNullParameter(token, "token");
            Recomposer.f28385y.set(Boolean.TRUE);
            for (C3446c c3446c : (Iterable) Recomposer.f28384x.getValue()) {
                c3446c.m60214c();
            }
            List list = (List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3444a) list.get(i)).m60217c();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C3444a) list.get(i2)).m60218b();
            }
            for (C3446c c3446c2 : (Iterable) Recomposer.f28384x.getValue()) {
                c3446c2.m60213d();
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer.f28385y.set(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            for (C3446c c3446c : (Iterable) Recomposer.f28384x.getValue()) {
                AbstractC10410hs.addAll(arrayList, c3446c.m60212e());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z) {
            Recomposer.f28385y.set(Boolean.valueOf(z));
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28850d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* renamed from: androidx.compose.runtime.Recomposer$a */
    /* loaded from: classes2.dex */
    public static final class C3444a {

        /* renamed from: a */
        public final CompositionImpl f28409a;

        /* renamed from: b */
        public Function2 f28410b;

        public C3444a(CompositionImpl composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.f28409a = composition;
            this.f28410b = composition.getComposable();
        }

        /* renamed from: a */
        public final void m60219a() {
            if (this.f28409a.isRoot()) {
                this.f28409a.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m71380getLambda1$runtime_release());
            }
        }

        /* renamed from: b */
        public final void m60218b() {
            if (this.f28409a.isRoot()) {
                this.f28409a.setContent(this.f28410b);
            }
        }

        /* renamed from: c */
        public final void m60217c() {
            this.f28409a.setComposable(this.f28410b);
        }
    }

    /* renamed from: androidx.compose.runtime.Recomposer$b */
    /* loaded from: classes2.dex */
    public static final class C3445b implements RecomposerErrorInfo {

        /* renamed from: a */
        public final boolean f28411a;

        /* renamed from: b */
        public final Exception f28412b;

        public C3445b(boolean z, Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f28411a = z;
            this.f28412b = cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Exception getCause() {
            return this.f28412b;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.f28411a;
        }
    }

    /* renamed from: androidx.compose.runtime.Recomposer$c */
    /* loaded from: classes2.dex */
    public final class C3446c implements RecomposerInfo {
        public C3446c() {
        }

        /* renamed from: a */
        public final RecomposerErrorInfo m60216a() {
            C3445b c3445b;
            Object obj = Recomposer.this.f28388c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                c3445b = recomposer.f28403r;
            }
            return c3445b;
        }

        /* renamed from: b */
        public final void m60215b(int i) {
            List mutableList;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.f28388c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) recomposer.f28391f);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i2);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((CompositionImpl) arrayList.get(i3)).invalidateGroupsWithKey(i);
            }
        }

        /* renamed from: c */
        public final C3445b m60214c() {
            return Recomposer.this.m60225u();
        }

        /* renamed from: d */
        public final void m60213d() {
            Recomposer.this.m60224v();
        }

        /* renamed from: e */
        public final List m60212e() {
            List mutableList;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.f28388c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) recomposer.f28391f);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C3444a c3444a = new C3444a((CompositionImpl) arrayList.get(i2));
                c3444a.m60219a();
                arrayList2.add(c3444a);
            }
            return arrayList2;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public Flow getState() {
            return Recomposer.this.getCurrentState();
        }
    }

    public Recomposer(@NotNull CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f28387b = broadcastFrameClock;
        this.f28388c = new Object();
        this.f28391f = new ArrayList();
        this.f28392g = new IdentityArraySet();
        this.f28393h = new ArrayList();
        this.f28394i = new ArrayList();
        this.f28395j = new ArrayList();
        this.f28396k = new LinkedHashMap();
        this.f28397l = new LinkedHashMap();
        this.f28405t = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob Job = JobKt.Job((Job) effectCoroutineContext.get(Job.Key));
        Job.invokeOnCompletion(new Recomposer$effectJob$1$1(this));
        this.f28406u = Job;
        this.f28407v = effectCoroutineContext.plus(broadcastFrameClock).plus(Job);
        this.f28408w = new C3446c();
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    /* renamed from: l */
    public static final void m60234l(List list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.f28388c) {
            try {
                Iterator it = recomposer.f28395j.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                    if (Intrinsics.areEqual(movableContentStateReference.getComposition$runtime_release(), controlledComposition)) {
                        list.add(movableContentStateReference);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m60230p(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.m60231o(exc, controlledComposition, z);
    }

    /* renamed from: a */
    public final void m60245a(MutableSnapshot mutableSnapshot) {
        try {
            if (!(mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            mutableSnapshot.dispose();
        }
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.f28408w;
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation<? super Unit> continuation) {
        Object collect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new Recomposer$awaitIdle$2(null)), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Object m60244b(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (!m60237i()) {
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl2.initCancellability();
            synchronized (this.f28388c) {
                if (!m60237i()) {
                    this.f28400o = cancellableContinuationImpl2;
                    cancellableContinuationImpl = null;
                } else {
                    cancellableContinuationImpl = cancellableContinuationImpl2;
                }
            }
            if (cancellableContinuationImpl != null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final CancellableContinuation m60243c() {
        State state;
        if (((State) this.f28405t.getValue()).compareTo(State.ShuttingDown) <= 0) {
            this.f28391f.clear();
            this.f28392g = new IdentityArraySet();
            this.f28393h.clear();
            this.f28394i.clear();
            this.f28395j.clear();
            this.f28398m = null;
            CancellableContinuation cancellableContinuation = this.f28400o;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.f28400o = null;
            this.f28403r = null;
            return null;
        }
        if (this.f28403r != null) {
            state = State.Inactive;
        } else if (this.f28389d == null) {
            this.f28392g = new IdentityArraySet();
            this.f28393h.clear();
            if (m60240f()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if (!(!this.f28393h.isEmpty()) && !this.f28392g.isNotEmpty() && !(!this.f28394i.isEmpty()) && !(!this.f28395j.isEmpty()) && this.f28401p <= 0 && !m60240f()) {
            state = State.Idle;
        } else {
            state = State.PendingWork;
        }
        this.f28405t.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.f28400o;
        this.f28400o = null;
        return cancellableContinuation2;
    }

    public final void cancel() {
        synchronized (this.f28388c) {
            try {
                if (((State) this.f28405t.getValue()).compareTo(State.Idle) >= 0) {
                    this.f28405t.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.f28406u, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.f28406u.complete()) {
            synchronized (this.f28388c) {
                this.f28402q = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean isComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(m60229q(composition), m60222x(composition, null));
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                composition.composeContent(content);
                Unit unit = Unit.INSTANCE;
                m60245a(takeMutableSnapshot);
                if (!isComposing) {
                    companion.notifyObjectsInitialized();
                }
                synchronized (this.f28388c) {
                    if (((State) this.f28405t.getValue()).compareTo(State.ShuttingDown) > 0 && !this.f28391f.contains(composition)) {
                        this.f28391f.add(composition);
                    }
                }
                try {
                    m60235k(composition);
                    try {
                        composition.applyChanges();
                        composition.applyLateChanges();
                        if (!isComposing) {
                            companion.notifyObjectsInitialized();
                        }
                    } catch (Exception e) {
                        m60230p(this, e, null, false, 6, null);
                    }
                } catch (Exception e2) {
                    m60231o(e2, composition, true);
                }
            } finally {
                takeMutableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Exception e3) {
            m60231o(e3, composition, true);
        }
    }

    /* renamed from: d */
    public final void m60242d() {
        int i;
        List emptyList;
        synchronized (this.f28388c) {
            try {
                if (!this.f28396k.isEmpty()) {
                    List flatten = AbstractC10176es.flatten(this.f28396k.values());
                    this.f28396k.clear();
                    emptyList = new ArrayList(flatten.size());
                    int size = flatten.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) flatten.get(i2);
                        emptyList.add(TuplesKt.m28844to(movableContentStateReference, this.f28397l.get(movableContentStateReference)));
                    }
                    this.f28397l.clear();
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = emptyList.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) emptyList.get(i);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f28388c) {
            RecomposerKt.addMultiValue(this.f28396k, reference.getContent$runtime_release(), reference);
        }
    }

    /* renamed from: e */
    public final boolean m60241e() {
        boolean m60240f;
        synchronized (this.f28388c) {
            m60240f = m60240f();
        }
        return m60240f;
    }

    /* renamed from: f */
    public final boolean m60240f() {
        if (!this.f28404s && this.f28387b.getHasAwaiters()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m60239g() {
        if ((!this.f28394i.isEmpty()) || m60240f()) {
            return true;
        }
        return false;
    }

    public final long getChangeCount() {
        return this.f28386a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final StateFlow<State> getCurrentState() {
        return this.f28405t;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext() {
        return this.f28407v;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.f28388c) {
            z = true;
            if (!this.f28392g.isNotEmpty() && !(!this.f28393h.isEmpty()) && this.f28401p <= 0 && !(!this.f28394i.isEmpty())) {
                if (!m60240f()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final Flow<State> getState() {
        return getCurrentState();
    }

    /* renamed from: h */
    public final boolean m60238h() {
        if ((!this.f28393h.isEmpty()) || m60240f()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m60237i() {
        boolean z;
        synchronized (this.f28388c) {
            z = true;
            if (!this.f28392g.isNotEmpty() && !(!this.f28393h.isEmpty())) {
                if (!m60240f()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        CancellableContinuation m60243c;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f28388c) {
            this.f28395j.add(reference);
            m60243c = m60243c();
        }
        if (m60243c != null) {
            Result.Companion companion = Result.Companion;
            m60243c.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        CancellableContinuation cancellableContinuation;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f28388c) {
            if (!this.f28393h.contains(composition)) {
                this.f28393h.add(composition);
                cancellableContinuation = m60243c();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        CancellableContinuation m60243c;
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.f28388c) {
            this.f28392g.add(scope);
            m60243c = m60243c();
        }
        if (m60243c != null) {
            Result.Companion companion = Result.Companion;
            m60243c.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
    }

    /* renamed from: j */
    public final boolean m60236j() {
        boolean z;
        synchronized (this.f28388c) {
            z = !this.f28402q;
        }
        if (z) {
            return true;
        }
        for (Job job : this.f28406u.getChildren()) {
            if (job.isActive()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        Object first = FlowKt.first(getCurrentState(), new Recomposer$join$2(null), continuation);
        if (first == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return first;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public final void m60235k(ControlledComposition controlledComposition) {
        synchronized (this.f28388c) {
            List list = this.f28395j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(((MovableContentStateReference) list.get(i)).getComposition$runtime_release(), controlledComposition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    m60234l(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        m60233m(arrayList, null);
                        m60234l(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public final List m60233m(List list, IdentityArraySet identityArraySet) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ControlledComposition composition$runtime_release = ((MovableContentStateReference) obj).getComposition$runtime_release();
            Object obj2 = hashMap.get(composition$runtime_release);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(composition$runtime_release, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(m60229q(controlledComposition), m60222x(controlledComposition, identityArraySet));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                synchronized (this.f28388c) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) list2.get(i2);
                        arrayList.add(TuplesKt.m28844to(movableContentStateReference, RecomposerKt.removeLastMultiValue(this.f28396k, movableContentStateReference.getContent$runtime_release())));
                    }
                }
                controlledComposition.insertMovableContent(arrayList);
                Unit unit = Unit.INSTANCE;
                takeMutableSnapshot.restoreCurrent(makeCurrent);
            } finally {
                m60245a(takeMutableSnapshot);
            }
        }
        return CollectionsKt___CollectionsKt.toList(hashMap.keySet());
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f28388c) {
            this.f28397l.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentState;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f28388c) {
            movableContentState = (MovableContentState) this.f28397l.remove(reference);
        }
        return movableContentState;
    }

    /* renamed from: n */
    public final ControlledComposition m60232n(ControlledComposition controlledComposition, IdentityArraySet identityArraySet) {
        Set set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.f28399n) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(m60229q(controlledComposition), m60222x(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (identityArraySet != null && identityArraySet.isNotEmpty()) {
                controlledComposition.prepareCompose(new Recomposer$performRecompose$1$1(identityArraySet, controlledComposition));
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (!recompose) {
                return null;
            }
            return controlledComposition;
        } finally {
            m60245a(takeMutableSnapshot);
        }
    }

    /* renamed from: o */
    public final void m60231o(Exception exc, ControlledComposition controlledComposition, boolean z) {
        Object obj = f28385y.get();
        Intrinsics.checkNotNullExpressionValue(obj, "_hotReloadEnabled.get()");
        if (((Boolean) obj).booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.f28388c) {
                try {
                    ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                    this.f28394i.clear();
                    this.f28393h.clear();
                    this.f28392g = new IdentityArraySet();
                    this.f28395j.clear();
                    this.f28396k.clear();
                    this.f28397l.clear();
                    this.f28403r = new C3445b(z, exc);
                    if (controlledComposition != null) {
                        List list = this.f28398m;
                        if (list == null) {
                            list = new ArrayList();
                            this.f28398m = list;
                        }
                        if (!list.contains(controlledComposition)) {
                            list.add(controlledComposition);
                        }
                        this.f28391f.remove(controlledComposition);
                    }
                    m60243c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw exc;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.f28388c) {
            this.f28404s = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: q */
    public final Function1 m60229q(ControlledComposition controlledComposition) {
        return new Recomposer$readObserverOf$1(controlledComposition);
    }

    /* renamed from: r */
    public final Object m60228r(Function3 function3, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.f28387b, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        if (withContext == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f28388c) {
            try {
                Set set = this.f28399n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f28399n = set;
                }
                set.add(composition);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation cancellableContinuation;
        synchronized (this.f28388c) {
            if (this.f28404s) {
                this.f28404s = false;
                cancellableContinuation = m60243c();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> continuation) {
        Object m60228r = m60228r(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        if (m60228r == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m60228r;
        }
        return Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super Unit> continuation) {
        Object m60228r = m60228r(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), continuation);
        if (m60228r == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m60228r;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public final boolean m60227s() {
        List mutableList;
        boolean m60238h;
        synchronized (this.f28388c) {
            if (this.f28392g.isEmpty()) {
                return m60238h();
            }
            IdentityArraySet identityArraySet = this.f28392g;
            this.f28392g = new IdentityArraySet();
            synchronized (this.f28388c) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f28391f);
            }
            try {
                int size = mutableList.size();
                for (int i = 0; i < size; i++) {
                    ((ControlledComposition) mutableList.get(i)).recordModificationsOf(identityArraySet);
                    if (((State) this.f28405t.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.f28392g = new IdentityArraySet();
                synchronized (this.f28388c) {
                    if (m60243c() == null) {
                        m60238h = m60238h();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                }
                return m60238h;
            } catch (Throwable th2) {
                synchronized (this.f28388c) {
                    this.f28392g.addAll((Collection) identityArraySet);
                    Unit unit = Unit.INSTANCE;
                    throw th2;
                }
            }
        }
    }

    /* renamed from: t */
    public final void m60226t(Job job) {
        synchronized (this.f28388c) {
            Throwable th2 = this.f28390e;
            if (th2 == null) {
                if (((State) this.f28405t.getValue()).compareTo(State.ShuttingDown) > 0) {
                    if (this.f28389d == null) {
                        this.f28389d = job;
                        m60243c();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public final C3445b m60225u() {
        C3445b c3445b;
        synchronized (this.f28388c) {
            c3445b = this.f28403r;
            if (c3445b != null) {
                this.f28403r = null;
                m60243c();
            }
        }
        return c3445b;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f28388c) {
            this.f28391f.remove(composition);
            this.f28393h.remove(composition);
            this.f28394i.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: v */
    public final void m60224v() {
        List list;
        synchronized (this.f28388c) {
            list = this.f28398m;
            this.f28398m = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                ControlledComposition controlledComposition = (ControlledComposition) AbstractC10410hs.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.f28403r != null) {
                        break;
                    }
                }
            } catch (Throwable th2) {
                if (!list.isEmpty()) {
                    synchronized (this.f28388c) {
                        try {
                            List list2 = this.f28398m;
                            if (list2 != null) {
                                list2.addAll(list);
                                list = list2;
                            }
                            this.f28398m = list;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                throw th2;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.f28388c) {
                try {
                    List list3 = this.f28398m;
                    if (list3 != null) {
                        list3.addAll(list);
                        list = list3;
                    }
                    this.f28398m = list;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please submit an issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60223w(androidx.compose.runtime.MonotonicFrameClock r8, p000.C21820qo1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            qo1 r2 = (p000.C21820qo1) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.ResultKt.throwOnFailure(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            qo1 r2 = (p000.C21820qo1) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8d
        L65:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.f28388c
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.m23432c(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>(r6, r9, r8, r2)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.m60223w(androidx.compose.runtime.MonotonicFrameClock, qo1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: x */
    public final Function1 m60222x(ControlledComposition controlledComposition, IdentityArraySet identityArraySet) {
        return new Recomposer$writeObserverOf$1(controlledComposition, identityArraySet);
    }
}
