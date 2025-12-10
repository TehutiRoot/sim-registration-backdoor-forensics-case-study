package th.p047co.dtac.android.dtacone.extension;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.CloseableKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.BitMapExtenKt;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import timber.log.Timber;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010'\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*\u001a7\u0010-\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00103\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0004\b4\u0010\u0011\u001a\u001e\u00108\u001a\u000207*\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u000205H\u0086\u0004¢\u0006\u0004\b8\u00109\u001a\u0011\u0010:\u001a\u00020\u0000*\u00020\b¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010<\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010>\u001a\u0004\u0018\u00010\u0000*\u00020\u0003¢\u0006\u0004\b>\u0010?\u001a!\u0010D\u001a\u00020C*\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u000b¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010F\u001a\u00020C*\u00020\u00002\u0006\u0010A\u001a\u00020@H\u0086\u0004¢\u0006\u0004\bF\u0010G\u001aA\u0010M\u001a\u00020\b*\u00020\u00002\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020\u00012\b\b\u0002\u0010K\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010L\u001a\u00020\u0001¢\u0006\u0004\bM\u0010N\"\u0014\u0010O\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m28850d2 = {"Landroid/graphics/Bitmap;", "", "quality", "", "toBase64", "(Landroid/graphics/Bitmap;I)Ljava/lang/String;", "toBase64PNG", "toBase64JPEG", "", "toByteArray", "(Landroid/graphics/Bitmap;I)[B", "", "width", "height", "resize", "(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;", "cropImage", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "scale", "fromLeftPercent", "fromTopPercent", "cropSquare", "(Landroid/graphics/Bitmap;FFF)Landroid/graphics/Bitmap;", "ratioWidth", "ratioHeight", "cropAspectRatio", "(Landroid/graphics/Bitmap;IIFFF)Landroid/graphics/Bitmap;", "pxWidth", "pxHeight", "Lth/co/dtac/android/dtacone/extension/Four;", "newScale", "transCoordinate", "(IIFFLth/co/dtac/android/dtacone/extension/Four;)Lth/co/dtac/android/dtacone/extension/Four;", "bitmap", "Lth/co/dtac/android/dtacone/extension/ScaleAttr;", "attr", "Lio/reactivex/Observable;", "scaleDownBitmap", "(Landroid/graphics/Bitmap;Lth/co/dtac/android/dtacone/extension/ScaleAttr;)Lio/reactivex/Observable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/graphics/Bitmap;)I", "d", "(Landroid/graphics/Bitmap;Lth/co/dtac/android/dtacone/extension/ScaleAttr;)Lth/co/dtac/android/dtacone/extension/Four;", "rationHeight", "scaleDown", "calcImageCrop", "(IIIIF)Lth/co/dtac/android/dtacone/extension/Four;", "", "maxSize", "downSize", "(Landroid/graphics/Bitmap;D)Landroid/graphics/Bitmap;", "orientation", "rotate", "Landroid/widget/ImageView;", "previewPhoto", "", "displayTo", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "toBitMap", "([B)Landroid/graphics/Bitmap;", "convertSignatureToBase64", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "base64toBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "resources", "cornerRadius", "Landroid/graphics/drawable/Drawable;", "roundedBitmapDrawable", "(Landroid/graphics/Bitmap;Landroid/content/res/Resources;F)Landroid/graphics/drawable/Drawable;", "circularBitmapDrawable", "(Landroid/graphics/Bitmap;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "maxWidth", "maxHeight", "maxSizeBytes", "reduceSize", "(Landroid/graphics/Bitmap;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;IIII)[B", "MAX_JPEG_BYTE_SIZE", "I", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.extension.BitMapExtenKt */
/* loaded from: classes7.dex */
public final class BitMapExtenKt {
    public static final int MAX_JPEG_BYTE_SIZE = 300000;

