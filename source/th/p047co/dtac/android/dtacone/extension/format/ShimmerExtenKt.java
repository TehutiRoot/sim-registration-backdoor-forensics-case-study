package th.p047co.dtac.android.dtacone.extension.format;

import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28850d2 = {"finish", "", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.ShimmerExtenKt */
/* loaded from: classes7.dex */
public final class ShimmerExtenKt {
    public static final void finish(@NotNull ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "<this>");
        shimmerFrameLayout.stopShimmer();
        ViewVisibleExtKt.toGone(shimmerFrameLayout);
    }
}
