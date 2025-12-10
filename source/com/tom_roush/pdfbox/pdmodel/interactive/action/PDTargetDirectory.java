package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination;

/* loaded from: classes5.dex */
public class PDTargetDirectory implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60576a;

    public PDTargetDirectory() {
        this.f60576a = new COSDictionary();
    }

    public int getAnnotationIndex() {
        COSBase dictionaryObject = this.f60576a.getDictionaryObject(COSName.f59748A);
        if (dictionaryObject instanceof COSInteger) {
            return ((COSInteger) dictionaryObject).intValue();
        }
        return -1;
    }

    public String getAnnotationName() {
        COSBase dictionaryObject = this.f60576a.getDictionaryObject(COSName.f59748A);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        return null;
    }

    public String getFilename() {
        return this.f60576a.getString(COSName.f59807N);
    }

    public PDNamedDestination getNamedDestination() {
        COSBase dictionaryObject = this.f60576a.getDictionaryObject(COSName.f59815P);
        if (dictionaryObject instanceof COSString) {
            return new PDNamedDestination((COSString) dictionaryObject);
        }
        return null;
    }

    public int getPageNumber() {
        COSBase dictionaryObject = this.f60576a.getDictionaryObject(COSName.f59815P);
        if (dictionaryObject instanceof COSInteger) {
            return ((COSInteger) dictionaryObject).intValue();
        }
        return -1;
    }

    public COSName getRelationship() {
        COSBase item = this.f60576a.getItem(COSName.f59819R);
        if (item instanceof COSName) {
            return (COSName) item;
        }
        return null;
    }

    public PDTargetDirectory getTargetDirectory() {
        COSBase dictionaryObject = this.f60576a.getDictionaryObject(COSName.f59833T);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDTargetDirectory((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public void setAnnotationIndex(int i) {
        if (i < 0) {
            this.f60576a.removeItem(COSName.f59748A);
        } else {
            this.f60576a.setInt(COSName.f59748A, i);
        }
    }

    public void setAnnotationName(String str) {
        this.f60576a.setString(COSName.f59748A, str);
    }

    public void setFilename(String str) {
        this.f60576a.setString(COSName.f59807N, str);
    }

    public void setNamedDestination(PDNamedDestination pDNamedDestination) {
        if (pDNamedDestination == null) {
            this.f60576a.removeItem(COSName.f59815P);
        } else {
            this.f60576a.setItem(COSName.f59815P, pDNamedDestination);
        }
    }

    public void setPageNumber(int i) {
        if (i < 0) {
            this.f60576a.removeItem(COSName.f59815P);
        } else {
            this.f60576a.setInt(COSName.f59815P, i);
        }
    }

    public void setRelationship(COSName cOSName) {
        if (!COSName.f59815P.equals(cOSName) && !COSName.f59759C.equals(cOSName)) {
            throw new IllegalArgumentException("The only valid are P or C, not " + cOSName.getName());
        }
        this.f60576a.setItem(COSName.f59819R, (COSBase) cOSName);
    }

    public void setTargetDirectory(PDTargetDirectory pDTargetDirectory) {
        this.f60576a.setItem(COSName.f59833T, pDTargetDirectory);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60576a;
    }

    public PDTargetDirectory(COSDictionary cOSDictionary) {
        this.f60576a = cOSDictionary;
    }
}
