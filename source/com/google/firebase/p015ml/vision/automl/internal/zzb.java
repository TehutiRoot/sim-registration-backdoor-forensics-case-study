package com.google.firebase.p015ml.vision.automl.internal;

import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqf;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface;
import com.google.firebase.p015ml.common.internal.modeldownload.zzg;
import com.google.firebase.p015ml.common.internal.modeldownload.zzi;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzx;
import com.google.firebase.p015ml.common.internal.modeldownload.zzy;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLRemoteModel;
import com.google.firebase.p015ml.vision.automl.internal.zzb;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzb */
/* loaded from: classes4.dex */
public class zzb implements RemoteModelManagerInterface<FirebaseAutoMLRemoteModel> {

    /* renamed from: a */
    public final zzqn f55829a;

    /* renamed from: b */
    public final zzqo f55830b;

    public zzb(zzqn zzqnVar, zzqo zzqoVar) {
        this.f55829a = zzqnVar;
        this.f55830b = zzqoVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Boolean m38352a(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        zzqn zzqnVar = this.f55829a;
        return Boolean.valueOf(zzx.zza(zzqnVar, firebaseAutoMLRemoteModel, new zzg(zzqnVar), new zzy(this.f55829a, firebaseAutoMLRemoteModel)).zzpq());
    }

    /* renamed from: b */
    public final /* synthetic */ Void m38351b(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        new zzi(this.f55829a).zza(zzn.AUTOML, firebaseAutoMLRemoteModel.getModelName());
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void m38350c(Task task) {
        this.f55830b.zza(zznq.zzad.zzmg().zzb((zznq.zzah) ((zzxh) zznq.zzah.zzmn().zzc(zznq.zzal.zza.AUTOML_IMAGE_LABELING).zzal(((Boolean) task.getResult()).booleanValue()).zzvn())), zzoe.REMOTE_MODEL_IS_DOWNLOADED);
    }

    /* renamed from: d */
    public final /* synthetic */ void m38349d(Task task) {
        this.f55830b.zza(zznq.zzad.zzmg().zzb((zznq.zzaa) ((zzxh) zznq.zzaa.zzma().zzb(zznq.zzal.zza.AUTOML_IMAGE_LABELING).zzz(task.isSuccessful()).zzvn())), zzoe.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface
    public /* synthetic */ Task deleteDownloadedModel(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        return Tasks.call(zzqf.zzop(), new Callable(this, firebaseAutoMLRemoteModel) { // from class: W92

            /* renamed from: a */
            public final zzb f7154a;

            /* renamed from: b */
            public final FirebaseAutoMLRemoteModel f7155b;

            {
                this.f7154a = this;
                this.f7155b = firebaseAutoMLRemoteModel;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7154a.m38351b(this.f7155b);
            }
        }).addOnCompleteListener(new OnCompleteListener(this) { // from class: vh2

            /* renamed from: a */
            public final zzb f107755a;

            {
                this.f107755a = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f107755a.m38349d(task);
            }
        });
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface
    public /* synthetic */ Task download(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel, FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
        FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel2 = firebaseAutoMLRemoteModel;
        zzqn zzqnVar = this.f55829a;
        zzx zza = zzx.zza(zzqnVar, firebaseAutoMLRemoteModel2, new zzg(zzqnVar), new zzy(this.f55829a, firebaseAutoMLRemoteModel2));
        zza.zza(firebaseModelDownloadConditions);
        return Tasks.forResult(null).onSuccessTask(zzqf.zzop(), new SuccessContinuation(zza) { // from class: dk2

            /* renamed from: a */
            public final zzx f61270a;

            {
                this.f61270a = zza;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f61270a.zzpr();
            }
        });
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface
    public Task<Set<FirebaseAutoMLRemoteModel>> getDownloadedModels() {
        return Tasks.forException(new FirebaseMLException("AutoML Remote model does not support listing downloaded models", 12));
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface
    public /* synthetic */ Task getLatestModelFile(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        return Tasks.forException(new FirebaseMLException("Getting latest model file not supported for AutoML models.", 12));
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface
    public /* synthetic */ Task isModelDownloaded(FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        return zzqf.zzoq().zza(new Callable(this, firebaseAutoMLRemoteModel) { // from class: Bf2

            /* renamed from: a */
            public final zzb f458a;

            /* renamed from: b */
            public final FirebaseAutoMLRemoteModel f459b;

            {
                this.f458a = this;
                this.f459b = firebaseAutoMLRemoteModel;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f458a.m38352a(this.f459b);
            }
        }).addOnCompleteListener(new OnCompleteListener(this) { // from class: Tm2

            /* renamed from: a */
            public final zzb f6111a;

            {
                this.f6111a = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f6111a.m38350c(task);
            }
        });
    }
}
