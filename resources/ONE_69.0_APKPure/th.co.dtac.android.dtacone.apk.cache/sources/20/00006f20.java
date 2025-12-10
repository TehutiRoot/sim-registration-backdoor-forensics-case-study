package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.apache.commons.cli.HelpFormatter;

@AnyThread
@RequiresApi(19)
/* loaded from: classes2.dex */
public class TypefaceEmojiRasterizer {

    /* renamed from: d */
    public static final ThreadLocal f35272d = new ThreadLocal();

    /* renamed from: a */
    public final int f35273a;

    /* renamed from: b */
    public final MetadataRepo f35274b;

    /* renamed from: c */
    public volatile int f35275c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i) {
        this.f35274b = metadataRepo;
        this.f35273a = i;
    }

    /* renamed from: a */
    public final MetadataItem m54692a() {
        ThreadLocal threadLocal = f35272d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.f35274b.getMetadataList().list(metadataItem, this.f35273a);
        return metadataItem;
    }

    public void draw(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface m54706d = this.f35274b.m54706d();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m54706d);
        canvas.drawText(this.f35274b.getEmojiCharArray(), this.f35273a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int getCodepointAt(int i) {
        return m54692a().codepoints(i);
    }

    public int getCodepointsLength() {
        return m54692a().codepointsLength();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getCompatAdded() {
        return m54692a().compatAdded();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getHasGlyph() {
        return this.f35275c & 3;
    }

    public int getHeight() {
        return m54692a().height();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getId() {
        return m54692a().m54595id();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getSdkAdded() {
        return m54692a().sdkAdded();
    }

    @NonNull
    public Typeface getTypeface() {
        return this.f35274b.m54706d();
    }

    public int getWidth() {
        return m54692a().width();
    }

    public boolean isDefaultEmoji() {
        return m54692a().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        if ((this.f35275c & 4) > 0) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.f35275c = 4;
        } else {
            this.f35275c = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setExclusion(boolean z) {
        int hasGlyph = getHasGlyph();
        if (z) {
            this.f35275c = hasGlyph | 4;
        } else {
            this.f35275c = hasGlyph;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasGlyph(boolean z) {
        int i;
        int i2 = this.f35275c & 4;
        if (z) {
            i = i2 | 2;
        } else {
            i = i2 | 1;
        }
        this.f35275c = i;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i = 0; i < codepointsLength; i++) {
            sb.append(Integer.toHexString(getCodepointAt(i)));
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        return sb.toString();
    }
}