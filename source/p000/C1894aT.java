package p000;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: aT */
/* loaded from: classes5.dex */
public final class C1894aT {

    /* renamed from: a */
    public final int f8336a;

    /* renamed from: b */
    public int f8337b;

    /* renamed from: c */
    public final List f8338c;

    /* renamed from: d */
    public Path f8339d;

    public C1894aT(int i) {
        this.f8336a = i;
        this.f8338c = new ArrayList();
    }

    /* renamed from: a */
    public final void m65103a(Exception exception) {
        Throwable initCause;
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f8337b++;
        if (this.f8338c.size() < this.f8336a) {
            if (this.f8339d != null) {
                AbstractC1826ZS.m65233a();
                initCause = AbstractC1757YS.m65354a(String.valueOf(this.f8339d)).initCause(exception);
                Intrinsics.checkNotNull(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = AbstractC1681XS.m65496a(initCause);
            }
            this.f8338c.add(exception);
        }
    }

    /* renamed from: b */
    public final void m65102b(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.f8339d;
        if (path2 != null) {
            path = path2.resolve(name);
        } else {
            path = null;
        }
        this.f8339d = path;
    }

    /* renamed from: c */
    public final void m65101c(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.f8339d;
        Path path3 = null;
        if (path2 != null) {
            path = path2.getFileName();
        } else {
            path = null;
        }
        if (Intrinsics.areEqual(name, path)) {
            Path path4 = this.f8339d;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.f8339d = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public final List m65100d() {
        return this.f8338c;
    }

    /* renamed from: e */
    public final int m65099e() {
        return this.f8337b;
    }

    /* renamed from: f */
    public final void m65098f(Path path) {
        this.f8339d = path;
    }

    public /* synthetic */ C1894aT(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}
