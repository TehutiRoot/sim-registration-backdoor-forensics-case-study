package kotlin.p023io.path;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Lkotlin/io/path/FileVisitorBuilder;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 */
/* loaded from: classes5.dex */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 extends Lambda implements Function1<FileVisitorBuilder, Unit> {
    final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1 */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C117101 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117101(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
            super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$copyAction = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            return invoke2(AbstractC21393oI0.m25938a(path), AbstractC22665vj1.m1008a(basicFileAttributes));
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(@NotNull Path p0, @NotNull BasicFileAttributes p1) {
            FileVisitResult m28746a;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            m28746a = PathsKt__PathRecursiveFunctionsKt.m28746a(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            return m28746a;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C117112 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117112(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
            super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$copyAction = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            return invoke2(AbstractC21393oI0.m25938a(path), AbstractC22665vj1.m1008a(basicFileAttributes));
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(@NotNull Path p0, @NotNull BasicFileAttributes p1) {
            FileVisitResult m28746a;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            m28746a = PathsKt__PathRecursiveFunctionsKt.m28746a(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            return m28746a;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C117123 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117123(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
            super(2, Intrinsics.Kotlin.class, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.$onError = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
            return invoke2(AbstractC21393oI0.m25938a(path), exc);
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(@NotNull Path p0, @NotNull Exception p1) {
            FileVisitResult m28744c;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            m28744c = PathsKt__PathRecursiveFunctionsKt.m28744c(this.$onError, this.$this_copyToRecursively, this.$target, p0, p1);
            return m28744c;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "exception", "Ljava/io/IOException;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$4 */
    /* loaded from: classes5.dex */
    public static final class C117134 extends Lambda implements Function2<Path, IOException, FileVisitResult> {
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117134(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
            super(2);
            this.$onError = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, IOException iOException) {
            return invoke2(AbstractC21393oI0.m25938a(path), iOException);
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(@NotNull Path directory, @Nullable IOException iOException) {
            FileVisitResult m28744c;
            FileVisitResult fileVisitResult;
            Intrinsics.checkNotNullParameter(directory, "directory");
            if (iOException == null) {
                fileVisitResult = FileVisitResult.CONTINUE;
                return fileVisitResult;
            }
            m28744c = PathsKt__PathRecursiveFunctionsKt.m28744c(this.$onError, this.$this_copyToRecursively, this.$target, directory, iOException);
            return m28744c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
        super(1);
        this.$copyAction = function3;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$onError = function32;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
        invoke2(fileVisitorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FileVisitorBuilder visitFileTree) {
        Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
        visitFileTree.onPreVisitDirectory(new C117101(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
        visitFileTree.onVisitFile(new C117112(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
        visitFileTree.onVisitFileFailed(new C117123(this.$onError, this.$this_copyToRecursively, this.$target));
        visitFileTree.onPostVisitDirectory(new C117134(this.$onError, this.$this_copyToRecursively, this.$target));
    }
}
