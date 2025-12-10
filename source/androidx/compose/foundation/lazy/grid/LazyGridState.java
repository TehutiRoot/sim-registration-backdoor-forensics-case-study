package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.layout.RemeasurementModifier;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Á\u00012\u00020\u0001:\u0002Á\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0006JD\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ%\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J!\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020-048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00105R\u001a\u0010<\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010B\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR+\u0010I\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010`\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010FR\"\u0010d\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010T\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR\u0016\u0010f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010^R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010TR$\u0010u\u001a\u0004\u0018\u00010n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010{\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001c\u0010\u0081\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u009c\u0001\u0010\u008e\u0001\u001a6\u0012\u0016\u0012\u00140\u0002¢\u0006\u000f\b\u0083\u0001\u0012\n\b\u0084\u0001\u0012\u0005\b\b(\u0085\u0001\u0012\u0019\u0012\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00010\u0086\u00010\u0082\u00012:\u0010=\u001a6\u0012\u0016\u0012\u00140\u0002¢\u0006\u000f\b\u0083\u0001\u0012\n\b\u0084\u0001\u0012\u0005\b\b(\u0085\u0001\u0012\u0019\u0012\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00010\u0086\u00010\u0082\u00018@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0017\n\u0005\b\u0089\u0001\u00105\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010¤\u0001\u001a\u00030\u009f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R.\u0010§\u0001\u001a\u00020R2\u0006\u0010=\u001a\u00020R8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b¥\u0001\u00105\u001a\u0005\b¦\u0001\u0010V\"\u0004\b>\u0010XR.\u0010ª\u0001\u001a\u00020R2\u0006\u0010=\u001a\u00020R8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b¨\u0001\u00105\u001a\u0005\b©\u0001\u0010V\"\u0004\b8\u0010XR \u0010°\u0001\u001a\u00030«\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010FR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010FR\u0014\u0010µ\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010¹\u0001\u001a\u00030¶\u00018F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R!\u0010¿\u0001\u001a\u00030º\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b»\u0001\u0010¼\u0001*\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010À\u0001\u001a\u00020R8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Â\u0001"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(F)V", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "info", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "<set-?>", "d", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "e", "Landroidx/compose/runtime/MutableIntState;", "getSlotsPerLine$foundation_release", "()I", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", OperatorName.NON_STROKING_GRAY, "Z", "isVertical$foundation_release", "()Z", "setVertical$foundation_release", "(Z)V", "isVertical", OperatorName.CLOSE_PATH, "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "i", "I", "getNumMeasurePasses$foundation_release", "numMeasurePasses", OperatorName.SET_LINE_JOINSTYLE, "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", OperatorName.NON_STROKING_CMYK, "lineToPrefetch", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", OperatorName.LINE_TO, "Landroidx/compose/runtime/collection/MutableVector;", "currentLinePrefetchHandles", OperatorName.MOVE_TO, "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", OperatorName.ENDPATH, "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement$foundation_release", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "o", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "p", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", OperatorName.SAVE, "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "t", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "u", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getCanScrollForward", "canScrollForward", OperatorName.SET_LINE_WIDTH, "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "x", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,468:1\n1182#2:469\n1161#2,2:470\n75#3:472\n108#3,2:473\n81#4:475\n107#4,2:476\n81#4:478\n81#4:479\n107#4,2:480\n81#4:482\n107#4,2:483\n460#5,11:485\n460#5,11:502\n33#6,6:496\n495#7,4:513\n500#7:522\n129#8,5:517\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n194#1:469\n194#1:470,2\n154#1:472\n154#1:473,2\n227#1:475\n227#1:476,2\n240#1:478\n290#1:479\n290#1:480,2\n292#1:482\n292#1:483,2\n361#1:485,11\n388#1:502,11\n366#1:496,6\n436#1:513,4\n436#1:522\n436#1:517,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: y */
    public static final Saver f13574y = ListSaverKt.listSaver(LazyGridState$Companion$Saver$1.INSTANCE, LazyGridState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final LazyGridScrollPosition f13575a;

    /* renamed from: b */
    public final MutableState f13576b;

    /* renamed from: c */
    public final MutableInteractionSource f13577c;

    /* renamed from: d */
    public float f13578d;

    /* renamed from: e */
    public final MutableIntState f13579e;

    /* renamed from: f */
    public Density f13580f;

    /* renamed from: g */
    public boolean f13581g;

    /* renamed from: h */
    public final ScrollableState f13582h;

    /* renamed from: i */
    public int f13583i;

    /* renamed from: j */
    public boolean f13584j;

    /* renamed from: k */
    public int f13585k;

    /* renamed from: l */
    public final MutableVector f13586l;

    /* renamed from: m */
    public boolean f13587m;

    /* renamed from: n */
    public Remeasurement f13588n;

    /* renamed from: o */
    public final RemeasurementModifier f13589o;

    /* renamed from: p */
    public final AwaitFirstLayoutModifier f13590p;

    /* renamed from: q */
    public final MutableState f13591q;

    /* renamed from: r */
    public final LazyGridItemPlacementAnimator f13592r;

    /* renamed from: s */
    public final LazyLayoutBeyondBoundsInfo f13593s;

    /* renamed from: t */
    public final LazyGridAnimateScrollScope f13594t;

    /* renamed from: u */
    public final LazyLayoutPinnedItemList f13595u;

    /* renamed from: v */
    public final MutableState f13596v;

    /* renamed from: w */
    public final MutableState f13597w;

    /* renamed from: x */
    public final LazyLayoutPrefetchState f13598x;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.f13574y;
        }

        public Companion() {
        }
    }

    public LazyGridState() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[LOOP:1: B:35:0x00b6->B:36:0x00b8, LOOP_END] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m61223b(float r9) {
        /*
            r8 = this;
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r0 = r8.f13598x
            boolean r1 = r8.f13584j
            if (r1 != 0) goto L7
            return
        L7:
            androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r1 = r8.getLayoutInfo()
            java.util.List r2 = r1.getVisibleItemsInfo()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto Lde
            r2 = 0
            r4 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L21
            r9 = 1
            goto L22
        L21:
            r9 = 0
        L22:
            if (r9 == 0) goto L4c
            java.util.List r2 = r1.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.last(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            boolean r5 = r8.f13581g
            if (r5 == 0) goto L37
            int r2 = r2.getRow()
            goto L3b
        L37:
            int r2 = r2.getColumn()
        L3b:
            int r2 = r2 + r3
            java.util.List r5 = r1.getVisibleItemsInfo()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.last(r5)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r5 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r5
            int r5 = r5.getIndex()
            int r5 = r5 + r3
            goto L74
        L4c:
            java.util.List r2 = r1.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.first(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            boolean r5 = r8.f13581g
            if (r5 == 0) goto L5f
            int r2 = r2.getRow()
            goto L63
        L5f:
            int r2 = r2.getColumn()
        L63:
            int r2 = r2 + (-1)
            java.util.List r5 = r1.getVisibleItemsInfo()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.first(r5)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r5 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r5
            int r5 = r5.getIndex()
            int r5 = r5 - r3
        L74:
            int r6 = r8.f13585k
            if (r2 == r6) goto Lde
            if (r5 < 0) goto Lde
            int r1 = r1.getTotalItemsCount()
            if (r5 >= r1) goto Lde
            boolean r1 = r8.f13587m
            if (r1 == r9) goto L9b
            androidx.compose.runtime.collection.MutableVector r1 = r8.f13586l
            int r5 = r1.getSize()
            if (r5 <= 0) goto L9b
            java.lang.Object[] r1 = r1.getContent()
            r6 = 0
        L91:
            r7 = r1[r6]
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r7 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) r7
            r7.cancel()
            int r6 = r6 + r3
            if (r6 < r5) goto L91
        L9b:
            r8.f13587m = r9
            r8.f13585k = r2
            androidx.compose.runtime.collection.MutableVector r9 = r8.f13586l
            r9.clear()
            kotlin.jvm.functions.Function1 r9 = r8.getPrefetchInfoRetriever$foundation_release()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r9 = r9.invoke(r1)
            java.util.List r9 = (java.util.List) r9
            int r1 = r9.size()
        Lb6:
            if (r4 >= r1) goto Lde
            java.lang.Object r2 = r9.get(r4)
            kotlin.Pair r2 = (kotlin.Pair) r2
            androidx.compose.runtime.collection.MutableVector r3 = r8.f13586l
            java.lang.Object r5 = r2.getFirst()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r2 = r2.getSecond()
            androidx.compose.ui.unit.Constraints r2 = (androidx.compose.p003ui.unit.Constraints) r2
            long r6 = r2.m73632unboximpl()
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r2 = r0.m69643schedulePrefetch0kLqBqw(r5, r6)
            r3.add(r2)
            int r4 = r4 + 1
            goto Lb6
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.m61223b(float):void");
    }

    /* renamed from: c */
    private void m61222c(boolean z) {
        this.f13597w.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    private void m61221d(boolean z) {
        this.f13596v.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, continuation);
    }

    /* renamed from: updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default */
    public static /* synthetic */ int m61220xaf8b8f84(LazyGridState lazyGridState, LazyGridItemProvider lazyGridItemProvider, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int index = lazyGridState.f13575a.getIndex();
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                i = index;
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        return lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider, i);
    }

    /* renamed from: a */
    public final void m61224a(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int column;
        int i;
        int column2;
        if (this.f13585k != -1 && (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.f13587m) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) lazyGridLayoutInfo.getVisibleItemsInfo());
                if (this.f13581g) {
                    column2 = lazyGridItemInfo.getRow();
                } else {
                    column2 = lazyGridItemInfo.getColumn();
                }
                i = column2 + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) lazyGridLayoutInfo.getVisibleItemsInfo());
                if (this.f13581g) {
                    column = lazyGridItemInfo2.getRow();
                } else {
                    column = lazyGridItemInfo2.getColumn();
                }
                i = column - 1;
            }
            if (this.f13585k != i) {
                this.f13585k = -1;
                MutableVector mutableVector = this.f13586l;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        ((LazyLayoutPrefetchState.PrefetchHandle) content[i2]).cancel();
                        i2++;
                    } while (i2 < size);
                    this.f13586l.clear();
                }
                this.f13586l.clear();
            }
        }
    }

    @Nullable
    public final Object animateScrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f13594t, i, i2, continuation);
        if (animateScrollToItem == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateScrollToItem;
        }
        return Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyGridMeasureResult result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f13575a.updateFromMeasureResult(result);
        this.f13578d -= result.getConsumedScroll();
        this.f13576b.setValue(result);
        m61221d(result.getCanScrollForward());
        LazyGridMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        boolean z = false;
        if (firstVisibleLine != null) {
            i = firstVisibleLine.getIndex();
        } else {
            i = 0;
        }
        m61222c((i == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? true : true);
        this.f13583i++;
        m61224a(result);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f13582h.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.f13590p;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.f13593s;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f13597w.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.f13596v.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.f13580f;
    }

    public final int getFirstVisibleItemIndex() {
        return this.f13575a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f13575a.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.f13577c;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.f13577c;
    }

    @NotNull
    public final LazyGridLayoutInfo getLayoutInfo() {
        return (LazyGridLayoutInfo) this.f13576b.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f13575a.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f13583i;
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.f13595u;
    }

    @NotNull
    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.f13592r;
    }

    @NotNull
    public final Function1<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.f13591q.getValue();
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.f13598x;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f13584j;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.f13588n;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f13589o;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f13578d;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.f13579e.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f13582h.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.f13581g;
    }

    public final float onScroll$foundation_release(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f13578d) <= 0.5f) {
            float f2 = this.f13578d + f;
            this.f13578d = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f13578d;
                Remeasurement remeasurement = this.f13588n;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                if (this.f13584j) {
                    m61223b(f3 - this.f13578d);
                }
            }
            if (Math.abs(this.f13578d) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f13578d;
            this.f13578d = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f13578d).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(@org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f13590p
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f13582h
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object scrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object m67770e = JE1.m67770e(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        if (m67770e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m67770e;
        }
        return Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.f13580f = density;
    }

    public final void setPrefetchInfoRetriever$foundation_release(@NotNull Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f13591q.setValue(function1);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f13584j = z;
    }

    public final void setRemeasurement$foundation_release(@Nullable Remeasurement remeasurement) {
        this.f13588n = remeasurement;
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.f13579e.setIntValue(i);
    }

    public final void setVertical$foundation_release(boolean z) {
        this.f13581g = z;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.f13575a.requestPosition(i, i2);
        this.f13592r.reset();
        Remeasurement remeasurement = this.f13588n;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyGridItemProvider itemProvider, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        return this.f13575a.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, i);
    }

    public LazyGridState(int i, int i2) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i, i2);
        this.f13575a = lazyGridScrollPosition;
        m31891g = AbstractC19508dK1.m31891g(C13255rR.f77274a, null, 2, null);
        this.f13576b = m31891g;
        this.f13577c = InteractionSourceKt.MutableInteractionSource();
        this.f13579e = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f13580f = DensityKt.Density(1.0f, 1.0f);
        this.f13581g = true;
        this.f13582h = ScrollableStateKt.ScrollableState(new LazyGridState$scrollableState$1(this));
        this.f13584j = true;
        this.f13585k = -1;
        this.f13586l = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.f13589o = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
            public /* synthetic */ boolean all(Function1 function1) {
                return AbstractC20114gt0.m30962a(this, function1);
            }

            @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
            public /* synthetic */ boolean any(Function1 function1) {
                return AbstractC20114gt0.m30961b(this, function1);
            }

            @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
            public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                return AbstractC20114gt0.m30960c(this, obj, function2);
            }

            @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
            public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                return AbstractC20114gt0.m30959d(this, obj, function2);
            }

            @Override // androidx.compose.p003ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                LazyGridState.this.setRemeasurement$foundation_release(remeasurement);
            }

            @Override // androidx.compose.p003ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return AbstractC19942ft0.m31254a(this, modifier);
            }
        };
        this.f13590p = new AwaitFirstLayoutModifier();
        m31891g2 = AbstractC19508dK1.m31891g(LazyGridState$prefetchInfoRetriever$2.INSTANCE, null, 2, null);
        this.f13591q = m31891g2;
        this.f13592r = new LazyGridItemPlacementAnimator();
        this.f13593s = new LazyLayoutBeyondBoundsInfo();
        this.f13594t = new LazyGridAnimateScrollScope(this);
        this.f13595u = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        m31891g3 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13596v = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13597w = m31891g4;
        this.f13598x = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
