package com.google.android.gms.internal.firebase_ml;

import com.google.api.client.util.escape.PercentEscaper;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class zzjw {

    /* renamed from: a */
    public static final zzjz f45945a = new zzjy(PercentEscaper.SAFECHARS_URLENCODER, true);

    /* renamed from: b */
    public static final zzjz f45946b = new zzjy("-_.!~*'()@:$&,;=", false);

    /* renamed from: c */
    public static final zzjz f45947c = new zzjy("-_.!~*'()@:$&,;=+/?", false);

    /* renamed from: d */
    public static final zzjz f45948d = new zzjy(PercentEscaper.SAFEUSERINFOCHARS_URLENCODER, false);

    /* renamed from: e */
    public static final zzjz f45949e = new zzjy(PercentEscaper.SAFEQUERYSTRINGCHARS_URLENCODER, false);

    public static String zzaq(String str) {
        return f45945a.zzaw(str);
    }

    public static String zzar(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String zzas(String str) {
        return f45946b.zzaw(str);
    }

    public static String zzat(String str) {
        return f45947c.zzaw(str);
    }

    public static String zzau(String str) {
        return f45948d.zzaw(str);
    }

    public static String zzav(String str) {
        return f45949e.zzaw(str);
    }
}