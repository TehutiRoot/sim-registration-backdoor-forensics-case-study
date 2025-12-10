package com.tom_roush.pdfbox.pdmodel.encryption;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes5.dex */
public class SecurityProvider {

    /* renamed from: a */
    public static Provider f60324a;

    public static Provider getProvider() throws IOException {
        if (f60324a == null) {
            try {
                Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
                Security.addProvider(new BouncyCastleProvider());
                f60324a = (Provider) BouncyCastleProvider.class.getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                throw new IOException(e);
            } catch (IllegalAccessException e2) {
                throw new IOException(e2);
            } catch (InstantiationException e3) {
                throw new IOException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IOException(e4);
            } catch (InvocationTargetException e5) {
                throw new IOException(e5);
            }
        }
        return f60324a;
    }

    public static void setProvider(Provider provider) {
        f60324a = provider;
    }
}
