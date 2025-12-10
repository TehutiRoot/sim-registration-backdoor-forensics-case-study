package pl.charmas.android.reactivelocation.observables;

import android.content.Context;
import com.google.android.gms.location.LocationServices;

/* loaded from: classes5.dex */
public abstract class BaseLocationObservable<T> extends BaseObservable<T> {
    public BaseLocationObservable(Context context) {
        super(context, LocationServices.API);
    }
}