package p000;

import androidx.compose.p003ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathMeasure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ep */
/* loaded from: classes.dex */
public final class C10173ep {

    /* renamed from: a */
    public final Path f61603a;

    /* renamed from: b */
    public final PathMeasure f61604b;

    /* renamed from: c */
    public final Path f61605c;

    public C10173ep(Path checkPath, PathMeasure pathMeasure, Path pathToDraw) {
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.f61603a = checkPath;
        this.f61604b = pathMeasure;
        this.f61605c = pathToDraw;
    }

    /* renamed from: a */
    public final Path m31491a() {
        return this.f61603a;
    }

    /* renamed from: b */
    public final PathMeasure m31490b() {
        return this.f61604b;
    }

    /* renamed from: c */
    public final Path m31489c() {
        return this.f61605c;
    }

    public /* synthetic */ C10173ep(Path path, PathMeasure pathMeasure, Path path2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
