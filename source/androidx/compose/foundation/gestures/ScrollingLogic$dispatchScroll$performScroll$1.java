package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends Lambda implements Function1<Offset, Offset> {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
        return Offset.m71491boximpl(m69449invokeMKHz9U(offset.m71512unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m69449invokeMKHz9U(long j) {
        NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) this.this$0.m61475d().getValue();
        long m72619dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m72619dispatchPreScrollOzD1aCk(j, this.$source);
        long m71506minusMKHz9U = Offset.m71506minusMKHz9U(j, m72619dispatchPreScrollOzD1aCk);
        ScrollingLogic scrollingLogic = this.this$0;
        long m61468k = scrollingLogic.m61468k(scrollingLogic.m61462q(this.$this_dispatchScroll.scrollBy(scrollingLogic.m61463p(scrollingLogic.m61468k(m71506minusMKHz9U)))));
        return Offset.m71507plusMKHz9U(Offset.m71507plusMKHz9U(m72619dispatchPreScrollOzD1aCk, m61468k), nestedScrollDispatcher.m72617dispatchPostScrollDzOQY0M(m61468k, Offset.m71506minusMKHz9U(m71506minusMKHz9U, m61468k), this.$source));
    }
}
