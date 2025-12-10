package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* loaded from: classes4.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, LifecycleObserver {

    /* renamed from: f */
    public static final GmsLogger f57117f = new GmsLogger("MobileVisionBase", "");
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final AtomicBoolean f57118a = new AtomicBoolean(false);

    /* renamed from: b */
    public final MLTask f57119b;

    /* renamed from: c */
    public final CancellationTokenSource f57120c;

    /* renamed from: d */
    public final Executor f57121d;

    /* renamed from: e */
    public final Task f57122e;

    @KeepForSdk
    public MobileVisionBase(@NonNull MLTask<DetectionResultT, InputImage> mLTask, @NonNull Executor executor) {
        this.f57119b = mLTask;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f57120c = cancellationTokenSource;
        this.f57121d = executor;
        mLTask.pin();
        this.f57122e = mLTask.callAfterLoad(executor, zzb.zza, cancellationTokenSource.getToken()).addOnFailureListener(zzc.zza);
    }

    /* renamed from: b */
    public final /* synthetic */ Object m37180b(InputImage inputImage) {
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object run = this.f57119b.run(inputImage);
            zze.close();
            return run;
        } catch (Throwable th2) {
            try {
                zze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @KeepForSdk
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        if (!this.f57118a.getAndSet(true)) {
            this.f57120c.cancel();
            this.f57119b.unpin(this.f57121d);
        }
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<Void> closeWithTask() {
        if (!this.f57118a.getAndSet(true)) {
            this.f57120c.cancel();
            return this.f57119b.unpinWithTask(this.f57121d);
        }
        return Tasks.forResult(null);
    }

    /* renamed from: d */
    public final /* synthetic */ Object m37179d(MlImage mlImage) {
        InputImage convertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(mlImage);
        if (convertMlImagetoInputImage != null) {
            return this.f57119b.run(convertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<Void> getInitTaskBase() {
        return this.f57122e;
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Bitmap bitmap, int i) {
        return processBase(InputImage.fromBitmap(bitmap, i));
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(@NonNull final MlImage mlImage) {
        Preconditions.checkNotNull(mlImage, "MlImage can not be null");
        if (this.f57118a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (mlImage.getWidth() >= 32 && mlImage.getHeight() >= 32) {
            mlImage.getInternal().acquire();
            return this.f57119b.callAfterLoad(this.f57121d, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.m37179d(mlImage);
                }
            }, this.f57120c.getToken()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.vision.common.internal.zze
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    MlImage mlImage2 = MlImage.this;
                    GmsLogger gmsLogger = MobileVisionBase.f57117f;
                    mlImage2.close();
                }
            });
        } else {
            return Tasks.forException(new MlKitException("MlImage width and height should be at least 32!", 3));
        }
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Image image, int i) {
        return processBase(InputImage.fromMediaImage(image, i));
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Image image, int i, @NonNull Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i, matrix));
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(@NonNull final InputImage inputImage) {
        Preconditions.checkNotNull(inputImage, "InputImage can not be null");
        if (this.f57118a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.f57119b.callAfterLoad(this.f57121d, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.m37180b(inputImage);
                }
            }, this.f57120c.getToken());
        } else {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
    }
}