package org.apache.commons.p028io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Date;
import java.util.function.Supplier;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.filefilter.AgeFileFilter;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: org.apache.commons.io.filefilter.AgeFileFilter */
/* loaded from: classes6.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final Instant cutoffInstant;

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$accept$0(Path path) throws IOException {
        boolean z = false;
        if (this.acceptOlder != PathUtils.isNewer(path, this.cutoffInstant, new LinkOption[0])) {
            z = true;
        }
        return toFileVisitResult(z);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return this.acceptOlder != FileUtils.isFileNewer(file, this.cutoffInstant);
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter
    public String toString() {
        String str;
        if (this.acceptOlder) {
            str = "<=";
        } else {
            str = ">";
        }
        return super.toString() + "(" + str + this.cutoffInstant + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AgeFileFilter(java.util.Date r1, boolean r2) {
        /*
            r0 = this;
            java.time.Instant r1 = p000.F70.m68513a(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.filefilter.AgeFileFilter.<init>(java.util.Date, boolean):void");
    }

    @Override // org.apache.commons.p028io.filefilter.AbstractFileFilter, org.apache.commons.p028io.filefilter.IOFileFilter, org.apache.commons.p028io.file.PathFilter
    public FileVisitResult accept(final Path path, BasicFileAttributes basicFileAttributes) {
        return get(new IOSupplier() { // from class: y2
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                FileVisitResult lambda$accept$0;
                lambda$accept$0 = AgeFileFilter.this.lambda$accept$0(path);
                return lambda$accept$0;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z) {
        this(FileUtils.lastModifiedUnchecked(file), z);
    }

    public AgeFileFilter(Instant instant) {
        this(instant, true);
    }

    public AgeFileFilter(Instant instant, boolean z) {
        this.acceptOlder = z;
        this.cutoffInstant = instant;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AgeFileFilter(long r1) {
        /*
            r0 = this;
            java.time.Instant r1 = p000.AbstractC5372bh.m51897a(r1)
            r2 = 1
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.filefilter.AgeFileFilter.<init>(long):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AgeFileFilter(long r1, boolean r3) {
        /*
            r0 = this;
            java.time.Instant r1 = p000.AbstractC5372bh.m51897a(r1)
            r0.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.filefilter.AgeFileFilter.<init>(long, boolean):void");
    }
}