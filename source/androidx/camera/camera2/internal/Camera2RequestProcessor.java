package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.TagBundle;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Camera2RequestProcessor implements RequestProcessor {

    /* renamed from: a */
    public final CaptureSession f10369a;

    /* renamed from: b */
    public final List f10370b;

    /* renamed from: c */
    public volatile boolean f10371c = false;

    /* renamed from: d */
    public volatile SessionConfig f10372d;

    /* renamed from: androidx.camera.camera2.internal.Camera2RequestProcessor$a */
    /* loaded from: classes.dex */
    public class C2355a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final RequestProcessor.Callback f10373a;

        /* renamed from: b */
        public final RequestProcessor.Request f10374b;

        /* renamed from: c */
        public final boolean f10375c;

        public C2355a(RequestProcessor.Request request, RequestProcessor.Callback callback, boolean z) {
            this.f10373a = callback;
            this.f10374b = request;
            this.f10375c = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.f10373a.onCaptureBufferLost(this.f10374b, j, Camera2RequestProcessor.this.m63806b(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f10373a.onCaptureCompleted(this.f10374b, new Camera2CameraCaptureResult(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f10373a.onCaptureFailed(this.f10374b, new Camera2CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f10373a.onCaptureProgressed(this.f10374b, new Camera2CameraCaptureResult(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (this.f10375c) {
                this.f10373a.onCaptureSequenceAborted(i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            if (this.f10375c) {
                this.f10373a.onCaptureSequenceCompleted(i, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f10373a.onCaptureStarted(this.f10374b, j2, j);
        }
    }

    public Camera2RequestProcessor(@NonNull CaptureSession captureSession, @NonNull List<SessionProcessorSurface> list) {
        boolean z = captureSession.f10391l == CaptureSession.State.OPENED;
        Preconditions.checkArgument(z, "CaptureSession state must be OPENED. Current state:" + captureSession.f10391l);
        this.f10369a = captureSession;
        this.f10370b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public final boolean m63807a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!m63804d((RequestProcessor.Request) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void abortCaptures() {
        if (this.f10371c) {
            return;
        }
        this.f10369a.m63800k();
    }

    /* renamed from: b */
    public int m63806b(Surface surface) {
        for (SessionProcessorSurface sessionProcessorSurface : this.f10370b) {
            if (sessionProcessorSurface.getSurface().get() == surface) {
                return sessionProcessorSurface.getOutputConfigId();
            }
            continue;
        }
        return -1;
    }

    /* renamed from: c */
    public final DeferrableSurface m63805c(int i) {
        for (SessionProcessorSurface sessionProcessorSurface : this.f10370b) {
            if (sessionProcessorSurface.getOutputConfigId() == i) {
                return sessionProcessorSurface;
            }
        }
        return null;
    }

    public void close() {
        this.f10371c = true;
    }

    /* renamed from: d */
    public final boolean m63804d(RequestProcessor.Request request) {
        if (request.getTargetOutputConfigIds().isEmpty()) {
            Logger.m63228e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : request.getTargetOutputConfigIds()) {
            if (m63805c(num.intValue()) == null) {
                Logger.m63228e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int setRepeating(@NonNull RequestProcessor.Request request, @NonNull RequestProcessor.Callback callback) {
        if (!this.f10371c && m63804d(request)) {
            SessionConfig.Builder builder = new SessionConfig.Builder();
            builder.setTemplateType(request.getTemplateId());
            builder.setImplementationOptions(request.getParameters());
            builder.addCameraCaptureCallback(C0052Al.m69052a(new C2355a(request, callback, true)));
            if (this.f10372d != null) {
                for (CameraCaptureCallback cameraCaptureCallback : this.f10372d.getRepeatingCameraCaptureCallbacks()) {
                    builder.addCameraCaptureCallback(cameraCaptureCallback);
                }
                TagBundle tagBundle = this.f10372d.getRepeatingCaptureConfig().getTagBundle();
                for (String str : tagBundle.listKeys()) {
                    builder.addTag(str, tagBundle.getTag(str));
                }
            }
            for (Integer num : request.getTargetOutputConfigIds()) {
                builder.addSurface(m63805c(num.intValue()));
            }
            return this.f10369a.m63793r(builder.build());
        }
        return -1;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void stopRepeating() {
        if (this.f10371c) {
            return;
        }
        this.f10369a.m63786y();
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(@NonNull RequestProcessor.Request request, @NonNull RequestProcessor.Callback callback) {
        return submit(Arrays.asList(request), callback);
    }

    public void updateSessionConfig(@Nullable SessionConfig sessionConfig) {
        this.f10372d = sessionConfig;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(@NonNull List<RequestProcessor.Request> list, @NonNull RequestProcessor.Callback callback) {
        if (this.f10371c || !m63807a(list)) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (RequestProcessor.Request request : list) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(request.getTemplateId());
            builder.setImplementationOptions(request.getParameters());
            builder.addCameraCaptureCallback(C0052Al.m69052a(new C2355a(request, callback, z)));
            for (Integer num : request.getTargetOutputConfigIds()) {
                builder.addSurface(m63805c(num.intValue()));
            }
            arrayList.add(builder.build());
            z = false;
        }
        return this.f10369a.m63795p(arrayList);
    }
}
