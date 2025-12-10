package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdfwriter.ContentStreamWriter;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType3CharProc;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.font.PDVectorFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.a */
/* loaded from: classes5.dex */
public class C9966a {

    /* renamed from: d */
    public static final Operator f60726d = Operator.getOperator(OperatorName.BEGIN_MARKED_CONTENT);

    /* renamed from: e */
    public static final Operator f60727e = Operator.getOperator(OperatorName.END_MARKED_CONTENT);

    /* renamed from: f */
    public static final float[] f60728f = {0.6f, 0.75686276f, 0.84313726f};

    /* renamed from: a */
    public final PDVariableText f60729a;

    /* renamed from: b */
    public C20251hh1 f60730b;

    /* renamed from: c */
    public String f60731c;

    public C9966a(PDVariableText pDVariableText) {
        this.f60729a = pDVariableText;
        m32176x();
        try {
            this.f60730b = pDVariableText.m32229d();
        } catch (IOException e) {
            throw new IOException("Could not process default appearance string '" + pDVariableText.getDefaultAppearance() + "' for field '" + pDVariableText.getFullyQualifiedName() + OperatorName.SHOW_TEXT_LINE, e);
        }
    }

    /* renamed from: m */
    public static boolean m32187m(PDAppearanceEntry pDAppearanceEntry) {
        PDRectangle bBox;
        if (pDAppearanceEntry == null || !pDAppearanceEntry.isStream() || (bBox = pDAppearanceEntry.getAppearanceStream().getBBox()) == null || Math.abs(bBox.getWidth()) <= 0.0f || Math.abs(bBox.getHeight()) <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final PDRectangle m32199a(PDRectangle pDRectangle, float f) {
        float lowerLeftX = pDRectangle.getLowerLeftX() + f;
        float lowerLeftY = pDRectangle.getLowerLeftY() + f;
        float f2 = f * 2.0f;
        return new PDRectangle(lowerLeftX, lowerLeftY, pDRectangle.getWidth() - f2, pDRectangle.getHeight() - f2);
    }

    /* renamed from: b */
    public final float m32198b(PDFont pDFont, PDRectangle pDRectangle) {
        float m30782e = this.f60730b.m30782e();
        if (m30782e == 0.0f) {
            if (m32188l()) {
                PlainText plainText = new PlainText(this.f60731c);
                if (plainText.m32228a() == null) {
                    return 12.0f;
                }
                float width = pDRectangle.getWidth() - pDRectangle.getLowerLeftX();
                float f = 4.0f;
                while (f <= 12.0f) {
                    int i = 0;
                    for (PlainText.C9962b c9962b : plainText.m32228a()) {
                        i += c9962b.m32221a(pDFont, f, width).size();
                    }
                    if (pDFont.getBoundingBox().getHeight() * (f / 1000.0f) * i > pDRectangle.getHeight()) {
                        return Math.max(f - 1.0f, 4.0f);
                    }
                    f += 1.0f;
                }
                return Math.min(f, 12.0f);
            }
            float scaleY = pDFont.getFontMatrix().getScaleY() * 1000.0f;
            float width2 = (pDRectangle.getWidth() / (pDFont.getStringWidth(this.f60731c) * pDFont.getFontMatrix().getScaleX())) * pDFont.getFontMatrix().getScaleX() * 1000.0f;
            float capHeight = (pDFont.getFontDescriptor().getCapHeight() + (-pDFont.getFontDescriptor().getDescent())) * pDFont.getFontMatrix().getScaleY();
            if (capHeight <= 0.0f) {
                capHeight = pDFont.getBoundingBox().getHeight() * pDFont.getFontMatrix().getScaleY();
            }
            return Math.min((pDRectangle.getHeight() / capHeight) * scaleY, width2);
        }
        return m30782e;
    }

    /* renamed from: c */
    public final AffineTransform m32197c(PDRectangle pDRectangle, int i) {
        float f;
        if (i == 0) {
            return new AffineTransform();
        }
        float f2 = 0.0f;
        if (i != 90) {
            if (i != 180) {
                if (i == 270) {
                    f = pDRectangle.getUpperRightX();
                }
            } else {
                f2 = pDRectangle.getUpperRightY();
                f = pDRectangle.getUpperRightX();
            }
            return Matrix.getRotateInstance(Math.toRadians(i), f2, f).createAffineTransform();
        }
        f2 = pDRectangle.getUpperRightY();
        f = 0.0f;
        return Matrix.getRotateInstance(Math.toRadians(i), f2, f).createAffineTransform();
    }

    /* renamed from: d */
    public final String m32196d(String str) {
        PDFormFieldAdditionalActions actions = this.f60729a.getActions();
        if (actions == null) {
            return str;
        }
        PDAction f = actions.getF();
        if (f != null && this.f60729a.getAcroForm().getScriptingHandler() != null) {
            return this.f60729a.getAcroForm().getScriptingHandler().format((PDActionJavaScript) f, str);
        }
        return str;
    }

    /* renamed from: e */
    public final int m32195e(PDAnnotationWidget pDAnnotationWidget) {
        return pDAnnotationWidget.getCOSObject().getInt(COSName.f59818Q, this.f60729a.getQ());
    }

    /* renamed from: f */
    public final C20251hh1 m32194f(PDAnnotationWidget pDAnnotationWidget) {
        return new C20251hh1((COSString) pDAnnotationWidget.getCOSObject().getDictionaryObject(COSName.f59771DA), this.f60729a.getAcroForm().getDefaultResources());
    }

    /* renamed from: g */
    public final void m32193g(PDAnnotationWidget pDAnnotationWidget, PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary, PDAppearanceStream pDAppearanceStream) {
        float f;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.f60729a.getAcroForm().m32250c(), pDAppearanceStream, (OutputStream) byteArrayOutputStream);
        if (pDAppearanceCharacteristicsDictionary != null) {
            PDColor background = pDAppearanceCharacteristicsDictionary.getBackground();
            if (background != null) {
                pDPageContentStream.setNonStrokingColor(background);
                PDRectangle m32185o = m32185o(pDAnnotationWidget, pDAppearanceStream);
                pDPageContentStream.addRect(m32185o.getLowerLeftX(), m32185o.getLowerLeftY(), m32185o.getWidth(), m32185o.getHeight());
                pDPageContentStream.fill();
            }
            PDColor borderColour = pDAppearanceCharacteristicsDictionary.getBorderColour();
            if (borderColour != null) {
                pDPageContentStream.setStrokingColor(borderColour);
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            PDBorderStyleDictionary borderStyle = pDAnnotationWidget.getBorderStyle();
            if (borderStyle != null && borderStyle.getWidth() > 0.0f) {
                f = borderStyle.getWidth();
            }
            if (f > 0.0f && borderColour != null) {
                if (f != 1.0f) {
                    pDPageContentStream.setLineWidth(f);
                }
                PDRectangle m32199a = m32199a(m32185o(pDAnnotationWidget, pDAppearanceStream), Math.max(0.5f, f / 2.0f));
                pDPageContentStream.addRect(m32199a.getLowerLeftX(), m32199a.getLowerLeftY(), m32199a.getWidth(), m32199a.getHeight());
                pDPageContentStream.closeAndStroke();
            }
        }
        pDPageContentStream.close();
        byteArrayOutputStream.close();
        m32175y(byteArrayOutputStream.toByteArray(), pDAppearanceStream);
    }

    /* renamed from: h */
    public final void m32192h(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream, OutputStream outputStream) {
        float f;
        float m32183q;
        float f2;
        float f3;
        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.f60729a.getAcroForm().m32250c(), pDAppearanceStream, outputStream);
        PDRectangle m32185o = m32185o(pDAnnotationWidget, pDAppearanceStream);
        if (pDAnnotationWidget.getBorderStyle() != null) {
            f = pDAnnotationWidget.getBorderStyle().getWidth();
        } else {
            f = 0.0f;
        }
        PDRectangle m32199a = m32199a(m32185o, Math.max(1.0f, f));
        PDRectangle m32199a2 = m32199a(m32199a, Math.max(1.0f, f));
        pDPageContentStream.saveGraphicsState();
        pDPageContentStream.addRect(m32199a.getLowerLeftX(), m32199a.getLowerLeftY(), m32199a.getWidth(), m32199a.getHeight());
        pDPageContentStream.clip();
        PDFont m30785b = this.f60730b.m30785b();
        if (m30785b != null) {
            if (m30785b.getName().contains(Marker.ANY_NON_NULL_MARKER)) {
                Log.w("PdfBox-Android", "Font '" + this.f60730b.m30783d().getName() + "' of field '" + this.f60729a.getFullyQualifiedName() + "' contains subsetted font '" + m30785b.getName() + OperatorName.SHOW_TEXT_LINE);
                Log.w("PdfBox-Android", "This may bring trouble with PDField.setValue(), PDAcroForm.flatten() or PDAcroForm.refreshAppearances()");
                Log.w("PdfBox-Android", "You should replace this font with a non-subsetted font:");
                Log.w("PdfBox-Android", "PDFont font = PDType0Font.load(doc, new FileInputStream(fontfile), false);");
                StringBuilder sb = new StringBuilder();
                sb.append("acroForm.getDefaultResources().put(COSName.getPDFName(\"");
                sb.append(this.f60730b.m30783d().getName());
                sb.append("\", font);");
                Log.w("PdfBox-Android", sb.toString());
            }
            float m30782e = this.f60730b.m30782e();
            if (m30782e == 0.0f) {
                m30782e = m32198b(m30785b, m32199a2);
            }
            float f4 = m30782e;
            if (this.f60729a instanceof PDListBox) {
                m32189k(pDPageContentStream, pDAppearanceStream, m30785b, f4);
            }
            pDPageContentStream.beginText();
            this.f60730b.m30773n(pDPageContentStream, f4);
            float f5 = f4 / 1000.0f;
            float height = m30785b.getBoundingBox().getHeight() * f5;
            if (m30785b.getFontDescriptor() != null) {
                f2 = m30785b.getFontDescriptor().getCapHeight() * f5;
                m32183q = m30785b.getFontDescriptor().getDescent();
            } else {
                float m32184p = m32184p(m30785b);
                m32183q = m32183q(m30785b);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("missing font descriptor - resolved Cap/Descent to ");
                sb2.append(m32184p);
                sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb2.append(m32183q);
                f2 = m32184p * f5;
            }
            float f6 = m32183q * f5;
            PDVariableText pDVariableText = this.f60729a;
            if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isMultiline()) {
                f3 = m32199a2.getUpperRightY() - height;
            } else if (f2 > m32199a.getHeight()) {
                f3 = m32199a.getLowerLeftY() + (-f6);
            } else {
                float lowerLeftY = m32199a.getLowerLeftY() + ((m32199a.getHeight() - f2) / 2.0f);
                float f7 = -f6;
                if (lowerLeftY - m32199a.getLowerLeftY() < f7) {
                    f3 = Math.min(f7 + m32199a2.getLowerLeftY(), Math.max(lowerLeftY, (m32199a2.getHeight() - m32199a2.getLowerLeftY()) - f2));
                } else {
                    f3 = lowerLeftY;
                }
            }
            float lowerLeftX = m32199a2.getLowerLeftX();
            if (m32178v()) {
                m32191i(pDPageContentStream, pDAppearanceStream, m30785b, f4);
            } else if (this.f60729a instanceof PDListBox) {
                m32190j(pDPageContentStream, pDAppearanceStream, m32199a2, m30785b, f4);
            } else {
                PlainText plainText = new PlainText(this.f60731c);
                C10443i6 c10443i6 = new C10443i6();
                c10443i6.m30671d(m30785b);
                c10443i6.m30670e(f4);
                c10443i6.m30669f(m30785b.getBoundingBox().getHeight() * f5);
                new PlainTextFormatter.C9965b(pDPageContentStream).m32204k(c10443i6).m32203l(plainText).m32201n(m32199a2.getWidth()).m32200o(m32188l()).m32205j(lowerLeftX, f3).m32202m(m32195e(pDAnnotationWidget)).m32206i().m32216a();
            }
            pDPageContentStream.endText();
            pDPageContentStream.restoreGraphicsState();
            pDPageContentStream.close();
            return;
        }
        throw new IllegalArgumentException("font is null, check whether /DA entry is incomplete or incorrect");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[LOOP:0: B:10:0x005e->B:11:0x0060, LOOP_END] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32191i(com.tom_roush.pdfbox.pdmodel.PDPageContentStream r11, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream r12, com.tom_roush.pdfbox.pdmodel.font.PDFont r13, float r14) {
        /*
            r10 = this;
            com.tom_roush.pdfbox.pdmodel.interactive.form.PDVariableText r0 = r10.f60729a
            com.tom_roush.pdfbox.pdmodel.interactive.form.PDTextField r0 = (com.tom_roush.pdfbox.pdmodel.interactive.form.PDTextField) r0
            int r0 = r0.getMaxLen()
            com.tom_roush.pdfbox.pdmodel.interactive.form.PDVariableText r1 = r10.f60729a
            int r1 = r1.getQ()
            java.lang.String r2 = r10.f60731c
            int r2 = r2.length()
            int r2 = java.lang.Math.min(r2, r0)
            com.tom_roush.pdfbox.pdmodel.common.PDRectangle r3 = r12.getBBox()
            r4 = 1065353216(0x3f800000, float:1.0)
            com.tom_roush.pdfbox.pdmodel.common.PDRectangle r3 = r10.m32199a(r3, r4)
            com.tom_roush.pdfbox.pdmodel.common.PDRectangle r4 = r12.getBBox()
            float r4 = r4.getWidth()
            float r5 = (float) r0
            float r4 = r4 / r5
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r5 = r13.getFontDescriptor()
            float r5 = r5.getAscent()
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            float r5 = r5 * r14
            float r3 = r3.getLowerLeftY()
            com.tom_roush.pdfbox.pdmodel.common.PDRectangle r12 = r12.getBBox()
            float r12 = r12.getHeight()
            float r12 = r12 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r5
            float r3 = r3 + r12
            float r12 = r4 / r5
            r7 = 2
            if (r1 != r7) goto L55
            int r0 = r0 - r2
        L50:
            float r0 = (float) r0
            float r0 = r0 * r4
            float r12 = r12 + r0
            goto L5b
        L55:
            r8 = 1
            if (r1 != r8) goto L5b
            int r0 = r0 - r2
            int r0 = r0 / r7
            goto L50
        L5b:
            r0 = 0
            r1 = 0
            r7 = 0
        L5e:
            if (r1 >= r2) goto L80
            java.lang.String r8 = r10.f60731c
            int r9 = r1 + 1
            java.lang.String r1 = r8.substring(r1, r9)
            float r8 = r13.getStringWidth(r1)
            float r8 = r8 / r6
            float r8 = r8 * r14
            float r8 = r8 / r5
            float r7 = r7 / r5
            float r12 = r12 + r7
            float r7 = r8 / r5
            float r12 = r12 - r7
            r11.newLineAtOffset(r12, r3)
            r11.showText(r1)
            r12 = r4
            r7 = r8
            r1 = r9
            r3 = 0
            goto L5e
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.form.C9966a.m32191i(com.tom_roush.pdfbox.pdmodel.PDPageContentStream, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream, com.tom_roush.pdfbox.pdmodel.font.PDFont, float):void");
    }

    /* renamed from: j */
    public final void m32190j(PDPageContentStream pDPageContentStream, PDAppearanceStream pDAppearanceStream, PDRectangle pDRectangle, PDFont pDFont, float f) {
        pDPageContentStream.setNonStrokingColor(0.0f);
        int q = this.f60729a.getQ();
        if (q != 1 && q != 2) {
            if (q != 0) {
                throw new IOException("Error: Unknown justification value:" + q);
            }
        } else {
            float width = (pDAppearanceStream.getBBox().getWidth() - ((pDFont.getStringWidth(this.f60731c) / 1000.0f) * f)) - 4.0f;
            if (q == 1) {
                width /= 2.0f;
            }
            pDPageContentStream.newLineAtOffset(width, 0.0f);
        }
        List<String> optionsDisplayValues = ((PDListBox) this.f60729a).getOptionsDisplayValues();
        int size = optionsDisplayValues.size();
        float upperRightY = pDRectangle.getUpperRightY();
        int topIndex = ((PDListBox) this.f60729a).getTopIndex();
        for (int i = topIndex; i < size; i++) {
            if (i == topIndex) {
                upperRightY -= (pDFont.getFontDescriptor().getAscent() / 1000.0f) * f;
            } else {
                upperRightY -= (pDFont.getBoundingBox().getHeight() / 1000.0f) * f;
                pDPageContentStream.beginText();
            }
            pDPageContentStream.newLineAtOffset(pDRectangle.getLowerLeftX(), upperRightY);
            pDPageContentStream.showText(optionsDisplayValues.get(i));
            if (i != size - 1) {
                pDPageContentStream.endText();
            }
        }
    }

    /* renamed from: k */
    public final void m32189k(PDPageContentStream pDPageContentStream, PDAppearanceStream pDAppearanceStream, PDFont pDFont, float f) {
        List<Integer> selectedOptionsIndex = ((PDListBox) this.f60729a).getSelectedOptionsIndex();
        List<String> value = ((PDListBox) this.f60729a).getValue();
        List<String> optionsExportValues = ((PDListBox) this.f60729a).getOptionsExportValues();
        if (!value.isEmpty() && !optionsExportValues.isEmpty() && selectedOptionsIndex.isEmpty()) {
            selectedOptionsIndex = new ArrayList<>();
            for (String str : value) {
                selectedOptionsIndex.add(Integer.valueOf(optionsExportValues.indexOf(str)));
            }
        }
        int topIndex = ((PDListBox) this.f60729a).getTopIndex();
        float height = (pDFont.getBoundingBox().getHeight() * f) / 1000.0f;
        PDRectangle m32199a = m32199a(pDAppearanceStream.getBBox(), 1.0f);
        for (Integer num : selectedOptionsIndex) {
            int intValue = num.intValue();
            float[] fArr = f60728f;
            pDPageContentStream.setNonStrokingColor(fArr[0], fArr[1], fArr[2]);
            pDPageContentStream.addRect(m32199a.getLowerLeftX(), (m32199a.getUpperRightY() - (((intValue - topIndex) + 1) * height)) + 2.0f, m32199a.getWidth(), height);
            pDPageContentStream.fill();
        }
        pDPageContentStream.setNonStrokingColor(0.0f);
    }

    /* renamed from: l */
    public final boolean m32188l() {
        PDVariableText pDVariableText = this.f60729a;
        if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isMultiline()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final PDAppearanceStream m32186n(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceStream pDAppearanceStream = new PDAppearanceStream(this.f60729a.getAcroForm().m32250c());
        int m32181s = m32181s(pDAnnotationWidget);
        PDRectangle rectangle = pDAnnotationWidget.getRectangle();
        PointF transformPoint = Matrix.getRotateInstance(Math.toRadians(m32181s), 0.0f, 0.0f).transformPoint(rectangle.getWidth(), rectangle.getHeight());
        PDRectangle pDRectangle = new PDRectangle(Math.abs(transformPoint.x), Math.abs(transformPoint.y));
        pDAppearanceStream.setBBox(pDRectangle);
        AffineTransform m32197c = m32197c(pDRectangle, m32181s);
        if (!m32197c.isIdentity()) {
            pDAppearanceStream.setMatrix(m32197c);
        }
        pDAppearanceStream.setFormType(1);
        pDAppearanceStream.setResources(new PDResources());
        return pDAppearanceStream;
    }

    /* renamed from: o */
    public final PDRectangle m32185o(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream) {
        PDRectangle bBox = pDAppearanceStream.getBBox();
        if (bBox == null) {
            return pDAnnotationWidget.getRectangle().createRetranslatedRectangle();
        }
        return bBox;
    }

    /* renamed from: p */
    public final float m32184p(PDFont pDFont) {
        return m32182r(pDFont, "H".codePointAt(0));
    }

    /* renamed from: q */
    public final float m32183q(PDFont pDFont) {
        return m32182r(pDFont, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT.codePointAt(0)) - m32182r(pDFont, PDPageLabelRange.STYLE_LETTERS_LOWER.codePointAt(0));
    }

    /* renamed from: r */
    public final float m32182r(PDFont pDFont, int i) {
        Path path = null;
        if (pDFont instanceof PDType3Font) {
            PDType3Font pDType3Font = (PDType3Font) pDFont;
            PDType3CharProc charProc = pDType3Font.getCharProc(i);
            if (charProc != null) {
                BoundingBox boundingBox = pDType3Font.getBoundingBox();
                PDRectangle glyphBBox = charProc.getGlyphBBox();
                if (glyphBBox != null) {
                    glyphBBox.setLowerLeftX(Math.max(boundingBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                    glyphBBox.setLowerLeftY(Math.max(boundingBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                    glyphBBox.setUpperRightX(Math.min(boundingBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                    glyphBBox.setUpperRightY(Math.min(boundingBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                    path = glyphBBox.toGeneralPath();
                }
            }
        } else if (pDFont instanceof PDVectorFont) {
            path = ((PDVectorFont) pDFont).getPath(i);
        } else if (pDFont instanceof PDSimpleFont) {
            PDSimpleFont pDSimpleFont = (PDSimpleFont) pDFont;
            path = pDSimpleFont.getPath(pDSimpleFont.getEncoding().getName(i));
        } else {
            Log.w("PdfBox-Android", "Unknown font class: " + pDFont.getClass());
        }
        if (path == null) {
            return -1.0f;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return rectF.height();
    }

    /* renamed from: s */
    public final int m32181s(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceCharacteristicsDictionary appearanceCharacteristics = pDAnnotationWidget.getAppearanceCharacteristics();
        if (appearanceCharacteristics != null) {
            return appearanceCharacteristics.getRotation();
        }
        return 0;
    }

    /* renamed from: t */
    public final void m32180t(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream) {
        this.f60730b.m30786a(pDAppearanceStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ContentStreamWriter contentStreamWriter = new ContentStreamWriter(byteArrayOutputStream);
        List m32177w = m32177w(pDAppearanceStream);
        Object obj = f60726d;
        int indexOf = m32177w.indexOf(obj);
        if (indexOf == -1) {
            contentStreamWriter.writeTokens(m32177w);
            contentStreamWriter.writeTokens(COSName.f59839TX, obj);
        } else {
            contentStreamWriter.writeTokens(m32177w.subList(0, indexOf + 1));
        }
        m32192h(pDAnnotationWidget, pDAppearanceStream, byteArrayOutputStream);
        Object obj2 = f60727e;
        int indexOf2 = m32177w.indexOf(obj2);
        if (indexOf2 == -1) {
            contentStreamWriter.writeTokens(obj2);
        } else {
            contentStreamWriter.writeTokens(m32177w.subList(indexOf2, m32177w.size()));
        }
        byteArrayOutputStream.close();
        m32175y(byteArrayOutputStream.toByteArray(), pDAppearanceStream);
    }

    /* renamed from: u */
    public void m32179u(String str) {
        PDAppearanceStream pDAppearanceStream;
        this.f60731c = m32196d(str);
        PDVariableText pDVariableText = this.f60729a;
        if ((pDVariableText instanceof PDTextField) && !((PDTextField) pDVariableText).isMultiline()) {
            this.f60731c = this.f60731c.replaceAll("\\u000D\\u000A|[\\u000A\\u000B\\u000C\\u000D\\u0085\\u2028\\u2029]", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        for (PDAnnotationWidget pDAnnotationWidget : this.f60729a.getWidgets()) {
            if (pDAnnotationWidget.getCOSObject().containsKey("PMD")) {
                Log.w("PdfBox-Android", "widget of field " + this.f60729a.getFullyQualifiedName() + " is a PaperMetaData widget, no appearance stream created");
            } else {
                C20251hh1 c20251hh1 = this.f60730b;
                if (pDAnnotationWidget.getCOSObject().getDictionaryObject(COSName.f59771DA) != null) {
                    this.f60730b = m32194f(pDAnnotationWidget);
                }
                if (pDAnnotationWidget.getRectangle() == null) {
                    pDAnnotationWidget.getCOSObject().removeItem(COSName.f59751AP);
                    Log.w("PdfBox-Android", "widget of field " + this.f60729a.getFullyQualifiedName() + " has no rectangle, no appearance stream created");
                } else {
                    PDAppearanceDictionary appearance = pDAnnotationWidget.getAppearance();
                    if (appearance == null) {
                        appearance = new PDAppearanceDictionary();
                        pDAnnotationWidget.setAppearance(appearance);
                    }
                    PDAppearanceEntry normalAppearance = appearance.getNormalAppearance();
                    if (m32187m(normalAppearance)) {
                        pDAppearanceStream = normalAppearance.getAppearanceStream();
                    } else {
                        PDAppearanceStream m32186n = m32186n(pDAnnotationWidget);
                        appearance.setNormalAppearance(m32186n);
                        pDAppearanceStream = m32186n;
                    }
                    PDAppearanceCharacteristicsDictionary appearanceCharacteristics = pDAnnotationWidget.getAppearanceCharacteristics();
                    if (appearanceCharacteristics != null || pDAppearanceStream.getContentStream().getLength() == 0) {
                        m32193g(pDAnnotationWidget, appearanceCharacteristics, pDAppearanceStream);
                    }
                    m32180t(pDAnnotationWidget, pDAppearanceStream);
                    this.f60730b = c20251hh1;
                }
            }
        }
    }

    /* renamed from: v */
    public final boolean m32178v() {
        PDVariableText pDVariableText = this.f60729a;
        if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isComb() && !((PDTextField) this.f60729a).isMultiline() && !((PDTextField) this.f60729a).isPassword() && !((PDTextField) this.f60729a).isFileSelect()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final List m32177w(PDAppearanceStream pDAppearanceStream) {
        PDFStreamParser pDFStreamParser = new PDFStreamParser(pDAppearanceStream);
        pDFStreamParser.parse();
        return pDFStreamParser.getTokens();
    }

    /* renamed from: x */
    public final void m32176x() {
        PDResources resources;
        if (this.f60729a.getAcroForm().getDefaultResources() == null) {
            return;
        }
        PDResources defaultResources = this.f60729a.getAcroForm().getDefaultResources();
        for (PDAnnotationWidget pDAnnotationWidget : this.f60729a.getWidgets()) {
            PDAppearanceStream normalAppearanceStream = pDAnnotationWidget.getNormalAppearanceStream();
            if (normalAppearanceStream != null && (resources = normalAppearanceStream.getResources()) != null) {
                COSDictionary cOSObject = resources.getCOSObject();
                COSName cOSName = COSName.FONT;
                COSDictionary cOSDictionary = cOSObject.getCOSDictionary(cOSName);
                COSDictionary cOSDictionary2 = defaultResources.getCOSObject().getCOSDictionary(cOSName);
                for (COSName cOSName2 : resources.getFontNames()) {
                    try {
                        if (defaultResources.getFont(cOSName2) == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Adding font resource ");
                            sb.append(cOSName2);
                            sb.append(" from widget to AcroForm");
                            cOSDictionary2.setItem(cOSName2, cOSDictionary.getItem(cOSName2));
                        }
                    } catch (IOException unused) {
                        Log.w("PdfBox-Android", "Unable to match field level font with AcroForm font");
                    }
                }
            }
        }
    }

    /* renamed from: y */
    public final void m32175y(byte[] bArr, PDAppearanceStream pDAppearanceStream) {
        OutputStream createOutputStream = pDAppearanceStream.getCOSObject().createOutputStream();
        createOutputStream.write(bArr);
        createOutputStream.close();
    }
}
