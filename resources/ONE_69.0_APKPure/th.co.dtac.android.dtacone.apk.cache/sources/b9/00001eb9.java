package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.C2444d;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ResolutionInfo {

    /* renamed from: a */
    public final AbstractC2432a f10964a;

    /* renamed from: androidx.camera.core.ResolutionInfo$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2432a {

        /* renamed from: androidx.camera.core.ResolutionInfo$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2433a {
            /* renamed from: a */
            public abstract AbstractC2432a mo63104a();

            /* renamed from: b */
            public abstract AbstractC2433a mo63103b(Rect rect);

            /* renamed from: c */
            public abstract AbstractC2433a mo63102c(int i);
        }

        /* renamed from: a */
        public abstract Rect mo63107a();

        /* renamed from: b */
        public abstract Size mo63106b();

        /* renamed from: c */
        public abstract int mo63105c();
    }

    public ResolutionInfo(@NonNull Size size, @NonNull Rect rect, int i) {
        this.f10964a = new C2444d.C2446b().m63101d(size).mo63103b(rect).mo63102c(i).mo63104a();
    }

    public boolean equals(@Nullable Object obj) {
        return this.f10964a.equals(obj);
    }

    @NonNull
    public Rect getCropRect() {
        return this.f10964a.mo63107a();
    }

    @NonNull
    public Size getResolution() {
        return this.f10964a.mo63106b();
    }

    public int getRotationDegrees() {
        return this.f10964a.mo63105c();
    }

    public int hashCode() {
        return this.f10964a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f10964a.toString();
    }
}