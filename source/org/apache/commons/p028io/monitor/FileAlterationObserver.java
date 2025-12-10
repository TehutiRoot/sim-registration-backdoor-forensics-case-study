package org.apache.commons.p028io.monitor;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.IOCase;
import org.apache.commons.p028io.build.AbstractOriginSupplier;
import org.apache.commons.p028io.comparator.NameFileComparator;
import org.apache.commons.p028io.filefilter.TrueFileFilter;
import org.apache.commons.p028io.monitor.FileAlterationListener;
import org.apache.commons.p028io.monitor.FileAlterationObserver;
import org.apache.commons.p028io.monitor.FileEntry;

/* renamed from: org.apache.commons.io.monitor.FileAlterationObserver */
/* loaded from: classes6.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final transient FileFilter fileFilter;
    private final transient List<FileAlterationListener> listeners;
    private final FileEntry rootEntry;

    /* renamed from: org.apache.commons.io.monitor.FileAlterationObserver$Builder */
    /* loaded from: classes6.dex */
    public static final class Builder extends AbstractOriginSupplier<FileAlterationObserver, Builder> {

        /* renamed from: b */
        public FileEntry f73534b;

        /* renamed from: c */
        public FileFilter f73535c;

        /* renamed from: d */
        public IOCase f73536d;

        public /* synthetic */ Builder(C12543a c12543a) {
            this();
        }

        public Builder setFileFilter(FileFilter fileFilter) {
            this.f73535c = fileFilter;
            return (Builder) asThis();
        }

        public Builder setIOCase(IOCase iOCase) {
            this.f73536d = iOCase;
            return (Builder) asThis();
        }

        public Builder setRootEntry(FileEntry fileEntry) {
            this.f73534b = fileEntry;
            return (Builder) asThis();
        }

        public Builder() {
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public FileAlterationObserver get() throws IOException {
            FileEntry fileEntry = this.f73534b;
            if (fileEntry == null) {
                fileEntry = new FileEntry(checkOrigin().getFile());
            }
            return new FileAlterationObserver(fileEntry, this.f73535c, FileAlterationObserver.toComparator(this.f73536d), null);
        }
    }

    /* renamed from: org.apache.commons.io.monitor.FileAlterationObserver$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12543a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73537a;

        static {
            int[] iArr = new int[IOCase.values().length];
            f73537a = iArr;
            try {
                iArr[IOCase.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73537a[IOCase.INSENSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public /* synthetic */ FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, Comparator comparator, C12543a c12543a) {
        this(fileEntry, fileFilter, comparator);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    private void checkAndFire(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2;
        if (fileArr.length > 0) {
            fileEntryArr2 = new FileEntry[fileArr.length];
        } else {
            fileEntryArr2 = FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        }
        int i = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i]) > 0) {
                FileEntry lambda$listFileEntries$5 = lambda$listFileEntries$5(fileEntry, fileArr[i]);
                fileEntryArr2[i] = lambda$listFileEntries$5;
                fireOnCreate(lambda$listFileEntries$5);
                i++;
            }
            if (i < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i]) == 0) {
                fireOnChange(fileEntry2, fileArr[i]);
                checkAndFire(fileEntry2, fileEntry2.getChildren(), listFiles(fileArr[i]));
                fileEntryArr2[i] = fileEntry2;
                i++;
            } else {
                checkAndFire(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                fireOnDelete(fileEntry2);
            }
        }
        while (i < fileArr.length) {
            FileEntry lambda$listFileEntries$52 = lambda$listFileEntries$5(fileEntry, fileArr[i]);
            fileEntryArr2[i] = lambda$listFileEntries$52;
            fireOnCreate(lambda$listFileEntries$52);
            i++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }

    /* renamed from: createFileEntry */
    public FileEntry lambda$listFileEntries$5(FileEntry fileEntry, File file) {
        FileEntry newChildInstance = fileEntry.newChildInstance(file);
        newChildInstance.refresh(file);
        newChildInstance.setChildren(listFileEntries(file, newChildInstance));
        return newChildInstance;
    }

    private void fireOnChange(final FileEntry fileEntry, final File file) {
        if (fileEntry.refresh(file)) {
            this.listeners.forEach(new Consumer() { // from class: oW
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileAlterationObserver.lambda$fireOnChange$2(FileEntry.this, file, (FileAlterationListener) obj);
                }
            });
        }
    }

    public void fireOnCreate(final FileEntry fileEntry) {
        Stream of;
        this.listeners.forEach(new Consumer() { // from class: rW
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.lambda$fireOnCreate$3(FileEntry.this, (FileAlterationListener) obj);
            }
        });
        of = Stream.of((Object[]) fileEntry.getChildren());
        of.forEach(new Consumer() { // from class: sW
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.this.fireOnCreate((FileEntry) obj);
            }
        });
    }

    private void fireOnDelete(final FileEntry fileEntry) {
        this.listeners.forEach(new Consumer() { // from class: vW
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.lambda$fireOnDelete$4(FileEntry.this, (FileAlterationListener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$checkAndNotify$0(FileAlterationListener fileAlterationListener) {
        fileAlterationListener.onStart(this);
    }

    public /* synthetic */ void lambda$checkAndNotify$1(FileAlterationListener fileAlterationListener) {
        fileAlterationListener.onStop(this);
    }

    public static /* synthetic */ void lambda$fireOnChange$2(FileEntry fileEntry, File file, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryChange(file);
        } else {
            fileAlterationListener.onFileChange(file);
        }
    }

    public static /* synthetic */ void lambda$fireOnCreate$3(FileEntry fileEntry, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryCreate(fileEntry.getFile());
        } else {
            fileAlterationListener.onFileCreate(fileEntry.getFile());
        }
    }

    public static /* synthetic */ void lambda$fireOnDelete$4(FileEntry fileEntry, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryDelete(fileEntry.getFile());
        } else {
            fileAlterationListener.onFileDelete(fileEntry.getFile());
        }
    }

    public static /* synthetic */ FileEntry[] lambda$listFileEntries$6(int i) {
        return new FileEntry[i];
    }

    private FileEntry[] listFileEntries(File file, final FileEntry fileEntry) {
        Stream of;
        Stream map;
        Object[] array;
        of = Stream.of((Object[]) listFiles(file));
        map = of.map(new Function() { // from class: pW
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                FileEntry lambda$listFileEntries$5;
                lambda$listFileEntries$5 = FileAlterationObserver.this.lambda$listFileEntries$5(fileEntry, (File) obj);
                return lambda$listFileEntries$5;
            }
        });
        array = map.toArray(new IntFunction() { // from class: qW
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                FileEntry[] lambda$listFileEntries$6;
                lambda$listFileEntries$6 = FileAlterationObserver.lambda$listFileEntries$6(i);
                return lambda$listFileEntries$6;
            }
        });
        return (FileEntry[]) array;
    }

    private File[] listFiles(File file) {
        if (file.isDirectory()) {
            return sort(file.listFiles(this.fileFilter));
        }
        return FileUtils.EMPTY_FILE_ARRAY;
    }

    private File[] sort(File[] fileArr) {
        if (fileArr == null) {
            return FileUtils.EMPTY_FILE_ARRAY;
        }
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, this.comparator);
        }
        return fileArr;
    }

    public static Comparator<File> toComparator(IOCase iOCase) {
        int i = C12543a.f73537a[IOCase.value(iOCase, IOCase.SYSTEM).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return NameFileComparator.NAME_COMPARATOR;
            }
            return NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
        }
        return NameFileComparator.NAME_SYSTEM_COMPARATOR;
    }

    public void addListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.listeners.add(fileAlterationListener);
        }
    }

    public void checkAndNotify() {
        this.listeners.forEach(new Consumer() { // from class: tW
            {
                FileAlterationObserver.this = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.this.lambda$checkAndNotify$0((FileAlterationListener) obj);
            }
        });
        File file = this.rootEntry.getFile();
        if (file.exists()) {
            FileEntry fileEntry = this.rootEntry;
            checkAndFire(fileEntry, fileEntry.getChildren(), listFiles(file));
        } else if (this.rootEntry.isExists()) {
            FileEntry fileEntry2 = this.rootEntry;
            checkAndFire(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        this.listeners.forEach(new Consumer() { // from class: uW
            {
                FileAlterationObserver.this = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.this.lambda$checkAndNotify$1((FileAlterationListener) obj);
            }
        });
    }

    public void destroy() throws Exception {
    }

    public Comparator<File> getComparator() {
        return this.comparator;
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<FileAlterationListener> getListeners() {
        return new ArrayList(this.listeners);
    }

    public void initialize() throws Exception {
        FileEntry fileEntry = this.rootEntry;
        fileEntry.refresh(fileEntry.getFile());
        FileEntry fileEntry2 = this.rootEntry;
        fileEntry2.setChildren(listFileEntries(fileEntry2.getFile(), this.rootEntry));
    }

    public void removeListener(final FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.listeners.removeIf(new Predicate() { // from class: nW
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean equals;
                    equals = fileAlterationListener.equals((FileAlterationListener) obj);
                    return equals;
                }
            });
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "[file='" + getDirectory().getPath() + CoreConstants.SINGLE_QUOTE_CHAR + ", " + this.fileFilter.toString() + ", listeners=" + this.listeners.size() + "]";
    }

    @Deprecated
    public FileAlterationObserver(File file) {
        this(file, (FileFilter) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter) {
        this(file, fileFilter, (IOCase) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter, IOCase iOCase) {
        this(new FileEntry(file), fileFilter, iOCase);
    }

    private FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, Comparator<File> comparator) {
        this.listeners = new CopyOnWriteArrayList();
        Objects.requireNonNull(fileEntry, "rootEntry");
        Objects.requireNonNull(fileEntry.getFile(), "rootEntry.getFile()");
        this.rootEntry = fileEntry;
        this.fileFilter = fileFilter == null ? TrueFileFilter.INSTANCE : fileFilter;
        Objects.requireNonNull(comparator, "comparator");
        this.comparator = comparator;
    }

    public FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
        this(fileEntry, fileFilter, toComparator(iOCase));
    }

    @Deprecated
    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter, IOCase iOCase) {
        this(new File(str), fileFilter, iOCase);
    }
}
