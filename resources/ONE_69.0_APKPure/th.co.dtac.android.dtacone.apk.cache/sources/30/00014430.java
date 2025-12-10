package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$ReviewScreen$1$pagerState$1 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$ReviewScreen$1$pagerState$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ List<Bitmap> $imageList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScreenKt$ReviewScreen$1$pagerState$1(List<Bitmap> list) {
        super(0);
        this.$imageList = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Integer invoke() {
        return Integer.valueOf(this.$imageList.size());
    }
}