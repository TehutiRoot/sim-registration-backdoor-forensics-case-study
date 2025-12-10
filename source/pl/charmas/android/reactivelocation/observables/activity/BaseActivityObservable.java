package pl.charmas.android.reactivelocation.observables.activity;

import android.content.Context;
import com.google.android.gms.location.ActivityRecognition;
import pl.charmas.android.reactivelocation.observables.BaseObservable;

/* loaded from: classes5.dex */
public abstract class BaseActivityObservable<T> extends BaseObservable<T> {
    public BaseActivityObservable(Context context) {
        super(context, ActivityRecognition.API);
    }
}
