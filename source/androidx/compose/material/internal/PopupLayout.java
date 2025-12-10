package androidx.compose.material.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.p003ui.R;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.p003ui.platform.ViewRootForInspector;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i */
    public Function0 f25417i;

    /* renamed from: j */
    public String f25418j;

    /* renamed from: k */
    public final View f25419k;

    /* renamed from: l */
    public final WindowManager f25420l;

    /* renamed from: m */
    public final WindowManager.LayoutParams f25421m;

    /* renamed from: n */
    public PopupPositionProvider f25422n;

    /* renamed from: o */
    public LayoutDirection f25423o;

    /* renamed from: p */
    public final MutableState f25424p;

    /* renamed from: q */
    public final MutableState f25425q;

    /* renamed from: r */
    public final State f25426r;

    /* renamed from: s */
    public final float f25427s;

    /* renamed from: t */
    public final Rect f25428t;

    /* renamed from: u */
    public final Rect f25429u;

    /* renamed from: v */
    public final Function2 f25430v;

    /* renamed from: w */
    public final MutableState f25431w;

    /* renamed from: x */
    public boolean f25432x;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
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
    public PopupLayout(kotlin.jvm.functions.Function0 r8, java.lang.String r9, android.view.View r10, androidx.compose.p003ui.unit.Density r11, androidx.compose.p003ui.window.PopupPositionProvider r12, java.util.UUID r13) {
        /*
            r7 = this;
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.content.Context r2 = r10.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f25417i = r8
            r7.f25418j = r9
            r7.f25419k = r10
            android.content.Context r8 = r10.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f25420l = r8
            android.view.WindowManager$LayoutParams r8 = r7.m60754f()
            r7.f25421m = r8
            r7.f25422n = r12
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p003ui.unit.LayoutDirection.Ltr
            r7.f25423o = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.f25424p = r12
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.f25425q = r12
            androidx.compose.material.internal.PopupLayout$canCalculatePosition$2 r12 = new androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            r12.<init>(r7)
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r12)
            r7.f25426r = r12
            r12 = 8
            float r12 = (float) r12
            float r12 = androidx.compose.p003ui.unit.C3641Dp.m73658constructorimpl(r12)
            r7.f25427s = r12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f25428t = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f25429u = r0
            androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1 r0 = androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1.INSTANCE
            r7.f25430v = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r0)
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r10)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r10)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r10)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r0)
            android.view.ViewTreeObserver r10 = r10.getViewTreeObserver()
            r10.addOnGlobalLayoutListener(r7)
            int r10 = androidx.compose.p003ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Popup:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r7.setTag(r10, r13)
            r10 = 0
            r7.setClipChildren(r10)
            float r10 = r11.mo69438toPx0680j_4(r12)
            r7.setElevation(r10)
            androidx.compose.material.internal.PopupLayout$2 r10 = new androidx.compose.material.internal.PopupLayout$2
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt r10 = androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m70162getLambda1$material_release()
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r10, r8, r9, r8)
            r7.f25431w = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.<init>(kotlin.jvm.functions.Function0, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID):void");
    }

    private final void setContent(Function2 function2) {
        this.f25431w.setValue(function2);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1288867704);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288867704, i, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:301)");
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
        this.f25419k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f25420l.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4) {
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
                Function0 function0 = this.f25417i;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    /* renamed from: f */
    public final WindowManager.LayoutParams m60754f() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.f25419k.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f25419k.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    /* renamed from: g */
    public final IntRect m60753g() {
        return (IntRect) this.f25424p.getValue();
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f25426r.getValue()).booleanValue();
    }

    public final Function2 getContent() {
        return (Function2) this.f25431w.getValue();
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m70164getPopupContentSizebOM6tXw() {
        return (IntSize) this.f25425q.getValue();
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f25432x;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return AbstractC19114b32.m52056b(this);
    }

    /* renamed from: h */
    public final void m60752h(IntRect intRect) {
        this.f25424p.setValue(intRect);
    }

    /* renamed from: i */
    public final void m60751i(LayoutDirection layoutDirection) {
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

    /* renamed from: j */
    public final IntRect m60750j(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: k */
    public final void m60749k(Function0 function0, String testTag, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f25417i = function0;
        this.f25418j = testTag;
        m60751i(layoutDirection);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f25419k.getWindowVisibleDisplayFrame(this.f25429u);
        if (!Intrinsics.areEqual(this.f25429u, this.f25428t)) {
            updatePosition();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (((java.lang.Boolean) r2.invoke(r1, r0)).booleanValue() != false) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L7:
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r6.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getX()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r6.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getY()
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r6.getAction()
            r2 = 4
            if (r0 != r2) goto L8a
        L3f:
            androidx.compose.ui.unit.IntRect r0 = r5.m60753g()
            if (r0 == 0) goto L81
            kotlin.jvm.functions.Function2 r2 = r5.f25430v
            float r3 = r6.getX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L59
            float r3 = r6.getY()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L59
            r1 = 0
            goto L75
        L59:
            android.view.WindowManager$LayoutParams r1 = r5.f25421m
            int r1 = r1.x
            float r1 = (float) r1
            float r3 = r6.getX()
            float r1 = r1 + r3
            android.view.WindowManager$LayoutParams r3 = r5.f25421m
            int r3 = r3.y
            float r3 = (float) r3
            float r4 = r6.getY()
            float r3 = r3 + r4
            long r3 = androidx.compose.p003ui.geometry.OffsetKt.Offset(r1, r3)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p003ui.geometry.Offset.m71491boximpl(r3)
        L75:
            java.lang.Object r0 = r2.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
        L81:
            kotlin.jvm.functions.Function0 r6 = r5.f25417i
            if (r6 == 0) goto L88
            r6.invoke()
        L88:
            r6 = 1
            return r6
        L8a:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f25423o = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m70165setPopupContentSizefhxjrPA(IntSize intSize) {
        this.f25425q.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.f25422n = popupPositionProvider;
    }

    public final void show() {
        this.f25420l.addView(this, this.f25421m);
    }

    public final void updatePosition() {
        IntSize m70164getPopupContentSizebOM6tXw;
        IntRect m60753g = m60753g();
        if (m60753g != null && (m70164getPopupContentSizebOM6tXw = m70164getPopupContentSizebOM6tXw()) != null) {
            long m73822unboximpl = m70164getPopupContentSizebOM6tXw.m73822unboximpl();
            Rect rect = this.f25428t;
            this.f25419k.getWindowVisibleDisplayFrame(rect);
            IntRect m60750j = m60750j(rect);
            long mo69834calculatePositionllwVHH4 = this.f25422n.mo69834calculatePositionllwVHH4(m60753g, IntSizeKt.IntSize(m60750j.getWidth(), m60750j.getHeight()), this.f25423o, m73822unboximpl);
            this.f25421m.x = IntOffset.m73776getXimpl(mo69834calculatePositionllwVHH4);
            this.f25421m.y = IntOffset.m73777getYimpl(mo69834calculatePositionllwVHH4);
            this.f25420l.updateViewLayout(this, this.f25421m);
        }
    }

    public final void setContent(CompositionContext parent, Function2 content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f25432x = true;
    }
}
