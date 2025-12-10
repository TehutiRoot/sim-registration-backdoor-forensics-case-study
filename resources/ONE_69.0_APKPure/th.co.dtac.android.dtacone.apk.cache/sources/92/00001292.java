package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: TY */
/* loaded from: classes5.dex */
public final class C1376TY extends SimpleFileVisitor {

    /* renamed from: a */
    public final Function2 f6357a;

    /* renamed from: b */
    public final Function2 f6358b;

    /* renamed from: c */
    public final Function2 f6359c;

    /* renamed from: d */
    public final Function2 f6360d;

    public C1376TY(Function2 function2, Function2 function22, Function2 function23, Function2 function24) {
        this.f6357a = function2;
        this.f6358b = function22;
        this.f6359c = function23;
        this.f6360d = function24;
    }

    /* renamed from: a */
    public FileVisitResult m66339a(Path dir, IOException iOException) {
        FileVisitResult m66486a;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Function2 function2 = this.f6360d;
        if (function2 == null || (m66486a = AbstractC1298SY.m66486a(function2.invoke(dir, iOException))) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
            Intrinsics.checkNotNullExpressionValue(postVisitDirectory, "postVisitDirectory(...)");
            return postVisitDirectory;
        }
        return m66486a;
    }

    /* renamed from: b */
    public FileVisitResult m66338b(Path dir, BasicFileAttributes attrs) {
        FileVisitResult m66486a;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2 function2 = this.f6357a;
        if (function2 == null || (m66486a = AbstractC1298SY.m66486a(function2.invoke(dir, attrs))) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
            Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "preVisitDirectory(...)");
            return preVisitDirectory;
        }
        return m66486a;
    }

    /* renamed from: c */
    public FileVisitResult m66337c(Path file, BasicFileAttributes attrs) {
        FileVisitResult m66486a;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2 function2 = this.f6358b;
        if (function2 == null || (m66486a = AbstractC1298SY.m66486a(function2.invoke(file, attrs))) == null) {
            FileVisitResult visitFile = super.visitFile(file, attrs);
            Intrinsics.checkNotNullExpressionValue(visitFile, "visitFile(...)");
            return visitFile;
        }
        return m66486a;
    }

    /* renamed from: d */
    public FileVisitResult m66336d(Path file, IOException exc) {
        FileVisitResult m66486a;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exc, "exc");
        Function2 function2 = this.f6359c;
        if (function2 == null || (m66486a = AbstractC1298SY.m66486a(function2.invoke(file, exc))) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
            Intrinsics.checkNotNullExpressionValue(visitFileFailed, "visitFileFailed(...)");
            return visitFileFailed;
        }
        return m66486a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return m66339a(AbstractC22491uI0.m1223a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return m66338b(AbstractC22491uI0.m1223a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return m66337c(AbstractC22491uI0.m1223a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return m66336d(AbstractC22491uI0.m1223a(obj), iOException);
    }
}