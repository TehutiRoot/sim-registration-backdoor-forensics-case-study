package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.p028io.file.Counters;

/* renamed from: org.apache.commons.io.file.DeletingPathVisitor */
/* loaded from: classes6.dex */
public class DeletingPathVisitor extends CountingPathVisitor {

    /* renamed from: f */
    public final String[] f73380f;

    /* renamed from: g */
    public final boolean f73381g;

    /* renamed from: h */
    public final LinkOption[] f73382h;

    public DeletingPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        this(pathCounters, PathUtils.noFollowLinkOptionArray(), deleteOptionArr, strArr);
    }

    /* renamed from: e */
    private boolean m25482e(Path path) {
        if (Arrays.binarySearch(this.f73380f, PathUtils.getFileNameString(path)) < 0) {
            return true;
        }
        return false;
    }

    public static DeletingPathVisitor withBigIntegerCounters() {
        return new DeletingPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static DeletingPathVisitor withLongCounters() {
        return new DeletingPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DeletingPathVisitor deletingPathVisitor = (DeletingPathVisitor) obj;
        if (this.f73381g == deletingPathVisitor.f73381g && Arrays.equals(this.f73380f, deletingPathVisitor.f73380f)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f73380f)) * 31) + Objects.hash(Boolean.valueOf(this.f73381g));
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(AbstractC22491uI0.m1223a(path), iOException);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory2(AbstractC22491uI0.m1223a(path), basicFileAttributes);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(AbstractC22491uI0.m1223a(path), basicFileAttributes);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, LinkOption[] linkOptionArr, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : CountingPathVisitor.f73376e;
        Arrays.sort(strArr2);
        this.f73380f = strArr2;
        this.f73381g = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
        this.f73382h = linkOptionArr == null ? PathUtils.noFollowLinkOptionArray() : (LinkOption[]) linkOptionArr.clone();
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    /* renamed from: postVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        if (PathUtils.isEmptyDirectory(path)) {
            Files.deleteIfExists(path);
        }
        return super.postVisitDirectory2(path, iOException);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    /* renamed from: preVisitDirectory  reason: avoid collision after fix types in other method */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        super.preVisitDirectory(path, basicFileAttributes);
        if (m25482e(path)) {
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
        boolean exists;
        boolean isSymbolicLink;
        if (m25482e(path)) {
            exists = Files.exists(path, this.f73382h);
            if (exists) {
                if (this.f73381g) {
                    PathUtils.setReadOnly(path, false, this.f73382h);
                }
                Files.deleteIfExists(path);
            }
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        updateFileCounters(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }
}