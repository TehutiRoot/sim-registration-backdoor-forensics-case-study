package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class FontCharacter {

    /* renamed from: a */
    public final List f41296a;

    /* renamed from: b */
    public final char f41297b;

    /* renamed from: c */
    public final double f41298c;

    /* renamed from: d */
    public final double f41299d;

    /* renamed from: e */
    public final String f41300e;

    /* renamed from: f */
    public final String f41301f;

    public FontCharacter(List<ShapeGroup> list, char c, double d, double d2, String str, String str2) {
        this.f41296a = list;
        this.f41297b = c;
        this.f41298c = d;
        this.f41299d = d2;
        this.f41300e = str;
        this.f41301f = str2;
    }

    public static int hashFor(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<ShapeGroup> getShapes() {
        return this.f41296a;
    }

    public double getWidth() {
        return this.f41299d;
    }

    public int hashCode() {
        return hashFor(this.f41297b, this.f41301f, this.f41300e);
    }
}
