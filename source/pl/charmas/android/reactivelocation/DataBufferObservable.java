package pl.charmas.android.reactivelocation;

import com.google.android.gms.common.data.AbstractDataBuffer;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* loaded from: classes5.dex */
public final class DataBufferObservable {

    /* renamed from: pl.charmas.android.reactivelocation.DataBufferObservable$a */
    /* loaded from: classes5.dex */
    public static class C13111a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ AbstractDataBuffer f76683a;

        /* renamed from: pl.charmas.android.reactivelocation.DataBufferObservable$a$a */
        /* loaded from: classes5.dex */
        public class C13112a implements Action0 {
            public C13112a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13111a.this.f76683a.release();
            }
        }

        public C13111a(AbstractDataBuffer abstractDataBuffer) {
            this.f76683a = abstractDataBuffer;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            Observable.from(this.f76683a).subscribe(subscriber);
            subscriber.add(Subscriptions.create(new C13112a()));
        }
    }

    public static <T> Observable<T> from(AbstractDataBuffer<T> abstractDataBuffer) {
        return Observable.create(new C13111a(abstractDataBuffer));
    }
}
