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
import org.apache.commons.p028io.filefilter.SuffixFileFilter;

/* renamed from: org.apache.commons.io.filefilter.SuffixFileFilter */
/* loaded from: classes6.dex */
public class SuffixFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    private final IOCase ioCase;
    private final String[] suffixes;

    public SuffixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25432a(SuffixFileFilter suffixFileFilter, String str, String str2) {
        return suffixFileFilter.lambda$accept$0(str, str2);
    }

    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return this.ioCase.checkEndsWith(str, str2);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getName());
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.suffixes, sb);
        sb.append(")");
        return sb.toString();
    }

    public SuffixFileFilter(List<String> list, IOCase iOCase) {
        Objects.requireNonNull(list, "suffixes");
        this.suffixes = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(str);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return toFileVisitResult(accept(PathUtils.getFileNameString(path)));
    }

    private boolean accept(final String str) {
        Stream of;
        boolean anyMatch;
        of = Stream.of((Object[]) this.suffixes);
        anyMatch = of.anyMatch(new Predicate() { // from class: QP1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SuffixFileFilter.m25432a(SuffixFileFilter.this, str, (String) obj);
            }
        });
        return anyMatch;
    }

    public SuffixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String str, IOCase iOCase) {
        Objects.requireNonNull(str, "suffix");
        this.suffixes = new String[]{str};
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String[] strArr, IOCase iOCase) {
        Objects.requireNonNull(strArr, "suffixes");
        this.suffixes = (String[]) strArr.clone();
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }
}