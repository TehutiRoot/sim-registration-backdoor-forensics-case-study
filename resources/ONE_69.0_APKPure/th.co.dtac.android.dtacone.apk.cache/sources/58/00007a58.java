package ch.qos.logback.core.net;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/* loaded from: classes.dex */
public class LoginAuthenticator extends Authenticator {

    /* renamed from: a */
    public String f39863a;

    /* renamed from: b */
    public String f39864b;

    public LoginAuthenticator(String str, String str2) {
        this.f39863a = str;
        this.f39864b = str2;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.f39863a, this.f39864b);
    }
}