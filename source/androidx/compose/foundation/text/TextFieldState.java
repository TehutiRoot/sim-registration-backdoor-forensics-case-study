package androidx.compose.foundation.text;

import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.input.EditProcessor;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.TextInputSession;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jo\u0010\u001f\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010?\u001a\u00020\r2\u0006\u00108\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R4\u0010F\u001a\u00020@2\u0006\u00108\u001a\u00020@8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010:R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010_\u001a\u00020Y2\u0006\u00108\u001a\u00020Y8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010:\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010d\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010<\"\u0004\bc\u0010>R+\u0010h\u001a\u00020\r2\u0006\u00108\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010:\u001a\u0004\bf\u0010<\"\u0004\bg\u0010>R+\u0010l\u001a\u00020\r2\u0006\u00108\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010:\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R+\u0010p\u001a\u00020\r2\u0006\u00108\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010:\u001a\u0004\bn\u0010<\"\u0004\bo\u0010>R$\u0010r\u001a\u00020\r2\u0006\u00108\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010a\u001a\u0004\br\u0010<R\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\bz\u0010x\u001a\u0004\b{\u0010|R'\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u00150\u00138\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b~\u0010x\u001a\u0004\b\u007f\u0010|R\u001d\u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R.\u0010\u008c\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u008d\u0001"}, m28850d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;)V", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/ui/text/input/EditProcessor;", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/TextInputSession;", "d", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", OperatorName.FILL_NON_ZERO, "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", OperatorName.CLOSE_PATH, "layoutResultState", "i", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", OperatorName.SET_LINE_JOINSTYLE, "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", OperatorName.NON_STROKING_CMYK, "Z", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar", OperatorName.LINE_TO, "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", OperatorName.MOVE_TO, "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", OperatorName.ENDPATH, "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "o", "isLayoutResultStale", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "p", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "keyboardActionRunner", OperatorName.SAVE, "Lkotlin/jvm/functions/Function1;", "onValueChangeOriginal", PDPageLabelRange.STYLE_ROMAN_LOWER, "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", OperatorName.CLOSE_AND_STROKE, "getOnImeActionPerformed", "onImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "t", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "value", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1121:1\n154#2:1122\n81#3:1123\n107#3,2:1124\n81#3:1126\n107#3,2:1127\n81#3:1129\n107#3,2:1130\n81#3:1132\n107#3,2:1133\n81#3:1135\n107#3,2:1136\n81#3:1138\n107#3,2:1139\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n783#1:1122\n778#1:1123\n778#1:1124,2\n783#1:1126\n783#1:1127,2\n834#1:1129\n834#1:1130,2\n845#1:1132\n845#1:1133,2\n851#1:1135\n851#1:1136,2\n857#1:1138\n857#1:1139,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldState {

    /* renamed from: a */
    public TextDelegate f14050a;

    /* renamed from: b */
    public final RecomposeScope f14051b;

    /* renamed from: c */
    public final EditProcessor f14052c;

    /* renamed from: d */
    public TextInputSession f14053d;

    /* renamed from: e */
    public final MutableState f14054e;

    /* renamed from: f */
    public final MutableState f14055f;

    /* renamed from: g */
    public LayoutCoordinates f14056g;

    /* renamed from: h */
    public final MutableState f14057h;

    /* renamed from: i */
    public AnnotatedString f14058i;

    /* renamed from: j */
    public final MutableState f14059j;

    /* renamed from: k */
    public boolean f14060k;

    /* renamed from: l */
    public final MutableState f14061l;

    /* renamed from: m */
    public final MutableState f14062m;

    /* renamed from: n */
    public final MutableState f14063n;

    /* renamed from: o */
    public boolean f14064o;

    /* renamed from: p */
    public final KeyboardActionRunner f14065p;

    /* renamed from: q */
    public Function1 f14066q;

    /* renamed from: r */
    public final Function1 f14067r;

    /* renamed from: s */
    public final Function1 f14068s;

    /* renamed from: t */
    public final Paint f14069t;

    public TextFieldState(@NotNull TextDelegate textDelegate, @NotNull RecomposeScope recomposeScope) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        MutableState m31891g7;
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.f14050a = textDelegate;
        this.f14051b = recomposeScope;
        this.f14052c = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        m31891g = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f14054e = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(C3641Dp.m73656boximpl(C3641Dp.m73658constructorimpl(0)), null, 2, null);
        this.f14055f = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14057h = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(HandleState.None, null, 2, null);
        this.f14059j = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f14061l = m31891g5;
        m31891g6 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f14062m = m31891g6;
        m31891g7 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f14063n = m31891g7;
        this.f14064o = true;
        this.f14065p = new KeyboardActionRunner();
        this.f14066q = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.f14067r = new TextFieldState$onValueChange$1(this);
        this.f14068s = new TextFieldState$onImeActionPerformed$1(this);
        this.f14069t = AndroidPaint_androidKt.Paint();
    }

    @NotNull
    public final HandleState getHandleState() {
        return (HandleState) this.f14059j.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.f14054e.getValue()).booleanValue();
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.f14053d;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.f14056g;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResult() {
        return (TextLayoutResultProxy) this.f14057h.getValue();
    }

    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM  reason: not valid java name */
    public final float m69798getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C3641Dp) this.f14055f.getValue()).m73672unboximpl();
    }

    @NotNull
    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.f14068s;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.f14067r;
    }

    @NotNull
    public final EditProcessor getProcessor() {
        return this.f14052c;
    }

    @NotNull
    public final RecomposeScope getRecomposeScope() {
        return this.f14051b;
    }

    @NotNull
    public final Paint getSelectionPaint() {
        return this.f14069t;
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.f14063n.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.f14060k;
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.f14062m.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.f14061l.getValue()).booleanValue();
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.f14050a;
    }

    @Nullable
    public final AnnotatedString getUntransformedText() {
        return this.f14058i;
    }

    public final boolean isLayoutResultStale() {
        return this.f14064o;
    }

    public final void setHandleState(@NotNull HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.f14059j.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.f14054e.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.f14053d = textInputSession;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.f14056g = layoutCoordinates;
    }

    public final void setLayoutResult(@Nullable TextLayoutResultProxy textLayoutResultProxy) {
        this.f14057h.setValue(textLayoutResultProxy);
        this.f14064o = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4  reason: not valid java name */
    public final void m69799setMinHeightForSingleLineField0680j_4(float f) {
        this.f14055f.setValue(C3641Dp.m73656boximpl(f));
    }

    public final void setShowCursorHandle(boolean z) {
        this.f14063n.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.f14060k = z;
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.f14062m.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.f14061l.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "<set-?>");
        this.f14050a = textDelegate;
    }

    public final void setUntransformedText(@Nullable AnnotatedString annotatedString) {
        this.f14058i = annotatedString;
    }

    /* renamed from: update-fnh65Uc  reason: not valid java name */
    public final void m69800updatefnh65Uc(@NotNull AnnotatedString untransformedText, @NotNull AnnotatedString visualText, @NotNull TextStyle textStyle, boolean z, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull KeyboardActions keyboardActions, @NotNull FocusManager focusManager, long j) {
        Intrinsics.checkNotNullParameter(untransformedText, "untransformedText");
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.f14066q = onValueChange;
        this.f14069t.mo71623setColor8_81llA(j);
        KeyboardActionRunner keyboardActionRunner = this.f14065p;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        keyboardActionRunner.setInputSession(this.f14053d);
        this.f14058i = untransformedText;
        TextDelegate m69775updateTextDelegaterm0N8CA$default = TextDelegateKt.m69775updateTextDelegaterm0N8CA$default(this.f14050a, visualText, textStyle, density, fontFamilyResolver, z, 0, 0, 0, CollectionsKt__CollectionsKt.emptyList(), 448, null);
        if (this.f14050a != m69775updateTextDelegaterm0N8CA$default) {
            this.f14064o = true;
        }
        this.f14050a = m69775updateTextDelegaterm0N8CA$default;
    }
}