    /* renamed from: a */
    public static /* synthetic */ void m19512a(Bitmap bitmap, ScaleAttr scaleAttr, ObservableEmitter observableEmitter) {
        m19510c(bitmap, scaleAttr, observableEmitter);
    }

    /* renamed from: b */
    public static final int m19511b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray().length;
    }

    @Nullable
    public static final Bitmap base64toBitmap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] decode = Base64.decode((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: c */
    public static final void m19510c(Bitmap bitmap, ScaleAttr attr, ObservableEmitter it) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(attr, "$attr");
        Intrinsics.checkNotNullParameter(it, "it");
        Four m19509d = m19509d(bitmap, attr);
        int component1 = m19509d.component1();
        int component2 = m19509d.component2();
        int component3 = m19509d.component3();
        int component4 = m19509d.component4();
        Timber.m1406d("Crop x: " + component1 + " y: " + component2 + "  w:" + component3 + "  h:" + component4, new Object[0]);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, component1, component2, component3, component4);
            if (m19511b(createBitmap) > 300000) {
                it.onError(new ExceedImageSize("Image size exceed server limit"));
            } else {
                it.onNext(createBitmap);
            }
        } catch (Exception unused) {
            attr.setScale(0.8f);
            Four m19509d2 = m19509d(bitmap, attr);
            it.onNext(Bitmap.createBitmap(bitmap, m19509d2.component1(), m19509d2.component2(), m19509d2.component3(), m19509d2.component4()));
        }
    }

    @NotNull
    public static final Four calcImageCrop(int i, int i2, int i3, int i4, float f) {
        int i5;
        int i6;
        if (i < i2) {
            i5 = (int) (i * f);
            i6 = (i5 / i3) * i4;
        } else {
            int i7 = (int) (i2 * f);
            i5 = i3 * (i7 / i4);
            i6 = i7;
        }
        if (i5 < i) {
            i = i5;
        }
        if (i6 < i2) {
            i2 = i6;
        }
        return new Four(0, 0, i, i2);
    }

    public static /* synthetic */ Four calcImageCrop$default(int i, int i2, int i3, int i4, float f, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            f = 1.0f;
        }
        return calcImageCrop(i, i2, i3, i4, f);
    }

    @NotNull
    public static final Drawable circularBitmapDrawable(@NotNull Bitmap bitmap, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(resources, bitmap);
        Intrinsics.checkNotNullExpressionValue(create, "create(resources, this)");
        create.setCircular(true);
        return create;
    }

    @NotNull
    public static final String convertSignatureToBase64(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return toBase64PNG$default(resize(bitmap, 397.0f, 101.0f), 0, 1, null);
    }

    @NotNull
    public static final Bitmap cropAspectRatio(@NotNull Bitmap bitmap, int i, int i2, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Timber.m1406d("Crop  originWidth: " + width + " originHeight: " + height + " ratio " + i + " x " + i2, new Object[0]);
        Four calcImageCrop = calcImageCrop(bitmap.getWidth(), bitmap.getHeight(), i, i2, f);
        StringBuilder sb = new StringBuilder();
        sb.append("Crop ");
        sb.append(calcImageCrop);
        Timber.m1406d(sb.toString(), new Object[0]);
        Four transCoordinate = transCoordinate(bitmap.getWidth(), bitmap.getHeight(), f2, f3, calcImageCrop);
        int component1 = transCoordinate.component1();
        int component2 = transCoordinate.component2();
        int component3 = transCoordinate.component3();
        int component4 = transCoordinate.component4();
        Timber.m1406d("Crop x: " + component1 + " y: " + component2 + "  w:" + component3 + "  h:" + component4, new Object[0]);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, component1, component2, component3, component4);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, x, y, w, h)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap cropAspectRatio$default(Bitmap bitmap, int i, int i2, float f, float f2, float f3, int i3, Object obj) {
        float f4;
        float f5;
        float f6;
        if ((i3 & 4) != 0) {
            f4 = 0.8f;
        } else {
            f4 = f;
        }
        if ((i3 & 8) != 0) {
            f5 = 0.0f;
        } else {
            f5 = f2;
        }
        if ((i3 & 16) != 0) {
            f6 = 0.2f;
        } else {
            f6 = f3;
        }
        return cropAspectRatio(bitmap, i, i2, f4, f5, f6);
    }

    @NotNull
    public static final Bitmap cropImage(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > i) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, height / (width / i), false);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this,…t,\n                false)");
            return createScaledBitmap;
        }
        return bitmap;
    }

    @NotNull
    public static final Bitmap cropSquare(@NotNull Bitmap bitmap, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Timber.m1406d("Crop  originWidth: " + width + " originHeight: " + height, new Object[0]);
        Four transCoordinate = transCoordinate(bitmap.getWidth(), bitmap.getHeight(), f2, f3, calcImageCrop(bitmap.getWidth(), bitmap.getHeight(), 1, 1, f));
        int component1 = transCoordinate.component1();
        int component2 = transCoordinate.component2();
        int component3 = transCoordinate.component3();
        int component4 = transCoordinate.component4();
        Timber.m1406d("Crop x: " + component1 + " y: " + component2 + "  w:" + component3 + "  h:" + component4, new Object[0]);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, component1, component2, component3, component4);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, x, y, w, h)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap cropSquare$default(Bitmap bitmap, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.7f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.2f;
        }
        return cropSquare(bitmap, f, f2, f3);
    }

    /* renamed from: d */
    public static final Four m19509d(Bitmap bitmap, ScaleAttr scaleAttr) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int ratioWidth = scaleAttr.getRatioWidth();
        int ratioHeight = scaleAttr.getRatioHeight();
        Timber.m1406d("Crop  originWidth: " + width + " originHeight: " + height + " ratio " + ratioWidth + " x " + ratioHeight, new Object[0]);
        Four calcImageCrop = calcImageCrop(bitmap.getWidth(), bitmap.getHeight(), scaleAttr.getRatioWidth(), scaleAttr.getRatioHeight(), scaleAttr.getScale());
        StringBuilder sb = new StringBuilder();
        sb.append("Crop ");
        sb.append(calcImageCrop);
        Timber.m1406d(sb.toString(), new Object[0]);
        return transCoordinate(bitmap.getWidth(), bitmap.getHeight(), scaleAttr.getFromLeftPercent(), scaleAttr.getFromTopPercent(), calcImageCrop);
    }

    public static final void displayTo(@Nullable Bitmap bitmap, @NotNull ImageView previewPhoto) {
        Intrinsics.checkNotNullParameter(previewPhoto, "previewPhoto");
        previewPhoto.setImageBitmap(bitmap);
        previewPhoto.setVisibility(0);
    }

    @NotNull
    public static final Bitmap downSize(@NotNull Bitmap bitmap, double d) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        double sqrt = Math.sqrt(d / bitmap.getByteCount());
        if (sqrt < 1.0d) {
            return resize(bitmap, (float) (bitmap.getWidth() * sqrt), (float) (bitmap.getHeight() * sqrt));
        }
        return bitmap;
    }

    @NotNull
    public static final byte[] reduceSize(@NotNull Bitmap bitmap, @NotNull BitmapUtil bitmapUtil, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        byte[] reduceBitmapSize = bitmapUtil.reduceBitmapSize(bitmap, i, i2, i3, i4);
        Intrinsics.checkNotNullExpressionValue(reduceBitmapSize, "bitmapUtil.reduceBitmapS…t, quality, maxSizeBytes)");
        return reduceBitmapSize;
    }

    public static /* synthetic */ byte[] reduceSize$default(Bitmap bitmap, BitmapUtil bitmapUtil, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i5 & 2) != 0) {
            i6 = 1024;
        } else {
            i6 = i;
        }
        if ((i5 & 4) != 0) {
            i7 = 1024;
        } else {
            i7 = i2;
        }
        if ((i5 & 8) != 0) {
            i8 = 80;
        } else {
            i8 = i3;
        }
        if ((i5 & 16) != 0) {
            i9 = DurationKt.NANOS_IN_MILLIS;
        } else {
            i9 = i4;
        }
        return reduceSize(bitmap, bitmapUtil, i6, i7, i8, i9);
    }

    @NotNull
    public static final Bitmap resize(@NotNull Bitmap bitmap, float f, float f2) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        float min = Math.min(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * min), Math.round(bitmap.getHeight() * min), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, nWidth, nHeight, true)");
        return createScaledBitmap;
    }

    @NotNull
    public static final Bitmap rotate(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Matrix matrix = new Matrix();
        if (i != 90) {
            if (i != 180) {
                if (i != 270) {
                    return bitmap;
                }
                matrix.setRotate(90.0f);
            } else {
                matrix.setRotate(180.0f);
            }
        } else {
            matrix.setRotate(-90.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, 0, 0,…th, height, matrix, true)");
        bitmap.recycle();
        return createBitmap;
    }

    @NotNull
    public static final Drawable roundedBitmapDrawable(@NotNull Bitmap bitmap, @NotNull Resources resources, float f) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(resources, bitmap);
        Intrinsics.checkNotNullExpressionValue(create, "create(resources, this)");
        create.setCornerRadius(f);
        return create;
    }

    @NotNull
    public static final Observable<Bitmap> scaleDownBitmap(@NotNull final Bitmap bitmap, @NotNull final ScaleAttr attr) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(attr, "attr");
        Observable<Bitmap> create = Observable.create(new ObservableOnSubscribe() { // from class: mb
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                BitMapExtenKt.m19512a(bitmap, attr, observableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create {\n            val…\n            }\n\n        }");
        return create;
    }

    @NotNull
    public static final String toBase64(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(out.toByteArray(), Base64.NO_WRAP)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return encodeToString;
        } finally {
        }
    }

    public static /* synthetic */ String toBase64$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return toBase64(bitmap, i);
    }

    @NotNull
    public static final String toBase64JPEG(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(out.toByteArray(), Base64.NO_WRAP)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return encodeToString;
        } finally {
        }
    }

    public static /* synthetic */ String toBase64JPEG$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return toBase64JPEG(bitmap, i);
    }

    @NotNull
    public static final String toBase64PNG(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(out.toByteArray(), Base64.NO_WRAP)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return encodeToString;
        } finally {
        }
    }

    public static /* synthetic */ String toBase64PNG$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return toBase64PNG(bitmap, i);
    }

    @NotNull
    public static final Bitmap toBitMap(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArr));
        Intrinsics.checkNotNullExpressionValue(decodeStream, "decodeStream(arrayInputStream)");
        return decodeStream;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "out.toByteArray()");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }

    public static /* synthetic */ byte[] toByteArray$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return toByteArray(bitmap, i);
    }

    @NotNull
    public static final Four transCoordinate(int i, int i2, float f, float f2, @NotNull Four newScale) {
        int w;
        int h;
        int w2;
        int h2;
        Intrinsics.checkNotNullParameter(newScale, "newScale");
        if (f > 0.0f) {
            w = (int) (f * i);
        } else {
            w = (i - newScale.getW()) / 2;
        }
        if (f2 > 0.0f) {
            h = (int) (f2 * i2);
        } else {
            h = (i2 - newScale.getH()) / 2;
        }
        if (newScale.getW() + w > i) {
            w2 = i - w;
        } else {
            w2 = newScale.getW();
        }
        if (newScale.getH() + h > i2) {
            h2 = i2 - h;
        } else {
            h2 = newScale.getH();
        }
        return new Four(w, h, w2, h2);
    }
}
