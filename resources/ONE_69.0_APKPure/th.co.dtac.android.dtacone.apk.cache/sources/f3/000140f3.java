package th.p047co.dtac.android.dtacone.view.appOne.tol.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository", m29092f = "OneTolRepository.kt", m29091i = {}, m29090l = {HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED}, m29089m = "validateIdCard", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository$validateIdCard$1 */
/* loaded from: classes10.dex */
public final class OneTolRepository$validateIdCard$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneTolRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolRepository$validateIdCard$1(OneTolRepository oneTolRepository, Continuation<? super OneTolRepository$validateIdCard$1> continuation) {
        super(continuation);
        this.this$0 = oneTolRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.validateIdCard(this);
    }
}