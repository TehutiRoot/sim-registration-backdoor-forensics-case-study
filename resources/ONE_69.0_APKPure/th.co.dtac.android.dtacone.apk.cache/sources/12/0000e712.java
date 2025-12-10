package kotlinx.coroutines.selects;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "kotlinx.coroutines.selects.SelectImplementation", m29092f = "Select.kt", m29091i = {}, m29090l = {TypedValues.TransitionType.TYPE_STAGGERED}, m29089m = "processResultAndInvokeBlockRecoveringException", m29088n = {}, m29087s = {})
/* renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
/* loaded from: classes6.dex */
public final class C12128xf491fb2a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12128xf491fb2a(SelectImplementation<R> selectImplementation, Continuation<? super C12128xf491fb2a> continuation) {
        super(continuation);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27060j;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27060j = this.this$0.m27060j(null, null, this);
        return m27060j;
    }
}