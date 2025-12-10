package pl.charmas.android.reactivelocation.observables.activity;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionResult;
import p046rx.Observable;
import p046rx.Observer;

/* loaded from: classes5.dex */
public class ActivityUpdatesObservable extends BaseActivityObservable<ActivityRecognitionResult> {

    /* renamed from: c */
    public final Context f76708c;

    /* renamed from: d */
    public final int f76709d;

    /* renamed from: e */
    public C13126a f76710e;

    /* renamed from: pl.charmas.android.reactivelocation.observables.activity.ActivityUpdatesObservable$a */
    /* loaded from: classes5.dex */
    public static class C13126a extends BroadcastReceiver {

        /* renamed from: a */
        public final Observer f76711a;

        public C13126a(Observer observer) {
            this.f76711a = observer;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                this.f76711a.onNext(ActivityRecognitionResult.extractResult(intent));
            }
        }
    }

    public ActivityUpdatesObservable(Context context, int i) {
        super(context);
        this.f76708c = context;
        this.f76709d = i;
    }

    public static Observable<ActivityRecognitionResult> createObservable(Context context, int i) {
        return Observable.create(new ActivityUpdatesObservable(context, i));
    }

    /* renamed from: a */
    public final PendingIntent m23606a() {
        return PendingIntent.getBroadcast(this.f76708c, 0, new Intent("pl.charmas.android.reactivelocation.ACTION_ACTIVITY_UPDATE_DETECTED"), 134217728);
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super ActivityRecognitionResult> observer) {
        C13126a c13126a = new C13126a(observer);
        this.f76710e = c13126a;
        this.f76708c.registerReceiver(c13126a, new IntentFilter("pl.charmas.android.reactivelocation.ACTION_ACTIVITY_UPDATE_DETECTED"));
        ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(googleApiClient, this.f76709d, m23606a());
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onUnsubscribed(GoogleApiClient googleApiClient) {
        if (googleApiClient.isConnected()) {
            ActivityRecognition.ActivityRecognitionApi.removeActivityUpdates(googleApiClient, m23606a());
        }
        this.f76708c.unregisterReceiver(this.f76710e);
        this.f76710e = null;
    }
}
