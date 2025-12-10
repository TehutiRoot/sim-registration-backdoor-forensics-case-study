package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes4.dex */
public class MlKitContext {

    /* renamed from: b */
    public static final Object f56917b = new Object();

    /* renamed from: c */
    public static MlKitContext f56918c;

    /* renamed from: a */
    public ComponentRuntime f56919a;

    /* renamed from: a */
    public static Context m37239a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext getInstance() {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            if (f56918c != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(f56918c);
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            try {
                if (f56918c == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                f56918c = mlKitContext2;
                Context m37239a = m37239a(context);
                HashMap hashMap = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    hashMap.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ComponentRuntime componentRuntime = new ComponentRuntime(TaskExecutors.MAIN_THREAD, new ArrayList(hashMap.values()), Component.m39222of(m37239a, Context.class, new Class[0]), Component.m39222of(mlKitContext2, MlKitContext.class, new Class[0]));
                mlKitContext2.f56919a = componentRuntime;
                componentRuntime.initializeEagerComponents(true);
                mlKitContext = f56918c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context) {
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            mlKitContext = f56918c;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext zza(@NonNull Context context) {
        MlKitContext zzb;
        synchronized (f56917b) {
            zzb = zzb(context, TaskExecutors.MAIN_THREAD);
        }
        return zzb;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            if (f56918c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            f56918c = mlKitContext2;
            Context m37239a = m37239a(context);
            ComponentRuntime build = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(m37239a, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.m39222of(m37239a, Context.class, new Class[0])).addComponent(Component.m39222of(mlKitContext2, MlKitContext.class, new Class[0])).build();
            mlKitContext2.f56919a = build;
            build.initializeEagerComponents(true);
            mlKitContext = f56918c;
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public <T> T get(@NonNull Class<T> cls) {
        boolean z;
        if (f56918c == this) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f56919a);
        return (T) this.f56919a.get(cls);
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            mlKitContext = f56918c;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (f56917b) {
            mlKitContext = f56918c;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }
}
