package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.p028io.file.Counters;

/* renamed from: org.apache.commons.io.file.CopyDirectoryVisitor */
/* loaded from: classes6.dex */
public class CopyDirectoryVisitor extends CountingPathVisitor {

    /* renamed from: f */
    public final CopyOption[] f73282f;

    /* renamed from: g */
    public final Path f73283g;

    /* renamed from: h */
    public final Path f73284h;

    public CopyDirectoryVisitor(Counters.PathCounters pathCounters, Path path, Path path2, CopyOption... copyOptionArr) {
        super(pathCounters);
        this.f73283g = path;
        this.f73284h = path2;
        this.f73282f = m25295f(copyOptionArr);
    }

    /* renamed from: f */
    public static CopyOption[] m25295f(CopyOption... copyOptionArr) {
        if (copyOptionArr == null) {
            return PathUtils.EMPTY_COPY_OPTIONS;
        }
        return (CopyOption[]) copyOptionArr.clone();
    }

    public void copy(Path path, Path path2) throws IOException {
        Files.copy(path, path2, this.f73282f);
    }

    /* renamed from: e */
    public final Path m25296e(Path path) {
        Path relativize;
        String path2;
        Path resolve;
        Path path3 = this.f73284h;
        relativize = this.f73283g.relativize(path);
        path2 = relativize.toString();
        resolve = path3.resolve(path2);
        return resolve;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CopyDirectoryVisitor copyDirectoryVisitor = (CopyDirectoryVisitor) obj;
        if (Arrays.equals(this.f73282f, copyDirectoryVisitor.f73282f) && Objects.equals(this.f73283g, copyDirectoryVisitor.f73283g) && Objects.equals(this.f73284h, copyDirectoryVisitor.f73284h)) {
            return true;
        }
        return false;
    }

    public CopyOption[] getCopyOptions() {
        return (CopyOption[]) this.f73282f.clone();
    }

    public Path getSourceDirectory() {
        return this.f73283g;
    }

    public Path getTargetDirectory() {
        return this.f73284h;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f73282f)) * 31) + Objects.hash(this.f73283g, this.f73284h);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory2(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(AbstractC21393oI0.m25938a(path), basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    /* renamed from: preVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        boolean notExists;
        Path m25296e = m25296e(path);
        notExists = Files.notExists(m25296e, new LinkOption[0]);
        if (notExists) {
            Files.createDirectory(m25296e, new FileAttribute[0]);
        }
        return super.preVisitDirectory(path, basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    /* renamed from: visitFile  reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path m25296e = m25296e(path);
        copy(path, m25296e);
        return super.visitFile(m25296e, basicFileAttributes);
    }

    public CopyDirectoryVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2, Path path, Path path2, CopyOption... copyOptionArr) {
        super(pathCounters, pathFilter, pathFilter2);
        this.f73283g = path;
        this.f73284h = path2;
        this.f73282f = m25295f(copyOptionArr);
    }
}
