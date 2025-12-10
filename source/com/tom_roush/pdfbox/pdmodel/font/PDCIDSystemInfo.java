package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class PDCIDSystemInfo implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60383a;

    public PDCIDSystemInfo(COSDictionary cOSDictionary) {
        this.f60383a = cOSDictionary;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60383a;
    }

    public String getOrdering() {
        return this.f60383a.getNameAsString(COSName.ORDERING);
    }

    public String getRegistry() {
        return this.f60383a.getNameAsString(COSName.REGISTRY);
    }

    public int getSupplement() {
        return this.f60383a.getInt(COSName.SUPPLEMENT);
    }

    public String toString() {
        return getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + getOrdering() + HelpFormatter.DEFAULT_OPT_PREFIX + getSupplement();
    }
}
