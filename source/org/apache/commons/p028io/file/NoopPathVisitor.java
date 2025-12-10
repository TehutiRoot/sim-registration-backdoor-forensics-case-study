package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import org.apache.commons.p028io.function.IOBiFunction;

/* renamed from: org.apache.commons.io.file.NoopPathVisitor */
/* loaded from: classes6.dex */
public class NoopPathVisitor extends SimplePathVisitor {
    public static final NoopPathVisitor INSTANCE = new NoopPathVisitor();

    public NoopPathVisitor() {
    }

    public NoopPathVisitor(IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
        super(iOBiFunction);
    }
}
