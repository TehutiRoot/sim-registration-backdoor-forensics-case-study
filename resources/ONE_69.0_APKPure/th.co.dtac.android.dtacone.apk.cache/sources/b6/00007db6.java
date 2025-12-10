package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import coil.decode.ImageSource;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\t¨\u0006\u000e"}, m29142d2 = {"Lcoil/decode/AssetMetadata;", "Lcoil/decode/ImageSource$Metadata;", "", "filePath", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "getFileName", "getFileName$annotations", "()V", "fileName", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@ExperimentalCoilApi
/* loaded from: classes3.dex */
public final class AssetMetadata extends ImageSource.Metadata {

    /* renamed from: a */
    public final String f40485a;

    public AssetMetadata(@NotNull String str) {
        this.f40485a = str;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to filePath as it supports assets inside subfolders.")
    public static /* synthetic */ void getFileName$annotations() {
    }

    @NotNull
    public final String getFileName() {
        return StringsKt__StringsKt.substringAfterLast$default(this.f40485a, '/', (String) null, 2, (Object) null);
    }

    @NotNull
    public final String getFilePath() {
        return this.f40485a;
    }
}