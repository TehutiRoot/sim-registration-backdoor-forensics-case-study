package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDWindowsLaunchParams implements COSObjectable {
    public static final String OPERATION_OPEN = "open";
    public static final String OPERATION_PRINT = "print";
    protected COSDictionary params;

    public PDWindowsLaunchParams() {
        this.params = new COSDictionary();
    }

    public String getDirectory() {
        return this.params.getString(COSName.f59770D);
    }

    public String getExecuteParam() {
        return this.params.getString(COSName.f59815P);
    }

    public String getFilename() {
        return this.params.getString(COSName.f59782F);
    }

    public String getOperation() {
        return this.params.getString(COSName.f59809O, OPERATION_OPEN);
    }

    public void setDirectory(String str) {
        this.params.setString(COSName.f59770D, str);
    }

    public void setExecuteParam(String str) {
        this.params.setString(COSName.f59815P, str);
    }

    public void setFilename(String str) {
        this.params.setString(COSName.f59782F, str);
    }

    public void setOperation(String str) {
        this.params.setString(COSName.f59770D, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.params;
    }

    public PDWindowsLaunchParams(COSDictionary cOSDictionary) {
        this.params = cOSDictionary;
    }
}
