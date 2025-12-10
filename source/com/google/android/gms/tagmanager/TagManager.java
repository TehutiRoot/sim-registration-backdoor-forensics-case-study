package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@VisibleForTesting
/* loaded from: classes3.dex */
public class TagManager {
    private static TagManager zza;
    private final zzfo zzb;
    private final Context zzc;
    private final DataLayer zzd;
    private final zzex zze;
    private final ConcurrentMap zzf;
    private final zzao zzg;

    @VisibleForTesting
    public TagManager(Context context, zzfo zzfoVar, DataLayer dataLayer, zzex zzexVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzc = applicationContext;
        this.zze = zzexVar;
        this.zzb = zzfoVar;
        this.zzf = new ConcurrentHashMap();
        this.zzd = dataLayer;
        dataLayer.zzg(new zzfl(this));
        dataLayer.zzg(new zzg(applicationContext));
        this.zzg = new zzao();
        Preconditions.checkNotNull(applicationContext);
        applicationContext.registerComponentCallbacks(new zzfn(this));
        Preconditions.checkNotNull(applicationContext);
        zzd.zzb(applicationContext);
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static TagManager getInstance(@NonNull Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            try {
                if (zza == null) {
                    if (context != null) {
                        zza = new TagManager(context, new zzfm(), new DataLayer(new zzbd(context)), zzfe.zzg());
                    } else {
                        throw null;
                    }
                }
                tagManager = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tagManager;
    }

    public static /* bridge */ /* synthetic */ void zzb(TagManager tagManager, String str) {
        Preconditions.checkNotNull(tagManager.zzf);
        for (zzz zzzVar : tagManager.zzf.values()) {
            zzzVar.zzd(str);
        }
    }

    public void dispatch() {
        this.zze.zza();
    }

    @NonNull
    public DataLayer getDataLayer() {
        return this.zzd;
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerDefaultOnly(@NonNull String str, @RawRes int i) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i, this.zzg);
        zzakVar.zzl();
        return zzakVar;
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerPreferFresh(@NonNull String str, @RawRes int i) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i, this.zzg);
        zzakVar.zzm();
        return zzakVar;
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(@NonNull String str, @RawRes int i) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i, this.zzg);
        zzakVar.zzn();
        return zzakVar;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 5;
        } else {
            i = 2;
        }
        zzdg.zza = i;
        zzdg.zzb.zzc(i);
    }

    @VisibleForTesting
    public final int zza(zzz zzzVar) {
        this.zzf.put(zzzVar.zza(), zzzVar);
        return this.zzf.size();
    }

    @VisibleForTesting
    public final boolean zzc(zzz zzzVar) {
        if (this.zzf.remove(zzzVar.zza()) != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzd(Uri uri) {
        try {
            zzdz zza2 = zzdz.zza();
            if (zza2.zzd(uri)) {
                String zzc = zza2.zzc();
                int zze = zza2.zze();
                int i = zze - 1;
                if (zze != 0) {
                    if (i != 0) {
                        if (i == 1 || i == 2) {
                            for (String str : this.zzf.keySet()) {
                                zzz zzzVar = (zzz) this.zzf.get(str);
                                if (str.equals(zzc)) {
                                    zzzVar.zze(zza2.zzb());
                                    zzzVar.refresh();
                                } else if (zzzVar.zzb() != null) {
                                    zzzVar.zze(null);
                                    zzzVar.refresh();
                                }
                            }
                        }
                    } else {
                        zzz zzzVar2 = (zzz) this.zzf.get(zzc);
                        if (zzzVar2 != null) {
                            zzzVar2.zze(null);
                            zzzVar2.refresh();
                        }
                    }
                    return true;
                }
                throw null;
            }
            return false;
        } finally {
        }
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerDefaultOnly(@NonNull String str, @RawRes int i, @NonNull Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzakVar.zzl();
        return zzakVar;
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerPreferFresh(@NonNull String str, @RawRes int i, @NonNull Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzakVar.zzm();
        return zzakVar;
    }

    @NonNull
    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(@NonNull String str, @RawRes int i, @NonNull Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i, this.zzg);
        zzakVar.zzn();
        return zzakVar;
    }
}
