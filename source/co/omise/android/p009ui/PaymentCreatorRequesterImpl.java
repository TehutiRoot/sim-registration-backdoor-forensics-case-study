package co.omise.android.p009ui;

import co.omise.android.api.Client;
import co.omise.android.api.Request;
import co.omise.android.api.RequestListener;
import co.omise.android.models.Capability;
import co.omise.android.models.Source;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: co.omise.android.ui.PaymentCreatorRequesterImpl */
/* loaded from: classes3.dex */
public final class PaymentCreatorRequesterImpl implements PaymentCreatorRequester {

    /* renamed from: a */
    public final Client f40370a;

    /* renamed from: b */
    public final long f40371b;

    /* renamed from: c */
    public final String f40372c;

    /* renamed from: d */
    public final Capability f40373d;

    /* renamed from: e */
    public PaymentCreatorRequestListener f40374e;

    public PaymentCreatorRequesterImpl(Client client, long j, String currency, Capability capability) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(capability, "capability");
        this.f40370a = client;
        this.f40371b = j;
        this.f40372c = currency;
        this.f40373d = capability;
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public long getAmount() {
        return this.f40371b;
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public Capability getCapability() {
        return this.f40373d;
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public String getCurrency() {
        return this.f40372c;
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public PaymentCreatorRequestListener getListener() {
        return this.f40374e;
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public void request(Request request, final Function1 function1) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f40370a.send(request, new RequestListener<Source>() { // from class: co.omise.android.ui.PaymentCreatorRequesterImpl$request$1
            @Override // co.omise.android.api.RequestListener
            public void onRequestFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Function1<Result<Source>, Unit> function12 = function1;
                if (function12 != null) {
                    Result.Companion companion = Result.Companion;
                    function12.invoke(Result.m74086boximpl(Result.m74087constructorimpl(ResultKt.createFailure(throwable))));
                }
                PaymentCreatorRequestListener listener = this.getListener();
                if (listener != null) {
                    Result.Companion companion2 = Result.Companion;
                    listener.onSourceCreated(Result.m74087constructorimpl(ResultKt.createFailure(throwable)));
                }
            }

            @Override // co.omise.android.api.RequestListener
            public void onRequestSucceed(@NotNull Source model) {
                Intrinsics.checkNotNullParameter(model, "model");
                Function1<Result<Source>, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Result.m74086boximpl(Result.m74087constructorimpl(model)));
                }
                PaymentCreatorRequestListener listener = this.getListener();
                if (listener != null) {
                    listener.onSourceCreated(Result.m74087constructorimpl(model));
                }
            }
        });
    }

    @Override // co.omise.android.p009ui.PaymentCreatorRequester
    public void setListener(PaymentCreatorRequestListener paymentCreatorRequestListener) {
        this.f40374e = paymentCreatorRequestListener;
    }
}
