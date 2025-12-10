package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbtComponent {

    /* renamed from: a */
    public final Map f54539a = new HashMap();

    /* renamed from: b */
    public final Context f54540b;

    /* renamed from: c */
    public final Provider f54541c;

    @VisibleForTesting(otherwise = 3)
    public AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.f54540b = context;
        this.f54541c = provider;
    }

    @VisibleForTesting
    public FirebaseABTesting createAbtInstance(String str) {
        return new FirebaseABTesting(this.f54540b, this.f54541c, str);
    }

    public synchronized FirebaseABTesting get(String str) {
        try {
            if (!this.f54539a.containsKey(str)) {
                this.f54539a.put(str, createAbtInstance(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (FirebaseABTesting) this.f54539a.get(str);
    }
}
