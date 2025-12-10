package com.google.firebase.p015ml.vision.document;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzkm;
import com.google.android.gms.internal.firebase_ml.zzkt;
import com.google.android.gms.internal.firebase_ml.zzle;
import com.google.android.gms.internal.firebase_ml.zzlf;
import com.google.android.gms.internal.firebase_ml.zzlk;
import com.google.android.gms.internal.firebase_ml.zzll;
import com.google.android.gms.internal.firebase_ml.zzln;
import com.google.android.gms.internal.firebase_ml.zzlq;
import com.google.android.gms.internal.firebase_ml.zzmt;
import com.google.android.gms.internal.firebase_ml.zzmx;
import com.google.android.gms.internal.firebase_ml.zzry;
import com.google.android.gms.internal.firebase_ml.zztg;
import com.google.firebase.p015ml.vision.text.RecognizedLanguage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText */
/* loaded from: classes4.dex */
public class FirebaseVisionDocumentText {

    /* renamed from: c */
    public static final FirebaseVisionDocumentText f55942c = new FirebaseVisionDocumentText("", new ArrayList());

    /* renamed from: a */
    public final String f55943a;

    /* renamed from: b */
    public final List f55944b;

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Block */
    /* loaded from: classes4.dex */
    public static class Block extends C8565a {

        /* renamed from: f */
        public final List f55945f;

        public Block(List list, RecognizedBreak recognizedBreak, Rect rect, List list2, String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.f55945f = list2;
        }

