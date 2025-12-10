package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.TextToolbarStatus;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.PasswordVisualTransformation;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.TextFieldValueKt;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010(\u001a\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u0012H\u0000¢\u0006\u0004\b)\u0010'J!\u0010/\u001a\u00020\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0019\u00103\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020\u0012H\u0000¢\u0006\u0004\b4\u0010'J\u000f\u00107\u001a\u00020\u0012H\u0000¢\u0006\u0004\b6\u0010'J\u000f\u00109\u001a\u00020\u0012H\u0000¢\u0006\u0004\b8\u0010'J \u0010<\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J \u0010A\u001a\u00020+2\u0006\u0010>\u001a\u00020=H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u000f\u0010C\u001a\u00020\u0012H\u0000¢\u0006\u0004\bB\u0010'J\u000f\u0010E\u001a\u00020\u0012H\u0000¢\u0006\u0004\bD\u0010'J\u001b\u0010H\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ\u000f\u0010K\u001a\u00020\u000eH\u0000¢\u0006\u0004\bI\u0010JR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\bM\u0010NR\"\u0010U\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR+\u0010\n\u001a\u00020\t2\u0006\u0010f\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010r\u001a\u00020l8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010z\u001a\u0004\u0018\u00010s8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R/\u0010\u0096\u0001\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010g\u001a\u0005\b\u0094\u0001\u0010J\"\u0005\b\u0095\u0001\u00102R\"\u0010\u0099\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\"\u0010\u009e\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0098\u0001R6\u0010¤\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010f\u001a\u0005\u0018\u00010\u009f\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b \u0001\u0010g\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b_\u0010£\u0001R<\u0010¨\u0001\u001a\u0004\u0018\u00010+2\b\u0010f\u001a\u0004\u0018\u00010+8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010g\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0004\bW\u0010.R\u0019\u0010«\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¯\u0001\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010$R \u0010µ\u0001\u001a\u00030°\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006¶\u0001"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "Landroidx/compose/ui/geometry/Rect;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "transformedStartOffset", "transformedEndOffset", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/text/input/TextFieldValue;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "Landroidx/compose/foundation/text/HandleState;", "handleState", "e", "(Landroidx/compose/foundation/text/HandleState;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "enterSelectionMode$foundation_release", "()V", "enterSelectionMode", "exitSelectionMode$foundation_release", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "(Z)V", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "offsetMapping", "Lkotlin/Function1;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/TextFieldState;", "d", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "<set-?>", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "visualTransformation", "Landroidx/compose/ui/platform/ClipboardManager;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "i", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/FocusRequester;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", OperatorName.NON_STROKING_CMYK, "getEditable", "setEditable", "editable", OperatorName.LINE_TO, OperatorName.SET_LINE_CAPSTYLE, "dragBeginPosition", OperatorName.MOVE_TO, "Ljava/lang/Integer;", "dragBeginOffsetInText", OperatorName.ENDPATH, "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "o", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "p", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", OperatorName.SAVE, "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n81#2:907\n107#2,2:908\n81#2:910\n107#2,2:911\n81#2:913\n107#2,2:914\n81#2:916\n107#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {

    /* renamed from: a */
    public final UndoManager f14285a;

    /* renamed from: b */
    public OffsetMapping f14286b;

    /* renamed from: c */
    public Function1 f14287c;

    /* renamed from: d */
    public TextFieldState f14288d;

    /* renamed from: e */
    public final MutableState f14289e;

    /* renamed from: f */
    public VisualTransformation f14290f;

    /* renamed from: g */
    public ClipboardManager f14291g;

    /* renamed from: h */
    public TextToolbar f14292h;

    /* renamed from: i */
    public HapticFeedback f14293i;

    /* renamed from: j */
    public FocusRequester f14294j;

    /* renamed from: k */
    public final MutableState f14295k;

    /* renamed from: l */
    public long f14296l;

    /* renamed from: m */
    public Integer f14297m;

    /* renamed from: n */
    public long f14298n;

    /* renamed from: o */
    public final MutableState f14299o;

    /* renamed from: p */
    public final MutableState f14300p;

    /* renamed from: q */
    public TextFieldValue f14301q;

    /* renamed from: r */
    public final TextDragObserver f14302r;

    /* renamed from: s */
    public final MouseSelectionObserver f14303s;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m69888deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m69890deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: a */
    public final TextFieldValue m60975a(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final Rect m60974b() {
        long m71518getZeroF1C5BW0;
        long m71518getZeroF1C5BW02;
        float f;
        LayoutCoordinates layoutCoordinates;
        float f2;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        float f3;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.f14286b.originalToTransformed(TextRange.m73216getStartimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()));
                int originalToTransformed2 = this.f14286b.originalToTransformed(TextRange.m73211getEndimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.f14288d;
                if (textFieldState2 != null && (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) != null) {
                    m71518getZeroF1C5BW0 = layoutCoordinates4.mo72818localToRootMKHz9U(m69893getHandlePositiontuRUvjQ$foundation_release(true));
                } else {
                    m71518getZeroF1C5BW0 = Offset.Companion.m71518getZeroF1C5BW0();
                }
                TextFieldState textFieldState3 = this.f14288d;
                if (textFieldState3 != null && (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) != null) {
                    m71518getZeroF1C5BW02 = layoutCoordinates3.mo72818localToRootMKHz9U(m69893getHandlePositiontuRUvjQ$foundation_release(false));
                } else {
                    m71518getZeroF1C5BW02 = Offset.Companion.m71518getZeroF1C5BW0();
                }
                TextFieldState textFieldState4 = this.f14288d;
                float f4 = 0.0f;
                if (textFieldState4 != null && (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult != null && (value2 = layoutResult.getValue()) != null && (cursorRect2 = value2.getCursorRect(originalToTransformed)) != null) {
                        f3 = cursorRect2.getTop();
                    } else {
                        f3 = 0.0f;
                    }
                    f = Offset.m71503getYimpl(layoutCoordinates2.mo72818localToRootMKHz9U(OffsetKt.Offset(0.0f, f3)));
                } else {
                    f = 0.0f;
                }
                TextFieldState textFieldState5 = this.f14288d;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    if (layoutResult2 != null && (value = layoutResult2.getValue()) != null && (cursorRect = value.getCursorRect(originalToTransformed2)) != null) {
                        f2 = cursorRect.getTop();
                    } else {
                        f2 = 0.0f;
                    }
                    f4 = Offset.m71503getYimpl(layoutCoordinates.mo72818localToRootMKHz9U(OffsetKt.Offset(0.0f, f2)));
                }
                return new Rect(Math.min(Offset.m71502getXimpl(m71518getZeroF1C5BW0), Offset.m71502getXimpl(m71518getZeroF1C5BW02)), Math.min(f, f4), Math.max(Offset.m71502getXimpl(m71518getZeroF1C5BW0), Offset.m71502getXimpl(m71518getZeroF1C5BW02)), Math.max(Offset.m71503getYimpl(m71518getZeroF1C5BW0), Offset.m71503getYimpl(m71518getZeroF1C5BW02)) + (C3641Dp.m73658constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* renamed from: c */
    public final void m60973c(Offset offset) {
        this.f14300p.setValue(offset);
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m69889contextMenuOpenAdjustmentk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            int m69803getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null);
            if (!TextRange.m73207containsimpl(getValue$foundation_release().m73425getSelectiond9O1mEE(), m69803getOffsetForPosition3MmeM6k$default)) {
                m60970f(getValue$foundation_release(), m69803getOffsetForPosition3MmeM6k$default, m69803getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
            }
        }
    }

    public final void copy$foundation_release(boolean z) {
        if (TextRange.m73210getCollapsedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.f14291g;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (!z) {
            return;
        }
        int m73213getMaximpl = TextRange.m73213getMaximpl(getValue$foundation_release().m73425getSelectiond9O1mEE());
        this.f14287c.invoke(m60975a(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m73213getMaximpl, m73213getMaximpl)));
        m60971e(HandleState.None);
    }

    @NotNull
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo69776onDownk4lQ0M(long j) {
                TextFieldSelectionManager.this.m60972d(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m60973c(Offset.m71491boximpl(SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m69893getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo69777onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j3;
                long j4;
                TextFieldValue m60975a;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.f14298n;
                textFieldSelectionManager.f14298n = Offset.m71507plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager2.f14296l;
                    j4 = textFieldSelectionManager2.f14298n;
                    textFieldSelectionManager2.m60973c(Offset.m71491boximpl(Offset.m71507plusMKHz9U(j3, j4)));
                    OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                    Offset m69891getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m69891getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m69891getCurrentDragPosition_m7T9E);
                    int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(value.m73189getOffsetForPositionk4lQ0M(m69891getCurrentDragPosition_m7T9E.m71512unboximpl()));
                    long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                    if (TextRange.m73209equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m73425getSelectiond9O1mEE())) {
                        return;
                    }
                    HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
                    }
                    Function1<TextFieldValue, Unit> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                    m60975a = textFieldSelectionManager2.m60975a(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                    onValueChange$foundation_release.invoke(m60975a);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo69778onStartk4lQ0M(long j) {
                long j2;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.f14296l = SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m69893getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.f14296l;
                textFieldSelectionManager2.m60973c(Offset.m71491boximpl(j2));
                TextFieldSelectionManager.this.f14298n = Offset.Companion.m71518getZeroF1C5BW0();
                TextFieldSelectionManager.this.m60972d(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.m60972d(null);
                TextFieldSelectionManager.this.m60973c(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.m60972d(null);
                TextFieldSelectionManager.this.m60973c(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m73210getCollapsedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.f14291g;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m73214getMinimpl = TextRange.m73214getMinimpl(getValue$foundation_release().m73425getSelectiond9O1mEE());
        this.f14287c.invoke(m60975a(plus, TextRangeKt.TextRange(m73214getMinimpl, m73214getMinimpl)));
        m60971e(HandleState.None);
        UndoManager undoManager = this.f14285a;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* renamed from: d */
    public final void m60972d(Handle handle) {
        this.f14299o.setValue(handle);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m69890deselect_kEHs6E$foundation_release(@Nullable Offset offset) {
        HandleState handleState;
        TextLayoutResultProxy textLayoutResultProxy;
        int m73213getMaximpl;
        if (!TextRange.m73210getCollapsedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.f14288d;
            if (textFieldState != null) {
                textLayoutResultProxy = textFieldState.getLayoutResult();
            } else {
                textLayoutResultProxy = null;
            }
            TextLayoutResultProxy textLayoutResultProxy2 = textLayoutResultProxy;
            if (offset != null && textLayoutResultProxy2 != null) {
                m73213getMaximpl = this.f14286b.transformedToOriginal(TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(textLayoutResultProxy2, offset.m71512unboximpl(), false, 2, null));
            } else {
                m73213getMaximpl = TextRange.m73213getMaximpl(getValue$foundation_release().m73425getSelectiond9O1mEE());
            }
            this.f14287c.invoke(TextFieldValue.m73420copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m73213getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (offset != null && getValue$foundation_release().getText().length() > 0) {
            handleState = HandleState.Cursor;
        } else {
            handleState = HandleState.None;
        }
        m60971e(handleState);
        hideSelectionToolbar$foundation_release();
    }

    /* renamed from: e */
    public final void m60971e(HandleState handleState) {
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null && !textFieldState.getHasFocus() && (focusRequester = this.f14294j) != null) {
            focusRequester.requestFocus();
        }
        this.f14301q = getValue$foundation_release();
        TextFieldState textFieldState2 = this.f14288d;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        m60971e(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        m60971e(HandleState.None);
    }

    /* renamed from: f */
    public final void m60970f(TextFieldValue textFieldValue, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult textLayoutResult;
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.f14286b.originalToTransformed(TextRange.m73216getStartimpl(textFieldValue.m73425getSelectiond9O1mEE())), this.f14286b.originalToTransformed(TextRange.m73211getEndimpl(textFieldValue.m73425getSelectiond9O1mEE())));
        TextFieldState textFieldState = this.f14288d;
        TextRange textRange = null;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            textLayoutResult = layoutResult.getValue();
        } else {
            textLayoutResult = null;
        }
        if (!TextRange.m73210getCollapsedimpl(TextRange)) {
            textRange = TextRange.m73204boximpl(TextRange);
        }
        long m69885getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m69885getTextFieldSelectionbb3KNj8(textLayoutResult, i, i2, textRange, z, selectionAdjustment);
        long TextRange2 = TextRangeKt.TextRange(this.f14286b.transformedToOriginal(TextRange.m73216getStartimpl(m69885getTextFieldSelectionbb3KNj8)), this.f14286b.transformedToOriginal(TextRange.m73211getEndimpl(m69885getTextFieldSelectionbb3KNj8)));
        if (TextRange.m73209equalsimpl0(TextRange2, textFieldValue.m73425getSelectiond9O1mEE())) {
            return;
        }
        HapticFeedback hapticFeedback = this.f14293i;
        if (hapticFeedback != null) {
            hapticFeedback.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
        }
        this.f14287c.invoke(m60975a(textFieldValue.getAnnotatedString(), TextRange2));
        TextFieldState textFieldState2 = this.f14288d;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.f14288d;
        if (textFieldState3 != null) {
            textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
    }

    @Nullable
    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.f14291g;
    }

    @Nullable
    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m69891getCurrentDragPosition_m7T9E() {
        return (Offset) this.f14300p.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m69892getCursorPositiontuRUvjQ$foundation_release(@NotNull Density density) {
        TextLayoutResultProxy textLayoutResultProxy;
        Intrinsics.checkNotNullParameter(density, "density");
        int originalToTransformed = this.f14286b.originalToTransformed(TextRange.m73216getStartimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        Intrinsics.checkNotNull(textLayoutResultProxy);
        TextLayoutResult value = textLayoutResultProxy.getValue();
        Rect cursorRect = value.getCursorRect(AbstractC11719c.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo69438toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.f14299o.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean) this.f14295k.getValue()).booleanValue();
    }

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.f14294j;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m69893getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        int m73211getEndimpl;
        TextLayoutResultProxy textLayoutResultProxy;
        long m73425getSelectiond9O1mEE = getValue$foundation_release().m73425getSelectiond9O1mEE();
        if (z) {
            m73211getEndimpl = TextRange.m73216getStartimpl(m73425getSelectiond9O1mEE);
        } else {
            m73211getEndimpl = TextRange.m73211getEndimpl(m73425getSelectiond9O1mEE);
        }
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        Intrinsics.checkNotNull(textLayoutResultProxy);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultProxy.getValue(), this.f14286b.originalToTransformed(m73211getEndimpl), z, TextRange.m73215getReversedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()));
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.f14293i;
    }

    @NotNull
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.f14303s;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.f14286b;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.f14287c;
    }

    @Nullable
    public final TextFieldState getState$foundation_release() {
        return this.f14288d;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.f14292h;
    }

    @NotNull
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.f14302r;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.f14285a;
    }

    @NotNull
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.f14289e.getValue();
    }

    @NotNull
    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.f14290f;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo69776onDownk4lQ0M(long j) {
                Handle handle;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (z) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                textFieldSelectionManager.m60972d(handle);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                textFieldSelectionManager2.m60973c(Offset.m71491boximpl(SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager2.m69893getHandlePositiontuRUvjQ$foundation_release(z))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo69777onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j3;
                long j4;
                int originalToTransformed;
                int m73189getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.f14298n;
                textFieldSelectionManager.f14298n = Offset.m71507plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    boolean z2 = z;
                    j3 = textFieldSelectionManager2.f14296l;
                    j4 = textFieldSelectionManager2.f14298n;
                    textFieldSelectionManager2.m60973c(Offset.m71491boximpl(Offset.m71507plusMKHz9U(j3, j4)));
                    if (z2) {
                        Offset m69891getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m69891getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m69891getCurrentDragPosition_m7T9E);
                        originalToTransformed = value.m73189getOffsetForPositionk4lQ0M(m69891getCurrentDragPosition_m7T9E.m71512unboximpl());
                    } else {
                        originalToTransformed = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73216getStartimpl(textFieldSelectionManager2.getValue$foundation_release().m73425getSelectiond9O1mEE()));
                    }
                    int i = originalToTransformed;
                    if (z2) {
                        m73189getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73211getEndimpl(textFieldSelectionManager2.getValue$foundation_release().m73425getSelectiond9O1mEE()));
                    } else {
                        Offset m69891getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m69891getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m69891getCurrentDragPosition_m7T9E2);
                        m73189getOffsetForPositionk4lQ0M = value.m73189getOffsetForPositionk4lQ0M(m69891getCurrentDragPosition_m7T9E2.m71512unboximpl());
                    }
                    textFieldSelectionManager2.m60970f(textFieldSelectionManager2.getValue$foundation_release(), i, m73189getOffsetForPositionk4lQ0M, z2, SelectionAdjustment.Companion.getCharacter());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo69778onStartk4lQ0M(long j) {
                long j2;
                Handle handle;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.f14296l = SelectionHandlesKt.m69851getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m69893getHandlePositiontuRUvjQ$foundation_release(z));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.f14296l;
                textFieldSelectionManager2.m60973c(Offset.m71491boximpl(j2));
                TextFieldSelectionManager.this.f14298n = Offset.Companion.m71518getZeroF1C5BW0();
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                if (z) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                textFieldSelectionManager3.m60972d(handle);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextToolbarStatus textToolbarStatus = null;
                TextFieldSelectionManager.this.m60972d(null);
                TextFieldSelectionManager.this.m60973c(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if (textToolbar != null) {
                    textToolbarStatus = textToolbar.getStatus();
                }
                if (textToolbarStatus == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.m60972d(null);
                TextFieldSelectionManager.this.m60973c(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.f14292h;
        if (textToolbar2 != null) {
            textToolbarStatus = textToolbar2.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar = this.f14292h) != null) {
            textToolbar.hide();
        }
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.f14301q.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.f14291g;
        if (clipboardManager != null && (text = clipboardManager.getText()) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int m73214getMinimpl = TextRange.m73214getMinimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()) + text.length();
            this.f14287c.invoke(m60975a(plus, TextRangeKt.TextRange(m73214getMinimpl, m73214getMinimpl)));
            m60971e(HandleState.None);
            UndoManager undoManager = this.f14285a;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m60975a = m60975a(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.f14287c.invoke(m60975a);
        this.f14301q = TextFieldValue.m73420copy3r_uNRQ$default(this.f14301q, (AnnotatedString) null, m60975a.m73425getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.f14288d;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
    }

    public final void setClipboardManager$foundation_release(@Nullable ClipboardManager clipboardManager) {
        this.f14291g = clipboardManager;
    }

    public final void setEditable(boolean z) {
        this.f14295k.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester) {
        this.f14294j = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.f14293i = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.f14286b = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@NotNull Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f14287c = function1;
    }

    public final void setState$foundation_release(@Nullable TextFieldState textFieldState) {
        this.f14288d = textFieldState;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.f14292h = textToolbar;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.f14289e.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.f14290f = visualTransformation;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextFieldSelectionManager$showSelectionToolbar$copy$1 textFieldSelectionManager$showSelectionToolbar$copy$1;
        TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$1;
        TextFieldSelectionManager$showSelectionToolbar$paste$1 textFieldSelectionManager$showSelectionToolbar$paste$1;
        ClipboardManager clipboardManager;
        boolean z = this.f14290f instanceof PasswordVisualTransformation;
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$1 = null;
        if (!TextRange.m73210getCollapsedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()) && !z) {
            textFieldSelectionManager$showSelectionToolbar$copy$1 = new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$copy$1 = null;
        }
        if (!TextRange.m73210getCollapsedimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()) && getEditable() && !z) {
            textFieldSelectionManager$showSelectionToolbar$cut$1 = new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$cut$1 = null;
        }
        if (getEditable() && (clipboardManager = this.f14291g) != null && clipboardManager.hasText()) {
            textFieldSelectionManager$showSelectionToolbar$paste$1 = new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$paste$1 = null;
        }
        if (TextRange.m73212getLengthimpl(getValue$foundation_release().m73425getSelectiond9O1mEE()) != getValue$foundation_release().getText().length()) {
            textFieldSelectionManager$showSelectionToolbar$selectAll$1 = new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this);
        }
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$12 = textFieldSelectionManager$showSelectionToolbar$selectAll$1;
        TextToolbar textToolbar = this.f14292h;
        if (textToolbar != null) {
            textToolbar.showMenu(m60974b(), textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$12);
        }
    }

    public TextFieldSelectionManager(@Nullable UndoManager undoManager) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        this.f14285a = undoManager;
        this.f14286b = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.f14287c = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        m31891g = AbstractC19508dK1.m31891g(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.f14289e = m31891g;
        this.f14290f = VisualTransformation.Companion.getNone();
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
        this.f14295k = m31891g2;
        Offset.Companion companion = Offset.Companion;
        this.f14296l = companion.m71518getZeroF1C5BW0();
        this.f14298n = companion.m71518getZeroF1C5BW0();
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14299o = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14300p = m31891g4;
        this.f14301q = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.f14302r = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo69776onDownk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo69777onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                Integer num;
                long j5;
                int m69804getOffsetForPosition3MmeM6k;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.f14298n;
                textFieldSelectionManager.f14298n = Offset.m71507plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager2.f14296l;
                    j4 = textFieldSelectionManager2.f14298n;
                    textFieldSelectionManager2.m60973c(Offset.m71491boximpl(Offset.m71507plusMKHz9U(j3, j4)));
                    num = textFieldSelectionManager2.f14297m;
                    if (num == null) {
                        j5 = textFieldSelectionManager2.f14296l;
                        m69804getOffsetForPosition3MmeM6k = layoutResult.m69804getOffsetForPosition3MmeM6k(j5, false);
                    } else {
                        m69804getOffsetForPosition3MmeM6k = num.intValue();
                    }
                    int i = m69804getOffsetForPosition3MmeM6k;
                    Offset m69891getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m69891getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m69891getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.m60970f(textFieldSelectionManager2.getValue$foundation_release(), i, layoutResult.m69804getOffsetForPosition3MmeM6k(m69891getCurrentDragPosition_m7T9E.m71512unboximpl(), false), false, SelectionAdjustment.Companion.getWord());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo69778onStartk4lQ0M(long j) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m60975a;
                long j2;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                if (TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    TextFieldSelectionManager.this.m60972d(Handle.SelectionEnd);
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                    if ((state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m69805isPositionOnTextk4lQ0M(j)) && (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult, layoutResult.getLineForVerticalPosition(Offset.m71503getYimpl(j)), false, 2, null));
                        HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo72269performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m72278getTextHandleMove5zf0vsI());
                        }
                        m60975a = textFieldSelectionManager.m60975a(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                        textFieldSelectionManager.enterSelectionMode$foundation_release();
                        textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m60975a);
                    } else if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    } else {
                        TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                        TextFieldState state$foundation_release3 = TextFieldSelectionManager.this.getState$foundation_release();
                        if (state$foundation_release3 != null && (layoutResult2 = state$foundation_release3.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                            int m69803getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(layoutResult2, j, false, 2, null);
                            textFieldSelectionManager2.m60970f(textFieldSelectionManager2.getValue$foundation_release(), m69803getOffsetForPosition3MmeM6k$default, m69803getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
                            textFieldSelectionManager2.f14297m = Integer.valueOf(m69803getOffsetForPosition3MmeM6k$default);
                        }
                        TextFieldSelectionManager.this.f14296l = j;
                        TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                        j2 = textFieldSelectionManager3.f14296l;
                        textFieldSelectionManager3.m60973c(Offset.m71491boximpl(j2));
                        TextFieldSelectionManager.this.f14298n = Offset.Companion.m71518getZeroF1C5BW0();
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextToolbarStatus textToolbarStatus;
                TextFieldSelectionManager.this.m60972d(null);
                TextFieldSelectionManager.this.m60973c(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if (textToolbar != null) {
                    textToolbarStatus = textToolbar.getStatus();
                } else {
                    textToolbarStatus = null;
                }
                if (textToolbarStatus == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
                TextFieldSelectionManager.this.f14297m = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.f14303s = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo69822onDrag3MmeM6k(long j, @NotNull SelectionAdjustment adjustment) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                Integer num;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int m69804getOffsetForPosition3MmeM6k = layoutResult.m69804getOffsetForPosition3MmeM6k(j, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                num = textFieldSelectionManager.f14297m;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.m60970f(value$foundation_release, num.intValue(), m69804getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo69823onExtendk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textFieldSelectionManager.m60970f(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73216getStartimpl(textFieldSelectionManager.getValue$foundation_release().m73425getSelectiond9O1mEE())), TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null), false, SelectionAdjustment.Companion.getNone());
                    return true;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo69824onExtendDragk4lQ0M(long j) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m60970f(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73216getStartimpl(textFieldSelectionManager.getValue$foundation_release().m73425getSelectiond9O1mEE())), layoutResult.m69804getOffsetForPosition3MmeM6k(j, false), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo69825onStart3MmeM6k(long j, @NotNull SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                long j2;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.f14296l = j;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textFieldSelectionManager.f14297m = Integer.valueOf(TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null));
                    j2 = textFieldSelectionManager.f14296l;
                    int m69803getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m69803getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null);
                    textFieldSelectionManager.m60970f(textFieldSelectionManager.getValue$foundation_release(), m69803getOffsetForPosition3MmeM6k$default, m69803getOffsetForPosition3MmeM6k$default, false, adjustment);
                    return true;
                }
                return false;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }
}
