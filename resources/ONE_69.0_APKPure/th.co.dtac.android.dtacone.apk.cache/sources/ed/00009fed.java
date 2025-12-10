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
    public int f48674a;

    /* renamed from: b */
    public PointF f48675b;

    /* renamed from: c */
    public float f48676c;

    /* renamed from: d */
    public float f48677d;

    /* renamed from: e */
    public float f48678e;

    /* renamed from: f */
    public float f48679f;

    /* renamed from: g */
    public float f48680g;

    /* renamed from: h */
    public List f48681h;

    /* renamed from: i */
    public final List f48682i;

    /* renamed from: j */
    public float f48683j;

    /* renamed from: k */
    public float f48684k;

    /* renamed from: l */
    public float f48685l;

    /* renamed from: m */
    public final float f48686m;

    public Face(int i, @RecentlyNonNull PointF pointF, float f, float f2, float f3, float f4, float f5, @RecentlyNonNull Landmark[] landmarkArr, @RecentlyNonNull Contour[] contourArr, float f6, float f7, float f8, float f9) {
        this.f48674a = i;
        this.f48675b = pointF;
        this.f48676c = f;
        this.f48677d = f2;
        this.f48678e = f3;
        this.f48679f = f4;
        this.f48680g = f5;
        this.f48681h = Arrays.asList(landmarkArr);
        this.f48682i = Arrays.asList(contourArr);
        this.f48683j = m45980a(f6);
        this.f48684k = m45980a(f7);
        this.f48685l = m45980a(f8);
        this.f48686m = m45980a(f9);
    }

    /* renamed from: a */
    public static float m45980a(float f) {
        if (f < 0.0f || f > 1.0f) {
            return -1.0f;
        }
        return f;
    }

    @RecentlyNonNull
    public List<Contour> getContours() {
        return this.f48682i;
    }

    @ShowFirstParty
    @KeepForSdk
    public float getEulerX() {
        return this.f48680g;
    }

    public float getEulerY() {
        return this.f48678e;
    }

    public float getEulerZ() {
        return this.f48679f;
    }

    public float getHeight() {
        return this.f48677d;
    }

    public int getId() {
        return this.f48674a;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.f48683j;
    }

    public float getIsRightEyeOpenProbability() {
        return this.f48684k;
    }

    public float getIsSmilingProbability() {
        return this.f48685l;
    }

    @RecentlyNonNull
    public List<Landmark> getLandmarks() {
        return this.f48681h;
    }

    @RecentlyNonNull
    public PointF getPosition() {
        PointF pointF = this.f48675b;
        return new PointF(pointF.x - (this.f48676c / 2.0f), pointF.y - (this.f48677d / 2.0f));
    }

    public float getWidth() {
        return this.f48676c;
    }
}