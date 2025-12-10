package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.IOCase;
import org.apache.commons.p028io.filefilter.IOFileFilter;

/* renamed from: org.apache.commons.io.filefilter.FileFilterUtils */
/* loaded from: classes6.dex */
public class FileFilterUtils {

    /* renamed from: a */
    public static final IOFileFilter f73313a = notFileFilter(and(directoryFileFilter(), nameFileFilter("CVS")));

    /* renamed from: b */
    public static final IOFileFilter f73314b = notFileFilter(and(directoryFileFilter(), nameFileFilter(".svn")));

    /* renamed from: a */
    public static Object m25254a(final IOFileFilter iOFileFilter, Stream stream, Collector collector) {
        Stream filter;
        Object collect;
        Stream empty;
        Object collect2;
        Objects.requireNonNull(iOFileFilter, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            empty = Stream.empty();
            collect2 = empty.collect(collector);
            return collect2;
        }
        filter = stream.filter(new Predicate() { // from class: fX
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return iOFileFilter.accept((File) obj);
            }
        });
        collect = filter.collect(collector);
        return collect;
    }

    public static IOFileFilter ageFileFilter(Date date) {
        return new AgeFileFilter(date);
    }

    public static IOFileFilter and(IOFileFilter... iOFileFilterArr) {
        return new AndFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter andFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new AndFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter asFileFilter(FileFilter fileFilter) {
        return new DelegateFileFilter(fileFilter);
    }

    public static IOFileFilter directoryFileFilter() {
        return DirectoryFileFilter.DIRECTORY;
    }

    public static IOFileFilter falseFileFilter() {
        return FalseFileFilter.FALSE;
    }

    public static IOFileFilter fileFileFilter() {
        return FileFileFilter.INSTANCE;
    }

    public static File[] filter(IOFileFilter iOFileFilter, File... fileArr) {
        Stream of;
        Collector list;
        Objects.requireNonNull(iOFileFilter, "filter");
        if (fileArr != null) {
            of = Stream.of((Object[]) fileArr);
            list = Collectors.toList();
            return (File[]) ((List) m25254a(iOFileFilter, of, list)).toArray(FileUtils.EMPTY_FILE_ARRAY);
        }
        return FileUtils.EMPTY_FILE_ARRAY;
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, File... fileArr) {
        return Arrays.asList(filter(iOFileFilter, fileArr));
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, File... fileArr) {
        return new HashSet(Arrays.asList(filter(iOFileFilter, fileArr)));
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr) {
        return new MagicNumberFileFilter(bArr);
    }

    public static IOFileFilter makeCVSAware(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return f73313a;
        }
        return and(iOFileFilter, f73313a);
    }

    public static IOFileFilter makeDirectoryOnly(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return DirectoryFileFilter.DIRECTORY;
        }
        return DirectoryFileFilter.DIRECTORY.and(iOFileFilter);
    }

    public static IOFileFilter makeFileOnly(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return FileFileFilter.INSTANCE;
        }
        return FileFileFilter.INSTANCE.and(iOFileFilter);
    }

    public static IOFileFilter makeSVNAware(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return f73314b;
        }
        return and(iOFileFilter, f73314b);
    }

    public static IOFileFilter nameFileFilter(String str) {
        return new NameFileFilter(str);
    }

    public static IOFileFilter notFileFilter(IOFileFilter iOFileFilter) {
        return iOFileFilter.negate();
    }

    /* renamed from: or */
    public static IOFileFilter m25253or(IOFileFilter... iOFileFilterArr) {
        return new OrFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter orFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new OrFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter prefixFileFilter(String str) {
        return new PrefixFileFilter(str);
    }

    public static IOFileFilter sizeFileFilter(long j) {
        return new SizeFileFilter(j);
    }

    public static IOFileFilter sizeRangeFileFilter(long j, long j2) {
        return new SizeFileFilter(j, true).and(new SizeFileFilter(j2 + 1, false));
    }

    public static IOFileFilter suffixFileFilter(String str) {
        return new SuffixFileFilter(str);
    }

    public static List<IOFileFilter> toList(IOFileFilter... iOFileFilterArr) {
        Stream of;
        Stream map;
        Collector list;
        Object collect;
        Objects.requireNonNull(iOFileFilterArr, "filters");
        of = Stream.of((Object[]) iOFileFilterArr);
        map = of.map(new Function() { // from class: eX
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                IOFileFilter iOFileFilter = (IOFileFilter) obj;
                Objects.requireNonNull(iOFileFilter);
                return iOFileFilter;
            }
        });
        list = Collectors.toList();
        collect = map.collect(list);
        return (List) collect;
    }

    public static IOFileFilter trueFileFilter() {
        return TrueFileFilter.TRUE;
    }

    public static IOFileFilter ageFileFilter(Date date, boolean z) {
        return new AgeFileFilter(date, z);
    }

    public static IOFileFilter asFileFilter(FilenameFilter filenameFilter) {
        return new DelegateFileFilter(filenameFilter);
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        Spliterator spliterator;
        Stream stream;
        Collector list;
        if (iterable != null) {
            spliterator = iterable.spliterator();
            stream = StreamSupport.stream(spliterator, false);
            list = Collectors.toList();
            return (List) m25254a(iOFileFilter, stream, list);
        }
        return Collections.emptyList();
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        Spliterator spliterator;
        Stream stream;
        Collector set;
        if (iterable != null) {
            spliterator = iterable.spliterator();
            stream = StreamSupport.stream(spliterator, false);
            set = Collectors.toSet();
            return (Set) m25254a(iOFileFilter, stream, set);
        }
        return Collections.emptySet();
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr, long j) {
        return new MagicNumberFileFilter(bArr, j);
    }

    public static IOFileFilter nameFileFilter(String str, IOCase iOCase) {
        return new NameFileFilter(str, iOCase);
    }

    public static IOFileFilter prefixFileFilter(String str, IOCase iOCase) {
        return new PrefixFileFilter(str, iOCase);
    }

    public static IOFileFilter sizeFileFilter(long j, boolean z) {
        return new SizeFileFilter(j, z);
    }

    public static IOFileFilter suffixFileFilter(String str, IOCase iOCase) {
        return new SuffixFileFilter(str, iOCase);
    }

    public static IOFileFilter ageFileFilter(File file) {
        return new AgeFileFilter(file);
    }

    public static IOFileFilter magicNumberFileFilter(String str) {
        return new MagicNumberFileFilter(str);
    }

    public static IOFileFilter ageFileFilter(File file, boolean z) {
        return new AgeFileFilter(file, z);
    }

    public static File[] filter(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return (File[]) filterList(iOFileFilter, iterable).toArray(FileUtils.EMPTY_FILE_ARRAY);
    }

    public static IOFileFilter magicNumberFileFilter(String str, long j) {
        return new MagicNumberFileFilter(str, j);
    }

    public static IOFileFilter ageFileFilter(long j) {
        return new AgeFileFilter(j);
    }

    public static IOFileFilter ageFileFilter(long j, boolean z) {
        return new AgeFileFilter(j, z);
    }
}
