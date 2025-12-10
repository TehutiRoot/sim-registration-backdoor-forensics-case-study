package com.google.android.gms.tagmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzsc;
import com.google.android.gms.internal.gtm.zzsd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public class Container {
    private final Context zza;
    private final String zzb;
    private final DataLayer zzc;
    private zzet zzd;
    private Map zze;
    private Map zzf;
    private volatile long zzg;
    private volatile String zzh;

    /* loaded from: classes3.dex */
    public interface FunctionCallMacroCallback {
        @NonNull
        Object getValue(@NonNull String str, @NonNull Map<String, Object> map);
    }

    /* loaded from: classes3.dex */
    public interface FunctionCallTagCallback {
        void execute(@NonNull String str, @NonNull Map<String, Object> map);
    }

    public Container(Context context, DataLayer dataLayer, String str, long j, com.google.android.gms.internal.gtm.zzak zzakVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = j;
        com.google.android.gms.internal.gtm.zzac zzc = zzakVar.zzc();
        zzc.getClass();
        try {
            zzg(zzsd.zzb(zzc));
        } catch (zzsc e) {
            String obj = zzc.toString();
            String obj2 = e.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Not loading resource: ");
            sb.append(obj);
            sb.append(" because it is invalid: ");
            sb.append(obj2);
        }
        if (zzakVar.zza() != 0) {
            com.google.android.gms.internal.gtm.zzai[] zzaiVarArr = (com.google.android.gms.internal.gtm.zzai[]) zzakVar.zzi().toArray(new com.google.android.gms.internal.gtm.zzai[0]);
            zzet zzf = zzf();
            if (zzf == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.gtm.zzai zzaiVar : zzaiVarArr) {
                arrayList.add(zzaiVar);
            }
            zzf.zze(arrayList);
        }
    }

    private final synchronized zzet zzf() {
        return this.zzd;
    }

    private final void zzg(zzrv zzrvVar) {
        this.zzh = zzrvVar.zzb();
        zzh(new zzet((Context) Preconditions.checkNotNull(this.zza), zzrvVar, (DataLayer) Preconditions.checkNotNull(this.zzc), new zzu(this, null), new zzw(this, null), new zzdk()));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzc.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", Preconditions.checkNotNull(this.zzb)));
        }
    }

    private final synchronized void zzh(zzet zzetVar) {
        this.zzd = zzetVar;
    }

    public boolean getBoolean(@NonNull String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            zzfu.zze().booleanValue();
            return false;
        }
        try {
            return zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).booleanValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getBoolean() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzfu.zze().booleanValue();
            return false;
        }
    }

    @NonNull
    public String getContainerId() {
        return this.zzb;
    }

    public double getDouble(@NonNull String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            return zzfu.zzg().doubleValue();
        }
        try {
            return zzfu.zzh(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).doubleValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getDouble() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            return zzfu.zzg().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzg;
    }

    public long getLong(@NonNull String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            zzfu.zzi().longValue();
            return 0L;
        }
        try {
            return zzfu.zzj(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).longValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getLong() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzfu.zzi().longValue();
            return 0L;
        }
    }

    @NonNull
    public String getString(@NonNull String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            return zzfu.zzl();
        }
        try {
            return zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza()));
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Calling getString() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            return zzfu.zzl();
        }
    }

    public boolean isDefault() {
        if (getLastRefreshTime() == 0) {
            return true;
        }
        return false;
    }

    public void registerFunctionCallMacroCallback(@NonNull String str, @NonNull FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback != null) {
            synchronized (this.zze) {
                this.zze.put(str, functionCallMacroCallback);
            }
            return;
        }
        throw new NullPointerException("Macro handler must be non-null");
    }

    public void registerFunctionCallTagCallback(@NonNull String str, @NonNull FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback != null) {
            synchronized (this.zzf) {
                this.zzf.put(str, functionCallTagCallback);
            }
            return;
        }
        throw new NullPointerException("Tag callback must be non-null");
    }

    public void unregisterFunctionCallMacroCallback(@NonNull String str) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(@NonNull String str) {
        synchronized (this.zzf) {
            this.zzf.remove(str);
        }
    }

    @VisibleForTesting
    public final FunctionCallMacroCallback zza(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zze) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zze.get(str);
        }
        return functionCallMacroCallback;
    }

    @NonNull
    @VisibleForTesting
    public final FunctionCallTagCallback zzb(@NonNull String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzf) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzf.get(str);
        }
        return functionCallTagCallback;
    }

    @NonNull
    @VisibleForTesting
    public final String zzc() {
        return this.zzh;
    }

    @VisibleForTesting
    public final void zzd(@NonNull String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            return;
        }
        zzf.zzc(str);
    }

    public final void zze() {
        this.zzd = null;
    }

    public Container(Context context, DataLayer dataLayer, String str, long j, zzrv zzrvVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = 0L;
        zzg(zzrvVar);
    }
}
