package org.apache.commons.p028io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: org.apache.commons.io.comparator.ReverseFileComparator */
/* loaded from: classes6.dex */
final class ReverseFileComparator extends AbstractC0495H implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> delegate;

    public ReverseFileComparator(Comparator<File> comparator) {
        Objects.requireNonNull(comparator, "delegate");
        this.delegate = comparator;
    }

    @Override // p000.AbstractC0495H
    public String toString() {
        return super.toString() + "[" + this.delegate.toString() + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }
}
