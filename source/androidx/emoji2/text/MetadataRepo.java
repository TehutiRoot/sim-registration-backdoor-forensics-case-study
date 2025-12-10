package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.p005os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi(19)
/* loaded from: classes2.dex */
public final class MetadataRepo {

    /* renamed from: a */
    public final MetadataList f35174a;

    /* renamed from: b */
    public final char[] f35175b;

    /* renamed from: c */
    public final C4526a f35176c = new C4526a(1024);

    /* renamed from: d */
    public final Typeface f35177d;

    /* renamed from: androidx.emoji2.text.MetadataRepo$a */
    /* loaded from: classes2.dex */
    public static class C4526a {

        /* renamed from: a */
        public final SparseArray f35178a;

        /* renamed from: b */
        public TypefaceEmojiRasterizer f35179b;

        public C4526a() {
            this(1);
        }

        /* renamed from: a */
        public C4526a m54754a(int i) {
            SparseArray sparseArray = this.f35178a;
            if (sparseArray == null) {
                return null;
            }
            return (C4526a) sparseArray.get(i);
        }

        /* renamed from: b */
        public final TypefaceEmojiRasterizer m54753b() {
            return this.f35179b;
        }

        /* renamed from: c */
        public void m54752c(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            C4526a m54754a = m54754a(typefaceEmojiRasterizer.getCodepointAt(i));
            if (m54754a == null) {
                m54754a = new C4526a();
                this.f35178a.put(typefaceEmojiRasterizer.getCodepointAt(i), m54754a);
            }
            if (i2 > i) {
                m54754a.m54752c(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                m54754a.f35179b = typefaceEmojiRasterizer;
            }
        }

        public C4526a(int i) {
            this.f35178a = new SparseArray(i);
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.f35177d = typeface;
        this.f35174a = metadataList;
        this.f35175b = new char[metadataList.listLength() * 2];
        m54759a(metadataList);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static MetadataRepo create(@NonNull Typeface typeface) {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, new MetadataList());
        } finally {
            TraceCompat.endSection();
        }
    }

    /* renamed from: a */
    public final void m54759a(MetadataList metadataList) {
        int listLength = metadataList.listLength();
        for (int i = 0; i < listLength; i++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.f35175b, i * 2);
            m54755e(typefaceEmojiRasterizer);
        }
    }

    /* renamed from: b */
    public int m54758b() {
        return this.f35174a.version();
    }

    /* renamed from: c */
    public C4526a m54757c() {
        return this.f35176c;
    }

    /* renamed from: d */
    public Typeface m54756d() {
        return this.f35177d;
    }

    /* renamed from: e */
    public void m54755e(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        boolean z;
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        if (typefaceEmojiRasterizer.getCodepointsLength() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "invalid metadata codepoint length");
        this.f35176c.m54752c(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
        return this.f35175b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MetadataList getMetadataList() {
        return this.f35174a;
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, AbstractC22691vs0.m979c(inputStream));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, AbstractC22691vs0.m978d(byteBuffer));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(Typeface.createFromAsset(assetManager, str), AbstractC22691vs0.m980b(assetManager, str));
        } finally {
            TraceCompat.endSection();
        }
    }
}
