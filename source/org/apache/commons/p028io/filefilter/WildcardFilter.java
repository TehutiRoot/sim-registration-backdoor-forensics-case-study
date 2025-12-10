package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.FilenameUtils;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.filefilter.WildcardFilter;

@Deprecated
/* renamed from: org.apache.commons.io.filefilter.WildcardFilter */
/* loaded from: classes6.dex */
public class WildcardFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final String[] wildcards;

    public WildcardFilter(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.wildcards = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25239a(Path path, String str) {
        return lambda$accept$2(path, str);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25238b(String str, String str2) {
        return FilenameUtils.wildcardMatch(str, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m25237c(File file, String str) {
        return lambda$accept$0(file, str);
    }

    public static /* synthetic */ boolean lambda$accept$0(File file, String str) {
        return FilenameUtils.wildcardMatch(file.getName(), str);
    }

    public static /* synthetic */ boolean lambda$accept$2(Path path, String str) {
        return FilenameUtils.wildcardMatch(PathUtils.getFileNameString(path), str);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(final File file) {
        Stream of;
        boolean anyMatch;
        if (file.isDirectory()) {
            return false;
        }
        of = Stream.of((Object[]) this.wildcards);
        anyMatch = of.anyMatch(new Predicate() { // from class: X32
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return WildcardFilter.m25237c(file, (String) obj);
            }
        });
        return anyMatch;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, final String str) {
        Stream of;
        boolean anyMatch;
        if (file == null || !new File(file, str).isDirectory()) {
            of = Stream.of((Object[]) this.wildcards);
            anyMatch = of.anyMatch(new Predicate() { // from class: Y32
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return WildcardFilter.m25238b(str, (String) obj);
                }
            });
            return anyMatch;
        }
        return false;
    }

    public WildcardFilter(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.wildcards = new String[]{str};
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        Stream of;
        boolean anyMatch;
        FileVisitResult fileVisitResult;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        of = Stream.of((Object[]) this.wildcards);
        anyMatch = of.anyMatch(new Predicate() { // from class: Z32
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return WildcardFilter.m25239a(path, (String) obj);
            }
        });
        return AbstractFileFilter.toDefaultFileVisitResult(anyMatch);
    }

    public WildcardFilter(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.wildcards = (String[]) strArr.clone();
    }
}
