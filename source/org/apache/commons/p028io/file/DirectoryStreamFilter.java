package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.Objects;

/* renamed from: org.apache.commons.io.file.DirectoryStreamFilter */
/* loaded from: classes6.dex */
public class DirectoryStreamFilter implements DirectoryStream.Filter<Path> {

    /* renamed from: a */
    public final PathFilter f73299a;

    public DirectoryStreamFilter(PathFilter pathFilter) {
        Objects.requireNonNull(pathFilter, "pathFilter");
        this.f73299a = pathFilter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public /* bridge */ /* synthetic */ boolean accept(Path path) throws IOException {
        return accept2(AbstractC21393oI0.m25938a(path));
    }

    public PathFilter getPathFilter() {
        return this.f73299a;
    }

    /* renamed from: accept  reason: avoid collision after fix types in other method */
    public boolean accept2(Path path) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult accept = this.f73299a.accept(path, PathUtils.readBasicFileAttributes(path, PathUtils.EMPTY_LINK_OPTION_ARRAY));
        fileVisitResult = FileVisitResult.CONTINUE;
        return accept == fileVisitResult;
    }
}
