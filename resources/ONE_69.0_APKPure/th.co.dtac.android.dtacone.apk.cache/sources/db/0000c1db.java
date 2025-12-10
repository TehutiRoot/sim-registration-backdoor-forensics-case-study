package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes5.dex */
public final class StandardProtectionPolicy extends ProtectionPolicy {

    /* renamed from: c */
    public AccessPermission f60338c;

    /* renamed from: d */
    public String f60339d;

    /* renamed from: e */
    public String f60340e;

    public StandardProtectionPolicy(String str, String str2, AccessPermission accessPermission) {
        this.f60339d = str;
        this.f60340e = str2;
        this.f60338c = accessPermission;
    }

    public String getOwnerPassword() {
        return this.f60339d;
    }

    public AccessPermission getPermissions() {
        return this.f60338c;
    }

    public String getUserPassword() {
        return this.f60340e;
    }

    public void setOwnerPassword(String str) {
        this.f60339d = str;
    }

    public void setPermissions(AccessPermission accessPermission) {
        this.f60338c = accessPermission;
    }

    public void setUserPassword(String str) {
        this.f60340e = str;
    }
}