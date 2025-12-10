package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class PagerState$targetPage$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Integer invoke() {
        int m61110d;
        int m61108f;
        int roundToInt;
        float m61107g;
        int m61111c;
        if (this.this$0.isScrollInProgress()) {
            m61110d = this.this$0.m61110d();
            if (m61110d != -1) {
                roundToInt = this.this$0.m61110d();
            } else if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                float abs = Math.abs(this.this$0.getCurrentPageOffsetFraction());
                m61107g = this.this$0.m61107g();
                if (abs >= Math.abs(m61107g)) {
                    roundToInt = this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction()));
                } else {
                    roundToInt = this.this$0.getCurrentPage();
                }
            } else {
                float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release();
                m61108f = this.this$0.m61108f();
                float f = snapRemainingScrollOffset$foundation_release / m61108f;
                roundToInt = AbstractC21140mr0.roundToInt(f) + this.this$0.getCurrentPage();
            }
        } else {
            roundToInt = this.this$0.getCurrentPage();
        }
        m61111c = this.this$0.m61111c(roundToInt);
        return Integer.valueOf(m61111c);
    }
}
