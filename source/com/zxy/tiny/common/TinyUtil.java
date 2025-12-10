package com.zxy.tiny.common;

import com.zxy.tiny.Tiny;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public final class TinyUtil {
    public static void printExceptionMessage(Throwable th2) {
        if (th2 != null && Tiny.getInstance().isDebug()) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            Logger.m31988e("an exception appeared in the process of compression! exception information:\nthread-name:" + Thread.currentThread().getName() + "\nexception-message:" + th2.getMessage() + "\nstacktrace:" + stringWriter2);
        }
    }
}
