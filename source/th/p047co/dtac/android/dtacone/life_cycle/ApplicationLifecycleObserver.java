package th.p047co.dtac.android.dtacone.life_cycle;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/life_cycle/ApplicationLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lth/co/dtac/android/dtacone/life_cycle/ApplicationLifecycle;", "lifeCycleListener", "<init>", "(Lth/co/dtac/android/dtacone/life_cycle/ApplicationLifecycle;)V", "", "onApplicationStopped", "()V", "onApplicationResumed", "onApplicationDestroyed", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/life_cycle/ApplicationLifecycle;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.life_cycle.ApplicationLifecycleObserver */
/* loaded from: classes7.dex */
public final class ApplicationLifecycleObserver implements LifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ApplicationLifecycle f84771a;

    public ApplicationLifecycleObserver(@NotNull ApplicationLifecycle lifeCycleListener) {
        Intrinsics.checkNotNullParameter(lifeCycleListener, "lifeCycleListener");
        this.f84771a = lifeCycleListener;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onApplicationDestroyed() {
        this.f84771a.onApplicationDestroyed();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onApplicationResumed() {
        this.f84771a.onApplicationResumed();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onApplicationStopped() {
        this.f84771a.onApplicationStopped();
    }
}
