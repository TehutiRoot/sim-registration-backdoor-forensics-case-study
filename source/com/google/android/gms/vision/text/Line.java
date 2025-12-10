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
    public zzah f48702a;

    /* renamed from: b */
    public List f48703b;

    public Line(zzah zzahVar) {
        this.f48702a = zzahVar;
    }

    public float getAngle() {
        return this.f48702a.zzb.zze;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        return AbstractC22310tf2.m22385a(this);
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List<? extends Text> getComponents() {
        if (this.f48702a.zza.length == 0) {
            return new ArrayList(0);
        }
        if (this.f48703b == null) {
            this.f48703b = new ArrayList(this.f48702a.zza.length);
            for (zzao zzaoVar : this.f48702a.zza) {
                this.f48703b.add(new Element(zzaoVar));
            }
        }
        return this.f48703b;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        return AbstractC22310tf2.m22384b(this.f48702a.zzb);
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        return this.f48702a.zzd;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        return this.f48702a.zzc;
    }

    public boolean isVertical() {
        return this.f48702a.zze;
    }
}
