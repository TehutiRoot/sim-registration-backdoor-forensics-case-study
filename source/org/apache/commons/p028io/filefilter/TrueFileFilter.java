package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: org.apache.commons.io.filefilter.TrueFileFilter */
/* loaded from: classes6.dex */
public class TrueFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter INSTANCE;
    private static final String TO_STRING = Boolean.TRUE.toString();
    public static final IOFileFilter TRUE;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public IOFileFilter and(IOFileFilter iOFileFilter) {
        return iOFileFilter;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return R90.m66492c(this, path);
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public IOFileFilter negate() {
        return FalseFileFilter.INSTANCE;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    /* renamed from: or */
    public IOFileFilter mo25241or(IOFileFilter iOFileFilter) {
        return INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
