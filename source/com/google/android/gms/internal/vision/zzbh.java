package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzbh {
    /* renamed from: a */
    public static zzbe m46560a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, 3);
                    if (split.length != 3) {
                        if (readLine.length() != 0) {
                            "Invalid: ".concat(readLine);
                        }
                    } else {
                        String str = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new HashMap());
                        }
                        ((Map) hashMap.get(str)).put(decode, decode2);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    zzbe zzbeVar = new zzbe(hashMap);
                    bufferedReader.close();
                    return zzbeVar;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static zzcy m46559b(Context context) {
        zzcy zzc;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    zzc = zzcy.zza(file);
                } else {
                    zzc = zzcy.zzc();
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return zzc;
            } catch (RuntimeException unused) {
                zzcy zzc2 = zzcy.zzc();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return zzc2;
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    public static zzcy<zzbe> zza(Context context) {
        boolean isDeviceProtectedStorage;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return zzcy.zzc();
        }
        if (zzas.zza()) {
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            if (!isDeviceProtectedStorage) {
                context = context.createDeviceProtectedStorageContext();
            }
        }
        zzcy m46559b = m46559b(context);
        if (m46559b.zza()) {
            return zzcy.zza(m46560a((File) m46559b.zzb()));
        }
        return zzcy.zzc();
    }
}
