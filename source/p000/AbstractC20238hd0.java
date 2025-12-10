package p000;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.core.util.Preconditions;

/* renamed from: hd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC20238hd0 {
    /* renamed from: a */
    public static DynamicRange m30848a(ImageInputConfig imageInputConfig) {
        return (DynamicRange) Preconditions.checkNotNull((DynamicRange) imageInputConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED));
    }

    /* renamed from: b */
    public static int m30847b(ImageInputConfig imageInputConfig) {
        return ((Integer) imageInputConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    /* renamed from: c */
    public static boolean m30846c(ImageInputConfig imageInputConfig) {
        return imageInputConfig.containsOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE);
    }
}
