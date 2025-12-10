package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes5.dex */
public class AccessPermission {

    /* renamed from: a */
    public int f60299a;

    /* renamed from: b */
    public boolean f60300b;

    public AccessPermission() {
        this.f60300b = false;
        this.f60299a = -4;
    }

    public static AccessPermission getOwnerAccessPermission() {
        AccessPermission accessPermission = new AccessPermission();
        accessPermission.setCanAssembleDocument(true);
        accessPermission.setCanExtractContent(true);
        accessPermission.setCanExtractForAccessibility(true);
        accessPermission.setCanFillInForm(true);
        accessPermission.setCanModify(true);
        accessPermission.setCanModifyAnnotations(true);
        accessPermission.setCanPrint(true);
        accessPermission.setCanPrintDegraded(true);
        return accessPermission;
    }

    /* renamed from: a */
    public final boolean m32519a(int i) {
        if (((1 << (i - 1)) & this.f60299a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m32518b(int i, boolean z) {
        int i2;
        int i3 = this.f60299a;
        if (z) {
            i2 = (1 << (i - 1)) | i3;
        } else {
            i2 = (~(1 << (i - 1))) & i3;
        }
        this.f60299a = i2;
        if (((1 << (i - 1)) & i2) != 0) {
            return true;
        }
        return false;
    }

    public boolean canAssembleDocument() {
        return m32519a(11);
    }

    public boolean canExtractContent() {
        return m32519a(5);
    }

    public boolean canExtractForAccessibility() {
        return m32519a(10);
    }

    public boolean canFillInForm() {
        return m32519a(9);
    }

    public boolean canModify() {
        return m32519a(4);
    }

    public boolean canModifyAnnotations() {
        return m32519a(6);
    }

    public boolean canPrint() {
        return m32519a(3);
    }

    public boolean canPrintDegraded() {
        return m32519a(12);
    }

    public int getPermissionBytes() {
        return this.f60299a;
    }

    public int getPermissionBytesForPublicKey() {
        m32518b(1, true);
        m32518b(7, false);
        m32518b(8, false);
        for (int i = 13; i <= 32; i++) {
            m32518b(i, false);
        }
        return this.f60299a;
    }

    public boolean hasAnyRevision3PermissionSet() {
        if (canFillInForm() || canExtractForAccessibility() || canAssembleDocument()) {
            return true;
        }
        return canPrintDegraded();
    }

    public boolean isOwnerPermission() {
        if (canAssembleDocument() && canExtractContent() && canExtractForAccessibility() && canFillInForm() && canModify() && canModifyAnnotations() && canPrint() && canPrintDegraded()) {
            return true;
        }
        return false;
    }

    public boolean isReadOnly() {
        return this.f60300b;
    }

    public void setCanAssembleDocument(boolean z) {
        if (!this.f60300b) {
            m32518b(11, z);
        }
    }

    public void setCanExtractContent(boolean z) {
        if (!this.f60300b) {
            m32518b(5, z);
        }
    }

    public void setCanExtractForAccessibility(boolean z) {
        if (!this.f60300b) {
            m32518b(10, z);
        }
    }

    public void setCanFillInForm(boolean z) {
        if (!this.f60300b) {
            m32518b(9, z);
        }
    }

    public void setCanModify(boolean z) {
        if (!this.f60300b) {
            m32518b(4, z);
        }
    }

    public void setCanModifyAnnotations(boolean z) {
        if (!this.f60300b) {
            m32518b(6, z);
        }
    }

    public void setCanPrint(boolean z) {
        if (!this.f60300b) {
            m32518b(3, z);
        }
    }

    public void setCanPrintDegraded(boolean z) {
        if (!this.f60300b) {
            m32518b(12, z);
        }
    }

    public void setReadOnly() {
        this.f60300b = true;
    }

    public AccessPermission(byte[] bArr) {
        this.f60300b = false;
        this.f60299a = 0;
        int i = (bArr[0] & 255) << 8;
        this.f60299a = i;
        int i2 = (i | (bArr[1] & 255)) << 8;
        this.f60299a = i2;
        int i3 = (i2 | (bArr[2] & 255)) << 8;
        this.f60299a = i3;
        this.f60299a = (bArr[3] & 255) | i3;
    }

    public AccessPermission(int i) {
        this.f60300b = false;
        this.f60299a = i;
    }
}
