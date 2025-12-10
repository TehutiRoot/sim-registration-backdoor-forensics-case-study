package androidx.compose.p003ui.window;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.R;
import androidx.compose.p003ui.UiComposable;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.p003ui.platform.ViewRootForInspector;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntRectKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J(\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0017¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 H\u0010¢\u0006\u0004\b7\u00108J7\u0010A\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020 H\u0010¢\u0006\u0004\b?\u0010@J\u0017\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ5\u0010F\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0004¢\u0006\u0004\bL\u0010,J\u000f\u0010N\u001a\u00020\u0004H\u0001¢\u0006\u0004\bM\u0010,J\r\u0010O\u001a\u00020\u0004¢\u0006\u0004\bO\u0010,J\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010,J\u0019\u0010R\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\bT\u0010#R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR \u0010k\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bj\u0010,\u001a\u0004\bi\u0010*R\"\u0010r\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010x\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010'R:\u0010\u0081\u0001\u001a\u0004\u0018\u00010y2\b\u0010z\u001a\u0004\u0018\u00010y8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R3\u0010I\u001a\u0004\u0018\u00010H2\b\u0010z\u001a\u0004\u0018\u00010H8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010|\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010KR\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008e\u0001\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001RE\u00100\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/2\u0011\u0010z\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0097\u0001\u0010|\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b1\u0010\u009a\u0001R)\u0010\u009e\u0001\u001a\u00020\u00162\u0006\u0010z\u001a\u00020\u00168\u0014@RX\u0094\u000e¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u008d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¥\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010§\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¤\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006«\u0001"}, m28850d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/window/PopupPositionProvider;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/PopupLayoutHelper;", "popupLayoutHelper", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "", "isFocusable", "setIsFocusable", "(Z)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "clippingEnabled", "setClippingEnabled", "", "flags", OperatorName.FILL_NON_ZERO, "(I)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroid/view/WindowManager$LayoutParams;", OperatorName.NON_STROKING_GRAY, "()Landroid/view/WindowManager$LayoutParams;", "show", "()V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "updateParameters", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "updateParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "pollForLocationOnScreenChange", "updateParentBounds$ui_release", "updateParentBounds", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "i", "Lkotlin/jvm/functions/Function0;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/window/PopupProperties;", OperatorName.NON_STROKING_CMYK, "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", OperatorName.LINE_TO, "Landroid/view/View;", OperatorName.MOVE_TO, "Landroidx/compose/ui/window/PopupLayoutHelper;", "Landroid/view/WindowManager;", OperatorName.ENDPATH, "Landroid/view/WindowManager;", "windowManager", "o", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "getParams$ui_release$annotations", "params", "p", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", OperatorName.SAVE, "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "parentLayoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", OperatorName.CLOSE_AND_STROKE, "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntRect;", "t", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "u", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/Dp;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "F", "maxSupportedElevation", "Landroid/graphics/Rect;", OperatorName.SET_LINE_WIDTH, "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "x", "getContent", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "z", "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,833:1\n154#2:834\n1#3:835\n81#4:836\n107#4,2:837\n81#4:839\n107#4,2:840\n81#4:842\n81#4:843\n107#4,2:844\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:834\n402#1:836\n402#1:837,2\n403#1:839\n403#1:840,2\n407#1:842\n447#1:843\n447#1:844,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {

    /* renamed from: i */
    public Function0 f31837i;

    /* renamed from: j */
    public PopupProperties f31838j;

    /* renamed from: k */
    public String f31839k;

    /* renamed from: l */
    public final View f31840l;

    /* renamed from: m */
    public final PopupLayoutHelper f31841m;

    /* renamed from: n */
    public final WindowManager f31842n;

    /* renamed from: o */
    public final WindowManager.LayoutParams f31843o;

    /* renamed from: p */
    public PopupPositionProvider f31844p;

    /* renamed from: q */
    public LayoutDirection f31845q;

    /* renamed from: r */
    public final MutableState f31846r;

    /* renamed from: s */
    public final MutableState f31847s;

    /* renamed from: t */
    public IntRect f31848t;

    /* renamed from: u */
    public final State f31849u;

    /* renamed from: v */
    public final float f31850v;

    /* renamed from: w */
    public final Rect f31851w;

    /* renamed from: x */
    public final MutableState f31852x;

    /* renamed from: y */
    public boolean f31853y;

    /* renamed from: z */
    public final int[] f31854z;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.window.PopupLayout$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PopupLayout(kotlin.jvm.functions.Function0 r11, androidx.compose.p003ui.window.PopupProperties r12, java.lang.String r13, android.view.View r14, androidx.compose.p003ui.unit.Density r15, androidx.compose.p003ui.window.PopupPositionProvider r16, java.util.UUID r17, androidx.compose.p003ui.window.PopupLayoutHelper r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            Wk1 r0 = new Wk1
            r0.<init>()
            goto L17
        L12:
            Xk1 r0 = new Xk1
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.window.PopupLayout.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: g */
    private final WindowManager.LayoutParams m58838g() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.f31840l.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f31840l.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.f31852x.getValue();
    }

    private final int getDisplayHeight() {
        return AbstractC21140mr0.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return AbstractC21140mr0.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.f31847s.getValue();
    }

    /* renamed from: h */
    private final void m58837h(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        if (z) {
            i = this.f31843o.flags & (-513);
        } else {
            i = this.f31843o.flags | 512;
        }
        m58839f(i);
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.f31852x.setValue(function2);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        if (!z) {
            i = this.f31843o.flags | 8;
        } else {
            i = this.f31843o.flags & (-9);
        }
        m58839f(i);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.f31847s.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        if (SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.f31840l))) {
            i = this.f31843o.flags | 8192;
        } else {
            i = this.f31843o.flags & (-8193);
        }
        m58839f(i);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PopupLayout$Content$4(this, i));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.f31842n.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.f31838j.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            } else if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0 function0 = this.f31837i;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    /* renamed from: f */
    public final void m58839f(int i) {
        WindowManager.LayoutParams layoutParams = this.f31843o;
        layoutParams.flags = i;
        this.f31841m.updateViewLayout(this.f31842n, this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f31849u.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f31843o;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.f31845q;
    }

    @Nullable
    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m73900getPopupContentSizebOM6tXw() {
        return (IntSize) this.f31846r.getValue();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.f31844p;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f31853y;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f31839k;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return AbstractC19114b32.m52056b(this);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        if (this.f31838j.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f31843o.width = childAt.getMeasuredWidth();
        this.f31843o.height = childAt.getMeasuredHeight();
        this.f31841m.updateViewLayout(this.f31842n, this, this.f31843o);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f31838j.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f31838j.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f31837i;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            Function0 function02 = this.f31837i;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.f31854z;
        int i = iArr[0];
        int i2 = iArr[1];
        this.f31840l.getLocationOnScreen(iArr);
        int[] iArr2 = this.f31854z;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            updateParentBounds$ui_release();
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f31845q = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m73901setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.f31846r.setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.f31844p = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31839k = str;
    }

    public final void show() {
        this.f31842n.addView(this, this.f31843o);
    }

    public final void updateParameters(@Nullable Function0<Unit> function0, @NotNull PopupProperties properties, @NotNull String testTag, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f31837i = function0;
        if (properties.getUsePlatformDefaultWidth() && !this.f31838j.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.f31843o;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f31841m.updateViewLayout(this.f31842n, this, layoutParams);
        }
        this.f31838j = properties;
        this.f31839k = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        m58837h(layoutDirection);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long mo72816getSizeYbymL2g = parentLayoutCoordinates.mo72816getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        IntRect m73808IntRectVbeCjmY = IntRectKt.m73808IntRectVbeCjmY(IntOffsetKt.IntOffset(AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(positionInWindow)), AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(positionInWindow))), mo72816getSizeYbymL2g);
        if (!Intrinsics.areEqual(m73808IntRectVbeCjmY, this.f31848t)) {
            this.f31848t = m73808IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(@NotNull LayoutCoordinates parentLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize m73900getPopupContentSizebOM6tXw;
        IntRect m58850b;
        IntRect intRect = this.f31848t;
        if (intRect != null && (m73900getPopupContentSizebOM6tXw = m73900getPopupContentSizebOM6tXw()) != null) {
            long m73822unboximpl = m73900getPopupContentSizebOM6tXw.m73822unboximpl();
            Rect rect = this.f31851w;
            this.f31841m.getWindowVisibleDisplayFrame(this.f31840l, rect);
            m58850b = AndroidPopup_androidKt.m58850b(rect);
            long IntSize = IntSizeKt.IntSize(m58850b.getWidth(), m58850b.getHeight());
            long mo69834calculatePositionllwVHH4 = this.f31844p.mo69834calculatePositionllwVHH4(intRect, IntSize, this.f31845q, m73822unboximpl);
            this.f31843o.x = IntOffset.m73776getXimpl(mo69834calculatePositionllwVHH4);
            this.f31843o.y = IntOffset.m73777getYimpl(mo69834calculatePositionllwVHH4);
            if (this.f31838j.getExcludeFromSystemGesture()) {
                this.f31841m.setGestureExclusionRects(this, IntSize.m73818getWidthimpl(IntSize), IntSize.m73817getHeightimpl(IntSize));
            }
            this.f31841m.updateViewLayout(this.f31842n, this, this.f31843o);
        }
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f31853y = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PopupLayout(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.window.PopupProperties r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull android.view.View r11, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.unit.Density r12, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.window.PopupPositionProvider r13, @org.jetbrains.annotations.NotNull java.util.UUID r14, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.window.PopupLayoutHelper r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f31837i = r8
            r7.f31838j = r9
            r7.f31839k = r10
            r7.f31840l = r11
            r7.f31841m = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f31842n = r8
            android.view.WindowManager$LayoutParams r8 = r7.m58838g()
            r7.f31843o = r8
            r7.f31844p = r13
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p003ui.unit.LayoutDirection.Ltr
            r7.f31845q = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r10 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.f31846r = r10
            androidx.compose.runtime.MutableState r10 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.f31847s = r10
            androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 r10 = new androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            r10.<init>(r7)
            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r10)
            r7.f31849u = r10
            r10 = 8
            float r10 = (float) r10
            float r10 = androidx.compose.p003ui.unit.C3641Dp.m73658constructorimpl(r10)
            r7.f31850v = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.f31851w = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.LifecycleOwner r13 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r11)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r13)
            androidx.lifecycle.ViewModelStoreOwner r13 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r11)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r13)
            androidx.savedstate.SavedStateRegistryOwner r11 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r11)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r11)
            int r11 = androidx.compose.p003ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.mo69438toPx0680j_4(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.PopupLayout$2 r10 = new androidx.compose.ui.window.PopupLayout$2
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt r10 = androidx.compose.p003ui.window.ComposableSingletons$AndroidPopup_androidKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m73899getLambda1$ui_release()
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r10, r8, r9, r8)
            r7.f31852x = r8
            int[] r8 = new int[r9]
            r7.f31854z = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.window.PopupLayout.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper):void");
    }
}
