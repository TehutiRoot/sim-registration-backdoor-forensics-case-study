package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.AvailableKeysRetriever;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.camera.extensions.internal.compat.workaround.ImageAnalysisAvailability;
import androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class BasicVendorExtender implements VendorExtender {

    /* renamed from: i */
    public static final List f11589i;

    /* renamed from: b */
    public PreviewExtenderImpl f11591b;

    /* renamed from: c */
    public ImageCaptureExtenderImpl f11592c;

    /* renamed from: d */
    public CameraInfo f11593d;

    /* renamed from: e */
    public String f11594e;

    /* renamed from: f */
    public CameraCharacteristics f11595f;

    /* renamed from: h */
    public int f11597h;

    /* renamed from: a */
    public final ExtensionDisabledValidator f11590a = new ExtensionDisabledValidator();

    /* renamed from: g */
    public AvailableKeysRetriever f11596g = new AvailableKeysRetriever();

    static {
        CaptureRequest.Key key;
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        f11589i = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CaptureRequest.CONTROL_ZOOM_RATIO;
            arrayList.add(key);
        }
    }

    public BasicVendorExtender(int i) {
        this.f11591b = null;
        this.f11592c = null;
        try {
            this.f11597h = i;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                this.f11591b = new AutoPreviewExtenderImpl();
                                this.f11592c = new AutoImageCaptureExtenderImpl();
                                return;
                            }
                            throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                        }
                        this.f11591b = new BeautyPreviewExtenderImpl();
                        this.f11592c = new BeautyImageCaptureExtenderImpl();
                        return;
                    }
                    this.f11591b = new NightPreviewExtenderImpl();
                    this.f11592c = new NightImageCaptureExtenderImpl();
                    return;
                }
                this.f11591b = new HdrPreviewExtenderImpl();
                this.f11592c = new HdrImageCaptureExtenderImpl();
                return;
            }
            this.f11591b = new BokehPreviewExtenderImpl();
            this.f11592c = new BokehImageCaptureExtenderImpl();
        } catch (NoClassDefFoundError unused) {
            Logger.m63176e("BasicVendorExtender", "OEM implementation for extension mode " + i + "does not exist!");
        }
    }

    /* renamed from: a */
    public final int m62563a() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.f11592c;
        if (imageCaptureExtenderImpl != null && imageCaptureExtenderImpl.getCaptureProcessor() != null) {
            return 35;
        }
        return 256;
    }

    /* renamed from: b */
    public final int m62562b() {
        Integer num = (Integer) this.f11595f.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }

    /* renamed from: c */
    public final Size[] m62561c(int i) {
        return ((StreamConfigurationMap) Camera2CameraInfo.from(this.f11593d).getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public SessionProcessor createSessionProcessor(@NonNull Context context) {
        Preconditions.checkNotNull(this.f11593d, "VendorExtender#init() must be called first");
        return new BasicExtenderSessionProcessor(this.f11591b, this.f11592c, m62558f(context), m62559e(), context);
    }

    /* renamed from: d */
    public final int m62560d() {
        PreviewExtenderImpl previewExtenderImpl = this.f11591b;
        if (previewExtenderImpl != null && previewExtenderImpl.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            return 35;
        }
        return 34;
    }

    /* renamed from: e */
    public final List m62559e() {
        if (ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_3)) {
            try {
                List availableCaptureResultKeys = this.f11592c.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception e) {
                Logger.m63175e("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final List m62558f(Context context) {
        if (ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_3)) {
            try {
                List<CaptureRequest.Key> availableCaptureRequestKeys = this.f11596g.getAvailableCaptureRequestKeys(this.f11592c, this.f11594e, this.f11595f, context);
                if (availableCaptureRequestKeys != null) {
                    return Collections.unmodifiableList(availableCaptureRequestKeys);
                }
            } catch (Exception e) {
                Logger.m63175e("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e);
            }
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(f11589i);
    }

    /* renamed from: g */
    public final List m62557g(List list, int i, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).intValue() == i2) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            if (((Integer) pair.first).intValue() == i) {
                arrayList.add(new Pair(Integer.valueOf(i2), (Size[]) pair.second));
                z = true;
            } else {
                arrayList.add(pair);
            }
        }
        if (z) {
            return arrayList;
        }
        throw new IllegalArgumentException("Supported resolution should contain " + i2 + " format.");
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@Nullable Size size) {
        Preconditions.checkNotNull(this.f11593d, "VendorExtender#init() must be called first");
        if (this.f11592c != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) >= 0) {
            try {
                return this.f11592c.getEstimatedCaptureLatencyRange(size);
            } catch (NoSuchMethodError unused) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Preconditions.checkNotNull(this.f11593d, "VendorExtender#init() must be called first");
        if (this.f11592c != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List supportedResolutions = this.f11592c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return m62557g(supportedResolutions, 35, 256);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(256, m62561c(m62563a())));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Preconditions.checkNotNull(this.f11593d, "VendorExtender#init() must be called first");
        if (this.f11591b != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List supportedResolutions = this.f11591b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return m62557g(supportedResolutions, 35, 34);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, m62561c(m62560d())));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public Size[] getSupportedYuvAnalysisResolutions() {
        boolean z;
        boolean z2;
        ImageAnalysisAvailability imageAnalysisAvailability = new ImageAnalysisAvailability();
        if (this.f11591b.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            z = true;
        } else {
            z = false;
        }
        if (this.f11592c.getCaptureProcessor() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!imageAnalysisAvailability.isAvailable(this.f11594e, m62562b(), this.f11597h, z, z2)) {
            return new Size[0];
        }
        Preconditions.checkNotNull(this.f11593d, "VendorExtender#init() must be called first");
        return m62561c(35);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void init(@NonNull CameraInfo cameraInfo) {
        this.f11593d = cameraInfo;
        if (this.f11591b != null && this.f11592c != null) {
            this.f11594e = Camera2CameraInfo.from(cameraInfo).getCameraId();
            CameraCharacteristics extractCameraCharacteristics = Camera2CameraInfo.extractCameraCharacteristics(cameraInfo);
            this.f11595f = extractCameraCharacteristics;
            this.f11591b.init(this.f11594e, extractCameraCharacteristics);
            this.f11592c.init(this.f11594e, this.f11595f);
            Logger.m63178d("BasicVendorExtender", "PreviewExtender processorType= " + this.f11591b.getProcessorType());
            Logger.m63178d("BasicVendorExtender", "ImageCaptureExtender processor= " + this.f11592c.getCaptureProcessor());
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        if (this.f11590a.shouldDisableExtension() || this.f11591b == null || this.f11592c == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = map.get(str);
        if (!this.f11591b.isExtensionAvailable(str, cameraCharacteristics) || !this.f11592c.isExtensionAvailable(str, cameraCharacteristics)) {
            return false;
        }
        return true;
    }
}