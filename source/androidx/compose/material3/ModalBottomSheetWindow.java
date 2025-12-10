package androidx.compose.material3;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.p003ui.platform.ViewRootForInspector;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ModalBottomSheetWindow extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ViewRootForInspector {

    /* renamed from: i */
    public Function0 f25883i;

    /* renamed from: j */
    public final View f25884j;

    /* renamed from: k */
    public final WindowManager f25885k;

    /* renamed from: l */
    public final WindowManager.LayoutParams f25886l;

    /* renamed from: m */
    public final MutableState f25887m;

    /* renamed from: n */
    public boolean f25888n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ModalBottomSheetWindow(kotlin.jvm.functions.Function0 r8, android.view.View r9, java.util.UUID r10) {
        /*
            r7 = this;
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "saveId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            android.content.Context r2 = r9.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f25883i = r8
            r7.f25884j = r9
            r8 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r8)
            androidx.lifecycle.LifecycleOwner r8 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r8)
            androidx.lifecycle.ViewModelStoreOwner r8 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r8)
            androidx.savedstate.SavedStateRegistryOwner r8 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r8)
            int r8 = androidx.compose.p003ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Popup:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r7.setTag(r8, r10)
            r8 = 0
            r7.setClipChildren(r8)
            android.content.Context r8 = r9.getContext()
            java.lang.String r10 = "window"
            java.lang.Object r8 = r8.getSystemService(r10)
            java.lang.String r10 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r10)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f25885k = r8
            android.view.WindowManager$LayoutParams r8 = new android.view.WindowManager$LayoutParams
            r8.<init>()
            r10 = 8388691(0x800053, float:1.175506E-38)
            r8.gravity = r10
            r10 = 1000(0x3e8, float:1.401E-42)
            r8.type = r10
            int r10 = r7.getDisplayWidth()
            r8.width = r10
            r10 = -1
            r8.height = r10
            r10 = -3
            r8.format = r10
            android.content.Context r10 = r9.getContext()
            android.content.res.Resources r10 = r10.getResources()
            int r0 = androidx.compose.p003ui.R.string.default_popup_window_title
            java.lang.String r10 = r10.getString(r0)
            r8.setTitle(r10)
            android.os.IBinder r9 = r9.getApplicationWindowToken()
            r8.token = r9
            int r9 = r8.flags
            r10 = -163841(0xfffffffffffd7fff, float:NaN)
            r9 = r9 & r10
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.flags = r9
            r7.f25886l = r8
            androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt r8 = androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE
            kotlin.jvm.functions.Function2 r8 = r8.m70321getLambda3$material3_release()
            r9 = 0
            r10 = 2
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r9, r10, r9)
            r7.f25887m = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetWindow.<init>(kotlin.jvm.functions.Function0, android.view.View, java.util.UUID):void");
    }

    private final Function2 getContent() {
        return (Function2) this.f25887m.getValue();
    }

    private final void setContent(Function2 function2) {
        this.f25887m.setValue(function2);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-463309699);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-463309699, i, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:519)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheetWindow$Content$4(this, i));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        ViewTreeSavedStateRegistryOwner.set(this, null);
        this.f25884j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f25885k.removeViewImmediate(this);
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
                this.f25883i.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    /* renamed from: f */
    public final void m60618f(CompositionContext compositionContext, Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (compositionContext != null) {
            setParentCompositionContext(compositionContext);
        }
        setContent(content);
        this.f25888n = true;
    }

    public final int getDisplayWidth() {
        return AbstractC21140mr0.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f25888n;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return AbstractC19114b32.m52057a(this);
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return AbstractC19114b32.m52056b(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public final void show() {
        this.f25885k.addView(this, this.f25886l);
    }
}
