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
public abstract class AbstractC0905Ms {
    /* renamed from: a */
    public static ResourcesLoader m67264a(Context context, Map map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] m66971i = AbstractC1047Os.m66971i(context, map);
            StringBuilder sb = new StringBuilder();
            sb.append("Table created, length: ");
            sb.append(m66971i.length);
            if (m66971i.length == 0) {
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
                fileOutputStream.write(m66971i);
                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                try {
                    AbstractC0831Ls.m67456a();
                    ResourcesLoader m67578a = AbstractC0767Ks.m67578a();
                    loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                    m67578a.addProvider(loadFromTable);
                    if (dup != null) {
                        dup.close();
                    }
                    fileOutputStream.close();
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return m67578a;
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
