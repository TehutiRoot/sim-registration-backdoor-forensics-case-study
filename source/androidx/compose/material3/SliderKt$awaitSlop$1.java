package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.SliderKt", m28800f = "Slider.kt", m28799i = {0}, m28798l = {1095}, m28797m = "awaitSlop-8vUncbI", m28796n = {"initialDelta"}, m28795s = {"L$0"})
/* loaded from: classes2.dex */
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(Continuation<? super SliderKt$awaitSlop$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60546n;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60546n = SliderKt.m60546n(null, 0L, 0, this);
        return m60546n;
    }
}
