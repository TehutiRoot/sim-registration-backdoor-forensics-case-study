package androidx.compose.p003ui.platform;

import android.view.View;
import androidx.compose.p003ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@InternalComposeUiApi
/* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory */
/* loaded from: classes2.dex */
public interface WindowRecomposerFactory {
    @NotNull
    public static final Companion Companion = Companion.f30806a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware$annotations", "LifecycleAware", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f30806a = new Companion();

        /* renamed from: b */
        public static final WindowRecomposerFactory f30807b = C3582a.f30808a;

        /* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$a */
        /* loaded from: classes2.dex */
        public static final class C3582a implements WindowRecomposerFactory {

            /* renamed from: a */
            public static final C3582a f30808a = new C3582a();

            @Override // androidx.compose.p003ui.platform.WindowRecomposerFactory
            public final Recomposer createRecomposer(View rootView) {
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(rootView, null, null, 3, null);
            }
        }

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }

        @NotNull
        public final WindowRecomposerFactory getLifecycleAware() {
            return f30807b;
        }
    }

    @NotNull
    Recomposer createRecomposer(@NotNull View view);
}
