package kotlin.p023io.path;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0011\u001a\u00020\r26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJG\u0010\u0014\u001a\u00020\r26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJI\u0010\u0015\u001a\u00020\r28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J!\u0010\u001c\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR,\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m28850d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "<init>", "()V", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/ParameterName;", "name", "directory", "Ljava/nio/file/attribute/BasicFileAttributes;", "attributes", "Ljava/nio/file/FileVisitResult;", "function", "", "onPreVisitDirectory", "(Lkotlin/jvm/functions/Function2;)V", "file", "onVisitFile", "Ljava/io/IOException;", "exception", "onVisitFileFailed", "onPostVisitDirectory", "Ljava/nio/file/FileVisitor;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Ljava/nio/file/FileVisitor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Object;Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", OperatorName.CURVE_TO, "d", "", "e", "Z", "isBuilt", "kotlin-stdlib-jdk7"}, m28849k = 1, m28848mv = {1, 9, 0})
@ExperimentalPathApi
/* renamed from: kotlin.io.path.FileVisitorBuilderImpl */
/* loaded from: classes5.dex */
public final class FileVisitorBuilderImpl implements FileVisitorBuilder {

    /* renamed from: a */
    public Function2 f68250a;

    /* renamed from: b */
    public Function2 f68251b;

    /* renamed from: c */
    public Function2 f68252c;

    /* renamed from: d */
    public Function2 f68253d;

    /* renamed from: e */
    public boolean f68254e;

    /* renamed from: a */
    public final void m28756a() {
        if (!this.f68254e) {
            return;
        }
        throw new IllegalStateException("This builder was already built");
    }

    /* renamed from: b */
    public final void m28755b(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @NotNull
    public final FileVisitor<Path> build() {
        m28756a();
        this.f68254e = true;
        return AbstractC1884aJ.m65112a(new C1105PY(this.f68250a, this.f68251b, this.f68252c, this.f68253d));
    }

    @Override // kotlin.p023io.path.FileVisitorBuilder
    public void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        m28756a();
        m28755b(this.f68253d, "onPostVisitDirectory");
        this.f68253d = function;
    }

    @Override // kotlin.p023io.path.FileVisitorBuilder
    public void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        m28756a();
        m28755b(this.f68250a, "onPreVisitDirectory");
        this.f68250a = function;
    }

    @Override // kotlin.p023io.path.FileVisitorBuilder
    public void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        m28756a();
        m28755b(this.f68251b, "onVisitFile");
        this.f68251b = function;
    }

    @Override // kotlin.p023io.path.FileVisitorBuilder
    public void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        m28756a();
        m28755b(this.f68252c, "onVisitFileFailed");
        this.f68252c = function;
    }
}
