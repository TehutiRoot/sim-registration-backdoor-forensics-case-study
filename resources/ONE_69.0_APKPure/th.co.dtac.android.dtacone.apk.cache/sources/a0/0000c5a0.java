package p000;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.path.LinkFollowing;

/* renamed from: eJ */
/* loaded from: classes5.dex */
public final class C10137eJ extends SimpleFileVisitor {

    /* renamed from: a */
    public final boolean f61535a;

    /* renamed from: b */
    public C18609Ui1 f61536b;

    /* renamed from: c */
    public ArrayDeque f61537c = new ArrayDeque();

    public C10137eJ(boolean z) {
        this.f61535a = z;
    }

    /* renamed from: a */
    public FileVisitResult m31729a(Path dir, BasicFileAttributes attrs) {
        Object fileKey;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        fileKey = attrs.fileKey();
        this.f61537c.add(new C18609Ui1(dir, fileKey, this.f61536b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    /* renamed from: b */
    public final List m31728b(C18609Ui1 directoryNode) {
        Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.f61536b = directoryNode;
        Files.walkFileTree(directoryNode.m66102d(), LinkFollowing.INSTANCE.toVisitOptions(this.f61535a), 1, AbstractC5345bJ.m51963a(this));
        this.f61537c.removeFirst();
        ArrayDeque arrayDeque = this.f61537c;
        this.f61537c = new ArrayDeque();
        return arrayDeque;
    }

    /* renamed from: c */
    public FileVisitResult m31727c(Path file, BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f61537c.add(new C18609Ui1(file, null, this.f61536b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(visitFile, "visitFile(...)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return m31729a(AbstractC22491uI0.m1223a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return m31727c(AbstractC22491uI0.m1223a(obj), basicFileAttributes);
    }
}