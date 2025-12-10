package com.zxy.tiny.core;

import android.os.Environment;
import android.text.TextUtils;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.common.Logger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public final class FileKit {

    /* renamed from: a */
    public static final Random f60984a = new Random();

    /* renamed from: b */
    public static final ThreadLocal f60985b = new C10012a();

    /* renamed from: com.zxy.tiny.core.FileKit$a */
    /* loaded from: classes5.dex */
    public class C10012a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        }
    }

    public static boolean clearDirectory(File file) {
        File[] listFiles;
        String str;
        if (file == null || !file.isDirectory() || !file.exists()) {
            return false;
        }
        for (File file2 : file.listFiles()) {
            if (file2 != null) {
                if (file2.isFile() && file2.exists()) {
                    boolean delete = file2.delete();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file2.getName());
                    if (delete) {
                        str = " delete success!";
                    } else {
                        str = " delete failed!";
                    }
                    sb.append(str);
                    Logger.m31980e(sb.toString());
                } else if (file2.isDirectory() && file2.exists()) {
                    clearDirectory(file2);
                }
            }
        }
        return true;
    }

    public static File generateCompressOutfileFormatJPEG() {
        String format = getDateFormat().format(new Date(System.currentTimeMillis()));
        int nextInt = f60984a.nextInt(1000);
        File defaultFileCompressDirectory = getDefaultFileCompressDirectory();
        return new File(defaultFileCompressDirectory, "tiny-" + nextInt + HelpFormatter.DEFAULT_OPT_PREFIX + format + BitmapUtil.IMAGE_JPG_EXTENSION);
    }

    public static File generateCompressOutfileFormatPNG() {
        String format = getDateFormat().format(new Date(System.currentTimeMillis()));
        int nextInt = f60984a.nextInt(1000);
        File defaultFileCompressDirectory = getDefaultFileCompressDirectory();
        return new File(defaultFileCompressDirectory, "tiny-" + nextInt + HelpFormatter.DEFAULT_OPT_PREFIX + format + ".png");
    }

    public static DateFormat getDateFormat() {
        return (DateFormat) f60985b.get();
    }

    public static File getDefaultFileCompressDirectory() {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            file = Tiny.getInstance().getApplication().getExternalFilesDir(null);
        }
        if (file == null) {
            file = Tiny.getInstance().getApplication().getFilesDir();
        }
        File file2 = new File(file.getParentFile(), "tiny");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static long getSizeInBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return getSizeInBytes(new File(str));
    }

    public static File[] wrap(String[] strArr) {
        File file;
        if (strArr != null && strArr.length != 0) {
            File[] fileArr = new File[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (TextUtils.isEmpty(str)) {
                    file = new File("");
                } else {
                    file = new File(str);
                }
                fileArr[i] = file;
            }
            return fileArr;
        }
        return null;
    }

    public static long getSizeInBytes(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return file.length();
        }
        return 0L;
    }

    public static File generateCompressOutfileFormatJPEG(String str) {
        File defaultFileCompressDirectory;
        if (TextUtils.isEmpty(str)) {
            return generateCompressOutfileFormatJPEG();
        }
        String format = getDateFormat().format(new Date(System.currentTimeMillis()));
        int nextInt = f60984a.nextInt(1000);
        try {
            defaultFileCompressDirectory = new File(str);
            if (defaultFileCompressDirectory.exists() && defaultFileCompressDirectory.isFile()) {
                defaultFileCompressDirectory = getDefaultFileCompressDirectory();
            } else {
                defaultFileCompressDirectory.mkdirs();
            }
        } catch (Exception unused) {
            defaultFileCompressDirectory = getDefaultFileCompressDirectory();
        }
        return new File(defaultFileCompressDirectory, "tiny-" + nextInt + HelpFormatter.DEFAULT_OPT_PREFIX + format + BitmapUtil.IMAGE_JPG_EXTENSION);
    }

    public static File generateCompressOutfileFormatPNG(String str) {
        File defaultFileCompressDirectory;
        if (TextUtils.isEmpty(str)) {
            return generateCompressOutfileFormatPNG();
        }
        String format = getDateFormat().format(new Date(System.currentTimeMillis()));
        int nextInt = f60984a.nextInt(1000);
        try {
            defaultFileCompressDirectory = new File(str);
            if (defaultFileCompressDirectory.exists() && defaultFileCompressDirectory.isFile()) {
                defaultFileCompressDirectory = getDefaultFileCompressDirectory();
            } else {
                defaultFileCompressDirectory.mkdirs();
            }
        } catch (Exception unused) {
            defaultFileCompressDirectory = getDefaultFileCompressDirectory();
        }
        return new File(defaultFileCompressDirectory, "tiny-" + nextInt + HelpFormatter.DEFAULT_OPT_PREFIX + format + ".png");
    }

    public static long getSizeInBytes(InputStream inputStream) {
        if (inputStream == null) {
            return 0L;
        }
        try {
            return inputStream.available();
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }
}