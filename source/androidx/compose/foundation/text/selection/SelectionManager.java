package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusChangedModifierKt;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.TextToolbarStatus;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u0013*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010+J;\u00105\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020/02012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b3\u00104J\u0011\u00109\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b:\u0010\bJ\u000f\u0010=\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010\bJ\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\bJ\u0015\u0010B\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bB\u0010CJ9\u0010H\u001a\u00020\u001e2\b\u0010D\u001a\u0004\u0018\u00010\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ?\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f2\b\u0010K\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001b\u0010P\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010QR\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\"\u0010Z\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010h\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010p\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR0\u0010\u0085\u0001\u001a\u00020\u001e2\u0007\u0010\u0081\u0001\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0083\u0001\u0010W\"\u0005\b\u0084\u0001\u0010YR#\u0010E\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R5\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010+\"\u0006\b\u008c\u0001\u0010\u008d\u0001R8\u0010\u0091\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u000f8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0014\n\u0004\b\"\u0010S\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0004\br\u0010OR8\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u000f8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0014\n\u0004\b\u0007\u0010S\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001\"\u0004\bz\u0010OR=\u0010I\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0016\n\u0004\b\t\u0010S\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0089\u0001\u0010\u0096\u0001R>\u0010J\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010S\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001\"\u0006\b\u0086\u0001\u0010\u0096\u0001R8\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0099\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009a\u0001\u0010S\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u0082\u0001\u0010\u009d\u0001R>\u0010¡\u0001\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u009f\u0001\u0010S\u001a\u0006\b \u0001\u0010\u0095\u0001\"\u0005\bj\u0010\u0096\u0001R\u0015\u0010¢\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010WR.\u0010§\u0001\u001a\u0004\u0018\u00010/2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0014\u0010ª\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006«\u0001"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "", OperatorName.MOVE_TO, "()V", OperatorName.ENDPATH, "Landroidx/compose/ui/geometry/Rect;", OperatorName.CURVE_TO, "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onTap", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "position", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", OperatorName.LINE_TO, "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "", "selectAll$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAll", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "copy", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "onRelease", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "newPosition", "previousPosition", "updateSelection-RHHTvR4$foundation_release", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "_selection", "Z", "getTouchMode", "()Z", "setTouchMode", "(Z)V", "touchMode", "d", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChange", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/platform/ClipboardManager;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "<set-?>", "i", "getHasFocus", "setHasFocus", "hasFocus", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/geometry/Offset;", "value", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "containerLayoutCoordinates", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "dragBeginPosition", "getDragTotalDistance-F1C5BW0$foundation_release", "dragTotalDistance", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset;)V", "o", "getEndHandlePosition-_m7T9-E", "Landroidx/compose/foundation/text/Handle;", "p", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", OperatorName.SAVE, "getCurrentDragPosition-_m7T9-E", "currentDragPosition", "shouldShowMagnifier", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,914:1\n81#2:915\n107#2,2:916\n81#2:918\n107#2,2:919\n81#2:921\n107#2,2:922\n81#2:924\n107#2,2:925\n81#2:927\n107#2,2:928\n81#2:930\n107#2,2:931\n81#2:933\n107#2,2:934\n1#3:936\n59#4,3:937\n62#4,2:944\n64#4:947\n59#4,3:948\n62#4,2:955\n64#4:958\n33#5,4:940\n38#5:946\n33#5,4:951\n38#5:957\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n112#1:915\n112#1:916,2\n161#1:918\n161#1:919,2\n168#1:921\n168#1:922,2\n177#1:924\n177#1:925,2\n186#1:927\n186#1:928,2\n193#1:930\n193#1:931,2\n200#1:933\n200#1:934,2\n368#1:937,3\n368#1:944,2\n368#1:947\n752#1:948,3\n752#1:955,2\n752#1:958\n368#1:940,4\n368#1:946\n752#1:951,4\n752#1:957\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManager {

    /* renamed from: a */
    public final SelectionRegistrarImpl f14249a;

    /* renamed from: b */
    public final MutableState f14250b;

    /* renamed from: c */
    public boolean f14251c;

    /* renamed from: d */
    public Function1 f14252d;

    /* renamed from: e */
    public HapticFeedback f14253e;

    /* renamed from: f */
    public ClipboardManager f14254f;

    /* renamed from: g */
    public TextToolbar f14255g;

    /* renamed from: h */
    public FocusRequester f14256h;

    /* renamed from: i */
    public final MutableState f14257i;

    /* renamed from: j */
    public Offset f14258j;

    /* renamed from: k */
    public LayoutCoordinates f14259k;

    /* renamed from: l */
    public final MutableState f14260l;

    /* renamed from: m */
    public final MutableState f14261m;

    /* renamed from: n */
    public final MutableState f14262n;

    /* renamed from: o */
    public final MutableState f14263o;

    /* renamed from: p */
    public final MutableState f14264p;

    /* renamed from: q */
    public final MutableState f14265q;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1 */
    /* loaded from: classes.dex */
    public static final class C30361 extends Lambda implements Function1<Long, Unit> {
        public C30361() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection2 = SelectionManager.this.getSelection();
            if ((selection2 == null || (start = selection2.getStart()) == null || j != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j != end.getSelectableId())) {
                return;
            }
            SelectionManager.this.m60981m();
            SelectionManager.this.m60980n();
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m28850d2 = {"<anonymous>", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "position", "Landroidx/compose/ui/geometry/Offset;", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2 */
    /* loaded from: classes.dex */
    public static final class C30372 extends Lambda implements Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit> {
        public C30372() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
            m69871invoked4ec7I(layoutCoordinates, offset.m71512unboximpl(), selectionAdjustment);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final void m69871invoked4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long j, @NotNull SelectionAdjustment selectionMode) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            Offset m60993a = SelectionManager.this.m60993a(layoutCoordinates, j);
            if (m60993a != null) {
                SelectionManager.this.m60982l(m60993a.m71512unboximpl(), false, selectionMode);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3 */
    /* loaded from: classes.dex */
    public static final class C30383 extends Lambda implements Function1<Long, Unit> {
        public C30383() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            SelectionManager selectionManager = SelectionManager.this;
            Pair<Selection, Map<Long, Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
            Selection component1 = selectAll$foundation_release.component1();
            Map<Long, Selection> component2 = selectAll$foundation_release.component2();
            if (!Intrinsics.areEqual(component1, SelectionManager.this.getSelection())) {
                SelectionManager.this.f14249a.setSubselections(component2);
                SelectionManager.this.getOnSelectionChange().invoke(component1);
            }
            SelectionManager.this.getFocusRequester().requestFocus();
            SelectionManager.this.hideSelectionToolbar$foundation_release();
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, m28850d2 = {"<anonymous>", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newPosition", "Landroidx/compose/ui/geometry/Offset;", "previousPosition", "isStartHandle", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4 */
    /* loaded from: classes.dex */
    public static final class C30394 extends Lambda implements Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        public C30394() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Boolean invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool, SelectionAdjustment selectionAdjustment) {
            return m69872invoke5iVPX68(layoutCoordinates, offset.m71512unboximpl(), offset2.m71512unboximpl(), bool.booleanValue(), selectionAdjustment);
        }

        @NotNull
        /* renamed from: invoke-5iVPX68  reason: not valid java name */
        public final Boolean m69872invoke5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, @NotNull SelectionAdjustment selectionMode) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            return Boolean.valueOf(SelectionManager.this.m69870updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m60993a(layoutCoordinates, j), SelectionManager.this.m60993a(layoutCoordinates, j2), z, selectionMode));
        }
    }

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5 */
    /* loaded from: classes.dex */
    public static final class C30405 extends Lambda implements Function0<Unit> {
        public C30405() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SelectionManager.this.showSelectionToolbar$foundation_release();
            SelectionManager.this.m60985i(null);
            SelectionManager.this.m60988f(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "selectableKey", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6 */
    /* loaded from: classes.dex */
    public static final class C30416 extends Lambda implements Function1<Long, Unit> {
        public C30416() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            if (SelectionManager.this.f14249a.getSubselections().containsKey(Long.valueOf(j))) {
                SelectionManager.this.onRelease();
                SelectionManager.this.setSelection(null);
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "selectableKey", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7 */
    /* loaded from: classes.dex */
    public static final class C30427 extends Lambda implements Function1<Long, Unit> {
        public C30427() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection2 = SelectionManager.this.getSelection();
            if ((selection2 == null || (start = selection2.getStart()) == null || j != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j != end.getSelectableId())) {
                return;
            }
            SelectionManager.this.m60983k(null);
            SelectionManager.this.m60984j(null);
        }
    }

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrar) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        MutableState m31891g7;
        MutableState m31891g8;
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.f14249a = selectionRegistrar;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14250b = m31891g;
        this.f14251c = true;
        this.f14252d = SelectionManager$onSelectionChange$1.INSTANCE;
        this.f14256h = new FocusRequester();
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f14257i = m31891g2;
        Offset.Companion companion = Offset.Companion;
        m31891g3 = AbstractC19508dK1.m31891g(Offset.m71491boximpl(companion.m71518getZeroF1C5BW0()), null, 2, null);
        this.f14260l = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(Offset.m71491boximpl(companion.m71518getZeroF1C5BW0()), null, 2, null);
        this.f14261m = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14262n = m31891g5;
        m31891g6 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14263o = m31891g6;
        m31891g7 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14264p = m31891g7;
        m31891g8 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14265q = m31891g8;
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new C30361());
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new C30372());
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new C30383());
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new C30394());
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new C30405());
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new C30416());
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new C30427());
    }

    /* renamed from: a */
    public final Offset m60993a(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = this.f14259k;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            return Offset.m71491boximpl(requireContainerCoordinates$foundation_release().mo72817localPositionOfR5De75A(layoutCoordinates, j));
        }
        return null;
    }

    /* renamed from: b */
    public final Object m60992b(PointerInputScope pointerInputScope, Function1 function1, Continuation continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        if (awaitEachGesture == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return awaitEachGesture;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final Rect m60991c() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.Companion.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null) {
            if (anchorSelectable$foundation_release2 != null && (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) != null) {
                LayoutCoordinates layoutCoordinates3 = this.f14259k;
                if (layoutCoordinates3 != null && layoutCoordinates3.isAttached()) {
                    long mo72817localPositionOfR5De75A = layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo69835getHandlePositiondBAh8RU(selection, true));
                    long mo72817localPositionOfR5De75A2 = layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo69835getHandlePositiondBAh8RU(selection, false));
                    long mo72818localToRootMKHz9U = layoutCoordinates3.mo72818localToRootMKHz9U(mo72817localPositionOfR5De75A);
                    long mo72818localToRootMKHz9U2 = layoutCoordinates3.mo72818localToRootMKHz9U(mo72817localPositionOfR5De75A2);
                    return new Rect(Math.min(Offset.m71502getXimpl(mo72818localToRootMKHz9U), Offset.m71502getXimpl(mo72818localToRootMKHz9U2)), Math.min(Offset.m71503getYimpl(layoutCoordinates3.mo72818localToRootMKHz9U(layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m71503getYimpl(layoutCoordinates3.mo72818localToRootMKHz9U(layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m71502getXimpl(mo72818localToRootMKHz9U), Offset.m71502getXimpl(mo72818localToRootMKHz9U2)), Math.max(Offset.m71503getYimpl(mo72818localToRootMKHz9U), Offset.m71503getYimpl(mo72818localToRootMKHz9U2)) + ((float) (SelectionHandlesKt.getHandleHeight() * 4.0d)));
                }
                return Rect.Companion.getZero();
            }
            return Rect.Companion.getZero();
        }
        return Rect.Companion.getZero();
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m69863contextMenuOpenAdjustmentk4lQ0M(long j) {
        boolean z;
        Selection selection = getSelection();
        if (selection != null) {
            z = TextRange.m73210getCollapsedimpl(selection.m69842toTextRanged9O1mEE());
        } else {
            z = true;
        }
        if (z) {
            m60982l(j, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null && (clipboardManager = this.f14254f) != null) {
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    /* renamed from: d */
    public final boolean m60990d() {
        if (getDraggingHandle() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final Modifier m60989e(Modifier modifier, Function0 function0) {
        if (getHasFocus()) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SelectionManager$onClearSelectionRequested$1(this, function0, null));
        }
        return modifier;
    }

    /* renamed from: f */
    public final void m60988f(Offset offset) {
        this.f14265q.setValue(offset);
    }

    /* renamed from: g */
    public final void m60987g(long j) {
        this.f14260l.setValue(Offset.m71491boximpl(j));
    }

    @Nullable
    public final Selectable getAnchorSelectable$foundation_release(@NotNull Selection.AnchorInfo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return this.f14249a.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.f14254f;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.f14259k;
    }

    @Nullable
    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m69864getCurrentDragPosition_m7T9E() {
        return (Offset) this.f14265q.getValue();
    }

    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m69865getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.f14260l.getValue()).m71512unboximpl();
    }

    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m69866getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.f14261m.getValue()).m71512unboximpl();
    }

    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.f14264p.getValue();
    }

    @Nullable
    /* renamed from: getEndHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m69867getEndHandlePosition_m7T9E() {
        return (Offset) this.f14263o.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.f14256h;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.f14253e;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.f14257i.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(m60989e(modifier, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.f14256h), new SelectionManager$modifier$3(this)), false, null, 3, null), new SelectionManager$modifier$4(this));
        if (m60990d()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    @NotNull
    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.f14252d;
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString plus;
        List<Selectable> sort = this.f14249a.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (plus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = plus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    @Nullable
    public final Selection getSelection() {
        return (Selection) this.f14250b.getValue();
    }

    @Nullable
    /* renamed from: getStartHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m69868getStartHandlePosition_m7T9E() {
        return (Offset) this.f14262n.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.f14255g;
    }

    public final boolean getTouchMode() {
        return this.f14251c;
    }

    /* renamed from: h */
    public final void m60986h(long j) {
        this.f14261m.setValue(Offset.m71491boximpl(j));
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.m60985i(null);
                SelectionManager.this.m60988f(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo69776onDownk4lQ0M(long j) {
                Selection.AnchorInfo end;
                LayoutCoordinates layoutCoordinates;
                Handle handle;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                if (z) {
                    end = selection.getStart();
                } else {
                    end = selection.getEnd();
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(end);
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long m69851getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo69835getHandlePositiondBAh8RU(selection, z));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m60988f(Offset.m71491boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo72817localPositionOfR5De75A(layoutCoordinates, m69851getAdjustedCoordinatesk4lQ0M)));
                SelectionManager selectionManager2 = SelectionManager.this;
                if (z) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                selectionManager2.m60985i(handle);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo69777onDragk4lQ0M(long j) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m60986h(Offset.m71507plusMKHz9U(selectionManager.m69866getDragTotalDistanceF1C5BW0$foundation_release(), j));
                long m71507plusMKHz9U = Offset.m71507plusMKHz9U(SelectionManager.this.m69865getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m69866getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m69870updateSelectionRHHTvR4$foundation_release(Offset.m71491boximpl(m71507plusMKHz9U), Offset.m71491boximpl(SelectionManager.this.m69865getDragBeginPositionF1C5BW0$foundation_release()), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m60987g(m71507plusMKHz9U);
                    SelectionManager.this.m60986h(Offset.Companion.m71518getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo69778onStartk4lQ0M(long j) {
                long mo69835getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = SelectionManager.this.f14249a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.f14249a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                LayoutCoordinates layoutCoordinates = null;
                if (z) {
                    if (selectable != null) {
                        layoutCoordinates = selectable.getLayoutCoordinates();
                    }
                    Intrinsics.checkNotNull(layoutCoordinates);
                } else {
                    if (selectable2 != null) {
                        layoutCoordinates = selectable2.getLayoutCoordinates();
                    }
                    Intrinsics.checkNotNull(layoutCoordinates);
                }
                if (z) {
                    Intrinsics.checkNotNull(selectable);
                    mo69835getHandlePositiondBAh8RU = selectable.mo69835getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    mo69835getHandlePositiondBAh8RU = selectable2.mo69835getHandlePositiondBAh8RU(selection, false);
                }
                long m69851getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(mo69835getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m60987g(selectionManager.requireContainerCoordinates$foundation_release().mo72817localPositionOfR5De75A(layoutCoordinates, m69851getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m60986h(Offset.Companion.m71518getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.m60985i(null);
                SelectionManager.this.m60988f(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.m60985i(null);
                SelectionManager.this.m60988f(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.f14255g;
            if (textToolbar2 != null) {
                textToolbarStatus = textToolbar2.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar = this.f14255g) != null) {
                textToolbar.hide();
            }
        }
    }

    /* renamed from: i */
    public final void m60985i(Handle handle) {
        this.f14264p.setValue(handle);
    }

    /* renamed from: j */
    public final void m60984j(Offset offset) {
        this.f14263o.setValue(offset);
    }

    /* renamed from: k */
    public final void m60983k(Offset offset) {
        this.f14262n.setValue(offset);
    }

    /* renamed from: l */
    public final void m60982l(long j, boolean z, SelectionAdjustment selectionAdjustment) {
        m69869updateSelection3R_tFg$foundation_release(j, j, null, z, selectionAdjustment);
    }

    /* renamed from: m */
    public final void m60981m() {
        Selectable selectable;
        Selectable selectable2;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates3 = this.f14259k;
        Offset offset = null;
        if (selection != null && (start = selection.getStart()) != null) {
            selectable = getAnchorSelectable$foundation_release(start);
        } else {
            selectable = null;
        }
        if (selection != null && (end = selection.getEnd()) != null) {
            selectable2 = getAnchorSelectable$foundation_release(end);
        } else {
            selectable2 = null;
        }
        if (selectable != null) {
            layoutCoordinates = selectable.getLayoutCoordinates();
        } else {
            layoutCoordinates = null;
        }
        if (selectable2 != null) {
            layoutCoordinates2 = selectable2.getLayoutCoordinates();
        } else {
            layoutCoordinates2 = null;
        }
        if (selection != null && layoutCoordinates3 != null && layoutCoordinates3.isAttached() && layoutCoordinates != null && layoutCoordinates2 != null) {
            long mo72817localPositionOfR5De75A = layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates, selectable.mo69835getHandlePositiondBAh8RU(selection, true));
            long mo72817localPositionOfR5De75A2 = layoutCoordinates3.mo72817localPositionOfR5De75A(layoutCoordinates2, selectable2.mo69835getHandlePositiondBAh8RU(selection, false));
            Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates3);
            Offset m71491boximpl = Offset.m71491boximpl(mo72817localPositionOfR5De75A);
            m71491boximpl.m71512unboximpl();
            if (!SelectionManagerKt.m69876containsInclusiveUv8p0NA(visibleBounds, mo72817localPositionOfR5De75A) && getDraggingHandle() != Handle.SelectionStart) {
                m71491boximpl = null;
            }
            m60983k(m71491boximpl);
            Offset m71491boximpl2 = Offset.m71491boximpl(mo72817localPositionOfR5De75A2);
            m71491boximpl2.m71512unboximpl();
            if (SelectionManagerKt.m69876containsInclusiveUv8p0NA(visibleBounds, mo72817localPositionOfR5De75A2) || getDraggingHandle() == Handle.SelectionEnd) {
                offset = m71491boximpl2;
            }
            m60984j(offset);
            return;
        }
        m60983k(null);
        m60984j(null);
    }

    /* renamed from: n */
    public final void m60980n() {
        TextToolbarStatus textToolbarStatus;
        if (getHasFocus()) {
            TextToolbar textToolbar = this.f14255g;
            if (textToolbar != null) {
                textToolbarStatus = textToolbar.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void onRelease() {
        this.f14249a.setSubselections(AbstractC11687a.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.f14252d.invoke(null);
            HapticFeedback hapticFeedback = this.f14253e;
            if (hapticFeedback != null) {
                hapticFeedback.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
            }
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.f14259k;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                return layoutCoordinates;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long j, @Nullable Selection selection) {
        HapticFeedback hapticFeedback;
        Selection selection2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.f14249a.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection3 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            if (selectable.getSelectableId() == j) {
                selection2 = selectable.getSelectAllSelection();
            } else {
                selection2 = null;
            }
            if (selection2 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection2);
            }
            selection3 = SelectionManagerKt.merge(selection3, selection2);
        }
        if (!Intrinsics.areEqual(selection3, selection) && (hapticFeedback = this.f14253e) != null) {
            hapticFeedback.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection3, linkedHashMap);
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager) {
        this.f14254f = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        Offset offset;
        this.f14259k = layoutCoordinates;
        if (getHasFocus() && getSelection() != null) {
            if (layoutCoordinates != null) {
                offset = Offset.m71491boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
            } else {
                offset = null;
            }
            if (!Intrinsics.areEqual(this.f14258j, offset)) {
                this.f14258j = offset;
                m60981m();
                m60980n();
            }
        }
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f14256h = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.f14253e = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.f14257i.setValue(Boolean.valueOf(z));
    }

    public final void setOnSelectionChange(@NotNull Function1<? super Selection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f14252d = function1;
    }

    public final void setSelection(@Nullable Selection selection) {
        this.f14250b.setValue(selection);
        if (selection != null) {
            m60981m();
        }
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.f14255g = textToolbar;
    }

    public final void setTouchMode(boolean z) {
        this.f14251c = z;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus() && getSelection() != null && (textToolbar = this.f14255g) != null) {
            AbstractC21074mS1.m26255a(textToolbar, m60991c(), new SelectionManager$showSelectionToolbar$1$1(this), null, null, null, 28, null);
        }
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release  reason: not valid java name */
    public final boolean m69869updateSelection3R_tFg$foundation_release(long j, long j2, @Nullable Offset offset, boolean z, @NotNull SelectionAdjustment adjustment) {
        Handle handle;
        Offset m71491boximpl;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (z) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        m60985i(handle);
        if (z) {
            m71491boximpl = Offset.m71491boximpl(j);
        } else {
            m71491boximpl = Offset.m71491boximpl(j2);
        }
        m60988f(m71491boximpl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.f14249a.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Selectable selectable = sort.get(i);
            int i2 = i;
            Selection selection2 = selection;
            Pair<Selection, Boolean> mo69837updateSelectionqCDeeow = selectable.mo69837updateSelectionqCDeeow(j, j2, offset, z, requireContainerCoordinates$foundation_release(), adjustment, this.f14249a.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection component1 = mo69837updateSelectionqCDeeow.component1();
            boolean booleanValue = mo69837updateSelectionqCDeeow.component2().booleanValue();
            if (!z2 && !booleanValue) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (component1 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), component1);
            }
            selection = SelectionManagerKt.merge(selection2, component1);
            i = i2 + 1;
        }
        Selection selection3 = selection;
        if (!Intrinsics.areEqual(selection3, getSelection())) {
            HapticFeedback hapticFeedback = this.f14253e;
            if (hapticFeedback != null) {
                hapticFeedback.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
            }
            this.f14249a.setSubselections(linkedHashMap);
            this.f14252d.invoke(selection3);
        }
        return z2;
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release  reason: not valid java name */
    public final boolean m69870updateSelectionRHHTvR4$foundation_release(@Nullable Offset offset, @Nullable Offset offset2, boolean z, @NotNull SelectionAdjustment adjustment) {
        Selection selection;
        long selectableId;
        Offset m60993a;
        long j;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (offset == null || (selection = getSelection()) == null) {
            return false;
        }
        if (z) {
            selectableId = selection.getEnd().getSelectableId();
        } else {
            selectableId = selection.getStart().getSelectableId();
        }
        Selectable selectable = this.f14249a.getSelectableMap$foundation_release().get(Long.valueOf(selectableId));
        if (selectable == null) {
            m60993a = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates);
            m60993a = m60993a(layoutCoordinates, SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(selectable.mo69835getHandlePositiondBAh8RU(selection, !z)));
        }
        if (m60993a == null) {
            return false;
        }
        long m71512unboximpl = m60993a.m71512unboximpl();
        if (z) {
            j = offset.m71512unboximpl();
        } else {
            j = m71512unboximpl;
        }
        if (!z) {
            m71512unboximpl = offset.m71512unboximpl();
        }
        return m69869updateSelection3R_tFg$foundation_release(j, m71512unboximpl, offset2, z, adjustment);
    }
}
