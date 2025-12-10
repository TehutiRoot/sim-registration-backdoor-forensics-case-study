package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p003ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001aJ7\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0018H\u0014¢\u0006\u0004\b0\u0010\u001aJ\u000f\u00101\u001a\u00020\u0018H\u0014¢\u0006\u0004\b1\u0010\u001aJ%\u00107\u001a\u0004\u0018\u0001062\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00182\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\"2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bD\u0010EJ/\u0010H\u001a\u00020\"2\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010L\u001a\u00020\u00182\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\f2\u0006\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010OJG\u0010U\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\f2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010T\u001a\u000202H\u0016¢\u0006\u0004\bU\u0010VJ?\u0010U\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\f2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010WJ7\u0010Z\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\f2\u0006\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010T\u001a\u0002022\u0006\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u0010[J/\u0010_\u001a\u00020\"2\u0006\u0010:\u001a\u00020\f2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\2\u0006\u0010T\u001a\u00020\"H\u0016¢\u0006\u0004\b_\u0010`J'\u0010a\u001a\u00020\"2\u0006\u0010:\u001a\u00020\f2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\"H\u0016¢\u0006\u0004\bc\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010\u0017R6\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180i2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00180i8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR6\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00180i2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00180i8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR6\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00180i2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00180i8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010l\u001a\u0004\b{\u0010n\"\u0004\b|\u0010pR0\u0010\u0085\u0001\u001a\u00020~2\u0006\u0010j\u001a\u00020~8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R8\u0010\u008d\u0001\u001a\u0011\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R3\u0010\u0095\u0001\u001a\u00030\u008e\u00012\u0007\u0010j\u001a\u00030\u008e\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R9\u0010\u0099\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0088\u0001\u001a\u0006\b\u0097\u0001\u0010\u008a\u0001\"\u0006\b\u0098\u0001\u0010\u008c\u0001R6\u0010 \u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010j\u001a\u0005\u0018\u00010\u009a\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b$\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R7\u0010¨\u0001\u001a\u0005\u0018\u00010¡\u00012\t\u0010j\u001a\u0005\u0018\u00010¡\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R$\u0010®\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0088\u0001R\u001c\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180i8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¯\u0001\u0010lR8\u0010´\u0001\u001a\u0011\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u0088\u0001\u001a\u0006\b²\u0001\u0010\u008a\u0001\"\u0006\b³\u0001\u0010\u008c\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010µ\u0001R\u0018\u0010·\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010dR\u0017\u0010¸\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010dR\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001d\u0010Â\u0001\u001a\u00030½\u00018\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Ã\u0001"}, m28850d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;)V", "min", "max", "preferred", PDPageLabelRange.STYLE_LETTERS_LOWER, "(III)I", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", OperatorName.LINE_TO, "t", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", FirebaseAnalytics.Param.LOCATION, "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", OperatorName.CURVE_TO, "Landroid/view/View;", "getView", "Lkotlin/Function0;", "value", "d", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "e", "Z", "hasUpdateBlock", "<set-?>", OperatorName.FILL_NON_ZERO, "getReset", "setReset", "reset", OperatorName.NON_STROKING_GRAY, "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", OperatorName.NON_STROKING_CMYK, "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", OperatorName.MOVE_TO, "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", OperatorName.ENDPATH, "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotObserver", "o", "onCommitAffectingUpdate", "p", "runUpdate", OperatorName.SAVE, "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "[I", OperatorName.CLOSE_AND_STROKE, "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "u", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "Landroidx/compose/ui/node/LayoutNode;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback {

    /* renamed from: a */
    public final int f31776a;

    /* renamed from: b */
    public final NestedScrollDispatcher f31777b;

    /* renamed from: c */
    public final View f31778c;

    /* renamed from: d */
    public Function0 f31779d;

    /* renamed from: e */
    public boolean f31780e;

    /* renamed from: f */
    public Function0 f31781f;

    /* renamed from: g */
    public Function0 f31782g;

    /* renamed from: h */
    public Modifier f31783h;

    /* renamed from: i */
    public Function1 f31784i;

    /* renamed from: j */
    public Density f31785j;

    /* renamed from: k */
    public Function1 f31786k;

    /* renamed from: l */
    public LifecycleOwner f31787l;

    /* renamed from: m */
    public SavedStateRegistryOwner f31788m;

    /* renamed from: n */
    public final SnapshotStateObserver f31789n;

    /* renamed from: o */
    public final Function1 f31790o;

    /* renamed from: p */
    public final Function0 f31791p;

    /* renamed from: q */
    public Function1 f31792q;

    /* renamed from: r */
    public final int[] f31793r;

    /* renamed from: s */
    public int f31794s;

    /* renamed from: t */
    public int f31795t;

    /* renamed from: u */
    public final NestedScrollingParentHelper f31796u;

    /* renamed from: v */
    public final LayoutNode f31797v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, int i, @NotNull NestedScrollDispatcher dispatcher, @NotNull View view) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31776a = i;
        this.f31777b = dispatcher;
        this.f31778c = view;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f31779d = AndroidViewHolder$update$1.INSTANCE;
        this.f31781f = AndroidViewHolder$reset$1.INSTANCE;
        this.f31782g = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        this.f31783h = companion;
        this.f31785j = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.f31789n = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.f31790o = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.f31791p = new AndroidViewHolder$runUpdate$1(this);
        this.f31793r = new int[2];
        this.f31794s = Integer.MIN_VALUE;
        this.f31795t = Integer.MIN_VALUE;
        this.f31796u = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.access$getNoOpScrollConnection$p(), dispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.f31783h.then(onGloballyPositioned));
        this.f31784i = new AndroidViewHolder$layoutNode$1$1(layoutNode, onGloballyPositioned);
        layoutNode.setDensity(this.f31785j);
        this.f31786k = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui_release(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui_release(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            /* renamed from: a */
            public final int m58866a(int i2) {
                int m58867a;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                m58867a = androidViewHolder.m58867a(0, i2, layoutParams.width);
                androidViewHolder.measure(m58867a, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            /* renamed from: b */
            public final int m58865b(int i2) {
                int m58867a;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                m58867a = androidViewHolder2.m58867a(0, i2, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, m58867a);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return m58866a(i2);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return m58865b(i2);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo69194measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
                int m58867a;
                int m58867a2;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.CC.m59532q(measure, Constraints.m73628getMinWidthimpl(j), Constraints.m73627getMinHeightimpl(j), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m73628getMinWidthimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m73628getMinWidthimpl(j));
                }
                if (Constraints.m73627getMinHeightimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m73627getMinHeightimpl(j));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
                int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                m58867a = androidViewHolder.m58867a(m73628getMinWidthimpl, m73626getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
                int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                m58867a2 = androidViewHolder2.m58867a(m73627getMinHeightimpl, m73625getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(m58867a, m58867a2);
                return MeasureScope.CC.m59532q(measure, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder.this, layoutNode), 4, null);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return m58866a(i2);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return m58865b(i2);
            }
        });
        this.f31797v = layoutNode;
    }

    /* renamed from: a */
    public final int m58867a(int i, int i2, int i3) {
        if (i3 < 0 && i != i2) {
            if (i3 == -2 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
            if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(AbstractC11719c.coerceIn(i3, i, i2), 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f31793r);
        int[] iArr = this.f31793r;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f31793r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    public final Density getDensity() {
        return this.f31785j;
    }

    @Nullable
    public final View getInteropView() {
        return this.f31778c;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.f31797v;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f31778c.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.f31787l;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.f31783h;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f31796u.getNestedScrollAxes();
    }

    @Nullable
    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.f31786k;
    }

    @Nullable
    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.f31784i;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f31792q;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.f31782g;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f31781f;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.f31788m;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.f31779d;
    }

    @NotNull
    public final View getView() {
        return this.f31778c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] iArr, @Nullable Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f31797v.invalidateLayer$ui_release();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f31778c.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31789n.start();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.f31781f.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f31797v.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31789n.stop();
        this.f31789n.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f31778c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f31778c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.f31778c.measure(i, i2);
        setMeasuredDimension(this.f31778c.getMeasuredWidth(), this.f31778c.getMeasuredHeight());
        this.f31794s = i;
        this.f31795t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull View target, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1552Vc.m65753e(this.f31777b.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f), AndroidViewHolder_androidKt.access$toComposeVelocity(f2)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View target, float f, float f2) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1552Vc.m65753e(this.f31777b.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f), AndroidViewHolder_androidKt.access$toComposeVelocity(f2)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int i, int i2, @NotNull int[] consumed, int i3) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long m72619dispatchPreScrollOzD1aCk = this.f31777b.m72619dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i), AndroidViewHolder_androidKt.access$toComposeOffset(i2)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i3));
        consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71502getXimpl(m72619dispatchPreScrollOzD1aCk));
        consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71503getYimpl(m72619dispatchPreScrollOzD1aCk));
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int i, int i2, int i3, int i4, int i5, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long m72617dispatchPostScrollDzOQY0M = this.f31777b.m72617dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i), AndroidViewHolder_androidKt.access$toComposeOffset(i2)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i3), AndroidViewHolder_androidKt.access$toComposeOffset(i4)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i5));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71502getXimpl(m72617dispatchPostScrollDzOQY0M));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71503getYimpl(m72617dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f31796u.onNestedScrollAccepted(child, target, i, i2);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.f31782g.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.f31778c.getParent() != this) {
            addView(this.f31778c);
        } else {
            this.f31781f.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f31796u.onStopNestedScroll(target, i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (Build.VERSION.SDK_INT < 23 && i == 0) {
            this.f31797v.invalidateLayer$ui_release();
        }
    }

    public final void remeasure() {
        int i;
        int i2 = this.f31794s;
        if (i2 != Integer.MIN_VALUE && (i = this.f31795t) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.f31792q;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f31785j) {
            this.f31785j = value;
            Function1 function1 = this.f31786k;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.f31787l) {
            this.f31787l = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f31783h) {
            this.f31783h = value;
            Function1 function1 = this.f31784i;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Density, Unit> function1) {
        this.f31786k = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super Modifier, Unit> function1) {
        this.f31784i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f31792q = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f31782g = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f31781f = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.f31788m) {
            this.f31788m = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31779d = value;
        this.f31780e = true;
        this.f31791p.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            this.f31777b.m72617dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i), AndroidViewHolder_androidKt.access$toComposeOffset(i2)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i3), AndroidViewHolder_androidKt.access$toComposeOffset(i4)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i5));
        }
    }
}
