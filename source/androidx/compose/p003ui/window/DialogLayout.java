package androidx.compose.p003ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.window.DialogLayout */
/* loaded from: classes2.dex */
public final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {

    /* renamed from: i */
    public final Window f31822i;

    /* renamed from: j */
    public final MutableState f31823j;

    /* renamed from: k */
    public boolean f31824k;

    /* renamed from: l */
    public boolean f31825l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f31822i = window;
        m31891g = AbstractC19508dK1.m31891g(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m73898getLambda1$ui_release(), null, 2, null);
        this.f31823j = m31891g;
    }

    private final Function2 getContent() {
        return (Function2) this.f31823j.getValue();
    }

    private final int getDisplayWidth() {
        return AbstractC21140mr0.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(Function2 function2) {
        this.f31823j.setValue(function2);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i));
        }
    }

    /* renamed from: f */
    public final boolean m58849f() {
        return this.f31824k;
    }

    /* renamed from: g */
    public final void m58848g(boolean z) {
        this.f31824k = z;
    }

    public final int getDisplayHeight() {
        return AbstractC21140mr0.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f31825l;
    }

    @Override // androidx.compose.p003ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.f31822i;
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        if (this.f31824k || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.p003ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.f31824k) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setContent(CompositionContext parent, Function2 content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f31825l = true;
        createComposition();
    }
}
