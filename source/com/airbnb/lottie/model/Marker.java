package com.airbnb.lottie.model;

/* loaded from: classes3.dex */
public class Marker {

    /* renamed from: a */
    public final String f41306a;
    public final float durationFrames;
    public final float startFrame;

    public Marker(String str, float f, float f2) {
        this.f41306a = str;
        this.durationFrames = f2;
        this.startFrame = f;
    }

    public float getDurationFrames() {
        return this.durationFrames;
    }

    public String getName() {
        return this.f41306a;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public boolean matchesName(String str) {
        if (this.f41306a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f41306a.endsWith("\r")) {
            String str2 = this.f41306a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
