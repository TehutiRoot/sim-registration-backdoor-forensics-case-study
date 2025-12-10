package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Objects;

/* renamed from: org.apache.commons.io.filefilter.PathMatcherFileFilter */
/* loaded from: classes6.dex */
public class PathMatcherFileFilter extends AbstractFileFilter {

    /* renamed from: a */
    public final PathMatcher f73400a;

    public PathMatcherFileFilter(PathMatcher pathMatcher) {
        Objects.requireNonNull(pathMatcher, "pathMatcher");
        this.f73400a = AbstractC18479Si1.m66455a(pathMatcher);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (file != null) {
            path = file.toPath();
            if (matches(path)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public boolean matches(Path path) {
        boolean matches;
        matches = this.f73400a.matches(path);
        return matches;
    }
}