package com.google.android.gms.internal.firebase_ml;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqz;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.p015ml.common.FirebaseMLException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* loaded from: classes3.dex */
public final class zzqz {

    /* renamed from: f */
    public static final GmsLogger f45991f = new GmsLogger("ModelResourceManager", "");
    public static final Component<?> zzblr = Component.builder(zzqz.class).add(Dependency.required(Context.class)).factory(C20538jJ2.f67249a).build();

    /* renamed from: a */
    public final zzqf f45992a = zzqf.zzoq();

    /* renamed from: b */
    public final AtomicLong f45993b;

    /* renamed from: c */
    public final Set f45994c;

    /* renamed from: d */
    public final Set f45995d;

    /* renamed from: e */
    public final ConcurrentHashMap f45996e;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzqz$a */
    /* loaded from: classes3.dex */
    public class CallableC6520a implements Callable {

        /* renamed from: a */
        public final zzqx f45997a;

        /* renamed from: b */
        public final String f45998b;

        public CallableC6520a(zzqx zzqxVar, String str) {
            this.f45997a = zzqxVar;
            this.f45998b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final Void call() {
            String str = this.f45998b;
            str.hashCode();
            if (!str.equals("OPERATION_RELEASE")) {
                if (str.equals("OPERATION_LOAD")) {
                    try {
                        zzqz.this.m47498g(this.f45997a);
                        return null;
                    } catch (FirebaseMLException e) {
                        zzqz.f45991f.m48405e("ModelResourceManager", "Error preloading model resource", e);
                        return null;
                    }
                }
                return null;
            }
            zzqx zzqxVar = this.f45997a;
            zzqz.f45991f.m48402v("ModelResourceManager", "Releasing modelResource");
            zzqxVar.release();
            zzqz.this.f45995d.remove(zzqxVar);
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CallableC6520a)) {
                return false;
            }
            CallableC6520a callableC6520a = (CallableC6520a) obj;
            if (!Objects.equal(this.f45997a, callableC6520a.f45997a) || !Objects.equal(this.f45998b, callableC6520a.f45998b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f45997a, this.f45998b);
        }
    }

    public zzqz(Context context) {
        AtomicLong atomicLong = new AtomicLong(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        this.f45993b = atomicLong;
        this.f45994c = new HashSet();
        this.f45995d = new HashSet();
        this.f45996e = new ConcurrentHashMap();
        if (context instanceof Application) {
            BackgroundDetector.initialize((Application) context);
        } else {
            f45991f.m48406e("ModelResourceManager", "No valid Application available and auto-manage cannot work");
        }
        BackgroundDetector.getInstance().addListener(new BackgroundDetector.BackgroundStateChangeListener(this) { // from class: cJ2

            /* renamed from: a */
            public final zzqz f39393a;

            {
                this.f39393a = this;
            }

            @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                this.f39393a.m47503b(z);
            }
        });
        if (BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
            atomicLong.set(BuyDolAddBankAccountFragment.WAIT_MILLI);
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ zzqz m47500e(ComponentContainer componentContainer) {
        return new zzqz((Context) componentContainer.get(Context.class));
    }

    /* renamed from: b */
    public final /* synthetic */ void m47503b(boolean z) {
        long j;
        GmsLogger gmsLogger = f45991f;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Background state changed to: ");
        sb.append(z);
        gmsLogger.m48402v("ModelResourceManager", sb.toString());
        AtomicLong atomicLong = this.f45993b;
        if (z) {
            j = BuyDolAddBankAccountFragment.WAIT_MILLI;
        } else {
            j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        }
        atomicLong.set(j);
        m47497h();
    }

    /* renamed from: c */
    public final synchronized void m47502c(zzqx zzqxVar) {
        if (this.f45994c.contains(zzqxVar)) {
            m47501d(zzqxVar);
        }
    }

    /* renamed from: d */
    public final void m47501d(zzqx zzqxVar) {
        CallableC6520a m47499f = m47499f(zzqxVar);
        this.f45992a.zzb(m47499f);
        long j = this.f45993b.get();
        GmsLogger gmsLogger = f45991f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Rescheduling modelResource release after: ");
        sb.append(j);
        gmsLogger.m48402v("ModelResourceManager", sb.toString());
        this.f45992a.zza(m47499f, j);
    }

    /* renamed from: f */
    public final CallableC6520a m47499f(zzqx zzqxVar) {
        this.f45996e.putIfAbsent(zzqxVar, new CallableC6520a(zzqxVar, "OPERATION_RELEASE"));
        return (CallableC6520a) this.f45996e.get(zzqxVar);
    }

    /* renamed from: g */
    public final void m47498g(zzqx zzqxVar) {
        if (this.f45995d.contains(zzqxVar)) {
            return;
        }
        try {
            zzqxVar.zzow();
            this.f45995d.add(zzqxVar);
        } catch (RuntimeException e) {
            throw new FirebaseMLException("The load task failed", 13, e);
        }
    }

    /* renamed from: h */
    public final synchronized void m47497h() {
        for (zzqx zzqxVar : this.f45994c) {
            m47501d(zzqxVar);
        }
    }

    public final synchronized void zza(@NonNull zzqx zzqxVar) {
        Preconditions.checkNotNull(zzqxVar, "Model source can not be null");
        GmsLogger gmsLogger = f45991f;
        gmsLogger.m48408d("ModelResourceManager", "Add auto-managed model resource");
        if (this.f45994c.contains(zzqxVar)) {
            gmsLogger.m48404i("ModelResourceManager", "The model resource is already registered.");
            return;
        }
        this.f45994c.add(zzqxVar);
        if (zzqxVar != null) {
            this.f45992a.zza(new CallableC6520a(zzqxVar, "OPERATION_LOAD"));
            m47502c(zzqxVar);
        }
    }

    public final synchronized void zzd(@Nullable zzqx zzqxVar) {
        if (zzqxVar == null) {
            return;
        }
        CallableC6520a m47499f = m47499f(zzqxVar);
        this.f45992a.zzb(m47499f);
        this.f45992a.zza(m47499f, 0L);
    }
}
