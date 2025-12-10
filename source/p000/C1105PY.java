package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: PY */
/* loaded from: classes5.dex */
public final class C1105PY extends SimpleFileVisitor {

    /* renamed from: a */
    public final Function2 f4762a;

    /* renamed from: b */
    public final Function2 f4763b;

    /* renamed from: c */
    public final Function2 f4764c;

    /* renamed from: d */
    public final Function2 f4765d;

    public C1105PY(Function2 function2, Function2 function22, Function2 function23, Function2 function24) {
        this.f4762a = function2;
        this.f4763b = function22;
        this.f4764c = function23;
        this.f4765d = function24;
    }

    /* renamed from: a */
    public FileVisitResult m66791a(Path dir, IOException iOException) {
        FileVisitResult m67027a;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Function2 function2 = this.f4765d;
        if (function2 == null || (m67027a = AbstractC1021OY.m67027a(function2.invoke(dir, iOException))) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
            Intrinsics.checkNotNullExpressionValue(postVisitDirectory, "postVisitDirectory(...)");
            return postVisitDirectory;
        }
        return m67027a;
    }

    /* renamed from: b */
    public FileVisitResult m66790b(Path dir, BasicFileAttributes attrs) {
        FileVisitResult m67027a;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2 function2 = this.f4762a;
        if (function2 == null || (m67027a = AbstractC1021OY.m67027a(function2.invoke(dir, attrs))) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
            Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "preVisitDirectory(...)");
            return preVisitDirectory;
        }
        return m67027a;
    }

    /* renamed from: c */
    public FileVisitResult m66789c(Path file, BasicFileAttributes attrs) {
        FileVisitResult m67027a;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2 function2 = this.f4763b;
        if (function2 == null || (m67027a = AbstractC1021OY.m67027a(function2.invoke(file, attrs))) == null) {
            FileVisitResult visitFile = super.visitFile(file, attrs);
            Intrinsics.checkNotNullExpressionValue(visitFile, "visitFile(...)");
            return visitFile;
        }
        return m67027a;
    }

    /* renamed from: d */
    public FileVisitResult m66788d(Path file, IOException exc) {
        FileVisitResult m67027a;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exc, "exc");
        Function2 function2 = this.f4764c;
        if (function2 == null || (m67027a = AbstractC1021OY.m67027a(function2.invoke(file, exc))) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
            Intrinsics.checkNotNullExpressionValue(visitFileFailed, "visitFileFailed(...)");
            return visitFileFailed;
        }
        return m67027a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return m66791a(AbstractC21393oI0.m25938a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return m66790b(AbstractC21393oI0.m25938a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return m66789c(AbstractC21393oI0.m25938a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return m66788d(AbstractC21393oI0.m25938a(obj), iOException);
    }
}
