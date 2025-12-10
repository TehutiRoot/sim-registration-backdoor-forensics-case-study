package co.omise.android.p009ui;

import androidx.lifecycle.MutableLiveData;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.OmiseException;
import co.omise.android.models.Authentication;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m29142d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentViewModel$special$$inlined$CoroutineExceptionHandler$1 */
/* loaded from: classes3.dex */
public final class C5546x49d20eee extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ AuthorizingPaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546x49d20eee(CoroutineExceptionHandler.Key key, AuthorizingPaymentViewModel authorizingPaymentViewModel) {
        super(key);
        this.this$0 = authorizingPaymentViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        MutableLiveData mutableLiveData;
        mutableLiveData = this.this$0._isLoading;
        mutableLiveData.postValue(Boolean.FALSE);
        this.this$0.threeDS2Service.getTransaction().close();
        if (!(th2 instanceof OmiseException)) {
            MutableLiveData mutableLiveData2 = this.this$0._error;
            String message = Authentication.AuthenticationStatus.FAILED.getMessage();
            Intrinsics.checkNotNull(message);
            mutableLiveData2.postValue(new OmiseException(message, th2));
            return;
        }
        this.this$0._error.postValue(th2);
    }
}