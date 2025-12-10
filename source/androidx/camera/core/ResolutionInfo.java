package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.C2462d;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ResolutionInfo {

    /* renamed from: a */
    public final AbstractC2450a f10876a;

    /* renamed from: androidx.camera.core.ResolutionInfo$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2450a {

        /* renamed from: androidx.camera.core.ResolutionInfo$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2451a {
            /* renamed from: a */
            public abstract AbstractC2450a mo63156a();

            /* renamed from: b */
            public abstract AbstractC2451a mo63155b(Rect rect);

            /* renamed from: c */
            public abstract AbstractC2451a mo63154c(int i);
        }

        /* renamed from: a */
        public abstract Rect mo63159a();

        /* renamed from: b */
        public abstract Size mo63158b();

        /* renamed from: c */
        public abstract int mo63157c();
    }

    public ResolutionInfo(@NonNull Size size, @NonNull Rect rect, int i) {
        this.f10876a = new C2462d.C2464b().m63153d(size).mo63155b(rect).mo63154c(i).mo63156a();
    }

    public boolean equals(@Nullable Object obj) {
        return this.f10876a.equals(obj);
    }

    @NonNull
    public Rect getCropRect() {
        return this.f10876a.mo63159a();
    }

    @NonNull
    public Size getResolution() {
        return this.f10876a.mo63158b();
    }

    public int getRotationDegrees() {
        return this.f10876a.mo63157c();
    }

    public int hashCode() {
        return this.f10876a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f10876a.toString();
    }
}
