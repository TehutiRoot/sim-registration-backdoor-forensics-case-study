package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@AnyThread
/* loaded from: classes4.dex */
public class ConfigStorageClient {

    /* renamed from: c */
    public static final Map f56460c = new HashMap();

    /* renamed from: a */
    public final Context f56461a;

    /* renamed from: b */
    public final String f56462b;

    public ConfigStorageClient(Context context, String str) {
        this.f56461a = context;
        this.f56462b = str;
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigStorageClient.class) {
            f56460c.clear();
        }
    }

    public static synchronized ConfigStorageClient getInstance(Context context, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            try {
                Map map = f56460c;
                if (!map.containsKey(str)) {
                    map.put(str, new ConfigStorageClient(context, str));
                }
                configStorageClient = (ConfigStorageClient) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configStorageClient;
    }

    /* renamed from: a */
    public String m37654a() {
        return this.f56462b;
    }

    public synchronized Void clear() {
        this.f56461a.deleteFile(this.f56462b);
        return null;
    }

    @Nullable
    public synchronized ConfigContainer read() throws IOException {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f56461a.openFileInput(this.f56462b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                ConfigContainer m37750b = ConfigContainer.m37750b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return m37750b;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th2;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th2 = th4;
        }
    }

    public synchronized Void write(ConfigContainer configContainer) throws IOException {
        FileOutputStream openFileOutput = this.f56461a.openFileOutput(this.f56462b, 0);
        openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}