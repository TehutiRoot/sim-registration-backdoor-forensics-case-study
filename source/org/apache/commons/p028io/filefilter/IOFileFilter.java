package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.p028io.file.PathFilter;

/* renamed from: org.apache.commons.io.filefilter.IOFileFilter */
/* loaded from: classes6.dex */
public interface IOFileFilter extends FileFilter, FilenameFilter, PathFilter, PathMatcher {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes);

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    IOFileFilter and(IOFileFilter iOFileFilter);

    boolean matches(Path path);

    IOFileFilter negate();

    /* renamed from: or */
    IOFileFilter mo25241or(IOFileFilter iOFileFilter);
}
