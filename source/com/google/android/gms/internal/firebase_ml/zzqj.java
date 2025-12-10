package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqc;
import com.google.android.gms.internal.firebase_ml.zzqg;
import com.google.android.gms.internal.firebase_ml.zzqj;
import com.google.android.gms.internal.firebase_ml.zzqx;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class zzqj {

    /* renamed from: b */
    public static final GmsLogger f45966b = new GmsLogger("MLTaskManager", "");
    public static final Component<?> zzblr = Component.builder(zzqj.class).add(Dependency.required(zzqz.class)).factory(UI2.f6280a).build();

    /* renamed from: a */
    public final zzqz f45967a;

    public zzqj(zzqz zzqzVar) {
        this.f45967a = zzqzVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ zzqj m47513a(ComponentContainer componentContainer) {
        return new zzqj((zzqz) componentContainer.get(zzqz.class));
    }

    public static synchronized zzqj zza(zzqn zzqnVar) {
        zzqj zzqjVar;
        synchronized (zzqj.class) {
            zzqjVar = (zzqj) zzqnVar.get(zzqj.class);
        }
        return zzqjVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object m47512b(zzqx zzqxVar, zzqc zzqcVar, zzqg zzqgVar) {
        if (zzqxVar != null) {
            this.f45967a.m47498g(zzqxVar);
        }
        return zzqcVar.zza(zzqgVar);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m47511c(zzqx zzqxVar, Callable callable) {
        this.f45967a.m47498g(zzqxVar);
        return callable.call();
    }

    public final <T, S extends zzqg> void zzb(zzqc<T, S> zzqcVar) {
        zzqx zzon = zzqcVar.zzon();
        if (zzon != null) {
            this.f45967a.zzd(zzon);
        }
    }

    public final <T, S extends zzqg> void zza(zzqc<T, S> zzqcVar) {
        zzqx zzon = zzqcVar.zzon();
        if (zzon != null) {
            this.f45967a.zza(zzon);
        }
    }

    public final synchronized <TResult> Task<TResult> zza(@NonNull zzqx zzqxVar, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(callable, "Operation can not be null");
        Preconditions.checkNotNull(zzqxVar, "Model resource can not be null");
        f45966b.m48408d("MLTaskManager", "Execute task");
        this.f45967a.m47502c(zzqxVar);
        return zzqf.zzoq().zza(new Callable(this, zzqxVar, callable) { // from class: TI2

            /* renamed from: a */
            public final zzqj f5984a;

            /* renamed from: b */
            public final zzqx f5985b;

            /* renamed from: c */
            public final Callable f5986c;

            {
                this.f5984a = this;
                this.f5985b = zzqxVar;
                this.f5986c = callable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5984a.m47511c(this.f5985b, this.f5986c);
            }
        });
    }

    public final synchronized <T, S extends zzqg> Task<T> zza(@NonNull zzqc<T, S> zzqcVar, @NonNull S s) {
        zzqx zzon;
        try {
            Preconditions.checkNotNull(zzqcVar, "Operation can not be null");
            Preconditions.checkNotNull(s, "Input can not be null");
            f45966b.m48408d("MLTaskManager", "Execute task");
            zzon = zzqcVar.zzon();
            if (zzon != null) {
                this.f45967a.m47502c(zzon);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzqf.zzoq().zza(new Callable(this, zzon, zzqcVar, s) { // from class: VI2

            /* renamed from: a */
            public final zzqj f6615a;

            /* renamed from: b */
            public final zzqx f6616b;

            /* renamed from: c */
            public final zzqc f6617c;

            /* renamed from: d */
            public final zzqg f6618d;

            {
                this.f6615a = this;
                this.f6616b = zzon;
                this.f6617c = zzqcVar;
                this.f6618d = s;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6615a.m47512b(this.f6616b, this.f6617c, this.f6618d);
            }
        });
    }
}
