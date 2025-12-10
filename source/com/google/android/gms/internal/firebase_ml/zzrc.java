package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.p015ml.common.internal.modeldownload.zzac;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import java.util.UUID;

/* loaded from: classes3.dex */
public class zzrc {

    /* renamed from: c */
    public static final GmsLogger f46000c = new GmsLogger("SharedPrefManager", "");
    public static final Component<?> zzblr = Component.builder(zzrc.class).add(Dependency.required(zzqn.class)).add(Dependency.required(Context.class)).factory(C20710kJ2.f67888a).build();

    /* renamed from: a */
    public final Context f46001a;

    /* renamed from: b */
    public final String f46002b;

    public zzrc(zzqn zzqnVar, Context context) {
        this.f46001a = context;
        this.f46002b = zzqnVar.getPersistenceKey();
    }

    /* renamed from: b */
    public static zzn m47493b(String str) {
        String str2;
        if (str == null) {
            return zzn.UNKNOWN;
        }
        try {
            return zzn.zzby(str);
        } catch (IllegalArgumentException unused) {
            GmsLogger gmsLogger = f46000c;
            if (str.length() != 0) {
                str2 = "Invalid model type ".concat(str);
            } else {
                str2 = new String("Invalid model type ");
            }
            gmsLogger.m48406e("SharedPrefManager", str2);
            return zzn.UNKNOWN;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ zzrc m47492c(ComponentContainer componentContainer) {
        return new zzrc((zzqn) componentContainer.get(zzqn.class), (Context) componentContainer.get(Context.class));
    }

    public static zzrc zzb(@NonNull zzqn zzqnVar) {
        return (zzrc) zzqnVar.get(zzrc.class);
    }

    /* renamed from: a */
    public final SharedPreferences m47494a() {
        return this.f46001a.getSharedPreferences("com.google.firebase.ml.internal", 0);
    }

    @Nullable
    public final synchronized Long zza(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        long j = m47494a().getLong(String.format("downloading_model_id_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), -1L);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final synchronized void zzar(boolean z) {
        m47494a().edit().putBoolean(String.format("logging_%s_%s", "vision", this.f46002b), z).apply();
    }

    public final synchronized void zzas(boolean z) {
        m47494a().edit().putBoolean(String.format("logging_%s_%s", "model", this.f46002b), z).apply();
    }

    public final synchronized zzn zzbw(@NonNull String str) {
        return m47493b(m47494a().getString(String.format("downloading_model_type_%s", str), ""));
    }

    @Nullable
    public final synchronized String zzc(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47494a().getString(String.format("current_model_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), null);
    }

    public final synchronized zzn zzd(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47493b(m47494a().getString(String.format("current_model_type_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), zzn.UNKNOWN.name()));
    }

    @Nullable
    public final synchronized String zze(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47494a().getString(String.format("bad_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), null);
    }

    public final synchronized long zzf(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47494a().getLong(String.format("downloading_begin_time_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), 0L);
    }

    public final synchronized long zzg(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47494a().getLong(String.format("model_first_use_time_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), 0L);
    }

    public final synchronized void zzh(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        m47494a().edit().remove(String.format("downloading_model_id_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_type_%s", zzb(firebaseRemoteModel))).remove(String.format("downloading_begin_time_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).remove(String.format("model_first_use_time_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).apply();
    }

    @WorkerThread
    public final synchronized void zzi(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        m47494a().edit().remove(String.format("current_model_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).remove(String.format("current_model_type_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist())).commit();
    }

    public final synchronized boolean zzpa() {
        return m47494a().getBoolean(String.format("logging_%s_%s", "vision", this.f46002b), true);
    }

    public final synchronized boolean zzpb() {
        return m47494a().getBoolean(String.format("logging_%s_%s", "model", this.f46002b), true);
    }

    @Nullable
    public final synchronized String zzpc() {
        return m47494a().getString("app_version", null);
    }

    public final synchronized String zzpd() {
        String string = m47494a().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m47494a().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @Nullable
    public final synchronized String zzb(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return m47494a().getString(String.format("downloading_model_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), null);
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, long j) {
        m47494a().edit().putLong(String.format("model_first_use_time_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), j).apply();
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull String str, @NonNull zzn zznVar) {
        m47494a().edit().putString(String.format("current_model_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), str).putString(String.format("current_model_type_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), zznVar.name()).apply();
    }

    public final synchronized void zza(long j, @NonNull zzac zzacVar) {
        String zzpw = zzacVar.zzpw();
        String modelHash = zzacVar.getModelHash();
        m47494a().edit().putString(String.format("downloading_model_hash_%s_%s", this.f46002b, zzpw), modelHash).putLong(String.format("downloading_model_id_%s_%s", this.f46002b, zzpw), j).putString(String.format("downloading_model_type_%s", modelHash), zzacVar.zzpx().name()).putLong(String.format("downloading_begin_time_%s_%s", this.f46002b, zzpw), SystemClock.elapsedRealtime()).apply();
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull String str, @NonNull String str2) {
        m47494a().edit().putString(String.format("bad_hash_%s_%s", this.f46002b, firebaseRemoteModel.getUniqueModelNameForPersist()), str).putString("app_version", str2).apply();
    }
}
