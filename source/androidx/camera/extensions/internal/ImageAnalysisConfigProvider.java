package androidx.camera.extensions.internal;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageAnalysisConfig;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageAnalysisConfigProvider implements ConfigProvider<ImageAnalysisConfig> {

    /* renamed from: a */
    public final VendorExtender f11519a;

    public ImageAnalysisConfigProvider(@NonNull VendorExtender vendorExtender) {
        this.f11519a = vendorExtender;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    @NonNull
    public ImageAnalysisConfig getConfig() {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        Size[] supportedYuvAnalysisResolutions = this.f11519a.getSupportedYuvAnalysisResolutions();
        ArrayList arrayList = new ArrayList();
        if (supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0) {
            arrayList.add(new Pair<>(35, supportedYuvAnalysisResolutions));
        }
        builder.setSupportedResolutions((List<Pair<Integer, Size[]>>) arrayList);
        return builder.getUseCaseConfig();
    }
}
