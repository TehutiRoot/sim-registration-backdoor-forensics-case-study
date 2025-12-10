package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.layout.RemeasurementModifier;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
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

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ó\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJD\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001d\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020$2\u0006\u0010-\u001a\u00020$H\u0002¢\u0006\u0004\b.\u0010'J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000701H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<R\u001b\u0010@\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010B\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\bA\u0010?R\u001a\u0010G\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u0002050H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010IR\u001a\u0010O\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\bM\u0010NR+\u0010W\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010I\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010Y\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010I\u001a\u0004\bX\u0010T\"\u0004\bR\u0010VR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R(\u0010c\u001a\u0004\u0018\u00010^2\b\u0010Q\u001a\u0004\u0018\u00010^8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010u\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\"\u0010z\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010T\"\u0004\by\u0010VR\u001b\u0010\u0080\u0001\u001a\u00020{8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0088\u0001\u001a\u00020$2\u0006\u0010Q\u001a\u00020$8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u008e\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010?\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0092\u0001\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010w\u001a\u0005\b\u0090\u0001\u0010T\"\u0005\b\u0091\u0001\u0010VR,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u008a\u0001R%\u0010©\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R \u0010·\u0001\u001a\u00030²\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R \u0010½\u0001\u001a\u00030¸\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R \u0010Ã\u0001\u001a\u00030¾\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0014\u0010Æ\u0001\u001a\u0002058F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0015\u0010:\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0015\u0010Ë\u0001\u001a\u00030È\u00018F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R!\u0010Ñ\u0001\u001a\u00030Ì\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÍ\u0001\u0010Î\u0001*\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010Ò\u0001\u001a\u00020P8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ô\u0001"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToItem", "snapToItemInternal$foundation_release", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "updateScrollPositionIfTheFirstItemWasMoved", "", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "applyMeasureResult", "distance", "e", "d", "(F)V", "", "prefetchHandlesUsed", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/Set;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "info", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V", "itemIndex", "laneCount", OperatorName.CURVE_TO, "(II)[I", "Landroidx/compose/runtime/State;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "", "<set-?>", OperatorName.FILL_NON_ZERO, "getCanScrollForward", "()Z", OperatorName.NON_STROKING_GRAY, "(Z)V", "canScrollForward", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", OperatorName.CLOSE_PATH, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/ui/layout/Remeasurement;", "i", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", OperatorName.LINE_TO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", OperatorName.MOVE_TO, "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", OperatorName.ENDPATH, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "o", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "p", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", OperatorName.SAVE, "I", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "measurePassCount", PDPageLabelRange.STYLE_ROMAN_LOWER, "isVertical$foundation_release", "setVertical$foundation_release", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "setSlots$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "t", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "spanProvider", "u", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Ljava/util/Map;", "currentItemPrefetchHandles", "Landroidx/compose/ui/unit/Density;", OperatorName.SET_LINE_WIDTH, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "x", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "z", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "placementAnimator", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLaneCount$foundation_release", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,504:1\n81#2:505\n81#2:506\n81#2:507\n107#2,2:508\n81#2:510\n107#2,2:511\n81#2:513\n495#3,4:514\n500#3:523\n129#4,5:518\n1855#5,2:524\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n103#1:505\n117#1:506\n154#1:507\n154#1:508,2\n156#1:510\n156#1:511,2\n227#1:513\n339#1:514,4\n339#1:523\n339#1:518,5\n435#1:524,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {

    /* renamed from: a */
    public final State f13792a;

    /* renamed from: b */
    public final State f13793b;

    /* renamed from: c */
    public final LazyStaggeredGridScrollPosition f13794c;

    /* renamed from: d */
    public final MutableState f13795d;

    /* renamed from: e */
    public final LazyStaggeredGridLaneInfo f13796e;

    /* renamed from: f */
    public final MutableState f13797f;

    /* renamed from: g */
    public final MutableState f13798g;

    /* renamed from: h */
    public final LazyStaggeredGridAnimateScrollScope f13799h;

    /* renamed from: i */
    public Remeasurement f13800i;

    /* renamed from: j */
    public final RemeasurementModifier f13801j;

    /* renamed from: k */
    public final AwaitFirstLayoutModifier f13802k;

    /* renamed from: l */
    public final LazyLayoutBeyondBoundsInfo f13803l;

    /* renamed from: m */
    public boolean f13804m;

    /* renamed from: n */
    public final LazyLayoutPrefetchState f13805n;

    /* renamed from: o */
    public final ScrollableState f13806o;

    /* renamed from: p */
    public float f13807p;

    /* renamed from: q */
    public int f13808q;

    /* renamed from: r */
    public boolean f13809r;

    /* renamed from: s */
    public LazyStaggeredGridSlots f13810s;

    /* renamed from: t */
    public LazyStaggeredGridSpanProvider f13811t;

    /* renamed from: u */
    public int f13812u;

    /* renamed from: v */
    public final Map f13813v;

    /* renamed from: w */
    public Density f13814w;

    /* renamed from: x */
    public final MutableInteractionSource f13815x;

    /* renamed from: y */
    public final LazyLayoutPinnedItemList f13816y;

    /* renamed from: z */
    public final LazyStaggeredGridItemPlacementAnimator f13817z;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: A */
    public static final Saver f13791A = ListSaverKt.listSaver(LazyStaggeredGridState$Companion$Saver$1.INSTANCE, LazyStaggeredGridState$Companion$Saver$2.INSTANCE);

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.f13791A;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i, i2, continuation);
    }

    /* renamed from: d */
    private final void m61135d(float f) {
        boolean z;
        int index;
        boolean z2;
        int i;
        int i2;
        int i3;
        long m73635fixedHeightOenEA2s;
        LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo = (LazyStaggeredGridLayoutInfo) this.f13795d.getValue();
        if (!lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
            } else {
                index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
            }
            if (index == this.f13812u) {
                return;
            }
            this.f13812u = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int laneCount$foundation_release = getLaneCount$foundation_release();
            for (int i4 = 0; i4 < laneCount$foundation_release; i4++) {
                if (z) {
                    index = this.f13796e.findNextItemIndex(index, i4);
                } else {
                    index = this.f13796e.findPreviousItemIndex(index, i4);
                }
                if (index < 0 || index >= lazyStaggeredGridLayoutInfo.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(index));
                if (!this.f13813v.containsKey(Integer.valueOf(index))) {
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.f13811t;
                    if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = 0;
                    } else {
                        i = i4;
                    }
                    if (z2) {
                        i2 = getLaneCount$foundation_release();
                    } else {
                        i2 = 1;
                    }
                    LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f13810s;
                    if (lazyStaggeredGridSlots == null) {
                        i3 = 0;
                    } else if (i2 == 1) {
                        i3 = lazyStaggeredGridSlots.getSizes()[i];
                    } else {
                        int i5 = lazyStaggeredGridSlots.getPositions()[i];
                        int i6 = (i + i2) - 1;
                        i3 = (lazyStaggeredGridSlots.getPositions()[i6] + lazyStaggeredGridSlots.getSizes()[i6]) - i5;
                    }
                    if (this.f13809r) {
                        m73635fixedHeightOenEA2s = Constraints.Companion.m73636fixedWidthOenEA2s(i3);
                    } else {
                        m73635fixedHeightOenEA2s = Constraints.Companion.m73635fixedHeightOenEA2s(i3);
                    }
                    this.f13813v.put(Integer.valueOf(index), this.f13805n.m69643schedulePrefetch0kLqBqw(index, m73635fixedHeightOenEA2s));
                }
            }
            m61137b(linkedHashSet);
        }
    }

    /* renamed from: f */
    private void m61133f(boolean z) {
        this.f13798g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    private void m61132g(boolean z) {
        this.f13797f.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i, i2, continuation);
    }

    /* renamed from: updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default */
    public static /* synthetic */ int[] m61131xaf8b8f84(LazyStaggeredGridState lazyStaggeredGridState, LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr, int i, Object obj) {
        if ((i & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int[] indices = lazyStaggeredGridState.f13794c.getIndices();
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                iArr = indices;
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        return lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider, iArr);
    }

    /* renamed from: a */
    public final void m61138a(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.f13812u != -1 && (!visibleItemsInfo.isEmpty())) {
            int index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) visibleItemsInfo)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) visibleItemsInfo)).getIndex();
            int i = this.f13812u;
            if (index > i || i > index2) {
                this.f13812u = -1;
                for (LazyLayoutPrefetchState.PrefetchHandle prefetchHandle : this.f13813v.values()) {
                    prefetchHandle.cancel();
                }
                this.f13813v.clear();
            }
        }
    }

    @Nullable
    public final Object animateScrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f13799h, i, i2, continuation);
        if (animateScrollToItem == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateScrollToItem;
        }
        return Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyStaggeredGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f13807p -= result.getConsumedScroll();
        m61133f(result.getCanScrollBackward());
        m61132g(result.getCanScrollForward());
        this.f13795d.setValue(result);
        m61138a(result);
        this.f13794c.updateFromMeasureResult(result);
        this.f13808q++;
    }

    /* renamed from: b */
    public final void m61137b(Set set) {
        Iterator it = this.f13813v.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!set.contains(entry.getKey())) {
                ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public final int[] m61136c(int i, int i2) {
        int min;
        int[] iArr = new int[i2];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.f13811t;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(i)) {
            ArraysKt___ArraysJvmKt.fill$default(iArr, i, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f13796e.ensureValidIndex(i + i2);
        int lane = this.f13796e.getLane(i);
        if (lane == -1) {
            min = 0;
        } else {
            min = Math.min(lane, i2);
        }
        int i3 = min - 1;
        int i4 = i;
        while (true) {
            if (-1 >= i3) {
                break;
            }
            i4 = this.f13796e.findPreviousItemIndex(i4, i3);
            iArr[i3] = i4;
            if (i4 == -1) {
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, i3, 2, (Object) null);
                break;
            }
            i3--;
        }
        iArr[min] = i;
        for (int i5 = min + 1; i5 < i2; i5++) {
            i = this.f13796e.findNextItemIndex(i, i5);
            iArr[i5] = i;
        }
        return iArr;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f13806o.dispatchRawDelta(f);
    }

    /* renamed from: e */
    public final float m61134e(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f13807p) <= 0.5f) {
            float f2 = this.f13807p + f;
            this.f13807p = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f13807p;
                Remeasurement remeasurement = this.f13800i;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                if (this.f13804m) {
                    m61135d(f3 - this.f13807p);
                }
            }
            if (Math.abs(this.f13807p) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f13807p;
            this.f13807p = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f13807p).toString());
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.f13802k;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.f13803l;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f13798g.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.f13797f.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.f13814w;
    }

    public final int getFirstVisibleItemIndex() {
        return ((Number) this.f13792a.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.f13793b.getValue()).intValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.f13815x;
    }

    public final int getLaneCount$foundation_release() {
        int[] sizes;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f13810s;
        if (lazyStaggeredGridSlots != null && (sizes = lazyStaggeredGridSlots.getSizes()) != null) {
            return sizes.length;
        }
        return 0;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.f13796e;
    }

    @NotNull
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return (LazyStaggeredGridLayoutInfo) this.f13795d.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.f13808q;
    }

    @NotNull
    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.f13815x;
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f13794c.getNearestRangeState().getValue();
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.f13816y;
    }

    @NotNull
    public final LazyStaggeredGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.f13817z;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.f13805n;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f13804m;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.f13800i;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f13801j;
    }

    @NotNull
    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.f13794c;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f13807p;
    }

    @Nullable
    public final LazyStaggeredGridSlots getSlots$foundation_release() {
        return this.f13810s;
    }

    @Nullable
    public final LazyStaggeredGridSpanProvider getSpanProvider$foundation_release() {
        return this.f13811t;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f13806o.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.f13809r;
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f13802k
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
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f13806o
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object scrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object m67770e = JE1.m67770e(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        if (m67770e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m67770e;
        }
        return Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.f13814w = density;
    }

    public final void setMeasurePassCount$foundation_release(int i) {
        this.f13808q = i;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f13804m = z;
    }

    public final void setSlots$foundation_release(@Nullable LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.f13810s = lazyStaggeredGridSlots;
    }

    public final void setSpanProvider$foundation_release(@Nullable LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.f13811t = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.f13809r = z;
    }

    public final void snapToItemInternal$foundation_release(@NotNull ScrollScope scrollScope, int i, int i2) {
        int m73776getXimpl;
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i);
        if (findVisibleItem != null) {
            boolean z = this.f13809r;
            long mo69650getOffsetnOccac = findVisibleItem.mo69650getOffsetnOccac();
            if (z) {
                m73776getXimpl = IntOffset.m73777getYimpl(mo69650getOffsetnOccac);
            } else {
                m73776getXimpl = IntOffset.m73776getXimpl(mo69650getOffsetnOccac);
            }
            scrollScope.scrollBy(m73776getXimpl + i2);
            return;
        }
        this.f13794c.requestPosition(i, i2);
        Remeasurement remeasurement = this.f13800i;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyLayoutItemProvider itemProvider, @NotNull int[] firstItemIndex) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(firstItemIndex, "firstItemIndex");
        return this.f13794c.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        this.f13792a = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemIndex$2(this));
        this.f13793b = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemScrollOffset$2(this));
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.f13794c = lazyStaggeredGridScrollPosition;
        m31891g = AbstractC19508dK1.m31891g(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.f13795d = m31891g;
        this.f13796e = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        m31891g2 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13797f = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13798g = m31891g3;
        this.f13799h = new LazyStaggeredGridAnimateScrollScope(this);
        this.f13801j = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
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
                LazyStaggeredGridState.this.f13800i = remeasurement;
            }

            @Override // androidx.compose.p003ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return AbstractC19942ft0.m31254a(this, modifier);
            }
        };
        this.f13802k = new AwaitFirstLayoutModifier();
        this.f13803l = new LazyLayoutBeyondBoundsInfo();
        this.f13804m = true;
        this.f13805n = new LazyLayoutPrefetchState();
        this.f13806o = ScrollableStateKt.ScrollableState(new LazyStaggeredGridState$scrollableState$1(this));
        this.f13812u = -1;
        this.f13813v = new LinkedHashMap();
        this.f13814w = DensityKt.Density(1.0f, 1.0f);
        this.f13815x = InteractionSourceKt.MutableInteractionSource();
        this.f13816y = new LazyLayoutPinnedItemList();
        this.f13817z = new LazyStaggeredGridItemPlacementAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
    }

    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2});
    }
}
