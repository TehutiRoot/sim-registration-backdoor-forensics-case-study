package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class InternalImageProcessor {

    /* renamed from: a */
    public final Executor f11393a;

    /* renamed from: b */
    public final ImageProcessor f11394b;

    /* renamed from: c */
    public final Consumer f11395c;

    public InternalImageProcessor(@NonNull CameraEffect cameraEffect) {
        boolean z;
        if (cameraEffect.getTargets() == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f11393a = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.f11394b = imageProcessor;
        this.f11395c = cameraEffect.getErrorListener();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62739a(InternalImageProcessor internalImageProcessor, ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        return internalImageProcessor.m62736d(request, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62738b(InternalImageProcessor internalImageProcessor, ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.m62737c(request, completer);
    }

    /* renamed from: c */
    public final /* synthetic */ void m62737c(ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        try {
            completer.set(this.f11394b.process(request));
        } catch (ProcessingException e) {
            this.f11395c.accept(e);
            completer.setException(e);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Object m62736d(final ImageProcessor.Request request, final CallbackToFutureAdapter.Completer completer) {
        this.f11393a.execute(new Runnable() { // from class: Rf0
            @Override // java.lang.Runnable
            public final void run() {
                InternalImageProcessor.m62738b(InternalImageProcessor.this, request, completer);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    @NonNull
    public ImageProcessor.Response safeProcess(@NonNull final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Qf0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return InternalImageProcessor.m62739a(InternalImageProcessor.this, request, completer);
                }
            }).get();
        } catch (Exception e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
