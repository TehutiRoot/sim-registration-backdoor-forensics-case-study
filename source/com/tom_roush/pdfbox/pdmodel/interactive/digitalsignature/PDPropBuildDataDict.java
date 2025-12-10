package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDPropBuildDataDict implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60627a;

    public PDPropBuildDataDict() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60627a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public String getDate() {
        return this.f60627a.getString(COSName.DATE);
    }

    public long getMinimumRevision() {
        return this.f60627a.getLong(COSName.f59843V);
    }

    public String getName() {
        return this.f60627a.getNameAsString(COSName.NAME);
    }

    public boolean getNonEFontNoWarn() {
        return this.f60627a.getBoolean(COSName.NON_EFONT_NO_WARN, true);
    }

    public String getOS() {
        COSDictionary cOSDictionary = this.f60627a;
        COSName cOSName = COSName.f59814OS;
        COSBase item = cOSDictionary.getItem(cOSName);
        if (item instanceof COSArray) {
            return ((COSArray) item).getName(0);
        }
        return this.f60627a.getString(cOSName);
    }

    public boolean getPreRelease() {
        return this.f60627a.getBoolean(COSName.PRE_RELEASE, false);
    }

    public long getRevision() {
        return this.f60627a.getLong(COSName.f59819R);
    }

    public boolean getTrustedMode() {
        return this.f60627a.getBoolean(COSName.TRUSTED_MODE, false);
    }

    public String getVersion() {
        return this.f60627a.getString("REx");
    }

    public void setDate(String str) {
        this.f60627a.setString(COSName.DATE, str);
    }

    public void setMinimumRevision(long j) {
        this.f60627a.setLong(COSName.f59843V, j);
    }

    public void setName(String str) {
        this.f60627a.setName(COSName.NAME, str);
    }

    public void setNonEFontNoWarn(boolean z) {
        this.f60627a.setBoolean(COSName.NON_EFONT_NO_WARN, z);
    }

    public void setOS(String str) {
        if (str == null) {
            this.f60627a.removeItem(COSName.f59814OS);
            return;
        }
        COSDictionary cOSDictionary = this.f60627a;
        COSName cOSName = COSName.f59814OS;
        COSBase item = cOSDictionary.getItem(cOSName);
        if (!(item instanceof COSArray)) {
            item = new COSArray();
            item.setDirect(true);
            this.f60627a.setItem(cOSName, item);
        }
        ((COSArray) item).add(0, COSName.getPDFName(str));
    }

    public void setPreRelease(boolean z) {
        this.f60627a.setBoolean(COSName.PRE_RELEASE, z);
    }

    public void setRevision(long j) {
        this.f60627a.setLong(COSName.f59819R, j);
    }

    public void setTrustedMode(boolean z) {
        this.f60627a.setBoolean(COSName.TRUSTED_MODE, z);
    }

    public void setVersion(String str) {
        this.f60627a.setString("REx", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60627a;
    }

    public PDPropBuildDataDict(COSDictionary cOSDictionary) {
        this.f60627a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
