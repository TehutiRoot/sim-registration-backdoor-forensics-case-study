package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
/* loaded from: classes.dex */
public final class Camera2CameraInfoImpl implements CameraInfoInternal {

    /* renamed from: a */
    public final String f10348a;

    /* renamed from: b */
    public final CameraCharacteristicsCompat f10349b;

    /* renamed from: c */
    public final Camera2CameraInfo f10350c;

    /* renamed from: e */
    public Camera2CameraControlImpl f10352e;

    /* renamed from: h */
    public final C2350a f10355h;

    /* renamed from: j */
    public final Quirks f10357j;

    /* renamed from: k */
    public final EncoderProfilesProvider f10358k;

    /* renamed from: l */
    public final CameraManagerCompat f10359l;

    /* renamed from: d */
    public final Object f10351d = new Object();

    /* renamed from: f */
    public C2350a f10353f = null;

    /* renamed from: g */
    public C2350a f10354g = null;

    /* renamed from: i */
    public List f10356i = null;

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraInfoImpl$a */
    /* loaded from: classes.dex */
    public static class C2350a extends MediatorLiveData {

        /* renamed from: m */
        public LiveData f10360m;

        /* renamed from: n */
        public final Object f10361n;

        public C2350a(Object obj) {
            this.f10361n = obj;
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public void addSource(LiveData liveData, Observer observer) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public void m63813f(LiveData liveData) {
            LiveData liveData2 = this.f10360m;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.f10360m = liveData;
            super.addSource(liveData, new Observer() { // from class: qi
                {
                    Camera2CameraInfoImpl.C2350a.this = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Camera2CameraInfoImpl.C2350a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public Object getValue() {
            LiveData liveData = this.f10360m;
            if (liveData == null) {
                return this.f10361n;
            }
            return liveData.getValue();
        }
    }

    public Camera2CameraInfoImpl(@NonNull String str, @NonNull CameraManagerCompat cameraManagerCompat) throws CameraAccessExceptionCompat {
        String str2 = (String) Preconditions.checkNotNull(str);
        this.f10348a = str2;
        this.f10359l = cameraManagerCompat;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
        this.f10349b = cameraCharacteristicsCompat;
        this.f10350c = new Camera2CameraInfo(this);
        this.f10357j = CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.f10358k = new Camera2EncoderProfilesProvider(str);
        this.f10355h = new C2350a(CameraState.create(CameraState.Type.CLOSED));
    }

    /* renamed from: a */
    public int m63819a() {
        Integer num = (Integer) this.f10349b.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    if (this.f10356i == null) {
                        this.f10356i = new ArrayList();
                    }
                    this.f10356i.add(new Pair(cameraCaptureCallback, executor));
                    return;
                }
                camera2CameraControlImpl.m63944l(executor, cameraCaptureCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public int m63818b() {
        Integer num = (Integer) this.f10349b.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    /* renamed from: c */
    public void m63817c(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.f10351d) {
            try {
                this.f10352e = camera2CameraControlImpl;
                C2350a c2350a = this.f10354g;
                if (c2350a != null) {
                    c2350a.m63813f(camera2CameraControlImpl.getZoomControl().m63342j());
                }
                C2350a c2350a2 = this.f10353f;
                if (c2350a2 != null) {
                    c2350a2.m63813f(this.f10352e.getTorchControl().m63357f());
                }
                List<Pair> list = this.f10356i;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f10352e.m63944l((Executor) pair.second, (CameraCaptureCallback) pair.first);
                    }
                    this.f10356i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m63816d();
    }

    /* renamed from: d */
    public final void m63816d() {
        m63815e();
    }

    /* renamed from: e */
    public final void m63815e() {
        String str;
        int m63818b = m63818b();
        if (m63818b != 0) {
            if (m63818b != 1) {
                if (m63818b != 2) {
                    if (m63818b != 3) {
                        if (m63818b != 4) {
                            str = "Unknown value: " + m63818b;
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        Logger.m63225i("Camera2CameraInfo", "Device Level: " + str);
    }

    /* renamed from: f */
    public void m63814f(LiveData liveData) {
        this.f10355h.m63813f(liveData);
    }

    @NonNull
    public Camera2CameraInfo getCamera2CameraInfo() {
        return this.f10350c;
    }

    @NonNull
    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.f10349b;
    }

    @NonNull
    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f10348a, this.f10349b.toCameraCharacteristics());
        for (String str : this.f10349b.getPhysicalCameraIds()) {
            if (!Objects.equals(str, this.f10348a)) {
                try {
                    linkedHashMap.put(str, this.f10359l.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (CameraAccessExceptionCompat e) {
                    Logger.m63227e("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public String getCameraId() {
        return this.f10348a;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Quirks getCameraQuirks() {
        return this.f10357j;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ CameraSelector getCameraSelector() {
        return AbstractC1559Vj.m65742a(this);
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<CameraState> getCameraState() {
        return this.f10355h;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.f10358k;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public ExposureState getExposureState() {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    return ExposureControl.m63775e(this.f10349b);
                }
                return camera2CameraControlImpl.getExposureControl().m63774f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ CameraInfoInternal getImplementation() {
        return AbstractC1559Vj.m65741b(this);
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public String getImplementationType() {
        if (m63818b() == 2) {
            return CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY;
        }
        return CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getIntrinsicZoomRatio() {
        Integer num = (Integer) this.f10349b.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return 1.0f;
        }
        try {
            return FovUtil.getDeviceDefaultViewAngleDegrees(this.f10359l, num.intValue()) / FovUtil.focalLengthToViewAngleDegrees(FovUtil.getDefaultFocalLength(this.f10349b), FovUtil.getSensorHorizontalLength(this.f10349b));
        } catch (Exception e) {
            Logger.m63228e("Camera2CameraInfo", "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        boolean z;
        Integer num = (Integer) this.f10349b.get(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Unable to get the lens facing of the camera.");
        return LensFacingUtil.getCameraSelectorLensFacing(num.intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i) {
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i), m63819a(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return DynamicRangesCompat.fromCameraCharacteristics(this.f10349b).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        Range[] rangeArr = (Range[]) this.f10349b.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            return new HashSet(Arrays.asList(rangeArr));
        }
        return Collections.emptySet();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public List<Size> getSupportedHighResolutions(int i) {
        Size[] highResolutionOutputSizes = this.f10349b.getStreamConfigurationMapCompat().getHighResolutionOutputSizes(i);
        if (highResolutionOutputSizes != null) {
            return Arrays.asList(highResolutionOutputSizes);
        }
        return Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public List<Size> getSupportedResolutions(int i) {
        Size[] outputSizes = this.f10349b.getStreamConfigurationMapCompat().getOutputSizes(i);
        if (outputSizes != null) {
            return Arrays.asList(outputSizes);
        }
        return Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Timebase getTimebase() {
        Integer num = (Integer) this.f10349b.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        Preconditions.checkNotNull(num);
        if (num.intValue() != 1) {
            return Timebase.UPTIME;
        }
        return Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<Integer> getTorchState() {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    if (this.f10353f == null) {
                        this.f10353f = new C2350a(0);
                    }
                    return this.f10353f;
                }
                C2350a c2350a = this.f10353f;
                if (c2350a != null) {
                    return c2350a;
                }
                return camera2CameraControlImpl.getTorchControl().m63357f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<ZoomState> getZoomState() {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    if (this.f10354g == null) {
                        this.f10354g = new C2350a(C2442o.m63344h(this.f10349b));
                    }
                    return this.f10354g;
                }
                C2350a c2350a = this.f10354g;
                if (c2350a != null) {
                    return c2350a;
                }
                return camera2CameraControlImpl.getZoomControl().m63342j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        CameraCharacteristicsCompat cameraCharacteristicsCompat = this.f10349b;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        return FlashAvailabilityChecker.isFlashAvailable(new C13107pi(cameraCharacteristicsCompat));
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@NonNull FocusMeteringAction focusMeteringAction) {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    return false;
                }
                return camera2CameraControlImpl.getFocusMeteringControl().m63493C(focusMeteringAction);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return Z62.m65264a(this.f10349b, 4);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        if (Build.VERSION.SDK_INT >= 23 && isPrivateReprocessingSupported() && DeviceQuirks.get(ZslDisablerQuirk.class) == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.f10351d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f10352e;
                if (camera2CameraControlImpl == null) {
                    List list = this.f10356i;
                    if (list == null) {
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Pair) it.next()).first == cameraCaptureCallback) {
                            it.remove();
                        }
                    }
                    return;
                }
                camera2CameraControlImpl.m63963N(cameraCaptureCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
