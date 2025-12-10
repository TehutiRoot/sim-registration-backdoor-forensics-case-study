package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.C2425i;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.i */
/* loaded from: classes.dex */
public class C2425i {

    /* renamed from: a */
    public DeferrableSurface f10659a;

    /* renamed from: b */
    public SessionConfig f10660b;

    /* renamed from: d */
    public final Size f10662d;

    /* renamed from: f */
    public final InterfaceC2428c f10664f;

    /* renamed from: e */
    public final SupportedRepeatingSurfaceSize f10663e = new SupportedRepeatingSurfaceSize();

    /* renamed from: c */
    public final C2427b f10661c = new C2427b();

    /* renamed from: androidx.camera.camera2.internal.i$a */
    /* loaded from: classes.dex */
    public class C2426a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ Surface f10665a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f10666b;

        public C2426a(Surface surface, SurfaceTexture surfaceTexture) {
            C2425i.this = r1;
            this.f10665a = surface;
            this.f10666b = surfaceTexture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
            this.f10665a.release();
            this.f10666b.release();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.i$b */
    /* loaded from: classes.dex */
    public static class C2427b implements UseCaseConfig {

        /* renamed from: a */
        public final Config f10668a;

        public C2427b() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new C1036Oi());
            this.f10668a = create;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ boolean containsOption(Config.Option option) {
            return AbstractC19252bs1.m51810a(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            AbstractC19252bs1.m51809b(this, str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector() {
            return WZ1.m65616a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
            return WZ1.m65614c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public Config getConfig() {
            return this.f10668a;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
            return WZ1.m65611f(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig() {
            return WZ1.m65609h(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ DynamicRange getDynamicRange() {
            return AbstractC20238hd0.m30848a(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ int getInputFormat() {
            return AbstractC20238hd0.m30847b(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            return AbstractC19252bs1.m51808c(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set getPriorities(Config.Option option) {
            return AbstractC19252bs1.m51807d(this, option);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
            return WZ1.m65607j(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority() {
            return WZ1.m65605l(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass() {
            return YQ1.m65362a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFrameRate() {
            return WZ1.m65603n(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName() {
            return YQ1.m65360c(this);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
            return XZ1.m65481a(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ boolean hasDynamicRange() {
            return AbstractC20238hd0.m30846c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isHigResolutionDisabled(boolean z) {
            return WZ1.m65601p(this, z);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isZslDisabled(boolean z) {
            return WZ1.m65600q(this, z);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set listOptions() {
            return AbstractC19252bs1.m51806e(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option) {
            return AbstractC19252bs1.m51805f(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            return AbstractC19252bs1.m51803h(this, option, optionPriority);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
            return WZ1.m65615b(this, cameraSelector);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            return WZ1.m65613d(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
            return WZ1.m65610g(this, captureConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return WZ1.m65608i(this, sessionConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            return WZ1.m65606k(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            return WZ1.m65604m(this, i);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass(Class cls) {
            return YQ1.m65361b(this, cls);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFrameRate(Range range) {
            return WZ1.m65602o(this, range);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName(String str) {
            return YQ1.m65359d(this, str);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            return XZ1.m65480b(this, eventCallback);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            return AbstractC19252bs1.m51804g(this, option, obj);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.i$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2428c {
        /* renamed from: a */
        void mo63434a();
    }

    public C2425i(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager, InterfaceC2428c interfaceC2428c) {
        this.f10664f = interfaceC2428c;
        Size m63440f = m63440f(cameraCharacteristicsCompat, displayInfoManager);
        this.f10662d = m63440f;
        Logger.m63230d("MeteringRepeating", "MeteringSession SurfaceTexture size: " + m63440f);
        this.f10660b = m63442d();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63445a(C2425i c2425i, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        c2425i.m63437i(sessionConfig, sessionError);
    }

    /* renamed from: b */
    public static /* synthetic */ int m63444b(Size size, Size size2) {
        return m63436j(size, size2);
    }

    /* renamed from: j */
    public static /* synthetic */ int m63436j(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* renamed from: c */
    public void m63443c() {
        Logger.m63230d("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f10659a;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.f10659a = null;
    }

    /* renamed from: d */
    public SessionConfig m63442d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f10662d.getWidth(), this.f10662d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.f10661c, this.f10662d);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.f10659a = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new C2426a(surface, surfaceTexture), CameraXExecutors.directExecutor());
        createFrom.addSurface(this.f10659a);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: ws0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                C2425i.m63445a(C2425i.this, sessionConfig, sessionError);
            }
        });
        return createFrom.build();
    }

    /* renamed from: e */
    public String m63441e() {
        return "MeteringRepeating";
    }

    /* renamed from: f */
    public final Size m63440f(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            Logger.m63228e("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.f10663e.getSupportedSizes(outputSizes);
        List asList = Arrays.asList(supportedSizes);
        Collections.sort(asList, new Comparator() { // from class: xs0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2425i.m63444b((Size) obj, (Size) obj2);
            }
        });
        Size m63781d = displayInfoManager.m63781d();
        long min = Math.min(m63781d.getWidth() * m63781d.getHeight(), 307200L);
        int length = supportedSizes.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = supportedSizes[i];
            int i2 = ((size2.getWidth() * size2.getHeight()) > min ? 1 : ((size2.getWidth() * size2.getHeight()) == min ? 0 : -1));
            if (i2 == 0) {
                return size2;
            }
            if (i2 > 0) {
                if (size != null) {
                    return size;
                }
            } else {
                i++;
                size = size2;
            }
        }
        return (Size) asList.get(0);
    }

    /* renamed from: g */
    public SessionConfig m63439g() {
        return this.f10660b;
    }

    /* renamed from: h */
    public UseCaseConfig m63438h() {
        return this.f10661c;
    }

    /* renamed from: i */
    public final /* synthetic */ void m63437i(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f10660b = m63442d();
        InterfaceC2428c interfaceC2428c = this.f10664f;
        if (interfaceC2428c != null) {
            interfaceC2428c.mo63434a();
        }
    }
}
