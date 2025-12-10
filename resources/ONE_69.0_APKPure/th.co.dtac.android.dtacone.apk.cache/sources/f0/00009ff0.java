package com.google.android.gms.vision.face;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes4.dex */
public final class Landmark {
    public static final int BOTTOM_MOUTH = 0;
    public static final int LEFT_CHEEK = 1;
    public static final int LEFT_EAR = 3;
    public static final int LEFT_EAR_TIP = 2;
    public static final int LEFT_EYE = 4;
    public static final int LEFT_MOUTH = 5;
    public static final int NOSE_BASE = 6;
    public static final int RIGHT_CHEEK = 7;
    public static final int RIGHT_EAR = 9;
    public static final int RIGHT_EAR_TIP = 8;
    public static final int RIGHT_EYE = 10;
    public static final int RIGHT_MOUTH = 11;

    /* renamed from: a */
    public final PointF f48698a;

    /* renamed from: b */
    public final int f48699b;

    public Landmark(@RecentlyNonNull PointF pointF, int i) {
        this.f48698a = pointF;
        this.f48699b = i;
    }

    @RecentlyNonNull
    public final PointF getPosition() {
        return this.f48698a;
    }

    public final int getType() {
        return this.f48699b;
    }
}