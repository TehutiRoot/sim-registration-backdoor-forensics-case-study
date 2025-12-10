package androidx.compose.p003ui.tooling.animation;

import androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.p003ui.tooling.animation.clock.InfiniteTransitionClock;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nPreviewAnimationClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock$trackInfiniteTransition$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1$1$1 */
/* loaded from: classes2.dex */
public final class PreviewAnimationClock$trackInfiniteTransition$1$1$1 extends Lambda implements Function0<Long> {
    final /* synthetic */ PreviewAnimationClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackInfiniteTransition$1$1$1(PreviewAnimationClock previewAnimationClock) {
        super(0);
        this.this$0 = previewAnimationClock;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        List m58920c;
        Long valueOf;
        m58920c = this.this$0.m58920c();
        Iterator it = m58920c.iterator();
        Long l = null;
        if (it.hasNext()) {
            valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        Iterator<T> it2 = this.this$0.getInfiniteTransitionClocks$ui_tooling_release().values().iterator();
        if (it2.hasNext()) {
            l = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
            while (it2.hasNext()) {
                Long valueOf3 = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
                if (l.compareTo(valueOf3) < 0) {
                    l = valueOf3;
                }
            }
        }
        return Long.valueOf(Math.max(longValue, l != null ? l.longValue() : 0L));
    }
}
