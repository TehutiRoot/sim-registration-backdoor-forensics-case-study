package p000;

import android.content.Context;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C1758YT;

/* renamed from: bU */
/* loaded from: classes.dex */
public final class C5371bU {

    /* renamed from: a */
    public final CameraProvider f39041a;

    /* renamed from: b */
    public X02 f39042b = new X02() { // from class: ZT
        @Override // p000.X02
        /* renamed from: a */
        public final VendorExtender mo65231a(int i) {
            return C5371bU.m52006b(i);
        }
    };

    /* renamed from: bU$a */
    /* loaded from: classes.dex */
    public class C5372a implements VendorExtender {
        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ SessionProcessor createSessionProcessor(Context context) {
            return W02.m65714a(this, context);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ Range getEstimatedCaptureLatencyRange(Size size) {
            return W02.m65713b(this, size);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ List getSupportedCaptureOutputResolutions() {
            return W02.m65712c(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ List getSupportedPreviewOutputResolutions() {
            return W02.m65711d(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ Size[] getSupportedYuvAnalysisResolutions() {
            return W02.m65710e(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ void init(CameraInfo cameraInfo) {
            W02.m65709f(this, cameraInfo);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public /* synthetic */ boolean isExtensionAvailable(String str, Map map) {
            return W02.m65708g(this, str, map);
        }
    }

    public C5371bU(CameraProvider cameraProvider) {
        this.f39041a = cameraProvider;
    }

    /* renamed from: a */
    public static /* synthetic */ CameraConfig m52007a(C5371bU c5371bU, int i, Identifier identifier, CameraInfo cameraInfo, Context context) {
        return c5371bU.m51996l(i, identifier, cameraInfo, context);
    }

    /* renamed from: b */
    public static /* synthetic */ VendorExtender m52006b(int i) {
        return m52001g(i);
    }

    /* renamed from: d */
    public static String m52004d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
                            }
                            throw new IllegalArgumentException("Invalid extension mode!");
                        }
                        return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
                    }
                    return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
                }
                return ":camera:camera-extensions-EXTENSION_MODE_HDR";
            }
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        return ":camera:camera-extensions-EXTENSION_MODE_NONE";
    }

    /* renamed from: g */
    public static VendorExtender m52001g(int i) {
        if (m51999i()) {
            return new AdvancedVendorExtender(i);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new BasicVendorExtender(i);
        }
        return new C5372a();
    }

    /* renamed from: i */
    public static boolean m51999i() {
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    /* renamed from: c */
    public Range m52005c(CameraSelector cameraSelector, int i, Size size) {
        List<CameraInfo> filter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(m52002f(i)).build().filter(this.f39041a.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = filter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender mo65231a = this.f39042b.mo65231a(i);
            mo65231a.init(cameraInfo);
            return mo65231a.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    /* renamed from: e */
    public CameraSelector m52003e(CameraSelector cameraSelector, int i) {
        if (m51998j(cameraSelector, i)) {
            Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C1389TT) {
                    throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
                }
            }
            m52000h(i);
            CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
            fromSelector.addCameraFilter(m52002f(i));
            return fromSelector.build();
        }
        throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* renamed from: f */
    public final CameraFilter m52002f(int i) {
        return new C1389TT(m52004d(i), this.f39042b.mo65231a(i));
    }

    /* renamed from: h */
    public final void m52000h(final int i) {
        final Identifier create = Identifier.create(m52004d(i));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(create) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(create, new CameraConfigProvider() { // from class: aU
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return C5371bU.m52007a(C5371bU.this, i, create, cameraInfo, context);
                }
            });
        }
    }

    /* renamed from: j */
    public boolean m51998j(CameraSelector cameraSelector, int i) {
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(m52002f(i));
        return !fromSelector.build().filter(this.f39041a.getAvailableCameraInfos()).isEmpty();
    }

    /* renamed from: k */
    public boolean m51997k(CameraSelector cameraSelector, int i) {
        List<CameraInfo> filter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(m52002f(i)).build().filter(this.f39041a.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return false;
        }
        VendorExtender mo65231a = this.f39042b.mo65231a(i);
        mo65231a.init(filter.get(0));
        Size[] supportedYuvAnalysisResolutions = mo65231a.getSupportedYuvAnalysisResolutions();
        if (supportedYuvAnalysisResolutions == null || supportedYuvAnalysisResolutions.length <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final /* synthetic */ CameraConfig m51996l(int i, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender mo65231a = this.f39042b.mo65231a(i);
        mo65231a.init(cameraInfo);
        C1758YT.C1759a useCaseCombinationRequiredRule = new C1758YT.C1759a().m65347c(i).setUseCaseConfigFactory(new ExtensionsUseCaseConfigFactory(i, mo65231a)).setCompatibilityId(identifier).setZslDisabled(true).setUseCaseCombinationRequiredRule(1);
        SessionProcessor createSessionProcessor = mo65231a.createSessionProcessor(context);
        if (createSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(createSessionProcessor);
        }
        return useCaseCombinationRequiredRule.m65349a();
    }
}
