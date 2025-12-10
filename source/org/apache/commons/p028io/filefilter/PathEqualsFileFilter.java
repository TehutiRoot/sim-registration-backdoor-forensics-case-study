package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* renamed from: org.apache.commons.io.filefilter.PathEqualsFileFilter */
/* loaded from: classes6.dex */
public class PathEqualsFileFilter extends AbstractFileFilter {

    /* renamed from: a */
    public final Path f73315a;

    public PathEqualsFileFilter(Path path) {
        this.f73315a = path;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        Path path2 = this.f73315a;
        path = file.toPath();
        return Objects.equals(path2, path);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(Objects.equals(this.f73315a, path));
    }
}
