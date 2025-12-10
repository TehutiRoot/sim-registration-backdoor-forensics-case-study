package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel", m29092f = "UpPassViewModel.kt", m29091i = {0}, m29090l = {542}, m29089m = "kyc2Cancel", m29088n = {"this"}, m29087s = {"L$0"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2Cancel$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$kyc2Cancel$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$kyc2Cancel$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$kyc2Cancel$1> continuation) {
        super(continuation);
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m1856b;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1856b = this.this$0.m1856b(this);
        return m1856b;
    }
}