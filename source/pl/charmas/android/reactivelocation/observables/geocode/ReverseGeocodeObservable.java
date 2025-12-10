package pl.charmas.android.reactivelocation.observables.geocode;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.schedulers.Schedulers;

/* loaded from: classes5.dex */
public class ReverseGeocodeObservable implements Observable.OnSubscribe<List<Address>> {

    /* renamed from: a */
    public final Context f76716a;

    /* renamed from: b */
    public final Locale f76717b;

    /* renamed from: c */
    public final double f76718c;

    /* renamed from: d */
    public final double f76719d;

    /* renamed from: e */
    public final int f76720e;

    public ReverseGeocodeObservable(Context context, Locale locale, double d, double d2, int i) {
        this.f76716a = context;
        this.f76718c = d;
        this.f76719d = d2;
        this.f76720e = i;
        this.f76717b = locale;
    }

    public static Observable<List<Address>> createObservable(Context context, Locale locale, double d, double d2, int i) {
        return Observable.create(new ReverseGeocodeObservable(context, locale, d, d2, i));
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super List<Address>> subscriber) {
        try {
            subscriber.onNext(new Geocoder(this.f76716a, this.f76717b).getFromLocation(this.f76718c, this.f76719d, this.f76720e));
            subscriber.onCompleted();
        } catch (IOException e) {
            if (e.getMessage().equalsIgnoreCase("Service not Available")) {
                Observable.create(new C1829ZV(this.f76717b, this.f76718c, this.f76719d, this.f76720e)).subscribeOn(Schedulers.m22755io()).subscribe((Subscriber) subscriber);
            } else {
                subscriber.onError(e);
            }
        }
    }
}
