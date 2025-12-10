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
import org.apache.commons.p028io.FilenameUtils;
import org.apache.commons.p028io.IOCase;
import org.apache.commons.p028io.build.AbstractSupplier;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.filefilter.WildcardFileFilter;

/* renamed from: org.apache.commons.io.filefilter.WildcardFileFilter */
/* loaded from: classes6.dex */
public class WildcardFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase ioCase;
    private final String[] wildcards;

    /* renamed from: org.apache.commons.io.filefilter.WildcardFileFilter$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractSupplier<WildcardFileFilter, Builder> {

        /* renamed from: a */
        public String[] f73402a;

        /* renamed from: b */
        public IOCase f73403b = IOCase.SENSITIVE;

        public Builder setIoCase(IOCase iOCase) {
            this.f73403b = IOCase.value(iOCase, IOCase.SENSITIVE);
            return this;
        }

        public Builder setWildcards(List<String> list) {
            setWildcards((String[]) ((List) WildcardFileFilter.requireWildcards(list)).toArray(IOFileFilter.EMPTY_STRING_ARRAY));
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public WildcardFileFilter get() {
            return new WildcardFileFilter(this.f73403b, this.f73402a);
        }

        public Builder setWildcards(String... strArr) {
            this.f73402a = (String[]) WildcardFileFilter.requireWildcards(strArr);
            return this;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25430a(WildcardFileFilter wildcardFileFilter, String str, String str2) {
        return wildcardFileFilter.lambda$accept$0(str, str2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public /* synthetic */ boolean lambda$accept$0(String str, String str2) {
        return FilenameUtils.wildcardMatch(str, str2, this.ioCase);
    }

    public static <T> T requireWildcards(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
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
        append(this.wildcards, sb);
        sb.append(")");
        return sb.toString();
    }

    private WildcardFileFilter(IOCase iOCase, String... strArr) {
        this.wildcards = (String[]) ((String[]) requireWildcards(strArr)).clone();
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
        of = Stream.of((Object[]) this.wildcards);
        anyMatch = of.anyMatch(new Predicate() { // from class: T42
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return WildcardFileFilter.m25430a(WildcardFileFilter.this, str, (String) obj);
            }
        });
        return anyMatch;
    }

    @Deprecated
    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    @Deprecated
    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        this(iOCase, (String[]) ((List) requireWildcards(list)).toArray(IOFileFilter.EMPTY_STRING_ARRAY));
    }

    @Deprecated
    public WildcardFileFilter(String str) {
        this(IOCase.SENSITIVE, (String) requireWildcards(str));
    }

    @Deprecated
    public WildcardFileFilter(String... strArr) {
        this(IOCase.SENSITIVE, strArr);
    }

    @Deprecated
    public WildcardFileFilter(String str, IOCase iOCase) {
        this(iOCase, str);
    }

    @Deprecated
    public WildcardFileFilter(String[] strArr, IOCase iOCase) {
        this(iOCase, strArr);
    }
}