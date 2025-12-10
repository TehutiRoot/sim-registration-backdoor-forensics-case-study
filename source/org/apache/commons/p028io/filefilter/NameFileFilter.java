package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOCase;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.filefilter.NameFileFilter;

/* renamed from: org.apache.commons.io.filefilter.NameFileFilter */
/* loaded from: classes6.dex */
public class NameFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final IOCase ioCase;
    private final String[] names;

    public NameFileFilter(List<String> list) {
        this(list, (IOCase) null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25250a(NameFileFilter nameFileFilter, String str, String str2) {
        return nameFileFilter.lambda$acceptBaseName$0(str, str2);
    }

    private boolean acceptBaseName(final String str) {
        Stream of;
        boolean anyMatch;
        of = Stream.of((Object[]) this.names);
        anyMatch = of.anyMatch(new Predicate() { // from class: MG0
            {
                NameFileFilter.this = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NameFileFilter.m25250a(NameFileFilter.this, str, (String) obj);
            }
        });
        return anyMatch;
    }

    public /* synthetic */ boolean lambda$acceptBaseName$0(String str, String str2) {
        return this.ioCase.checkEquals(str, str2);
    }

    private IOCase toIOCase(IOCase iOCase) {
        return IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file != null && acceptBaseName(file.getName());
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.names, sb);
        sb.append(")");
        return sb.toString();
    }

    public NameFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "names");
        this.names = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.ioCase = toIOCase(iOCase);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return acceptBaseName(str);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(acceptBaseName(PathUtils.getFileNameString(path)));
    }

    public NameFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public NameFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public NameFileFilter(String str, IOCase iOCase) {
        Objects.requireNonNull(str, "name");
        this.names = new String[]{str};
        this.ioCase = toIOCase(iOCase);
    }

    public NameFileFilter(String[] strArr, IOCase iOCase) {
        Objects.requireNonNull(strArr, "names");
        this.names = (String[]) strArr.clone();
        this.ioCase = toIOCase(iOCase);
    }
}
