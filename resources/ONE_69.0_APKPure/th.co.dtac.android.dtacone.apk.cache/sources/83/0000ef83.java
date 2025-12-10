package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: org.apache.commons.io.filefilter.FalseFileFilter */
/* loaded from: classes6.dex */
public class FalseFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter FALSE;
    public static final IOFileFilter INSTANCE;
    private static final String TO_STRING = Boolean.FALSE.toString();
    private static final long serialVersionUID = 6210271677940926200L;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        FALSE = falseFileFilter;
        INSTANCE = falseFileFilter;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public IOFileFilter and(IOFileFilter iOFileFilter) {
        return INSTANCE;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return X90.m65627c(this, path);
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    public IOFileFilter negate() {
        return TrueFileFilter.INSTANCE;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter
    /* renamed from: or */
    public IOFileFilter mo25431or(IOFileFilter iOFileFilter) {
        return iOFileFilter;
    }

    public String toString() {
        return TO_STRING;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }
}