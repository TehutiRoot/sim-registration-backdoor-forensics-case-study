package p000;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Xh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18755Xh1 {

    /* renamed from: a */
    public final Path f7550a;

    /* renamed from: b */
    public final Object f7551b;

    /* renamed from: c */
    public final C18755Xh1 f7552c;

    /* renamed from: d */
    public Iterator f7553d;

    public C18755Xh1(Path path, Object obj, C18755Xh1 c18755Xh1) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f7550a = path;
        this.f7551b = obj;
        this.f7552c = c18755Xh1;
    }

    /* renamed from: a */
    public final Iterator m65450a() {
        return this.f7553d;
    }

    /* renamed from: b */
    public final Object m65449b() {
        return this.f7551b;
    }

    /* renamed from: c */
    public final C18755Xh1 m65448c() {
        return this.f7552c;
    }

    /* renamed from: d */
    public final Path m65447d() {
        return this.f7550a;
    }

    /* renamed from: e */
    public final void m65446e(Iterator it) {
        this.f7553d = it;
    }
}
