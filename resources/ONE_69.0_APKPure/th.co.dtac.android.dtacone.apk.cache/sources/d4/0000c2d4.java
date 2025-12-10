package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDNamedDestination extends PDDestination {

    /* renamed from: a */
    public COSBase f60700a;

    public PDNamedDestination(COSString cOSString) {
        this.f60700a = cOSString;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60700a;
    }

    public String getNamedDestination() {
        COSBase cOSBase = this.f60700a;
        if (cOSBase instanceof COSString) {
            return ((COSString) cOSBase).getString();
        }
        if (cOSBase instanceof COSName) {
            return ((COSName) cOSBase).getName();
        }
        return null;
    }

    public void setNamedDestination(String str) throws IOException {
        if (str == null) {
            this.f60700a = null;
        } else {
            this.f60700a = new COSString(str);
        }
    }

    public PDNamedDestination(COSName cOSName) {
        this.f60700a = cOSName;
    }

    public PDNamedDestination() {
    }

    public PDNamedDestination(String str) {
        this.f60700a = new COSString(str);
    }
}