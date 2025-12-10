package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "map", "(Landroid/net/Uri;Lcoil/request/Options;)Ljava/io/File;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: classes3.dex */
public final class FileUriMapper implements Mapper<Uri, File> {
    /* renamed from: a */
    public final boolean m51057a(Uri uri) {
        if (Utils.isAssetUri(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !Intrinsics.areEqual(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (!StringsKt__StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) || Utils.getFirstPathSegment(uri) == null) {
            return false;
        }
        return true;
    }

    @Override // coil.map.Mapper
    @Nullable
    public File map(@NotNull Uri uri, @NotNull Options options) {
        if (m51057a(uri)) {
            if (Intrinsics.areEqual(uri.getScheme(), "file")) {
                String path = uri.getPath();
                if (path != null) {
                    return new File(path);
                }
                return null;
            }
            return new File(uri.toString());
        }
        return null;
    }
}
