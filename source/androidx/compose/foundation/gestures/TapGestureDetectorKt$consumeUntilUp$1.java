package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m28800f = "TapGestureDetector.kt", m28799i = {0}, m28798l = {195}, m28797m = "consumeUntilUp", m28796n = {"$this$consumeUntilUp"}, m28795s = {"L$0"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$consumeUntilUp$1(Continuation<? super TapGestureDetectorKt$consumeUntilUp$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m61459b;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61459b = TapGestureDetectorKt.m61459b(null, this);
        return m61459b;
    }
}
