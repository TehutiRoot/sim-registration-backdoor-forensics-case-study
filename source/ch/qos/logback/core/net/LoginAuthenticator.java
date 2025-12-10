package ch.qos.logback.core.net;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/* loaded from: classes.dex */
public class LoginAuthenticator extends Authenticator {

    /* renamed from: a */
    public String f39865a;

    /* renamed from: b */
    public String f39866b;

    public LoginAuthenticator(String str, String str2) {
        this.f39865a = str;
        this.f39866b = str2;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.f39865a, this.f39866b);
    }
}
