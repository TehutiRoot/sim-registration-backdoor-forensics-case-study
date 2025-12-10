package androidx.compose.p003ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p003ui.InternalComposeUiApi;
import androidx.compose.p003ui.UiComposable;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0004¢\u0006\u0004\b+\u0010,J7\u0010.\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0010¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020%H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u00102\u001a\u00020%H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J!\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010;J)\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010>J#\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b8\u0010AJ+\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b8\u0010BJ+\u0010C\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010?H\u0014¢\u0006\u0004\bC\u0010DJ3\u0010C\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010E\u001a\u00020%H\u0014¢\u0006\u0004\bC\u0010FJ\u000f\u0010G\u001a\u00020%H\u0016¢\u0006\u0004\bG\u00103R\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010IR(\u0010P\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010M\"\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR(\u0010W\u001a\u0004\u0018\u00010\r2\b\u0010L\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bT\u0010U\"\u0004\bV\u0010\u0015R$\u0010[\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010Y\u0012\u0004\bZ\u0010\fR0\u0010a\u001a\u00020%2\u0006\u0010L\u001a\u00020%8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010\f\u001a\u0004\b^\u00103\"\u0004\b_\u00105R\u0016\u0010c\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010]R\u0016\u0010e\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010]R\u0018\u0010g\u001a\u00020%*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010fR\u0014\u0010i\u001a\u00020%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bh\u00103R\u0011\u0010k\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bj\u00103¨\u0006l"}, m28850d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroidx/compose/runtime/CompositionContext;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/CompositionContext;", "e", "()Landroidx/compose/runtime/CompositionContext;", OperatorName.CURVE_TO, "parent", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui_release", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui_release", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/Composition;", "composition", "d", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "parentContext", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", OperatorName.FILL_NON_ZERO, "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", OperatorName.NON_STROKING_GRAY, "creatingComposition", OperatorName.CLOSE_PATH, "isTransitionGroupSet", "(Landroidx/compose/runtime/CompositionContext;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
/* loaded from: classes2.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;

    /* renamed from: a */
    public WeakReference f30438a;

    /* renamed from: b */
    public IBinder f30439b;

    /* renamed from: c */
    public Composition f30440c;

    /* renamed from: d */
    public CompositionContext f30441d;

    /* renamed from: e */
    public Function0 f30442e;

    /* renamed from: f */
    public boolean f30443f;

    /* renamed from: g */
    public boolean f30444g;

    /* renamed from: h */
    public boolean f30445h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.f30441d != compositionContext) {
            this.f30441d = compositionContext;
            if (compositionContext != null) {
                this.f30438a = null;
            }
            Composition composition = this.f30440c;
            if (composition != null) {
                composition.dispose();
                this.f30440c = null;
                if (isAttachedToWindow()) {
                    m59382c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f30439b != iBinder) {
            this.f30439b = iBinder;
            this.f30438a = null;
        }
    }

    @Composable
    @UiComposable
    public abstract void Content(@Nullable Composer composer, int i);

    /* renamed from: a */
    public final CompositionContext m59384a(CompositionContext compositionContext) {
        CompositionContext compositionContext2;
        if (m59381d(compositionContext)) {
            compositionContext2 = compositionContext;
        } else {
            compositionContext2 = null;
        }
        if (compositionContext2 != null) {
            this.f30438a = new WeakReference(compositionContext2);
        }
        return compositionContext;
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view) {
        m59383b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        m59383b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void m59383b() {
        if (this.f30444g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* renamed from: c */
    public final void m59382c() {
        if (this.f30440c == null) {
            try {
                this.f30444g = true;
                this.f30440c = Wrapper_androidKt.setContent(this, m59380e(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
            } finally {
                this.f30444g = false;
            }
        }
    }

    public final void createComposition() {
        if (this.f30441d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        m59382c();
    }

    /* renamed from: d */
    public final boolean m59381d(CompositionContext compositionContext) {
        if ((compositionContext instanceof Recomposer) && ((Recomposer) compositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    public final void disposeComposition() {
        Composition composition = this.f30440c;
        if (composition != null) {
            composition.dispose();
        }
        this.f30440c = null;
        requestLayout();
    }

    /* renamed from: e */
    public final CompositionContext m59380e() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2;
        CompositionContext compositionContext3 = this.f30441d;
        if (compositionContext3 == null) {
            CompositionContext findViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            CompositionContext compositionContext4 = null;
            if (findViewTreeCompositionContext != null) {
                compositionContext = m59384a(findViewTreeCompositionContext);
            } else {
                compositionContext = null;
            }
            if (compositionContext == null) {
                WeakReference weakReference = this.f30438a;
                if (weakReference != null && (compositionContext2 = (CompositionContext) weakReference.get()) != null && m59381d(compositionContext2)) {
                    compositionContext4 = compositionContext2;
                }
                CompositionContext compositionContext5 = compositionContext4;
                if (compositionContext5 == null) {
                    return m59384a(WindowRecomposer_androidKt.getWindowRecomposer(this));
                }
                return compositionContext5;
            }
            return compositionContext;
        }
        return compositionContext3;
    }

    public final boolean getHasComposition() {
        if (this.f30440c != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f30443f;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        if (this.f30445h && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m59382c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui_release(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m59382c();
        internalOnMeasure$ui_release(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(@Nullable CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f30443f = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f30445h = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Function0 function0 = this.f30442e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f30442e = strategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i) {
        m59383b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams, boolean z) {
        m59383b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f30442e = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i, int i2) {
        m59383b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        m59383b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        m59383b();
        super.addView(view, i, layoutParams);
    }
}
