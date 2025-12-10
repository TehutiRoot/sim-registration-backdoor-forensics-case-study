package com.tom_roush.pdfbox.util;

import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class Version {
    public static String getVersion() {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        try {
            bufferedInputStream = new BufferedInputStream(Version.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/version.properties"));
        } catch (IOException unused) {
            bufferedInputStream = null;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th2 = th3;
        }
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            String property = properties.getProperty("pdfbox.version", null);
            IOUtils.closeQuietly(bufferedInputStream);
            return property;
        } catch (IOException unused2) {
            IOUtils.closeQuietly(bufferedInputStream);
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            IOUtils.closeQuietly(bufferedInputStream);
            throw th2;
        }
    }
}
