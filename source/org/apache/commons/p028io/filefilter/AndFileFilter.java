package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.filefilter.AndFileFilter;
import org.apache.commons.p028io.filefilter.IOFileFilter;

/* renamed from: org.apache.commons.io.filefilter.AndFileFilter */
/* loaded from: classes6.dex */
public class AndFileFilter extends AbstractFileFilter implements ConditionalFileFilter, Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    private final List<IOFileFilter> fileFilters;

    public AndFileFilter() {
        this(0);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25258a(File file, String str, IOFileFilter iOFileFilter) {
        return iOFileFilter.accept(file, str);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25257b(Path path, BasicFileAttributes basicFileAttributes, IOFileFilter iOFileFilter) {
        return lambda$accept$2(path, basicFileAttributes, iOFileFilter);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m25256c(File file, IOFileFilter iOFileFilter) {
        return iOFileFilter.accept(file);
    }

    private boolean isEmpty() {
        return this.fileFilters.isEmpty();
    }

    public static /* synthetic */ boolean lambda$accept$2(Path path, BasicFileAttributes basicFileAttributes, IOFileFilter iOFileFilter) {
        FileVisitResult fileVisitResult;
        FileVisitResult accept = iOFileFilter.accept(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (accept == fileVisitResult) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(final File file) {
        Stream stream;
        boolean allMatch;
        if (!isEmpty()) {
            stream = this.fileFilters.stream();
            allMatch = stream.allMatch(new Predicate() { // from class: P2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return AndFileFilter.m25256c(file, (IOFileFilter) obj);
                }
            });
            if (allMatch) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.ConditionalFileFilter
    public void addFileFilter(IOFileFilter iOFileFilter) {
        List<IOFileFilter> list = this.fileFilters;
        Objects.requireNonNull(iOFileFilter, "fileFilter");
        list.add(iOFileFilter);
    }

    @Override // org.apache.commons.p028io.filefilter.ConditionalFileFilter
    public List<IOFileFilter> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    @Override // org.apache.commons.p028io.filefilter.ConditionalFileFilter
    public boolean removeFileFilter(IOFileFilter iOFileFilter) {
        return this.fileFilters.remove(iOFileFilter);
    }

    @Override // org.apache.commons.p028io.filefilter.ConditionalFileFilter
    public void setFileFilters(List<IOFileFilter> list) {
        this.fileFilters.clear();
        this.fileFilters.addAll(list);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.fileFilters, sb);
        sb.append(")");
        return sb.toString();
    }

    private AndFileFilter(ArrayList<IOFileFilter> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(final File file, final String str) {
        Stream stream;
        boolean allMatch;
        if (!isEmpty()) {
            stream = this.fileFilters.stream();
            allMatch = stream.allMatch(new Predicate() { // from class: Q2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return AndFileFilter.m25258a(file, str, (IOFileFilter) obj);
                }
            });
            if (allMatch) {
                return true;
            }
        }
        return false;
    }

    public void addFileFilter(IOFileFilter... iOFileFilterArr) {
        Stream of;
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        of = Stream.of((Object[]) iOFileFilterArr);
        of.forEach(new Consumer() { // from class: O2
            {
                AndFileFilter.this = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AndFileFilter.this.addFileFilter((IOFileFilter) obj);
            }
        });
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, final BasicFileAttributes basicFileAttributes) {
        Stream stream;
        boolean allMatch;
        FileVisitResult fileVisitResult;
        if (isEmpty()) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        stream = this.fileFilters.stream();
        allMatch = stream.allMatch(new Predicate() { // from class: N2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AndFileFilter.m25257b(path, basicFileAttributes, (IOFileFilter) obj);
            }
        });
        return AbstractFileFilter.toDefaultFileVisitResult(allMatch);
    }

    private AndFileFilter(int i) {
        this((ArrayList<IOFileFilter>) new ArrayList(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(IOFileFilter... iOFileFilterArr) {
        this(iOFileFilterArr.length);
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        addFileFilter(iOFileFilterArr);
    }

    public AndFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        this(2);
        addFileFilter(iOFileFilter);
        addFileFilter(iOFileFilter2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(List<IOFileFilter> list) {
        this((ArrayList<IOFileFilter>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}
