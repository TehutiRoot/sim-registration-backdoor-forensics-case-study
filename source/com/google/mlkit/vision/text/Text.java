package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class Text {

    /* renamed from: a */
    public final List f57157a;

    /* renamed from: b */
    public final String f57158b;

    /* loaded from: classes4.dex */
    public static class Symbol extends C8826a {

        /* renamed from: e */
        public final float f57165e;

        /* renamed from: f */
        public final float f57166f;

        public Symbol(zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", matrix);
            this.f57165e = zzvjVar.zzb();
            this.f57166f = zzvjVar.zza();
        }

        public float getAngle() {
            return this.f57166f;
        }

        public float getConfidence() {
            return this.f57165e;
        }

        @NonNull
        public String getText() {
            return zza();
        }
    }

    /* renamed from: com.google.mlkit.vision.text.Text$a */
    /* loaded from: classes4.dex */
    public static class C8826a {

        /* renamed from: a */
        public final String f57168a;

        /* renamed from: b */
        public final Rect f57169b;

        /* renamed from: c */
        public final Point[] f57170c;

        /* renamed from: d */
        public final String f57171d;

        public C8826a(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f57168a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                CommonConvertUtils.transformRect(rect2, matrix);
            }
            this.f57169b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pointArr[i] = new Point((Point) list.get(i));
            }
            if (matrix != null) {
                CommonConvertUtils.transformPointArray(pointArr, matrix);
            }
            this.f57170c = pointArr;
            this.f57171d = str2;
        }

        @Nullable
        public Rect getBoundingBox() {
            return this.f57169b;
        }

        @Nullable
        public Point[] getCornerPoints() {
            return this.f57170c;
        }

        @NonNull
        public String getRecognizedLanguage() {
            return this.f57171d;
        }

        @NonNull
        public final String zza() {
            String str = this.f57168a;
            return str == null ? "" : str;
        }
    }

    public Text(@NonNull zzvf zzvfVar, @Nullable final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f57157a = arrayList;
        this.f57158b = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new zzu() { // from class: com.google.mlkit.vision.text.zza
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new Text.TextBlock((zzuz) obj, matrix);
            }
        }));
    }

    @NonNull
    public String getText() {
        return this.f57158b;
    }

    @NonNull
    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.f57157a);
    }

    public Text(@NonNull String str, @NonNull List list) {
        ArrayList arrayList = new ArrayList();
        this.f57157a = arrayList;
        arrayList.addAll(list);
        this.f57158b = str;
    }

    /* loaded from: classes4.dex */
    public static class Line extends C8826a {

        /* renamed from: e */
        public final List f57162e;

        /* renamed from: f */
        public final float f57163f;

        /* renamed from: g */
        public final float f57164g;

        public Line(zzvd zzvdVar, final Matrix matrix, float f, float f2) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.f57162e = zzbu.zza(zzvdVar.zzg(), new zzu() { // from class: com.google.mlkit.vision.text.zzc
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Element((zzvb) obj, matrix);
                }
            });
            this.f57163f = f;
            this.f57164g = f2;
        }

        public float getAngle() {
            return this.f57164g;
        }

        public float getConfidence() {
            return this.f57163f;
        }

        @NonNull
        public synchronized List<Element> getElements() {
            return this.f57162e;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public Line(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @Nullable Matrix matrix, @NonNull List list2, float f, float f2) {
            super(str, rect, list, str2, matrix);
            this.f57162e = list2;
            this.f57163f = f;
            this.f57164g = f2;
        }
    }

    /* loaded from: classes4.dex */
    public static class TextBlock extends C8826a {

        /* renamed from: e */
        public final List f57167e;

        public TextBlock(zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
            this.f57167e = zzbu.zza(zzuzVar.zze(), new zzu() { // from class: com.google.mlkit.vision.text.zzd
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new Text.Line(zzvdVar, matrix, zzvdVar.zzb(), zzvdVar.zza());
                }
            });
        }

        @NonNull
        public synchronized List<Line> getLines() {
            return this.f57167e;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public TextBlock(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @Nullable Matrix matrix, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.f57167e = list2;
        }
    }

    /* loaded from: classes4.dex */
    public static class Element extends C8826a {

        /* renamed from: e */
        public final List f57159e;

        /* renamed from: f */
        public final float f57160f;

        /* renamed from: g */
        public final float f57161g;

        public Element(zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
            this.f57160f = zzvbVar.zzb();
            this.f57161g = zzvbVar.zza();
            List zzg = zzvbVar.zzg();
            this.f57159e = zzbu.zza(zzg == null ? new ArrayList() : zzg, new zzu() { // from class: com.google.mlkit.vision.text.zzb
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Symbol((zzvj) obj, matrix);
                }
            });
        }

        public float getAngle() {
            return this.f57161g;
        }

        public float getConfidence() {
            return this.f57160f;
        }

        @NonNull
        public synchronized List<Symbol> getSymbols() {
            return this.f57159e;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public Element(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, @Nullable Matrix matrix, float f, float f2, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.f57160f = f;
            this.f57161g = f2;
            this.f57159e = list2;
        }
    }
}
