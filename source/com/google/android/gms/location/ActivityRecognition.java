package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public class ActivityRecognition {
    @NonNull
    public static final Api<Api.ApiOptions.NoOptions> API;
    @NonNull
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi;
    @NonNull
    public static final String CLIENT_NAME = "activity_recognition";

    /* renamed from: a */
    public static final Api.ClientKey f47694a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f47695b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f47694a = clientKey;
        F92 f92 = new F92();
        f47695b = f92;
        API = new Api<>("ActivityRecognition.API", f92, clientKey);
        ActivityRecognitionApi = new com.google.android.gms.internal.location.zzg();
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Activity activity) {
        return new ActivityRecognitionClient(activity);
    }

    @NonNull
    public static ActivityRecognitionClient getClient(@NonNull Context context) {
        return new ActivityRecognitionClient(context);
    }
}
