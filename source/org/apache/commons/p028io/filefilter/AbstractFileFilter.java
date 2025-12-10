package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import org.apache.commons.p028io.file.PathVisitor;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.AbstractFileFilter */
/* loaded from: classes6.dex */
public abstract class AbstractFileFilter implements IOFileFilter, PathVisitor {
    private final FileVisitResult onAccept;
    private final FileVisitResult onReject;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractFileFilter() {
        /*
            r2 = this;
            java.nio.file.FileVisitResult r0 = p000.AbstractC22149sj1.m22554a()
            java.nio.file.FileVisitResult r1 = p000.AbstractC22321tj1.m1373a()
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.filefilter.AbstractFileFilter.<init>():void");
    }

    public static FileVisitResult toDefaultFileVisitResult(boolean z) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        if (z) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public /* synthetic */ FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return R90.m66494a(this, path, basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public /* synthetic */ IOFileFilter and(IOFileFilter iOFileFilter) {
        return R90.m66493b(this, iOFileFilter);
    }

    public void append(List<?> list, StringBuilder sb) {
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
    }

    public FileVisitResult get(IOSupplier<FileVisitResult> iOSupplier) {
        try {
            return AbstractC1021OY.m67027a(iOSupplier.get());
        } catch (IOException e) {
            return handle(e);
        }
    }

    public FileVisitResult handle(Throwable th2) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return R90.m66492c(this, path);
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public /* synthetic */ IOFileFilter negate() {
        return R90.m66491d(this);
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    /* renamed from: or */
    public /* synthetic */ IOFileFilter mo25241or(IOFileFilter iOFileFilter) {
        return R90.m66490e(this, iOFileFilter);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(AbstractC21393oI0.m25938a(path), iOException);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory2(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    public FileVisitResult toFileVisitResult(boolean z) {
        if (z) {
            return this.onAccept;
        }
        return this.onReject;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return visitFileFailed2(AbstractC21393oI0.m25938a(path), iOException);
    }

    public AbstractFileFilter(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.onAccept = fileVisitResult;
        this.onReject = fileVisitResult2;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    /* renamed from: postVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    /* renamed from: preVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    /* renamed from: visitFile  reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    /* renamed from: visitFileFailed  reason: avoid collision after fix types in other method */
    public FileVisitResult visitFileFailed2(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    public void append(Object[] objArr, StringBuilder sb) {
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(objArr[i]);
        }
    }
}
