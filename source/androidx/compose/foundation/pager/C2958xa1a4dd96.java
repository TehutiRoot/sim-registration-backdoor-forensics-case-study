package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28850d2 = {"LAh1;", "invoke", "()LAh1;", "<anonymous>"}, m28849k = 3, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 */
/* loaded from: classes.dex */
public final class C2958xa1a4dd96 extends Lambda implements Function0<C17283Ah1> {
    final /* synthetic */ Function1<Integer, Object> $key;
    final /* synthetic */ State<Function4<PagerScope, Integer, Composer, Integer, Unit>> $latestContent;
    final /* synthetic */ Function0<Integer> $pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2958xa1a4dd96(State<? extends Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit>> state, Function1<? super Integer, ? extends Object> function1, Function0<Integer> function0) {
        super(0);
        this.$latestContent = state;
        this.$key = function1;
        this.$pageCount = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final C17283Ah1 invoke() {
        return new C17283Ah1(this.$latestContent.getValue(), this.$key, this.$pageCount.invoke().intValue());
    }
}
