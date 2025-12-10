package p000;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.p028io.filefilter.AbstractFileFilter;
import org.apache.commons.p028io.filefilter.AndFileFilter;
import org.apache.commons.p028io.filefilter.IOFileFilter;
import org.apache.commons.p028io.filefilter.NotFileFilter;
import org.apache.commons.p028io.filefilter.OrFileFilter;

/* renamed from: X90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class X90 {
    /* renamed from: a */
    public static FileVisitResult m65629a(IOFileFilter iOFileFilter, Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        File file;
        if (path != null) {
            file = path.toFile();
            if (iOFileFilter.accept(file)) {
                z = true;
                return AbstractFileFilter.toDefaultFileVisitResult(z);
            }
        }
        z = false;
        return AbstractFileFilter.toDefaultFileVisitResult(z);
    }

    /* renamed from: b */
    public static IOFileFilter m65628b(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new AndFileFilter(iOFileFilter, iOFileFilter2);
    }

    /* renamed from: c */
    public static boolean m65627c(IOFileFilter iOFileFilter, Path path) {
        FileVisitResult fileVisitResult;
        FileVisitResult accept = iOFileFilter.accept(path, (BasicFileAttributes) null);
        fileVisitResult = FileVisitResult.TERMINATE;
        if (accept != fileVisitResult) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static IOFileFilter m65626d(IOFileFilter iOFileFilter) {
        return new NotFileFilter(iOFileFilter);
    }

    /* renamed from: e */
    public static IOFileFilter m65625e(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new OrFileFilter(iOFileFilter, iOFileFilter2);
    }
}