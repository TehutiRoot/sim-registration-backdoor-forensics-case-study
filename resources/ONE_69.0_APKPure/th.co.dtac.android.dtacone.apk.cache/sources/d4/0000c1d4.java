package com.tom_roush.pdfbox.pdmodel.encryption;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class PublicKeyProtectionPolicy extends ProtectionPolicy {

    /* renamed from: c */
    public final List f60320c = new ArrayList();

    /* renamed from: d */
    public X509Certificate f60321d;

    public void addRecipient(PublicKeyRecipient publicKeyRecipient) {
        this.f60320c.add(publicKeyRecipient);
    }

    public X509Certificate getDecryptionCertificate() {
        return this.f60321d;
    }

    public int getNumberOfRecipients() {
        return this.f60320c.size();
    }

    public Iterator<PublicKeyRecipient> getRecipientsIterator() {
        return this.f60320c.iterator();
    }

    public boolean removeRecipient(PublicKeyRecipient publicKeyRecipient) {
        return this.f60320c.remove(publicKeyRecipient);
    }

    public void setDecryptionCertificate(X509Certificate x509Certificate) {
        this.f60321d = x509Certificate;
    }
}