package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes5.dex */
public final class StandardProtectionPolicy extends ProtectionPolicy {

    /* renamed from: c */
    public AccessPermission f60326c;

    /* renamed from: d */
    public String f60327d;

    /* renamed from: e */
    public String f60328e;

    public StandardProtectionPolicy(String str, String str2, AccessPermission accessPermission) {
        this.f60327d = str;
        this.f60328e = str2;
        this.f60326c = accessPermission;
    }

    public String getOwnerPassword() {
        return this.f60327d;
    }

    public AccessPermission getPermissions() {
        return this.f60326c;
    }

    public String getUserPassword() {
        return this.f60328e;
    }

    public void setOwnerPassword(String str) {
        this.f60327d = str;
    }

    public void setPermissions(AccessPermission accessPermission) {
        this.f60326c = accessPermission;
    }

    public void setUserPassword(String str) {
        this.f60328e = str;
    }
}
