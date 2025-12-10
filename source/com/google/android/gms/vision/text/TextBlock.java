package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class TextBlock implements Text {

    /* renamed from: a */
    public zzah[] f48704a;

    /* renamed from: b */
    public Point[] f48705b;

    /* renamed from: c */
    public List f48706c;

    /* renamed from: d */
    public String f48707d;

    /* renamed from: e */
    public Rect f48708e;

    public TextBlock(SparseArray sparseArray) {
        this.f48704a = new zzah[sparseArray.size()];
        int i = 0;
        while (true) {
            zzah[] zzahVarArr = this.f48704a;
            if (i < zzahVarArr.length) {
                zzahVarArr[i] = (zzah) sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        if (this.f48708e == null) {
            this.f48708e = AbstractC22310tf2.m22385a(this);
        }
        return this.f48708e;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List<? extends Text> getComponents() {
        if (this.f48704a.length == 0) {
            return new ArrayList(0);
        }
        if (this.f48706c == null) {
            this.f48706c = new ArrayList(this.f48704a.length);
            for (zzah zzahVar : this.f48704a) {
                this.f48706c.add(new Line(zzahVar));
            }
        }
        return this.f48706c;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        TextBlock textBlock;
        zzah[] zzahVarArr;
        TextBlock textBlock2 = this;
        int i = 4;
        char c = 0;
        if (textBlock2.f48705b == null) {
            if (textBlock2.f48704a.length == 0) {
                textBlock2.f48705b = new Point[0];
            } else {
                int i2 = Integer.MIN_VALUE;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                int i5 = Integer.MAX_VALUE;
                int i6 = 0;
                while (true) {
                    zzahVarArr = textBlock2.f48704a;
                    if (i6 >= zzahVarArr.length) {
                        break;
                    }
                    zzab zzabVar = zzahVarArr[i6].zzb;
                    zzab zzabVar2 = zzahVarArr[c].zzb;
                    double sin = Math.sin(Math.toRadians(zzabVar2.zze));
                    double cos = Math.cos(Math.toRadians(zzabVar2.zze));
                    Point[] pointArr = new Point[i];
                    Point point = new Point(zzabVar.zza, zzabVar.zzb);
                    pointArr[c] = point;
                    point.offset(-zzabVar2.zza, -zzabVar2.zzb);
                    Point point2 = pointArr[c];
                    int i7 = point2.x;
                    int i8 = point2.y;
                    int i9 = (int) ((i7 * cos) + (i8 * sin));
                    int i10 = (int) (((-i7) * sin) + (i8 * cos));
                    point2.x = i9;
                    point2.y = i10;
                    pointArr[1] = new Point(zzabVar.zzc + i9, i10);
                    pointArr[2] = new Point(zzabVar.zzc + i9, zzabVar.zzd + i10);
                    pointArr[3] = new Point(i9, i10 + zzabVar.zzd);
                    i2 = i2;
                    for (int i11 = 0; i11 < 4; i11++) {
                        Point point3 = pointArr[i11];
                        i4 = Math.min(i4, point3.x);
                        i2 = Math.max(i2, point3.x);
                        i5 = Math.min(i5, point3.y);
                        i3 = Math.max(i3, point3.y);
                    }
                    i6++;
                    i = 4;
                    c = 0;
                    textBlock2 = this;
                }
                int i12 = i2;
                zzab zzabVar3 = zzahVarArr[0].zzb;
                int i13 = zzabVar3.zza;
                int i14 = zzabVar3.zzb;
                double sin2 = Math.sin(Math.toRadians(zzabVar3.zze));
                double cos2 = Math.cos(Math.toRadians(zzabVar3.zze));
                Point point4 = new Point(i4, i5);
                Point point5 = new Point(i12, i5);
                Point point6 = new Point(i12, i3);
                Point point7 = new Point(i4, i3);
                int i15 = 0;
                Point[] pointArr2 = {point4, point5, point6, point7};
                for (int i16 = 4; i15 < i16; i16 = 4) {
                    Point point8 = pointArr2[i15];
                    int i17 = point8.x;
                    int i18 = point8.y;
                    point8.x = (int) ((i17 * cos2) - (i18 * sin2));
                    point8.y = (int) ((i17 * sin2) + (i18 * cos2));
                    point8.offset(i13, i14);
                    i15++;
                    pointArr2 = pointArr2;
                }
                textBlock = this;
                textBlock.f48705b = pointArr2;
                return textBlock.f48705b;
            }
        }
        textBlock = textBlock2;
        return textBlock.f48705b;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        zzah[] zzahVarArr;
        int i;
        String str = this.f48707d;
        if (str != null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        for (zzah zzahVar : this.f48704a) {
            if (hashMap.containsKey(zzahVar.zzd)) {
                i = ((Integer) hashMap.get(zzahVar.zzd)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(zzahVar.zzd, Integer.valueOf(i + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(hashMap.entrySet(), new N92(this))).getKey();
        this.f48707d = str2;
        if (str2 == null || str2.isEmpty()) {
            this.f48707d = "und";
        }
        return this.f48707d;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        zzah[] zzahVarArr = this.f48704a;
        if (zzahVarArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zzahVarArr[0].zzc);
        for (int i = 1; i < this.f48704a.length; i++) {
            sb.append("\n");
            sb.append(this.f48704a[i].zzc);
        }
        return sb.toString();
    }
}
