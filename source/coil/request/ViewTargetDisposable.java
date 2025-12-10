package coil.request;

import android.view.View;
import coil.util.Utils;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28850d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", "Landroid/view/View;", Promotion.ACTION_VIEW, "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "", "dispose", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "setJob", "(Lkotlinx/coroutines/Deferred;)V", "", "isDisposed", "()Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ViewTargetDisposable implements Disposable {

    /* renamed from: a */
    public final View f40815a;

    /* renamed from: b */
    public volatile Deferred f40816b;

    public ViewTargetDisposable(@NotNull View view, @NotNull Deferred<? extends ImageResult> deferred) {
        this.f40815a = view;
        this.f40816b = deferred;
    }

    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        Utils.getRequestManager(this.f40815a).dispose();
    }

    @Override // coil.request.Disposable
    @NotNull
    public Deferred<ImageResult> getJob() {
        return this.f40816b;
    }

    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return Utils.getRequestManager(this.f40815a).isDisposed(this);
    }

    public void setJob(@NotNull Deferred<? extends ImageResult> deferred) {
        this.f40816b = deferred;
    }
}
