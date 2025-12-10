package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzao;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class Line implements Text {

    /* renamed from: a */
    public zzah f48714a;

    /* renamed from: b */
    public List f48715b;

    public Line(zzah zzahVar) {
        this.f48714a = zzahVar;
    }

    public float getAngle() {
        return this.f48714a.zzb.zze;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        return AbstractC21860qg2.m23607a(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List<? extends Text> getComponents() {
        if (this.f48714a.zza.length == 0) {
            return new ArrayList(0);
        }
        if (this.f48715b == null) {
            this.f48715b = new ArrayList(this.f48714a.zza.length);
            for (zzao zzaoVar : this.f48714a.zza) {
                this.f48715b.add(new Element(zzaoVar));
            }
        }
        return this.f48715b;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        return AbstractC21860qg2.m23606b(this.f48714a.zzb);
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        return this.f48714a.zzd;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        return this.f48714a.zzc;
    }

    public boolean isVertical() {
        return this.f48714a.zze;
    }
}