package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class PDDocumentInformation implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60114a;

    public PDDocumentInformation() {
        this.f60114a = new COSDictionary();
    }

    public String getAuthor() {
        return this.f60114a.getString(COSName.AUTHOR);
    }

    public Calendar getCreationDate() {
        return this.f60114a.getDate(COSName.CREATION_DATE);
    }

    public String getCreator() {
        return this.f60114a.getString(COSName.CREATOR);
    }

    public String getCustomMetadataValue(String str) {
        return this.f60114a.getString(str);
    }

    public String getKeywords() {
        return this.f60114a.getString(COSName.KEYWORDS);
    }

    public Set<String> getMetadataKeys() {
        TreeSet treeSet = new TreeSet();
        for (COSName cOSName : this.f60114a.keySet()) {
            treeSet.add(cOSName.getName());
        }
        return treeSet;
    }

    public Calendar getModificationDate() {
        return this.f60114a.getDate(COSName.MOD_DATE);
    }

    public String getProducer() {
        return this.f60114a.getString(COSName.PRODUCER);
    }

    public Object getPropertyStringValue(String str) {
        return this.f60114a.getString(str);
    }

    public String getSubject() {
        return this.f60114a.getString(COSName.SUBJECT);
    }

    public String getTitle() {
        return this.f60114a.getString(COSName.TITLE);
    }

    public String getTrapped() {
        return this.f60114a.getNameAsString(COSName.TRAPPED);
    }

    public void setAuthor(String str) {
        this.f60114a.setString(COSName.AUTHOR, str);
    }

    public void setCreationDate(Calendar calendar) {
        this.f60114a.setDate(COSName.CREATION_DATE, calendar);
    }

    public void setCreator(String str) {
        this.f60114a.setString(COSName.CREATOR, str);
    }

    public void setCustomMetadataValue(String str, String str2) {
        this.f60114a.setString(str, str2);
    }

    public void setKeywords(String str) {
        this.f60114a.setString(COSName.KEYWORDS, str);
    }

    public void setModificationDate(Calendar calendar) {
        this.f60114a.setDate(COSName.MOD_DATE, calendar);
    }

    public void setProducer(String str) {
        this.f60114a.setString(COSName.PRODUCER, str);
    }

    public void setSubject(String str) {
        this.f60114a.setString(COSName.SUBJECT, str);
    }

    public void setTitle(String str) {
        this.f60114a.setString(COSName.TITLE, str);
    }

    public void setTrapped(String str) {
        if (str != null && !str.equals("True") && !str.equals("False") && !str.equals(OpenTypeScript.UNKNOWN)) {
            throw new IllegalArgumentException("Valid values for trapped are 'True', 'False', or 'Unknown'");
        }
        this.f60114a.setName(COSName.TRAPPED, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60114a;
    }

    public PDDocumentInformation(COSDictionary cOSDictionary) {
        this.f60114a = cOSDictionary;
    }
}
