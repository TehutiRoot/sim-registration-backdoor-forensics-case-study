package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class COSBase implements COSObjectable {

    /* renamed from: a */
    public boolean f59726a;

    public abstract Object accept(ICOSVisitor iCOSVisitor) throws IOException;

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this;
    }

    public boolean isDirect() {
        return this.f59726a;
    }

    public void setDirect(boolean z) {
        this.f59726a = z;
    }
}
