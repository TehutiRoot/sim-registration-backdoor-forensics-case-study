package kotlin.p023io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt */
/* loaded from: classes5.dex */
public abstract class PathsKt__PathRecursiveFunctionsKt extends AbstractC18417Rj1 {

    @Metadata(m29141k = 3, m29140mv = {1, 9, 0}, m29138xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$WhenMappings */
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: a */
    public static final FileVisitResult m29038a(Function3 function3, Path path, Path path2, Function3 function32, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return m29029j((CopyActionResult) function3.invoke(C13902sE.f79838a, path3, m29037b(path, path2, path3)));
        } catch (Exception e) {
            return m29036c(function32, path, path2, path3, e);
        }
    }

    /* renamed from: b */
    public static final Path m29037b(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(AbstractC23082xk1.relativeTo(path3, path).toString());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(...)");
        return resolve;
    }

    /* renamed from: c */
    public static final FileVisitResult m29036c(Function3 function3, Path path, Path path2, Path path3, Exception exc) {
        return m29028k((OnErrorResult) function3.invoke(path3, m29037b(path, path2, path3), exc));
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path path, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (z2) {
            return copyToRecursively(path, target, onError, z, new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2(z));
        }
        return copyToRecursively$default(path, target, onError, z, (Function3) null, 8, (Object) null);
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            function3 = PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1.INSTANCE;
        }
        return copyToRecursively(path, path2, function3, z, z2);
    }

    /* renamed from: d */
    public static final List m29035d(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        boolean z = false;
        boolean z2 = true;
        C10147eT c10147eT = new C10147eT(0, 1, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    DirectoryStream m31763a = AbstractC19622dk1.m31763a(directoryStream);
                    if (AbstractC20660jk1.m29466a(m31763a)) {
                        c10147eT.m31692f(parent);
                        SecureDirectoryStream m29151a = AbstractC20833kk1.m29151a(m31763a);
                        fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        m29033f(m29151a, fileName, c10147eT);
                    } else {
                        z = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream, null);
                    z2 = z;
                } finally {
                }
            }
        }
        if (z2) {
            m29031h(path, c10147eT);
        }
        return c10147eT.m31694d();
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> m29035d = m29035d(path);
        if (!m29035d.isEmpty()) {
            FileSystemException m51690a = AbstractC5434cT.m51690a("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception exc : m29035d) {
                AbstractC10223fT.addSuppressed(m51690a, exc);
            }
            throw m51690a;
        }
    }

    /* renamed from: e */
    public static final void m29034e(SecureDirectoryStream secureDirectoryStream, Path path, C10147eT c10147eT) {
        SecureDirectoryStream secureDirectoryStream2;
        Path fileName;
        LinkOption linkOption;
        try {
            try {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, linkOption);
            } catch (NoSuchFileException unused) {
                secureDirectoryStream2 = null;
            }
            if (secureDirectoryStream2 != null) {
                SecureDirectoryStream<Object> m29151a = AbstractC20833kk1.m29151a(secureDirectoryStream2);
                for (Object obj : m29151a) {
                    fileName = AbstractC22491uI0.m1223a(obj).getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    m29033f(m29151a, fileName, c10147eT);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(secureDirectoryStream2, null);
            }
        } catch (Exception e) {
            c10147eT.m31697a(e);
        }
    }

    /* renamed from: f */
    public static final void m29033f(SecureDirectoryStream secureDirectoryStream, Path path, C10147eT c10147eT) {
        LinkOption linkOption;
        c10147eT.m31696b(path);
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
        } catch (Exception e) {
            c10147eT.m31697a(e);
        }
        if (!m29030i(secureDirectoryStream, path, linkOption)) {
            secureDirectoryStream.deleteFile(path);
            Unit unit = Unit.INSTANCE;
        } else {
            int m31693e = c10147eT.m31693e();
            m29034e(secureDirectoryStream, path, c10147eT);
            if (m31693e == c10147eT.m31693e()) {
                secureDirectoryStream.deleteDirectory(path);
                Unit unit2 = Unit.INSTANCE;
            }
            c10147eT.m31695c(path);
        }
        c10147eT.m31695c(path);
    }

    /* renamed from: g */
    public static final void m29032g(Path path, C10147eT c10147eT) {
        DirectoryStream directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                for (Object obj : AbstractC19622dk1.m31763a(directoryStream)) {
                    Path m1223a = AbstractC22491uI0.m1223a(obj);
                    Intrinsics.checkNotNull(m1223a);
                    m29031h(m1223a, c10147eT);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(directoryStream, null);
            }
        } catch (Exception e) {
            c10147eT.m31697a(e);
        }
    }

    /* renamed from: h */
    public static final void m29031h(Path path, C10147eT c10147eT) {
        LinkOption linkOption;
        boolean isDirectory;
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (!isDirectory) {
                Files.deleteIfExists(path);
            } else {
                int m31693e = c10147eT.m31693e();
                m29032g(path, c10147eT);
                if (m31693e == c10147eT.m31693e()) {
                    Files.deleteIfExists(path);
                }
            }
        } catch (Exception e) {
            c10147eT.m31697a(e);
        }
    }

    /* renamed from: i */
    public static final boolean m29030i(SecureDirectoryStream secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        FileAttributeView fileAttributeView;
        BasicFileAttributes readAttributes;
        boolean isDirectory;
        try {
            fileAttributeView = secureDirectoryStream.getFileAttributeView(path, AbstractC18807Xj1.m65574a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            readAttributes = AbstractC18936Zj1.m65201a(fileAttributeView).readAttributes();
            isDirectory = readAttributes.isDirectory();
            bool = Boolean.valueOf(isDirectory);
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: j */
    public static final FileVisitResult m29029j(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i = WhenMappings.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        } else if (i == 3) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public static final FileVisitResult m29028k(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i = WhenMappings.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r3 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r1 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.p023io.path.ExperimentalPathApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.nio.file.Path copyToRecursively(@org.jetbrains.annotations.NotNull java.nio.file.Path r6, @org.jetbrains.annotations.NotNull java.nio.file.Path r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.p023io.path.OnErrorResult> r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.p023io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.p023io.path.CopyActionResult> r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "copyAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.p023io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r9)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = p000.AbstractC12279mX.m26630a(r6, r0)
            if (r0 == 0) goto Ld1
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = p000.AbstractC12279mX.m26630a(r6, r1)
            if (r1 == 0) goto Lc3
            if (r9 != 0) goto L45
            boolean r1 = p000.AbstractC21525ok1.m26057a(r6)
            if (r1 != 0) goto Lc3
        L45:
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = p000.AbstractC12279mX.m26630a(r7, r1)
            r2 = 1
            if (r1 == 0) goto L5c
            boolean r1 = p000.AbstractC21525ok1.m26057a(r7)
            if (r1 != 0) goto L5c
            r1 = 1
            goto L5d
        L5c:
            r1 = 0
        L5d:
            if (r1 == 0) goto L65
            boolean r3 = p000.AbstractC20484ij1.m30914a(r6, r7)
            if (r3 != 0) goto Lc3
        L65:
            java.nio.file.FileSystem r3 = p000.AbstractC18804Xi1.m65576a(r6)
            java.nio.file.FileSystem r4 = p000.AbstractC18804Xi1.m65576a(r7)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L74
            goto Lae
        L74:
            if (r1 == 0) goto L87
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = p000.AbstractC21352nk1.m26254a(r7, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = p000.AbstractC21352nk1.m26254a(r6, r0)
            boolean r0 = p000.AbstractC21179mk1.m26575a(r1, r0)
            goto Lae
        L87:
            java.nio.file.Path r1 = p000.AbstractC1805ZS.m65231a(r7)
            if (r1 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = p000.AbstractC12279mX.m26630a(r1, r3)
            if (r3 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = p000.AbstractC21352nk1.m26254a(r1, r3)
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r3 = p000.AbstractC21352nk1.m26254a(r6, r3)
            boolean r1 = p000.AbstractC21179mk1.m26575a(r1, r3)
            if (r1 == 0) goto Lae
            r0 = 1
        Lae:
            if (r0 != 0) goto Lb1
            goto Lc3
        Lb1:
            p000.AbstractC10069dT.m31830a()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Recursively copying a directory into its subdirectory is prohibited."
            java.nio.file.FileSystemException r6 = p000.AbstractC20314hk1.m31100a(r6, r7, r8)
            throw r6
        Lc3:
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 r3 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5
            r3.<init>(r10, r6, r7, r8)
            r4 = 1
            r5 = 0
            r1 = 0
            r0 = r6
            r2 = r9
            p000.AbstractC23082xk1.visitFileTree$default(r0, r1, r2, r3, r4, r5)
            return r7
        Ld1:
            p000.AbstractC20487ik1.m30910a()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "The source file doesn't exist."
            java.nio.file.NoSuchFileException r6 = p000.AbstractC20141gk1.m31337a(r6, r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p023io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively(java.nio.file.Path, java.nio.file.Path, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function3):java.nio.file.Path");
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z, Function3 function32, int i, Object obj) {
        if ((i & 2) != 0) {
            function3 = PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            function32 = new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4(z);
        }
        return copyToRecursively(path, path2, function3, z, function32);
    }
}