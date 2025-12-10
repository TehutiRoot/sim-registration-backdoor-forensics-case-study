package p000;

import androidx.compose.p003ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathMeasure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dp */
/* loaded from: classes2.dex */
public final class C10105dp {

    /* renamed from: a */
    public final Path f61326a;

    /* renamed from: b */
    public final PathMeasure f61327b;

    /* renamed from: c */
    public final Path f61328c;

    public C10105dp(Path checkPath, PathMeasure pathMeasure, Path pathToDraw) {
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.f61326a = checkPath;
        this.f61327b = pathMeasure;
        this.f61328c = pathToDraw;
    }

    /* renamed from: a */
    public final Path m31676a() {
        return this.f61326a;
    }

    /* renamed from: b */
    public final PathMeasure m31675b() {
        return this.f61327b;
    }

    /* renamed from: c */
    public final Path m31674c() {
        return this.f61328c;
    }

    public /* synthetic */ C10105dp(Path path, PathMeasure pathMeasure, Path path2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
