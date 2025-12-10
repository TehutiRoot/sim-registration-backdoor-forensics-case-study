package com.airbnb.lottie.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public class ImageAssetManager {

    /* renamed from: e */
    public static final Object f41295e = new Object();

    /* renamed from: a */
    public final Context f41296a;

    /* renamed from: b */
    public final String f41297b;

    /* renamed from: c */
    public ImageAssetDelegate f41298c;

    /* renamed from: d */
    public final Map f41299d;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f41297b = str + '/';
        } else {
            this.f41297b = str;
        }
        this.f41299d = map;
        setDelegate(imageAssetDelegate);
        if (!(callback instanceof View)) {
            this.f41296a = null;
        } else {
            this.f41296a = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* renamed from: a */
    public final Bitmap m50797a(String str, Bitmap bitmap) {
        synchronized (f41295e) {
            ((LottieImageAsset) this.f41299d.get(str)).setBitmap(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap bitmapForId(String str) {
        LottieImageAsset lottieImageAsset = (LottieImageAsset) this.f41299d.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = this.f41298c;
        if (imageAssetDelegate != null) {
            Bitmap fetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (fetchBitmap != null) {
                m50797a(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        Context context = this.f41296a;
        if (context == null) {
            return null;
        }
        String fileName = lottieImageAsset.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = SyslogConstants.LOG_LOCAL4;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                return m50797a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                Logger.warning("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f41297b)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f41297b + fileName), null, options);
                    if (decodeStream == null) {
                        Logger.warning("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return m50797a(str, Utils.resizeBitmapIfNeeded(decodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                } catch (IllegalArgumentException e2) {
                    Logger.warning("Unable to decode image `" + str + "`.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            Logger.warning("Unable to open asset.", e3);
            return null;
        }
    }

    @Nullable
    public LottieImageAsset getImageAssetById(String str) {
        return (LottieImageAsset) this.f41299d.get(str);
    }

    public boolean hasSameContext(Context context) {
        if ((context == null && this.f41296a == null) || this.f41296a.equals(context)) {
            return true;
        }
        return false;
    }

    public void setDelegate(@Nullable ImageAssetDelegate imageAssetDelegate) {
        this.f41298c = imageAssetDelegate;
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            LottieImageAsset lottieImageAsset = (LottieImageAsset) this.f41299d.get(str);
            Bitmap bitmap2 = lottieImageAsset.getBitmap();
            lottieImageAsset.setBitmap(null);
            return bitmap2;
        }
        Bitmap bitmap3 = ((LottieImageAsset) this.f41299d.get(str)).getBitmap();
        m50797a(str, bitmap);
        return bitmap3;
    }
}