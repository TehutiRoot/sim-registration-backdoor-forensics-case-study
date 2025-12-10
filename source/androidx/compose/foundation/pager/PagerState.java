package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.layout.RemeasurementModifier;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
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
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010'\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0#\u0012\u0006\u0012\u0004\u0018\u00010$0!¢\u0006\u0002\b%H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R4\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010C\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u00106\"\u0004\bB\u0010\u000bR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010J\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u00106R\u0014\u0010M\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010P\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u00103R\"\u0010X\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010[R\u0016\u0010^\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010SR\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00130_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00109R\"\u0010i\u001a\u00020b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR+\u0010s\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\b?\u00103\"\u0004\b`\u0010rR+\u0010u\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010q\u001a\u0004\bN\u00103\"\u0004\bt\u0010rR\u001b\u0010y\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u00103R\u001b\u0010|\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bz\u0010w\u001a\u0004\b{\u00103R\u001b\u0010\u007f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010w\u001a\u0004\b~\u00106R \u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u0091\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R6\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0092\u00012\t\u00108\u001a\u0005\u0018\u00010\u0092\u00018@@BX\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u0093\u0001\u00109\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\bp\u0010\u0096\u0001R \u0010\u009d\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R1\u0010£\u0001\u001a\u00030\u009e\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010;\"\u0005\b¢\u0001\u0010=R \u0010©\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R.\u0010¬\u0001\u001a\u00020Q2\u0006\u00108\u001a\u00020Q8F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bª\u0001\u00109\u001a\u0005\b«\u0001\u0010U\"\u0004\bk\u0010WR.\u0010¯\u0001\u001a\u00020Q2\u0006\u00108\u001a\u00020Q8F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\b\u00ad\u0001\u00109\u001a\u0005\b®\u0001\u0010U\"\u0004\bc\u0010WR\u001e\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010°\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bR\u0010²\u0001R\u0015\u0010´\u0001\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u00103R\u0015\u0010µ\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u00106R\u0015\u0010¶\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00106R\u0016\u0010¸\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u00103R\u0016\u0010º\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u00103R\u0016\u0010¼\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u00103R\u0017\u0010¿\u0001\u001a\u00020\u00138@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010Á\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u00103R\u0016\u0010Ã\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u00103R\u0015\u0010Ç\u0001\u001a\u00030Ä\u00018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0013\u0010É\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u00103R!\u0010Ï\u0001\u001a\u00030Ê\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bË\u0001\u0010Ì\u0001*\u0006\bÍ\u0001\u0010Î\u0001R\u0016\u0010Ð\u0001\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ñ\u0001"}, m28850d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialPage", "", "initialPageOffsetFraction", "<init>", "(IF)V", "delta", "", OperatorName.SET_LINE_JOINSTYLE, "(F)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatorName.CURVE_TO, "(I)I", "distance", OperatorName.NON_STROKING_CMYK, "(F)F", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "info", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "page", "pageOffsetFraction", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "applyMeasureResult", "getOffsetFractionForPage", "(I)F", "I", "getInitialPage", "()I", "F", "getInitialPageOffsetFraction", "()F", "Landroidx/compose/ui/geometry/Offset;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation_release", "()J", "setUpDownDifference-k-4lQ0M$foundation_release", "(J)V", "upDownDifference", "d", "Landroidx/compose/runtime/MutableFloatState;", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "snapRemainingScrollOffset", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "e", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollPosition", OperatorName.FILL_NON_ZERO, "getScrollToBeConsumed$foundation_release", "scrollToBeConsumed", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", OperatorName.CLOSE_PATH, "getNumMeasurePasses$foundation_release", "numMeasurePasses", "", "i", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", OperatorName.LINE_TO, "wasScrollingForward", "Landroidx/compose/runtime/MutableState;", OperatorName.MOVE_TO, "pagerLayoutInfoState", "Landroidx/compose/ui/unit/Density;", OperatorName.ENDPATH, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "o", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "p", "Landroidx/compose/runtime/MutableIntState;", "(I)V", "animationTargetPage", OperatorName.SAVE, "settledPageState", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", OperatorName.CLOSE_AND_STROKE, "getTargetPage", "targetPage", "t", "getCurrentPageOffsetFraction", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "u", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", OperatorName.SET_LINE_WIDTH, "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/Remeasurement;", "x", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/unit/Constraints;", "z", OperatorName.SET_LINE_CAPSTYLE, "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "A", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "B", "getCanScrollForward", "canScrollForward", "C", "getCanScrollBackward", "canScrollBackward", "", "Landroidx/compose/foundation/pager/PageInfo;", "()Ljava/util/List;", "visiblePages", "pageAvailableSpace", "positionThresholdFraction", "distanceToSnapPosition", "getPageCount", "pageCount", "getFirstVisiblePage$foundation_release", "firstVisiblePage", "getFirstVisiblePageOffset$foundation_release", "firstVisiblePageOffset", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation_release", "pageSpacing", "getPageSize$foundation_release", "pageSize", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "currentPage", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,684:1\n81#2:685\n107#2,2:686\n81#2:697\n81#2:698\n81#2:699\n81#2:700\n107#2,2:701\n81#2:703\n81#2:712\n107#2,2:713\n81#2:715\n107#2,2:716\n75#3:688\n108#3,2:689\n75#4:691\n108#4,2:692\n75#4:694\n108#4,2:695\n681#5,4:704\n681#5,4:708\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n187#1:685\n187#1:686,2\n306#1:697\n323#1:698\n357#1:699\n385#1:700\n385#1:701,2\n407#1:703\n513#1:712\n513#1:713,2\n515#1:715\n515#1:716,2\n188#1:688\n188#1:689,2\n294#1:691\n294#1:692,2\n296#1:694\n296#1:695,2\n473#1:704,4\n489#1:708,4\n*E\n"})
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;

    /* renamed from: A */
    public final LazyLayoutPinnedItemList f13880A;

    /* renamed from: B */
    public final MutableState f13881B;

    /* renamed from: C */
    public final MutableState f13882C;

    /* renamed from: a */
    public final int f13883a;

    /* renamed from: b */
    public final float f13884b;

    /* renamed from: c */
    public final MutableState f13885c;

    /* renamed from: d */
    public final MutableFloatState f13886d;

    /* renamed from: e */
    public final PagerScrollPosition f13887e;

    /* renamed from: f */
    public float f13888f;

    /* renamed from: g */
    public final ScrollableState f13889g;

    /* renamed from: h */
    public int f13890h;

    /* renamed from: i */
    public boolean f13891i;

    /* renamed from: j */
    public int f13892j;

    /* renamed from: k */
    public LazyLayoutPrefetchState.PrefetchHandle f13893k;

    /* renamed from: l */
    public boolean f13894l;

    /* renamed from: m */
    public MutableState f13895m;

    /* renamed from: n */
    public Density f13896n;

    /* renamed from: o */
    public final MutableInteractionSource f13897o;

    /* renamed from: p */
    public final MutableIntState f13898p;

    /* renamed from: q */
    public final MutableIntState f13899q;

    /* renamed from: r */
    public final State f13900r;

    /* renamed from: s */
    public final State f13901s;

    /* renamed from: t */
    public final State f13902t;

    /* renamed from: u */
    public final LazyLayoutPrefetchState f13903u;

    /* renamed from: v */
    public final LazyLayoutBeyondBoundsInfo f13904v;

    /* renamed from: w */
    public final AwaitFirstLayoutModifier f13905w;

    /* renamed from: x */
    public final MutableState f13906x;

    /* renamed from: y */
    public final RemeasurementModifier f13907y;

    /* renamed from: z */
    public long f13908z;

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
            }
            return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    /* renamed from: j */
    private final void m61104j(float f) {
        boolean z;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (!this.f13891i) {
            return;
        }
        PagerLayoutInfo layoutInfo$foundation_release = getLayoutInfo$foundation_release();
        if (!layoutInfo$foundation_release.getVisiblePagesInfo().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                index = ((PageInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() + 1;
            } else {
                index = ((PageInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() - 1;
            }
            if (index != this.f13892j && index >= 0 && index < layoutInfo$foundation_release.getPagesCount()) {
                if (this.f13894l != z && (prefetchHandle = this.f13893k) != null) {
                    prefetchHandle.cancel();
                }
                this.f13894l = z;
                this.f13892j = index;
                this.f13893k = this.f13903u.m69643schedulePrefetch0kLqBqw(index, this.f13908z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m61102l(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L58
        L46:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.m61113a(r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            androidx.compose.foundation.gestures.ScrollableState r5 = r5.f13889g
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r5 = r5.scroll(r6, r7, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.m61102l(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: n */
    private final void m61100n(boolean z) {
        this.f13882C.setValue(Boolean.valueOf(z));
    }

    /* renamed from: o */
    private final void m61099o(boolean z) {
        this.f13881B.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            return pagerState.scrollToPage(i, f, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    /* renamed from: a */
    public final Object m61113a(Continuation continuation) {
        Object waitForFirstLayout = this.f13905w.waitForFirstLayout(continuation);
        if (waitForFirstLayout == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return waitForFirstLayout;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateScrollToPage(int r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(@NotNull PagerMeasureResult result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f13887e.updateFromMeasureResult(result);
        this.f13888f -= result.getConsumedScroll();
        this.f13895m.setValue(result);
        m61099o(result.getCanScrollForward());
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        boolean z = false;
        if (firstVisiblePage != null) {
            i = firstVisiblePage.getIndex();
        } else {
            i = 0;
        }
        m61100n((i == 0 && result.getFirstVisiblePageOffset() == 0) ? true : true);
        this.f13890h++;
        m61112b(result);
        if (!isScrollInProgress()) {
            m61097q(getCurrentPage());
        }
    }

    /* renamed from: b */
    public final void m61112b(PagerLayoutInfo pagerLayoutInfo) {
        int index;
        if (this.f13892j != -1 && (!pagerLayoutInfo.getVisiblePagesInfo().isEmpty())) {
            if (this.f13894l) {
                index = ((PageInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + 1;
            } else {
                index = ((PageInfo) CollectionsKt___CollectionsKt.first((List<? extends Object>) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - 1;
            }
            if (this.f13892j != index) {
                this.f13892j = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f13893k;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.f13893k = null;
            }
        }
    }

    /* renamed from: c */
    public final int m61111c(int i) {
        if (getPageCount() <= 0) {
            return 0;
        }
        return AbstractC11719c.coerceIn(i, 0, getPageCount() - 1);
    }

    /* renamed from: d */
    public final int m61110d() {
        return this.f13898p.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f13889g.dispatchRawDelta(f);
    }

    /* renamed from: e */
    public final float m61109e() {
        PageInfo closestPageToSnapPosition = getLayoutInfo$foundation_release().getClosestPageToSnapPosition();
        if (closestPageToSnapPosition != null) {
            return SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(this.f13896n, PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo$foundation_release()), getLayoutInfo$foundation_release().getBeforeContentPadding(), getLayoutInfo$foundation_release().getAfterContentPadding(), getLayoutInfo$foundation_release().getPageSize(), closestPageToSnapPosition.getOffset(), closestPageToSnapPosition.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final int m61108f() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* renamed from: g */
    public final float m61107g() {
        return Math.min(this.f13896n.mo69438toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.f13905w;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.f13904v;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.f13882C.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.f13881B.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.f13887e.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.f13902t.getValue()).floatValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.f13896n;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.f13887e.getFirstVisiblePage();
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.f13887e.getScrollOffset();
    }

    public final int getInitialPage() {
        return this.f13883a;
    }

    public final float getInitialPageOffsetFraction() {
        return this.f13884b;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.f13897o;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.f13897o;
    }

    @NotNull
    public final PagerLayoutInfo getLayoutInfo$foundation_release() {
        return (PagerLayoutInfo) this.f13895m.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f13887e.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f13890h;
    }

    public final float getOffsetFractionForPage(int i) {
        if (i >= 0 && i <= getPageCount()) {
            return (getCurrentPage() - i) + getCurrentPageOffsetFraction();
        }
        throw new IllegalArgumentException(("page " + i + " is not within the range 0 to pageCount").toString());
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return ((PagerLayoutInfo) this.f13895m.getValue()).getPageSize();
    }

    public final int getPageSpacing$foundation_release() {
        return ((PagerLayoutInfo) this.f13895m.getValue()).getPageSpacing();
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.f13880A;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.f13903u;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f13891i;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release  reason: not valid java name */
    public final long m69684getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.f13908z;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.f13906x.getValue();
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f13907y;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f13888f;
    }

    public final int getSettledPage() {
        return ((Number) this.f13900r.getValue()).intValue();
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.f13886d.getFloatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.f13901s.getValue()).intValue();
    }

    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m69685getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.f13885c.getValue()).m71512unboximpl();
    }

    /* renamed from: h */
    public final int m61106h() {
        return this.f13899q.getIntValue();
    }

    /* renamed from: i */
    public final List m61105i() {
        return ((PagerLayoutInfo) this.f13895m.getValue()).getVisiblePagesInfo();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f13889g.isScrollInProgress();
    }

    /* renamed from: k */
    public final float m61103k(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f13888f) <= 0.5f) {
            float f2 = this.f13888f + f;
            this.f13888f = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f13888f;
                Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
                if (remeasurement$foundation_release != null) {
                    remeasurement$foundation_release.forceRemeasure();
                }
                if (this.f13891i) {
                    m61104j(f3 - this.f13888f);
                }
            }
            if (Math.abs(this.f13888f) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f13888f;
            this.f13888f = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f13888f).toString());
    }

    /* renamed from: m */
    public final void m61101m(int i) {
        this.f13898p.setIntValue(i);
    }

    /* renamed from: p */
    public final void m61098p(Remeasurement remeasurement) {
        this.f13906x.setValue(remeasurement);
    }

    /* renamed from: q */
    public final void m61097q(int i) {
        this.f13899q.setIntValue(i);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return m61102l(this, mutatePriority, function2, continuation);
    }

    @Nullable
    public final Object scrollToPage(int i, float f, @NotNull Continuation<? super Unit> continuation) {
        Object m67770e = JE1.m67770e(this, null, new PagerState$scrollToPage$2(this, f, i, null), continuation, 1, null);
        if (m67770e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m67770e;
        }
        return Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.f13896n = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f13891i = z;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release  reason: not valid java name */
    public final void m69686setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.f13908z = j;
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.f13886d.setFloatValue(f);
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release  reason: not valid java name */
    public final void m69687setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.f13885c.setValue(Offset.m71491boximpl(j));
    }

    public PagerState(int i, float f) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        this.f13883a = i;
        this.f13884b = f;
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            m31891g = AbstractC19508dK1.m31891g(Offset.m71491boximpl(Offset.Companion.m71518getZeroF1C5BW0()), null, 2, null);
            this.f13885c = m31891g;
            this.f13886d = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, 0);
            this.f13887e = pagerScrollPosition;
            this.f13889g = ScrollableStateKt.ScrollableState(new PagerState$scrollableState$1(this));
            this.f13891i = true;
            this.f13892j = -1;
            m31891g2 = AbstractC19508dK1.m31891g(PagerStateKt.getEmptyLayoutInfo(), null, 2, null);
            this.f13895m = m31891g2;
            this.f13896n = PagerStateKt.access$getUnitDensity$p();
            this.f13897o = InteractionSourceKt.MutableInteractionSource();
            this.f13898p = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.f13899q = SnapshotIntStateKt.mutableIntStateOf(i);
            this.f13900r = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$settledPage$2(this));
            this.f13901s = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$targetPage$2(this));
            this.f13902t = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$currentPageOffsetFraction$2(this));
            this.f13903u = new LazyLayoutPrefetchState();
            this.f13904v = new LazyLayoutBeyondBoundsInfo();
            this.f13905w = new AwaitFirstLayoutModifier();
            m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
            this.f13906x = m31891g3;
            this.f13907y = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
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
                    PagerState.this.m61098p(remeasurement);
                }

                @Override // androidx.compose.p003ui.Modifier
                public /* synthetic */ Modifier then(Modifier modifier) {
                    return AbstractC19942ft0.m31254a(this, modifier);
                }
            };
            this.f13908z = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.f13880A = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            Boolean bool = Boolean.FALSE;
            m31891g4 = AbstractC19508dK1.m31891g(bool, null, 2, null);
            this.f13881B = m31891g4;
            m31891g5 = AbstractC19508dK1.m31891g(bool, null, 2, null);
            this.f13882C = m31891g5;
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
