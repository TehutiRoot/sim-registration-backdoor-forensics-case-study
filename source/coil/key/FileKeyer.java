package coil.key;

import ch.qos.logback.core.joran.action.Action;
import coil.request.Options;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28850d2 = {"Lcoil/key/FileKeyer;", "Lcoil/key/Keyer;", "Ljava/io/File;", "", "addLastModifiedToFileCacheKey", "<init>", "(Z)V", "data", "Lcoil/request/Options;", "options", "", Action.KEY_ATTRIBUTE, "(Ljava/io/File;Lcoil/request/Options;)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileKeyer implements Keyer<File> {

    /* renamed from: a */
    public final boolean f40609a;

    public FileKeyer(boolean z) {
        this.f40609a = z;
    }

    @Override // coil.key.Keyer
    @NotNull
    public String key(@NotNull File file, @NotNull Options options) {
        if (this.f40609a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
