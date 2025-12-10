package org.apache.commons.p028io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p028io.FileUtils;

/* renamed from: org.apache.commons.io.comparator.LastModifiedFileComparator */
/* loaded from: classes6.dex */
public class LastModifiedFileComparator extends AbstractC0489H implements Serializable {
    public static final Comparator<File> LASTMODIFIED_COMPARATOR;
    public static final Comparator<File> LASTMODIFIED_REVERSE;
    private static final long serialVersionUID = 7372168004395734046L;

    static {
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        LASTMODIFIED_COMPARATOR = lastModifiedFileComparator;
        LASTMODIFIED_REVERSE = new ReverseFileComparator(lastModifiedFileComparator);
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort(list);
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        int i = ((FileUtils.lastModifiedUnchecked(file) - FileUtils.lastModifiedUnchecked(file2)) > 0L ? 1 : ((FileUtils.lastModifiedUnchecked(file) - FileUtils.lastModifiedUnchecked(file2)) == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }
}