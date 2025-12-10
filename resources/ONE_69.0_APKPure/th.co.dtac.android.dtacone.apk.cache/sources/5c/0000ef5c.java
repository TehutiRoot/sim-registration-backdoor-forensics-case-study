package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.p028io.file.Counters;
import org.apache.commons.p028io.function.IOBiFunction;

/* renamed from: org.apache.commons.io.file.AccumulatorPathVisitor */
/* loaded from: classes6.dex */
public class AccumulatorPathVisitor extends CountingPathVisitor {

    /* renamed from: f */
    public final List f73362f;

    /* renamed from: g */
    public final List f73363g;

    public AccumulatorPathVisitor() {
        super(Counters.noopPathCounters());
        this.f73362f = new ArrayList();
        this.f73363g = new ArrayList();
    }

    public static AccumulatorPathVisitor withBigIntegerCounters() {
        return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static AccumulatorPathVisitor withLongCounters() {
        return new AccumulatorPathVisitor(Counters.longPathCounters());
    }

    /* renamed from: e */
    public final void m25488e(List list, Path path) {
        Path normalize;
        normalize = path.normalize();
        list.add(normalize);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof AccumulatorPathVisitor)) {
            return false;
        }
        AccumulatorPathVisitor accumulatorPathVisitor = (AccumulatorPathVisitor) obj;
        if (Objects.equals(this.f73362f, accumulatorPathVisitor.f73362f) && Objects.equals(this.f73363g, accumulatorPathVisitor.f73363g)) {
            return true;
        }
        return false;
    }

    public List<Path> getDirList() {
        return new ArrayList(this.f73362f);
    }

    public List<Path> getFileList() {
        return new ArrayList(this.f73363g);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(this.f73362f, this.f73363g);
    }

    public List<Path> relativizeDirectories(Path path, boolean z, Comparator<? super Path> comparator) {
        return PathUtils.m25461t(getDirList(), path, z, comparator);
    }

    public List<Path> relativizeFiles(Path path, boolean z, Comparator<? super Path> comparator) {
        return PathUtils.m25461t(getFileList(), path, z, comparator);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public void updateDirCounter(Path path, IOException iOException) {
        super.updateDirCounter(path, iOException);
        m25488e(this.f73362f, path);
    }

    @Override // org.apache.commons.p028io.file.CountingPathVisitor
    public void updateFileCounters(Path path, BasicFileAttributes basicFileAttributes) {
        super.updateFileCounters(path, basicFileAttributes);
        m25488e(this.f73363g, path);
    }

    public static AccumulatorPathVisitor withBigIntegerCounters(PathFilter pathFilter, PathFilter pathFilter2) {
        return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters(), pathFilter, pathFilter2);
    }

    public static AccumulatorPathVisitor withLongCounters(PathFilter pathFilter, PathFilter pathFilter2) {
        return new AccumulatorPathVisitor(Counters.longPathCounters(), pathFilter, pathFilter2);
    }

    public AccumulatorPathVisitor(Counters.PathCounters pathCounters) {
        super(pathCounters);
        this.f73362f = new ArrayList();
        this.f73363g = new ArrayList();
    }

    public AccumulatorPathVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2) {
        super(pathCounters, pathFilter, pathFilter2);
        this.f73362f = new ArrayList();
        this.f73363g = new ArrayList();
    }

    public AccumulatorPathVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2, IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
        super(pathCounters, pathFilter, pathFilter2, iOBiFunction);
        this.f73362f = new ArrayList();
        this.f73363g = new ArrayList();
    }
}