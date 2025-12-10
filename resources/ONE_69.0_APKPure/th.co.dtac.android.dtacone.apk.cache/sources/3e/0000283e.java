package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        int m61060d;
        int m61058f;
        int roundToInt;
        float m61057g;
        int m61061c;
        if (this.this$0.isScrollInProgress()) {
            m61060d = this.this$0.m61060d();
            if (m61060d != -1) {
                roundToInt = this.this$0.m61060d();
            } else if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                float abs = Math.abs(this.this$0.getCurrentPageOffsetFraction());
                m61057g = this.this$0.m61057g();
                if (abs >= Math.abs(m61057g)) {
                    roundToInt = this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction()));
                } else {
                    roundToInt = this.this$0.getCurrentPage();
                }
            } else {
                float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release();
                m61058f = this.this$0.m61058f();
                float f = snapRemainingScrollOffset$foundation_release / m61058f;
                roundToInt = AbstractC22237sr0.roundToInt(f) + this.this$0.getCurrentPage();
            }
        } else {
            roundToInt = this.this$0.getCurrentPage();
        }
        m61061c = this.this$0.m61061c(roundToInt);
        return Integer.valueOf(m61061c);
    }
}