package com.google.android.gms.vision.face;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;

    /* renamed from: a */
    public int f48662a;

    /* renamed from: b */
    public PointF f48663b;

    /* renamed from: c */
    public float f48664c;

    /* renamed from: d */
    public float f48665d;

    /* renamed from: e */
    public float f48666e;

    /* renamed from: f */
    public float f48667f;

    /* renamed from: g */
    public float f48668g;

    /* renamed from: h */
    public List f48669h;

    /* renamed from: i */
    public final List f48670i;

    /* renamed from: j */
    public float f48671j;

    /* renamed from: k */
    public float f48672k;

    /* renamed from: l */
    public float f48673l;

    /* renamed from: m */
    public final float f48674m;

    public Face(int i, @RecentlyNonNull PointF pointF, float f, float f2, float f3, float f4, float f5, @RecentlyNonNull Landmark[] landmarkArr, @RecentlyNonNull Contour[] contourArr, float f6, float f7, float f8, float f9) {
        this.f48662a = i;
        this.f48663b = pointF;
        this.f48664c = f;
        this.f48665d = f2;
        this.f48666e = f3;
        this.f48667f = f4;
        this.f48668g = f5;
        this.f48669h = Arrays.asList(landmarkArr);
        this.f48670i = Arrays.asList(contourArr);
        this.f48671j = m45995a(f6);
        this.f48672k = m45995a(f7);
        this.f48673l = m45995a(f8);
        this.f48674m = m45995a(f9);
    }

    /* renamed from: a */
    public static float m45995a(float f) {
        if (f < 0.0f || f > 1.0f) {
            return -1.0f;
        }
        return f;
    }

    @RecentlyNonNull
    public List<Contour> getContours() {
        return this.f48670i;
    }

    @ShowFirstParty
    @KeepForSdk
    public float getEulerX() {
        return this.f48668g;
    }

    public float getEulerY() {
        return this.f48666e;
    }

    public float getEulerZ() {
        return this.f48667f;
    }

    public float getHeight() {
        return this.f48665d;
    }

    public int getId() {
        return this.f48662a;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.f48671j;
    }

    public float getIsRightEyeOpenProbability() {
        return this.f48672k;
    }

    public float getIsSmilingProbability() {
        return this.f48673l;
    }

    @RecentlyNonNull
    public List<Landmark> getLandmarks() {
        return this.f48669h;
    }

    @RecentlyNonNull
    public PointF getPosition() {
        PointF pointF = this.f48663b;
        return new PointF(pointF.x - (this.f48664c / 2.0f), pointF.y - (this.f48665d / 2.0f));
    }

    public float getWidth() {
        return this.f48664c;
    }
}
