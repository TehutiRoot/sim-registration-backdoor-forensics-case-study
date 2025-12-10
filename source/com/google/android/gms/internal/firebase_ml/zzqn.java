package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;

/* loaded from: classes3.dex */
public class zzqn {
    public static final Component<zzqn> zzblr = Component.builder(zzqn.class).add(Dependency.required(FirebaseApp.class)).factory(WI2.f7192a).build();

    /* renamed from: a */
    public final FirebaseApp f45968a;

    public zzqn(FirebaseApp firebaseApp) {
        this.f45968a = firebaseApp;
    }

    /* renamed from: a */
    public static final /* synthetic */ zzqn m47510a(ComponentContainer componentContainer) {
        return new zzqn((FirebaseApp) componentContainer.get(FirebaseApp.class));
    }

    public static zzqn zzor() {
        return (zzqn) FirebaseApp.getInstance().get(zzqn.class);
    }

    public final <T> T get(Class<T> cls) {
        return (T) this.f45968a.get(cls);
    }

    public final Context getApplicationContext() {
        return this.f45968a.getApplicationContext();
    }

    public final String getPersistenceKey() {
        return this.f45968a.getPersistenceKey();
    }

    public final FirebaseApp zzos() {
        return this.f45968a;
    }
}
