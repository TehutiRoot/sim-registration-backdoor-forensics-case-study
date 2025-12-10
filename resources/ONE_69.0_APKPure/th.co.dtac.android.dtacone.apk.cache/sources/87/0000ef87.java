package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Supplier;
import org.apache.commons.p028io.filefilter.HiddenFileFilter;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.HiddenFileFilter */
/* loaded from: classes6.dex */
public class HiddenFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter HIDDEN;
    public static final IOFileFilter VISIBLE;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
        HiddenFileFilter hiddenFileFilter = new HiddenFileFilter();
        HIDDEN = hiddenFileFilter;
        VISIBLE = hiddenFileFilter.negate();
    }

    /* renamed from: a */
    public static /* synthetic */ FileVisitResult m25442a(HiddenFileFilter hiddenFileFilter, Path path) {
        return hiddenFileFilter.lambda$accept$0(path);
    }

    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) throws IOException {
        boolean z;
        boolean isHidden;
        if (path != null) {
            isHidden = Files.isHidden(path);
            if (!isHidden) {
                z = false;
                return toFileVisitResult(z);
            }
        }
        z = true;
        return toFileVisitResult(z);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file == null || file.isHidden();
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, BasicFileAttributes basicFileAttributes) {
        return get(new IOSupplier() { // from class: S70
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return HiddenFileFilter.m25442a(HiddenFileFilter.this, path);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }
}