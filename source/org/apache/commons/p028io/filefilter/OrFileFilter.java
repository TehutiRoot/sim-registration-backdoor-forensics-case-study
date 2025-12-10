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
import org.apache.commons.p028io.filefilter.IOFileFilter;
import org.apache.commons.p028io.filefilter.OrFileFilter;

/* renamed from: org.apache.commons.io.filefilter.OrFileFilter */
/* loaded from: classes6.dex */
public class OrFileFilter extends AbstractFileFilter implements ConditionalFileFilter, Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final List<IOFileFilter> fileFilters;

    public OrFileFilter() {
        this(0);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25249a(Path path, BasicFileAttributes basicFileAttributes, IOFileFilter iOFileFilter) {
        return lambda$accept$2(path, basicFileAttributes, iOFileFilter);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25248b(File file, IOFileFilter iOFileFilter) {
        return iOFileFilter.accept(file);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m25247c(File file, String str, IOFileFilter iOFileFilter) {
        return iOFileFilter.accept(file, str);
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
        boolean anyMatch;
        stream = this.fileFilters.stream();
        anyMatch = stream.anyMatch(new Predicate() { // from class: kg1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return OrFileFilter.m25248b(file, (IOFileFilter) obj);
            }
        });
        return anyMatch;
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
        List<IOFileFilter> list2 = this.fileFilters;
        Objects.requireNonNull(list, "fileFilters");
        list2.addAll(list);
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

    private OrFileFilter(ArrayList<IOFileFilter> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(final File file, final String str) {
        Stream stream;
        boolean anyMatch;
        stream = this.fileFilters.stream();
        anyMatch = stream.anyMatch(new Predicate() { // from class: mg1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return OrFileFilter.m25247c(file, str, (IOFileFilter) obj);
            }
        });
        return anyMatch;
    }

    public void addFileFilter(IOFileFilter... iOFileFilterArr) {
        Stream of;
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        of = Stream.of((Object[]) iOFileFilterArr);
        of.forEach(new Consumer() { // from class: lg1
            {
                OrFileFilter.this = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                OrFileFilter.this.addFileFilter((IOFileFilter) obj);
            }
        });
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, final BasicFileAttributes basicFileAttributes) {
        Stream stream;
        boolean anyMatch;
        stream = this.fileFilters.stream();
        anyMatch = stream.anyMatch(new Predicate() { // from class: ng1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return OrFileFilter.m25249a(path, basicFileAttributes, (IOFileFilter) obj);
            }
        });
        return AbstractFileFilter.toDefaultFileVisitResult(anyMatch);
    }

    private OrFileFilter(int i) {
        this((ArrayList<IOFileFilter>) new ArrayList(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(IOFileFilter... iOFileFilterArr) {
        this(iOFileFilterArr.length);
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        addFileFilter(iOFileFilterArr);
    }

    public OrFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        this(2);
        addFileFilter(iOFileFilter);
        addFileFilter(iOFileFilter2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(List<IOFileFilter> list) {
        this((ArrayList<IOFileFilter>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}
