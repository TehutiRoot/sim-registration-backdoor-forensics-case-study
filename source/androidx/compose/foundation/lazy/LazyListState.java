package androidx.compose.foundation.lazy;

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
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(m28851d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ¯\u00012\u00020\u0001:\u0002¯\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0006JD\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ%\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J!\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020-078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010F\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010V\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010SR\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010YR(\u0010l\u001a\u0004\u0018\u00010g2\b\u0010A\u001a\u0004\u0018\u00010g8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001f\u0010\u0084\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R3\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0092\u0001\u001a\u00030\u008d\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010\u0095\u0001\u001a\u00020W2\u0006\u0010A\u001a\u00020W8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0093\u0001\u00109\u001a\u0005\b\u0094\u0001\u0010[\"\u0004\b<\u0010]R.\u0010\u0098\u0001\u001a\u00020W2\u0006\u0010A\u001a\u00020W8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0096\u0001\u00109\u001a\u0005\b\u0097\u0001\u0010[\"\u0004\b8\u0010]R \u0010\u009e\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010UR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b \u0001\u0010UR\u0014\u0010£\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010§\u0001\u001a\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010\u00ad\u0001\u001a\u00030¨\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001*\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010®\u0001\u001a\u00020W8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010[\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0001"}, m28850d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(F)V", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "info", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/runtime/MutableState;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "d", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "<set-?>", "e", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Density;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", OperatorName.CLOSE_PATH, "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "", "i", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", OperatorName.SET_LINE_JOINSTYLE, "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", OperatorName.LINE_TO, "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", OperatorName.MOVE_TO, "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", OperatorName.ENDPATH, "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "o", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "p", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", OperatorName.SAVE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/ui/unit/Constraints;", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "t", "getCanScrollForward", "canScrollForward", "u", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,439:1\n81#2:440\n81#2:441\n107#2,2:442\n81#2:444\n107#2,2:445\n495#3,4:447\n500#3:456\n129#4,5:451\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n229#1:440\n279#1:441\n279#1:442,2\n281#1:444\n281#1:445,2\n409#1:447,4\n409#1:456\n409#1:451,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: w */
    public static final Saver f13430w = ListSaverKt.listSaver(LazyListState$Companion$Saver$1.INSTANCE, LazyListState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final LazyListScrollPosition f13431a;

    /* renamed from: b */
    public final LazyListAnimateScrollScope f13432b;

    /* renamed from: c */
    public final MutableState f13433c;

    /* renamed from: d */
    public final MutableInteractionSource f13434d;

    /* renamed from: e */
    public float f13435e;

    /* renamed from: f */
    public Density f13436f;

    /* renamed from: g */
    public final ScrollableState f13437g;

    /* renamed from: h */
    public int f13438h;

    /* renamed from: i */
    public boolean f13439i;

    /* renamed from: j */
    public int f13440j;

    /* renamed from: k */
    public LazyLayoutPrefetchState.PrefetchHandle f13441k;

    /* renamed from: l */
    public boolean f13442l;

    /* renamed from: m */
    public Remeasurement f13443m;

    /* renamed from: n */
    public final RemeasurementModifier f13444n;

    /* renamed from: o */
    public final AwaitFirstLayoutModifier f13445o;

    /* renamed from: p */
    public final LazyListItemPlacementAnimator f13446p;

    /* renamed from: q */
    public final LazyLayoutBeyondBoundsInfo f13447q;

    /* renamed from: r */
    public long f13448r;

    /* renamed from: s */
    public final LazyLayoutPinnedItemList f13449s;

    /* renamed from: t */
    public final MutableState f13450t;

    /* renamed from: u */
    public final MutableState f13451u;

    /* renamed from: v */
    public final LazyLayoutPrefetchState f13452v;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.f13430w;
        }

        public Companion() {
        }
    }

    public LazyListState() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.animateScrollToItem(i, i2, continuation);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.scrollToItem(i, i2, continuation);
    }

    /* renamed from: updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default */
    public static /* synthetic */ int m61262xaf8b8f84(LazyListState lazyListState, LazyListItemProvider lazyListItemProvider, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int index = lazyListState.f13431a.getIndex();
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                i = index;
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        return lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider, i);
    }

    /* renamed from: a */
    public final void m61266a(LazyListLayoutInfo lazyListLayoutInfo) {
        int index;
        if (this.f13440j != -1 && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.f13442l) {
                index = ((LazyListItemInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (this.f13440j != index) {
                this.f13440j = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f13441k;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.f13441k = null;
            }
        }
    }

    @Nullable
    public final Object animateScrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f13432b, i, i2, continuation);
        if (animateScrollToItem == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateScrollToItem;
        }
        return Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyListMeasureResult result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f13431a.updateFromMeasureResult(result);
        this.f13435e -= result.getConsumedScroll();
        this.f13433c.setValue(result);
        m61263d(result.getCanScrollForward());
        LazyListMeasuredItem firstVisibleItem = result.getFirstVisibleItem();
        boolean z = false;
        if (firstVisibleItem != null) {
            i = firstVisibleItem.getIndex();
        } else {
            i = 0;
        }
        m61264c((i == 0 && result.getFirstVisibleItemScrollOffset() == 0) ? true : true);
        this.f13438h++;
        m61266a(result);
    }

    /* renamed from: b */
    public final void m61265b(float f) {
        boolean z;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (!this.f13439i) {
            return;
        }
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                index = ((LazyListItemInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (index != this.f13440j && index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                if (this.f13442l != z && (prefetchHandle = this.f13441k) != null) {
                    prefetchHandle.cancel();
                }
                this.f13442l = z;
                this.f13440j = index;
                this.f13441k = this.f13452v.m69643schedulePrefetch0kLqBqw(index, this.f13448r);
            }
        }
    }

    /* renamed from: c */
    public final void m61264c(boolean z) {
        this.f13451u.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void m61263d(boolean z) {
        this.f13450t.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f13437g.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.f13445o;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.f13447q;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f13451u.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.f13450t.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.f13436f;
    }

    public final int getFirstVisibleItemIndex() {
        return this.f13431a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f13431a.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.f13434d;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.f13434d;
    }

    @NotNull
    public final LazyListLayoutInfo getLayoutInfo() {
        return (LazyListLayoutInfo) this.f13433c.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f13431a.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f13438h;
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.f13449s;
    }

    @NotNull
    public final LazyListItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.f13446p;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.f13452v;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f13439i;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release  reason: not valid java name */
    public final long m69605getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.f13448r;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.f13443m;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f13444n;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f13435e;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f13437g.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f13435e) <= 0.5f) {
            float f2 = this.f13435e + f;
            this.f13435e = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f13435e;
                Remeasurement remeasurement = this.f13443m;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                if (this.f13439i) {
                    m61265b(f3 - this.f13435e);
                }
            }
            if (Math.abs(this.f13435e) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f13435e;
            this.f13435e = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f13435e).toString());
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f13445o
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
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f13437g
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object scrollToItem(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object m67770e = JE1.m67770e(this, null, new LazyListState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        if (m67770e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m67770e;
        }
        return Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.f13436f = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f13439i = z;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release  reason: not valid java name */
    public final void m69606setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.f13448r = j;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.f13431a.requestPosition(i, i2);
        this.f13446p.reset();
        Remeasurement remeasurement = this.f13443m;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyListItemProvider itemProvider, int i) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        return this.f13431a.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, i);
    }

    public LazyListState(int i, int i2) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i, i2);
        this.f13431a = lazyListScrollPosition;
        this.f13432b = new LazyListAnimateScrollScope(this);
        m31891g = AbstractC19508dK1.m31891g(C13923sR.f79777a, null, 2, null);
        this.f13433c = m31891g;
        this.f13434d = InteractionSourceKt.MutableInteractionSource();
        this.f13436f = DensityKt.Density(1.0f, 1.0f);
        this.f13437g = ScrollableStateKt.ScrollableState(new LazyListState$scrollableState$1(this));
        this.f13439i = true;
        this.f13440j = -1;
        this.f13444n = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
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
                LazyListState.this.f13443m = remeasurement;
            }

            @Override // androidx.compose.p003ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return AbstractC19942ft0.m31254a(this, modifier);
            }
        };
        this.f13445o = new AwaitFirstLayoutModifier();
        this.f13446p = new LazyListItemPlacementAnimator();
        this.f13447q = new LazyLayoutBeyondBoundsInfo();
        this.f13448r = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.f13449s = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        m31891g2 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13450t = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f13451u = m31891g3;
        this.f13452v = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
