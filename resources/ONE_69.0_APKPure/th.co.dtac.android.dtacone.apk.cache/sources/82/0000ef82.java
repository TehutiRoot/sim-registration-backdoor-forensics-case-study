package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.filefilter.EmptyFileFilter;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.EmptyFileFilter */
/* loaded from: classes6.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter EMPTY;
    public static final IOFileFilter NOT_EMPTY;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        EMPTY = emptyFileFilter;
        NOT_EMPTY = emptyFileFilter.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) throws IOException {
        boolean isDirectory;
        long size;
        Stream list;
        Optional findFirst;
        boolean isPresent;
        boolean z = false;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            list = Files.list(path);
            try {
                findFirst = list.findFirst();
                isPresent = findFirst.isPresent();
                FileVisitResult fileVisitResult = toFileVisitResult(!isPresent);
                if (list != null) {
                    list.close();
                }
                return fileVisitResult;
            } catch (Throwable th2) {
                if (list != null) {
                    try {
                        list.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        size = Files.size(path);
        if (size == 0) {
            z = true;
        }
        return toFileVisitResult(z);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file == null) {
            return true;
        }
        return file.isDirectory() ? IOUtils.length(file.listFiles()) == 0 : file.length() == 0;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, BasicFileAttributes basicFileAttributes) {
        if (path == null) {
            return toFileVisitResult(true);
        }
        return get(new IOSupplier() { // from class: tR
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                FileVisitResult lambda$accept$0;
                lambda$accept$0 = EmptyFileFilter.this.lambda$accept$0(path);
                return lambda$accept$0;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }
}