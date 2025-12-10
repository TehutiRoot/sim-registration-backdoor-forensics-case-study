package p000;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* renamed from: Ms */
/* loaded from: classes4.dex */
public abstract class AbstractC0892Ms {
    /* renamed from: a */
    public static ResourcesLoader m67307a(Context context, Map map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] m67066i = AbstractC1035Os.m67066i(context, map);
            StringBuilder sb = new StringBuilder();
            sb.append("Table created, length: ");
            sb.append(m67066i.length);
            if (m67066i.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
            } catch (Throwable th2) {
                th = th2;
                fileDescriptor = null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                fileOutputStream.write(m67066i);
                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                try {
                    AbstractC0826Ls.m67488a();
                    ResourcesLoader m67657a = AbstractC0757Ks.m67657a();
                    loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                    m67657a.addProvider(loadFromTable);
                    if (dup != null) {
                        dup.close();
                    }
                    fileOutputStream.close();
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return m67657a;
                } catch (Throwable th3) {
                    if (dup != null) {
                        try {
                            dup.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                th = th5;
                if (fileDescriptor != null) {
                    Os.close(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}