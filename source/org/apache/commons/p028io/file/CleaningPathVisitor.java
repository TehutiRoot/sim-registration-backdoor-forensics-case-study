package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.p028io.file.Counters;

/* renamed from: org.apache.commons.io.file.CleaningPathVisitor */
/* loaded from: classes6.dex */
public class CleaningPathVisitor extends CountingPathVisitor {

    /* renamed from: f */
    public final String[] f73280f;

    /* renamed from: g */
    public final boolean f73281g;

    public CleaningPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : CountingPathVisitor.f73292e;
        Arrays.sort(strArr2);
        this.f73280f = strArr2;
        this.f73281g = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CleaningPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static CountingPathVisitor withLongCounters() {
        return new CleaningPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    /* renamed from: e */
    public final boolean m25297e(Path path) {
        if (Arrays.binarySearch(this.f73280f, PathUtils.getFileNameString(path)) < 0) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CleaningPathVisitor cleaningPathVisitor = (CleaningPathVisitor) obj;
        if (this.f73281g == cleaningPathVisitor.f73281g && Arrays.equals(this.f73280f, cleaningPathVisitor.f73280f)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f73280f)) * 31) + Objects.hash(Boolean.valueOf(this.f73281g));
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
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        super.preVisitDirectory(path, basicFileAttributes);
        if (m25297e(path)) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    /* renamed from: visitFile  reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        LinkOption linkOption;
        boolean exists;
        LinkOption linkOption2;
        if (m25297e(path)) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path, linkOption);
            if (exists) {
                if (this.f73281g) {
                    linkOption2 = LinkOption.NOFOLLOW_LINKS;
                    PathUtils.setReadOnly(path, false, linkOption2);
                }
                Files.deleteIfExists(path);
            }
        }
        updateFileCounters(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public CleaningPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }
}
