package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AdvancedSessionProcessor extends AbstractC21388oG1 {

    /* renamed from: h */
    public final SessionProcessorImpl f11537h;

    /* renamed from: i */
    public final Context f11538i;

    /* loaded from: classes.dex */
    public static class CallbackAdapter implements RequestProcessor.Callback {
        private final RequestProcessorImpl.Callback mCallback;

        public CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(RequestProcessor.Request request) {
            Preconditions.checkArgument(request instanceof RequestAdapter);
            return ((RequestAdapter) request).getImplRequest();
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureBufferLost(@NonNull RequestProcessor.Request request, long j, int i) {
            this.mCallback.onCaptureBufferLost(getImplRequest(request), j, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(@NonNull RequestProcessor.Request request, @Nullable CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            Preconditions.checkArgument(captureResult instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(request), (TotalCaptureResult) captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureFailed(@NonNull RequestProcessor.Request request, @Nullable CameraCaptureFailure cameraCaptureFailure) {
            boolean z;
            CaptureFailure captureFailure = Camera2CameraCaptureResultConverter.getCaptureFailure(cameraCaptureFailure);
            if (captureFailure != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(request), captureFailure);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureProgressed(@NonNull RequestProcessor.Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
            boolean z;
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            if (captureResult != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(request), captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceAborted(int i) {
            this.mCallback.onCaptureSequenceAborted(i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceCompleted(int i, long j) {
            this.mCallback.onCaptureSequenceCompleted(i, j);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureStarted(@NonNull RequestProcessor.Request request, long j, long j2) {
            this.mCallback.onCaptureStarted(getImplRequest(request), j, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class ImageProcessorAdapter implements ImageProcessor {
        private final ImageProcessorImpl mImpl;

        public ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
        public void onNextImageAvailable(int i, long j, @NonNull ImageReference imageReference, @Nullable String str) {
            this.mImpl.onNextImageAvailable(i, j, new ImageReferenceImplAdapter(imageReference), str);
        }
    }

    /* loaded from: classes.dex */
    public static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final ImageReference mImageReference;

        public ImageReferenceImplAdapter(ImageReference imageReference) {
            this.mImageReference = imageReference;
        }

        public boolean decrement() {
            return this.mImageReference.decrement();
        }

        @Nullable
        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.increment();
        }
    }

    /* loaded from: classes.dex */
    public static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final OutputSurface mOutputSurface;

        public OutputSurfaceImplAdapter(OutputSurface outputSurface) {
            this.mOutputSurface = outputSurface;
        }

        public int getImageFormat() {
            return this.mOutputSurface.getImageFormat();
        }

        @NonNull
        public Size getSize() {
            return this.mOutputSurface.getSize();
        }

        @NonNull
        public Surface getSurface() {
            return this.mOutputSurface.getSurface();
        }
    }

    /* loaded from: classes.dex */
    public static class RequestAdapter implements RequestProcessor.Request {
        private final RequestProcessorImpl.Request mImplRequest;
        private final Config mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        public RequestAdapter(@NonNull RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            for (Integer num : request.getTargetOutputConfigIds()) {
                arrayList.add(num);
            }
            this.mTargetOutputConfigIds = arrayList;
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                builder.setCaptureRequestOption(key, request.getParameters().get(key));
            }
            this.mParameters = builder.build();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        @Nullable
        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public Config getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    /* loaded from: classes.dex */
    public class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final RequestProcessor mRequestProcessor;

        public RequestProcessorImplAdapter(@NonNull RequestProcessor requestProcessor) {
            this.mRequestProcessor = requestProcessor;
        }

        public void abortCaptures() {
            this.mRequestProcessor.abortCaptures();
        }

        public void setImageProcessor(int i, @NonNull ImageProcessorImpl imageProcessorImpl) {
            AdvancedSessionProcessor.this.setImageProcessor(i, new ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.setRepeating(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.stopRepeating();
        }

        public int submit(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.submit(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(@NonNull List<RequestProcessorImpl.Request> list, @NonNull RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            for (RequestProcessorImpl.Request request : list) {
                arrayList.add(new RequestAdapter(request));
            }
            return this.mRequestProcessor.submit(arrayList, new CallbackAdapter(callback));
        }
    }

    /* loaded from: classes.dex */
    public static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final SessionProcessor.CaptureCallback mCaptureCallback;

        public SessionProcessorImplCaptureCallbackAdapter(@NonNull SessionProcessor.CaptureCallback captureCallback) {
            this.mCaptureCallback = captureCallback;
        }

        public void onCaptureCompleted(long j, int i, Map<CaptureResult.Key, Object> map) {
            this.mCaptureCallback.onCaptureCompleted(j, i, map);
        }

        public void onCaptureFailed(int i) {
            this.mCaptureCallback.onCaptureFailed(i);
        }

        public void onCaptureProcessProgressed(int i) {
        }

        public void onCaptureProcessStarted(int i) {
            this.mCaptureCallback.onCaptureProcessStarted(i);
        }

        public void onCaptureSequenceAborted(int i) {
            this.mCaptureCallback.onCaptureSequenceAborted(i);
        }

        public void onCaptureSequenceCompleted(int i) {
            this.mCaptureCallback.onCaptureSequenceCompleted(i);
        }

        public void onCaptureStarted(int i, long j) {
            this.mCaptureCallback.onCaptureStarted(i, j);
        }
    }

    public AdvancedSessionProcessor(@NonNull SessionProcessorImpl sessionProcessorImpl, @NonNull List<CaptureRequest.Key> list, @NonNull Context context) {
        super(list);
        this.f11537h = sessionProcessorImpl;
        this.f11538i = context;
    }

    /* renamed from: g */
    public static HashMap m62590g(Config config) {
        HashMap hashMap = new HashMap();
        CaptureRequestOptions build = CaptureRequestOptions.Builder.from(config).build();
        for (Config.Option option : build.listOptions()) {
            hashMap.put((CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        return hashMap;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void abortCapture(int i) {
        this.f11537h.abortCapture(i);
    }

    @Override // p000.AbstractC21388oG1
    public void deInitSessionInternal() {
        this.f11537h.deInitSession();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @Nullable
    public Pair<Long, Long> getRealtimeCaptureLatency() {
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.f11537h.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // p000.AbstractC21388oG1, androidx.camera.core.impl.SessionProcessor
    @NonNull
    @RestrictedCameraControl.CameraOperation
    public /* bridge */ /* synthetic */ Set getSupportedCameraOperations() {
        return super.getSupportedCameraOperations();
    }

    /* renamed from: h */
    public final InterfaceC0887Mi m62589h(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        C0962Ni c0962Ni = new C0962Ni();
        for (Camera2OutputConfigImpl camera2OutputConfigImpl : camera2SessionConfigImpl.getOutputConfigs()) {
            c0962Ni.m67199a(AbstractC0821Li.m67501a(camera2OutputConfigImpl));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            c0962Ni.m67198b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        c0962Ni.m67196d(camera2SessionConfigImpl.getSessionTemplateId());
        return c0962Ni.m67197c();
    }

    @Override // p000.AbstractC21388oG1
    @NonNull
    public InterfaceC0887Mi initSessionInternal(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3) {
        OutputSurfaceImplAdapter outputSurfaceImplAdapter;
        SessionProcessorImpl sessionProcessorImpl = this.f11537h;
        Context context = this.f11538i;
        OutputSurfaceImplAdapter outputSurfaceImplAdapter2 = new OutputSurfaceImplAdapter(outputSurface);
        OutputSurfaceImplAdapter outputSurfaceImplAdapter3 = new OutputSurfaceImplAdapter(outputSurface2);
        if (outputSurface3 == null) {
            outputSurfaceImplAdapter = null;
        } else {
            outputSurfaceImplAdapter = new OutputSurfaceImplAdapter(outputSurface3);
        }
        return m62589h(sessionProcessorImpl.initSession(str, map, context, outputSurfaceImplAdapter2, outputSurfaceImplAdapter3, outputSurfaceImplAdapter));
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionEnd() {
        this.f11537h.onCaptureSessionEnd();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor) {
        this.f11537h.onCaptureSessionStart(new RequestProcessorImplAdapter(requestProcessor));
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void setParameters(@NonNull Config config) {
        this.f11537h.setParameters(m62590g(config));
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startCapture(@NonNull SessionProcessor.CaptureCallback captureCallback) {
        return this.f11537h.startCapture(new SessionProcessorImplCaptureCallbackAdapter(captureCallback));
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startRepeating(@NonNull SessionProcessor.CaptureCallback captureCallback) {
        return this.f11537h.startRepeating(new SessionProcessorImplCaptureCallbackAdapter(captureCallback));
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startTrigger(@NonNull Config config, @NonNull SessionProcessor.CaptureCallback captureCallback) {
        HashMap m62590g = m62590g(config);
        Version version = Version.VERSION_1_3;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.f11537h.startTrigger(m62590g, new SessionProcessorImplCaptureCallbackAdapter(captureCallback));
        }
        return -1;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void stopRepeating() {
        this.f11537h.stopRepeating();
    }
}
