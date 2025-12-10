package androidx.compose.p003ui.window;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.p003ui.platform.ViewRootForInspector;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.CompositionContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.window.DialogWrapper */
/* loaded from: classes2.dex */
public final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    /* renamed from: d */
    public Function0 f31831d;

    /* renamed from: e */
    public DialogProperties f31832e;

    /* renamed from: f */
    public final View f31833f;

    /* renamed from: g */
    public final DialogLayout f31834g;

    /* renamed from: h */
    public final float f31835h;

    /* renamed from: i */
    public final int f31836i;

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/activity/OnBackPressedCallback;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.window.DialogWrapper$2 */
    /* loaded from: classes2.dex */
    public static final class C36542 extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public C36542() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            invoke2(onBackPressedCallback);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull OnBackPressedCallback addCallback) {
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            if (DialogWrapper.this.f31832e.getDismissOnBackPress()) {
                DialogWrapper.this.f31831d.invoke();
            }
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.window.DialogWrapper$WhenMappings */
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
    public DialogWrapper(kotlin.jvm.functions.Function0 r7, androidx.compose.p003ui.window.DialogProperties r8, android.view.View r9, androidx.compose.p003ui.unit.LayoutDirection r10, androidx.compose.p003ui.unit.Density r11, java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "layoutDirection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "dialogId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L34
            boolean r2 = r8.getDecorFitsSystemWindows()
            if (r2 == 0) goto L31
            goto L34
        L31:
            int r2 = androidx.compose.p003ui.R.style.FloatingDialogWindowTheme
            goto L36
        L34:
            int r2 = androidx.compose.p003ui.R.style.DialogWindowTheme
        L36:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.f31831d = r7
            r6.f31832e = r8
            r6.f31833f = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.p003ui.unit.C3641Dp.m73658constructorimpl(r7)
            r6.f31835h = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Le9
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f31836i = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.DialogProperties r0 = r6.f31832e
            boolean r0 = r0.getDecorFitsSystemWindows()
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0.<init>(r1, r8)
            int r1 = androidx.compose.p003ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.mo69438toPx0680j_4(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$1$2 r7 = new androidx.compose.ui.window.DialogWrapper$1$2
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.f31834g = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lb4
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        Lb4:
            if (r3 == 0) goto Lb9
            m58847d(r3)
        Lb9:
            r6.setContentView(r0)
            androidx.lifecycle.LifecycleOwner r7 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r7)
            androidx.lifecycle.ViewModelStoreOwner r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r7)
            androidx.savedstate.SavedStateRegistryOwner r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r7)
            kotlin.jvm.functions.Function0 r7 = r6.f31831d
            androidx.compose.ui.window.DialogProperties r8 = r6.f31832e
            r6.m58840k(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.getOnBackPressedDispatcher()
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>()
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            return
        Le9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.window.DialogWrapper.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.util.UUID):void");
    }

    /* renamed from: d */
    public static final void m58847d(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                m58847d(viewGroup2);
            }
        }
    }

    /* renamed from: i */
    private final void m58842i(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.f31834g;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        dialogLayout.setLayoutDirection(i2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    /* renamed from: g */
    public final void m58844g() {
        this.f31834g.disposeComposition();
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.f31834g;
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return AbstractC19114b32.m52056b(this);
    }

    /* renamed from: h */
    public final void m58843h(CompositionContext parentComposition, Function2 children) {
        Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f31834g.setContent(parentComposition, children);
    }

    /* renamed from: j */
    public final void m58841j(SecureFlagPolicy secureFlagPolicy) {
        int i;
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.f31833f));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (shouldApplySecureFlag) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
    }

    /* renamed from: k */
    public final void m58840k(Function0 onDismissRequest, DialogProperties properties, LayoutDirection layoutDirection) {
        Window window;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f31831d = onDismissRequest;
        this.f31832e = properties;
        m58841j(properties.getSecurePolicy());
        m58842i(layoutDirection);
        if (properties.getUsePlatformDefaultWidth() && !this.f31834g.m58849f() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f31834g.m58848g(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.f31836i);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.f31832e.getDismissOnClickOutside()) {
            this.f31831d.invoke();
        }
        return onTouchEvent;
    }
}
