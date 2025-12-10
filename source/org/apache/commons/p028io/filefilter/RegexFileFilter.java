package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.p028io.IOCase;

/* renamed from: org.apache.commons.io.filefilter.RegexFileFilter */
/* loaded from: classes6.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern) {
        this(pattern, AbstractC17888Jt1.m67672a(new C18016Lt1()));
    }

    private static Pattern compile(String str, int i) {
        Objects.requireNonNull(str, "pattern");
        return Pattern.compile(str, i);
    }

    private static int toFlags(IOCase iOCase) {
        if (IOCase.isCaseSensitive(iOCase)) {
            return 0;
        }
        return 2;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        return "RegexFileFilter [pattern=" + this.pattern + "]";
    }

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        Objects.requireNonNull(pattern, "pattern");
        this.pattern = pattern;
        this.pathToString = function == null ? new Function() { // from class: Kt1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Objects.toString((Path) obj);
            }
        } : function;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        Object apply;
        apply = this.pathToString.apply(path);
        String str = (String) apply;
        return toFileVisitResult(str != null && this.pattern.matcher(str).matches());
    }

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i) {
        this(compile(str, i));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }
}
