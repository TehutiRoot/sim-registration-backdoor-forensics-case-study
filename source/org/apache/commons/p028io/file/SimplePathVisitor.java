package org.apache.commons.p028io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Objects;
import java.util.function.BiFunction;
import org.apache.commons.p028io.file.SimplePathVisitor;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOFunction;

/* renamed from: org.apache.commons.io.file.SimplePathVisitor */
/* loaded from: classes6.dex */
public abstract class SimplePathVisitor extends SimpleFileVisitor<Path> implements PathVisitor {

    /* renamed from: a */
    public final IOBiFunction f73306a;

    public SimplePathVisitor() {
        this.f73306a = new IOBiFunction() { // from class: yJ1
            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
                return B90.m68991a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                FileVisitResult m25263b;
                m25263b = SimplePathVisitor.this.m25263b((Path) obj, (IOException) obj2);
                return m25263b;
            }

            @Override // org.apache.commons.p028io.function.IOBiFunction
            public /* synthetic */ BiFunction asBiFunction() {
                return B90.m68990b(this);
            }
        };
    }

    /* renamed from: b */
    public final /* synthetic */ FileVisitResult m25263b(Object obj, IOException iOException) {
        return super.visitFileFailed((SimplePathVisitor) obj, iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return visitFileFailed2(AbstractC21393oI0.m25938a(path), iOException);
    }

    /* renamed from: visitFileFailed  reason: avoid collision after fix types in other method */
    public FileVisitResult visitFileFailed2(Path path, IOException iOException) throws IOException {
        return AbstractC1021OY.m67027a(this.f73306a.apply(path, iOException));
    }

    public SimplePathVisitor(IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
        Objects.requireNonNull(iOBiFunction, "visitFileFailed");
        this.f73306a = iOBiFunction;
    }
}
