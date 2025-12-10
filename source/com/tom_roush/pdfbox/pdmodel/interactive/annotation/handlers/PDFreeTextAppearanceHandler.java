package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import android.util.Log;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class PDFreeTextAppearanceHandler extends PDAbstractAppearanceHandler {

    /* renamed from: e */
    public static final Pattern f60593e = Pattern.compile(".*color\\:\\s*\\#([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]).*");

    /* renamed from: c */
    public float f60594c;

    /* renamed from: d */
    public COSName f60595d;

    public PDFreeTextAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
        this.f60594c = 10.0f;
        this.f60595d = COSName.HELV;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:3|(1:177))(1:178)|9|10|11|12|14|15|(21:(3:166|167|(36:169|170|18|19|(1:21)|38|(7:41|42|43|(3:45|(2:47|(1:49))(1:53)|50)(1:54)|51|52|39)|59|60|61|62|(1:64)|65|(3:140|141|(26:145|(2:147|148)(1:155)|149|150|151|152|68|69|(1:135)(3:73|74|75)|76|(15:80|81|(12:85|86|(1:94)|95|(2:97|(1:(1:100)(1:123))(1:124))(1:125)|101|102|(4:104|105|106|107)|113|(4:115|(2:118|116)|119|120)|121|122)|126|86|(4:88|90|92|94)|95|(0)(0)|101|102|(0)|113|(0)|121|122)|127|81|(12:85|86|(0)|95|(0)(0)|101|102|(0)|113|(0)|121|122)|126|86|(0)|95|(0)(0)|101|102|(0)|113|(0)|121|122))|67|68|69|(1:71)|135|76|(15:80|81|(0)|126|86|(0)|95|(0)(0)|101|102|(0)|113|(0)|121|122)|127|81|(0)|126|86|(0)|95|(0)(0)|101|102|(0)|113|(0)|121|122))|69|(0)|135|76|(0)|127|81|(0)|126|86|(0)|95|(0)(0)|101|102|(0)|113|(0)|121|122)|17|18|19|(0)|38|(1:39)|59|60|61|62|(0)|65|(0)|67|68|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x044f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0450, code lost:
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0455, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0456, code lost:
        r14 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af A[Catch: all -> 0x0223, IOException -> 0x0225, TryCatch #18 {IOException -> 0x0225, all -> 0x0223, blocks: (B:90:0x01de, B:96:0x0256, B:100:0x027c, B:102:0x0285, B:106:0x0294, B:108:0x02a8, B:110:0x02af, B:112:0x02b9, B:114:0x02c9, B:122:0x02dd, B:124:0x0319, B:127:0x035e, B:129:0x036a, B:131:0x03b7, B:141:0x03c9, B:143:0x03cc, B:144:0x03dc, B:146:0x03e1, B:147:0x03fb, B:123:0x02fb, B:125:0x031d, B:126:0x033e, B:107:0x029e, B:101:0x0281, B:95:0x0227, B:130:0x03b4, B:137:0x03bf, B:138:0x03c4), top: B:173:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033e A[Catch: all -> 0x0223, IOException -> 0x0225, TryCatch #18 {IOException -> 0x0225, all -> 0x0223, blocks: (B:90:0x01de, B:96:0x0256, B:100:0x027c, B:102:0x0285, B:106:0x0294, B:108:0x02a8, B:110:0x02af, B:112:0x02b9, B:114:0x02c9, B:122:0x02dd, B:124:0x0319, B:127:0x035e, B:129:0x036a, B:131:0x03b7, B:141:0x03c9, B:143:0x03cc, B:144:0x03dc, B:146:0x03e1, B:147:0x03fb, B:123:0x02fb, B:125:0x031d, B:126:0x033e, B:107:0x029e, B:101:0x0281, B:95:0x0227, B:130:0x03b4, B:137:0x03bf, B:138:0x03c4), top: B:173:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036a A[Catch: all -> 0x0223, IOException -> 0x0225, TRY_LEAVE, TryCatch #18 {IOException -> 0x0225, all -> 0x0223, blocks: (B:90:0x01de, B:96:0x0256, B:100:0x027c, B:102:0x0285, B:106:0x0294, B:108:0x02a8, B:110:0x02af, B:112:0x02b9, B:114:0x02c9, B:122:0x02dd, B:124:0x0319, B:127:0x035e, B:129:0x036a, B:131:0x03b7, B:141:0x03c9, B:143:0x03cc, B:144:0x03dc, B:146:0x03e1, B:147:0x03fb, B:123:0x02fb, B:125:0x031d, B:126:0x033e, B:107:0x029e, B:101:0x0281, B:95:0x0227, B:130:0x03b4, B:137:0x03bf, B:138:0x03c4), top: B:173:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03cc A[Catch: all -> 0x0223, IOException -> 0x0225, TryCatch #18 {IOException -> 0x0225, all -> 0x0223, blocks: (B:90:0x01de, B:96:0x0256, B:100:0x027c, B:102:0x0285, B:106:0x0294, B:108:0x02a8, B:110:0x02af, B:112:0x02b9, B:114:0x02c9, B:122:0x02dd, B:124:0x0319, B:127:0x035e, B:129:0x036a, B:131:0x03b7, B:141:0x03c9, B:143:0x03cc, B:144:0x03dc, B:146:0x03e1, B:147:0x03fb, B:123:0x02fb, B:125:0x031d, B:126:0x033e, B:107:0x029e, B:101:0x0281, B:95:0x0227, B:130:0x03b4, B:137:0x03bf, B:138:0x03c4), top: B:173:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x0093, IOException -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #17 {IOException -> 0x0098, all -> 0x0093, blocks: (B:18:0x005b, B:20:0x0067, B:32:0x00a3), top: B:174:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[Catch: all -> 0x00fe, IOException -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #13 {IOException -> 0x0104, all -> 0x00fe, blocks: (B:37:0x00b3, B:39:0x00ba, B:41:0x00c6, B:43:0x00f1, B:49:0x0112, B:51:0x0117, B:57:0x013b, B:67:0x0177), top: B:182:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8 A[Catch: all -> 0x01a8, IOException -> 0x01ae, TryCatch #14 {IOException -> 0x01ae, all -> 0x01a8, blocks: (B:72:0x01a1, B:84:0x01c0, B:86:0x01c8, B:88:0x01d4), top: B:180:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0279 A[ADDED_TO_REGION] */
    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void generateNormalAppearance() {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDFreeTextAppearanceHandler.generateNormalAppearance():void");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    /* renamed from: w */
    public final void m32336w(PDAnnotationMarkup pDAnnotationMarkup) {
        PDDocument pDDocument;
        String defaultAppearance = pDAnnotationMarkup.getDefaultAppearance();
        if (defaultAppearance == null && (pDDocument = this.document) != null && pDDocument.getDocumentCatalog().getAcroForm() != null) {
            defaultAppearance = this.document.getDocumentCatalog().getAcroForm().getDefaultAppearance();
        }
        if (defaultAppearance == null) {
            return;
        }
        try {
            PDFStreamParser pDFStreamParser = new PDFStreamParser(defaultAppearance.getBytes(Charsets.US_ASCII));
            COSArray cOSArray = new COSArray();
            COSArray cOSArray2 = new COSArray();
            while (true) {
                Object parseNextToken = pDFStreamParser.parseNextToken();
                if (parseNextToken == null) {
                    break;
                } else if (parseNextToken instanceof Operator) {
                    if (!OperatorName.SET_FONT_AND_SIZE.equals(((Operator) parseNextToken).getName())) {
                        cOSArray = cOSArray2;
                    }
                    cOSArray2 = cOSArray;
                    cOSArray = new COSArray();
                } else {
                    cOSArray.add((COSBase) parseNextToken);
                }
            }
            if (cOSArray2.size() >= 2) {
                COSBase cOSBase = cOSArray2.get(0);
                if (cOSBase instanceof COSName) {
                    this.f60595d = (COSName) cOSBase;
                }
                COSBase cOSBase2 = cOSArray2.get(1);
                if (cOSBase2 instanceof COSNumber) {
                    this.f60594c = ((COSNumber) cOSBase2).floatValue();
                }
            }
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Problem parsing /DA, will use default 'Helv 10'", e);
        }
    }

    /* renamed from: x */
    public final PDColor m32335x(PDAnnotationMarkup pDAnnotationMarkup) {
        PDColor pDColor;
        PDColor pDColor2 = new PDColor(new float[]{0.0f}, PDDeviceGray.INSTANCE);
        String defaultAppearance = pDAnnotationMarkup.getDefaultAppearance();
        if (defaultAppearance == null) {
            return pDColor2;
        }
        try {
            PDFStreamParser pDFStreamParser = new PDFStreamParser(defaultAppearance.getBytes(Charsets.US_ASCII));
            COSArray cOSArray = new COSArray();
            Operator operator = null;
            COSArray cOSArray2 = null;
            for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
                if (parseNextToken instanceof Operator) {
                    Operator operator2 = (Operator) parseNextToken;
                    String name = operator2.getName();
                    if (!OperatorName.NON_STROKING_GRAY.equals(name) && !OperatorName.NON_STROKING_RGB.equals(name) && !OperatorName.NON_STROKING_CMYK.equals(name)) {
                        cOSArray = cOSArray2;
                        cOSArray2 = cOSArray;
                        cOSArray = new COSArray();
                    }
                    operator = operator2;
                    cOSArray2 = cOSArray;
                    cOSArray = new COSArray();
                } else {
                    cOSArray.add((COSBase) parseNextToken);
                }
            }
            if (operator != null) {
                String name2 = operator.getName();
                if (OperatorName.NON_STROKING_GRAY.equals(name2)) {
                    pDColor = new PDColor(cOSArray2, PDDeviceGray.INSTANCE);
                } else if (OperatorName.NON_STROKING_RGB.equals(name2)) {
                    pDColor = new PDColor(cOSArray2, PDDeviceRGB.INSTANCE);
                } else {
                    OperatorName.NON_STROKING_CMYK.equals(name2);
                    return pDColor2;
                }
                return pDColor;
            }
            return pDColor2;
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Problem parsing /DA, will use default black", e);
            return pDColor2;
        }
    }

    public PDFreeTextAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
        this.f60594c = 10.0f;
        this.f60595d = COSName.HELV;
    }
}
