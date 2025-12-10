package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
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
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AdvancedVendorExtender implements VendorExtender {

    /* renamed from: a */
    public final ExtensionDisabledValidator f11498a = new ExtensionDisabledValidator();

    /* renamed from: b */
    public final AdvancedExtenderImpl f11499b;

    /* renamed from: c */
    public String f11500c;

    public AdvancedVendorExtender(int i) {
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                this.f11499b = new AutoAdvancedExtenderImpl();
                                return;
                            }
                            throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                        }
                        this.f11499b = new BeautyAdvancedExtenderImpl();
                        return;
                    }
                    this.f11499b = new NightAdvancedExtenderImpl();
                    return;
                }
                this.f11499b = new HdrAdvancedExtenderImpl();
                return;
            }
            this.f11499b = new BokehAdvancedExtenderImpl();
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    /* renamed from: a */
    public final List m62617a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) ((List) map.get(num)).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public final List m62616b() {
        List emptyList = Collections.emptyList();
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_3) >= 0) {
            try {
                return Collections.unmodifiableList(this.f11499b.getAvailableCaptureRequestKeys());
            } catch (Exception e) {
                Logger.m63227e("AdvancedVendorExtender", "AdvancedExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e);
                return emptyList;
            }
        }
        return emptyList;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public SessionProcessor createSessionProcessor(@NonNull Context context) {
        Preconditions.checkNotNull(this.f11500c, "VendorExtender#init() must be called first");
        return new AdvancedSessionProcessor(this.f11499b.createSessionProcessor(), m62616b(), context);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@Nullable Size size) {
        Preconditions.checkNotNull(this.f11500c, "VendorExtender#init() must be called first");
        return this.f11499b.getEstimatedCaptureLatencyRange(this.f11500c, size, 256);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Preconditions.checkNotNull(this.f11500c, "VendorExtender#init() must be called first");
        return m62617a(this.f11499b.getSupportedCaptureOutputResolutions(this.f11500c));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Preconditions.checkNotNull(this.f11500c, "VendorExtender#init() must be called first");
        return m62617a(this.f11499b.getSupportedPreviewOutputResolutions(this.f11500c));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public Size[] getSupportedYuvAnalysisResolutions() {
        Preconditions.checkNotNull(this.f11500c, "VendorExtender#init() must be called first");
        List supportedYuvAnalysisResolutions = this.f11499b.getSupportedYuvAnalysisResolutions(this.f11500c);
        if (supportedYuvAnalysisResolutions == null) {
            return new Size[0];
        }
        return (Size[]) supportedYuvAnalysisResolutions.toArray(new Size[0]);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void init(@NonNull CameraInfo cameraInfo) {
        this.f11500c = Camera2CameraInfo.from(cameraInfo).getCameraId();
        this.f11499b.init(this.f11500c, Camera2CameraInfo.from(cameraInfo).getCameraCharacteristicsMap());
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        if (this.f11498a.shouldDisableExtension()) {
            return false;
        }
        return this.f11499b.isExtensionAvailable(str, map);
    }
}
