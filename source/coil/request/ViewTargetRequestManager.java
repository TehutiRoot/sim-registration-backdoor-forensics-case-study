package coil.request;

import android.view.View;
import androidx.annotation.MainThread;
import coil.util.Utils;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m28850d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Lcoil/request/ViewTargetDisposable;", "disposable", "", "isDisposed", "(Lcoil/request/ViewTargetDisposable;)Z", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "getDisposable", "(Lkotlinx/coroutines/Deferred;)Lcoil/request/ViewTargetDisposable;", "", "dispose", "()V", "getResult", "()Lcoil/request/ImageResult;", "Lcoil/request/ViewTargetRequestDelegate;", "request", "setRequest", "(Lcoil/request/ViewTargetRequestDelegate;)V", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "onViewAttachedToWindow", "onViewDetachedFromWindow", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ViewTargetDisposable;", "currentDisposable", "Lkotlinx/coroutines/Job;", OperatorName.CURVE_TO, "Lkotlinx/coroutines/Job;", "pendingClear", "d", "Lcoil/request/ViewTargetRequestDelegate;", "currentRequest", "e", "Z", "isRestart", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f40822a;

    /* renamed from: b */
    public ViewTargetDisposable f40823b;

    /* renamed from: c */
    public Job f40824c;

    /* renamed from: d */
    public ViewTargetRequestDelegate f40825d;

    /* renamed from: e */
    public boolean f40826e;

    public ViewTargetRequestManager(@NotNull View view) {
        this.f40822a = view;
    }

    public final synchronized void dispose() {
        Job m65753e;
        try {
            Job job = this.f40824c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            m65753e = AbstractC1552Vc.m65753e(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.f40824c = m65753e;
            this.f40823b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final synchronized ViewTargetDisposable getDisposable(@NotNull Deferred<? extends ImageResult> deferred) {
        ViewTargetDisposable viewTargetDisposable = this.f40823b;
        if (viewTargetDisposable != null && Utils.isMainThread() && this.f40826e) {
            this.f40826e = false;
            viewTargetDisposable.setJob(deferred);
            return viewTargetDisposable;
        }
        Job job = this.f40824c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f40824c = null;
        ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(this.f40822a, deferred);
        this.f40823b = viewTargetDisposable2;
        return viewTargetDisposable2;
    }

    @Nullable
    public final synchronized ImageResult getResult() {
        ImageResult imageResult;
        Deferred<ImageResult> job;
        ViewTargetDisposable viewTargetDisposable = this.f40823b;
        if (viewTargetDisposable != null && (job = viewTargetDisposable.getJob()) != null) {
            imageResult = (ImageResult) Utils.getCompletedOrNull(job);
        } else {
            imageResult = null;
        }
        return imageResult;
    }

    public final synchronized boolean isDisposed(@NotNull ViewTargetDisposable viewTargetDisposable) {
        boolean z;
        if (viewTargetDisposable != this.f40823b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewAttachedToWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f40825d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f40826e = true;
        viewTargetRequestDelegate.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewDetachedFromWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f40825d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }

    @MainThread
    public final void setRequest(@Nullable ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f40825d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.dispose();
        }
        this.f40825d = viewTargetRequestDelegate;
    }
}
