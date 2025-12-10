package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.p028io.file.Counters;
import org.apache.commons.p028io.filefilter.IOFileFilter;
import org.apache.commons.p028io.filefilter.SymbolicLinkFileFilter;
import org.apache.commons.p028io.filefilter.TrueFileFilter;
import org.apache.commons.p028io.function.IOBiFunction;

/* renamed from: org.apache.commons.io.file.CountingPathVisitor */
/* loaded from: classes6.dex */
public class CountingPathVisitor extends SimplePathVisitor {

    /* renamed from: e */
    public static final String[] f73292e = new String[0];

    /* renamed from: b */
    public final Counters.PathCounters f73293b;

    /* renamed from: c */
    public final PathFilter f73294c;

    /* renamed from: d */
    public final PathFilter f73295d;

    public CountingPathVisitor(Counters.PathCounters pathCounters) {
        this(pathCounters, m25293d(), m25294c());
    }

    /* renamed from: c */
    public static IOFileFilter m25294c() {
        return TrueFileFilter.INSTANCE;
    }

    /* renamed from: d */
    public static IOFileFilter m25293d() {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        fileVisitResult = FileVisitResult.TERMINATE;
        fileVisitResult2 = FileVisitResult.CONTINUE;
        return new SymbolicLinkFileFilter(fileVisitResult, fileVisitResult2);
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CountingPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static CountingPathVisitor withLongCounters() {
        return new CountingPathVisitor(Counters.longPathCounters());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountingPathVisitor)) {
            return false;
        }
        return Objects.equals(this.f73293b, ((CountingPathVisitor) obj).f73293b);
    }

    public Counters.PathCounters getPathCounters() {
        return this.f73293b;
    }

    public int hashCode() {
        return Objects.hash(this.f73293b);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(AbstractC21393oI0.m25938a(path), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    public String toString() {
        return this.f73293b.toString();
    }

    public void updateDirCounter(Path path, IOException iOException) {
        this.f73293b.getDirectoryCounter().increment();
    }

    public void updateFileCounters(Path path, BasicFileAttributes basicFileAttributes) {
        long size;
        this.f73293b.getFileCounter().increment();
        Counters.Counter byteCounter = this.f73293b.getByteCounter();
        size = basicFileAttributes.size();
        byteCounter.add(size);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    public CountingPathVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2) {
        Objects.requireNonNull(pathCounters, "pathCounter");
        this.f73293b = pathCounters;
        Objects.requireNonNull(pathFilter, "fileFilter");
        this.f73294c = pathFilter;
        Objects.requireNonNull(pathFilter2, "dirFilter");
        this.f73295d = pathFilter2;
    }

    /* renamed from: postVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        updateDirCounter(path, iOException);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        FileVisitResult accept = this.f73295d.accept(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (accept != fileVisitResult) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        }
        fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        boolean exists;
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            FileVisitResult accept = this.f73294c.accept(path, basicFileAttributes);
            fileVisitResult2 = FileVisitResult.CONTINUE;
            if (accept == fileVisitResult2) {
                updateFileCounters(path, basicFileAttributes);
            }
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public CountingPathVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2, IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
        super(iOBiFunction);
        Objects.requireNonNull(pathCounters, "pathCounter");
        this.f73293b = pathCounters;
        Objects.requireNonNull(pathFilter, "fileFilter");
        this.f73294c = pathFilter;
        Objects.requireNonNull(pathFilter2, "dirFilter");
        this.f73295d = pathFilter2;
    }
}
