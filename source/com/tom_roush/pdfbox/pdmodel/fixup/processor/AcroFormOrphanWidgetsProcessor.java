package com.tom_roush.pdfbox.pdmodel.fixup.processor;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.font.FontMappers;
import com.tom_roush.pdfbox.pdmodel.font.FontMapping;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDFieldFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDVariableText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class AcroFormOrphanWidgetsProcessor extends AbstractProcessor {
    public AcroFormOrphanWidgetsProcessor(PDDocument pDDocument) {
        super(pDDocument);
    }

    /* renamed from: a */
    public final void m32467a(PDResources pDResources, PDAnnotation pDAnnotation) {
        PDAppearanceStream normalAppearanceStream = pDAnnotation.getNormalAppearanceStream();
        if (normalAppearanceStream != null && normalAppearanceStream.getResources() != null) {
            PDResources resources = normalAppearanceStream.getResources();
            for (COSName cOSName : resources.getFontNames()) {
                if (!cOSName.getName().startsWith(Marker.ANY_NON_NULL_MARKER)) {
                    try {
                        if (pDResources.getFont(cOSName) == null) {
                            pDResources.put(cOSName, resources.getFont(cOSName));
                            StringBuilder sb = new StringBuilder();
                            sb.append("qdded font resource to AcroForm from widget for font name ");
                            sb.append(cOSName.getName());
                        }
                    } catch (IOException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unable to add font to AcroForm for font name ");
                        sb2.append(cOSName.getName());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("font resource for widget was a subsetted font - ignored: ");
                    sb3.append(cOSName.getName());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m32466b(PDResources pDResources, PDVariableText pDVariableText) {
        String defaultAppearance = pDVariableText.getDefaultAppearance();
        if (defaultAppearance.startsWith(RemoteSettings.FORWARD_SLASH_STRING) && defaultAppearance.length() > 1) {
            COSName pDFName = COSName.getPDFName(defaultAppearance.substring(1, defaultAppearance.indexOf(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)));
            if (pDResources != null) {
                try {
                    if (pDResources.getFont(pDFName) == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("trying to add missing font resource for field ");
                        sb.append(pDVariableText.getFullyQualifiedName());
                        FontMapping<TrueTypeFont> trueTypeFont = FontMappers.instance().getTrueTypeFont(pDFName.getName(), null);
                        if (trueTypeFont != null) {
                            PDType0Font load = PDType0Font.load(this.document, trueTypeFont.getFont(), false);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("looked up font for ");
                            sb2.append(pDFName.getName());
                            sb2.append(" - found ");
                            sb2.append(trueTypeFont.getFont().getName());
                            pDResources.put(pDFName, load);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("no suitable font found for field ");
                            sb3.append(pDVariableText.getFullyQualifiedName());
                            sb3.append(" for font name ");
                            sb3.append(pDFName.getName());
                        }
                    }
                } catch (IOException e) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unable to handle font resources for field ");
                    sb4.append(pDVariableText.getFullyQualifiedName());
                    sb4.append(": ");
                    sb4.append(e.getMessage());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m32465c(PDAcroForm pDAcroForm, List list, List list2, Map map) {
        PDResources defaultResources = pDAcroForm.getDefaultResources();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            PDAnnotation pDAnnotation = (PDAnnotation) it.next();
            if (pDAnnotation instanceof PDAnnotationWidget) {
                m32467a(defaultResources, pDAnnotation);
                if (pDAnnotation.getCOSObject().getCOSDictionary(COSName.PARENT) != null) {
                    PDField m32463e = m32463e(pDAcroForm, (PDAnnotationWidget) pDAnnotation, map);
                    if (m32463e != null) {
                        list.add(m32463e);
                    }
                } else {
                    list.add(PDFieldFactory.createField(pDAcroForm, pDAnnotation.getCOSObject(), null));
                }
            }
        }
    }

    /* renamed from: d */
    public final void m32464d(PDAcroForm pDAcroForm) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<PDPage> it = this.document.getPages().iterator();
        while (it.hasNext()) {
            try {
                m32465c(pDAcroForm, arrayList, it.next().getAnnotations(), hashMap);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("couldn't read annotations for page ");
                sb.append(e.getMessage());
            }
        }
        pDAcroForm.setFields(arrayList);
        Iterator<PDField> it2 = pDAcroForm.getFieldTree().iterator();
        while (it2.hasNext()) {
            PDField next = it2.next();
            if (next instanceof PDVariableText) {
                m32466b(pDAcroForm.getDefaultResources(), (PDVariableText) next);
            }
        }
    }

    /* renamed from: e */
    public final PDField m32463e(PDAcroForm pDAcroForm, PDAnnotationWidget pDAnnotationWidget, Map map) {
        COSDictionary cOSDictionary = pDAnnotationWidget.getCOSObject().getCOSDictionary(COSName.PARENT);
        do {
            COSName cOSName = COSName.PARENT;
            if (cOSDictionary.containsKey(cOSName)) {
                cOSDictionary = cOSDictionary.getCOSDictionary(cOSName);
            } else if (map.get(cOSDictionary.getString(COSName.f59833T)) != null) {
                return null;
            } else {
                PDField createField = PDFieldFactory.createField(pDAcroForm, cOSDictionary, null);
                if (createField != null) {
                    map.put(createField.getFullyQualifiedName(), createField);
                }
                return createField;
            }
        } while (cOSDictionary != null);
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.fixup.processor.PDDocumentProcessor
    public void process() {
        PDAcroForm acroForm = this.document.getDocumentCatalog().getAcroForm(null);
        if (acroForm != null) {
            m32464d(acroForm);
        }
    }
}
