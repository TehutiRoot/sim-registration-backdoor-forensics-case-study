package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes5.dex */
public class AccessPermission {

    /* renamed from: a */
    public int f60311a;

    /* renamed from: b */
    public boolean f60312b;

    public AccessPermission() {
        this.f60312b = false;
        this.f60311a = -4;
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
    public final boolean m32511a(int i) {
        if (((1 << (i - 1)) & this.f60311a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m32510b(int i, boolean z) {
        int i2;
        int i3 = this.f60311a;
        if (z) {
            i2 = (1 << (i - 1)) | i3;
        } else {
            i2 = (~(1 << (i - 1))) & i3;
        }
        this.f60311a = i2;
        if (((1 << (i - 1)) & i2) != 0) {
            return true;
        }
        return false;
    }

    public boolean canAssembleDocument() {
        return m32511a(11);
    }

    public boolean canExtractContent() {
        return m32511a(5);
    }

    public boolean canExtractForAccessibility() {
        return m32511a(10);
    }

    public boolean canFillInForm() {
        return m32511a(9);
    }

    public boolean canModify() {
        return m32511a(4);
    }

    public boolean canModifyAnnotations() {
        return m32511a(6);
    }

    public boolean canPrint() {
        return m32511a(3);
    }

    public boolean canPrintDegraded() {
        return m32511a(12);
    }

    public int getPermissionBytes() {
        return this.f60311a;
    }

    public int getPermissionBytesForPublicKey() {
        m32510b(1, true);
        m32510b(7, false);
        m32510b(8, false);
        for (int i = 13; i <= 32; i++) {
            m32510b(i, false);
        }
        return this.f60311a;
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
        return this.f60312b;
    }

    public void setCanAssembleDocument(boolean z) {
        if (!this.f60312b) {
            m32510b(11, z);
        }
    }

    public void setCanExtractContent(boolean z) {
        if (!this.f60312b) {
            m32510b(5, z);
        }
    }

    public void setCanExtractForAccessibility(boolean z) {
        if (!this.f60312b) {
            m32510b(10, z);
        }
    }

    public void setCanFillInForm(boolean z) {
        if (!this.f60312b) {
            m32510b(9, z);
        }
    }

    public void setCanModify(boolean z) {
        if (!this.f60312b) {
            m32510b(4, z);
        }
    }

    public void setCanModifyAnnotations(boolean z) {
        if (!this.f60312b) {
            m32510b(6, z);
        }
    }

    public void setCanPrint(boolean z) {
        if (!this.f60312b) {
            m32510b(3, z);
        }
    }

    public void setCanPrintDegraded(boolean z) {
        if (!this.f60312b) {
            m32510b(12, z);
        }
    }

    public void setReadOnly() {
        this.f60312b = true;
    }

    public AccessPermission(byte[] bArr) {
        this.f60312b = false;
        this.f60311a = 0;
        int i = (bArr[0] & 255) << 8;
        this.f60311a = i;
        int i2 = (i | (bArr[1] & 255)) << 8;
        this.f60311a = i2;
        int i3 = (i2 | (bArr[2] & 255)) << 8;
        this.f60311a = i3;
        this.f60311a = (bArr[3] & 255) | i3;
    }

    public AccessPermission(int i) {
        this.f60312b = false;
        this.f60311a = i;
    }
}