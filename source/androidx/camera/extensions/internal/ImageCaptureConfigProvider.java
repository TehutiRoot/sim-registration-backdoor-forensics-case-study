package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageCaptureConfigProvider implements ConfigProvider<ImageCaptureConfig> {

    /* renamed from: c */
    public static final Config.Option f11520c = Config.Option.create("camerax.extensions.imageCaptureConfigProvider.mode", Integer.class);

    /* renamed from: a */
    public final VendorExtender f11521a;

    /* renamed from: b */
    public final int f11522b;

    public ImageCaptureConfigProvider(int i, @NonNull VendorExtender vendorExtender) {
        this.f11522b = i;
        this.f11521a = vendorExtender;
    }

    /* renamed from: a */
    public void m62604a(ImageCapture.Builder builder, int i, VendorExtender vendorExtender) {
        builder.getMutableConfig().insertOption(f11520c, Integer.valueOf(i));
        builder.setSupportedResolutions(vendorExtender.getSupportedCaptureOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    @NonNull
    public ImageCaptureConfig getConfig() {
        ImageCapture.Builder builder = new ImageCapture.Builder();
        m62604a(builder, this.f11522b, this.f11521a);
        return builder.getUseCaseConfig();
    }
}
