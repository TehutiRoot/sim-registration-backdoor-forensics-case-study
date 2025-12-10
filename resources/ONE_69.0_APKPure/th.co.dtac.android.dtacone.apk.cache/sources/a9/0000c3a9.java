package com.zxy.tiny.common;

import android.text.TextUtils;
import java.io.File;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public final class Conditions {

    /* renamed from: a */
    public static final String[] f60969a = {BitmapUtil.IMAGE_JPG_EXTENSION, ".jpeg", ".JPG", ".JPEG"};

    public static boolean fileCanRead(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    public static boolean fileIsExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return true;
    }

    public static boolean isDirectory(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        return false;
    }

    public static boolean isJpegFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f60969a;
            if (i >= strArr.length) {
                return false;
            }
            if (str.endsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static boolean fileCanRead(File file) {
        return file != null && file.exists() && file.canRead();
    }
}