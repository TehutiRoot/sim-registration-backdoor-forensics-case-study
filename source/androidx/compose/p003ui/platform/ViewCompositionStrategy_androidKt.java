package androidx.compose.p003ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", Promotion.ACTION_VIEW, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/Function0;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/lifecycle/Lifecycle;)Lkotlin/jvm/functions/Function0;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKt {

    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$a */
    /* loaded from: classes2.dex */
    public static final class C3578a implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ AbstractComposeView f30777a;

        public C3578a(AbstractComposeView abstractComposeView) {
            this.f30777a = abstractComposeView;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f30777a.disposeComposition();
            }
        }
    }

    /* renamed from: a */
    public static final Function0 m59194a(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            C3578a c3578a = new C3578a(abstractComposeView);
            lifecycle.addObserver(c3578a);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, c3578a);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    public static final /* synthetic */ Function0 access$installForLifecycle(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        return m59194a(abstractComposeView, lifecycle);
    }
}
