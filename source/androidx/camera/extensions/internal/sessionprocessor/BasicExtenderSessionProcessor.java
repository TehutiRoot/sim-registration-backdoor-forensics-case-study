package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.compat.workaround.OnEnableDisableSessionDurationCheck;
import androidx.camera.extensions.internal.sessionprocessor.C2587d;
import androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor;
import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
/* loaded from: classes.dex */
public class BasicExtenderSessionProcessor extends AbstractC21388oG1 {

    /* renamed from: z */
    public static AtomicInteger f11539z = new AtomicInteger(0);

    /* renamed from: h */
    public final Context f11540h;

    /* renamed from: i */
    public final PreviewExtenderImpl f11541i;

    /* renamed from: j */
    public final ImageCaptureExtenderImpl f11542j;

    /* renamed from: k */
    public final Object f11543k;

    /* renamed from: l */
    public volatile StillCaptureProcessor f11544l;

    /* renamed from: m */
    public volatile PreviewProcessor f11545m;

    /* renamed from: n */
    public volatile RequestUpdateProcessorImpl f11546n;

    /* renamed from: o */
    public volatile InterfaceC0757Ki f11547o;

    /* renamed from: p */
    public volatile InterfaceC0757Ki f11548p;

    /* renamed from: q */
    public volatile InterfaceC0757Ki f11549q;

    /* renamed from: r */
    public volatile OutputSurface f11550r;

    /* renamed from: s */
    public volatile OutputSurface f11551s;

    /* renamed from: t */
    public volatile RequestProcessor f11552t;

    /* renamed from: u */
    public volatile boolean f11553u;

    /* renamed from: v */
    public final AtomicInteger f11554v;

    /* renamed from: w */
    public final Map f11555w;

    /* renamed from: x */
    public final List f11556x;

