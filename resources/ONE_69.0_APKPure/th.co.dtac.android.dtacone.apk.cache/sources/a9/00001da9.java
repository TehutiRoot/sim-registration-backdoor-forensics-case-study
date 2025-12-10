package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ExperimentalZeroShutterLag;
import androidx.camera.core.impl.UseCaseConfigFactory;

@RequiresApi(21)
/* loaded from: classes.dex */
public class TemplateTypeUtil {

    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2352a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10532a;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f10532a = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10532a[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10532a[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10532a[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10532a[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getCaptureConfigTemplateType(@NonNull UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2 = C2352a.f10532a[captureType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return 1;
            }
            return 3;
        } else if (i != 2) {
            return 2;
        } else {
            return 5;
        }
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getSessionConfigTemplateType(@NonNull UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2 = C2352a.f10532a[captureType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return 1;
            }
            return 3;
        } else if (i != 2) {
            return 1;
        } else {
            return 5;
        }
    }
}