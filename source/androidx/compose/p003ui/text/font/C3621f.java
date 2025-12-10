package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.text.ExperimentalTextApi;
import androidx.compose.p003ui.text.font.FontVariation;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.compose.ui.text.font.f */
/* loaded from: classes2.dex */
public final class C3621f {

    /* renamed from: a */
    public static final C3621f f31353a = new C3621f();

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    /* renamed from: a */
    public final Typeface m59039a(@NotNull AssetManager assetManager, @NotNull String path, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context != null) {
            fontVariationSettings = AbstractC22458uW1.m1259a(assetManager, path).setFontVariationSettings(m59036d(variationSettings, context));
            build = fontVariationSettings.build();
            return build;
        }
        return null;
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    /* renamed from: b */
    public final Typeface m59038b(@NotNull File file, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context != null) {
            fontVariationSettings = AbstractC22286tW1.m22410a(file).setFontVariationSettings(m59036d(variationSettings, context));
            build = fontVariationSettings.build();
            return build;
        }
        return null;
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    /* renamed from: c */
    public final Typeface m59037c(@NotNull ParcelFileDescriptor fileDescriptor, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        AbstractC23146yW1.m242a();
        fontVariationSettings = AbstractC22974xW1.m499a(fileDescriptor.getFileDescriptor()).setFontVariationSettings(m59036d(variationSettings, context));
        build = fontVariationSettings.build();
        return build;
    }

    /* renamed from: d */
    public final FontVariationAxis[] m59036d(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity$ui_text_release()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i = 0; i < size; i++) {
            FontVariation.Setting setting = settings2.get(i);
            AbstractC22802wW1.m829a();
            arrayList.add(AbstractC22630vW1.m1025a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
