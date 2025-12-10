package kotlin.p023io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, m28850d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 */
/* loaded from: classes5.dex */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 extends Lambda implements Function3 {
    public static final PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 INSTANCE = new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3();

    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(AbstractC21393oI0.m25938a(obj), AbstractC21393oI0.m25938a(obj2), (Exception) obj3);
    }

    @NotNull
    public final Void invoke(@NotNull Path path, @NotNull Path path2, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
