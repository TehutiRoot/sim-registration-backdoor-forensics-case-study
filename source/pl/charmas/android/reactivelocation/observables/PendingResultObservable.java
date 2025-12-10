package pl.charmas.android.reactivelocation.observables;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* loaded from: classes5.dex */
public class PendingResultObservable<T extends Result> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final PendingResult f76703a;

    /* renamed from: b */
    public boolean f76704b = false;

    /* renamed from: pl.charmas.android.reactivelocation.observables.PendingResultObservable$a */
    /* loaded from: classes5.dex */
    public class C13124a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f76705a;

        public C13124a(Subscriber subscriber) {
            this.f76705a = subscriber;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        public void onResult(Result result) {
            this.f76705a.onNext(result);
            PendingResultObservable.this.f76704b = true;
            this.f76705a.onCompleted();
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.PendingResultObservable$b */
    /* loaded from: classes5.dex */
    public class C13125b implements Action0 {
        public C13125b() {
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (!PendingResultObservable.this.f76704b) {
                PendingResultObservable.this.f76703a.cancel();
            }
        }
    }

    public PendingResultObservable(PendingResult<T> pendingResult) {
        this.f76703a = pendingResult;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        this.f76703a.setResultCallback(new C13124a(subscriber));
        subscriber.add(Subscriptions.create(new C13125b()));
    }
}
