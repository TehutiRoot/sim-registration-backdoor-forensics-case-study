package androidx.compose.p003ui.tooling.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$1 */
/* loaded from: classes2.dex */
public final class AnimationSearch$unsupportedSearch$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ AnimationSearch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationSearch$unsupportedSearch$1(AnimationSearch animationSearch) {
        super(1);
        this.this$0 = animationSearch;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        function0 = this.this$0.f31646a;
        ((PreviewAnimationClock) function0.invoke()).trackAnimateContentSize(it);
    }
}
