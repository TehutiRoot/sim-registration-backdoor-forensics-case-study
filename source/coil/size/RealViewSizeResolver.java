package coil.size;

import android.view.View;
import coil.size.ViewSizeResolver;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28850d2 = {"Lcoil/size/RealViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil/size/ViewSizeResolver;", Promotion.ACTION_VIEW, "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getView", "()Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getSubtractPadding", "()Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {

    /* renamed from: a */
    public final View f40830a;

    /* renamed from: b */
    public final boolean f40831b;

    public RealViewSizeResolver(@NotNull T t, boolean z) {
        this.f40830a = t;
        this.f40831b = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealViewSizeResolver) {
            RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
            if (Intrinsics.areEqual(getView(), realViewSizeResolver.getView()) && getSubtractPadding() == realViewSizeResolver.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.size.ViewSizeResolver
    public boolean getSubtractPadding() {
        return this.f40831b;
    }

    @Override // coil.size.ViewSizeResolver
    @NotNull
    public T getView() {
        return (T) this.f40830a;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + AbstractC1705Xp.m65430a(getSubtractPadding());
    }

    @Override // coil.size.ViewSizeResolver, coil.size.SizeResolver
    public /* synthetic */ Object size(Continuation continuation) {
        return ViewSizeResolver.CC.m51031b(this, continuation);
    }
}
