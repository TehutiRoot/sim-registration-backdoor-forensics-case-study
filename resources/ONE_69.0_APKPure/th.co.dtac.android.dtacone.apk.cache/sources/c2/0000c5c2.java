package p000;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eT */
/* loaded from: classes5.dex */
public final class C10147eT {

    /* renamed from: a */
    public final int f61578a;

    /* renamed from: b */
    public int f61579b;

    /* renamed from: c */
    public final List f61580c;

    /* renamed from: d */
    public Path f61581d;

    public C10147eT(int i) {
        this.f61578a = i;
        this.f61580c = new ArrayList();
    }

    /* renamed from: a */
    public final void m31697a(Exception exception) {
        Throwable initCause;
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f61579b++;
        if (this.f61580c.size() < this.f61578a) {
            if (this.f61581d != null) {
                AbstractC10069dT.m31830a();
                initCause = AbstractC5434cT.m51690a(String.valueOf(this.f61581d)).initCause(exception);
                Intrinsics.checkNotNull(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = AbstractC5355bT.m51935a(initCause);
            }
            this.f61580c.add(exception);
        }
    }

    /* renamed from: b */
    public final void m31696b(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.f61581d;
        if (path2 != null) {
            path = path2.resolve(name);
        } else {
            path = null;
        }
        this.f61581d = path;
    }

    /* renamed from: c */
    public final void m31695c(Path name) {
        Path path;
        Intrinsics.checkNotNullParameter(name, "name");
        Path path2 = this.f61581d;
        Path path3 = null;
        if (path2 != null) {
            path = path2.getFileName();
        } else {
            path = null;
        }
        if (Intrinsics.areEqual(name, path)) {
            Path path4 = this.f61581d;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.f61581d = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public final List m31694d() {
        return this.f61580c;
    }

    /* renamed from: e */
    public final int m31693e() {
        return this.f61579b;
    }

    /* renamed from: f */
    public final void m31692f(Path path) {
        this.f61581d = path;
    }

    public /* synthetic */ C10147eT(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}