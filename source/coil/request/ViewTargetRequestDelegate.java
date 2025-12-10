package coil.request;

import androidx.annotation.MainThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.ImageLoader;
import coil.target.ViewTarget;
import coil.util.Lifecycles;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m28850d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/request/ImageRequest;", "initialRequest", "Lcoil/target/ViewTarget;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil/ImageLoader;Lcoil/request/ImageRequest;Lcoil/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "restart", "()V", "assertActive", "start", "dispose", "Landroidx/lifecycle/LifecycleOwner;", Constant.REGISTER_LEVEL_OWNER, "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/ImageLoader;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ImageRequest;", OperatorName.CURVE_TO, "Lcoil/target/ViewTarget;", "d", "Landroidx/lifecycle/Lifecycle;", "e", "Lkotlinx/coroutines/Job;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate {

    /* renamed from: a */
    public final ImageLoader f40817a;

    /* renamed from: b */
    public final ImageRequest f40818b;

    /* renamed from: c */
    public final ViewTarget f40819c;

    /* renamed from: d */
    public final Lifecycle f40820d;

    /* renamed from: e */
    public final Job f40821e;

    public ViewTargetRequestDelegate(@NotNull ImageLoader imageLoader, @NotNull ImageRequest imageRequest, @NotNull ViewTarget<?> viewTarget, @NotNull Lifecycle lifecycle, @NotNull Job job) {
        this.f40817a = imageLoader;
        this.f40818b = imageRequest;
        this.f40819c = viewTarget;
        this.f40820d = lifecycle;
        this.f40821e = job;
    }

    @Override // coil.request.RequestDelegate
    public void assertActive() {
        if (this.f40819c.getView().isAttachedToWindow()) {
            return;
        }
        Utils.getRequestManager(this.f40819c.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public /* synthetic */ void complete() {
        AbstractC19783ex1.m31378b(this);
    }

    @Override // coil.request.RequestDelegate
    public void dispose() {
        Job.DefaultImpls.cancel$default(this.f40821e, (CancellationException) null, 1, (Object) null);
        ViewTarget viewTarget = this.f40819c;
        if (viewTarget instanceof LifecycleObserver) {
            this.f40820d.removeObserver((LifecycleObserver) viewTarget);
        }
        this.f40820d.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m123a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Utils.getRequestManager(this.f40819c.getView()).dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m121c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m120d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m119e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        AbstractC17181zE.m118f(this, lifecycleOwner);
    }

    @MainThread
    public final void restart() {
        this.f40817a.enqueue(this.f40818b);
    }

    @Override // coil.request.RequestDelegate
    public void start() {
        this.f40820d.addObserver(this);
        ViewTarget viewTarget = this.f40819c;
        if (viewTarget instanceof LifecycleObserver) {
            Lifecycles.removeAndAddObserver(this.f40820d, (LifecycleObserver) viewTarget);
        }
        Utils.getRequestManager(this.f40819c.getView()).setRequest(this);
    }
}