        /* renamed from: a */
        public static Block m38334a(zzkm zzkmVar, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zztg.zze(zzkmVar.zzis());
            if (zzkmVar.getParagraphs() != null) {
                for (zzle zzleVar : zzkmVar.getParagraphs()) {
                    if (zzleVar != null) {
                        Paragraph m38332a = Paragraph.m38332a(zzleVar, f);
                        if (sb.length() != 0) {
                            sb.append("\n");
                        }
                        sb.append(m38332a.getText());
                        arrayList.add(m38332a);
                    }
                }
            }
            return new Block(zze, new RecognizedBreak(), zzry.zza(zzkmVar.zzir(), f), arrayList, sb.toString(), zzkmVar.getConfidence());
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @NonNull
        public List<Paragraph> getParagraphs() {
            return this.f55945f;
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Paragraph */
    /* loaded from: classes4.dex */
    public static class Paragraph extends C8565a {

        /* renamed from: f */
        public final List f55946f;

        public Paragraph(List list, RecognizedBreak recognizedBreak, Rect rect, List list2, String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.f55946f = list2;
        }

        /* renamed from: a */
        public static Paragraph m38332a(zzle zzleVar, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zztg.zze(zzleVar.zzis());
            if (zzleVar.getWords() != null) {
                for (zzlq zzlqVar : zzleVar.getWords()) {
                    if (zzlqVar != null) {
                        Word m38326a = Word.m38326a(zzlqVar, f);
                        sb.append(m38326a.getText());
                        sb.append(FirebaseVisionDocumentText.m38338b(m38326a.getRecognizedBreak()));
                        arrayList.add(m38326a);
                    }
                }
            }
            return new Paragraph(zze, new RecognizedBreak(), zzry.zza(zzleVar.zzir(), f), arrayList, sb.toString(), zzleVar.getConfidence());
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        @NonNull
        public List<Word> getWords() {
            return this.f55946f;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak */
    /* loaded from: classes4.dex */
    public static class RecognizedBreak {
        public static final int EOL_SURE_SPACE = 3;
        public static final int HYPHEN = 4;
        public static final int LINE_BREAK = 5;
        public static final int SPACE = 1;
        public static final int SURE_SPACE = 2;
        public static final int UNKNOWN = 0;

        /* renamed from: a */
        public final int f55947a;

        /* renamed from: b */
        public final boolean f55948b;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak$BreakType */
        /* loaded from: classes4.dex */
        public @interface BreakType {
        }

        public RecognizedBreak(int i, boolean z) {
            this.f55947a = i;
            this.f55948b = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak m38330a(com.google.android.gms.internal.firebase_ml.zzln r8) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                if (r8 == 0) goto L8c
                com.google.android.gms.internal.firebase_ml.zzkq r5 = r8.zzjd()
                if (r5 != 0) goto Lf
                goto L8c
            Lf:
                com.google.android.gms.internal.firebase_ml.zzkq r5 = r8.zzjd()
                java.lang.String r5 = r5.getType()
                if (r5 == 0) goto L6f
                com.google.android.gms.internal.firebase_ml.zzkq r5 = r8.zzjd()
                java.lang.String r5 = r5.getType()
                r5.hashCode()
                r6 = -1
                int r7 = r5.hashCode()
                switch(r7) {
                    case -1651884996: goto L59;
                    case -1571028039: goto L4e;
                    case 79100134: goto L43;
                    case 1541383380: goto L38;
                    case 2145946930: goto L2d;
                    default: goto L2c;
                }
            L2c:
                goto L63
            L2d:
                java.lang.String r7 = "HYPHEN"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L36
                goto L63
            L36:
                r6 = 4
                goto L63
            L38:
                java.lang.String r7 = "LINE_BREAK"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L41
                goto L63
            L41:
                r6 = 3
                goto L63
            L43:
                java.lang.String r7 = "SPACE"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L4c
                goto L63
            L4c:
                r6 = 2
                goto L63
            L4e:
                java.lang.String r7 = "EOL_SURE_SPACE"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L57
                goto L63
            L57:
                r6 = 1
                goto L63
            L59:
                java.lang.String r7 = "SURE_SPACE"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L62
                goto L63
            L62:
                r6 = 0
            L63:
                switch(r6) {
                    case 0: goto L6d;
                    case 1: goto L6b;
                    case 2: goto L69;
                    case 3: goto L67;
                    case 4: goto L70;
                    default: goto L66;
                }
            L66:
                goto L6f
            L67:
                r0 = 5
                goto L70
            L69:
                r0 = 1
                goto L70
            L6b:
                r0 = 3
                goto L70
            L6d:
                r0 = 2
                goto L70
            L6f:
                r0 = 0
            L70:
                com.google.android.gms.internal.firebase_ml.zzkq r1 = r8.zzjd()
                java.lang.Boolean r1 = r1.zziv()
                if (r1 == 0) goto L86
                com.google.android.gms.internal.firebase_ml.zzkq r8 = r8.zzjd()
                java.lang.Boolean r8 = r8.zziv()
                boolean r4 = r8.booleanValue()
            L86:
                com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak r8 = new com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak
                r8.<init>(r0, r4)
                return r8
            L8c:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak.m38330a(com.google.android.gms.internal.firebase_ml.zzln):com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak");
        }

        @BreakType
        public int getDetectedBreakType() {
            return this.f55947a;
        }

        public boolean getIsPrefix() {
            return this.f55948b;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Symbol */
    /* loaded from: classes4.dex */
    public static class Symbol extends C8565a {
        public Symbol(List list, RecognizedBreak recognizedBreak, Rect rect, String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
        }

        /* renamed from: a */
        public static Symbol m38328a(zzll zzllVar, float f) {
            return new Symbol(FirebaseVisionDocumentText.m38337c(zzllVar.zzis()), RecognizedBreak.m38330a(zzllVar.zzis()), zzry.zza(zzllVar.zzir(), f), zzry.zzcd(zzllVar.getText()), zzllVar.getConfidence());
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Word */
    /* loaded from: classes4.dex */
    public static class Word extends C8565a {

        /* renamed from: f */
        public final List f55949f;

        public Word(List list, RecognizedBreak recognizedBreak, Rect rect, List list2, String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.f55949f = list2;
        }

        /* renamed from: a */
        public static Word m38326a(zzlq zzlqVar, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zztg.zze(zzlqVar.zzis());
            RecognizedBreak recognizedBreak = null;
            if (zzlqVar.getSymbols() != null) {
                for (zzll zzllVar : zzlqVar.getSymbols()) {
                    if (zzllVar != null) {
                        Symbol m38328a = Symbol.m38328a(zzllVar, f);
                        RecognizedBreak recognizedBreak2 = m38328a.getRecognizedBreak();
                        sb.append(m38328a.getText());
                        arrayList.add(Symbol.m38328a(zzllVar, f));
                        recognizedBreak = recognizedBreak2;
                    }
                }
            }
            return new Word(zze, recognizedBreak, zzry.zza(zzlqVar.zzir(), f), arrayList, sb.toString(), zzlqVar.getConfidence());
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @NonNull
        public List<Symbol> getSymbols() {
            return this.f55949f;
        }

        @Override // com.google.firebase.p015ml.vision.document.FirebaseVisionDocumentText.C8565a
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$a */
    /* loaded from: classes4.dex */
    public static class C8565a {

        /* renamed from: a */
        public final List f55950a;

        /* renamed from: b */
        public final RecognizedBreak f55951b;

        /* renamed from: c */
        public final Rect f55952c;

        /* renamed from: d */
        public final String f55953d;

        /* renamed from: e */
        public final Float f55954e;

        public C8565a(List list, RecognizedBreak recognizedBreak, Rect rect, String str, Float f) {
            this.f55953d = str;
            this.f55950a = list;
            this.f55951b = recognizedBreak;
            this.f55952c = rect;
            this.f55954e = f;
        }

        public Rect getBoundingBox() {
            return this.f55952c;
        }

        public Float getConfidence() {
            return this.f55954e;
        }

        public RecognizedBreak getRecognizedBreak() {
            return this.f55951b;
        }

        public List getRecognizedLanguages() {
            return this.f55950a;
        }

        public String getText() {
            return this.f55953d;
        }
    }

    public FirebaseVisionDocumentText(String str, List list) {
        this.f55943a = str;
        this.f55944b = list;
    }

    /* renamed from: a */
    public static FirebaseVisionDocumentText m38339a(zzlk zzlkVar, float f) {
        if (zzlkVar == null) {
            return f55942c;
        }
        String zzcd = zzry.zzcd(zzlkVar.getText());
        ArrayList arrayList = new ArrayList();
        if (zzlkVar.getPages() != null) {
            for (zzlf zzlfVar : zzlkVar.getPages()) {
                if (zzlfVar != null) {
                    for (zzkm zzkmVar : zzlfVar.getBlocks()) {
                        if (zzkmVar != null) {
                            arrayList.add(Block.m38334a(zzkmVar, f));
                        }
                    }
                }
            }
        }
        return new FirebaseVisionDocumentText(zzcd, arrayList);
    }

    /* renamed from: b */
    public static String m38338b(RecognizedBreak recognizedBreak) {
        if (recognizedBreak == null) {
            return "";
        }
        int detectedBreakType = recognizedBreak.getDetectedBreakType();
        if (detectedBreakType != 1 && detectedBreakType != 2) {
            if (detectedBreakType != 3) {
                if (detectedBreakType != 4) {
                    if (detectedBreakType != 5) {
                        return "";
                    }
                } else {
                    return "-\n";
                }
            }
            return "\n";
        }
        return HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
    }

    /* renamed from: c */
    public static List m38337c(zzln zzlnVar) {
        if (zzlnVar == null) {
            return zzmx.zzju();
        }
        ArrayList arrayList = new ArrayList();
        if (zzlnVar.zzje() != null) {
            for (zzkt zzktVar : zzlnVar.zzje()) {
                RecognizedLanguage zza = RecognizedLanguage.zza(zzktVar);
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public List<Block> getBlocks() {
        return this.f55944b;
    }

    @NonNull
    public String getText() {
        return zzmt.zzbb(this.f55943a);
    }
}
