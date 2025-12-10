package coil.map;

import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "<init>", "()V", "data", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Z", "Lcoil/request/Options;", "options", "map", "(Landroid/net/Uri;Lcoil/request/Options;)Landroid/net/Uri;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
/* loaded from: classes3.dex */
public final class ResourceUriMapper implements Mapper<Uri, Uri> {
    /* renamed from: a */
    private final boolean m51055a(Uri uri) {
        String authority;
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !AbstractC20204hN1.isBlank(authority) && uri.getPathSegments().size() == 2) {
            return true;
        }
        return false;
    }

    @Override // coil.map.Mapper
    @Nullable
    public Uri map(@NotNull Uri uri, @NotNull Options options) {
        if (m51055a(uri)) {
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = "";
            }
            Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            if (identifier != 0) {
                Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                return parse;
            }
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        return null;
    }
}
