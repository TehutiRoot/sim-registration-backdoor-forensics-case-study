package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$currentPageOffsetFraction$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,684:1\n116#2,2:685\n33#2,6:687\n118#2:693\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$currentPageOffsetFraction$2\n*L\n359#1:685,2\n359#1:687,6\n359#1:693\n*E\n"})
/* loaded from: classes.dex */
public final class PagerState$currentPageOffsetFraction$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$currentPageOffsetFraction$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        PageInfo pageInfo;
        int m61108f;
        float coerceIn;
        List<PageInfo> visiblePagesInfo = this.this$0.getLayoutInfo$foundation_release().getVisiblePagesInfo();
        PagerState pagerState = this.this$0;
        int size = visiblePagesInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pageInfo = null;
                break;
            }
            pageInfo = visiblePagesInfo.get(i);
            if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                break;
            }
            i++;
        }
        PageInfo pageInfo2 = pageInfo;
        int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
        m61108f = this.this$0.m61108f();
        float f = m61108f;
        if (f == 0.0f) {
            coerceIn = this.this$0.getInitialPageOffsetFraction();
        } else {
            coerceIn = AbstractC11719c.coerceIn((-offset) / f, -0.5f, 0.5f);
        }
        return Float.valueOf(coerceIn);
    }
}
