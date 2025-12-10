package org.apache.commons.p028io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import org.apache.commons.p028io.filefilter.FileFilterUtils;
import org.apache.commons.p028io.filefilter.IOFileFilter;
import org.apache.commons.p028io.filefilter.TrueFileFilter;

@Deprecated
/* renamed from: org.apache.commons.io.DirectoryWalker */
/* loaded from: classes6.dex */
public abstract class DirectoryWalker<T> {

    /* renamed from: a */
    public final FileFilter f73229a;

    /* renamed from: b */
    public final int f73230b;

    /* renamed from: org.apache.commons.io.DirectoryWalker$CancelException */
    /* loaded from: classes6.dex */
    public static class CancelException extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public CancelException(File file, int i) {
            this("Operation Cancelled", file, i);
        }

        public int getDepth() {
            return this.depth;
        }

        public File getFile() {
            return this.file;
        }

        public CancelException(String str, File file, int i) {
            super(str);
            this.file = file;
            this.depth = i;
        }
    }

    public DirectoryWalker() {
        this(null, -1);
    }

    /* renamed from: a */
    public final void m25429a(File file, int i, Collection collection) {
        checkIfCancelled(file, i, collection);
        if (handleDirectory(file, i, collection)) {
            handleDirectoryStart(file, i, collection);
            int i2 = i + 1;
            int i3 = this.f73230b;
            if (i3 < 0 || i2 <= i3) {
                checkIfCancelled(file, i, collection);
                File[] filterDirectoryContents = filterDirectoryContents(file, i, file.listFiles(this.f73229a));
                if (filterDirectoryContents == null) {
                    handleRestricted(file, i2, collection);
                } else {
                    for (File file2 : filterDirectoryContents) {
                        if (file2.isDirectory()) {
                            m25429a(file2, i2, collection);
                        } else {
                            checkIfCancelled(file2, i2, collection);
                            handleFile(file2, i2, collection);
                            checkIfCancelled(file2, i2, collection);
                        }
                    }
                }
            }
            handleDirectoryEnd(file, i, collection);
        }
        checkIfCancelled(file, i, collection);
    }

    public final void checkIfCancelled(File file, int i, Collection<T> collection) throws IOException {
        if (!handleIsCancelled(file, i, collection)) {
            return;
        }
        throw new CancelException(file, i);
    }

    public File[] filterDirectoryContents(File file, int i, File... fileArr) throws IOException {
        return fileArr;
    }

    public boolean handleDirectory(File file, int i, Collection<T> collection) throws IOException {
        return true;
    }

    public void handleDirectoryEnd(File file, int i, Collection<T> collection) throws IOException {
    }

    public void handleDirectoryStart(File file, int i, Collection<T> collection) throws IOException {
    }

    public void handleEnd(Collection<T> collection) throws IOException {
    }

    public void handleFile(File file, int i, Collection<T> collection) throws IOException {
    }

    public boolean handleIsCancelled(File file, int i, Collection<T> collection) throws IOException {
        return false;
    }

    public void handleRestricted(File file, int i, Collection<T> collection) throws IOException {
    }

    public void handleStart(File file, Collection<T> collection) throws IOException {
    }

    public final void walk(File file, Collection<T> collection) throws IOException {
        Objects.requireNonNull(file, "startDirectory");
        try {
            handleStart(file, collection);
            m25429a(file, 0, collection);
            handleEnd(collection);
        } catch (CancelException e) {
            handleCancelled(file, collection, e);
        }
    }

    public DirectoryWalker(FileFilter fileFilter, int i) {
        this.f73229a = fileFilter;
        this.f73230b = i;
    }

    public DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i) {
        if (iOFileFilter == null && iOFileFilter2 == null) {
            this.f73229a = null;
        } else {
            this.f73229a = FileFilterUtils.makeDirectoryOnly(iOFileFilter == null ? TrueFileFilter.TRUE : iOFileFilter).mo25241or(FileFilterUtils.makeFileOnly(iOFileFilter2 == null ? TrueFileFilter.TRUE : iOFileFilter2));
        }
        this.f73230b = i;
    }

    public void handleCancelled(File file, Collection<T> collection, CancelException cancelException) throws IOException {
        throw cancelException;
    }
}
