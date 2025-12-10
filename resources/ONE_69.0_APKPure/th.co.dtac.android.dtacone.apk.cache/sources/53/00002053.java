package androidx.camera.extensions.internal;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ExtensionsUseCaseConfigFactory implements UseCaseConfigFactory {

    /* renamed from: a */
    public final ImageCaptureConfigProvider f11603a;

    /* renamed from: b */
    public final PreviewConfigProvider f11604b;

    /* renamed from: c */
    public final ImageAnalysisConfigProvider f11605c;

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2555a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11606a;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f11606a = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11606a[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11606a[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11606a[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ExtensionsUseCaseConfigFactory(int i, @NonNull VendorExtender vendorExtender) {
        this.f11603a = new ImageCaptureConfigProvider(i, vendorExtender);
        this.f11604b = new PreviewConfigProvider(i, vendorExtender);
        this.f11605c = new ImageAnalysisConfigProvider(vendorExtender);
    }

    /* renamed from: a */
    public final boolean m62553a(List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Integer) pair.first).intValue();
            Size[] sizeArr = (Size[]) pair.second;
            if (intValue == 35 && sizeArr != null && sizeArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @Nullable
    public Config getConfig(@NonNull UseCaseConfigFactory.CaptureType captureType, int i) {
        MutableOptionsBundle from;
        int i2 = C2555a.f11606a[captureType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
                }
                ImageAnalysisConfig config = this.f11605c.getConfig();
                if (m62553a(config.getSupportedResolutions(null))) {
                    from = MutableOptionsBundle.from((Config) config);
                } else {
                    throw new IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
                }
            } else {
                from = MutableOptionsBundle.from((Config) this.f11604b.getConfig());
            }
        } else {
            from = MutableOptionsBundle.from((Config) this.f11603a.getConfig());
        }
        from.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.TRUE);
        return OptionsBundle.from(from);
    }
}