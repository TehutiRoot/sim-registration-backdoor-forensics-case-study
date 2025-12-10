package io.fotoapparat.parameter.extract;

import android.hardware.Camera;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00060\u0000R\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00060\u0000R\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "", "", UserMetadata.KEYDATA_FILENAME, "extractRawCameraValues", "(Landroid/hardware/Camera$Parameters;Ljava/util/List;)Ljava/util/List;", Action.KEY_ATTRIBUTE, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/hardware/Camera$Parameters;Ljava/lang/String;)Ljava/util/List;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRawValuesExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawValuesExtractor.kt\nio/fotoapparat/parameter/extract/RawValuesExtractorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1855#2:22\n1856#2:24\n1#3:23\n*S KotlinDebug\n*F\n+ 1 RawValuesExtractor.kt\nio/fotoapparat/parameter/extract/RawValuesExtractorKt\n*L\n13#1:22\n13#1:24\n*E\n"})
/* loaded from: classes5.dex */
public final class RawValuesExtractorKt {
    /* renamed from: a */
    public static final List m30508a(Camera.Parameters parameters, String str) {
        String str2 = parameters.get(str);
        if (str2 != null) {
            return new Regex(",").split(str2, 0);
        }
        return null;
    }

    @NotNull
    public static final List<String> extractRawCameraValues(@NotNull Camera.Parameters parameters, @NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(parameters, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (String str : keys) {
            List<String> m30508a = m30508a(parameters, str);
            if (m30508a != null) {
                return m30508a;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
