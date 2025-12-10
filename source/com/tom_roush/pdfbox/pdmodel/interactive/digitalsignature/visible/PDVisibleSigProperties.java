package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDVisibleSigProperties {

    /* renamed from: a */
    public String f60667a;

    /* renamed from: b */
    public String f60668b;

    /* renamed from: c */
    public String f60669c;

    /* renamed from: d */
    public boolean f60670d;

    /* renamed from: e */
    public int f60671e;

    /* renamed from: f */
    public int f60672f;

    /* renamed from: g */
    public InputStream f60673g;

    /* renamed from: h */
    public PDVisibleSignDesigner f60674h;

    public void buildSignature() throws IOException {
        setVisibleSignature(new PDFTemplateCreator(new PDVisibleSigBuilder()).buildPDF(getPdVisibleSignature()));
    }

    public int getPage() {
        return this.f60671e;
    }

    public PDVisibleSignDesigner getPdVisibleSignature() {
        return this.f60674h;
    }

    public int getPreferredSize() {
        return this.f60672f;
    }

    public String getSignatureReason() {
        return this.f60669c;
    }

    public String getSignerLocation() {
        return this.f60668b;
    }

    public String getSignerName() {
        return this.f60667a;
    }

    public InputStream getVisibleSignature() {
        return this.f60673g;
    }

    public boolean isVisualSignEnabled() {
        return this.f60670d;
    }

    public PDVisibleSigProperties page(int i) {
        this.f60671e = i;
        return this;
    }

    public PDVisibleSigProperties preferredSize(int i) {
        this.f60672f = i;
        return this;
    }

    public PDVisibleSigProperties setPdVisibleSignature(PDVisibleSignDesigner pDVisibleSignDesigner) {
        this.f60674h = pDVisibleSignDesigner;
        return this;
    }

    public void setVisibleSignature(InputStream inputStream) {
        this.f60673g = inputStream;
    }

    public PDVisibleSigProperties signatureReason(String str) {
        this.f60669c = str;
        return this;
    }

    public PDVisibleSigProperties signerLocation(String str) {
        this.f60668b = str;
        return this;
    }

    public PDVisibleSigProperties signerName(String str) {
        this.f60667a = str;
        return this;
    }

    public PDVisibleSigProperties visualSignEnabled(boolean z) {
        this.f60670d = z;
        return this;
    }
}
