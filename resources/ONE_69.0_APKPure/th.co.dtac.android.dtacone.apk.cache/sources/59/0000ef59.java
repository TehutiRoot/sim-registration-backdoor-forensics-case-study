package org.apache.commons.p028io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p028io.IOCase;

/* renamed from: org.apache.commons.io.comparator.PathFileComparator */
/* loaded from: classes6.dex */
public class PathFileComparator extends AbstractC0489H implements Serializable {
    public static final Comparator<File> PATH_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_REVERSE;
    public static final Comparator<File> PATH_REVERSE;
    public static final Comparator<File> PATH_SYSTEM_COMPARATOR;
    public static final Comparator<File> PATH_SYSTEM_REVERSE;
    private static final long serialVersionUID = 6527501707585768673L;
    private final IOCase ioCase;

    static {
        PathFileComparator pathFileComparator = new PathFileComparator();
        PATH_COMPARATOR = pathFileComparator;
        PATH_REVERSE = new ReverseFileComparator(pathFileComparator);
        PathFileComparator pathFileComparator2 = new PathFileComparator(IOCase.INSENSITIVE);
        PATH_INSENSITIVE_COMPARATOR = pathFileComparator2;
        PATH_INSENSITIVE_REVERSE = new ReverseFileComparator(pathFileComparator2);
        PathFileComparator pathFileComparator3 = new PathFileComparator(IOCase.SYSTEM);
        PATH_SYSTEM_COMPARATOR = pathFileComparator3;
        PATH_SYSTEM_REVERSE = new ReverseFileComparator(pathFileComparator3);
    }

    public PathFileComparator() {
        this.ioCase = IOCase.SENSITIVE;
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort(list);
    }

    @Override // p000.AbstractC0489H
    public String toString() {
        return super.toString() + "[ioCase=" + this.ioCase + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.ioCase.checkCompareTo(file.getPath(), file2.getPath());
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public PathFileComparator(IOCase iOCase) {
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }
}