package th.p047co.dtac.android.dtacone.extension;

import java.io.File;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28850d2 = {"getImageType", "", "Ljava/io/File;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.FileExtKt */
/* loaded from: classes7.dex */
public final class FileExtKt {
    @NotNull
    public static final String getImageType(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String lowerCase = FilesKt__UtilsKt.getExtension(file).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
