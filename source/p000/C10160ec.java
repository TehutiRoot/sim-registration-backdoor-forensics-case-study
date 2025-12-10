package p000;

import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.CanvasDrawScope;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ec */
/* loaded from: classes.dex */
public final class C10160ec {

    /* renamed from: a */
    public ImageBitmap f61537a;

    /* renamed from: b */
    public Canvas f61538b;

    /* renamed from: c */
    public CanvasDrawScope f61539c;

    /* renamed from: d */
    public Path f61540d;

    public C10160ec(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.f61537a = imageBitmap;
        this.f61538b = canvas;
        this.f61539c = canvasDrawScope;
        this.f61540d = path;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10160ec)) {
            return false;
        }
        C10160ec c10160ec = (C10160ec) obj;
        if (Intrinsics.areEqual(this.f61537a, c10160ec.f61537a) && Intrinsics.areEqual(this.f61538b, c10160ec.f61538b) && Intrinsics.areEqual(this.f61539c, c10160ec.f61539c) && Intrinsics.areEqual(this.f61540d, c10160ec.f61540d)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Path m31520g() {
        Path path = this.f61540d;
        if (path == null) {
            Path Path = AndroidPath_androidKt.Path();
            this.f61540d = Path;
            return Path;
        }
        return path;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        ImageBitmap imageBitmap = this.f61537a;
        int i = 0;
        if (imageBitmap == null) {
            hashCode = 0;
        } else {
            hashCode = imageBitmap.hashCode();
        }
        int i2 = hashCode * 31;
        Canvas canvas = this.f61538b;
        if (canvas == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = canvas.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        CanvasDrawScope canvasDrawScope = this.f61539c;
        if (canvasDrawScope == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = canvasDrawScope.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Path path = this.f61540d;
        if (path != null) {
            i = path.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f61537a + ", canvas=" + this.f61538b + ", canvasDrawScope=" + this.f61539c + ", borderPath=" + this.f61540d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C10160ec(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }
}