    /* renamed from: y */
    public OnEnableDisableSessionDurationCheck f11557y;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$a */
    /* loaded from: classes.dex */
    public class C2574a implements ImageProcessor {
        public C2574a() {
            BasicExtenderSessionProcessor.this = r1;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
        public void onNextImageAvailable(int i, long j, ImageReference imageReference, String str) {
            if (BasicExtenderSessionProcessor.this.f11545m != null) {
                BasicExtenderSessionProcessor.this.f11545m.notifyImage(imageReference);
            }
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$b */
    /* loaded from: classes.dex */
    public class C2575b implements RequestProcessor.Callback {
        public C2575b() {
            BasicExtenderSessionProcessor.this = r1;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureBufferLost(RequestProcessor.Request request, long j, int i) {
            AbstractC21847qx1.m23396a(this, request, j, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureCompleted(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            AbstractC21847qx1.m23395b(this, request, cameraCaptureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureFailed(RequestProcessor.Request request, CameraCaptureFailure cameraCaptureFailure) {
            AbstractC21847qx1.m23394c(this, request, cameraCaptureFailure);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureProgressed(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            AbstractC21847qx1.m23393d(this, request, cameraCaptureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC21847qx1.m23392e(this, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
            AbstractC21847qx1.m23391f(this, i, j);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureStarted(RequestProcessor.Request request, long j, long j2) {
            AbstractC21847qx1.m23390g(this, request, j, j2);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$c */
    /* loaded from: classes.dex */
    public class C2576c implements RequestProcessor.Callback {

        /* renamed from: a */
        public final /* synthetic */ SessionProcessor.CaptureCallback f11560a;

        /* renamed from: b */
        public final /* synthetic */ int f11561b;

        public C2576c(SessionProcessor.CaptureCallback captureCallback, int i) {
            BasicExtenderSessionProcessor.this = r1;
            this.f11560a = captureCallback;
            this.f11561b = i;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureBufferLost(RequestProcessor.Request request, long j, int i) {
            AbstractC21847qx1.m23396a(this, request, j, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            Long l;
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            Preconditions.checkArgument(captureResult instanceof TotalCaptureResult, "Cannot get TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
            if (BasicExtenderSessionProcessor.this.f11545m != null) {
                BasicExtenderSessionProcessor.this.f11545m.notifyCaptureResult(totalCaptureResult);
            } else {
                Version version = Version.VERSION_1_3;
                if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version) && (l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                    this.f11560a.onCaptureCompleted(l.longValue(), this.f11561b, BasicExtenderSessionProcessor.this.m62583l(totalCaptureResult));
                }
            }
            if (BasicExtenderSessionProcessor.this.f11546n != null && BasicExtenderSessionProcessor.this.f11546n.process(totalCaptureResult) != null) {
                BasicExtenderSessionProcessor.this.m62580o(this.f11561b, this.f11560a);
            }
            this.f11560a.onCaptureSequenceCompleted(this.f11561b);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureFailed(RequestProcessor.Request request, CameraCaptureFailure cameraCaptureFailure) {
            AbstractC21847qx1.m23394c(this, request, cameraCaptureFailure);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureProgressed(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            AbstractC21847qx1.m23393d(this, request, cameraCaptureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC21847qx1.m23392e(this, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
            AbstractC21847qx1.m23391f(this, i, j);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureStarted(RequestProcessor.Request request, long j, long j2) {
            AbstractC21847qx1.m23390g(this, request, j, j2);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$d */
    /* loaded from: classes.dex */
    public class C2577d implements RequestProcessor.Callback {

        /* renamed from: a */
        public boolean f11563a = false;

        /* renamed from: b */
        public boolean f11564b = false;

        /* renamed from: c */
        public final /* synthetic */ SessionProcessor.CaptureCallback f11565c;

        /* renamed from: d */
        public final /* synthetic */ int f11566d;

        public C2577d(SessionProcessor.CaptureCallback captureCallback, int i) {
            BasicExtenderSessionProcessor.this = r1;
            this.f11565c = captureCallback;
            this.f11566d = i;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureBufferLost(RequestProcessor.Request request, long j, int i) {
            AbstractC21847qx1.m23396a(this, request, j, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            Preconditions.checkArgument(captureResult instanceof TotalCaptureResult, "Cannot get capture TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
            C2587d.C2588a c2588a = (C2587d.C2588a) request;
            if (BasicExtenderSessionProcessor.this.f11544l != null) {
                BasicExtenderSessionProcessor.this.f11544l.notifyCaptureResult(totalCaptureResult, c2588a.m62551a());
                return;
            }
            this.f11565c.onCaptureProcessStarted(this.f11566d);
            this.f11565c.onCaptureSequenceCompleted(this.f11566d);
            BasicExtenderSessionProcessor.this.f11553u = false;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureFailed(RequestProcessor.Request request, CameraCaptureFailure cameraCaptureFailure) {
            if (!this.f11563a) {
                this.f11563a = true;
                this.f11565c.onCaptureFailed(this.f11566d);
                this.f11565c.onCaptureSequenceAborted(this.f11566d);
                BasicExtenderSessionProcessor.this.f11553u = false;
            }
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureProgressed(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            AbstractC21847qx1.m23393d(this, request, cameraCaptureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceAborted(int i) {
            this.f11565c.onCaptureSequenceAborted(this.f11566d);
            BasicExtenderSessionProcessor.this.f11553u = false;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
            AbstractC21847qx1.m23391f(this, i, j);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureStarted(RequestProcessor.Request request, long j, long j2) {
            if (!this.f11564b) {
                this.f11564b = true;
                this.f11565c.onCaptureStarted(this.f11566d, j2);
            }
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$e */
    /* loaded from: classes.dex */
    public class C2578e implements StillCaptureProcessor.OnCaptureResultCallback {

        /* renamed from: a */
        public final /* synthetic */ SessionProcessor.CaptureCallback f11568a;

        /* renamed from: b */
        public final /* synthetic */ int f11569b;

        public C2578e(SessionProcessor.CaptureCallback captureCallback, int i) {
            BasicExtenderSessionProcessor.this = r1;
            this.f11568a = captureCallback;
            this.f11569b = i;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCaptureResult(long j, List list) {
            this.f11568a.onCaptureCompleted(j, this.f11569b, BasicExtenderSessionProcessor.this.m62584k(list));
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCompleted() {
            this.f11568a.onCaptureSequenceCompleted(this.f11569b);
            BasicExtenderSessionProcessor.this.f11553u = false;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onError(Exception exc) {
            this.f11568a.onCaptureFailed(this.f11569b);
            BasicExtenderSessionProcessor.this.f11553u = false;
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$f */
    /* loaded from: classes.dex */
    public class C2579f implements ImageProcessor {

        /* renamed from: a */
        public boolean f11571a = true;

        /* renamed from: b */
        public final /* synthetic */ SessionProcessor.CaptureCallback f11572b;

        /* renamed from: c */
        public final /* synthetic */ int f11573c;

        public C2579f(SessionProcessor.CaptureCallback captureCallback, int i) {
            BasicExtenderSessionProcessor.this = r1;
            this.f11572b = captureCallback;
            this.f11573c = i;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
        public void onNextImageAvailable(int i, long j, ImageReference imageReference, String str) {
            Logger.m63230d("BasicSessionProcessor", "onNextImageAvailable  outputStreamId=" + i);
            if (BasicExtenderSessionProcessor.this.f11544l != null) {
                BasicExtenderSessionProcessor.this.f11544l.notifyImage(imageReference);
            }
            if (this.f11571a) {
                this.f11572b.onCaptureProcessStarted(this.f11573c);
                this.f11571a = false;
            }
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor$g */
    /* loaded from: classes.dex */
    public class C2580g implements RequestProcessor.Callback {

        /* renamed from: a */
        public final /* synthetic */ SessionProcessor.CaptureCallback f11575a;

        /* renamed from: b */
        public final /* synthetic */ int f11576b;

        public C2580g(SessionProcessor.CaptureCallback captureCallback, int i) {
            BasicExtenderSessionProcessor.this = r1;
            this.f11575a = captureCallback;
            this.f11576b = i;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureBufferLost(RequestProcessor.Request request, long j, int i) {
            AbstractC21847qx1.m23396a(this, request, j, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            this.f11575a.onCaptureSequenceCompleted(this.f11576b);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureFailed(RequestProcessor.Request request, CameraCaptureFailure cameraCaptureFailure) {
            this.f11575a.onCaptureFailed(this.f11576b);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureProgressed(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            AbstractC21847qx1.m23393d(this, request, cameraCaptureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC21847qx1.m23392e(this, i);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
            AbstractC21847qx1.m23391f(this, i, j);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public /* synthetic */ void onCaptureStarted(RequestProcessor.Request request, long j, long j2) {
            AbstractC21847qx1.m23390g(this, request, j, j2);
        }
    }

    public BasicExtenderSessionProcessor(@NonNull PreviewExtenderImpl previewExtenderImpl, @NonNull ImageCaptureExtenderImpl imageCaptureExtenderImpl, @NonNull List<CaptureRequest.Key> list, @NonNull List<CaptureResult.Key> list2, @NonNull Context context) {
        super(list);
        this.f11543k = new Object();
        this.f11544l = null;
        this.f11545m = null;
        this.f11546n = null;
        this.f11549q = null;
        this.f11553u = false;
        this.f11554v = new AtomicInteger(0);
        this.f11555w = new LinkedHashMap();
        this.f11557y = new OnEnableDisableSessionDurationCheck();
        this.f11541i = previewExtenderImpl;
        this.f11542j = imageCaptureExtenderImpl;
        this.f11556x = list2;
        this.f11540h = context;
    }

    /* renamed from: g */
    public static /* synthetic */ void m62588g(BasicExtenderSessionProcessor basicExtenderSessionProcessor, SessionProcessor.CaptureCallback captureCallback, int i, long j, List list) {
        basicExtenderSessionProcessor.m62582m(captureCallback, i, j, list);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void abortCapture(int i) {
        this.f11552t.abortCaptures();
    }

    @Override // p000.AbstractC21388oG1
    public void deInitSessionInternal() {
        Logger.m63230d("BasicSessionProcessor", "preview onDeInit");
        this.f11541i.onDeInit();
        Logger.m63230d("BasicSessionProcessor", "capture onDeInit");
        this.f11542j.onDeInit();
        if (this.f11545m != null) {
            this.f11545m.close();
            this.f11545m = null;
        }
        if (this.f11544l != null) {
            this.f11544l.close();
            this.f11544l = null;
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @Nullable
    public Pair<Long, Long> getRealtimeCaptureLatency() {
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.f11542j.getRealtimeCaptureLatency();
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
    public final void m62587h(C2587d c2587d) {
        synchronized (this.f11543k) {
            try {
                for (CaptureRequest.Key key : this.f11555w.keySet()) {
                    Object obj = this.f11555w.get(key);
                    if (obj != null) {
                        c2587d.m62553d(key, obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m62586i(C2587d c2587d) {
        CaptureStageImpl captureStage = this.f11541i.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                c2587d.m62553d((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    @Override // p000.AbstractC21388oG1
    @NonNull
    public InterfaceC0887Mi initSessionInternal(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3) {
        Logger.m63230d("BasicSessionProcessor", "PreviewExtenderImpl.onInit");
        this.f11541i.onInit(str, map.get(str), this.f11540h);
        Logger.m63230d("BasicSessionProcessor", "ImageCaptureExtenderImpl.onInit");
        this.f11542j.onInit(str, map.get(str), this.f11540h);
        this.f11550r = outputSurface;
        this.f11551s = outputSurface2;
        PreviewExtenderImpl.ProcessorType processorType = this.f11541i.getProcessorType();
        Logger.m63230d("BasicSessionProcessor", "preview processorType=" + processorType);
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.f11547o = ImageReaderOutputConfig.m62578b(f11539z.getAndIncrement(), outputSurface.getSize(), 35, 2);
            this.f11545m = new PreviewProcessor(this.f11541i.getProcessor(), this.f11550r.getSurface(), this.f11550r.getSize());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.f11547o = SurfaceOutputConfig.m62570b(f11539z.getAndIncrement(), outputSurface.getSurface());
            this.f11546n = this.f11541i.getProcessor();
        } else {
            this.f11547o = SurfaceOutputConfig.m62570b(f11539z.getAndIncrement(), outputSurface.getSurface());
        }
        CaptureProcessorImpl captureProcessor = this.f11542j.getCaptureProcessor();
        Logger.m63230d("BasicSessionProcessor", "CaptureProcessor=" + captureProcessor);
        if (captureProcessor != null) {
            this.f11548p = ImageReaderOutputConfig.m62578b(f11539z.getAndIncrement(), outputSurface2.getSize(), 35, this.f11542j.getMaxCaptureStage());
            this.f11544l = new StillCaptureProcessor(captureProcessor, this.f11551s.getSurface(), this.f11551s.getSize());
        } else {
            this.f11548p = SurfaceOutputConfig.m62570b(f11539z.getAndIncrement(), outputSurface2.getSurface());
        }
        if (outputSurface3 != null) {
            this.f11549q = SurfaceOutputConfig.m62570b(f11539z.getAndIncrement(), outputSurface3.getSurface());
        }
        C0962Ni m67196d = new C0962Ni().m67199a(this.f11547o).m67199a(this.f11548p).m67196d(1);
        if (this.f11549q != null) {
            m67196d.m67199a(this.f11549q);
        }
        CaptureStageImpl onPresetSession = this.f11541i.onPresetSession();
        Logger.m63230d("BasicSessionProcessor", "preview onPresetSession:" + onPresetSession);
        CaptureStageImpl onPresetSession2 = this.f11542j.onPresetSession();
        Logger.m63230d("BasicSessionProcessor", "capture onPresetSession:" + onPresetSession2);
        if (onPresetSession != null && onPresetSession.getParameters() != null) {
            for (Pair pair : onPresetSession.getParameters()) {
                m67196d.m67198b((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (onPresetSession2 != null && onPresetSession2.getParameters() != null) {
            for (Pair pair2 : onPresetSession2.getParameters()) {
                m67196d.m67198b((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return m67196d.m67197c();
    }

    /* renamed from: j */
    public final void m62585j() {
        synchronized (this.f11543k) {
            try {
                if (this.f11544l == null) {
                    return;
                }
                Integer num = (Integer) this.f11555w.get(CaptureRequest.JPEG_ORIENTATION);
                if (num != null) {
                    this.f11544l.setRotationDegrees(num.intValue());
                }
                Byte b = (Byte) this.f11555w.get(CaptureRequest.JPEG_QUALITY);
                if (b != null) {
                    this.f11544l.setJpegQuality(b.byteValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public Map m62584k(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put((CaptureResult.Key) pair.first, pair.second);
        }
        return hashMap;
    }

    /* renamed from: l */
    public Map m62583l(TotalCaptureResult totalCaptureResult) {
        HashMap hashMap = new HashMap();
        for (CaptureResult.Key key : totalCaptureResult.getKeys()) {
            if (this.f11556x.contains(key)) {
                hashMap.put(key, totalCaptureResult.get(key));
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    public final /* synthetic */ void m62582m(SessionProcessor.CaptureCallback captureCallback, int i, long j, List list) {
        captureCallback.onCaptureCompleted(j, i, m62584k(list));
    }

    /* renamed from: n */
    public final void m62581n(RequestProcessor requestProcessor, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptureStageImpl captureStageImpl = (CaptureStageImpl) it.next();
            C2587d c2587d = new C2587d();
            c2587d.m62556a(this.f11547o.getId());
            if (this.f11549q != null) {
                c2587d.m62556a(this.f11549q.getId());
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                c2587d.m62553d((CaptureRequest.Key) pair.first, pair.second);
            }
            c2587d.m62552e(1);
            arrayList.add(c2587d.m62555b());
        }
        requestProcessor.submit(arrayList, new C2575b());
    }

    /* renamed from: o */
    public void m62580o(int i, SessionProcessor.CaptureCallback captureCallback) {
        if (this.f11552t == null) {
            Logger.m63230d("BasicSessionProcessor", "mRequestProcessor is null, ignore repeating request");
            return;
        }
        C2587d c2587d = new C2587d();
        c2587d.m62556a(this.f11547o.getId());
        if (this.f11549q != null) {
            c2587d.m62556a(this.f11549q.getId());
        }
        c2587d.m62552e(1);
        m62587h(c2587d);
        m62586i(c2587d);
        C2576c c2576c = new C2576c(captureCallback, i);
        Logger.m63230d("BasicSessionProcessor", "requestProcessor setRepeating");
        this.f11552t.setRepeating(c2587d.m62555b(), c2576c);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionEnd() {
        this.f11557y.onDisableSessionInvoked();
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl onDisableSession = this.f11541i.onDisableSession();
        Logger.m63230d("BasicSessionProcessor", "preview onDisableSession: " + onDisableSession);
        if (onDisableSession != null) {
            arrayList.add(onDisableSession);
        }
        CaptureStageImpl onDisableSession2 = this.f11542j.onDisableSession();
        Logger.m63230d("BasicSessionProcessor", "capture onDisableSession:" + onDisableSession2);
        if (onDisableSession2 != null) {
            arrayList.add(onDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            m62581n(this.f11552t, arrayList);
        }
        this.f11552t = null;
        this.f11553u = false;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor) {
        this.f11552t = requestProcessor;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl onEnableSession = this.f11541i.onEnableSession();
        Logger.m63230d("BasicSessionProcessor", "preview onEnableSession: " + onEnableSession);
        if (onEnableSession != null) {
            arrayList.add(onEnableSession);
        }
        CaptureStageImpl onEnableSession2 = this.f11542j.onEnableSession();
        Logger.m63230d("BasicSessionProcessor", "capture onEnableSession:" + onEnableSession2);
        if (onEnableSession2 != null) {
            arrayList.add(onEnableSession2);
        }
        this.f11557y.onEnableSessionInvoked();
        if (!arrayList.isEmpty()) {
            m62581n(requestProcessor, arrayList);
        }
        if (this.f11545m != null) {
            setImageProcessor(this.f11547o.getId(), new C2574a());
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void setParameters(@NonNull Config config) {
        synchronized (this.f11543k) {
            try {
                HashMap hashMap = new HashMap();
                CaptureRequestOptions build = CaptureRequestOptions.Builder.from(config).build();
                for (Config.Option option : build.listOptions()) {
                    hashMap.put((CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
                }
                this.f11555w.clear();
                this.f11555w.putAll(hashMap);
                m62585j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startCapture(@NonNull SessionProcessor.CaptureCallback captureCallback) {
        int andIncrement = this.f11554v.getAndIncrement();
        if (this.f11552t != null && !this.f11553u) {
            this.f11553u = true;
            ArrayList arrayList = new ArrayList();
            List<CaptureStageImpl> captureStages = this.f11542j.getCaptureStages();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureStageImpl captureStageImpl : captureStages) {
                C2587d c2587d = new C2587d();
                c2587d.m62556a(this.f11548p.getId());
                c2587d.m62552e(2);
                c2587d.m62554c(captureStageImpl.getId());
                arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
                m62587h(c2587d);
                m62586i(c2587d);
                for (Pair pair : captureStageImpl.getParameters()) {
                    c2587d.m62553d((CaptureRequest.Key) pair.first, pair.second);
                }
                arrayList.add(c2587d.m62555b());
            }
            Logger.m63230d("BasicSessionProcessor", "Wait for capture stage id: " + arrayList2);
            C2577d c2577d = new C2577d(captureCallback, andIncrement);
            Logger.m63230d("BasicSessionProcessor", "startCapture");
            if (this.f11544l != null) {
                this.f11544l.startCapture(arrayList2, new C2578e(captureCallback, andIncrement));
            }
            setImageProcessor(this.f11548p.getId(), new C2579f(captureCallback, andIncrement));
            this.f11552t.submit(arrayList, c2577d);
            return andIncrement;
        }
        Logger.m63230d("BasicSessionProcessor", "startCapture failed");
        captureCallback.onCaptureFailed(andIncrement);
        captureCallback.onCaptureSequenceAborted(andIncrement);
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startRepeating(@NonNull final SessionProcessor.CaptureCallback captureCallback) {
        final int andIncrement = this.f11554v.getAndIncrement();
        if (this.f11552t == null) {
            captureCallback.onCaptureFailed(andIncrement);
            captureCallback.onCaptureSequenceAborted(andIncrement);
        } else {
            if (this.f11545m != null) {
                this.f11545m.start(new PreviewProcessor.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.a
                    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                    public final void onCaptureResult(long j, List list) {
                        BasicExtenderSessionProcessor.m62588g(BasicExtenderSessionProcessor.this, captureCallback, andIncrement, j, list);
                    }
                });
            }
            m62580o(andIncrement, captureCallback);
        }
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startTrigger(@NonNull Config config, @NonNull SessionProcessor.CaptureCallback captureCallback) {
        Logger.m63230d("BasicSessionProcessor", "startTrigger");
        int andIncrement = this.f11554v.getAndIncrement();
        C2587d c2587d = new C2587d();
        c2587d.m62556a(this.f11547o.getId());
        if (this.f11549q != null) {
            c2587d.m62556a(this.f11549q.getId());
        }
        c2587d.m62552e(1);
        m62587h(c2587d);
        m62586i(c2587d);
        CaptureRequestOptions build = CaptureRequestOptions.Builder.from(config).build();
        for (Config.Option option : build.listOptions()) {
            c2587d.m62553d((CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        this.f11552t.submit(c2587d.m62555b(), new C2580g(captureCallback, andIncrement));
        return andIncrement;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void stopRepeating() {
        this.f11552t.stopRepeating();
    }
}
