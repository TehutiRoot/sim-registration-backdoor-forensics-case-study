package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* renamed from: org.apache.commons.io.filefilter.FileEqualsFileFilter */
/* loaded from: classes6.dex */
public class FileEqualsFileFilter extends AbstractFileFilter {

    /* renamed from: a */
    public final File f73395a;

    /* renamed from: b */
    public final Path f73396b;

    public FileEqualsFileFilter(File file) {
        Path path;
        Objects.requireNonNull(file, "file");
        this.f73395a = file;
        path = file.toPath();
        this.f73396b = path;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return Objects.equals(this.f73395a, file);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(Objects.equals(this.f73396b, path));
    }
}