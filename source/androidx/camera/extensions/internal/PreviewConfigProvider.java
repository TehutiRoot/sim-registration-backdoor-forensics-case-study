package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;

@RequiresApi(21)
/* loaded from: classes.dex */
public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {

    /* renamed from: c */
    public static final Config.Option f11523c = Config.Option.create("camerax.extensions.previewConfigProvider.mode", Integer.class);

    /* renamed from: a */
    public final VendorExtender f11524a;

    /* renamed from: b */
    public final int f11525b;

    public PreviewConfigProvider(int i, @NonNull VendorExtender vendorExtender) {
        this.f11525b = i;
        this.f11524a = vendorExtender;
    }

    /* renamed from: a */
    public void m62603a(Preview.Builder builder, int i, VendorExtender vendorExtender) {
        builder.getMutableConfig().insertOption(f11523c, Integer.valueOf(i));
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    @NonNull
    public PreviewConfig getConfig() {
        Preview.Builder builder = new Preview.Builder();
        m62603a(builder, this.f11525b, this.f11524a);
        return builder.getUseCaseConfig();
    }
}
