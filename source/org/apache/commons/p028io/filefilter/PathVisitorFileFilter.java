package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Supplier;
import org.apache.commons.p028io.file.NoopPathVisitor;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.file.PathVisitor;
import org.apache.commons.p028io.filefilter.PathVisitorFileFilter;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.PathVisitorFileFilter */
/* loaded from: classes6.dex */
public class PathVisitorFileFilter extends AbstractFileFilter {

    /* renamed from: a */
    public final PathVisitor f73317a;

    public PathVisitorFileFilter(PathVisitor pathVisitor) {
        this.f73317a = pathVisitor == null ? NoopPathVisitor.INSTANCE : pathVisitor;
    }

    /* renamed from: a */
    public static /* synthetic */ FileVisitResult m25246a(PathVisitorFileFilter pathVisitorFileFilter, Path path, BasicFileAttributes basicFileAttributes) {
        return pathVisitorFileFilter.m25245b(path, basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        FileVisitResult fileVisitResult;
        Path path;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            FileVisitResult visitFile2 = visitFile2(path, file.exists() ? PathUtils.readBasicFileAttributes(path) : null);
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return visitFile2 == fileVisitResult2;
        } catch (IOException e) {
            FileVisitResult handle = handle(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            return handle == fileVisitResult;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ FileVisitResult m25245b(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            return this.f73317a.postVisitDirectory(path, null);
        }
        return visitFile2(path, basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    /* renamed from: visitFile */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return this.f73317a.visitFile(path, basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FileVisitResult fileVisitResult;
        Path path;
        Path resolve;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            resolve = path.resolve(str);
            FileVisitResult accept = accept(resolve, PathUtils.readBasicFileAttributes(resolve));
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return accept == fileVisitResult2;
        } catch (IOException e) {
            FileVisitResult handle = handle(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            return handle == fileVisitResult;
        }
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, final BasicFileAttributes basicFileAttributes) {
        return get(new IOSupplier() { // from class: Ri1
            {
                PathVisitorFileFilter.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return PathVisitorFileFilter.m25246a(PathVisitorFileFilter.this, path, basicFileAttributes);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        });
    }
}
