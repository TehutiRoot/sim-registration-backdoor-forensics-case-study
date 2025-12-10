package co.omise.android.p009ui;

import co.omise.android.api.Request;
import co.omise.android.models.Capability;
import co.omise.android.models.Model;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J7\u0010\u0016\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aH&ø\u0001\u0000R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28850d2 = {"Lco/omise/android/ui/PaymentCreatorRequester;", "T", "Lco/omise/android/models/Model;", "", "amount", "", "getAmount", "()J", "capability", "Lco/omise/android/models/Capability;", "getCapability", "()Lco/omise/android/models/Capability;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/ui/PaymentCreatorRequestListener;", "getListener", "()Lco/omise/android/ui/PaymentCreatorRequestListener;", "setListener", "(Lco/omise/android/ui/PaymentCreatorRequestListener;)V", "request", "", "Lco/omise/android/api/Request;", "result", "Lkotlin/Function1;", "Lkotlin/Result;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentCreatorRequester */
/* loaded from: classes3.dex */
public interface PaymentCreatorRequester<T extends Model> {

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentCreatorRequester$DefaultImpls */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void request$default(PaymentCreatorRequester paymentCreatorRequester, Request request, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = null;
                }
                paymentCreatorRequester.request(request, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
    }

    long getAmount();

    @NotNull
    Capability getCapability();

    @NotNull
    String getCurrency();

    @Nullable
    PaymentCreatorRequestListener getListener();

    void request(@NotNull Request<T> request, @Nullable Function1<? super Result<? extends T>, Unit> function1);

    void setListener(@Nullable PaymentCreatorRequestListener paymentCreatorRequestListener);
}
