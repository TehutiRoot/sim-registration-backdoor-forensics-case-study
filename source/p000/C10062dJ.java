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

/* renamed from: dJ */
/* loaded from: classes5.dex */
public final class C10062dJ extends SimpleFileVisitor {

    /* renamed from: a */
    public final boolean f61131a;

    /* renamed from: b */
    public C18755Xh1 f61132b;

    /* renamed from: c */
    public ArrayDeque f61133c = new ArrayDeque();

    public C10062dJ(boolean z) {
        this.f61131a = z;
    }

    /* renamed from: a */
    public FileVisitResult m31910a(Path dir, BasicFileAttributes attrs) {
        Object fileKey;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        fileKey = attrs.fileKey();
        this.f61133c.add(new C18755Xh1(dir, fileKey, this.f61132b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    /* renamed from: b */
    public final List m31909b(C18755Xh1 directoryNode) {
        Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.f61132b = directoryNode;
        Files.walkFileTree(directoryNode.m65447d(), LinkFollowing.INSTANCE.toVisitOptions(this.f61131a), 1, AbstractC1884aJ.m65112a(this));
        this.f61133c.removeFirst();
        ArrayDeque arrayDeque = this.f61133c;
        this.f61133c = new ArrayDeque();
        return arrayDeque;
    }

    /* renamed from: c */
    public FileVisitResult m31908c(Path file, BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f61133c.add(new C18755Xh1(file, null, this.f61132b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(visitFile, "visitFile(...)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return m31910a(AbstractC21393oI0.m25938a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return m31908c(AbstractC21393oI0.m25938a(obj), basicFileAttributes);
    }
}
