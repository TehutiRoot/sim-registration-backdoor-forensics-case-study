package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDFTemplateCreator {

    /* renamed from: a */
    public final PDFTemplateBuilder f60650a;

    public PDFTemplateCreator(PDFTemplateBuilder pDFTemplateBuilder) {
        this.f60650a = pDFTemplateBuilder;
    }

    /* renamed from: a */
    public final InputStream m32273a(COSDocument cOSDocument) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        COSWriter cOSWriter = new COSWriter(byteArrayOutputStream);
        cOSWriter.write(cOSDocument);
        cOSWriter.close();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public InputStream buildPDF(PDVisibleSignDesigner pDVisibleSignDesigner) throws IOException {
        PDFTemplateStructure structure = this.f60650a.getStructure();
        this.f60650a.createProcSetArray();
        this.f60650a.createPage(pDVisibleSignDesigner);
        PDPage page = structure.getPage();
        this.f60650a.createTemplate(page);
        PDDocument template = structure.getTemplate();
        this.f60650a.createAcroForm(template);
        PDAcroForm acroForm = structure.getAcroForm();
        this.f60650a.createSignatureField(acroForm);
        PDSignatureField signatureField = structure.getSignatureField();
        this.f60650a.createSignature(signatureField, page, "");
        this.f60650a.createAcroFormDictionary(acroForm, signatureField);
        this.f60650a.createAffineTransform(pDVisibleSignDesigner.getTransform());
        AffineTransform affineTransform = structure.getAffineTransform();
        this.f60650a.createSignatureRectangle(signatureField, pDVisibleSignDesigner);
        this.f60650a.createFormatterRectangle(pDVisibleSignDesigner.getFormatterRectangleParameters());
        PDRectangle formatterRectangle = structure.getFormatterRectangle();
        this.f60650a.createSignatureImage(template, pDVisibleSignDesigner.getImage());
        this.f60650a.createHolderFormStream(template);
        PDStream holderFormStream = structure.getHolderFormStream();
        this.f60650a.createHolderFormResources();
        PDResources holderFormResources = structure.getHolderFormResources();
        this.f60650a.createHolderForm(holderFormResources, holderFormStream, formatterRectangle);
        this.f60650a.createAppearanceDictionary(structure.getHolderForm(), signatureField);
        this.f60650a.createInnerFormStream(template);
        this.f60650a.createInnerFormResource();
        PDResources innerFormResources = structure.getInnerFormResources();
        this.f60650a.createInnerForm(innerFormResources, structure.getInnerFormStream(), formatterRectangle);
        PDFormXObject innerForm = structure.getInnerForm();
        this.f60650a.insertInnerFormToHolderResources(innerForm, holderFormResources);
        this.f60650a.createImageFormStream(template);
        PDStream imageFormStream = structure.getImageFormStream();
        this.f60650a.createImageFormResources();
        PDResources imageFormResources = structure.getImageFormResources();
        this.f60650a.createImageForm(imageFormResources, innerFormResources, imageFormStream, formatterRectangle, affineTransform, structure.getImage());
        this.f60650a.createBackgroundLayerForm(innerFormResources, formatterRectangle);
        this.f60650a.injectProcSetArray(innerForm, page, innerFormResources, imageFormResources, holderFormResources, structure.getProcSet());
        this.f60650a.injectAppearanceStreams(holderFormStream, imageFormStream, imageFormStream, structure.getImageFormName(), structure.getImageName(), structure.getInnerFormName(), pDVisibleSignDesigner);
        this.f60650a.createVisualSignature(template);
        this.f60650a.createWidgetDictionary(signatureField, holderFormResources);
        InputStream m32273a = m32273a(structure.getVisualSignature());
        StringBuilder sb = new StringBuilder();
        sb.append("stream returning started, size= ");
        sb.append(m32273a.available());
        template.close();
        return m32273a;
    }

    public PDFTemplateStructure getPdfStructure() {
        return this.f60650a.getStructure();
    }
}