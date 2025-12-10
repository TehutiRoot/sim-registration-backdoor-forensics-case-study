package th.p047co.dtac.android.dtacone.view.appOne.tol.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository", m29092f = "OneTolRepository.kt", m29091i = {0}, m29090l = {397}, m29089m = "getGisStatusOrder", m29088n = {"this"}, m29087s = {"L$0"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository$getGisStatusOrder$1 */
/* loaded from: classes10.dex */
public final class OneTolRepository$getGisStatusOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneTolRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolRepository$getGisStatusOrder$1(OneTolRepository oneTolRepository, Continuation<? super OneTolRepository$getGisStatusOrder$1> continuation) {
        super(continuation);
        this.this$0 = oneTolRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGisStatusOrder(this);
    }
}