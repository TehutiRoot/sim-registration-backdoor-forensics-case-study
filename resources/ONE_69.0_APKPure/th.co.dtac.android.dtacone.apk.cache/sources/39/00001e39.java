package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.C2407i;
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
public class C2407i {

    /* renamed from: a */
    public DeferrableSurface f10747a;

    /* renamed from: b */
    public SessionConfig f10748b;

    /* renamed from: d */
    public final Size f10750d;

    /* renamed from: f */
    public final InterfaceC2410c f10752f;

    /* renamed from: e */
    public final SupportedRepeatingSurfaceSize f10751e = new SupportedRepeatingSurfaceSize();

    /* renamed from: c */
    public final C2409b f10749c = new C2409b();

    /* renamed from: androidx.camera.camera2.internal.i$a */
    /* loaded from: classes.dex */
    public class C2408a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ Surface f10753a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f10754b;

        public C2408a(Surface surface, SurfaceTexture surfaceTexture) {
            C2407i.this = r1;
            this.f10753a = surface;
            this.f10754b = surfaceTexture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
            this.f10753a.release();
            this.f10754b.release();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.i$b */
    /* loaded from: classes.dex */
    public static class C2409b implements UseCaseConfig {

        /* renamed from: a */
        public final Config f10756a;

        public C2409b() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new C1023Oi());
            this.f10756a = create;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ boolean containsOption(Config.Option option) {
            return AbstractC18893Ys1.m65346a(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            AbstractC18893Ys1.m65345b(this, str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector() {
            return T02.m66419a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
            return T02.m66417c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public Config getConfig() {
            return this.f10756a;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
            return T02.m66414f(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig() {
            return T02.m66412h(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ DynamicRange getDynamicRange() {
            return AbstractC21330nd0.m26372a(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ int getInputFormat() {
            return AbstractC21330nd0.m26371b(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            return AbstractC18893Ys1.m65344c(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set getPriorities(Config.Option option) {
            return AbstractC18893Ys1.m65343d(this, option);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
            return T02.m66410j(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority() {
            return T02.m66408l(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass() {
            return VR1.m65992a(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFrameRate() {
            return T02.m66406n(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName() {
            return VR1.m65990c(this);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
            return U02.m66287a(this);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ boolean hasDynamicRange() {
            return AbstractC21330nd0.m26370c(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isHigResolutionDisabled(boolean z) {
            return T02.m66404p(this, z);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ boolean isZslDisabled(boolean z) {
            return T02.m66403q(this, z);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set listOptions() {
            return AbstractC18893Ys1.m65342e(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option) {
            return AbstractC18893Ys1.m65341f(this, option);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            return AbstractC18893Ys1.m65339h(this, option, optionPriority);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
            return T02.m66418b(this, cameraSelector);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            return T02.m66416d(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
            return T02.m66413g(this, captureConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return T02.m66411i(this, sessionConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            return T02.m66409k(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            return T02.m66407m(this, i);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass(Class cls) {
            return VR1.m65991b(this, cls);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFrameRate(Range range) {
            return T02.m66405o(this, range);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName(String str) {
            return VR1.m65989d(this, str);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            return U02.m66286b(this, eventCallback);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            return AbstractC18893Ys1.m65340g(this, option, obj);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.i$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2410c {
        /* renamed from: a */
        void mo63385a();
    }

    public C2407i(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager, InterfaceC2410c interfaceC2410c) {
        this.f10752f = interfaceC2410c;
        Size m63391f = m63391f(cameraCharacteristicsCompat, displayInfoManager);
        this.f10750d = m63391f;
        Logger.m63178d("MeteringRepeating", "MeteringSession SurfaceTexture size: " + m63391f);
        this.f10748b = m63393d();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63396a(C2407i c2407i, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        c2407i.m63388i(sessionConfig, sessionError);
    }

    /* renamed from: b */
    public static /* synthetic */ int m63395b(Size size, Size size2) {
        return m63387j(size, size2);
    }

    /* renamed from: j */
    public static /* synthetic */ int m63387j(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* renamed from: c */
    public void m63394c() {
        Logger.m63178d("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f10747a;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.f10747a = null;
    }

    /* renamed from: d */
    public SessionConfig m63393d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f10750d.getWidth(), this.f10750d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.f10749c, this.f10750d);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.f10747a = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new C2408a(surface, surfaceTexture), CameraXExecutors.directExecutor());
        createFrom.addSurface(this.f10747a);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: Cs0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                C2407i.m63396a(C2407i.this, sessionConfig, sessionError);
            }
        });
        return createFrom.build();
    }

    /* renamed from: e */
    public String m63392e() {
        return "MeteringRepeating";
    }

    /* renamed from: f */
    public final Size m63391f(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            Logger.m63176e("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.f10751e.getSupportedSizes(outputSizes);
        List asList = Arrays.asList(supportedSizes);
        Collections.sort(asList, new Comparator() { // from class: Ds0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2407i.m63395b((Size) obj, (Size) obj2);
            }
        });
        Size m63732d = displayInfoManager.m63732d();
        long min = Math.min(m63732d.getWidth() * m63732d.getHeight(), 307200L);
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
    public SessionConfig m63390g() {
        return this.f10748b;
    }

    /* renamed from: h */
    public UseCaseConfig m63389h() {
        return this.f10749c;
    }

    /* renamed from: i */
    public final /* synthetic */ void m63388i(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f10748b = m63393d();
        InterfaceC2410c interfaceC2410c = this.f10752f;
        if (interfaceC2410c != null) {
            interfaceC2410c.mo63385a();
        }
    }
}