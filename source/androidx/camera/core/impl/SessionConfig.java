package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.C2519f;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SessionConfig {

    /* renamed from: a */
    public final List f11174a;

    /* renamed from: b */
    public final List f11175b;

    /* renamed from: c */
    public final List f11176c;

    /* renamed from: d */
    public final List f11177d;

    /* renamed from: e */
    public final List f11178e;

    /* renamed from: f */
    public final CaptureConfig f11179f;

    /* renamed from: g */
    public InputConfiguration f11180g;

    /* loaded from: classes.dex */
    public static class Builder extends C2508a {
        @NonNull
        public static Builder createFrom(@NonNull UseCaseConfig<?> useCaseConfig, @NonNull Size size) {
            OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker(null);
            if (sessionOptionUnpacker != null) {
                Builder builder = new Builder();
                sessionOptionUnpacker.unpack(size, useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        @NonNull
        public Builder addAllCameraCaptureCallbacks(@NonNull Collection<CameraCaptureCallback> collection) {
            for (CameraCaptureCallback cameraCaptureCallback : collection) {
                this.f11186b.addCameraCaptureCallback(cameraCaptureCallback);
                if (!this.f11190f.contains(cameraCaptureCallback)) {
                    this.f11190f.add(cameraCaptureCallback);
                }
            }
            return this;
        }

        @NonNull
        public Builder addAllDeviceStateCallbacks(@NonNull Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                addDeviceStateCallback(stateCallback);
            }
            return this;
        }

        @NonNull
        public Builder addAllRepeatingCameraCaptureCallbacks(@NonNull Collection<CameraCaptureCallback> collection) {
            this.f11186b.addAllCameraCaptureCallbacks(collection);
            return this;
        }

        @NonNull
        public Builder addAllSessionStateCallbacks(@NonNull List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                addSessionStateCallback(stateCallback);
            }
            return this;
        }

        @NonNull
        public Builder addCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.f11186b.addCameraCaptureCallback(cameraCaptureCallback);
            if (!this.f11190f.contains(cameraCaptureCallback)) {
                this.f11190f.add(cameraCaptureCallback);
            }
            return this;
        }

        @NonNull
        public Builder addDeviceStateCallback(@NonNull CameraDevice.StateCallback stateCallback) {
            if (this.f11187c.contains(stateCallback)) {
                return this;
            }
            this.f11187c.add(stateCallback);
            return this;
        }

        @NonNull
        public Builder addErrorListener(@NonNull ErrorListener errorListener) {
            this.f11189e.add(errorListener);
            return this;
        }

        @NonNull
        public Builder addImplementationOptions(@NonNull Config config) {
            this.f11186b.addImplementationOptions(config);
            return this;
        }

        @NonNull
        public Builder addNonRepeatingSurface(@NonNull DeferrableSurface deferrableSurface) {
            return addNonRepeatingSurface(deferrableSurface, DynamicRange.SDR);
        }

        @NonNull
        public Builder addOutputConfig(@NonNull OutputConfig outputConfig) {
            this.f11185a.add(outputConfig);
            this.f11186b.addSurface(outputConfig.getSurface());
            for (DeferrableSurface deferrableSurface : outputConfig.getSharedSurfaces()) {
                this.f11186b.addSurface(deferrableSurface);
            }
            return this;
        }

        @NonNull
        public Builder addRepeatingCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.f11186b.addCameraCaptureCallback(cameraCaptureCallback);
            return this;
        }

        @NonNull
        public Builder addSessionStateCallback(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            if (this.f11188d.contains(stateCallback)) {
                return this;
            }
            this.f11188d.add(stateCallback);
            return this;
        }

        @NonNull
        public Builder addSurface(@NonNull DeferrableSurface deferrableSurface) {
            return addSurface(deferrableSurface, DynamicRange.SDR);
        }

        @NonNull
        public Builder addTag(@NonNull String str, @NonNull Object obj) {
            this.f11186b.addTag(str, obj);
            return this;
        }

        @NonNull
        public SessionConfig build() {
            return new SessionConfig(new ArrayList(this.f11185a), new ArrayList(this.f11187c), new ArrayList(this.f11188d), new ArrayList(this.f11190f), new ArrayList(this.f11189e), this.f11186b.build(), this.f11191g);
        }

        @NonNull
        public Builder clearSurfaces() {
            this.f11185a.clear();
            this.f11186b.clearSurfaces();
            return this;
        }

        @NonNull
        public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return Collections.unmodifiableList(this.f11190f);
        }

        public boolean removeCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            boolean removeCameraCaptureCallback = this.f11186b.removeCameraCaptureCallback(cameraCaptureCallback);
            boolean remove = this.f11190f.remove(cameraCaptureCallback);
            if (!removeCameraCaptureCallback && !remove) {
                return false;
            }
            return true;
        }

        @NonNull
        public Builder removeSurface(@NonNull DeferrableSurface deferrableSurface) {
            OutputConfig outputConfig;
            Iterator it = this.f11185a.iterator();
            while (true) {
                if (it.hasNext()) {
                    outputConfig = (OutputConfig) it.next();
                    if (outputConfig.getSurface().equals(deferrableSurface)) {
                        break;
                    }
                } else {
                    outputConfig = null;
                    break;
                }
            }
            if (outputConfig != null) {
                this.f11185a.remove(outputConfig);
            }
            this.f11186b.removeSurface(deferrableSurface);
            return this;
        }

        @NonNull
        public Builder setExpectedFrameRateRange(@NonNull Range<Integer> range) {
            this.f11186b.setExpectedFrameRateRange(range);
            return this;
        }

        @NonNull
        public Builder setImplementationOptions(@NonNull Config config) {
            this.f11186b.setImplementationOptions(config);
            return this;
        }

        @NonNull
        public Builder setInputConfiguration(@Nullable InputConfiguration inputConfiguration) {
            this.f11191g = inputConfiguration;
            return this;
        }

        @NonNull
        public Builder setTemplateType(int i) {
            this.f11186b.setTemplateType(i);
            return this;
        }

        @NonNull
        public Builder addNonRepeatingSurface(@NonNull DeferrableSurface deferrableSurface, @NonNull DynamicRange dynamicRange) {
            this.f11185a.add(OutputConfig.builder(deferrableSurface).setDynamicRange(dynamicRange).build());
            return this;
        }

        @NonNull
        public Builder addSurface(@NonNull DeferrableSurface deferrableSurface, @NonNull DynamicRange dynamicRange) {
            this.f11185a.add(OutputConfig.builder(deferrableSurface).setDynamicRange(dynamicRange).build());
            this.f11186b.addSurface(deferrableSurface);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface ErrorListener {
        void onError(@NonNull SessionConfig sessionConfig, @NonNull SessionError sessionError);
    }

    /* loaded from: classes.dex */
    public interface OptionUnpacker {
        void unpack(@NonNull Size size, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull Builder builder);
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class OutputConfig {
        public static final int SURFACE_GROUP_ID_NONE = -1;

        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class Builder {
            @NonNull
            public abstract OutputConfig build();

            @NonNull
            public abstract Builder setDynamicRange(@NonNull DynamicRange dynamicRange);

            @NonNull
            public abstract Builder setPhysicalCameraId(@Nullable String str);

            @NonNull
            public abstract Builder setSharedSurfaces(@NonNull List<DeferrableSurface> list);

            @NonNull
            public abstract Builder setSurface(@NonNull DeferrableSurface deferrableSurface);

            @NonNull
            public abstract Builder setSurfaceGroupId(int i);
        }

        @NonNull
        public static Builder builder(@NonNull DeferrableSurface deferrableSurface) {
            return new C2519f.C2521b().setSurface(deferrableSurface).setSharedSurfaces(Collections.emptyList()).setPhysicalCameraId(null).setSurfaceGroupId(-1).setDynamicRange(DynamicRange.SDR);
        }

        @NonNull
        public abstract DynamicRange getDynamicRange();

        @Nullable
        public abstract String getPhysicalCameraId();

        @NonNull
        public abstract List<DeferrableSurface> getSharedSurfaces();

        @NonNull
        public abstract DeferrableSurface getSurface();

        public abstract int getSurfaceGroupId();
    }

    /* loaded from: classes.dex */
    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes.dex */
    public static final class ValidatingBuilder extends C2508a {

        /* renamed from: k */
        public static final List f11181k = Arrays.asList(1, 5, 3);

        /* renamed from: h */
        public final SurfaceSorter f11182h = new SurfaceSorter();

        /* renamed from: i */
        public boolean f11183i = true;

        /* renamed from: j */
        public boolean f11184j = false;

        /* renamed from: a */
        public final List m62915a() {
            ArrayList arrayList = new ArrayList();
            for (OutputConfig outputConfig : this.f11185a) {
                arrayList.add(outputConfig.getSurface());
                for (DeferrableSurface deferrableSurface : outputConfig.getSharedSurfaces()) {
                    arrayList.add(deferrableSurface);
                }
            }
            return arrayList;
        }

        public void add(@NonNull SessionConfig sessionConfig) {
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                this.f11184j = true;
                this.f11186b.setTemplateType(m62914b(repeatingCaptureConfig.getTemplateType(), this.f11186b.getTemplateType()));
            }
            m62913c(repeatingCaptureConfig.getExpectedFrameRateRange());
            this.f11186b.addAllTags(sessionConfig.getRepeatingCaptureConfig().getTagBundle());
            this.f11187c.addAll(sessionConfig.getDeviceStateCallbacks());
            this.f11188d.addAll(sessionConfig.getSessionStateCallbacks());
            this.f11186b.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.f11190f.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            this.f11189e.addAll(sessionConfig.getErrorListeners());
            if (sessionConfig.getInputConfiguration() != null) {
                this.f11191g = sessionConfig.getInputConfiguration();
            }
            this.f11185a.addAll(sessionConfig.getOutputConfigs());
            this.f11186b.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!m62915a().containsAll(this.f11186b.getSurfaces())) {
                Logger.m63230d("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f11183i = false;
            }
            this.f11186b.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public <T> void addImplementationOption(@NonNull Config.Option<T> option, @NonNull T t) {
            this.f11186b.addImplementationOption(option, t);
        }

        /* renamed from: b */
        public final int m62914b(int i, int i2) {
            List list = f11181k;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                return i2;
            }
            return i;
        }

        @NonNull
        public SessionConfig build() {
            if (this.f11183i) {
                ArrayList arrayList = new ArrayList(this.f11185a);
                this.f11182h.sort(arrayList);
                return new SessionConfig(arrayList, new ArrayList(this.f11187c), new ArrayList(this.f11188d), new ArrayList(this.f11190f), new ArrayList(this.f11189e), this.f11186b.build(), this.f11191g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public final void m62913c(Range range) {
            Range<Integer> range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (range.equals(range2)) {
                return;
            }
            if (this.f11186b.getExpectedFrameRateRange().equals(range2)) {
                this.f11186b.setExpectedFrameRateRange(range);
            } else if (!this.f11186b.getExpectedFrameRateRange().equals(range)) {
                this.f11183i = false;
                Logger.m63230d("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        public void clearSurfaces() {
            this.f11185a.clear();
            this.f11186b.clearSurfaces();
        }

        public boolean isValid() {
            if (this.f11184j && this.f11183i) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$a */
    /* loaded from: classes.dex */
    public static class C2508a {

        /* renamed from: a */
        public final Set f11185a = new LinkedHashSet();

        /* renamed from: b */
        public final CaptureConfig.Builder f11186b = new CaptureConfig.Builder();

        /* renamed from: c */
        public final List f11187c = new ArrayList();

        /* renamed from: d */
        public final List f11188d = new ArrayList();

        /* renamed from: e */
        public final List f11189e = new ArrayList();

        /* renamed from: f */
        public final List f11190f = new ArrayList();

        /* renamed from: g */
        public InputConfiguration f11191g;
    }

    public SessionConfig(List list, List list2, List list3, List list4, List list5, CaptureConfig captureConfig, InputConfiguration inputConfiguration) {
        this.f11174a = list;
        this.f11175b = Collections.unmodifiableList(list2);
        this.f11176c = Collections.unmodifiableList(list3);
        this.f11177d = Collections.unmodifiableList(list4);
        this.f11178e = Collections.unmodifiableList(list5);
        this.f11179f = captureConfig;
        this.f11180g = inputConfiguration;
    }

    @NonNull
    public static SessionConfig defaultEmptySessionConfig() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.Builder().build(), null);
    }

    @NonNull
    public List<CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.f11175b;
    }

    @NonNull
    public List<ErrorListener> getErrorListeners() {
        return this.f11178e;
    }

    @NonNull
    public Range<Integer> getExpectedFrameRateRange() {
        return this.f11179f.getExpectedFrameRateRange();
    }

    @NonNull
    public Config getImplementationOptions() {
        return this.f11179f.getImplementationOptions();
    }

    @Nullable
    public InputConfiguration getInputConfiguration() {
        return this.f11180g;
    }

    @NonNull
    public List<OutputConfig> getOutputConfigs() {
        return this.f11174a;
    }

    @NonNull
    public List<CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.f11179f.getCameraCaptureCallbacks();
    }

    @NonNull
    public CaptureConfig getRepeatingCaptureConfig() {
        return this.f11179f;
    }

    @NonNull
    public List<CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.f11176c;
    }

    @NonNull
    public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.f11177d;
    }

    @NonNull
    public List<DeferrableSurface> getSurfaces() {
        ArrayList arrayList = new ArrayList();
        for (OutputConfig outputConfig : this.f11174a) {
            arrayList.add(outputConfig.getSurface());
            for (DeferrableSurface deferrableSurface : outputConfig.getSharedSurfaces()) {
                arrayList.add(deferrableSurface);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int getTemplateType() {
        return this.f11179f.getTemplateType();
    }
}
