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
    public static final GmsLogger f46003f = new GmsLogger("ModelResourceManager", "");
    public static final Component<?> zzblr = Component.builder(zzqz.class).add(Dependency.required(Context.class)).factory(C20077gK2.f62155a).build();

    /* renamed from: a */
    public final zzqf f46004a = zzqf.zzoq();

    /* renamed from: b */
    public final AtomicLong f46005b;

    /* renamed from: c */
    public final Set f46006c;

    /* renamed from: d */
    public final Set f46007d;

    /* renamed from: e */
    public final ConcurrentHashMap f46008e;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzqz$a */
    /* loaded from: classes3.dex */
    public class CallableC6509a implements Callable {

        /* renamed from: a */
        public final zzqx f46009a;

        /* renamed from: b */
        public final String f46010b;

        public CallableC6509a(zzqx zzqxVar, String str) {
            this.f46009a = zzqxVar;
            this.f46010b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final Void call() {
            String str = this.f46010b;
            str.hashCode();
            if (!str.equals("OPERATION_RELEASE")) {
                if (str.equals("OPERATION_LOAD")) {
                    try {
                        zzqz.this.m47507g(this.f46009a);
                        return null;
                    } catch (FirebaseMLException e) {
                        zzqz.f46003f.m48402e("ModelResourceManager", "Error preloading model resource", e);
                        return null;
                    }
                }
                return null;
            }
            zzqx zzqxVar = this.f46009a;
            zzqz.f46003f.m48399v("ModelResourceManager", "Releasing modelResource");
            zzqxVar.release();
            zzqz.this.f46007d.remove(zzqxVar);
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CallableC6509a)) {
                return false;
            }
            CallableC6509a callableC6509a = (CallableC6509a) obj;
            if (!Objects.equal(this.f46009a, callableC6509a.f46009a) || !Objects.equal(this.f46010b, callableC6509a.f46010b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f46009a, this.f46010b);
        }
    }

    public zzqz(Context context) {
        AtomicLong atomicLong = new AtomicLong(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        this.f46005b = atomicLong;
        this.f46006c = new HashSet();
        this.f46007d = new HashSet();
        this.f46008e = new ConcurrentHashMap();
        if (context instanceof Application) {
            BackgroundDetector.initialize((Application) context);
        } else {
            f46003f.m48403e("ModelResourceManager", "No valid Application available and auto-manage cannot work");
        }
        BackgroundDetector.getInstance().addListener(new BackgroundDetector.BackgroundStateChangeListener(this) { // from class: ZJ2

            /* renamed from: a */
            public final zzqz f8155a;

            {
                this.f8155a = this;
            }

            @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                this.f8155a.m47512b(z);
            }
        });
        if (BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
            atomicLong.set(BuyDolAddBankAccountFragment.WAIT_MILLI);
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ zzqz m47509e(ComponentContainer componentContainer) {
        return new zzqz((Context) componentContainer.get(Context.class));
    }

    /* renamed from: b */
    public final /* synthetic */ void m47512b(boolean z) {
        long j;
        GmsLogger gmsLogger = f46003f;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Background state changed to: ");
        sb.append(z);
        gmsLogger.m48399v("ModelResourceManager", sb.toString());
        AtomicLong atomicLong = this.f46005b;
        if (z) {
            j = BuyDolAddBankAccountFragment.WAIT_MILLI;
        } else {
            j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        }
        atomicLong.set(j);
        m47506h();
    }

    /* renamed from: c */
    public final synchronized void m47511c(zzqx zzqxVar) {
        if (this.f46006c.contains(zzqxVar)) {
            m47510d(zzqxVar);
        }
    }

    /* renamed from: d */
    public final void m47510d(zzqx zzqxVar) {
        CallableC6509a m47508f = m47508f(zzqxVar);
        this.f46004a.zzb(m47508f);
        long j = this.f46005b.get();
        GmsLogger gmsLogger = f46003f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Rescheduling modelResource release after: ");
        sb.append(j);
        gmsLogger.m48399v("ModelResourceManager", sb.toString());
        this.f46004a.zza(m47508f, j);
    }

    /* renamed from: f */
    public final CallableC6509a m47508f(zzqx zzqxVar) {
        this.f46008e.putIfAbsent(zzqxVar, new CallableC6509a(zzqxVar, "OPERATION_RELEASE"));
        return (CallableC6509a) this.f46008e.get(zzqxVar);
    }

    /* renamed from: g */
    public final void m47507g(zzqx zzqxVar) {
        if (this.f46007d.contains(zzqxVar)) {
            return;
        }
        try {
            zzqxVar.zzow();
            this.f46007d.add(zzqxVar);
        } catch (RuntimeException e) {
            throw new FirebaseMLException("The load task failed", 13, e);
        }
    }

    /* renamed from: h */
    public final synchronized void m47506h() {
        for (zzqx zzqxVar : this.f46006c) {
            m47510d(zzqxVar);
        }
    }

    public final synchronized void zza(@NonNull zzqx zzqxVar) {
        Preconditions.checkNotNull(zzqxVar, "Model source can not be null");
        GmsLogger gmsLogger = f46003f;
        gmsLogger.m48405d("ModelResourceManager", "Add auto-managed model resource");
        if (this.f46006c.contains(zzqxVar)) {
            gmsLogger.m48401i("ModelResourceManager", "The model resource is already registered.");
            return;
        }
        this.f46006c.add(zzqxVar);
        if (zzqxVar != null) {
            this.f46004a.zza(new CallableC6509a(zzqxVar, "OPERATION_LOAD"));
            m47511c(zzqxVar);
        }
    }

    public final synchronized void zzd(@Nullable zzqx zzqxVar) {
        if (zzqxVar == null) {
            return;
        }
        CallableC6509a m47508f = m47508f(zzqxVar);
        this.f46004a.zzb(m47508f);
        this.f46004a.zza(m47508f, 0L);
    }
}