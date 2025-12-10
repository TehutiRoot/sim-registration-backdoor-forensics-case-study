package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes4.dex */
public class RemoteModelLoader {

    /* renamed from: h */
    public static final GmsLogger f56981h = new GmsLogger("RemoteModelLoader", "");

    /* renamed from: i */
    public static final Map f56982i = new HashMap();

    /* renamed from: a */
    public final MlKitContext f56983a;

    /* renamed from: b */
    public final RemoteModel f56984b;

    /* renamed from: c */
    public final RemoteModelDownloadManager f56985c;

    /* renamed from: d */
    public final RemoteModelFileManager f56986d;

    /* renamed from: e */
    public final RemoteModelLoaderHelper f56987e;

    /* renamed from: f */
    public final zzsh f56988f;

    /* renamed from: g */
    public boolean f56989g;

    public RemoteModelLoader(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.f56986d = remoteModelFileManager;
        this.f56989g = true;
        this.f56985c = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.f56987e = remoteModelLoaderHelper;
        this.f56983a = mlKitContext;
        this.f56984b = remoteModel;
        this.f56988f = zzss.zzb("common");
    }

    @NonNull
    @KeepForSdk
    public static synchronized RemoteModelLoader getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        RemoteModelLoader remoteModelLoader;
        synchronized (RemoteModelLoader.class) {
            try {
                String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
                Map map = f56982i;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
                }
                remoteModelLoader = (RemoteModelLoader) map.get(uniqueModelNameForPersist);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remoteModelLoader;
    }

    /* renamed from: a */
    public final MappedByteBuffer m37206a(String str) {
        return this.f56987e.loadModelAtPath(str);
    }

    /* renamed from: b */
    public final MappedByteBuffer m37205b(File file) {
        try {
            return m37206a(file.getAbsolutePath());
        } catch (Exception e) {
            this.f56986d.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }

    @NonNull
    @KeepForSdk
    public RemoteModel getRemoteModel() {
        return this.f56984b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.nio.MappedByteBuffer load() throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.load():java.nio.MappedByteBuffer");
    }
}
