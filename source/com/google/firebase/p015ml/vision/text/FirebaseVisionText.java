package com.google.firebase.p015ml.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmx;
import com.google.android.gms.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText */
/* loaded from: classes4.dex */
public class FirebaseVisionText {
    public static final FirebaseVisionText zzbxm = new FirebaseVisionText("", new ArrayList());

    /* renamed from: a */
    public final List f56030a;

    /* renamed from: b */
    public final String f56031b;

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Element */
    /* loaded from: classes4.dex */
    public static class Element extends C8566a {
        public Element(com.google.android.gms.vision.text.Element element) {
            super(element);
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public Element(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @Nullable Float f) {
            super(str, rect, list, f);
        }
    }

    public FirebaseVisionText(@NonNull SparseArray<com.google.android.gms.vision.text.TextBlock> sparseArray) {
        this.f56030a = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray.size(); i++) {
            com.google.android.gms.vision.text.TextBlock textBlock = sparseArray.get(sparseArray.keyAt(i));
            if (textBlock != null) {
                TextBlock textBlock2 = new TextBlock(textBlock);
                this.f56030a.add(textBlock2);
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                if (textBlock.getValue() != null) {
                    sb.append(textBlock2.getText());
                }
            }
        }
        this.f56031b = sb.toString();
    }

    @NonNull
    public String getText() {
        return this.f56031b;
    }

    @NonNull
    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.f56030a);
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Line */
    /* loaded from: classes4.dex */
    public static class Line extends C8566a {

        /* renamed from: f */
        public final List f56032f;

        public Line(com.google.android.gms.vision.text.Line line) {
            super(line);
            this.f56032f = new ArrayList();
            for (Text text : line.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Element) {
                    this.f56032f.add(new Element((com.google.android.gms.vision.text.Element) text));
                }
            }
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @NonNull
        public synchronized List<Element> getElements() {
            return this.f56032f;
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public Line(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Element> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.f56032f = list2;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$TextBlock */
    /* loaded from: classes4.dex */
    public static class TextBlock extends C8566a {

        /* renamed from: f */
        public final List f56033f;

        public TextBlock(com.google.android.gms.vision.text.TextBlock textBlock) {
            super(textBlock);
            this.f56033f = new ArrayList();
            for (Text text : textBlock.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Line) {
                    this.f56033f.add(new Line((com.google.android.gms.vision.text.Line) text));
                }
            }
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @NonNull
        public synchronized List<Line> getLines() {
            return this.f56033f;
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.text.FirebaseVisionText.C8566a
        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public TextBlock(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Line> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.f56033f = list2;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$a */
    /* loaded from: classes4.dex */
    public static class C8566a {

        /* renamed from: a */
        public final String f56034a;

        /* renamed from: b */
        public final Rect f56035b;

        /* renamed from: c */
        public final Point[] f56036c;

        /* renamed from: d */
        public final Float f56037d;

        /* renamed from: e */
        public final List f56038e;

        public C8566a(Text text) {
            Preconditions.checkNotNull(text, "Text to construct FirebaseVisionText classes can't be null");
            this.f56037d = null;
            this.f56034a = text.getValue();
            this.f56035b = text.getBoundingBox();
            this.f56036c = text.getCornerPoints();
            this.f56038e = zzmx.zzju();
        }

        public Rect getBoundingBox() {
            return this.f56035b;
        }

        public Float getConfidence() {
            return this.f56037d;
        }

        public Point[] getCornerPoints() {
            return this.f56036c;
        }

        public List getRecognizedLanguages() {
            return this.f56038e;
        }

        public String getText() {
            String str = this.f56034a;
            if (str == null) {
                return "";
            }
            return str;
        }

        public C8566a(String str, Rect rect, List list, Float f) {
            Preconditions.checkNotNull(str, "Text string cannot be null");
            Preconditions.checkNotNull(list, "Text languages cannot be null");
            this.f56037d = f;
            this.f56036c = null;
            this.f56034a = str;
            this.f56035b = rect;
            this.f56038e = list;
        }
    }

    public FirebaseVisionText(@NonNull String str, @NonNull List<TextBlock> list) {
        ArrayList arrayList = new ArrayList();
        this.f56030a = arrayList;
        this.f56031b = str;
        arrayList.addAll(list);
    }
}
